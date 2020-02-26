/*
 * generated by Xtext 2.19.0
 */
grammar InternalNavigationRules;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package navi.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package navi.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import navi.services.NavigationRulesGrammarAccess;

}

@parser::members {

 	private NavigationRulesGrammarAccess grammarAccess;

    public InternalNavigationRulesParser(TokenStream input, NavigationRulesGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected NavigationRulesGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='navigation'
		{
			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getNavigationKeyword_0());
		}
		otherlv_1='rules'
		{
			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRulesKeyword_1());
		}
		otherlv_2='for'
		{
			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getForKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getRootAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRootRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getMappingsdefsMappingsParserRuleCall_4_0());
				}
				lv_mappingsdefs_4_0=ruleMappings
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"mappingsdefs",
						lv_mappingsdefs_4_0,
						"navi.NavigationRules.Mappings");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getTransitiondefsTransitionDefinitionsParserRuleCall_5_0());
				}
				lv_transitiondefs_5_0=ruleTransitionDefinitions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"transitiondefs",
						lv_transitiondefs_5_0,
						"navi.NavigationRules.TransitionDefinitions");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getRuledefsNavigationRulesParserRuleCall_6_0());
				}
				lv_ruledefs_6_0=ruleNavigationRules
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"ruledefs",
						lv_ruledefs_6_0,
						"navi.NavigationRules.NavigationRules");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMappings
entryRuleMappings returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMappingsRule()); }
	iv_ruleMappings=ruleMappings
	{ $current=$iv_ruleMappings.current; }
	EOF;

// Rule Mappings
ruleMappings returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='mappings'
		{
			newLeafNode(otherlv_0, grammarAccess.getMappingsAccess().getMappingsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getMappingsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_2_0());
				}
				lv_mappings_2_0=ruleMapping
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMappingsRule());
					}
					add(
						$current,
						"mappings",
						lv_mappings_2_0,
						"navi.NavigationRules.Mapping");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getMappingsAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleMapping
entryRuleMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMappingRule()); }
	iv_ruleMapping=ruleMapping
	{ $current=$iv_ruleMapping.current; }
	EOF;

// Rule Mapping
ruleMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='map'
		{
			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMapKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getMappingAccess().getMappingSpecParserRuleCall_1());
		}
		this_MappingSpec_1=ruleMappingSpec
		{
			$current = $this_MappingSpec_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMappingSpec
entryRuleMappingSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMappingSpecRule()); }
	iv_ruleMappingSpec=ruleMappingSpec
	{ $current=$iv_ruleMappingSpec.current; }
	EOF;

// Rule MappingSpec
ruleMappingSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMappingSpecAccess().getPermissionMappingSpecParserRuleCall_0());
		}
		this_PermissionMappingSpec_0=rulePermissionMappingSpec
		{
			$current = $this_PermissionMappingSpec_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMappingSpecAccess().getCoordinateMappingSpecParserRuleCall_1());
		}
		this_CoordinateMappingSpec_1=ruleCoordinateMappingSpec
		{
			$current = $this_CoordinateMappingSpec_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePermissionMappingSpec
entryRulePermissionMappingSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPermissionMappingSpecRule()); }
	iv_rulePermissionMappingSpec=rulePermissionMappingSpec
	{ $current=$iv_rulePermissionMappingSpec.current; }
	EOF;

// Rule PermissionMappingSpec
rulePermissionMappingSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='permission'
		{
			newLeafNode(otherlv_0, grammarAccess.getPermissionMappingSpecAccess().getPermissionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPermissionMappingSpecAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPermissionMappingSpecRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='to'
		{
			newLeafNode(otherlv_2, grammarAccess.getPermissionMappingSpecAccess().getToKeyword_2());
		}
		(
			(
				lv_value_3_0=RULE_STRING
				{
					newLeafNode(lv_value_3_0, grammarAccess.getPermissionMappingSpecAccess().getValueSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPermissionMappingSpecRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleCoordinateMappingSpec
entryRuleCoordinateMappingSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinateMappingSpecRule()); }
	iv_ruleCoordinateMappingSpec=ruleCoordinateMappingSpec
	{ $current=$iv_ruleCoordinateMappingSpec.current; }
	EOF;

// Rule CoordinateMappingSpec
ruleCoordinateMappingSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='coordinate'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinateMappingSpecAccess().getCoordinateKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCoordinateMappingSpecAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinateMappingSpecRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='to'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinateMappingSpecAccess().getToKeyword_2());
		}
		(
			(
				lv_controllername_3_0=RULE_STRING
				{
					newLeafNode(lv_controllername_3_0, grammarAccess.getCoordinateMappingSpecAccess().getControllernameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinateMappingSpecRule());
					}
					setWithLastConsumed(
						$current,
						"controllername",
						lv_controllername_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='in'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoordinateMappingSpecAccess().getInKeyword_4());
		}
		(
			(
				lv_bundleid_5_0=RULE_STRING
				{
					newLeafNode(lv_bundleid_5_0, grammarAccess.getCoordinateMappingSpecAccess().getBundleidSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinateMappingSpecRule());
					}
					setWithLastConsumed(
						$current,
						"bundleid",
						lv_bundleid_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleTransitionDefinitions
entryRuleTransitionDefinitions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionDefinitionsRule()); }
	iv_ruleTransitionDefinitions=ruleTransitionDefinitions
	{ $current=$iv_ruleTransitionDefinitions.current; }
	EOF;

// Rule TransitionDefinitions
ruleTransitionDefinitions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='navigations'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionDefinitionsAccess().getNavigationsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionDefinitionsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionDefinitionsAccess().getTransitionsTransitionDefinitionParserRuleCall_2_0());
				}
				lv_transitions_2_0=ruleTransitionDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionDefinitionsRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_2_0,
						"navi.NavigationRules.TransitionDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getTransitionDefinitionsAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleTransitionDefinition
entryRuleTransitionDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionDefinitionRule()); }
	iv_ruleTransitionDefinition=ruleTransitionDefinition
	{ $current=$iv_ruleTransitionDefinition.current; }
	EOF;

// Rule TransitionDefinition
ruleTransitionDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='define'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionDefinitionAccess().getDefineKeyword_0());
		}
		otherlv_1='navigation'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionDefinitionAccess().getNavigationKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleNavigationRules
entryRuleNavigationRules returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNavigationRulesRule()); }
	iv_ruleNavigationRules=ruleNavigationRules
	{ $current=$iv_ruleNavigationRules.current; }
	EOF;

// Rule NavigationRules
ruleNavigationRules returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='navrules'
		{
			newLeafNode(otherlv_0, grammarAccess.getNavigationRulesAccess().getNavrulesKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getNavigationRulesAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNavigationRulesAccess().getRulesRuleParserRuleCall_2_0());
				}
				lv_rules_2_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNavigationRulesRule());
					}
					add(
						$current,
						"rules",
						lv_rules_2_0,
						"navi.NavigationRules.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getNavigationRulesAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='from'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getFromKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getDestinationsDestinationParserRuleCall_2_0());
				}
				lv_destinations_2_0=ruleDestination
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"destinations",
						lv_destinations_2_0,
						"navi.NavigationRules.Destination");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleDestination
entryRuleDestination returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDestinationRule()); }
	iv_ruleDestination=ruleDestination
	{ $current=$iv_ruleDestination.current; }
	EOF;

// Rule Destination
ruleDestination returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='on'
		{
			newLeafNode(otherlv_0, grammarAccess.getDestinationAccess().getOnKeyword_0());
		}
		otherlv_1='navigation'
		{
			newLeafNode(otherlv_1, grammarAccess.getDestinationAccess().getNavigationKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDestinationRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionCrossReference_2_0());
				}
			)
		)
		otherlv_3='go'
		{
			newLeafNode(otherlv_3, grammarAccess.getDestinationAccess().getGoKeyword_3());
		}
		otherlv_4='to'
		{
			newLeafNode(otherlv_4, grammarAccess.getDestinationAccess().getToKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDestinationRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecCrossReference_5_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDestinationAccess().getPermissionsPermissionReferenceParserRuleCall_6_0());
				}
				lv_permissions_6_0=rulePermissionReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDestinationRule());
					}
					add(
						$current,
						"permissions",
						lv_permissions_6_0,
						"navi.NavigationRules.PermissionReference");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulePermissionReference
entryRulePermissionReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPermissionReferenceRule()); }
	iv_rulePermissionReference=rulePermissionReference
	{ $current=$iv_rulePermissionReference.current; }
	EOF;

// Rule PermissionReference
rulePermissionReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='with'
		{
			newLeafNode(otherlv_0, grammarAccess.getPermissionReferenceAccess().getWithKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPermissionReferenceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecCrossReference_1_0());
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;