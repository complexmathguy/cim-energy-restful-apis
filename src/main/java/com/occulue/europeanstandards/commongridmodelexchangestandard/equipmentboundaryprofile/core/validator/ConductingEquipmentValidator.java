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
package com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile.core.validator;

import com.occulue.api.*;
import org.springframework.util.Assert;

public class ConductingEquipmentValidator {

  /** default constructor */
  protected ConductingEquipmentValidator() {}

  /** factory method */
  public static ConductingEquipmentValidator getInstance() {
    return new ConductingEquipmentValidator();
  }

  /** handles creation validation for a ConductingEquipment */
  public void validate(CreateConductingEquipmentCommand conductingEquipment) throws Exception {
    Assert.notNull(conductingEquipment, "CreateConductingEquipmentCommand should not be null");
    //		Assert.isNull( conductingEquipment.getConductingEquipmentId(),
    // "CreateConductingEquipmentCommand identifier should be null" );
  }

  /** handles update validation for a ConductingEquipment */
  public void validate(UpdateConductingEquipmentCommand conductingEquipment) throws Exception {
    Assert.notNull(conductingEquipment, "UpdateConductingEquipmentCommand should not be null");
    Assert.notNull(
        conductingEquipment.getConductingEquipmentId(),
        "UpdateConductingEquipmentCommand identifier should not be null");
  }

  /** handles delete validation for a ConductingEquipment */
  public void validate(DeleteConductingEquipmentCommand conductingEquipment) throws Exception {
    Assert.notNull(conductingEquipment, "{commandAlias} should not be null");
    Assert.notNull(
        conductingEquipment.getConductingEquipmentId(),
        "DeleteConductingEquipmentCommand identifier should not be null");
  }

  /** handles fetchOne validation for a ConductingEquipment */
  public void validate(ConductingEquipmentFetchOneSummary summary) throws Exception {
    Assert.notNull(summary, "ConductingEquipmentFetchOneSummary should not be null");
    Assert.notNull(
        summary.getConductingEquipmentId(),
        "ConductingEquipmentFetchOneSummary identifier should not be null");
  }
}
