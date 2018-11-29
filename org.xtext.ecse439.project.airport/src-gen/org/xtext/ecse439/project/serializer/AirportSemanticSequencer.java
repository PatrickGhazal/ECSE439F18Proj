/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.ecse439.project.airport.Airline;
import org.xtext.ecse439.project.airport.Airport;
import org.xtext.ecse439.project.airport.AirportPackage;
import org.xtext.ecse439.project.airport.AllAirlines;
import org.xtext.ecse439.project.airport.AllFlights;
import org.xtext.ecse439.project.airport.AllGates;
import org.xtext.ecse439.project.airport.AllRunways;
import org.xtext.ecse439.project.airport.AllTerminals;
import org.xtext.ecse439.project.airport.Date;
import org.xtext.ecse439.project.airport.Domainmodel;
import org.xtext.ecse439.project.airport.FlGate;
import org.xtext.ecse439.project.airport.Flight;
import org.xtext.ecse439.project.airport.Gate;
import org.xtext.ecse439.project.airport.Runway;
import org.xtext.ecse439.project.airport.Schedule;
import org.xtext.ecse439.project.airport.Terminal;
import org.xtext.ecse439.project.airport.Time;
import org.xtext.ecse439.project.services.AirportGrammarAccess;

@SuppressWarnings("all")
public class AirportSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AirportGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AirportPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AirportPackage.AIRLINE:
				sequence_Airline(context, (Airline) semanticObject); 
				return; 
			case AirportPackage.AIRPORT:
				sequence_Airport(context, (Airport) semanticObject); 
				return; 
			case AirportPackage.ALL_AIRLINES:
				sequence_AllAirlines(context, (AllAirlines) semanticObject); 
				return; 
			case AirportPackage.ALL_FLIGHTS:
				sequence_AllFlights(context, (AllFlights) semanticObject); 
				return; 
			case AirportPackage.ALL_GATES:
				sequence_AllGates(context, (AllGates) semanticObject); 
				return; 
			case AirportPackage.ALL_RUNWAYS:
				sequence_AllRunways(context, (AllRunways) semanticObject); 
				return; 
			case AirportPackage.ALL_TERMINALS:
				sequence_AllTerminals(context, (AllTerminals) semanticObject); 
				return; 
			case AirportPackage.DATE:
				sequence_Date(context, (Date) semanticObject); 
				return; 
			case AirportPackage.DOMAINMODEL:
				sequence_Domainmodel(context, (Domainmodel) semanticObject); 
				return; 
			case AirportPackage.FL_GATE:
				sequence_FlGate(context, (FlGate) semanticObject); 
				return; 
			case AirportPackage.FLIGHT:
				sequence_Flight(context, (Flight) semanticObject); 
				return; 
			case AirportPackage.GATE:
				sequence_Gate(context, (Gate) semanticObject); 
				return; 
			case AirportPackage.RUNWAY:
				sequence_Runway(context, (Runway) semanticObject); 
				return; 
			case AirportPackage.SCHEDULE:
				sequence_Schedule(context, (Schedule) semanticObject); 
				return; 
			case AirportPackage.TERMINAL:
				sequence_Terminal(context, (Terminal) semanticObject); 
				return; 
			case AirportPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Airline returns Airline
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Airline(ISerializationContext context, Airline semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.AIRLINE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.AIRLINE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAirlineAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Airport returns Airport
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         schedule=Schedule 
	 *         allRun=AllRunways 
	 *         allGat=AllGates 
	 *         allAir=AllAirlines 
	 *         allFli=AllFlights 
	 *         allTer=AllTerminals
	 *     )
	 */
	protected void sequence_Airport(ISerializationContext context, Airport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.AIRPORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.AIRPORT__NAME));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.AIRPORT__SCHEDULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.AIRPORT__SCHEDULE));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.AIRPORT__ALL_RUN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.AIRPORT__ALL_RUN));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.AIRPORT__ALL_GAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.AIRPORT__ALL_GAT));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.AIRPORT__ALL_AIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.AIRPORT__ALL_AIR));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.AIRPORT__ALL_FLI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.AIRPORT__ALL_FLI));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.AIRPORT__ALL_TER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.AIRPORT__ALL_TER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAirportAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAirportAccess().getScheduleScheduleParserRuleCall_3_0(), semanticObject.getSchedule());
		feeder.accept(grammarAccess.getAirportAccess().getAllRunAllRunwaysParserRuleCall_4_0(), semanticObject.getAllRun());
		feeder.accept(grammarAccess.getAirportAccess().getAllGatAllGatesParserRuleCall_5_0(), semanticObject.getAllGat());
		feeder.accept(grammarAccess.getAirportAccess().getAllAirAllAirlinesParserRuleCall_6_0(), semanticObject.getAllAir());
		feeder.accept(grammarAccess.getAirportAccess().getAllFliAllFlightsParserRuleCall_7_0(), semanticObject.getAllFli());
		feeder.accept(grammarAccess.getAirportAccess().getAllTerAllTerminalsParserRuleCall_8_0(), semanticObject.getAllTer());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AllAirlines returns AllAirlines
	 *
	 * Constraint:
	 *     airline+=Airline+
	 */
	protected void sequence_AllAirlines(ISerializationContext context, AllAirlines semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AllFlights returns AllFlights
	 *
	 * Constraint:
	 *     flights+=Flight+
	 */
	protected void sequence_AllFlights(ISerializationContext context, AllFlights semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AllGates returns AllGates
	 *
	 * Constraint:
	 *     gates+=Gate+
	 */
	protected void sequence_AllGates(ISerializationContext context, AllGates semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AllRunways returns AllRunways
	 *
	 * Constraint:
	 *     runways+=Runway+
	 */
	protected void sequence_AllRunways(ISerializationContext context, AllRunways semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AllTerminals returns AllTerminals
	 *
	 * Constraint:
	 *     terminals+=Terminal+
	 */
	protected void sequence_AllTerminals(ISerializationContext context, AllTerminals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Date returns Date
	 *
	 * Constraint:
	 *     (day=INT month=ID year=INT)
	 */
	protected void sequence_Date(ISerializationContext context, Date semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.DATE__DAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.DATE__DAY));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.DATE__MONTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.DATE__MONTH));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.DATE__YEAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.DATE__YEAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_0_0(), semanticObject.getDay());
		feeder.accept(grammarAccess.getDateAccess().getMonthIDTerminalRuleCall_2_0(), semanticObject.getMonth());
		feeder.accept(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_4_0(), semanticObject.getYear());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Domainmodel returns Domainmodel
	 *
	 * Constraint:
	 *     elements+=Airport
	 */
	protected void sequence_Domainmodel(ISerializationContext context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlGate returns FlGate
	 *
	 * Constraint:
	 *     (flight=[Flight|ID] gate=[Gate|ID] time=Time)
	 */
	protected void sequence_FlGate(ISerializationContext context, FlGate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.FL_GATE__FLIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.FL_GATE__FLIGHT));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.FL_GATE__GATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.FL_GATE__GATE));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.FL_GATE__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.FL_GATE__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlGateAccess().getFlightFlightIDTerminalRuleCall_1_0_1(), semanticObject.getFlight());
		feeder.accept(grammarAccess.getFlGateAccess().getGateGateIDTerminalRuleCall_3_0_1(), semanticObject.getGate());
		feeder.accept(grammarAccess.getFlGateAccess().getTimeTimeParserRuleCall_5_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Flight returns Flight
	 *
	 * Constraint:
	 *     (name=ID time=Time airplaneSize=INT reqRunwayLg=INT)
	 */
	protected void sequence_Flight(ISerializationContext context, Flight semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.FLIGHT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.FLIGHT__NAME));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.FLIGHT__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.FLIGHT__TIME));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.FLIGHT__AIRPLANE_SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.FLIGHT__AIRPLANE_SIZE));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.FLIGHT__REQ_RUNWAY_LG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.FLIGHT__REQ_RUNWAY_LG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlightAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFlightAccess().getTimeTimeParserRuleCall_2_0(), semanticObject.getTime());
		feeder.accept(grammarAccess.getFlightAccess().getAirplaneSizeINTTerminalRuleCall_7_0(), semanticObject.getAirplaneSize());
		feeder.accept(grammarAccess.getFlightAccess().getReqRunwayLgINTTerminalRuleCall_13_0(), semanticObject.getReqRunwayLg());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Gate returns Gate
	 *
	 * Constraint:
	 *     (name=ID maxApSize=INT)
	 */
	protected void sequence_Gate(ISerializationContext context, Gate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.GATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.GATE__NAME));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.GATE__MAX_AP_SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.GATE__MAX_AP_SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGateAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGateAccess().getMaxApSizeINTTerminalRuleCall_7_0(), semanticObject.getMaxApSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Runway returns Runway
	 *
	 * Constraint:
	 *     (name=ID length=INT used=Boolean)
	 */
	protected void sequence_Runway(ISerializationContext context, Runway semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.RUNWAY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.RUNWAY__NAME));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.RUNWAY__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.RUNWAY__LENGTH));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.RUNWAY__USED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.RUNWAY__USED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRunwayAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRunwayAccess().getLengthINTTerminalRuleCall_4_0(), semanticObject.getLength());
		feeder.accept(grammarAccess.getRunwayAccess().getUsedBooleanParserRuleCall_9_0(), semanticObject.getUsed());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Schedule returns Schedule
	 *
	 * Constraint:
	 *     (date=Date flGate+=FlGate*)
	 */
	protected void sequence_Schedule(ISerializationContext context, Schedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Terminal returns Terminal
	 *
	 * Constraint:
	 *     (name=ID runway=[Runway|ID] gates+=[Gate|ID]* airline=[Airline|ID])
	 */
	protected void sequence_Terminal(ISerializationContext context, Terminal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Time returns Time
	 *
	 * Constraint:
	 *     (hour=INT minute=INT)
	 */
	protected void sequence_Time(ISerializationContext context, Time semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.TIME__HOUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.TIME__HOUR));
			if (transientValues.isValueTransient(semanticObject, AirportPackage.Literals.TIME__MINUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AirportPackage.Literals.TIME__MINUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAccess().getHourINTTerminalRuleCall_0_0(), semanticObject.getHour());
		feeder.accept(grammarAccess.getTimeAccess().getMinuteINTTerminalRuleCall_2_0(), semanticObject.getMinute());
		feeder.finish();
	}
	
	
}