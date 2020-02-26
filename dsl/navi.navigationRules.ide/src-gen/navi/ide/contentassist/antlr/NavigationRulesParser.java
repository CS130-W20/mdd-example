/*
 * generated by Xtext 2.19.0
 */
package navi.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import navi.ide.contentassist.antlr.internal.InternalNavigationRulesParser;
import navi.services.NavigationRulesGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class NavigationRulesParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(NavigationRulesGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, NavigationRulesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMappingSpecAccess().getAlternatives(), "rule__MappingSpec__Alternatives");
			builder.put(grammarAccess.getRootAccess().getGroup(), "rule__Root__Group__0");
			builder.put(grammarAccess.getMappingsAccess().getGroup(), "rule__Mappings__Group__0");
			builder.put(grammarAccess.getMappingAccess().getGroup(), "rule__Mapping__Group__0");
			builder.put(grammarAccess.getPermissionMappingSpecAccess().getGroup(), "rule__PermissionMappingSpec__Group__0");
			builder.put(grammarAccess.getCoordinateMappingSpecAccess().getGroup(), "rule__CoordinateMappingSpec__Group__0");
			builder.put(grammarAccess.getTransitionDefinitionsAccess().getGroup(), "rule__TransitionDefinitions__Group__0");
			builder.put(grammarAccess.getTransitionDefinitionAccess().getGroup(), "rule__TransitionDefinition__Group__0");
			builder.put(grammarAccess.getNavigationRulesAccess().getGroup(), "rule__NavigationRules__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getDestinationAccess().getGroup(), "rule__Destination__Group__0");
			builder.put(grammarAccess.getPermissionReferenceAccess().getGroup(), "rule__PermissionReference__Group__0");
			builder.put(grammarAccess.getRootAccess().getNameAssignment_3(), "rule__Root__NameAssignment_3");
			builder.put(grammarAccess.getRootAccess().getMappingsdefsAssignment_4(), "rule__Root__MappingsdefsAssignment_4");
			builder.put(grammarAccess.getRootAccess().getTransitiondefsAssignment_5(), "rule__Root__TransitiondefsAssignment_5");
			builder.put(grammarAccess.getRootAccess().getRuledefsAssignment_6(), "rule__Root__RuledefsAssignment_6");
			builder.put(grammarAccess.getMappingsAccess().getMappingsAssignment_2(), "rule__Mappings__MappingsAssignment_2");
			builder.put(grammarAccess.getPermissionMappingSpecAccess().getNameAssignment_1(), "rule__PermissionMappingSpec__NameAssignment_1");
			builder.put(grammarAccess.getPermissionMappingSpecAccess().getValueAssignment_3(), "rule__PermissionMappingSpec__ValueAssignment_3");
			builder.put(grammarAccess.getCoordinateMappingSpecAccess().getNameAssignment_1(), "rule__CoordinateMappingSpec__NameAssignment_1");
			builder.put(grammarAccess.getCoordinateMappingSpecAccess().getControllernameAssignment_3(), "rule__CoordinateMappingSpec__ControllernameAssignment_3");
			builder.put(grammarAccess.getCoordinateMappingSpecAccess().getBundleidAssignment_5(), "rule__CoordinateMappingSpec__BundleidAssignment_5");
			builder.put(grammarAccess.getTransitionDefinitionsAccess().getTransitionsAssignment_2(), "rule__TransitionDefinitions__TransitionsAssignment_2");
			builder.put(grammarAccess.getTransitionDefinitionAccess().getNameAssignment_2(), "rule__TransitionDefinition__NameAssignment_2");
			builder.put(grammarAccess.getNavigationRulesAccess().getRulesAssignment_2(), "rule__NavigationRules__RulesAssignment_2");
			builder.put(grammarAccess.getRuleAccess().getSourceAssignment_1(), "rule__Rule__SourceAssignment_1");
			builder.put(grammarAccess.getRuleAccess().getDestinationsAssignment_2(), "rule__Rule__DestinationsAssignment_2");
			builder.put(grammarAccess.getDestinationAccess().getTransitionAssignment_2(), "rule__Destination__TransitionAssignment_2");
			builder.put(grammarAccess.getDestinationAccess().getTargetAssignment_5(), "rule__Destination__TargetAssignment_5");
			builder.put(grammarAccess.getDestinationAccess().getPermissionsAssignment_6(), "rule__Destination__PermissionsAssignment_6");
			builder.put(grammarAccess.getPermissionReferenceAccess().getPermissionAssignment_1(), "rule__PermissionReference__PermissionAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private NavigationRulesGrammarAccess grammarAccess;

	@Override
	protected InternalNavigationRulesParser createParser() {
		InternalNavigationRulesParser result = new InternalNavigationRulesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public NavigationRulesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NavigationRulesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}