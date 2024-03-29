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
package com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.userdefinedmodels.controller.command;

import com.occulue.api.*;
import com.occulue.command.*;
import com.occulue.controller.*;
import com.occulue.delegate.*;
import com.occulue.entity.*;
import com.occulue.exception.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.*;

/**
 * Implements Spring Controller command CQRS processing for entity TurbineLoadControllerUserDefined.
 *
 * @author your_name_here
 */
@CrossOrigin
@RestController
@RequestMapping("/TurbineLoadControllerUserDefined")
public class TurbineLoadControllerUserDefinedCommandRestController
    extends BaseSpringRestController {

  /**
   * Handles create a TurbineLoadControllerUserDefined. if not key provided, calls create, otherwise
   * calls save
   *
   * @param TurbineLoadControllerUserDefined turbineLoadControllerUserDefined
   * @return CompletableFuture<UUID>
   */
  @PostMapping("/create")
  public CompletableFuture<UUID> create(
      @RequestBody(required = true) CreateTurbineLoadControllerUserDefinedCommand command) {
    CompletableFuture<UUID> completableFuture = null;
    try {

      completableFuture =
          TurbineLoadControllerUserDefinedBusinessDelegate
              .getTurbineLoadControllerUserDefinedInstance()
              .createTurbineLoadControllerUserDefined(command);
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, exc.getMessage(), exc);
    }

    return completableFuture;
  }

  /**
   * Handles updating a TurbineLoadControllerUserDefined. if no key provided, calls create,
   * otherwise calls save
   *
   * @param TurbineLoadControllerUserDefined turbineLoadControllerUserDefined
   * @return CompletableFuture<Void>
   */
  @PutMapping("/update")
  public CompletableFuture<Void> update(
      @RequestBody(required = true) UpdateTurbineLoadControllerUserDefinedCommand command) {
    CompletableFuture<Void> completableFuture = null;
    try {
      // -----------------------------------------------
      // delegate the UpdateTurbineLoadControllerUserDefinedCommand
      // -----------------------------------------------
      completableFuture =
          TurbineLoadControllerUserDefinedBusinessDelegate
              .getTurbineLoadControllerUserDefinedInstance()
              .updateTurbineLoadControllerUserDefined(command);
      ;
    } catch (Throwable exc) {
      LOGGER.log(
          Level.WARNING,
          "TurbineLoadControllerUserDefinedController:update() - successfully update TurbineLoadControllerUserDefined - "
              + exc.getMessage());
    }

    return completableFuture;
  }

  /**
   * Handles deleting a TurbineLoadControllerUserDefined entity
   *
   * @param command ${class.getDeleteCommandAlias()}
   * @return CompletableFuture<Void>
   */
  @DeleteMapping("/delete")
  public CompletableFuture<Void> delete(
      @RequestParam(required = true) UUID turbineLoadControllerUserDefinedId) {
    CompletableFuture<Void> completableFuture = null;
    DeleteTurbineLoadControllerUserDefinedCommand command =
        new DeleteTurbineLoadControllerUserDefinedCommand(turbineLoadControllerUserDefinedId);

    try {
      TurbineLoadControllerUserDefinedBusinessDelegate delegate =
          TurbineLoadControllerUserDefinedBusinessDelegate
              .getTurbineLoadControllerUserDefinedInstance();

      completableFuture = delegate.delete(command);
      LOGGER.log(
          Level.WARNING,
          "Successfully deleted TurbineLoadControllerUserDefined with key "
              + command.getTurbineLoadControllerUserDefinedId());
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, exc.getMessage());
    }

    return completableFuture;
  }

  /**
   * save Proprietary on TurbineLoadControllerUserDefined
   *
   * @param command AssignProprietaryToTurbineLoadControllerUserDefinedCommand
   */
  @PutMapping("/assignProprietary")
  public void assignProprietary(
      @RequestBody AssignProprietaryToTurbineLoadControllerUserDefinedCommand command) {
    try {
      TurbineLoadControllerUserDefinedBusinessDelegate.getTurbineLoadControllerUserDefinedInstance()
          .assignProprietary(command);
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "Failed to assign Proprietary", exc);
    }
  }

  /**
   * unassign Proprietary on TurbineLoadControllerUserDefined
   *
   * @param command UnAssignProprietaryFromTurbineLoadControllerUserDefinedCommand
   */
  @PutMapping("/unAssignProprietary")
  public void unAssignProprietary(
      @RequestBody(required = true)
          UnAssignProprietaryFromTurbineLoadControllerUserDefinedCommand command) {
    try {
      TurbineLoadControllerUserDefinedBusinessDelegate.getTurbineLoadControllerUserDefinedInstance()
          .unAssignProprietary(command);
    } catch (Exception exc) {
      LOGGER.log(Level.WARNING, "Failed to unassign Proprietary", exc);
    }
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  protected TurbineLoadControllerUserDefined turbineLoadControllerUserDefined = null;
  private static final Logger LOGGER =
      Logger.getLogger(TurbineLoadControllerUserDefinedCommandRestController.class.getName());
}
