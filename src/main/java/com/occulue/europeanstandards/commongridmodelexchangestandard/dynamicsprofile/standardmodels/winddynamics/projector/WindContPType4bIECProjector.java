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
package com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.standardmodels.winddynamics.projector;

import com.occulue.api.*;
import com.occulue.entity.*;
import com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.standardmodels.winddynamics.repository.*;
import com.occulue.exception.*;
import java.util.*;
import java.util.logging.Logger;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.axonframework.queryhandling.QueryUpdateEmitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Projector for WindContPType4bIEC as outlined for the CQRS pattern. All event handling and query
 * handling related to WindContPType4bIEC are invoked here and dispersed as an event to be handled
 * elsewhere.
 *
 * <p>Commands are handled by WindContPType4bIECAggregate
 *
 * @author your_name_here
 */
// @ProcessingGroup("windContPType4bIEC")
@Component("windContPType4bIEC-projector")
public class WindContPType4bIECProjector extends WindContPType4bIECEntityProjector {

  // core constructor
  public WindContPType4bIECProjector(
      WindContPType4bIECRepository repository, QueryUpdateEmitter queryUpdateEmitter) {
    super(repository);
    this.queryUpdateEmitter = queryUpdateEmitter;
  }

  /*
   * @param	event CreateWindContPType4bIECEvent
   */
  @EventHandler(payloadType = CreateWindContPType4bIECEvent.class)
  public void handle(CreateWindContPType4bIECEvent event) {
    LOGGER.info("handling CreateWindContPType4bIECEvent - " + event);
    WindContPType4bIEC entity = new WindContPType4bIEC();
    entity.setWindContPType4bIECId(event.getWindContPType4bIECId());

    // ------------------------------------------
    // persist a new one
    // ------------------------------------------
    create(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event UpdateWindContPType4bIECEvent
   */
  @EventHandler(payloadType = UpdateWindContPType4bIECEvent.class)
  public void handle(UpdateWindContPType4bIECEvent event) {
    LOGGER.info("handling UpdateWindContPType4bIECEvent - " + event);

    WindContPType4bIEC entity = new WindContPType4bIEC();
    entity.setWindContPType4bIECId(event.getWindContPType4bIECId());
    entity.setDpmax(event.getDpmax());
    entity.setTpaero(event.getTpaero());
    entity.setTpord(event.getTpord());
    entity.setTufilt(event.getTufilt());

    // ------------------------------------------
    // save with an existing instance
    // ------------------------------------------
    update(entity);

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindContPType4bIEC(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event DeleteWindContPType4bIECEvent
   */
  @EventHandler(payloadType = DeleteWindContPType4bIECEvent.class)
  public void handle(DeleteWindContPType4bIECEvent event) {
    LOGGER.info("handling DeleteWindContPType4bIECEvent - " + event);

    // ------------------------------------------
    // delete delegation
    // ------------------------------------------
    WindContPType4bIEC entity = delete(event.getWindContPType4bIECId());

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event AssignDpmaxToWindContPType4bIECEvent
   */
  @EventHandler(payloadType = AssignDpmaxToWindContPType4bIECEvent.class)
  public void handle(AssignDpmaxToWindContPType4bIECEvent event) {
    LOGGER.info("handling AssignDpmaxToWindContPType4bIECEvent - " + event);

    // ------------------------------------------
    // delegate to assignTo
    // ------------------------------------------
    WindContPType4bIEC entity = assignDpmax(event.getWindContPType4bIECId(), event.getAssignment());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindContPType4bIEC(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event UnAssignDpmaxFromWindContPType4bIECEvent
   */
  @EventHandler(payloadType = UnAssignDpmaxFromWindContPType4bIECEvent.class)
  public void handle(UnAssignDpmaxFromWindContPType4bIECEvent event) {
    LOGGER.info("handling UnAssignDpmaxFromWindContPType4bIECEvent - " + event);

    // ------------------------------------------
    // delegate to unAssignFrom
    // ------------------------------------------
    WindContPType4bIEC entity = unAssignDpmax(event.getWindContPType4bIECId());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindContPType4bIEC(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event AssignTpaeroToWindContPType4bIECEvent
   */
  @EventHandler(payloadType = AssignTpaeroToWindContPType4bIECEvent.class)
  public void handle(AssignTpaeroToWindContPType4bIECEvent event) {
    LOGGER.info("handling AssignTpaeroToWindContPType4bIECEvent - " + event);

    // ------------------------------------------
    // delegate to assignTo
    // ------------------------------------------
    WindContPType4bIEC entity =
        assignTpaero(event.getWindContPType4bIECId(), event.getAssignment());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindContPType4bIEC(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event UnAssignTpaeroFromWindContPType4bIECEvent
   */
  @EventHandler(payloadType = UnAssignTpaeroFromWindContPType4bIECEvent.class)
  public void handle(UnAssignTpaeroFromWindContPType4bIECEvent event) {
    LOGGER.info("handling UnAssignTpaeroFromWindContPType4bIECEvent - " + event);

    // ------------------------------------------
    // delegate to unAssignFrom
    // ------------------------------------------
    WindContPType4bIEC entity = unAssignTpaero(event.getWindContPType4bIECId());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindContPType4bIEC(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event AssignTpordToWindContPType4bIECEvent
   */
  @EventHandler(payloadType = AssignTpordToWindContPType4bIECEvent.class)
  public void handle(AssignTpordToWindContPType4bIECEvent event) {
    LOGGER.info("handling AssignTpordToWindContPType4bIECEvent - " + event);

    // ------------------------------------------
    // delegate to assignTo
    // ------------------------------------------
    WindContPType4bIEC entity = assignTpord(event.getWindContPType4bIECId(), event.getAssignment());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindContPType4bIEC(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event UnAssignTpordFromWindContPType4bIECEvent
   */
  @EventHandler(payloadType = UnAssignTpordFromWindContPType4bIECEvent.class)
  public void handle(UnAssignTpordFromWindContPType4bIECEvent event) {
    LOGGER.info("handling UnAssignTpordFromWindContPType4bIECEvent - " + event);

    // ------------------------------------------
    // delegate to unAssignFrom
    // ------------------------------------------
    WindContPType4bIEC entity = unAssignTpord(event.getWindContPType4bIECId());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindContPType4bIEC(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event AssignTufiltToWindContPType4bIECEvent
   */
  @EventHandler(payloadType = AssignTufiltToWindContPType4bIECEvent.class)
  public void handle(AssignTufiltToWindContPType4bIECEvent event) {
    LOGGER.info("handling AssignTufiltToWindContPType4bIECEvent - " + event);

    // ------------------------------------------
    // delegate to assignTo
    // ------------------------------------------
    WindContPType4bIEC entity =
        assignTufilt(event.getWindContPType4bIECId(), event.getAssignment());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindContPType4bIEC(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /*
   * @param	event UnAssignTufiltFromWindContPType4bIECEvent
   */
  @EventHandler(payloadType = UnAssignTufiltFromWindContPType4bIECEvent.class)
  public void handle(UnAssignTufiltFromWindContPType4bIECEvent event) {
    LOGGER.info("handling UnAssignTufiltFromWindContPType4bIECEvent - " + event);

    // ------------------------------------------
    // delegate to unAssignFrom
    // ------------------------------------------
    WindContPType4bIEC entity = unAssignTufilt(event.getWindContPType4bIECId());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindWindContPType4bIEC(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllWindContPType4bIEC(entity);
  }

  /**
   * Method to retrieve the WindContPType4bIEC via an WindContPType4bIECPrimaryKey.
   *
   * @param id Long
   * @return WindContPType4bIEC
   * @exception ProcessingException - Thrown if processing any related problems
   * @exception IllegalArgumentException
   */
  @SuppressWarnings("unused")
  @QueryHandler
  public WindContPType4bIEC handle(FindWindContPType4bIECQuery query)
      throws ProcessingException, IllegalArgumentException {
    return find(query.getFilter().getWindContPType4bIECId());
  }

  /**
   * Method to retrieve a collection of all WindContPType4bIECs
   *
   * @param query FindAllWindContPType4bIECQuery
   * @return List<WindContPType4bIEC>
   * @exception ProcessingException Thrown if any problems
   */
  @SuppressWarnings("unused")
  @QueryHandler
  public List<WindContPType4bIEC> handle(FindAllWindContPType4bIECQuery query)
      throws ProcessingException {
    return findAll(query);
  }

  /**
   * emit to subscription queries of type FindWindContPType4bIEC, but only if the id matches
   *
   * @param entity WindContPType4bIEC
   */
  protected void emitFindWindContPType4bIEC(WindContPType4bIEC entity) {
    LOGGER.info("handling emitFindWindContPType4bIEC");

    queryUpdateEmitter.emit(
        FindWindContPType4bIECQuery.class,
        query ->
            query.getFilter().getWindContPType4bIECId().equals(entity.getWindContPType4bIECId()),
        entity);
  }

  /**
   * unconditionally emit to subscription queries of type FindAllWindContPType4bIEC
   *
   * @param entity WindContPType4bIEC
   */
  protected void emitFindAllWindContPType4bIEC(WindContPType4bIEC entity) {
    LOGGER.info("handling emitFindAllWindContPType4bIEC");

    queryUpdateEmitter.emit(FindAllWindContPType4bIECQuery.class, query -> true, entity);
  }

  // --------------------------------------------------
  // attributes
  // --------------------------------------------------
  @Autowired private final QueryUpdateEmitter queryUpdateEmitter;
  private static final Logger LOGGER =
      Logger.getLogger(WindContPType4bIECProjector.class.getName());
}
