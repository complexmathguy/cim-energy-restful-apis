/**
 * ***************************************************************************** Turnstone Biologics
 * Confidential
 *
 * <p>2018 Turnstone Biologics All Rights Reserved.
 *
 * <p>This file is subject to the terms and conditions defined in file 'license.txt', which is part
 * of this source code package.
 *
 * <p>Contributors : Turnstone Biologics - General Release
 * ****************************************************************************
 */
package com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.userdefinedmodels.projector;

import com.occulue.api.*;
import com.occulue.entity.*;
import com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.userdefinedmodels.repository.*;
import com.occulue.exception.*;
import java.util.*;
import java.util.logging.Logger;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.axonframework.queryhandling.QueryUpdateEmitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Projector for WindPlantUserDefined as outlined for the CQRS pattern. All event handling and query
 * handling related to WindPlantUserDefined are invoked here and dispersed as an event to be handled
 * elsewhere.
 *
 * <p>Commands are handled by WindPlantUserDefinedAggregate
 *
 * @author your_name_here
 */
// @ProcessingGroup("windPlantUserDefined")
@Component("windPlantUserDefined-projector")
public class WindPlantUserDefinedProjector extends WindPlantUserDefinedEntityProjector {

  // core constructor
  public WindPlantUserDefinedProjector(
      WindPlantUserDefinedRepository repository, QueryUpdateEmitter queryUpdateEmitter) {
    super(repository);
    this.queryUpdateEmitter = queryUpdateEmitter;
  }

  /*
   * @param	event CreateWindPlantUserDefinedEvent
   */
  @EventHandler(payloadType = CreateWindPlantUserDefinedEvent.class)
  public void handle(CreateWindPlantUserDefinedEvent event) {
    LOGGER.info("handling CreateWindPlantUserDefinedEvent - " + event);
    WindPlantUserDefined entity = new WindPlantUserDefined();
    entity.setWindPlantUserDefinedId(event.getWindPlantUserDefinedId());

    // ------------------------------------------
    // persist a new one
    // ------------------------------------------
    create(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindPlantUserDefined(entity);
  }

  /*
   * @param	event UpdateWindPlantUserDefinedEvent
   */
  @EventHandler(payloadType = UpdateWindPlantUserDefinedEvent.class)
  public void handle(UpdateWindPlantUserDefinedEvent event) {
    LOGGER.info("handling UpdateWindPlantUserDefinedEvent - " + event);

    WindPlantUserDefined entity = new WindPlantUserDefined();
    entity.setWindPlantUserDefinedId(event.getWindPlantUserDefinedId());
    entity.setProprietary(event.getProprietary());

    // ------------------------------------------
    // save with an existing instance
    // ------------------------------------------
    update(entity);

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindPlantUserDefined(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindPlantUserDefined(entity);
  }

  /*
   * @param	event DeleteWindPlantUserDefinedEvent
   */
  @EventHandler(payloadType = DeleteWindPlantUserDefinedEvent.class)
  public void handle(DeleteWindPlantUserDefinedEvent event) {
    LOGGER.info("handling DeleteWindPlantUserDefinedEvent - " + event);

    // ------------------------------------------
    // delete delegation
    // ------------------------------------------
    WindPlantUserDefined entity = delete(event.getWindPlantUserDefinedId());

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindPlantUserDefined(entity);
  }

  /*
   * @param	event AssignProprietaryToWindPlantUserDefinedEvent
   */
  @EventHandler(payloadType = AssignProprietaryToWindPlantUserDefinedEvent.class)
  public void handle(AssignProprietaryToWindPlantUserDefinedEvent event) {
    LOGGER.info("handling AssignProprietaryToWindPlantUserDefinedEvent - " + event);

    // ------------------------------------------
    // delegate to assignTo
    // ------------------------------------------
    WindPlantUserDefined entity =
        assignProprietary(event.getWindPlantUserDefinedId(), event.getAssignment());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindPlantUserDefined(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindPlantUserDefined(entity);
  }

  /*
   * @param	event UnAssignProprietaryFromWindPlantUserDefinedEvent
   */
  @EventHandler(payloadType = UnAssignProprietaryFromWindPlantUserDefinedEvent.class)
  public void handle(UnAssignProprietaryFromWindPlantUserDefinedEvent event) {
    LOGGER.info("handling UnAssignProprietaryFromWindPlantUserDefinedEvent - " + event);

    // ------------------------------------------
    // delegate to unAssignFrom
    // ------------------------------------------
    WindPlantUserDefined entity = unAssignProprietary(event.getWindPlantUserDefinedId());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindPlantUserDefined(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindPlantUserDefined(entity);
  }

  /**
   * Method to retrieve the WindPlantUserDefined via an WindPlantUserDefinedPrimaryKey.
   *
   * @param id Long
   * @return WindPlantUserDefined
   * @exception ProcessingException - Thrown if processing any related problems
   * @exception IllegalArgumentException
   */
  @SuppressWarnings("unused")
  @QueryHandler
  public WindPlantUserDefined handle(FindWindPlantUserDefinedQuery query)
      throws ProcessingException, IllegalArgumentException {
    return find(query.getFilter().getWindPlantUserDefinedId());
  }

  /**
   * Method to retrieve a collection of all WindPlantUserDefineds
   *
   * @param query FindAllWindPlantUserDefinedQuery
   * @return List<WindPlantUserDefined>
   * @exception ProcessingException Thrown if any problems
   */
  @SuppressWarnings("unused")
  @QueryHandler
  public List<WindPlantUserDefined> handle(FindAllWindPlantUserDefinedQuery query)
      throws ProcessingException {
    return findAll(query);
  }

  /**
   * emit to subscription queries of type FindWindPlantUserDefined, but only if the id matches
   *
   * @param entity WindPlantUserDefined
   */
  protected void emitFindWindPlantUserDefined(WindPlantUserDefined entity) {
    LOGGER.info("handling emitFindWindPlantUserDefined");

    queryUpdateEmitter.emit(
        FindWindPlantUserDefinedQuery.class,
        query ->
            query
                .getFilter()
                .getWindPlantUserDefinedId()
                .equals(entity.getWindPlantUserDefinedId()),
        entity);
  }

  /**
   * unconditionally emit to subscription queries of type FindAllWindPlantUserDefined
   *
   * @param entity WindPlantUserDefined
   */
  protected void emitFindAllWindPlantUserDefined(WindPlantUserDefined entity) {
    LOGGER.info("handling emitFindAllWindPlantUserDefined");

    queryUpdateEmitter.emit(FindAllWindPlantUserDefinedQuery.class, query -> true, entity);
  }

  // --------------------------------------------------
  // attributes
  // --------------------------------------------------
  @Autowired private final QueryUpdateEmitter queryUpdateEmitter;
  private static final Logger LOGGER =
      Logger.getLogger(WindPlantUserDefinedProjector.class.getName());
}
