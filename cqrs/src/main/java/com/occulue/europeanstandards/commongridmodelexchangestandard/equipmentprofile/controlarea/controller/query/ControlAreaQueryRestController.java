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
package com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.controlarea.controller.query;

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
 * Implements Spring Controller query CQRS processing for entity ControlArea.
 *
 * @author your_name_here
 */
@CrossOrigin
@RestController
@RequestMapping("/ControlArea")
public class ControlAreaQueryRestController extends BaseSpringRestController {

  /**
   * Handles loading a ControlArea using a UUID
   *
   * @param UUID controlAreaId
   * @return ControlArea
   */
  @GetMapping("/load")
  public ControlArea load(@RequestParam(required = true) UUID controlAreaId) {
    ControlArea entity = null;

    try {
      entity =
          ControlAreaBusinessDelegate.getControlAreaInstance()
              .getControlArea(new ControlAreaFetchOneSummary(controlAreaId));
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load ControlArea using Id " + controlAreaId);
      return null;
    }

    return entity;
  }

  /**
   * Handles loading all ControlArea business objects
   *
   * @return Set<ControlArea>
   */
  @GetMapping("/")
  public List<ControlArea> loadAll() {
    List<ControlArea> controlAreaList = null;

    try {
      // load the ControlArea
      controlAreaList = ControlAreaBusinessDelegate.getControlAreaInstance().getAllControlArea();

      if (controlAreaList != null) LOGGER.log(Level.INFO, "successfully loaded all ControlAreas");
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load all ControlAreas ", exc);
      return null;
    }

    return controlAreaList;
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  protected ControlArea controlArea = null;
  private static final Logger LOGGER =
      Logger.getLogger(ControlAreaQueryRestController.class.getName());
}
