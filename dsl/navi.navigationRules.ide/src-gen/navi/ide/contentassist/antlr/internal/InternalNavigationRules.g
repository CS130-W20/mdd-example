/*
 * generated by Xtext 2.19.0
 */
grammar InternalNavigationRules;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package navi.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package navi.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import navi.services.NavigationRulesGrammarAccess;

}
@parser::members {
	private NavigationRulesGrammarAccess grammarAccess;

	public void setGrammarAccess(NavigationRulesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleRoot
entryRuleRoot
:
{ before(grammarAccess.getRootRule()); }
	 ruleRoot
{ after(grammarAccess.getRootRule()); } 
	 EOF 
;

// Rule Root
ruleRoot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRootAccess().getGroup()); }
		(rule__Root__Group__0)
		{ after(grammarAccess.getRootAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMappings
entryRuleMappings
:
{ before(grammarAccess.getMappingsRule()); }
	 ruleMappings
{ after(grammarAccess.getMappingsRule()); } 
	 EOF 
;

// Rule Mappings
ruleMappings 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMappingsAccess().getGroup()); }
		(rule__Mappings__Group__0)
		{ after(grammarAccess.getMappingsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMapping
entryRuleMapping
:
{ before(grammarAccess.getMappingRule()); }
	 ruleMapping
{ after(grammarAccess.getMappingRule()); } 
	 EOF 
;

// Rule Mapping
ruleMapping 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMappingAccess().getGroup()); }
		(rule__Mapping__Group__0)
		{ after(grammarAccess.getMappingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMappingSpec
entryRuleMappingSpec
:
{ before(grammarAccess.getMappingSpecRule()); }
	 ruleMappingSpec
{ after(grammarAccess.getMappingSpecRule()); } 
	 EOF 
;

// Rule MappingSpec
ruleMappingSpec 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMappingSpecAccess().getAlternatives()); }
		(rule__MappingSpec__Alternatives)
		{ after(grammarAccess.getMappingSpecAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePermissionMappingSpec
entryRulePermissionMappingSpec
:
{ before(grammarAccess.getPermissionMappingSpecRule()); }
	 rulePermissionMappingSpec
{ after(grammarAccess.getPermissionMappingSpecRule()); } 
	 EOF 
;

// Rule PermissionMappingSpec
rulePermissionMappingSpec 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPermissionMappingSpecAccess().getGroup()); }
		(rule__PermissionMappingSpec__Group__0)
		{ after(grammarAccess.getPermissionMappingSpecAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinateMappingSpec
entryRuleCoordinateMappingSpec
:
{ before(grammarAccess.getCoordinateMappingSpecRule()); }
	 ruleCoordinateMappingSpec
{ after(grammarAccess.getCoordinateMappingSpecRule()); } 
	 EOF 
;

// Rule CoordinateMappingSpec
ruleCoordinateMappingSpec 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinateMappingSpecAccess().getGroup()); }
		(rule__CoordinateMappingSpec__Group__0)
		{ after(grammarAccess.getCoordinateMappingSpecAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransitionDefinitions
entryRuleTransitionDefinitions
:
{ before(grammarAccess.getTransitionDefinitionsRule()); }
	 ruleTransitionDefinitions
{ after(grammarAccess.getTransitionDefinitionsRule()); } 
	 EOF 
;

// Rule TransitionDefinitions
ruleTransitionDefinitions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionDefinitionsAccess().getGroup()); }
		(rule__TransitionDefinitions__Group__0)
		{ after(grammarAccess.getTransitionDefinitionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransitionDefinition
entryRuleTransitionDefinition
:
{ before(grammarAccess.getTransitionDefinitionRule()); }
	 ruleTransitionDefinition
{ after(grammarAccess.getTransitionDefinitionRule()); } 
	 EOF 
;

// Rule TransitionDefinition
ruleTransitionDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionDefinitionAccess().getGroup()); }
		(rule__TransitionDefinition__Group__0)
		{ after(grammarAccess.getTransitionDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNavigationRules
entryRuleNavigationRules
:
{ before(grammarAccess.getNavigationRulesRule()); }
	 ruleNavigationRules
{ after(grammarAccess.getNavigationRulesRule()); } 
	 EOF 
;

// Rule NavigationRules
ruleNavigationRules 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNavigationRulesAccess().getGroup()); }
		(rule__NavigationRules__Group__0)
		{ after(grammarAccess.getNavigationRulesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRule
entryRuleRule
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleAccess().getGroup()); }
		(rule__Rule__Group__0)
		{ after(grammarAccess.getRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDestination
entryRuleDestination
:
{ before(grammarAccess.getDestinationRule()); }
	 ruleDestination
{ after(grammarAccess.getDestinationRule()); } 
	 EOF 
;

// Rule Destination
ruleDestination 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDestinationAccess().getGroup()); }
		(rule__Destination__Group__0)
		{ after(grammarAccess.getDestinationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePermissionReference
entryRulePermissionReference
:
{ before(grammarAccess.getPermissionReferenceRule()); }
	 rulePermissionReference
{ after(grammarAccess.getPermissionReferenceRule()); } 
	 EOF 
;

// Rule PermissionReference
rulePermissionReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPermissionReferenceAccess().getGroup()); }
		(rule__PermissionReference__Group__0)
		{ after(grammarAccess.getPermissionReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MappingSpec__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMappingSpecAccess().getPermissionMappingSpecParserRuleCall_0()); }
		rulePermissionMappingSpec
		{ after(grammarAccess.getMappingSpecAccess().getPermissionMappingSpecParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMappingSpecAccess().getCoordinateMappingSpecParserRuleCall_1()); }
		ruleCoordinateMappingSpec
		{ after(grammarAccess.getMappingSpecAccess().getCoordinateMappingSpecParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__0__Impl
	rule__Root__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getNavigationKeyword_0()); }
	'navigation'
	{ after(grammarAccess.getRootAccess().getNavigationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__1__Impl
	rule__Root__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getRulesKeyword_1()); }
	'rules'
	{ after(grammarAccess.getRootAccess().getRulesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__2__Impl
	rule__Root__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getForKeyword_2()); }
	'for'
	{ after(grammarAccess.getRootAccess().getForKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__3__Impl
	rule__Root__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getNameAssignment_3()); }
	(rule__Root__NameAssignment_3)
	{ after(grammarAccess.getRootAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__4__Impl
	rule__Root__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getMappingsdefsAssignment_4()); }
	(rule__Root__MappingsdefsAssignment_4)
	{ after(grammarAccess.getRootAccess().getMappingsdefsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__5__Impl
	rule__Root__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getTransitiondefsAssignment_5()); }
	(rule__Root__TransitiondefsAssignment_5)
	{ after(grammarAccess.getRootAccess().getTransitiondefsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Root__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootAccess().getRuledefsAssignment_6()); }
	(rule__Root__RuledefsAssignment_6)
	{ after(grammarAccess.getRootAccess().getRuledefsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mappings__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mappings__Group__0__Impl
	rule__Mappings__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mappings__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMappingsAccess().getMappingsKeyword_0()); }
	'mappings'
	{ after(grammarAccess.getMappingsAccess().getMappingsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mappings__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mappings__Group__1__Impl
	rule__Mappings__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mappings__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMappingsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getMappingsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mappings__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mappings__Group__2__Impl
	rule__Mappings__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mappings__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getMappingsAccess().getMappingsAssignment_2()); }
		(rule__Mappings__MappingsAssignment_2)
		{ after(grammarAccess.getMappingsAccess().getMappingsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getMappingsAccess().getMappingsAssignment_2()); }
		(rule__Mappings__MappingsAssignment_2)*
		{ after(grammarAccess.getMappingsAccess().getMappingsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mappings__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mappings__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mappings__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMappingsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getMappingsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mapping__Group__0__Impl
	rule__Mapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMappingAccess().getMapKeyword_0()); }
	'map'
	{ after(grammarAccess.getMappingAccess().getMapKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mapping__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMappingAccess().getMappingSpecParserRuleCall_1()); }
	ruleMappingSpec
	{ after(grammarAccess.getMappingAccess().getMappingSpecParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PermissionMappingSpec__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PermissionMappingSpec__Group__0__Impl
	rule__PermissionMappingSpec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionMappingSpec__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPermissionMappingSpecAccess().getPermissionKeyword_0()); }
	'permission'
	{ after(grammarAccess.getPermissionMappingSpecAccess().getPermissionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionMappingSpec__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PermissionMappingSpec__Group__1__Impl
	rule__PermissionMappingSpec__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionMappingSpec__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPermissionMappingSpecAccess().getNameAssignment_1()); }
	(rule__PermissionMappingSpec__NameAssignment_1)
	{ after(grammarAccess.getPermissionMappingSpecAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionMappingSpec__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PermissionMappingSpec__Group__2__Impl
	rule__PermissionMappingSpec__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionMappingSpec__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPermissionMappingSpecAccess().getToKeyword_2()); }
	'to'
	{ after(grammarAccess.getPermissionMappingSpecAccess().getToKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionMappingSpec__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PermissionMappingSpec__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionMappingSpec__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPermissionMappingSpecAccess().getValueAssignment_3()); }
	(rule__PermissionMappingSpec__ValueAssignment_3)
	{ after(grammarAccess.getPermissionMappingSpecAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinateMappingSpec__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinateMappingSpec__Group__0__Impl
	rule__CoordinateMappingSpec__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateMappingSpecAccess().getCoordinateKeyword_0()); }
	'coordinate'
	{ after(grammarAccess.getCoordinateMappingSpecAccess().getCoordinateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinateMappingSpec__Group__1__Impl
	rule__CoordinateMappingSpec__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateMappingSpecAccess().getNameAssignment_1()); }
	(rule__CoordinateMappingSpec__NameAssignment_1)
	{ after(grammarAccess.getCoordinateMappingSpecAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinateMappingSpec__Group__2__Impl
	rule__CoordinateMappingSpec__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateMappingSpecAccess().getToKeyword_2()); }
	'to'
	{ after(grammarAccess.getCoordinateMappingSpecAccess().getToKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinateMappingSpec__Group__3__Impl
	rule__CoordinateMappingSpec__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateMappingSpecAccess().getControllernameAssignment_3()); }
	(rule__CoordinateMappingSpec__ControllernameAssignment_3)
	{ after(grammarAccess.getCoordinateMappingSpecAccess().getControllernameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinateMappingSpec__Group__4__Impl
	rule__CoordinateMappingSpec__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateMappingSpecAccess().getInKeyword_4()); }
	'in'
	{ after(grammarAccess.getCoordinateMappingSpecAccess().getInKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinateMappingSpec__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinateMappingSpecAccess().getBundleidAssignment_5()); }
	(rule__CoordinateMappingSpec__BundleidAssignment_5)
	{ after(grammarAccess.getCoordinateMappingSpecAccess().getBundleidAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TransitionDefinitions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransitionDefinitions__Group__0__Impl
	rule__TransitionDefinitions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinitions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionDefinitionsAccess().getNavigationsKeyword_0()); }
	'navigations'
	{ after(grammarAccess.getTransitionDefinitionsAccess().getNavigationsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinitions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransitionDefinitions__Group__1__Impl
	rule__TransitionDefinitions__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinitions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionDefinitionsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTransitionDefinitionsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinitions__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransitionDefinitions__Group__2__Impl
	rule__TransitionDefinitions__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinitions__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTransitionDefinitionsAccess().getTransitionsAssignment_2()); }
		(rule__TransitionDefinitions__TransitionsAssignment_2)
		{ after(grammarAccess.getTransitionDefinitionsAccess().getTransitionsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getTransitionDefinitionsAccess().getTransitionsAssignment_2()); }
		(rule__TransitionDefinitions__TransitionsAssignment_2)*
		{ after(grammarAccess.getTransitionDefinitionsAccess().getTransitionsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinitions__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransitionDefinitions__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinitions__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionDefinitionsAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getTransitionDefinitionsAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TransitionDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransitionDefinition__Group__0__Impl
	rule__TransitionDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionDefinitionAccess().getDefineKeyword_0()); }
	'define'
	{ after(grammarAccess.getTransitionDefinitionAccess().getDefineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransitionDefinition__Group__1__Impl
	rule__TransitionDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionDefinitionAccess().getNavigationKeyword_1()); }
	'navigation'
	{ after(grammarAccess.getTransitionDefinitionAccess().getNavigationKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransitionDefinition__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionDefinitionAccess().getNameAssignment_2()); }
	(rule__TransitionDefinition__NameAssignment_2)
	{ after(grammarAccess.getTransitionDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NavigationRules__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NavigationRules__Group__0__Impl
	rule__NavigationRules__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NavigationRules__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNavigationRulesAccess().getNavrulesKeyword_0()); }
	'navrules'
	{ after(grammarAccess.getNavigationRulesAccess().getNavrulesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NavigationRules__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NavigationRules__Group__1__Impl
	rule__NavigationRules__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NavigationRules__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNavigationRulesAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getNavigationRulesAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NavigationRules__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NavigationRules__Group__2__Impl
	rule__NavigationRules__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NavigationRules__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNavigationRulesAccess().getRulesAssignment_2()); }
		(rule__NavigationRules__RulesAssignment_2)
		{ after(grammarAccess.getNavigationRulesAccess().getRulesAssignment_2()); }
	)
	(
		{ before(grammarAccess.getNavigationRulesAccess().getRulesAssignment_2()); }
		(rule__NavigationRules__RulesAssignment_2)*
		{ after(grammarAccess.getNavigationRulesAccess().getRulesAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NavigationRules__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NavigationRules__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NavigationRules__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNavigationRulesAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getNavigationRulesAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getFromKeyword_0()); }
	'from'
	{ after(grammarAccess.getRuleAccess().getFromKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getSourceAssignment_1()); }
	(rule__Rule__SourceAssignment_1)
	{ after(grammarAccess.getRuleAccess().getSourceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRuleAccess().getDestinationsAssignment_2()); }
		(rule__Rule__DestinationsAssignment_2)
		{ after(grammarAccess.getRuleAccess().getDestinationsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getRuleAccess().getDestinationsAssignment_2()); }
		(rule__Rule__DestinationsAssignment_2)*
		{ after(grammarAccess.getRuleAccess().getDestinationsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Destination__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__0__Impl
	rule__Destination__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getOnKeyword_0()); }
	'on'
	{ after(grammarAccess.getDestinationAccess().getOnKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__1__Impl
	rule__Destination__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getNavigationKeyword_1()); }
	'navigation'
	{ after(grammarAccess.getDestinationAccess().getNavigationKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__2__Impl
	rule__Destination__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getTransitionAssignment_2()); }
	(rule__Destination__TransitionAssignment_2)
	{ after(grammarAccess.getDestinationAccess().getTransitionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__3__Impl
	rule__Destination__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getGoKeyword_3()); }
	'go'
	{ after(grammarAccess.getDestinationAccess().getGoKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__4__Impl
	rule__Destination__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getToKeyword_4()); }
	'to'
	{ after(grammarAccess.getDestinationAccess().getToKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__5__Impl
	rule__Destination__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getTargetAssignment_5()); }
	(rule__Destination__TargetAssignment_5)
	{ after(grammarAccess.getDestinationAccess().getTargetAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getPermissionsAssignment_6()); }
	(rule__Destination__PermissionsAssignment_6)*
	{ after(grammarAccess.getDestinationAccess().getPermissionsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PermissionReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PermissionReference__Group__0__Impl
	rule__PermissionReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPermissionReferenceAccess().getWithKeyword_0()); }
	'with'
	{ after(grammarAccess.getPermissionReferenceAccess().getWithKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PermissionReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPermissionReferenceAccess().getPermissionAssignment_1()); }
	(rule__PermissionReference__PermissionAssignment_1)
	{ after(grammarAccess.getPermissionReferenceAccess().getPermissionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Root__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__MappingsdefsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootAccess().getMappingsdefsMappingsParserRuleCall_4_0()); }
		ruleMappings
		{ after(grammarAccess.getRootAccess().getMappingsdefsMappingsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__TransitiondefsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootAccess().getTransitiondefsTransitionDefinitionsParserRuleCall_5_0()); }
		ruleTransitionDefinitions
		{ after(grammarAccess.getRootAccess().getTransitiondefsTransitionDefinitionsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Root__RuledefsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootAccess().getRuledefsNavigationRulesParserRuleCall_6_0()); }
		ruleNavigationRules
		{ after(grammarAccess.getRootAccess().getRuledefsNavigationRulesParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mappings__MappingsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_2_0()); }
		ruleMapping
		{ after(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionMappingSpec__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPermissionMappingSpecAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPermissionMappingSpecAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionMappingSpec__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPermissionMappingSpecAccess().getValueSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getPermissionMappingSpecAccess().getValueSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinateMappingSpecAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCoordinateMappingSpecAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__ControllernameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinateMappingSpecAccess().getControllernameSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getCoordinateMappingSpecAccess().getControllernameSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinateMappingSpec__BundleidAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinateMappingSpecAccess().getBundleidSTRINGTerminalRuleCall_5_0()); }
		RULE_STRING
		{ after(grammarAccess.getCoordinateMappingSpecAccess().getBundleidSTRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinitions__TransitionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionDefinitionsAccess().getTransitionsTransitionDefinitionParserRuleCall_2_0()); }
		ruleTransitionDefinition
		{ after(grammarAccess.getTransitionDefinitionsAccess().getTransitionsTransitionDefinitionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransitionDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NavigationRules__RulesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNavigationRulesAccess().getRulesRuleParserRuleCall_2_0()); }
		ruleRule
		{ after(grammarAccess.getNavigationRulesAccess().getRulesRuleParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__SourceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecCrossReference_1_0()); }
		(
			{ before(grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__DestinationsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getDestinationsDestinationParserRuleCall_2_0()); }
		ruleDestination
		{ after(grammarAccess.getRuleAccess().getDestinationsDestinationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__TransitionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionCrossReference_2_0()); }
		(
			{ before(grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__TargetAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecCrossReference_5_0()); }
		(
			{ before(grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__PermissionsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDestinationAccess().getPermissionsPermissionReferenceParserRuleCall_6_0()); }
		rulePermissionReference
		{ after(grammarAccess.getDestinationAccess().getPermissionsPermissionReferenceParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PermissionReference__PermissionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecCrossReference_1_0()); }
		(
			{ before(grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;