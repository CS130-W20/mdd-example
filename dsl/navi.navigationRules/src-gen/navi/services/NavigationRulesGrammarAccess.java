/*
 * generated by Xtext 2.19.0
 */
package navi.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class NavigationRulesGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.Root");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNavigationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cRulesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cForKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cMappingsdefsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMappingsdefsMappingsParserRuleCall_4_0 = (RuleCall)cMappingsdefsAssignment_4.eContents().get(0);
		private final Assignment cTransitiondefsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTransitiondefsTransitionDefinitionsParserRuleCall_5_0 = (RuleCall)cTransitiondefsAssignment_5.eContents().get(0);
		private final Assignment cRuledefsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cRuledefsNavigationRulesParserRuleCall_6_0 = (RuleCall)cRuledefsAssignment_6.eContents().get(0);
		
		//Root:
		//	'navigation' 'rules' 'for' name=ID
		//	mappingsdefs=Mappings
		//	transitiondefs=TransitionDefinitions
		//	ruledefs=NavigationRules;
		@Override public ParserRule getRule() { return rule; }
		
		//'navigation' 'rules' 'for' name=ID mappingsdefs=Mappings transitiondefs=TransitionDefinitions ruledefs=NavigationRules
		public Group getGroup() { return cGroup; }
		
		//'navigation'
		public Keyword getNavigationKeyword_0() { return cNavigationKeyword_0; }
		
		//'rules'
		public Keyword getRulesKeyword_1() { return cRulesKeyword_1; }
		
		//'for'
		public Keyword getForKeyword_2() { return cForKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//mappingsdefs=Mappings
		public Assignment getMappingsdefsAssignment_4() { return cMappingsdefsAssignment_4; }
		
		//Mappings
		public RuleCall getMappingsdefsMappingsParserRuleCall_4_0() { return cMappingsdefsMappingsParserRuleCall_4_0; }
		
		//transitiondefs=TransitionDefinitions
		public Assignment getTransitiondefsAssignment_5() { return cTransitiondefsAssignment_5; }
		
		//TransitionDefinitions
		public RuleCall getTransitiondefsTransitionDefinitionsParserRuleCall_5_0() { return cTransitiondefsTransitionDefinitionsParserRuleCall_5_0; }
		
		//ruledefs=NavigationRules
		public Assignment getRuledefsAssignment_6() { return cRuledefsAssignment_6; }
		
		//NavigationRules
		public RuleCall getRuledefsNavigationRulesParserRuleCall_6_0() { return cRuledefsNavigationRulesParserRuleCall_6_0; }
	}
	public class MappingsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.Mappings");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMappingsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMappingsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMappingsMappingParserRuleCall_2_0 = (RuleCall)cMappingsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Mappings:
		//	'mappings' '{'
		//	mappings+=Mapping+
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'mappings' '{' mappings+=Mapping+ '}'
		public Group getGroup() { return cGroup; }
		
		//'mappings'
		public Keyword getMappingsKeyword_0() { return cMappingsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//mappings+=Mapping+
		public Assignment getMappingsAssignment_2() { return cMappingsAssignment_2; }
		
		//Mapping
		public RuleCall getMappingsMappingParserRuleCall_2_0() { return cMappingsMappingParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class MappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.Mapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMapKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cMappingSpecParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Mapping:
		//	'map' MappingSpec;
		@Override public ParserRule getRule() { return rule; }
		
		//'map' MappingSpec
		public Group getGroup() { return cGroup; }
		
		//'map'
		public Keyword getMapKeyword_0() { return cMapKeyword_0; }
		
		//MappingSpec
		public RuleCall getMappingSpecParserRuleCall_1() { return cMappingSpecParserRuleCall_1; }
	}
	public class MappingSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.MappingSpec");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPermissionMappingSpecParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCoordinateMappingSpecParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MappingSpec:
		//	PermissionMappingSpec | CoordinateMappingSpec;
		@Override public ParserRule getRule() { return rule; }
		
		//PermissionMappingSpec | CoordinateMappingSpec
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PermissionMappingSpec
		public RuleCall getPermissionMappingSpecParserRuleCall_0() { return cPermissionMappingSpecParserRuleCall_0; }
		
		//CoordinateMappingSpec
		public RuleCall getCoordinateMappingSpecParserRuleCall_1() { return cCoordinateMappingSpecParserRuleCall_1; }
	}
	public class PermissionMappingSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.PermissionMappingSpec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPermissionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//PermissionMappingSpec:
		//	'permission' name=ID 'to' value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'permission' name=ID 'to' value=STRING
		public Group getGroup() { return cGroup; }
		
		//'permission'
		public Keyword getPermissionKeyword_0() { return cPermissionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//value=STRING
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0() { return cValueSTRINGTerminalRuleCall_3_0; }
	}
	public class CoordinateMappingSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.CoordinateMappingSpec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoordinateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cControllernameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cControllernameSTRINGTerminalRuleCall_3_0 = (RuleCall)cControllernameAssignment_3.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBundleidAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBundleidSTRINGTerminalRuleCall_5_0 = (RuleCall)cBundleidAssignment_5.eContents().get(0);
		
		//CoordinateMappingSpec:
		//	'coordinate' name=ID 'to' controllername=STRING 'in' bundleid=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'coordinate' name=ID 'to' controllername=STRING 'in' bundleid=STRING
		public Group getGroup() { return cGroup; }
		
		//'coordinate'
		public Keyword getCoordinateKeyword_0() { return cCoordinateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//controllername=STRING
		public Assignment getControllernameAssignment_3() { return cControllernameAssignment_3; }
		
		//STRING
		public RuleCall getControllernameSTRINGTerminalRuleCall_3_0() { return cControllernameSTRINGTerminalRuleCall_3_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//bundleid=STRING
		public Assignment getBundleidAssignment_5() { return cBundleidAssignment_5; }
		
		//STRING
		public RuleCall getBundleidSTRINGTerminalRuleCall_5_0() { return cBundleidSTRINGTerminalRuleCall_5_0; }
	}
	public class TransitionDefinitionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.TransitionDefinitions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNavigationsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTransitionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTransitionsTransitionDefinitionParserRuleCall_2_0 = (RuleCall)cTransitionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TransitionDefinitions:
		//	'navigations' '{'
		//	transitions+=TransitionDefinition+
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'navigations' '{' transitions+=TransitionDefinition+ '}'
		public Group getGroup() { return cGroup; }
		
		//'navigations'
		public Keyword getNavigationsKeyword_0() { return cNavigationsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//transitions+=TransitionDefinition+
		public Assignment getTransitionsAssignment_2() { return cTransitionsAssignment_2; }
		
		//TransitionDefinition
		public RuleCall getTransitionsTransitionDefinitionParserRuleCall_2_0() { return cTransitionsTransitionDefinitionParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class TransitionDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.TransitionDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNavigationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//TransitionDefinition:
		//	'define' 'navigation' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'define' 'navigation' name=ID
		public Group getGroup() { return cGroup; }
		
		//'define'
		public Keyword getDefineKeyword_0() { return cDefineKeyword_0; }
		
		//'navigation'
		public Keyword getNavigationKeyword_1() { return cNavigationKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class NavigationRulesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.NavigationRules");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNavrulesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRulesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRulesRuleParserRuleCall_2_0 = (RuleCall)cRulesAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//NavigationRules:
		//	'navrules' '{'
		//	rules+=Rule+
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'navrules' '{' rules+=Rule+ '}'
		public Group getGroup() { return cGroup; }
		
		//'navrules'
		public Keyword getNavrulesKeyword_0() { return cNavrulesKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//rules+=Rule+
		public Assignment getRulesAssignment_2() { return cRulesAssignment_2; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_2_0() { return cRulesRuleParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFromKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSourceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSourceCoordinateMappingSpecCrossReference_1_0 = (CrossReference)cSourceAssignment_1.eContents().get(0);
		private final RuleCall cSourceCoordinateMappingSpecIDTerminalRuleCall_1_0_1 = (RuleCall)cSourceCoordinateMappingSpecCrossReference_1_0.eContents().get(1);
		private final Assignment cDestinationsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDestinationsDestinationParserRuleCall_2_0 = (RuleCall)cDestinationsAssignment_2.eContents().get(0);
		
		//Rule:
		//	'from' source=[CoordinateMappingSpec] destinations+=Destination+;
		@Override public ParserRule getRule() { return rule; }
		
		//'from' source=[CoordinateMappingSpec] destinations+=Destination+
		public Group getGroup() { return cGroup; }
		
		//'from'
		public Keyword getFromKeyword_0() { return cFromKeyword_0; }
		
		//source=[CoordinateMappingSpec]
		public Assignment getSourceAssignment_1() { return cSourceAssignment_1; }
		
		//[CoordinateMappingSpec]
		public CrossReference getSourceCoordinateMappingSpecCrossReference_1_0() { return cSourceCoordinateMappingSpecCrossReference_1_0; }
		
		//ID
		public RuleCall getSourceCoordinateMappingSpecIDTerminalRuleCall_1_0_1() { return cSourceCoordinateMappingSpecIDTerminalRuleCall_1_0_1; }
		
		//destinations+=Destination+
		public Assignment getDestinationsAssignment_2() { return cDestinationsAssignment_2; }
		
		//Destination
		public RuleCall getDestinationsDestinationParserRuleCall_2_0() { return cDestinationsDestinationParserRuleCall_2_0; }
	}
	public class DestinationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.Destination");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNavigationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTransitionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTransitionTransitionDefinitionCrossReference_2_0 = (CrossReference)cTransitionAssignment_2.eContents().get(0);
		private final RuleCall cTransitionTransitionDefinitionIDTerminalRuleCall_2_0_1 = (RuleCall)cTransitionTransitionDefinitionCrossReference_2_0.eContents().get(1);
		private final Keyword cGoKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTargetAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cTargetCoordinateMappingSpecCrossReference_5_0 = (CrossReference)cTargetAssignment_5.eContents().get(0);
		private final RuleCall cTargetCoordinateMappingSpecIDTerminalRuleCall_5_0_1 = (RuleCall)cTargetCoordinateMappingSpecCrossReference_5_0.eContents().get(1);
		private final Assignment cPermissionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cPermissionsPermissionReferenceParserRuleCall_6_0 = (RuleCall)cPermissionsAssignment_6.eContents().get(0);
		
		//Destination:
		//	'on' 'navigation' transition=[TransitionDefinition]
		//	'go' 'to' target=[CoordinateMappingSpec] permissions+=PermissionReference*;
		@Override public ParserRule getRule() { return rule; }
		
		//'on' 'navigation' transition=[TransitionDefinition] 'go' 'to' target=[CoordinateMappingSpec]
		//permissions+=PermissionReference*
		public Group getGroup() { return cGroup; }
		
		//'on'
		public Keyword getOnKeyword_0() { return cOnKeyword_0; }
		
		//'navigation'
		public Keyword getNavigationKeyword_1() { return cNavigationKeyword_1; }
		
		//transition=[TransitionDefinition]
		public Assignment getTransitionAssignment_2() { return cTransitionAssignment_2; }
		
		//[TransitionDefinition]
		public CrossReference getTransitionTransitionDefinitionCrossReference_2_0() { return cTransitionTransitionDefinitionCrossReference_2_0; }
		
		//ID
		public RuleCall getTransitionTransitionDefinitionIDTerminalRuleCall_2_0_1() { return cTransitionTransitionDefinitionIDTerminalRuleCall_2_0_1; }
		
		//'go'
		public Keyword getGoKeyword_3() { return cGoKeyword_3; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//target=[CoordinateMappingSpec]
		public Assignment getTargetAssignment_5() { return cTargetAssignment_5; }
		
		//[CoordinateMappingSpec]
		public CrossReference getTargetCoordinateMappingSpecCrossReference_5_0() { return cTargetCoordinateMappingSpecCrossReference_5_0; }
		
		//ID
		public RuleCall getTargetCoordinateMappingSpecIDTerminalRuleCall_5_0_1() { return cTargetCoordinateMappingSpecIDTerminalRuleCall_5_0_1; }
		
		//permissions+=PermissionReference*
		public Assignment getPermissionsAssignment_6() { return cPermissionsAssignment_6; }
		
		//PermissionReference
		public RuleCall getPermissionsPermissionReferenceParserRuleCall_6_0() { return cPermissionsPermissionReferenceParserRuleCall_6_0; }
	}
	public class PermissionReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "navi.NavigationRules.PermissionReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPermissionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPermissionPermissionMappingSpecCrossReference_1_0 = (CrossReference)cPermissionAssignment_1.eContents().get(0);
		private final RuleCall cPermissionPermissionMappingSpecIDTerminalRuleCall_1_0_1 = (RuleCall)cPermissionPermissionMappingSpecCrossReference_1_0.eContents().get(1);
		
		//PermissionReference:
		//	'with' permission=[PermissionMappingSpec];
		@Override public ParserRule getRule() { return rule; }
		
		//'with' permission=[PermissionMappingSpec]
		public Group getGroup() { return cGroup; }
		
		//'with'
		public Keyword getWithKeyword_0() { return cWithKeyword_0; }
		
		//permission=[PermissionMappingSpec]
		public Assignment getPermissionAssignment_1() { return cPermissionAssignment_1; }
		
		//[PermissionMappingSpec]
		public CrossReference getPermissionPermissionMappingSpecCrossReference_1_0() { return cPermissionPermissionMappingSpecCrossReference_1_0; }
		
		//ID
		public RuleCall getPermissionPermissionMappingSpecIDTerminalRuleCall_1_0_1() { return cPermissionPermissionMappingSpecIDTerminalRuleCall_1_0_1; }
	}
	
	
	private final RootElements pRoot;
	private final MappingsElements pMappings;
	private final MappingElements pMapping;
	private final MappingSpecElements pMappingSpec;
	private final PermissionMappingSpecElements pPermissionMappingSpec;
	private final CoordinateMappingSpecElements pCoordinateMappingSpec;
	private final TransitionDefinitionsElements pTransitionDefinitions;
	private final TransitionDefinitionElements pTransitionDefinition;
	private final NavigationRulesElements pNavigationRules;
	private final RuleElements pRule;
	private final DestinationElements pDestination;
	private final PermissionReferenceElements pPermissionReference;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public NavigationRulesGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pMappings = new MappingsElements();
		this.pMapping = new MappingElements();
		this.pMappingSpec = new MappingSpecElements();
		this.pPermissionMappingSpec = new PermissionMappingSpecElements();
		this.pCoordinateMappingSpec = new CoordinateMappingSpecElements();
		this.pTransitionDefinitions = new TransitionDefinitionsElements();
		this.pTransitionDefinition = new TransitionDefinitionElements();
		this.pNavigationRules = new NavigationRulesElements();
		this.pRule = new RuleElements();
		this.pDestination = new DestinationElements();
		this.pPermissionReference = new PermissionReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("navi.NavigationRules".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Root:
	//	'navigation' 'rules' 'for' name=ID
	//	mappingsdefs=Mappings
	//	transitiondefs=TransitionDefinitions
	//	ruledefs=NavigationRules;
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//Mappings:
	//	'mappings' '{'
	//	mappings+=Mapping+
	//	'}';
	public MappingsElements getMappingsAccess() {
		return pMappings;
	}
	
	public ParserRule getMappingsRule() {
		return getMappingsAccess().getRule();
	}
	
	//Mapping:
	//	'map' MappingSpec;
	public MappingElements getMappingAccess() {
		return pMapping;
	}
	
	public ParserRule getMappingRule() {
		return getMappingAccess().getRule();
	}
	
	//MappingSpec:
	//	PermissionMappingSpec | CoordinateMappingSpec;
	public MappingSpecElements getMappingSpecAccess() {
		return pMappingSpec;
	}
	
	public ParserRule getMappingSpecRule() {
		return getMappingSpecAccess().getRule();
	}
	
	//PermissionMappingSpec:
	//	'permission' name=ID 'to' value=STRING;
	public PermissionMappingSpecElements getPermissionMappingSpecAccess() {
		return pPermissionMappingSpec;
	}
	
	public ParserRule getPermissionMappingSpecRule() {
		return getPermissionMappingSpecAccess().getRule();
	}
	
	//CoordinateMappingSpec:
	//	'coordinate' name=ID 'to' controllername=STRING 'in' bundleid=STRING;
	public CoordinateMappingSpecElements getCoordinateMappingSpecAccess() {
		return pCoordinateMappingSpec;
	}
	
	public ParserRule getCoordinateMappingSpecRule() {
		return getCoordinateMappingSpecAccess().getRule();
	}
	
	//TransitionDefinitions:
	//	'navigations' '{'
	//	transitions+=TransitionDefinition+
	//	'}';
	public TransitionDefinitionsElements getTransitionDefinitionsAccess() {
		return pTransitionDefinitions;
	}
	
	public ParserRule getTransitionDefinitionsRule() {
		return getTransitionDefinitionsAccess().getRule();
	}
	
	//TransitionDefinition:
	//	'define' 'navigation' name=ID;
	public TransitionDefinitionElements getTransitionDefinitionAccess() {
		return pTransitionDefinition;
	}
	
	public ParserRule getTransitionDefinitionRule() {
		return getTransitionDefinitionAccess().getRule();
	}
	
	//NavigationRules:
	//	'navrules' '{'
	//	rules+=Rule+
	//	'}';
	public NavigationRulesElements getNavigationRulesAccess() {
		return pNavigationRules;
	}
	
	public ParserRule getNavigationRulesRule() {
		return getNavigationRulesAccess().getRule();
	}
	
	//Rule:
	//	'from' source=[CoordinateMappingSpec] destinations+=Destination+;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//Destination:
	//	'on' 'navigation' transition=[TransitionDefinition]
	//	'go' 'to' target=[CoordinateMappingSpec] permissions+=PermissionReference*;
	public DestinationElements getDestinationAccess() {
		return pDestination;
	}
	
	public ParserRule getDestinationRule() {
		return getDestinationAccess().getRule();
	}
	
	//PermissionReference:
	//	'with' permission=[PermissionMappingSpec];
	public PermissionReferenceElements getPermissionReferenceAccess() {
		return pPermissionReference;
	}
	
	public ParserRule getPermissionReferenceRule() {
		return getPermissionReferenceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
