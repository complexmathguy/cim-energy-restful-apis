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
package com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production.controller.query;

import com.occulue.api.*;
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
 * Implements Spring Controller query CQRS processing for entity NuclearGeneratingUnit.
 *
 * @author your_name_here
 */
@CrossOrigin
@RestController
@RequestMapping("/NuclearGeneratingUnit")
public class NuclearGeneratingUnitQueryRestController extends BaseSpringRestController {

  /**
   * Handles loading a NuclearGeneratingUnit using a UUID
   *
   * @param UUID nuclearGeneratingUnitId
   * @return NuclearGeneratingUnit
   */
  @GetMapping("/load")
  public NuclearGeneratingUnit load(@RequestParam(required = true) UUID nuclearGeneratingUnitId) {
    NuclearGeneratingUnit entity = null;

    try {
      entity =
          NuclearGeneratingUnitBusinessDelegate.getNuclearGeneratingUnitInstance()
              .getNuclearGeneratingUnit(
                  new NuclearGeneratingUnitFetchOneSummary(nuclearGeneratingUnitId));
    } catch (Throwable exc) {
      LOGGER.log(
          Level.WARNING,
          "failed to load NuclearGeneratingUnit using Id " + nuclearGeneratingUnitId);
      return null;
    }

    return entity;
  }

  /**
   * Handles loading all NuclearGeneratingUnit business objects
   *
   * @return Set<NuclearGeneratingUnit>
   */
  @GetMapping("/")
  public List<NuclearGeneratingUnit> loadAll() {
    List<NuclearGeneratingUnit> nuclearGeneratingUnitList = null;

    try {
      // load the NuclearGeneratingUnit
      nuclearGeneratingUnitList =
          NuclearGeneratingUnitBusinessDelegate.getNuclearGeneratingUnitInstance()
              .getAllNuclearGeneratingUnit();

      if (nuclearGeneratingUnitList != null)
        LOGGER.log(Level.INFO, "successfully loaded all NuclearGeneratingUnits");
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load all NuclearGeneratingUnits ", exc);
      return null;
    }

    return nuclearGeneratingUnitList;
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  protected NuclearGeneratingUnit nuclearGeneratingUnit = null;
  private static final Logger LOGGER =
      Logger.getLogger(NuclearGeneratingUnitQueryRestController.class.getName());
}
