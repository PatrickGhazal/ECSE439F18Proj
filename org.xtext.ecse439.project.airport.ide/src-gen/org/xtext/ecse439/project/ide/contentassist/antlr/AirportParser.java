/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.ecse439.project.ide.contentassist.antlr.internal.InternalAirportParser;
import org.xtext.ecse439.project.services.AirportGrammarAccess;

public class AirportParser extends AbstractContentAssistParser {

	@Inject
	private AirportGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAirportParser createParser() {
		InternalAirportParser result = new InternalAirportParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
					put(grammarAccess.getAirportAccess().getGroup(), "rule__Airport__Group__0");
					put(grammarAccess.getAllTerminalsAccess().getGroup(), "rule__AllTerminals__Group__0");
					put(grammarAccess.getAllRunwaysAccess().getGroup(), "rule__AllRunways__Group__0");
					put(grammarAccess.getAllGatesAccess().getGroup(), "rule__AllGates__Group__0");
					put(grammarAccess.getAllAirlinesAccess().getGroup(), "rule__AllAirlines__Group__0");
					put(grammarAccess.getAllFlightsAccess().getGroup(), "rule__AllFlights__Group__0");
					put(grammarAccess.getScheduleAccess().getGroup(), "rule__Schedule__Group__0");
					put(grammarAccess.getFlightAccess().getGroup(), "rule__Flight__Group__0");
					put(grammarAccess.getFlGateAccess().getGroup(), "rule__FlGate__Group__0");
					put(grammarAccess.getTerminalAccess().getGroup(), "rule__Terminal__Group__0");
					put(grammarAccess.getRunwayAccess().getGroup(), "rule__Runway__Group__0");
					put(grammarAccess.getGateAccess().getGroup(), "rule__Gate__Group__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
					put(grammarAccess.getDomainmodelAccess().getElementsAssignment(), "rule__Domainmodel__ElementsAssignment");
					put(grammarAccess.getAirportAccess().getNameAssignment_1(), "rule__Airport__NameAssignment_1");
					put(grammarAccess.getAirportAccess().getScheduleAssignment_3(), "rule__Airport__ScheduleAssignment_3");
					put(grammarAccess.getAirportAccess().getAllRunAssignment_4(), "rule__Airport__AllRunAssignment_4");
					put(grammarAccess.getAirportAccess().getAllGatAssignment_5(), "rule__Airport__AllGatAssignment_5");
					put(grammarAccess.getAirportAccess().getAllAirAssignment_6(), "rule__Airport__AllAirAssignment_6");
					put(grammarAccess.getAirportAccess().getAllFliAssignment_7(), "rule__Airport__AllFliAssignment_7");
					put(grammarAccess.getAirportAccess().getAllTerAssignment_8(), "rule__Airport__AllTerAssignment_8");
					put(grammarAccess.getAllTerminalsAccess().getTerminalsAssignment_2(), "rule__AllTerminals__TerminalsAssignment_2");
					put(grammarAccess.getAllRunwaysAccess().getRunwaysAssignment_2(), "rule__AllRunways__RunwaysAssignment_2");
					put(grammarAccess.getAllGatesAccess().getGatesAssignment_2(), "rule__AllGates__GatesAssignment_2");
					put(grammarAccess.getAllAirlinesAccess().getAirlineAssignment_2(), "rule__AllAirlines__AirlineAssignment_2");
					put(grammarAccess.getAllFlightsAccess().getFlightsAssignment_2(), "rule__AllFlights__FlightsAssignment_2");
					put(grammarAccess.getScheduleAccess().getDateAssignment_3(), "rule__Schedule__DateAssignment_3");
					put(grammarAccess.getScheduleAccess().getFlGateAssignment_5(), "rule__Schedule__FlGateAssignment_5");
					put(grammarAccess.getFlightAccess().getNameAssignment_0(), "rule__Flight__NameAssignment_0");
					put(grammarAccess.getFlightAccess().getTimeAssignment_2(), "rule__Flight__TimeAssignment_2");
					put(grammarAccess.getFlightAccess().getAirplaneSizeAssignment_7(), "rule__Flight__AirplaneSizeAssignment_7");
					put(grammarAccess.getFlightAccess().getReqRunwayLgAssignment_13(), "rule__Flight__ReqRunwayLgAssignment_13");
					put(grammarAccess.getFlGateAccess().getFlightAssignment_1(), "rule__FlGate__FlightAssignment_1");
					put(grammarAccess.getFlGateAccess().getGateAssignment_3(), "rule__FlGate__GateAssignment_3");
					put(grammarAccess.getFlGateAccess().getTimeAssignment_5(), "rule__FlGate__TimeAssignment_5");
					put(grammarAccess.getTerminalAccess().getNameAssignment_1(), "rule__Terminal__NameAssignment_1");
					put(grammarAccess.getTerminalAccess().getRunwayAssignment_3(), "rule__Terminal__RunwayAssignment_3");
					put(grammarAccess.getTerminalAccess().getGatesAssignment_4(), "rule__Terminal__GatesAssignment_4");
					put(grammarAccess.getTerminalAccess().getAirlineAssignment_5(), "rule__Terminal__AirlineAssignment_5");
					put(grammarAccess.getRunwayAccess().getNameAssignment_0(), "rule__Runway__NameAssignment_0");
					put(grammarAccess.getRunwayAccess().getLengthAssignment_4(), "rule__Runway__LengthAssignment_4");
					put(grammarAccess.getRunwayAccess().getUsedAssignment_9(), "rule__Runway__UsedAssignment_9");
					put(grammarAccess.getGateAccess().getNameAssignment_0(), "rule__Gate__NameAssignment_0");
					put(grammarAccess.getGateAccess().getMaxApSizeAssignment_7(), "rule__Gate__MaxApSizeAssignment_7");
					put(grammarAccess.getAirlineAccess().getNameAssignment(), "rule__Airline__NameAssignment");
					put(grammarAccess.getDateAccess().getDayAssignment_0(), "rule__Date__DayAssignment_0");
					put(grammarAccess.getDateAccess().getMonthAssignment_2(), "rule__Date__MonthAssignment_2");
					put(grammarAccess.getDateAccess().getYearAssignment_4(), "rule__Date__YearAssignment_4");
					put(grammarAccess.getTimeAccess().getHourAssignment_0(), "rule__Time__HourAssignment_0");
					put(grammarAccess.getTimeAccess().getMinuteAssignment_2(), "rule__Time__MinuteAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAirportParser typedParser = (InternalAirportParser) parser;
			typedParser.entryRuleDomainmodel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AirportGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AirportGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
