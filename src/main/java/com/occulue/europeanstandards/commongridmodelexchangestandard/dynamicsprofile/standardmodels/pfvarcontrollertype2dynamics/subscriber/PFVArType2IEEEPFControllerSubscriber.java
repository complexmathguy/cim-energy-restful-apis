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
package com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.standardmodels.pfvarcontrollertype2dynamics.subscriber;

import com.occulue.api.*;
import com.occulue.entity.*;
import com.occulue.exception.*;
import com.occulue.subscriber.*;
import java.util.*;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.axonframework.queryhandling.SubscriptionQueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.stereotype.Component;

/**
 * Subscriber for PFVArType2IEEEPFController related events. .
 *
 * @author your_name_here
 */
@Component("pFVArType2IEEEPFController-subscriber")
public class PFVArType2IEEEPFControllerSubscriber extends BaseSubscriber {

  public PFVArType2IEEEPFControllerSubscriber() {
    queryGateway = applicationContext.getBean(QueryGateway.class);
  }

  public SubscriptionQueryResult<List<PFVArType2IEEEPFController>, PFVArType2IEEEPFController>
      pFVArType2IEEEPFControllerSubscribe() {
    return queryGateway.subscriptionQuery(
        new FindAllPFVArType2IEEEPFControllerQuery(),
        ResponseTypes.multipleInstancesOf(PFVArType2IEEEPFController.class),
        ResponseTypes.instanceOf(PFVArType2IEEEPFController.class));
  }

  public SubscriptionQueryResult<PFVArType2IEEEPFController, PFVArType2IEEEPFController>
      pFVArType2IEEEPFControllerSubscribe(@DestinationVariable UUID pFVArType2IEEEPFControllerId) {
    return queryGateway.subscriptionQuery(
        new FindPFVArType2IEEEPFControllerQuery(
            new LoadPFVArType2IEEEPFControllerFilter(pFVArType2IEEEPFControllerId)),
        ResponseTypes.instanceOf(PFVArType2IEEEPFController.class),
        ResponseTypes.instanceOf(PFVArType2IEEEPFController.class));
  }

  // -------------------------------------------------
  // attributes
  // -------------------------------------------------
  @Autowired private final QueryGateway queryGateway;
}
