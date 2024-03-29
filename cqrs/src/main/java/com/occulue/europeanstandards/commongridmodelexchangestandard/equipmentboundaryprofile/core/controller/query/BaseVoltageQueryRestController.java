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
package com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile.core.controller.query;

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
 * Implements Spring Controller query CQRS processing for entity BaseVoltage.
 *
 * @author your_name_here
 */
@CrossOrigin
@RestController
@RequestMapping("/BaseVoltage")
public class BaseVoltageQueryRestController extends BaseSpringRestController {

  /**
   * Handles loading a BaseVoltage using a UUID
   *
   * @param UUID baseVoltageId
   * @return BaseVoltage
   */
  @GetMapping("/load")
  public BaseVoltage load(@RequestParam(required = true) UUID baseVoltageId) {
    BaseVoltage entity = null;

    try {
      entity =
          BaseVoltageBusinessDelegate.getBaseVoltageInstance()
              .getBaseVoltage(new BaseVoltageFetchOneSummary(baseVoltageId));
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load BaseVoltage using Id " + baseVoltageId);
      return null;
    }

    return entity;
  }

  /**
   * Handles loading all BaseVoltage business objects
   *
   * @return Set<BaseVoltage>
   */
  @GetMapping("/")
  public List<BaseVoltage> loadAll() {
    List<BaseVoltage> baseVoltageList = null;

    try {
      // load the BaseVoltage
      baseVoltageList = BaseVoltageBusinessDelegate.getBaseVoltageInstance().getAllBaseVoltage();

      if (baseVoltageList != null) LOGGER.log(Level.INFO, "successfully loaded all BaseVoltages");
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load all BaseVoltages ", exc);
      return null;
    }

    return baseVoltageList;
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  protected BaseVoltage baseVoltage = null;
  private static final Logger LOGGER =
      Logger.getLogger(BaseVoltageQueryRestController.class.getName());
}
