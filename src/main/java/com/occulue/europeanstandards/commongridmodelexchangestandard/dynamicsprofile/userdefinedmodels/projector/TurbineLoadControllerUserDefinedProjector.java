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
 * Projector for TurbineLoadControllerUserDefined as outlined for the CQRS pattern. All event
 * handling and query handling related to TurbineLoadControllerUserDefined are invoked here and
 * dispersed as an event to be handled elsewhere.
 *
 * <p>Commands are handled by TurbineLoadControllerUserDefinedAggregate
 *
 * @author your_name_here
 */
// @ProcessingGroup("turbineLoadControllerUserDefined")
@Component("turbineLoadControllerUserDefined-projector")
public class TurbineLoadControllerUserDefinedProjector
    extends TurbineLoadControllerUserDefinedEntityProjector {

  // core constructor
  public TurbineLoadControllerUserDefinedProjector(
      TurbineLoadControllerUserDefinedRepository repository,
      QueryUpdateEmitter queryUpdateEmitter) {
    super(repository);
    this.queryUpdateEmitter = queryUpdateEmitter;
  }

  /*
   * @param	event CreateTurbineLoadControllerUserDefinedEvent
   */
  @EventHandler(payloadType = CreateTurbineLoadControllerUserDefinedEvent.class)
  public void handle(CreateTurbineLoadControllerUserDefinedEvent event) {
    LOGGER.info("handling CreateTurbineLoadControllerUserDefinedEvent - " + event);
    TurbineLoadControllerUserDefined entity = new TurbineLoadControllerUserDefined();
    entity.setTurbineLoadControllerUserDefinedId(event.getTurbineLoadControllerUserDefinedId());

    // ------------------------------------------
    // persist a new one
    // ------------------------------------------
    create(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllTurbineLoadControllerUserDefined(entity);
  }

  /*
   * @param	event UpdateTurbineLoadControllerUserDefinedEvent
   */
  @EventHandler(payloadType = UpdateTurbineLoadControllerUserDefinedEvent.class)
  public void handle(UpdateTurbineLoadControllerUserDefinedEvent event) {
    LOGGER.info("handling UpdateTurbineLoadControllerUserDefinedEvent - " + event);

    TurbineLoadControllerUserDefined entity = new TurbineLoadControllerUserDefined();
    entity.setTurbineLoadControllerUserDefinedId(event.getTurbineLoadControllerUserDefinedId());
    entity.setProprietary(event.getProprietary());

    // ------------------------------------------
    // save with an existing instance
    // ------------------------------------------
    update(entity);

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindTurbineLoadControllerUserDefined(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllTurbineLoadControllerUserDefined(entity);
  }

  /*
   * @param	event DeleteTurbineLoadControllerUserDefinedEvent
   */
  @EventHandler(payloadType = DeleteTurbineLoadControllerUserDefinedEvent.class)
  public void handle(DeleteTurbineLoadControllerUserDefinedEvent event) {
    LOGGER.info("handling DeleteTurbineLoadControllerUserDefinedEvent - " + event);

    // ------------------------------------------
    // delete delegation
    // ------------------------------------------
    TurbineLoadControllerUserDefined entity = delete(event.getTurbineLoadControllerUserDefinedId());

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllTurbineLoadControllerUserDefined(entity);
  }

  /*
   * @param	event AssignProprietaryToTurbineLoadControllerUserDefinedEvent
   */
  @EventHandler(payloadType = AssignProprietaryToTurbineLoadControllerUserDefinedEvent.class)
  public void handle(AssignProprietaryToTurbineLoadControllerUserDefinedEvent event) {
    LOGGER.info("handling AssignProprietaryToTurbineLoadControllerUserDefinedEvent - " + event);

    // ------------------------------------------
    // delegate to assignTo
    // ------------------------------------------
    TurbineLoadControllerUserDefined entity =
        assignProprietary(event.getTurbineLoadControllerUserDefinedId(), event.getAssignment());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindTurbineLoadControllerUserDefined(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllTurbineLoadControllerUserDefined(entity);
  }

  /*
   * @param	event UnAssignProprietaryFromTurbineLoadControllerUserDefinedEvent
   */
  @EventHandler(payloadType = UnAssignProprietaryFromTurbineLoadControllerUserDefinedEvent.class)
  public void handle(UnAssignProprietaryFromTurbineLoadControllerUserDefinedEvent event) {
    LOGGER.info("handling UnAssignProprietaryFromTurbineLoadControllerUserDefinedEvent - " + event);

    // ------------------------------------------
    // delegate to unAssignFrom
    // ------------------------------------------
    TurbineLoadControllerUserDefined entity =
        unAssignProprietary(event.getTurbineLoadControllerUserDefinedId());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindTurbineLoadControllerUserDefined(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllTurbineLoadControllerUserDefined(entity);
  }

  /**
   * Method to retrieve the TurbineLoadControllerUserDefined via an
   * TurbineLoadControllerUserDefinedPrimaryKey.
   *
   * @param id Long
   * @return TurbineLoadControllerUserDefined
   * @exception ProcessingException - Thrown if processing any related problems
   * @exception IllegalArgumentException
   */
  @SuppressWarnings("unused")
  @QueryHandler
  public TurbineLoadControllerUserDefined handle(FindTurbineLoadControllerUserDefinedQuery query)
      throws ProcessingException, IllegalArgumentException {
    return find(query.getFilter().getTurbineLoadControllerUserDefinedId());
  }

  /**
   * Method to retrieve a collection of all TurbineLoadControllerUserDefineds
   *
   * @param query FindAllTurbineLoadControllerUserDefinedQuery
   * @return List<TurbineLoadControllerUserDefined>
   * @exception ProcessingException Thrown if any problems
   */
  @SuppressWarnings("unused")
  @QueryHandler
  public List<TurbineLoadControllerUserDefined> handle(
      FindAllTurbineLoadControllerUserDefinedQuery query) throws ProcessingException {
    return findAll(query);
  }

  /**
   * emit to subscription queries of type FindTurbineLoadControllerUserDefined, but only if the id
   * matches
   *
   * @param entity TurbineLoadControllerUserDefined
   */
  protected void emitFindTurbineLoadControllerUserDefined(TurbineLoadControllerUserDefined entity) {
    LOGGER.info("handling emitFindTurbineLoadControllerUserDefined");

    queryUpdateEmitter.emit(
        FindTurbineLoadControllerUserDefinedQuery.class,
        query ->
            query
                .getFilter()
                .getTurbineLoadControllerUserDefinedId()
                .equals(entity.getTurbineLoadControllerUserDefinedId()),
        entity);
  }

  /**
   * unconditionally emit to subscription queries of type FindAllTurbineLoadControllerUserDefined
   *
   * @param entity TurbineLoadControllerUserDefined
   */
  protected void emitFindAllTurbineLoadControllerUserDefined(
      TurbineLoadControllerUserDefined entity) {
    LOGGER.info("handling emitFindAllTurbineLoadControllerUserDefined");

    queryUpdateEmitter.emit(
        FindAllTurbineLoadControllerUserDefinedQuery.class, query -> true, entity);
  }

  // --------------------------------------------------
  // attributes
  // --------------------------------------------------
  @Autowired private final QueryUpdateEmitter queryUpdateEmitter;
  private static final Logger LOGGER =
      Logger.getLogger(TurbineLoadControllerUserDefinedProjector.class.getName());
}
