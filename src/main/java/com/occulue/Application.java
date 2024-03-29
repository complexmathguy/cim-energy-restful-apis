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
package com.occulue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.occulue.*")
@EnableJpaRepositories(basePackages = "com.occulue.repository")
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);

    System.out.println("=================================");
    System.out.println("Checking in ApplicationContext for discovered handler components:\n");
    System.out.println(
        "- Contains aCDCConverter-handler = "
            + context.containsBeanDefinition("aCDCConverter-handler"));
    System.out.println(
        "- Contains aCDCConverterDCTerminal-handler = "
            + context.containsBeanDefinition("aCDCConverterDCTerminal-handler"));
    System.out.println(
        "- Contains aCDCTerminal-handler = "
            + context.containsBeanDefinition("aCDCTerminal-handler"));
    System.out.println(
        "- Contains aCLineSegment-handler = "
            + context.containsBeanDefinition("aCLineSegment-handler"));
    System.out.println(
        "- Contains accumulator-handler = "
            + context.containsBeanDefinition("accumulator-handler"));
    System.out.println(
        "- Contains accumulatorLimit-handler = "
            + context.containsBeanDefinition("accumulatorLimit-handler"));
    System.out.println(
        "- Contains accumulatorLimitSet-handler = "
            + context.containsBeanDefinition("accumulatorLimitSet-handler"));
    System.out.println(
        "- Contains accumulatorReset-handler = "
            + context.containsBeanDefinition("accumulatorReset-handler"));
    System.out.println(
        "- Contains accumulatorValue-handler = "
            + context.containsBeanDefinition("accumulatorValue-handler"));
    System.out.println(
        "- Contains activePower-handler = "
            + context.containsBeanDefinition("activePower-handler"));
    System.out.println(
        "- Contains activePowerLimit-handler = "
            + context.containsBeanDefinition("activePowerLimit-handler"));
    System.out.println(
        "- Contains activePowerPerCurrentFlow-handler = "
            + context.containsBeanDefinition("activePowerPerCurrentFlow-handler"));
    System.out.println(
        "- Contains activePowerPerFrequency-handler = "
            + context.containsBeanDefinition("activePowerPerFrequency-handler"));
    System.out.println(
        "- Contains analog-handler = " + context.containsBeanDefinition("analog-handler"));
    System.out.println(
        "- Contains analogControl-handler = "
            + context.containsBeanDefinition("analogControl-handler"));
    System.out.println(
        "- Contains analogLimit-handler = "
            + context.containsBeanDefinition("analogLimit-handler"));
    System.out.println(
        "- Contains analogLimitSet-handler = "
            + context.containsBeanDefinition("analogLimitSet-handler"));
    System.out.println(
        "- Contains analogValue-handler = "
            + context.containsBeanDefinition("analogValue-handler"));
    System.out.println(
        "- Contains angleDegrees-handler = "
            + context.containsBeanDefinition("angleDegrees-handler"));
    System.out.println(
        "- Contains angleRadians-handler = "
            + context.containsBeanDefinition("angleRadians-handler"));
    System.out.println(
        "- Contains apparentPower-handler = "
            + context.containsBeanDefinition("apparentPower-handler"));
    System.out.println(
        "- Contains apparentPowerLimit-handler = "
            + context.containsBeanDefinition("apparentPowerLimit-handler"));
    System.out.println(
        "- Contains area-handler = " + context.containsBeanDefinition("area-handler"));
    System.out.println(
        "- Contains asynchronousMachine-handler = "
            + context.containsBeanDefinition("asynchronousMachine-handler"));
    System.out.println(
        "- Contains asynchronousMachineDynamics-handler = "
            + context.containsBeanDefinition("asynchronousMachineDynamics-handler"));
    System.out.println(
        "- Contains asynchronousMachineEquivalentCircuit-handler = "
            + context.containsBeanDefinition("asynchronousMachineEquivalentCircuit-handler"));
    System.out.println(
        "- Contains asynchronousMachineTimeConstantReactance-handler = "
            + context.containsBeanDefinition("asynchronousMachineTimeConstantReactance-handler"));
    System.out.println(
        "- Contains asynchronousMachineUserDefined-handler = "
            + context.containsBeanDefinition("asynchronousMachineUserDefined-handler"));
    System.out.println(
        "- Contains baseVoltage-handler = "
            + context.containsBeanDefinition("baseVoltage-handler"));
    System.out.println(
        "- Contains basicIntervalSchedule-handler = "
            + context.containsBeanDefinition("basicIntervalSchedule-handler"));
    System.out.println("- Contains bay-handler = " + context.containsBeanDefinition("bay-handler"));
    System.out.println(
        "- Contains booleanProxy-handler = "
            + context.containsBeanDefinition("booleanProxy-handler"));
    System.out.println(
        "- Contains boundaryExtensions-handler = "
            + context.containsBeanDefinition("boundaryExtensions-handler"));
    System.out.println(
        "- Contains breaker-handler = " + context.containsBeanDefinition("breaker-handler"));
    System.out.println(
        "- Contains busNameMarker-handler = "
            + context.containsBeanDefinition("busNameMarker-handler"));
    System.out.println(
        "- Contains busbarSection-handler = "
            + context.containsBeanDefinition("busbarSection-handler"));
    System.out.println(
        "- Contains capacitance-handler = "
            + context.containsBeanDefinition("capacitance-handler"));
    System.out.println(
        "- Contains capacitancePerLength-handler = "
            + context.containsBeanDefinition("capacitancePerLength-handler"));
    System.out.println(
        "- Contains command-handler = " + context.containsBeanDefinition("command-handler"));
    System.out.println(
        "- Contains conductance-handler = "
            + context.containsBeanDefinition("conductance-handler"));
    System.out.println(
        "- Contains conductingEquipment-handler = "
            + context.containsBeanDefinition("conductingEquipment-handler"));
    System.out.println(
        "- Contains conductor-handler = " + context.containsBeanDefinition("conductor-handler"));
    System.out.println(
        "- Contains conformLoad-handler = "
            + context.containsBeanDefinition("conformLoad-handler"));
    System.out.println(
        "- Contains conformLoadGroup-handler = "
            + context.containsBeanDefinition("conformLoadGroup-handler"));
    System.out.println(
        "- Contains conformLoadSchedule-handler = "
            + context.containsBeanDefinition("conformLoadSchedule-handler"));
    System.out.println(
        "- Contains connectivityNode-handler = "
            + context.containsBeanDefinition("connectivityNode-handler"));
    System.out.println(
        "- Contains connectivityNodeContainer-handler = "
            + context.containsBeanDefinition("connectivityNodeContainer-handler"));
    System.out.println(
        "- Contains connector-handler = " + context.containsBeanDefinition("connector-handler"));
    System.out.println(
        "- Contains control-handler = " + context.containsBeanDefinition("control-handler"));
    System.out.println(
        "- Contains controlArea-handler = "
            + context.containsBeanDefinition("controlArea-handler"));
    System.out.println(
        "- Contains controlAreaGeneratingUnit-handler = "
            + context.containsBeanDefinition("controlAreaGeneratingUnit-handler"));
    System.out.println(
        "- Contains coordinateSystem-handler = "
            + context.containsBeanDefinition("coordinateSystem-handler"));
    System.out.println(
        "- Contains csConverter-handler = "
            + context.containsBeanDefinition("csConverter-handler"));
    System.out.println(
        "- Contains currentFlow-handler = "
            + context.containsBeanDefinition("currentFlow-handler"));
    System.out.println(
        "- Contains currentLimit-handler = "
            + context.containsBeanDefinition("currentLimit-handler"));
    System.out.println(
        "- Contains curve-handler = " + context.containsBeanDefinition("curve-handler"));
    System.out.println(
        "- Contains curveData-handler = " + context.containsBeanDefinition("curveData-handler"));
    System.out.println(
        "- Contains dCBaseTerminal-handler = "
            + context.containsBeanDefinition("dCBaseTerminal-handler"));
    System.out.println(
        "- Contains dCBreaker-handler = " + context.containsBeanDefinition("dCBreaker-handler"));
    System.out.println(
        "- Contains dCBusbar-handler = " + context.containsBeanDefinition("dCBusbar-handler"));
    System.out.println(
        "- Contains dCChopper-handler = " + context.containsBeanDefinition("dCChopper-handler"));
    System.out.println(
        "- Contains dCConductingEquipment-handler = "
            + context.containsBeanDefinition("dCConductingEquipment-handler"));
    System.out.println(
        "- Contains dCConverterUnit-handler = "
            + context.containsBeanDefinition("dCConverterUnit-handler"));
    System.out.println(
        "- Contains dCDisconnector-handler = "
            + context.containsBeanDefinition("dCDisconnector-handler"));
    System.out.println(
        "- Contains dCEquipmentContainer-handler = "
            + context.containsBeanDefinition("dCEquipmentContainer-handler"));
    System.out.println(
        "- Contains dCGround-handler = " + context.containsBeanDefinition("dCGround-handler"));
    System.out.println(
        "- Contains dCLine-handler = " + context.containsBeanDefinition("dCLine-handler"));
    System.out.println(
        "- Contains dCLineSegment-handler = "
            + context.containsBeanDefinition("dCLineSegment-handler"));
    System.out.println(
        "- Contains dCNode-handler = " + context.containsBeanDefinition("dCNode-handler"));
    System.out.println(
        "- Contains dCSeriesDevice-handler = "
            + context.containsBeanDefinition("dCSeriesDevice-handler"));
    System.out.println(
        "- Contains dCShunt-handler = " + context.containsBeanDefinition("dCShunt-handler"));
    System.out.println(
        "- Contains dCSwitch-handler = " + context.containsBeanDefinition("dCSwitch-handler"));
    System.out.println(
        "- Contains dCTerminal-handler = " + context.containsBeanDefinition("dCTerminal-handler"));
    System.out.println(
        "- Contains dCTopologicalIsland-handler = "
            + context.containsBeanDefinition("dCTopologicalIsland-handler"));
    System.out.println(
        "- Contains dCTopologicalNode-handler = "
            + context.containsBeanDefinition("dCTopologicalNode-handler"));
    System.out.println(
        "- Contains dateProxy-handler = " + context.containsBeanDefinition("dateProxy-handler"));
    System.out.println(
        "- Contains dateTime-handler = " + context.containsBeanDefinition("dateTime-handler"));
    System.out.println(
        "- Contains dayType-handler = " + context.containsBeanDefinition("dayType-handler"));
    System.out.println(
        "- Contains decimalProxy-handler = "
            + context.containsBeanDefinition("decimalProxy-handler"));
    System.out.println(
        "- Contains diagram-handler = " + context.containsBeanDefinition("diagram-handler"));
    System.out.println(
        "- Contains diagramLayoutVersion-handler = "
            + context.containsBeanDefinition("diagramLayoutVersion-handler"));
    System.out.println(
        "- Contains diagramObject-handler = "
            + context.containsBeanDefinition("diagramObject-handler"));
    System.out.println(
        "- Contains diagramObjectGluePoint-handler = "
            + context.containsBeanDefinition("diagramObjectGluePoint-handler"));
    System.out.println(
        "- Contains diagramObjectPoint-handler = "
            + context.containsBeanDefinition("diagramObjectPoint-handler"));
    System.out.println(
        "- Contains diagramObjectStyle-handler = "
            + context.containsBeanDefinition("diagramObjectStyle-handler"));
    System.out.println(
        "- Contains diagramStyle-handler = "
            + context.containsBeanDefinition("diagramStyle-handler"));
    System.out.println(
        "- Contains discExcContIEEEDEC1A-handler = "
            + context.containsBeanDefinition("discExcContIEEEDEC1A-handler"));
    System.out.println(
        "- Contains discExcContIEEEDEC2A-handler = "
            + context.containsBeanDefinition("discExcContIEEEDEC2A-handler"));
    System.out.println(
        "- Contains discExcContIEEEDEC3A-handler = "
            + context.containsBeanDefinition("discExcContIEEEDEC3A-handler"));
    System.out.println(
        "- Contains disconnector-handler = "
            + context.containsBeanDefinition("disconnector-handler"));
    System.out.println(
        "- Contains discontinuousExcitationControlDynamics-handler = "
            + context.containsBeanDefinition("discontinuousExcitationControlDynamics-handler"));
    System.out.println(
        "- Contains discontinuousExcitationControlUserDefined-handler = "
            + context.containsBeanDefinition("discontinuousExcitationControlUserDefined-handler"));
    System.out.println(
        "- Contains discrete-handler = " + context.containsBeanDefinition("discrete-handler"));
    System.out.println(
        "- Contains discreteValue-handler = "
            + context.containsBeanDefinition("discreteValue-handler"));
    System.out.println(
        "- Contains domainVersion-handler = "
            + context.containsBeanDefinition("domainVersion-handler"));
    System.out.println(
        "- Contains dynamicsFunctionBlock-handler = "
            + context.containsBeanDefinition("dynamicsFunctionBlock-handler"));
    System.out.println(
        "- Contains dynamicsVersion-handler = "
            + context.containsBeanDefinition("dynamicsVersion-handler"));
    System.out.println(
        "- Contains dynamicsmodel-handler = "
            + context.containsBeanDefinition("dynamicsmodel-handler"));
    System.out.println(
        "- Contains eNTSOEConnectivityNode-handler = "
            + context.containsBeanDefinition("eNTSOEConnectivityNode-handler"));
    System.out.println(
        "- Contains eNTSOEIdentifiedObject-handler = "
            + context.containsBeanDefinition("eNTSOEIdentifiedObject-handler"));
    System.out.println(
        "- Contains eNTSOEJunction-handler = "
            + context.containsBeanDefinition("eNTSOEJunction-handler"));
    System.out.println(
        "- Contains eNTSOEOperationalLimitType-handler = "
            + context.containsBeanDefinition("eNTSOEOperationalLimitType-handler"));
    System.out.println(
        "- Contains eNTSOETopologicalNode-handler = "
            + context.containsBeanDefinition("eNTSOETopologicalNode-handler"));
    System.out.println(
        "- Contains earthFaultCompensator-handler = "
            + context.containsBeanDefinition("earthFaultCompensator-handler"));
    System.out.println(
        "- Contains energyArea-handler = " + context.containsBeanDefinition("energyArea-handler"));
    System.out.println(
        "- Contains energyConsumer-handler = "
            + context.containsBeanDefinition("energyConsumer-handler"));
    System.out.println(
        "- Contains energySchedulingType-handler = "
            + context.containsBeanDefinition("energySchedulingType-handler"));
    System.out.println(
        "- Contains energySource-handler = "
            + context.containsBeanDefinition("energySource-handler"));
    System.out.println(
        "- Contains equipment-handler = " + context.containsBeanDefinition("equipment-handler"));
    System.out.println(
        "- Contains equipmentBoundaryVersion-handler = "
            + context.containsBeanDefinition("equipmentBoundaryVersion-handler"));
    System.out.println(
        "- Contains equipmentContainer-handler = "
            + context.containsBeanDefinition("equipmentContainer-handler"));
    System.out.println(
        "- Contains equipmentVersion-handler = "
            + context.containsBeanDefinition("equipmentVersion-handler"));
    System.out.println(
        "- Contains equivalentBranch-handler = "
            + context.containsBeanDefinition("equivalentBranch-handler"));
    System.out.println(
        "- Contains equivalentEquipment-handler = "
            + context.containsBeanDefinition("equivalentEquipment-handler"));
    System.out.println(
        "- Contains equivalentInjection-handler = "
            + context.containsBeanDefinition("equivalentInjection-handler"));
    System.out.println(
        "- Contains equivalentNetwork-handler = "
            + context.containsBeanDefinition("equivalentNetwork-handler"));
    System.out.println(
        "- Contains equivalentShunt-handler = "
            + context.containsBeanDefinition("equivalentShunt-handler"));
    System.out.println(
        "- Contains excAC1A-handler = " + context.containsBeanDefinition("excAC1A-handler"));
    System.out.println(
        "- Contains excAC2A-handler = " + context.containsBeanDefinition("excAC2A-handler"));
    System.out.println(
        "- Contains excAC3A-handler = " + context.containsBeanDefinition("excAC3A-handler"));
    System.out.println(
        "- Contains excAC4A-handler = " + context.containsBeanDefinition("excAC4A-handler"));
    System.out.println(
        "- Contains excAC5A-handler = " + context.containsBeanDefinition("excAC5A-handler"));
    System.out.println(
        "- Contains excAC6A-handler = " + context.containsBeanDefinition("excAC6A-handler"));
    System.out.println(
        "- Contains excAC8B-handler = " + context.containsBeanDefinition("excAC8B-handler"));
    System.out.println(
        "- Contains excANS-handler = " + context.containsBeanDefinition("excANS-handler"));
    System.out.println(
        "- Contains excAVR1-handler = " + context.containsBeanDefinition("excAVR1-handler"));
    System.out.println(
        "- Contains excAVR2-handler = " + context.containsBeanDefinition("excAVR2-handler"));
    System.out.println(
        "- Contains excAVR3-handler = " + context.containsBeanDefinition("excAVR3-handler"));
    System.out.println(
        "- Contains excAVR4-handler = " + context.containsBeanDefinition("excAVR4-handler"));
    System.out.println(
        "- Contains excAVR5-handler = " + context.containsBeanDefinition("excAVR5-handler"));
    System.out.println(
        "- Contains excAVR7-handler = " + context.containsBeanDefinition("excAVR7-handler"));
    System.out.println(
        "- Contains excBBC-handler = " + context.containsBeanDefinition("excBBC-handler"));
    System.out.println(
        "- Contains excCZ-handler = " + context.containsBeanDefinition("excCZ-handler"));
    System.out.println(
        "- Contains excDC1A-handler = " + context.containsBeanDefinition("excDC1A-handler"));
    System.out.println(
        "- Contains excDC2A-handler = " + context.containsBeanDefinition("excDC2A-handler"));
    System.out.println(
        "- Contains excDC3A-handler = " + context.containsBeanDefinition("excDC3A-handler"));
    System.out.println(
        "- Contains excDC3A1-handler = " + context.containsBeanDefinition("excDC3A1-handler"));
    System.out.println(
        "- Contains excELIN1-handler = " + context.containsBeanDefinition("excELIN1-handler"));
    System.out.println(
        "- Contains excELIN2-handler = " + context.containsBeanDefinition("excELIN2-handler"));
    System.out.println(
        "- Contains excHU-handler = " + context.containsBeanDefinition("excHU-handler"));
    System.out.println(
        "- Contains excIEEEAC1A-handler = "
            + context.containsBeanDefinition("excIEEEAC1A-handler"));
    System.out.println(
        "- Contains excIEEEAC2A-handler = "
            + context.containsBeanDefinition("excIEEEAC2A-handler"));
    System.out.println(
        "- Contains excIEEEAC3A-handler = "
            + context.containsBeanDefinition("excIEEEAC3A-handler"));
    System.out.println(
        "- Contains excIEEEAC4A-handler = "
            + context.containsBeanDefinition("excIEEEAC4A-handler"));
    System.out.println(
        "- Contains excIEEEAC5A-handler = "
            + context.containsBeanDefinition("excIEEEAC5A-handler"));
    System.out.println(
        "- Contains excIEEEAC6A-handler = "
            + context.containsBeanDefinition("excIEEEAC6A-handler"));
    System.out.println(
        "- Contains excIEEEAC7B-handler = "
            + context.containsBeanDefinition("excIEEEAC7B-handler"));
    System.out.println(
        "- Contains excIEEEAC8B-handler = "
            + context.containsBeanDefinition("excIEEEAC8B-handler"));
    System.out.println(
        "- Contains excIEEEDC1A-handler = "
            + context.containsBeanDefinition("excIEEEDC1A-handler"));
    System.out.println(
        "- Contains excIEEEDC2A-handler = "
            + context.containsBeanDefinition("excIEEEDC2A-handler"));
    System.out.println(
        "- Contains excIEEEDC3A-handler = "
            + context.containsBeanDefinition("excIEEEDC3A-handler"));
    System.out.println(
        "- Contains excIEEEDC4B-handler = "
            + context.containsBeanDefinition("excIEEEDC4B-handler"));
    System.out.println(
        "- Contains excIEEEST1A-handler = "
            + context.containsBeanDefinition("excIEEEST1A-handler"));
    System.out.println(
        "- Contains excIEEEST2A-handler = "
            + context.containsBeanDefinition("excIEEEST2A-handler"));
    System.out.println(
        "- Contains excIEEEST3A-handler = "
            + context.containsBeanDefinition("excIEEEST3A-handler"));
    System.out.println(
        "- Contains excIEEEST4B-handler = "
            + context.containsBeanDefinition("excIEEEST4B-handler"));
    System.out.println(
        "- Contains excIEEEST5B-handler = "
            + context.containsBeanDefinition("excIEEEST5B-handler"));
    System.out.println(
        "- Contains excIEEEST6B-handler = "
            + context.containsBeanDefinition("excIEEEST6B-handler"));
    System.out.println(
        "- Contains excIEEEST7B-handler = "
            + context.containsBeanDefinition("excIEEEST7B-handler"));
    System.out.println(
        "- Contains excOEX3T-handler = " + context.containsBeanDefinition("excOEX3T-handler"));
    System.out.println(
        "- Contains excPIC-handler = " + context.containsBeanDefinition("excPIC-handler"));
    System.out.println(
        "- Contains excREXS-handler = " + context.containsBeanDefinition("excREXS-handler"));
    System.out.println(
        "- Contains excSCRX-handler = " + context.containsBeanDefinition("excSCRX-handler"));
    System.out.println(
        "- Contains excSEXS-handler = " + context.containsBeanDefinition("excSEXS-handler"));
    System.out.println(
        "- Contains excSK-handler = " + context.containsBeanDefinition("excSK-handler"));
    System.out.println(
        "- Contains excST1A-handler = " + context.containsBeanDefinition("excST1A-handler"));
    System.out.println(
        "- Contains excST2A-handler = " + context.containsBeanDefinition("excST2A-handler"));
    System.out.println(
        "- Contains excST3A-handler = " + context.containsBeanDefinition("excST3A-handler"));
    System.out.println(
        "- Contains excST4B-handler = " + context.containsBeanDefinition("excST4B-handler"));
    System.out.println(
        "- Contains excST6B-handler = " + context.containsBeanDefinition("excST6B-handler"));
    System.out.println(
        "- Contains excST7B-handler = " + context.containsBeanDefinition("excST7B-handler"));
    System.out.println(
        "- Contains excitationSystemDynamics-handler = "
            + context.containsBeanDefinition("excitationSystemDynamics-handler"));
    System.out.println(
        "- Contains excitationSystemUserDefined-handler = "
            + context.containsBeanDefinition("excitationSystemUserDefined-handler"));
    System.out.println(
        "- Contains extensionVersion-handler = "
            + context.containsBeanDefinition("extensionVersion-handler"));
    System.out.println(
        "- Contains externalNetworkInjection-handler = "
            + context.containsBeanDefinition("externalNetworkInjection-handler"));
    System.out.println(
        "- Contains floatProxy-handler = " + context.containsBeanDefinition("floatProxy-handler"));
    System.out.println(
        "- Contains fossilFuel-handler = " + context.containsBeanDefinition("fossilFuel-handler"));
    System.out.println(
        "- Contains frequency-handler = " + context.containsBeanDefinition("frequency-handler"));
    System.out.println(
        "- Contains genICompensationForGenJ-handler = "
            + context.containsBeanDefinition("genICompensationForGenJ-handler"));
    System.out.println(
        "- Contains generatingUnit-handler = "
            + context.containsBeanDefinition("generatingUnit-handler"));
    System.out.println(
        "- Contains geographicalLocationVersion-handler = "
            + context.containsBeanDefinition("geographicalLocationVersion-handler"));
    System.out.println(
        "- Contains geographicalRegion-handler = "
            + context.containsBeanDefinition("geographicalRegion-handler"));
    System.out.println(
        "- Contains govCT1-handler = " + context.containsBeanDefinition("govCT1-handler"));
    System.out.println(
        "- Contains govCT2-handler = " + context.containsBeanDefinition("govCT2-handler"));
    System.out.println(
        "- Contains govGAST-handler = " + context.containsBeanDefinition("govGAST-handler"));
    System.out.println(
        "- Contains govGAST1-handler = " + context.containsBeanDefinition("govGAST1-handler"));
    System.out.println(
        "- Contains govGAST2-handler = " + context.containsBeanDefinition("govGAST2-handler"));
    System.out.println(
        "- Contains govGAST3-handler = " + context.containsBeanDefinition("govGAST3-handler"));
    System.out.println(
        "- Contains govGAST4-handler = " + context.containsBeanDefinition("govGAST4-handler"));
    System.out.println(
        "- Contains govGASTWD-handler = " + context.containsBeanDefinition("govGASTWD-handler"));
    System.out.println(
        "- Contains govHydro1-handler = " + context.containsBeanDefinition("govHydro1-handler"));
    System.out.println(
        "- Contains govHydro2-handler = " + context.containsBeanDefinition("govHydro2-handler"));
    System.out.println(
        "- Contains govHydro3-handler = " + context.containsBeanDefinition("govHydro3-handler"));
    System.out.println(
        "- Contains govHydro4-handler = " + context.containsBeanDefinition("govHydro4-handler"));
    System.out.println(
        "- Contains govHydroDD-handler = " + context.containsBeanDefinition("govHydroDD-handler"));
    System.out.println(
        "- Contains govHydroFrancis-handler = "
            + context.containsBeanDefinition("govHydroFrancis-handler"));
    System.out.println(
        "- Contains govHydroIEEE0-handler = "
            + context.containsBeanDefinition("govHydroIEEE0-handler"));
    System.out.println(
        "- Contains govHydroIEEE2-handler = "
            + context.containsBeanDefinition("govHydroIEEE2-handler"));
    System.out.println(
        "- Contains govHydroPID-handler = "
            + context.containsBeanDefinition("govHydroPID-handler"));
    System.out.println(
        "- Contains govHydroPID2-handler = "
            + context.containsBeanDefinition("govHydroPID2-handler"));
    System.out.println(
        "- Contains govHydroPelton-handler = "
            + context.containsBeanDefinition("govHydroPelton-handler"));
    System.out.println(
        "- Contains govHydroR-handler = " + context.containsBeanDefinition("govHydroR-handler"));
    System.out.println(
        "- Contains govHydroWEH-handler = "
            + context.containsBeanDefinition("govHydroWEH-handler"));
    System.out.println(
        "- Contains govHydroWPID-handler = "
            + context.containsBeanDefinition("govHydroWPID-handler"));
    System.out.println(
        "- Contains govSteam0-handler = " + context.containsBeanDefinition("govSteam0-handler"));
    System.out.println(
        "- Contains govSteam1-handler = " + context.containsBeanDefinition("govSteam1-handler"));
    System.out.println(
        "- Contains govSteam2-handler = " + context.containsBeanDefinition("govSteam2-handler"));
    System.out.println(
        "- Contains govSteamCC-handler = " + context.containsBeanDefinition("govSteamCC-handler"));
    System.out.println(
        "- Contains govSteamEU-handler = " + context.containsBeanDefinition("govSteamEU-handler"));
    System.out.println(
        "- Contains govSteamFV2-handler = "
            + context.containsBeanDefinition("govSteamFV2-handler"));
    System.out.println(
        "- Contains govSteamFV3-handler = "
            + context.containsBeanDefinition("govSteamFV3-handler"));
    System.out.println(
        "- Contains govSteamFV4-handler = "
            + context.containsBeanDefinition("govSteamFV4-handler"));
    System.out.println(
        "- Contains govSteamIEEE1-handler = "
            + context.containsBeanDefinition("govSteamIEEE1-handler"));
    System.out.println(
        "- Contains govSteamSGO-handler = "
            + context.containsBeanDefinition("govSteamSGO-handler"));
    System.out.println(
        "- Contains grossToNetActivePowerCurve-handler = "
            + context.containsBeanDefinition("grossToNetActivePowerCurve-handler"));
    System.out.println(
        "- Contains ground-handler = " + context.containsBeanDefinition("ground-handler"));
    System.out.println(
        "- Contains groundDisconnector-handler = "
            + context.containsBeanDefinition("groundDisconnector-handler"));
    System.out.println(
        "- Contains groundingImpedance-handler = "
            + context.containsBeanDefinition("groundingImpedance-handler"));
    System.out.println(
        "- Contains hydroGeneratingUnit-handler = "
            + context.containsBeanDefinition("hydroGeneratingUnit-handler"));
    System.out.println(
        "- Contains hydroPowerPlant-handler = "
            + context.containsBeanDefinition("hydroPowerPlant-handler"));
    System.out.println(
        "- Contains hydroPump-handler = " + context.containsBeanDefinition("hydroPump-handler"));
    System.out.println(
        "- Contains identifiedObject-handler = "
            + context.containsBeanDefinition("identifiedObject-handler"));
    System.out.println(
        "- Contains inductance-handler = " + context.containsBeanDefinition("inductance-handler"));
    System.out.println(
        "- Contains inductancePerLength-handler = "
            + context.containsBeanDefinition("inductancePerLength-handler"));
    System.out.println(
        "- Contains integerProxy-handler = "
            + context.containsBeanDefinition("integerProxy-handler"));
    System.out.println(
        "- Contains junction-handler = " + context.containsBeanDefinition("junction-handler"));
    System.out.println(
        "- Contains length-handler = " + context.containsBeanDefinition("length-handler"));
    System.out.println(
        "- Contains limit-handler = " + context.containsBeanDefinition("limit-handler"));
    System.out.println(
        "- Contains limitSet-handler = " + context.containsBeanDefinition("limitSet-handler"));
    System.out.println(
        "- Contains line-handler = " + context.containsBeanDefinition("line-handler"));
    System.out.println(
        "- Contains linearShuntCompensator-handler = "
            + context.containsBeanDefinition("linearShuntCompensator-handler"));
    System.out.println(
        "- Contains loadAggregate-handler = "
            + context.containsBeanDefinition("loadAggregate-handler"));
    System.out.println(
        "- Contains loadArea-handler = " + context.containsBeanDefinition("loadArea-handler"));
    System.out.println(
        "- Contains loadBreakSwitch-handler = "
            + context.containsBeanDefinition("loadBreakSwitch-handler"));
    System.out.println(
        "- Contains loadComposite-handler = "
            + context.containsBeanDefinition("loadComposite-handler"));
    System.out.println(
        "- Contains loadDynamics-handler = "
            + context.containsBeanDefinition("loadDynamics-handler"));
    System.out.println(
        "- Contains loadGenericNonLinear-handler = "
            + context.containsBeanDefinition("loadGenericNonLinear-handler"));
    System.out.println(
        "- Contains loadGroup-handler = " + context.containsBeanDefinition("loadGroup-handler"));
    System.out.println(
        "- Contains loadMotor-handler = " + context.containsBeanDefinition("loadMotor-handler"));
    System.out.println(
        "- Contains loadResponseCharacteristic-handler = "
            + context.containsBeanDefinition("loadResponseCharacteristic-handler"));
    System.out.println(
        "- Contains loadStatic-handler = " + context.containsBeanDefinition("loadStatic-handler"));
    System.out.println(
        "- Contains loadUserDefined-handler = "
            + context.containsBeanDefinition("loadUserDefined-handler"));
    System.out.println(
        "- Contains location-handler = " + context.containsBeanDefinition("location-handler"));
    System.out.println(
        "- Contains measurement-handler = "
            + context.containsBeanDefinition("measurement-handler"));
    System.out.println(
        "- Contains measurementValue-handler = "
            + context.containsBeanDefinition("measurementValue-handler"));
    System.out.println(
        "- Contains measurementValueQuality-handler = "
            + context.containsBeanDefinition("measurementValueQuality-handler"));
    System.out.println(
        "- Contains measurementValueSource-handler = "
            + context.containsBeanDefinition("measurementValueSource-handler"));
    System.out.println(
        "- Contains mechLoad1-handler = " + context.containsBeanDefinition("mechLoad1-handler"));
    System.out.println(
        "- Contains mechanicalLoadDynamics-handler = "
            + context.containsBeanDefinition("mechanicalLoadDynamics-handler"));
    System.out.println(
        "- Contains mechanicalLoadUserDefined-handler = "
            + context.containsBeanDefinition("mechanicalLoadUserDefined-handler"));
    System.out.println(
        "- Contains money-handler = " + context.containsBeanDefinition("money-handler"));
    System.out.println(
        "- Contains monthDay-handler = " + context.containsBeanDefinition("monthDay-handler"));
    System.out.println(
        "- Contains monthDayInterval-handler = "
            + context.containsBeanDefinition("monthDayInterval-handler"));
    System.out.println(
        "- Contains mutualCoupling-handler = "
            + context.containsBeanDefinition("mutualCoupling-handler"));
    System.out.println(
        "- Contains nonConformLoad-handler = "
            + context.containsBeanDefinition("nonConformLoad-handler"));
    System.out.println(
        "- Contains nonConformLoadGroup-handler = "
            + context.containsBeanDefinition("nonConformLoadGroup-handler"));
    System.out.println(
        "- Contains nonConformLoadSchedule-handler = "
            + context.containsBeanDefinition("nonConformLoadSchedule-handler"));
    System.out.println(
        "- Contains nonlinearShuntCompensator-handler = "
            + context.containsBeanDefinition("nonlinearShuntCompensator-handler"));
    System.out.println(
        "- Contains nonlinearShuntCompensatorPoint-handler = "
            + context.containsBeanDefinition("nonlinearShuntCompensatorPoint-handler"));
    System.out.println(
        "- Contains nuclearGeneratingUnit-handler = "
            + context.containsBeanDefinition("nuclearGeneratingUnit-handler"));
    System.out.println(
        "- Contains operationalLimit-handler = "
            + context.containsBeanDefinition("operationalLimit-handler"));
    System.out.println(
        "- Contains operationalLimitSet-handler = "
            + context.containsBeanDefinition("operationalLimitSet-handler"));
    System.out.println(
        "- Contains operationalLimitType-handler = "
            + context.containsBeanDefinition("operationalLimitType-handler"));
    System.out.println(
        "- Contains overexcLim2-handler = "
            + context.containsBeanDefinition("overexcLim2-handler"));
    System.out.println(
        "- Contains overexcLimIEEE-handler = "
            + context.containsBeanDefinition("overexcLimIEEE-handler"));
    System.out.println(
        "- Contains overexcLimX1-handler = "
            + context.containsBeanDefinition("overexcLimX1-handler"));
    System.out.println(
        "- Contains overexcLimX2-handler = "
            + context.containsBeanDefinition("overexcLimX2-handler"));
    System.out.println(
        "- Contains overexcitationLimiterDynamics-handler = "
            + context.containsBeanDefinition("overexcitationLimiterDynamics-handler"));
    System.out.println(
        "- Contains overexcitationLimiterUserDefined-handler = "
            + context.containsBeanDefinition("overexcitationLimiterUserDefined-handler"));
    System.out.println(
        "- Contains pFVArControllerType1Dynamics-handler = "
            + context.containsBeanDefinition("pFVArControllerType1Dynamics-handler"));
    System.out.println(
        "- Contains pFVArControllerType1UserDefined-handler = "
            + context.containsBeanDefinition("pFVArControllerType1UserDefined-handler"));
    System.out.println(
        "- Contains pFVArControllerType2Dynamics-handler = "
            + context.containsBeanDefinition("pFVArControllerType2Dynamics-handler"));
    System.out.println(
        "- Contains pFVArControllerType2UserDefined-handler = "
            + context.containsBeanDefinition("pFVArControllerType2UserDefined-handler"));
    System.out.println(
        "- Contains pFVArType1IEEEPFController-handler = "
            + context.containsBeanDefinition("pFVArType1IEEEPFController-handler"));
    System.out.println(
        "- Contains pFVArType1IEEEVArController-handler = "
            + context.containsBeanDefinition("pFVArType1IEEEVArController-handler"));
    System.out.println(
        "- Contains pFVArType2Common1-handler = "
            + context.containsBeanDefinition("pFVArType2Common1-handler"));
    System.out.println(
        "- Contains pFVArType2IEEEPFController-handler = "
            + context.containsBeanDefinition("pFVArType2IEEEPFController-handler"));
    System.out.println(
        "- Contains pFVArType2IEEEVArController-handler = "
            + context.containsBeanDefinition("pFVArType2IEEEVArController-handler"));
    System.out.println("- Contains pU-handler = " + context.containsBeanDefinition("pU-handler"));
    System.out.println(
        "- Contains perCent-handler = " + context.containsBeanDefinition("perCent-handler"));
    System.out.println(
        "- Contains perLengthDCLineParameter-handler = "
            + context.containsBeanDefinition("perLengthDCLineParameter-handler"));
    System.out.println(
        "- Contains petersenCoil-handler = "
            + context.containsBeanDefinition("petersenCoil-handler"));
    System.out.println(
        "- Contains phaseTapChanger-handler = "
            + context.containsBeanDefinition("phaseTapChanger-handler"));
    System.out.println(
        "- Contains phaseTapChangerAsymmetrical-handler = "
            + context.containsBeanDefinition("phaseTapChangerAsymmetrical-handler"));
    System.out.println(
        "- Contains phaseTapChangerLinear-handler = "
            + context.containsBeanDefinition("phaseTapChangerLinear-handler"));
    System.out.println(
        "- Contains phaseTapChangerNonLinear-handler = "
            + context.containsBeanDefinition("phaseTapChangerNonLinear-handler"));
    System.out.println(
        "- Contains phaseTapChangerSymmetrical-handler = "
            + context.containsBeanDefinition("phaseTapChangerSymmetrical-handler"));
    System.out.println(
        "- Contains phaseTapChangerTable-handler = "
            + context.containsBeanDefinition("phaseTapChangerTable-handler"));
    System.out.println(
        "- Contains phaseTapChangerTablePoint-handler = "
            + context.containsBeanDefinition("phaseTapChangerTablePoint-handler"));
    System.out.println(
        "- Contains phaseTapChangerTabular-handler = "
            + context.containsBeanDefinition("phaseTapChangerTabular-handler"));
    System.out.println(
        "- Contains positionPoint-handler = "
            + context.containsBeanDefinition("positionPoint-handler"));
    System.out.println(
        "- Contains powerSystemResource-handler = "
            + context.containsBeanDefinition("powerSystemResource-handler"));
    System.out.println(
        "- Contains powerSystemStabilizerDynamics-handler = "
            + context.containsBeanDefinition("powerSystemStabilizerDynamics-handler"));
    System.out.println(
        "- Contains powerSystemStabilizerUserDefined-handler = "
            + context.containsBeanDefinition("powerSystemStabilizerUserDefined-handler"));
    System.out.println(
        "- Contains powerTransformer-handler = "
            + context.containsBeanDefinition("powerTransformer-handler"));
    System.out.println(
        "- Contains powerTransformerEnd-handler = "
            + context.containsBeanDefinition("powerTransformerEnd-handler"));
    System.out.println(
        "- Contains proprietaryParameterDynamics-handler = "
            + context.containsBeanDefinition("proprietaryParameterDynamics-handler"));
    System.out.println(
        "- Contains protectedSwitch-handler = "
            + context.containsBeanDefinition("protectedSwitch-handler"));
    System.out.println(
        "- Contains pss1-handler = " + context.containsBeanDefinition("pss1-handler"));
    System.out.println(
        "- Contains pss1A-handler = " + context.containsBeanDefinition("pss1A-handler"));
    System.out.println(
        "- Contains pss2B-handler = " + context.containsBeanDefinition("pss2B-handler"));
    System.out.println(
        "- Contains pss2ST-handler = " + context.containsBeanDefinition("pss2ST-handler"));
    System.out.println(
        "- Contains pss5-handler = " + context.containsBeanDefinition("pss5-handler"));
    System.out.println(
        "- Contains pssELIN2-handler = " + context.containsBeanDefinition("pssELIN2-handler"));
    System.out.println(
        "- Contains pssIEEE1A-handler = " + context.containsBeanDefinition("pssIEEE1A-handler"));
    System.out.println(
        "- Contains pssIEEE2B-handler = " + context.containsBeanDefinition("pssIEEE2B-handler"));
    System.out.println(
        "- Contains pssIEEE3B-handler = " + context.containsBeanDefinition("pssIEEE3B-handler"));
    System.out.println(
        "- Contains pssIEEE4B-handler = " + context.containsBeanDefinition("pssIEEE4B-handler"));
    System.out.println(
        "- Contains pssPTIST1-handler = " + context.containsBeanDefinition("pssPTIST1-handler"));
    System.out.println(
        "- Contains pssPTIST3-handler = " + context.containsBeanDefinition("pssPTIST3-handler"));
    System.out.println(
        "- Contains pssSB4-handler = " + context.containsBeanDefinition("pssSB4-handler"));
    System.out.println(
        "- Contains pssSH-handler = " + context.containsBeanDefinition("pssSH-handler"));
    System.out.println(
        "- Contains pssSK-handler = " + context.containsBeanDefinition("pssSK-handler"));
    System.out.println(
        "- Contains pssWECC-handler = " + context.containsBeanDefinition("pssWECC-handler"));
    System.out.println(
        "- Contains quality61850-handler = "
            + context.containsBeanDefinition("quality61850-handler"));
    System.out.println(
        "- Contains raiseLowerCommand-handler = "
            + context.containsBeanDefinition("raiseLowerCommand-handler"));
    System.out.println(
        "- Contains ratioTapChanger-handler = "
            + context.containsBeanDefinition("ratioTapChanger-handler"));
    System.out.println(
        "- Contains ratioTapChangerTable-handler = "
            + context.containsBeanDefinition("ratioTapChangerTable-handler"));
    System.out.println(
        "- Contains ratioTapChangerTablePoint-handler = "
            + context.containsBeanDefinition("ratioTapChangerTablePoint-handler"));
    System.out.println(
        "- Contains reactance-handler = " + context.containsBeanDefinition("reactance-handler"));
    System.out.println(
        "- Contains reactiveCapabilityCurve-handler = "
            + context.containsBeanDefinition("reactiveCapabilityCurve-handler"));
    System.out.println(
        "- Contains reactivePower-handler = "
            + context.containsBeanDefinition("reactivePower-handler"));
    System.out.println(
        "- Contains regularIntervalSchedule-handler = "
            + context.containsBeanDefinition("regularIntervalSchedule-handler"));
    System.out.println(
        "- Contains regularTimePoint-handler = "
            + context.containsBeanDefinition("regularTimePoint-handler"));
    System.out.println(
        "- Contains regulatingCondEq-handler = "
            + context.containsBeanDefinition("regulatingCondEq-handler"));
    System.out.println(
        "- Contains regulatingControl-handler = "
            + context.containsBeanDefinition("regulatingControl-handler"));
    System.out.println(
        "- Contains regulationSchedule-handler = "
            + context.containsBeanDefinition("regulationSchedule-handler"));
    System.out.println(
        "- Contains remoteInputSignal-handler = "
            + context.containsBeanDefinition("remoteInputSignal-handler"));
    System.out.println(
        "- Contains reportingGroup-handler = "
            + context.containsBeanDefinition("reportingGroup-handler"));
    System.out.println(
        "- Contains resistance-handler = " + context.containsBeanDefinition("resistance-handler"));
    System.out.println(
        "- Contains resistancePerLength-handler = "
            + context.containsBeanDefinition("resistancePerLength-handler"));
    System.out.println(
        "- Contains rotatingMachine-handler = "
            + context.containsBeanDefinition("rotatingMachine-handler"));
    System.out.println(
        "- Contains rotatingMachineDynamics-handler = "
            + context.containsBeanDefinition("rotatingMachineDynamics-handler"));
    System.out.println(
        "- Contains rotationSpeed-handler = "
            + context.containsBeanDefinition("rotationSpeed-handler"));
    System.out.println(
        "- Contains season-handler = " + context.containsBeanDefinition("season-handler"));
    System.out.println(
        "- Contains seasonDayTypeSchedule-handler = "
            + context.containsBeanDefinition("seasonDayTypeSchedule-handler"));
    System.out.println(
        "- Contains seconds-handler = " + context.containsBeanDefinition("seconds-handler"));
    System.out.println(
        "- Contains seriesCompensator-handler = "
            + context.containsBeanDefinition("seriesCompensator-handler"));
    System.out.println(
        "- Contains setPoint-handler = " + context.containsBeanDefinition("setPoint-handler"));
    System.out.println(
        "- Contains shuntCompensator-handler = "
            + context.containsBeanDefinition("shuntCompensator-handler"));
    System.out.println(
        "- Contains simple_Float-handler = "
            + context.containsBeanDefinition("simple_Float-handler"));
    System.out.println(
        "- Contains solarGeneratingUnit-handler = "
            + context.containsBeanDefinition("solarGeneratingUnit-handler"));
    System.out.println(
        "- Contains stateVariablesVersion-handler = "
            + context.containsBeanDefinition("stateVariablesVersion-handler"));
    System.out.println(
        "- Contains staticVarCompensator-handler = "
            + context.containsBeanDefinition("staticVarCompensator-handler"));
    System.out.println(
        "- Contains staticpowersystemmodel-handler = "
            + context.containsBeanDefinition("staticpowersystemmodel-handler"));
    System.out.println(
        "- Contains stationSupply-handler = "
            + context.containsBeanDefinition("stationSupply-handler"));
    System.out.println(
        "- Contains steadyStateHypothesisVersion-handler = "
            + context.containsBeanDefinition("steadyStateHypothesisVersion-handler"));
    System.out.println(
        "- Contains stringMeasurement-handler = "
            + context.containsBeanDefinition("stringMeasurement-handler"));
    System.out.println(
        "- Contains stringMeasurementValue-handler = "
            + context.containsBeanDefinition("stringMeasurementValue-handler"));
    System.out.println(
        "- Contains stringProxy-handler = "
            + context.containsBeanDefinition("stringProxy-handler"));
    System.out.println(
        "- Contains subGeographicalRegion-handler = "
            + context.containsBeanDefinition("subGeographicalRegion-handler"));
    System.out.println(
        "- Contains subLoadArea-handler = "
            + context.containsBeanDefinition("subLoadArea-handler"));
    System.out.println(
        "- Contains substation-handler = " + context.containsBeanDefinition("substation-handler"));
    System.out.println(
        "- Contains susceptance-handler = "
            + context.containsBeanDefinition("susceptance-handler"));
    System.out.println(
        "- Contains svInjection-handler = "
            + context.containsBeanDefinition("svInjection-handler"));
    System.out.println(
        "- Contains svPowerFlow-handler = "
            + context.containsBeanDefinition("svPowerFlow-handler"));
    System.out.println(
        "- Contains svShuntCompensatorSections-handler = "
            + context.containsBeanDefinition("svShuntCompensatorSections-handler"));
    System.out.println(
        "- Contains svStatus-handler = " + context.containsBeanDefinition("svStatus-handler"));
    System.out.println(
        "- Contains svTapStep-handler = " + context.containsBeanDefinition("svTapStep-handler"));
    System.out.println(
        "- Contains svVoltage-handler = " + context.containsBeanDefinition("svVoltage-handler"));
    System.out.println(
        "- Contains switchIt-handler = " + context.containsBeanDefinition("switchIt-handler"));
    System.out.println(
        "- Contains switchProxy-handler = "
            + context.containsBeanDefinition("switchProxy-handler"));
    System.out.println(
        "- Contains switchSchedule-handler = "
            + context.containsBeanDefinition("switchSchedule-handler"));
    System.out.println(
        "- Contains synchronousMachine-handler = "
            + context.containsBeanDefinition("synchronousMachine-handler"));
    System.out.println(
        "- Contains synchronousMachineDetailed-handler = "
            + context.containsBeanDefinition("synchronousMachineDetailed-handler"));
    System.out.println(
        "- Contains synchronousMachineDynamics-handler = "
            + context.containsBeanDefinition("synchronousMachineDynamics-handler"));
    System.out.println(
        "- Contains synchronousMachineEquivalentCircuit-handler = "
            + context.containsBeanDefinition("synchronousMachineEquivalentCircuit-handler"));
    System.out.println(
        "- Contains synchronousMachineSimplified-handler = "
            + context.containsBeanDefinition("synchronousMachineSimplified-handler"));
    System.out.println(
        "- Contains synchronousMachineTimeConstantReactance-handler = "
            + context.containsBeanDefinition("synchronousMachineTimeConstantReactance-handler"));
    System.out.println(
        "- Contains synchronousMachineUserDefined-handler = "
            + context.containsBeanDefinition("synchronousMachineUserDefined-handler"));
    System.out.println(
        "- Contains tapChanger-handler = " + context.containsBeanDefinition("tapChanger-handler"));
    System.out.println(
        "- Contains tapChangerControl-handler = "
            + context.containsBeanDefinition("tapChangerControl-handler"));
    System.out.println(
        "- Contains tapChangerTablePoint-handler = "
            + context.containsBeanDefinition("tapChangerTablePoint-handler"));
    System.out.println(
        "- Contains tapSchedule-handler = "
            + context.containsBeanDefinition("tapSchedule-handler"));
    System.out.println(
        "- Contains temperature-handler = "
            + context.containsBeanDefinition("temperature-handler"));
    System.out.println(
        "- Contains terminal-handler = " + context.containsBeanDefinition("terminal-handler"));
    System.out.println(
        "- Contains textDiagramObject-handler = "
            + context.containsBeanDefinition("textDiagramObject-handler"));
    System.out.println(
        "- Contains thermalGeneratingUnit-handler = "
            + context.containsBeanDefinition("thermalGeneratingUnit-handler"));
    System.out.println(
        "- Contains tieFlow-handler = " + context.containsBeanDefinition("tieFlow-handler"));
    System.out.println(
        "- Contains topologicalIsland-handler = "
            + context.containsBeanDefinition("topologicalIsland-handler"));
    System.out.println(
        "- Contains topologicalNode-handler = "
            + context.containsBeanDefinition("topologicalNode-handler"));
    System.out.println(
        "- Contains topologyBoundaryVersion-handler = "
            + context.containsBeanDefinition("topologyBoundaryVersion-handler"));
    System.out.println(
        "- Contains topologyVersion-handler = "
            + context.containsBeanDefinition("topologyVersion-handler"));
    System.out.println(
        "- Contains transformerEnd-handler = "
            + context.containsBeanDefinition("transformerEnd-handler"));
    System.out.println(
        "- Contains turbLCFB1-handler = " + context.containsBeanDefinition("turbLCFB1-handler"));
    System.out.println(
        "- Contains turbineGovernorDynamics-handler = "
            + context.containsBeanDefinition("turbineGovernorDynamics-handler"));
    System.out.println(
        "- Contains turbineGovernorUserDefined-handler = "
            + context.containsBeanDefinition("turbineGovernorUserDefined-handler"));
    System.out.println(
        "- Contains turbineLoadControllerDynamics-handler = "
            + context.containsBeanDefinition("turbineLoadControllerDynamics-handler"));
    System.out.println(
        "- Contains turbineLoadControllerUserDefined-handler = "
            + context.containsBeanDefinition("turbineLoadControllerUserDefined-handler"));
    System.out.println(
        "- Contains underexcLim2Simplified-handler = "
            + context.containsBeanDefinition("underexcLim2Simplified-handler"));
    System.out.println(
        "- Contains underexcLimIEEE1-handler = "
            + context.containsBeanDefinition("underexcLimIEEE1-handler"));
    System.out.println(
        "- Contains underexcLimIEEE2-handler = "
            + context.containsBeanDefinition("underexcLimIEEE2-handler"));
    System.out.println(
        "- Contains underexcLimX1-handler = "
            + context.containsBeanDefinition("underexcLimX1-handler"));
    System.out.println(
        "- Contains underexcLimX2-handler = "
            + context.containsBeanDefinition("underexcLimX2-handler"));
    System.out.println(
        "- Contains underexcitationLimiterDynamics-handler = "
            + context.containsBeanDefinition("underexcitationLimiterDynamics-handler"));
    System.out.println(
        "- Contains underexcitationLimiterUserDefined-handler = "
            + context.containsBeanDefinition("underexcitationLimiterUserDefined-handler"));
    System.out.println(
        "- Contains unresolvedname-handler = "
            + context.containsBeanDefinition("unresolvedname-handler"));
    System.out.println(
        "- Contains vAdjIEEE-handler = " + context.containsBeanDefinition("vAdjIEEE-handler"));
    System.out.println(
        "- Contains vCompIEEEType1-handler = "
            + context.containsBeanDefinition("vCompIEEEType1-handler"));
    System.out.println(
        "- Contains vCompIEEEType2-handler = "
            + context.containsBeanDefinition("vCompIEEEType2-handler"));
    System.out.println(
        "- Contains valueAliasSet-handler = "
            + context.containsBeanDefinition("valueAliasSet-handler"));
    System.out.println(
        "- Contains valueToAlias-handler = "
            + context.containsBeanDefinition("valueToAlias-handler"));
    System.out.println(
        "- Contains visibilityLayer-handler = "
            + context.containsBeanDefinition("visibilityLayer-handler"));
    System.out.println(
        "- Contains voltage-handler = " + context.containsBeanDefinition("voltage-handler"));
    System.out.println(
        "- Contains voltageAdjusterDynamics-handler = "
            + context.containsBeanDefinition("voltageAdjusterDynamics-handler"));
    System.out.println(
        "- Contains voltageAdjusterUserDefined-handler = "
            + context.containsBeanDefinition("voltageAdjusterUserDefined-handler"));
    System.out.println(
        "- Contains voltageCompensatorDynamics-handler = "
            + context.containsBeanDefinition("voltageCompensatorDynamics-handler"));
    System.out.println(
        "- Contains voltageCompensatorUserDefined-handler = "
            + context.containsBeanDefinition("voltageCompensatorUserDefined-handler"));
    System.out.println(
        "- Contains voltageLevel-handler = "
            + context.containsBeanDefinition("voltageLevel-handler"));
    System.out.println(
        "- Contains voltageLimit-handler = "
            + context.containsBeanDefinition("voltageLimit-handler"));
    System.out.println(
        "- Contains voltagePerReactivePower-handler = "
            + context.containsBeanDefinition("voltagePerReactivePower-handler"));
    System.out.println(
        "- Contains volumeFlowRate-handler = "
            + context.containsBeanDefinition("volumeFlowRate-handler"));
    System.out.println(
        "- Contains vsCapabilityCurve-handler = "
            + context.containsBeanDefinition("vsCapabilityCurve-handler"));
    System.out.println(
        "- Contains vsConverter-handler = "
            + context.containsBeanDefinition("vsConverter-handler"));
    System.out.println(
        "- Contains windAeroConstIEC-handler = "
            + context.containsBeanDefinition("windAeroConstIEC-handler"));
    System.out.println(
        "- Contains windAeroLinearIEC-handler = "
            + context.containsBeanDefinition("windAeroLinearIEC-handler"));
    System.out.println(
        "- Contains windContCurrLimIEC-handler = "
            + context.containsBeanDefinition("windContCurrLimIEC-handler"));
    System.out.println(
        "- Contains windContPType3IEC-handler = "
            + context.containsBeanDefinition("windContPType3IEC-handler"));
    System.out.println(
        "- Contains windContPType4aIEC-handler = "
            + context.containsBeanDefinition("windContPType4aIEC-handler"));
    System.out.println(
        "- Contains windContPType4bIEC-handler = "
            + context.containsBeanDefinition("windContPType4bIEC-handler"));
    System.out.println(
        "- Contains windContPitchAngleIEC-handler = "
            + context.containsBeanDefinition("windContPitchAngleIEC-handler"));
    System.out.println(
        "- Contains windContQIEC-handler = "
            + context.containsBeanDefinition("windContQIEC-handler"));
    System.out.println(
        "- Contains windContRotorRIEC-handler = "
            + context.containsBeanDefinition("windContRotorRIEC-handler"));
    System.out.println(
        "- Contains windDynamicsLookupTable-handler = "
            + context.containsBeanDefinition("windDynamicsLookupTable-handler"));
    System.out.println(
        "- Contains windGenTurbineType1IEC-handler = "
            + context.containsBeanDefinition("windGenTurbineType1IEC-handler"));
    System.out.println(
        "- Contains windGenTurbineType2IEC-handler = "
            + context.containsBeanDefinition("windGenTurbineType2IEC-handler"));
    System.out.println(
        "- Contains windGenTurbineType3IEC-handler = "
            + context.containsBeanDefinition("windGenTurbineType3IEC-handler"));
    System.out.println(
        "- Contains windGenTurbineType3aIEC-handler = "
            + context.containsBeanDefinition("windGenTurbineType3aIEC-handler"));
    System.out.println(
        "- Contains windGenTurbineType3bIEC-handler = "
            + context.containsBeanDefinition("windGenTurbineType3bIEC-handler"));
    System.out.println(
        "- Contains windGenType4IEC-handler = "
            + context.containsBeanDefinition("windGenType4IEC-handler"));
    System.out.println(
        "- Contains windGeneratingUnit-handler = "
            + context.containsBeanDefinition("windGeneratingUnit-handler"));
    System.out.println(
        "- Contains windMechIEC-handler = "
            + context.containsBeanDefinition("windMechIEC-handler"));
    System.out.println(
        "- Contains windPitchContEmulIEC-handler = "
            + context.containsBeanDefinition("windPitchContEmulIEC-handler"));
    System.out.println(
        "- Contains windPlantDynamics-handler = "
            + context.containsBeanDefinition("windPlantDynamics-handler"));
    System.out.println(
        "- Contains windPlantFreqPcontrolIEC-handler = "
            + context.containsBeanDefinition("windPlantFreqPcontrolIEC-handler"));
    System.out.println(
        "- Contains windPlantIEC-handler = "
            + context.containsBeanDefinition("windPlantIEC-handler"));
    System.out.println(
        "- Contains windPlantReactiveControlIEC-handler = "
            + context.containsBeanDefinition("windPlantReactiveControlIEC-handler"));
    System.out.println(
        "- Contains windPlantUserDefined-handler = "
            + context.containsBeanDefinition("windPlantUserDefined-handler"));
    System.out.println(
        "- Contains windProtectionIEC-handler = "
            + context.containsBeanDefinition("windProtectionIEC-handler"));
    System.out.println(
        "- Contains windTurbineType1or2Dynamics-handler = "
            + context.containsBeanDefinition("windTurbineType1or2Dynamics-handler"));
    System.out.println(
        "- Contains windTurbineType1or2IEC-handler = "
            + context.containsBeanDefinition("windTurbineType1or2IEC-handler"));
    System.out.println(
        "- Contains windTurbineType3or4Dynamics-handler = "
            + context.containsBeanDefinition("windTurbineType3or4Dynamics-handler"));
    System.out.println(
        "- Contains windTurbineType3or4IEC-handler = "
            + context.containsBeanDefinition("windTurbineType3or4IEC-handler"));
    System.out.println(
        "- Contains windTurbineType4aIEC-handler = "
            + context.containsBeanDefinition("windTurbineType4aIEC-handler"));
    System.out.println(
        "- Contains windTurbineType4bIEC-handler = "
            + context.containsBeanDefinition("windTurbineType4bIEC-handler"));
    System.out.println(
        "- Contains windType1or2UserDefined-handler = "
            + context.containsBeanDefinition("windType1or2UserDefined-handler"));
    System.out.println(
        "- Contains windType3or4UserDefined-handler = "
            + context.containsBeanDefinition("windType3or4UserDefined-handler"));
    System.out.println("=================================");
  }
}
