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
package com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.standardmodels.controller.query;

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
 * Implements Spring Controller query CQRS processing for entity DynamicsFunctionBlock.
 *
 * @author your_name_here
 */
@CrossOrigin
@RestController
@RequestMapping("/DynamicsFunctionBlock")
public class DynamicsFunctionBlockQueryRestController extends BaseSpringRestController {

  /**
   * Handles loading a DynamicsFunctionBlock using a UUID
   *
   * @param UUID dynamicsFunctionBlockId
   * @return DynamicsFunctionBlock
   */
  @GetMapping("/load")
  public DynamicsFunctionBlock load(@RequestParam(required = true) UUID dynamicsFunctionBlockId) {
    DynamicsFunctionBlock entity = null;

    try {
      entity =
          DynamicsFunctionBlockBusinessDelegate.getDynamicsFunctionBlockInstance()
              .getDynamicsFunctionBlock(
                  new DynamicsFunctionBlockFetchOneSummary(dynamicsFunctionBlockId));
    } catch (Throwable exc) {
      LOGGER.log(
          Level.WARNING,
          "failed to load DynamicsFunctionBlock using Id " + dynamicsFunctionBlockId);
      return null;
    }

    return entity;
  }

  /**
   * Handles loading all DynamicsFunctionBlock business objects
   *
   * @return Set<DynamicsFunctionBlock>
   */
  @GetMapping("/")
  public List<DynamicsFunctionBlock> loadAll() {
    List<DynamicsFunctionBlock> dynamicsFunctionBlockList = null;

    try {
      // load the DynamicsFunctionBlock
      dynamicsFunctionBlockList =
          DynamicsFunctionBlockBusinessDelegate.getDynamicsFunctionBlockInstance()
              .getAllDynamicsFunctionBlock();

      if (dynamicsFunctionBlockList != null)
        LOGGER.log(Level.INFO, "successfully loaded all DynamicsFunctionBlocks");
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load all DynamicsFunctionBlocks ", exc);
      return null;
    }

    return dynamicsFunctionBlockList;
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  protected DynamicsFunctionBlock dynamicsFunctionBlock = null;
  private static final Logger LOGGER =
      Logger.getLogger(DynamicsFunctionBlockQueryRestController.class.getName());
}
