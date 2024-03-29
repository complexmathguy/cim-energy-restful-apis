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
package com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.standardmodels.turbinegovernordynamics.subscriber;

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
 * Subscriber for GovHydroWEH related events. .
 *
 * @author your_name_here
 */
@Component("govHydroWEH-subscriber")
public class GovHydroWEHSubscriber extends BaseSubscriber {

  public GovHydroWEHSubscriber() {
    queryGateway = applicationContext.getBean(QueryGateway.class);
  }

  public SubscriptionQueryResult<List<GovHydroWEH>, GovHydroWEH> govHydroWEHSubscribe() {
    return queryGateway.subscriptionQuery(
        new FindAllGovHydroWEHQuery(),
        ResponseTypes.multipleInstancesOf(GovHydroWEH.class),
        ResponseTypes.instanceOf(GovHydroWEH.class));
  }

  public SubscriptionQueryResult<GovHydroWEH, GovHydroWEH> govHydroWEHSubscribe(
      @DestinationVariable UUID govHydroWEHId) {
    return queryGateway.subscriptionQuery(
        new FindGovHydroWEHQuery(new LoadGovHydroWEHFilter(govHydroWEHId)),
        ResponseTypes.instanceOf(GovHydroWEH.class),
        ResponseTypes.instanceOf(GovHydroWEH.class));
  }

  // -------------------------------------------------
  // attributes
  // -------------------------------------------------
  @Autowired private final QueryGateway queryGateway;
}
