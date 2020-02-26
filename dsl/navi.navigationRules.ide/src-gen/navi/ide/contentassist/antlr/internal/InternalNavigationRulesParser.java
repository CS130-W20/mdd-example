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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNavigationRulesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'navigation'", "'rules'", "'for'", "'mappings'", "'{'", "'}'", "'map'", "'permission'", "'to'", "'coordinate'", "'in'", "'navigations'", "'define'", "'navrules'", "'from'", "'on'", "'go'", "'with'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalNavigationRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNavigationRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNavigationRulesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNavigationRules.g"; }


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



    // $ANTLR start "entryRuleRoot"
    // InternalNavigationRules.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalNavigationRules.g:54:1: ( ruleRoot EOF )
            // InternalNavigationRules.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalNavigationRules.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalNavigationRules.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalNavigationRules.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalNavigationRules.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalNavigationRules.g:69:3: ( rule__Root__Group__0 )
            // InternalNavigationRules.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleMappings"
    // InternalNavigationRules.g:78:1: entryRuleMappings : ruleMappings EOF ;
    public final void entryRuleMappings() throws RecognitionException {
        try {
            // InternalNavigationRules.g:79:1: ( ruleMappings EOF )
            // InternalNavigationRules.g:80:1: ruleMappings EOF
            {
             before(grammarAccess.getMappingsRule()); 
            pushFollow(FOLLOW_1);
            ruleMappings();

            state._fsp--;

             after(grammarAccess.getMappingsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappings"


    // $ANTLR start "ruleMappings"
    // InternalNavigationRules.g:87:1: ruleMappings : ( ( rule__Mappings__Group__0 ) ) ;
    public final void ruleMappings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:91:2: ( ( ( rule__Mappings__Group__0 ) ) )
            // InternalNavigationRules.g:92:2: ( ( rule__Mappings__Group__0 ) )
            {
            // InternalNavigationRules.g:92:2: ( ( rule__Mappings__Group__0 ) )
            // InternalNavigationRules.g:93:3: ( rule__Mappings__Group__0 )
            {
             before(grammarAccess.getMappingsAccess().getGroup()); 
            // InternalNavigationRules.g:94:3: ( rule__Mappings__Group__0 )
            // InternalNavigationRules.g:94:4: rule__Mappings__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mappings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappings"


    // $ANTLR start "entryRuleMapping"
    // InternalNavigationRules.g:103:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalNavigationRules.g:104:1: ( ruleMapping EOF )
            // InternalNavigationRules.g:105:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalNavigationRules.g:112:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:116:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalNavigationRules.g:117:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalNavigationRules.g:117:2: ( ( rule__Mapping__Group__0 ) )
            // InternalNavigationRules.g:118:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalNavigationRules.g:119:3: ( rule__Mapping__Group__0 )
            // InternalNavigationRules.g:119:4: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMappingSpec"
    // InternalNavigationRules.g:128:1: entryRuleMappingSpec : ruleMappingSpec EOF ;
    public final void entryRuleMappingSpec() throws RecognitionException {
        try {
            // InternalNavigationRules.g:129:1: ( ruleMappingSpec EOF )
            // InternalNavigationRules.g:130:1: ruleMappingSpec EOF
            {
             before(grammarAccess.getMappingSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingSpec();

            state._fsp--;

             after(grammarAccess.getMappingSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappingSpec"


    // $ANTLR start "ruleMappingSpec"
    // InternalNavigationRules.g:137:1: ruleMappingSpec : ( ( rule__MappingSpec__Alternatives ) ) ;
    public final void ruleMappingSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:141:2: ( ( ( rule__MappingSpec__Alternatives ) ) )
            // InternalNavigationRules.g:142:2: ( ( rule__MappingSpec__Alternatives ) )
            {
            // InternalNavigationRules.g:142:2: ( ( rule__MappingSpec__Alternatives ) )
            // InternalNavigationRules.g:143:3: ( rule__MappingSpec__Alternatives )
            {
             before(grammarAccess.getMappingSpecAccess().getAlternatives()); 
            // InternalNavigationRules.g:144:3: ( rule__MappingSpec__Alternatives )
            // InternalNavigationRules.g:144:4: rule__MappingSpec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MappingSpec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMappingSpecAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingSpec"


    // $ANTLR start "entryRulePermissionMappingSpec"
    // InternalNavigationRules.g:153:1: entryRulePermissionMappingSpec : rulePermissionMappingSpec EOF ;
    public final void entryRulePermissionMappingSpec() throws RecognitionException {
        try {
            // InternalNavigationRules.g:154:1: ( rulePermissionMappingSpec EOF )
            // InternalNavigationRules.g:155:1: rulePermissionMappingSpec EOF
            {
             before(grammarAccess.getPermissionMappingSpecRule()); 
            pushFollow(FOLLOW_1);
            rulePermissionMappingSpec();

            state._fsp--;

             after(grammarAccess.getPermissionMappingSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissionMappingSpec"


    // $ANTLR start "rulePermissionMappingSpec"
    // InternalNavigationRules.g:162:1: rulePermissionMappingSpec : ( ( rule__PermissionMappingSpec__Group__0 ) ) ;
    public final void rulePermissionMappingSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:166:2: ( ( ( rule__PermissionMappingSpec__Group__0 ) ) )
            // InternalNavigationRules.g:167:2: ( ( rule__PermissionMappingSpec__Group__0 ) )
            {
            // InternalNavigationRules.g:167:2: ( ( rule__PermissionMappingSpec__Group__0 ) )
            // InternalNavigationRules.g:168:3: ( rule__PermissionMappingSpec__Group__0 )
            {
             before(grammarAccess.getPermissionMappingSpecAccess().getGroup()); 
            // InternalNavigationRules.g:169:3: ( rule__PermissionMappingSpec__Group__0 )
            // InternalNavigationRules.g:169:4: rule__PermissionMappingSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PermissionMappingSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissionMappingSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissionMappingSpec"


    // $ANTLR start "entryRuleCoordinateMappingSpec"
    // InternalNavigationRules.g:178:1: entryRuleCoordinateMappingSpec : ruleCoordinateMappingSpec EOF ;
    public final void entryRuleCoordinateMappingSpec() throws RecognitionException {
        try {
            // InternalNavigationRules.g:179:1: ( ruleCoordinateMappingSpec EOF )
            // InternalNavigationRules.g:180:1: ruleCoordinateMappingSpec EOF
            {
             before(grammarAccess.getCoordinateMappingSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinateMappingSpec();

            state._fsp--;

             after(grammarAccess.getCoordinateMappingSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinateMappingSpec"


    // $ANTLR start "ruleCoordinateMappingSpec"
    // InternalNavigationRules.g:187:1: ruleCoordinateMappingSpec : ( ( rule__CoordinateMappingSpec__Group__0 ) ) ;
    public final void ruleCoordinateMappingSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:191:2: ( ( ( rule__CoordinateMappingSpec__Group__0 ) ) )
            // InternalNavigationRules.g:192:2: ( ( rule__CoordinateMappingSpec__Group__0 ) )
            {
            // InternalNavigationRules.g:192:2: ( ( rule__CoordinateMappingSpec__Group__0 ) )
            // InternalNavigationRules.g:193:3: ( rule__CoordinateMappingSpec__Group__0 )
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getGroup()); 
            // InternalNavigationRules.g:194:3: ( rule__CoordinateMappingSpec__Group__0 )
            // InternalNavigationRules.g:194:4: rule__CoordinateMappingSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateMappingSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinateMappingSpec"


    // $ANTLR start "entryRuleTransitionDefinitions"
    // InternalNavigationRules.g:203:1: entryRuleTransitionDefinitions : ruleTransitionDefinitions EOF ;
    public final void entryRuleTransitionDefinitions() throws RecognitionException {
        try {
            // InternalNavigationRules.g:204:1: ( ruleTransitionDefinitions EOF )
            // InternalNavigationRules.g:205:1: ruleTransitionDefinitions EOF
            {
             before(grammarAccess.getTransitionDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionDefinitions();

            state._fsp--;

             after(grammarAccess.getTransitionDefinitionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitionDefinitions"


    // $ANTLR start "ruleTransitionDefinitions"
    // InternalNavigationRules.g:212:1: ruleTransitionDefinitions : ( ( rule__TransitionDefinitions__Group__0 ) ) ;
    public final void ruleTransitionDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:216:2: ( ( ( rule__TransitionDefinitions__Group__0 ) ) )
            // InternalNavigationRules.g:217:2: ( ( rule__TransitionDefinitions__Group__0 ) )
            {
            // InternalNavigationRules.g:217:2: ( ( rule__TransitionDefinitions__Group__0 ) )
            // InternalNavigationRules.g:218:3: ( rule__TransitionDefinitions__Group__0 )
            {
             before(grammarAccess.getTransitionDefinitionsAccess().getGroup()); 
            // InternalNavigationRules.g:219:3: ( rule__TransitionDefinitions__Group__0 )
            // InternalNavigationRules.g:219:4: rule__TransitionDefinitions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionDefinitions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionDefinitionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionDefinitions"


    // $ANTLR start "entryRuleTransitionDefinition"
    // InternalNavigationRules.g:228:1: entryRuleTransitionDefinition : ruleTransitionDefinition EOF ;
    public final void entryRuleTransitionDefinition() throws RecognitionException {
        try {
            // InternalNavigationRules.g:229:1: ( ruleTransitionDefinition EOF )
            // InternalNavigationRules.g:230:1: ruleTransitionDefinition EOF
            {
             before(grammarAccess.getTransitionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionDefinition();

            state._fsp--;

             after(grammarAccess.getTransitionDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitionDefinition"


    // $ANTLR start "ruleTransitionDefinition"
    // InternalNavigationRules.g:237:1: ruleTransitionDefinition : ( ( rule__TransitionDefinition__Group__0 ) ) ;
    public final void ruleTransitionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:241:2: ( ( ( rule__TransitionDefinition__Group__0 ) ) )
            // InternalNavigationRules.g:242:2: ( ( rule__TransitionDefinition__Group__0 ) )
            {
            // InternalNavigationRules.g:242:2: ( ( rule__TransitionDefinition__Group__0 ) )
            // InternalNavigationRules.g:243:3: ( rule__TransitionDefinition__Group__0 )
            {
             before(grammarAccess.getTransitionDefinitionAccess().getGroup()); 
            // InternalNavigationRules.g:244:3: ( rule__TransitionDefinition__Group__0 )
            // InternalNavigationRules.g:244:4: rule__TransitionDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionDefinition"


    // $ANTLR start "entryRuleNavigationRules"
    // InternalNavigationRules.g:253:1: entryRuleNavigationRules : ruleNavigationRules EOF ;
    public final void entryRuleNavigationRules() throws RecognitionException {
        try {
            // InternalNavigationRules.g:254:1: ( ruleNavigationRules EOF )
            // InternalNavigationRules.g:255:1: ruleNavigationRules EOF
            {
             before(grammarAccess.getNavigationRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigationRules();

            state._fsp--;

             after(grammarAccess.getNavigationRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigationRules"


    // $ANTLR start "ruleNavigationRules"
    // InternalNavigationRules.g:262:1: ruleNavigationRules : ( ( rule__NavigationRules__Group__0 ) ) ;
    public final void ruleNavigationRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:266:2: ( ( ( rule__NavigationRules__Group__0 ) ) )
            // InternalNavigationRules.g:267:2: ( ( rule__NavigationRules__Group__0 ) )
            {
            // InternalNavigationRules.g:267:2: ( ( rule__NavigationRules__Group__0 ) )
            // InternalNavigationRules.g:268:3: ( rule__NavigationRules__Group__0 )
            {
             before(grammarAccess.getNavigationRulesAccess().getGroup()); 
            // InternalNavigationRules.g:269:3: ( rule__NavigationRules__Group__0 )
            // InternalNavigationRules.g:269:4: rule__NavigationRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavigationRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigationRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigationRules"


    // $ANTLR start "entryRuleRule"
    // InternalNavigationRules.g:278:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalNavigationRules.g:279:1: ( ruleRule EOF )
            // InternalNavigationRules.g:280:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalNavigationRules.g:287:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:291:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalNavigationRules.g:292:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalNavigationRules.g:292:2: ( ( rule__Rule__Group__0 ) )
            // InternalNavigationRules.g:293:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalNavigationRules.g:294:3: ( rule__Rule__Group__0 )
            // InternalNavigationRules.g:294:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDestination"
    // InternalNavigationRules.g:303:1: entryRuleDestination : ruleDestination EOF ;
    public final void entryRuleDestination() throws RecognitionException {
        try {
            // InternalNavigationRules.g:304:1: ( ruleDestination EOF )
            // InternalNavigationRules.g:305:1: ruleDestination EOF
            {
             before(grammarAccess.getDestinationRule()); 
            pushFollow(FOLLOW_1);
            ruleDestination();

            state._fsp--;

             after(grammarAccess.getDestinationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDestination"


    // $ANTLR start "ruleDestination"
    // InternalNavigationRules.g:312:1: ruleDestination : ( ( rule__Destination__Group__0 ) ) ;
    public final void ruleDestination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:316:2: ( ( ( rule__Destination__Group__0 ) ) )
            // InternalNavigationRules.g:317:2: ( ( rule__Destination__Group__0 ) )
            {
            // InternalNavigationRules.g:317:2: ( ( rule__Destination__Group__0 ) )
            // InternalNavigationRules.g:318:3: ( rule__Destination__Group__0 )
            {
             before(grammarAccess.getDestinationAccess().getGroup()); 
            // InternalNavigationRules.g:319:3: ( rule__Destination__Group__0 )
            // InternalNavigationRules.g:319:4: rule__Destination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestination"


    // $ANTLR start "entryRulePermissionReference"
    // InternalNavigationRules.g:328:1: entryRulePermissionReference : rulePermissionReference EOF ;
    public final void entryRulePermissionReference() throws RecognitionException {
        try {
            // InternalNavigationRules.g:329:1: ( rulePermissionReference EOF )
            // InternalNavigationRules.g:330:1: rulePermissionReference EOF
            {
             before(grammarAccess.getPermissionReferenceRule()); 
            pushFollow(FOLLOW_1);
            rulePermissionReference();

            state._fsp--;

             after(grammarAccess.getPermissionReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissionReference"


    // $ANTLR start "rulePermissionReference"
    // InternalNavigationRules.g:337:1: rulePermissionReference : ( ( rule__PermissionReference__Group__0 ) ) ;
    public final void rulePermissionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:341:2: ( ( ( rule__PermissionReference__Group__0 ) ) )
            // InternalNavigationRules.g:342:2: ( ( rule__PermissionReference__Group__0 ) )
            {
            // InternalNavigationRules.g:342:2: ( ( rule__PermissionReference__Group__0 ) )
            // InternalNavigationRules.g:343:3: ( rule__PermissionReference__Group__0 )
            {
             before(grammarAccess.getPermissionReferenceAccess().getGroup()); 
            // InternalNavigationRules.g:344:3: ( rule__PermissionReference__Group__0 )
            // InternalNavigationRules.g:344:4: rule__PermissionReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PermissionReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissionReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissionReference"


    // $ANTLR start "rule__MappingSpec__Alternatives"
    // InternalNavigationRules.g:352:1: rule__MappingSpec__Alternatives : ( ( rulePermissionMappingSpec ) | ( ruleCoordinateMappingSpec ) );
    public final void rule__MappingSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:356:1: ( ( rulePermissionMappingSpec ) | ( ruleCoordinateMappingSpec ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalNavigationRules.g:357:2: ( rulePermissionMappingSpec )
                    {
                    // InternalNavigationRules.g:357:2: ( rulePermissionMappingSpec )
                    // InternalNavigationRules.g:358:3: rulePermissionMappingSpec
                    {
                     before(grammarAccess.getMappingSpecAccess().getPermissionMappingSpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePermissionMappingSpec();

                    state._fsp--;

                     after(grammarAccess.getMappingSpecAccess().getPermissionMappingSpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNavigationRules.g:363:2: ( ruleCoordinateMappingSpec )
                    {
                    // InternalNavigationRules.g:363:2: ( ruleCoordinateMappingSpec )
                    // InternalNavigationRules.g:364:3: ruleCoordinateMappingSpec
                    {
                     before(grammarAccess.getMappingSpecAccess().getCoordinateMappingSpecParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCoordinateMappingSpec();

                    state._fsp--;

                     after(grammarAccess.getMappingSpecAccess().getCoordinateMappingSpecParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingSpec__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // InternalNavigationRules.g:373:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:377:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalNavigationRules.g:378:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalNavigationRules.g:385:1: rule__Root__Group__0__Impl : ( 'navigation' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:389:1: ( ( 'navigation' ) )
            // InternalNavigationRules.g:390:1: ( 'navigation' )
            {
            // InternalNavigationRules.g:390:1: ( 'navigation' )
            // InternalNavigationRules.g:391:2: 'navigation'
            {
             before(grammarAccess.getRootAccess().getNavigationKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getNavigationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalNavigationRules.g:400:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:404:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalNavigationRules.g:405:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalNavigationRules.g:412:1: rule__Root__Group__1__Impl : ( 'rules' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:416:1: ( ( 'rules' ) )
            // InternalNavigationRules.g:417:1: ( 'rules' )
            {
            // InternalNavigationRules.g:417:1: ( 'rules' )
            // InternalNavigationRules.g:418:2: 'rules'
            {
             before(grammarAccess.getRootAccess().getRulesKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRulesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalNavigationRules.g:427:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:431:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalNavigationRules.g:432:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalNavigationRules.g:439:1: rule__Root__Group__2__Impl : ( 'for' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:443:1: ( ( 'for' ) )
            // InternalNavigationRules.g:444:1: ( 'for' )
            {
            // InternalNavigationRules.g:444:1: ( 'for' )
            // InternalNavigationRules.g:445:2: 'for'
            {
             before(grammarAccess.getRootAccess().getForKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalNavigationRules.g:454:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:458:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalNavigationRules.g:459:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalNavigationRules.g:466:1: rule__Root__Group__3__Impl : ( ( rule__Root__NameAssignment_3 ) ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:470:1: ( ( ( rule__Root__NameAssignment_3 ) ) )
            // InternalNavigationRules.g:471:1: ( ( rule__Root__NameAssignment_3 ) )
            {
            // InternalNavigationRules.g:471:1: ( ( rule__Root__NameAssignment_3 ) )
            // InternalNavigationRules.g:472:2: ( rule__Root__NameAssignment_3 )
            {
             before(grammarAccess.getRootAccess().getNameAssignment_3()); 
            // InternalNavigationRules.g:473:2: ( rule__Root__NameAssignment_3 )
            // InternalNavigationRules.g:473:3: rule__Root__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Root__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // InternalNavigationRules.g:481:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:485:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalNavigationRules.g:486:2: rule__Root__Group__4__Impl rule__Root__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Root__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // InternalNavigationRules.g:493:1: rule__Root__Group__4__Impl : ( ( rule__Root__MappingsdefsAssignment_4 ) ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:497:1: ( ( ( rule__Root__MappingsdefsAssignment_4 ) ) )
            // InternalNavigationRules.g:498:1: ( ( rule__Root__MappingsdefsAssignment_4 ) )
            {
            // InternalNavigationRules.g:498:1: ( ( rule__Root__MappingsdefsAssignment_4 ) )
            // InternalNavigationRules.g:499:2: ( rule__Root__MappingsdefsAssignment_4 )
            {
             before(grammarAccess.getRootAccess().getMappingsdefsAssignment_4()); 
            // InternalNavigationRules.g:500:2: ( rule__Root__MappingsdefsAssignment_4 )
            // InternalNavigationRules.g:500:3: rule__Root__MappingsdefsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Root__MappingsdefsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getMappingsdefsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Root__Group__5"
    // InternalNavigationRules.g:508:1: rule__Root__Group__5 : rule__Root__Group__5__Impl rule__Root__Group__6 ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:512:1: ( rule__Root__Group__5__Impl rule__Root__Group__6 )
            // InternalNavigationRules.g:513:2: rule__Root__Group__5__Impl rule__Root__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Root__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__5"


    // $ANTLR start "rule__Root__Group__5__Impl"
    // InternalNavigationRules.g:520:1: rule__Root__Group__5__Impl : ( ( rule__Root__TransitiondefsAssignment_5 ) ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:524:1: ( ( ( rule__Root__TransitiondefsAssignment_5 ) ) )
            // InternalNavigationRules.g:525:1: ( ( rule__Root__TransitiondefsAssignment_5 ) )
            {
            // InternalNavigationRules.g:525:1: ( ( rule__Root__TransitiondefsAssignment_5 ) )
            // InternalNavigationRules.g:526:2: ( rule__Root__TransitiondefsAssignment_5 )
            {
             before(grammarAccess.getRootAccess().getTransitiondefsAssignment_5()); 
            // InternalNavigationRules.g:527:2: ( rule__Root__TransitiondefsAssignment_5 )
            // InternalNavigationRules.g:527:3: rule__Root__TransitiondefsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Root__TransitiondefsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getTransitiondefsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__5__Impl"


    // $ANTLR start "rule__Root__Group__6"
    // InternalNavigationRules.g:535:1: rule__Root__Group__6 : rule__Root__Group__6__Impl ;
    public final void rule__Root__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:539:1: ( rule__Root__Group__6__Impl )
            // InternalNavigationRules.g:540:2: rule__Root__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__6"


    // $ANTLR start "rule__Root__Group__6__Impl"
    // InternalNavigationRules.g:546:1: rule__Root__Group__6__Impl : ( ( rule__Root__RuledefsAssignment_6 ) ) ;
    public final void rule__Root__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:550:1: ( ( ( rule__Root__RuledefsAssignment_6 ) ) )
            // InternalNavigationRules.g:551:1: ( ( rule__Root__RuledefsAssignment_6 ) )
            {
            // InternalNavigationRules.g:551:1: ( ( rule__Root__RuledefsAssignment_6 ) )
            // InternalNavigationRules.g:552:2: ( rule__Root__RuledefsAssignment_6 )
            {
             before(grammarAccess.getRootAccess().getRuledefsAssignment_6()); 
            // InternalNavigationRules.g:553:2: ( rule__Root__RuledefsAssignment_6 )
            // InternalNavigationRules.g:553:3: rule__Root__RuledefsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Root__RuledefsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getRuledefsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__6__Impl"


    // $ANTLR start "rule__Mappings__Group__0"
    // InternalNavigationRules.g:562:1: rule__Mappings__Group__0 : rule__Mappings__Group__0__Impl rule__Mappings__Group__1 ;
    public final void rule__Mappings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:566:1: ( rule__Mappings__Group__0__Impl rule__Mappings__Group__1 )
            // InternalNavigationRules.g:567:2: rule__Mappings__Group__0__Impl rule__Mappings__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Mappings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mappings__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__Group__0"


    // $ANTLR start "rule__Mappings__Group__0__Impl"
    // InternalNavigationRules.g:574:1: rule__Mappings__Group__0__Impl : ( 'mappings' ) ;
    public final void rule__Mappings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:578:1: ( ( 'mappings' ) )
            // InternalNavigationRules.g:579:1: ( 'mappings' )
            {
            // InternalNavigationRules.g:579:1: ( 'mappings' )
            // InternalNavigationRules.g:580:2: 'mappings'
            {
             before(grammarAccess.getMappingsAccess().getMappingsKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMappingsAccess().getMappingsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__Group__0__Impl"


    // $ANTLR start "rule__Mappings__Group__1"
    // InternalNavigationRules.g:589:1: rule__Mappings__Group__1 : rule__Mappings__Group__1__Impl rule__Mappings__Group__2 ;
    public final void rule__Mappings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:593:1: ( rule__Mappings__Group__1__Impl rule__Mappings__Group__2 )
            // InternalNavigationRules.g:594:2: rule__Mappings__Group__1__Impl rule__Mappings__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Mappings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mappings__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__Group__1"


    // $ANTLR start "rule__Mappings__Group__1__Impl"
    // InternalNavigationRules.g:601:1: rule__Mappings__Group__1__Impl : ( '{' ) ;
    public final void rule__Mappings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:605:1: ( ( '{' ) )
            // InternalNavigationRules.g:606:1: ( '{' )
            {
            // InternalNavigationRules.g:606:1: ( '{' )
            // InternalNavigationRules.g:607:2: '{'
            {
             before(grammarAccess.getMappingsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMappingsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__Group__1__Impl"


    // $ANTLR start "rule__Mappings__Group__2"
    // InternalNavigationRules.g:616:1: rule__Mappings__Group__2 : rule__Mappings__Group__2__Impl rule__Mappings__Group__3 ;
    public final void rule__Mappings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:620:1: ( rule__Mappings__Group__2__Impl rule__Mappings__Group__3 )
            // InternalNavigationRules.g:621:2: rule__Mappings__Group__2__Impl rule__Mappings__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Mappings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mappings__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__Group__2"


    // $ANTLR start "rule__Mappings__Group__2__Impl"
    // InternalNavigationRules.g:628:1: rule__Mappings__Group__2__Impl : ( ( ( rule__Mappings__MappingsAssignment_2 ) ) ( ( rule__Mappings__MappingsAssignment_2 )* ) ) ;
    public final void rule__Mappings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:632:1: ( ( ( ( rule__Mappings__MappingsAssignment_2 ) ) ( ( rule__Mappings__MappingsAssignment_2 )* ) ) )
            // InternalNavigationRules.g:633:1: ( ( ( rule__Mappings__MappingsAssignment_2 ) ) ( ( rule__Mappings__MappingsAssignment_2 )* ) )
            {
            // InternalNavigationRules.g:633:1: ( ( ( rule__Mappings__MappingsAssignment_2 ) ) ( ( rule__Mappings__MappingsAssignment_2 )* ) )
            // InternalNavigationRules.g:634:2: ( ( rule__Mappings__MappingsAssignment_2 ) ) ( ( rule__Mappings__MappingsAssignment_2 )* )
            {
            // InternalNavigationRules.g:634:2: ( ( rule__Mappings__MappingsAssignment_2 ) )
            // InternalNavigationRules.g:635:3: ( rule__Mappings__MappingsAssignment_2 )
            {
             before(grammarAccess.getMappingsAccess().getMappingsAssignment_2()); 
            // InternalNavigationRules.g:636:3: ( rule__Mappings__MappingsAssignment_2 )
            // InternalNavigationRules.g:636:4: rule__Mappings__MappingsAssignment_2
            {
            pushFollow(FOLLOW_12);
            rule__Mappings__MappingsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingsAccess().getMappingsAssignment_2()); 

            }

            // InternalNavigationRules.g:639:2: ( ( rule__Mappings__MappingsAssignment_2 )* )
            // InternalNavigationRules.g:640:3: ( rule__Mappings__MappingsAssignment_2 )*
            {
             before(grammarAccess.getMappingsAccess().getMappingsAssignment_2()); 
            // InternalNavigationRules.g:641:3: ( rule__Mappings__MappingsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalNavigationRules.g:641:4: rule__Mappings__MappingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Mappings__MappingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMappingsAccess().getMappingsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__Group__2__Impl"


    // $ANTLR start "rule__Mappings__Group__3"
    // InternalNavigationRules.g:650:1: rule__Mappings__Group__3 : rule__Mappings__Group__3__Impl ;
    public final void rule__Mappings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:654:1: ( rule__Mappings__Group__3__Impl )
            // InternalNavigationRules.g:655:2: rule__Mappings__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mappings__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__Group__3"


    // $ANTLR start "rule__Mappings__Group__3__Impl"
    // InternalNavigationRules.g:661:1: rule__Mappings__Group__3__Impl : ( '}' ) ;
    public final void rule__Mappings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:665:1: ( ( '}' ) )
            // InternalNavigationRules.g:666:1: ( '}' )
            {
            // InternalNavigationRules.g:666:1: ( '}' )
            // InternalNavigationRules.g:667:2: '}'
            {
             before(grammarAccess.getMappingsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMappingsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalNavigationRules.g:677:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:681:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalNavigationRules.g:682:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // InternalNavigationRules.g:689:1: rule__Mapping__Group__0__Impl : ( 'map' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:693:1: ( ( 'map' ) )
            // InternalNavigationRules.g:694:1: ( 'map' )
            {
            // InternalNavigationRules.g:694:1: ( 'map' )
            // InternalNavigationRules.g:695:2: 'map'
            {
             before(grammarAccess.getMappingAccess().getMapKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // InternalNavigationRules.g:704:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:708:1: ( rule__Mapping__Group__1__Impl )
            // InternalNavigationRules.g:709:2: rule__Mapping__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // InternalNavigationRules.g:715:1: rule__Mapping__Group__1__Impl : ( ruleMappingSpec ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:719:1: ( ( ruleMappingSpec ) )
            // InternalNavigationRules.g:720:1: ( ruleMappingSpec )
            {
            // InternalNavigationRules.g:720:1: ( ruleMappingSpec )
            // InternalNavigationRules.g:721:2: ruleMappingSpec
            {
             before(grammarAccess.getMappingAccess().getMappingSpecParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleMappingSpec();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getMappingSpecParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__PermissionMappingSpec__Group__0"
    // InternalNavigationRules.g:731:1: rule__PermissionMappingSpec__Group__0 : rule__PermissionMappingSpec__Group__0__Impl rule__PermissionMappingSpec__Group__1 ;
    public final void rule__PermissionMappingSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:735:1: ( rule__PermissionMappingSpec__Group__0__Impl rule__PermissionMappingSpec__Group__1 )
            // InternalNavigationRules.g:736:2: rule__PermissionMappingSpec__Group__0__Impl rule__PermissionMappingSpec__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PermissionMappingSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionMappingSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__Group__0"


    // $ANTLR start "rule__PermissionMappingSpec__Group__0__Impl"
    // InternalNavigationRules.g:743:1: rule__PermissionMappingSpec__Group__0__Impl : ( 'permission' ) ;
    public final void rule__PermissionMappingSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:747:1: ( ( 'permission' ) )
            // InternalNavigationRules.g:748:1: ( 'permission' )
            {
            // InternalNavigationRules.g:748:1: ( 'permission' )
            // InternalNavigationRules.g:749:2: 'permission'
            {
             before(grammarAccess.getPermissionMappingSpecAccess().getPermissionKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPermissionMappingSpecAccess().getPermissionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__Group__0__Impl"


    // $ANTLR start "rule__PermissionMappingSpec__Group__1"
    // InternalNavigationRules.g:758:1: rule__PermissionMappingSpec__Group__1 : rule__PermissionMappingSpec__Group__1__Impl rule__PermissionMappingSpec__Group__2 ;
    public final void rule__PermissionMappingSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:762:1: ( rule__PermissionMappingSpec__Group__1__Impl rule__PermissionMappingSpec__Group__2 )
            // InternalNavigationRules.g:763:2: rule__PermissionMappingSpec__Group__1__Impl rule__PermissionMappingSpec__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PermissionMappingSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionMappingSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__Group__1"


    // $ANTLR start "rule__PermissionMappingSpec__Group__1__Impl"
    // InternalNavigationRules.g:770:1: rule__PermissionMappingSpec__Group__1__Impl : ( ( rule__PermissionMappingSpec__NameAssignment_1 ) ) ;
    public final void rule__PermissionMappingSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:774:1: ( ( ( rule__PermissionMappingSpec__NameAssignment_1 ) ) )
            // InternalNavigationRules.g:775:1: ( ( rule__PermissionMappingSpec__NameAssignment_1 ) )
            {
            // InternalNavigationRules.g:775:1: ( ( rule__PermissionMappingSpec__NameAssignment_1 ) )
            // InternalNavigationRules.g:776:2: ( rule__PermissionMappingSpec__NameAssignment_1 )
            {
             before(grammarAccess.getPermissionMappingSpecAccess().getNameAssignment_1()); 
            // InternalNavigationRules.g:777:2: ( rule__PermissionMappingSpec__NameAssignment_1 )
            // InternalNavigationRules.g:777:3: rule__PermissionMappingSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PermissionMappingSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPermissionMappingSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__Group__1__Impl"


    // $ANTLR start "rule__PermissionMappingSpec__Group__2"
    // InternalNavigationRules.g:785:1: rule__PermissionMappingSpec__Group__2 : rule__PermissionMappingSpec__Group__2__Impl rule__PermissionMappingSpec__Group__3 ;
    public final void rule__PermissionMappingSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:789:1: ( rule__PermissionMappingSpec__Group__2__Impl rule__PermissionMappingSpec__Group__3 )
            // InternalNavigationRules.g:790:2: rule__PermissionMappingSpec__Group__2__Impl rule__PermissionMappingSpec__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__PermissionMappingSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionMappingSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__Group__2"


    // $ANTLR start "rule__PermissionMappingSpec__Group__2__Impl"
    // InternalNavigationRules.g:797:1: rule__PermissionMappingSpec__Group__2__Impl : ( 'to' ) ;
    public final void rule__PermissionMappingSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:801:1: ( ( 'to' ) )
            // InternalNavigationRules.g:802:1: ( 'to' )
            {
            // InternalNavigationRules.g:802:1: ( 'to' )
            // InternalNavigationRules.g:803:2: 'to'
            {
             before(grammarAccess.getPermissionMappingSpecAccess().getToKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPermissionMappingSpecAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__Group__2__Impl"


    // $ANTLR start "rule__PermissionMappingSpec__Group__3"
    // InternalNavigationRules.g:812:1: rule__PermissionMappingSpec__Group__3 : rule__PermissionMappingSpec__Group__3__Impl ;
    public final void rule__PermissionMappingSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:816:1: ( rule__PermissionMappingSpec__Group__3__Impl )
            // InternalNavigationRules.g:817:2: rule__PermissionMappingSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PermissionMappingSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__Group__3"


    // $ANTLR start "rule__PermissionMappingSpec__Group__3__Impl"
    // InternalNavigationRules.g:823:1: rule__PermissionMappingSpec__Group__3__Impl : ( ( rule__PermissionMappingSpec__ValueAssignment_3 ) ) ;
    public final void rule__PermissionMappingSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:827:1: ( ( ( rule__PermissionMappingSpec__ValueAssignment_3 ) ) )
            // InternalNavigationRules.g:828:1: ( ( rule__PermissionMappingSpec__ValueAssignment_3 ) )
            {
            // InternalNavigationRules.g:828:1: ( ( rule__PermissionMappingSpec__ValueAssignment_3 ) )
            // InternalNavigationRules.g:829:2: ( rule__PermissionMappingSpec__ValueAssignment_3 )
            {
             before(grammarAccess.getPermissionMappingSpecAccess().getValueAssignment_3()); 
            // InternalNavigationRules.g:830:2: ( rule__PermissionMappingSpec__ValueAssignment_3 )
            // InternalNavigationRules.g:830:3: rule__PermissionMappingSpec__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PermissionMappingSpec__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPermissionMappingSpecAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__Group__3__Impl"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__0"
    // InternalNavigationRules.g:839:1: rule__CoordinateMappingSpec__Group__0 : rule__CoordinateMappingSpec__Group__0__Impl rule__CoordinateMappingSpec__Group__1 ;
    public final void rule__CoordinateMappingSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:843:1: ( rule__CoordinateMappingSpec__Group__0__Impl rule__CoordinateMappingSpec__Group__1 )
            // InternalNavigationRules.g:844:2: rule__CoordinateMappingSpec__Group__0__Impl rule__CoordinateMappingSpec__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CoordinateMappingSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__0"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__0__Impl"
    // InternalNavigationRules.g:851:1: rule__CoordinateMappingSpec__Group__0__Impl : ( 'coordinate' ) ;
    public final void rule__CoordinateMappingSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:855:1: ( ( 'coordinate' ) )
            // InternalNavigationRules.g:856:1: ( 'coordinate' )
            {
            // InternalNavigationRules.g:856:1: ( 'coordinate' )
            // InternalNavigationRules.g:857:2: 'coordinate'
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getCoordinateKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCoordinateMappingSpecAccess().getCoordinateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__0__Impl"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__1"
    // InternalNavigationRules.g:866:1: rule__CoordinateMappingSpec__Group__1 : rule__CoordinateMappingSpec__Group__1__Impl rule__CoordinateMappingSpec__Group__2 ;
    public final void rule__CoordinateMappingSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:870:1: ( rule__CoordinateMappingSpec__Group__1__Impl rule__CoordinateMappingSpec__Group__2 )
            // InternalNavigationRules.g:871:2: rule__CoordinateMappingSpec__Group__1__Impl rule__CoordinateMappingSpec__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__CoordinateMappingSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__1"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__1__Impl"
    // InternalNavigationRules.g:878:1: rule__CoordinateMappingSpec__Group__1__Impl : ( ( rule__CoordinateMappingSpec__NameAssignment_1 ) ) ;
    public final void rule__CoordinateMappingSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:882:1: ( ( ( rule__CoordinateMappingSpec__NameAssignment_1 ) ) )
            // InternalNavigationRules.g:883:1: ( ( rule__CoordinateMappingSpec__NameAssignment_1 ) )
            {
            // InternalNavigationRules.g:883:1: ( ( rule__CoordinateMappingSpec__NameAssignment_1 ) )
            // InternalNavigationRules.g:884:2: ( rule__CoordinateMappingSpec__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getNameAssignment_1()); 
            // InternalNavigationRules.g:885:2: ( rule__CoordinateMappingSpec__NameAssignment_1 )
            // InternalNavigationRules.g:885:3: rule__CoordinateMappingSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateMappingSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__1__Impl"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__2"
    // InternalNavigationRules.g:893:1: rule__CoordinateMappingSpec__Group__2 : rule__CoordinateMappingSpec__Group__2__Impl rule__CoordinateMappingSpec__Group__3 ;
    public final void rule__CoordinateMappingSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:897:1: ( rule__CoordinateMappingSpec__Group__2__Impl rule__CoordinateMappingSpec__Group__3 )
            // InternalNavigationRules.g:898:2: rule__CoordinateMappingSpec__Group__2__Impl rule__CoordinateMappingSpec__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__CoordinateMappingSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__2"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__2__Impl"
    // InternalNavigationRules.g:905:1: rule__CoordinateMappingSpec__Group__2__Impl : ( 'to' ) ;
    public final void rule__CoordinateMappingSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:909:1: ( ( 'to' ) )
            // InternalNavigationRules.g:910:1: ( 'to' )
            {
            // InternalNavigationRules.g:910:1: ( 'to' )
            // InternalNavigationRules.g:911:2: 'to'
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getToKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCoordinateMappingSpecAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__2__Impl"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__3"
    // InternalNavigationRules.g:920:1: rule__CoordinateMappingSpec__Group__3 : rule__CoordinateMappingSpec__Group__3__Impl rule__CoordinateMappingSpec__Group__4 ;
    public final void rule__CoordinateMappingSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:924:1: ( rule__CoordinateMappingSpec__Group__3__Impl rule__CoordinateMappingSpec__Group__4 )
            // InternalNavigationRules.g:925:2: rule__CoordinateMappingSpec__Group__3__Impl rule__CoordinateMappingSpec__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__CoordinateMappingSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__3"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__3__Impl"
    // InternalNavigationRules.g:932:1: rule__CoordinateMappingSpec__Group__3__Impl : ( ( rule__CoordinateMappingSpec__ControllernameAssignment_3 ) ) ;
    public final void rule__CoordinateMappingSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:936:1: ( ( ( rule__CoordinateMappingSpec__ControllernameAssignment_3 ) ) )
            // InternalNavigationRules.g:937:1: ( ( rule__CoordinateMappingSpec__ControllernameAssignment_3 ) )
            {
            // InternalNavigationRules.g:937:1: ( ( rule__CoordinateMappingSpec__ControllernameAssignment_3 ) )
            // InternalNavigationRules.g:938:2: ( rule__CoordinateMappingSpec__ControllernameAssignment_3 )
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getControllernameAssignment_3()); 
            // InternalNavigationRules.g:939:2: ( rule__CoordinateMappingSpec__ControllernameAssignment_3 )
            // InternalNavigationRules.g:939:3: rule__CoordinateMappingSpec__ControllernameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__ControllernameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateMappingSpecAccess().getControllernameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__3__Impl"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__4"
    // InternalNavigationRules.g:947:1: rule__CoordinateMappingSpec__Group__4 : rule__CoordinateMappingSpec__Group__4__Impl rule__CoordinateMappingSpec__Group__5 ;
    public final void rule__CoordinateMappingSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:951:1: ( rule__CoordinateMappingSpec__Group__4__Impl rule__CoordinateMappingSpec__Group__5 )
            // InternalNavigationRules.g:952:2: rule__CoordinateMappingSpec__Group__4__Impl rule__CoordinateMappingSpec__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__CoordinateMappingSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__4"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__4__Impl"
    // InternalNavigationRules.g:959:1: rule__CoordinateMappingSpec__Group__4__Impl : ( 'in' ) ;
    public final void rule__CoordinateMappingSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:963:1: ( ( 'in' ) )
            // InternalNavigationRules.g:964:1: ( 'in' )
            {
            // InternalNavigationRules.g:964:1: ( 'in' )
            // InternalNavigationRules.g:965:2: 'in'
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getInKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCoordinateMappingSpecAccess().getInKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__4__Impl"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__5"
    // InternalNavigationRules.g:974:1: rule__CoordinateMappingSpec__Group__5 : rule__CoordinateMappingSpec__Group__5__Impl ;
    public final void rule__CoordinateMappingSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:978:1: ( rule__CoordinateMappingSpec__Group__5__Impl )
            // InternalNavigationRules.g:979:2: rule__CoordinateMappingSpec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__5"


    // $ANTLR start "rule__CoordinateMappingSpec__Group__5__Impl"
    // InternalNavigationRules.g:985:1: rule__CoordinateMappingSpec__Group__5__Impl : ( ( rule__CoordinateMappingSpec__BundleidAssignment_5 ) ) ;
    public final void rule__CoordinateMappingSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:989:1: ( ( ( rule__CoordinateMappingSpec__BundleidAssignment_5 ) ) )
            // InternalNavigationRules.g:990:1: ( ( rule__CoordinateMappingSpec__BundleidAssignment_5 ) )
            {
            // InternalNavigationRules.g:990:1: ( ( rule__CoordinateMappingSpec__BundleidAssignment_5 ) )
            // InternalNavigationRules.g:991:2: ( rule__CoordinateMappingSpec__BundleidAssignment_5 )
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getBundleidAssignment_5()); 
            // InternalNavigationRules.g:992:2: ( rule__CoordinateMappingSpec__BundleidAssignment_5 )
            // InternalNavigationRules.g:992:3: rule__CoordinateMappingSpec__BundleidAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CoordinateMappingSpec__BundleidAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateMappingSpecAccess().getBundleidAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__Group__5__Impl"


    // $ANTLR start "rule__TransitionDefinitions__Group__0"
    // InternalNavigationRules.g:1001:1: rule__TransitionDefinitions__Group__0 : rule__TransitionDefinitions__Group__0__Impl rule__TransitionDefinitions__Group__1 ;
    public final void rule__TransitionDefinitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1005:1: ( rule__TransitionDefinitions__Group__0__Impl rule__TransitionDefinitions__Group__1 )
            // InternalNavigationRules.g:1006:2: rule__TransitionDefinitions__Group__0__Impl rule__TransitionDefinitions__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TransitionDefinitions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionDefinitions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinitions__Group__0"


    // $ANTLR start "rule__TransitionDefinitions__Group__0__Impl"
    // InternalNavigationRules.g:1013:1: rule__TransitionDefinitions__Group__0__Impl : ( 'navigations' ) ;
    public final void rule__TransitionDefinitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1017:1: ( ( 'navigations' ) )
            // InternalNavigationRules.g:1018:1: ( 'navigations' )
            {
            // InternalNavigationRules.g:1018:1: ( 'navigations' )
            // InternalNavigationRules.g:1019:2: 'navigations'
            {
             before(grammarAccess.getTransitionDefinitionsAccess().getNavigationsKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransitionDefinitionsAccess().getNavigationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinitions__Group__0__Impl"


    // $ANTLR start "rule__TransitionDefinitions__Group__1"
    // InternalNavigationRules.g:1028:1: rule__TransitionDefinitions__Group__1 : rule__TransitionDefinitions__Group__1__Impl rule__TransitionDefinitions__Group__2 ;
    public final void rule__TransitionDefinitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1032:1: ( rule__TransitionDefinitions__Group__1__Impl rule__TransitionDefinitions__Group__2 )
            // InternalNavigationRules.g:1033:2: rule__TransitionDefinitions__Group__1__Impl rule__TransitionDefinitions__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__TransitionDefinitions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionDefinitions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinitions__Group__1"


    // $ANTLR start "rule__TransitionDefinitions__Group__1__Impl"
    // InternalNavigationRules.g:1040:1: rule__TransitionDefinitions__Group__1__Impl : ( '{' ) ;
    public final void rule__TransitionDefinitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1044:1: ( ( '{' ) )
            // InternalNavigationRules.g:1045:1: ( '{' )
            {
            // InternalNavigationRules.g:1045:1: ( '{' )
            // InternalNavigationRules.g:1046:2: '{'
            {
             before(grammarAccess.getTransitionDefinitionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionDefinitionsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinitions__Group__1__Impl"


    // $ANTLR start "rule__TransitionDefinitions__Group__2"
    // InternalNavigationRules.g:1055:1: rule__TransitionDefinitions__Group__2 : rule__TransitionDefinitions__Group__2__Impl rule__TransitionDefinitions__Group__3 ;
    public final void rule__TransitionDefinitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1059:1: ( rule__TransitionDefinitions__Group__2__Impl rule__TransitionDefinitions__Group__3 )
            // InternalNavigationRules.g:1060:2: rule__TransitionDefinitions__Group__2__Impl rule__TransitionDefinitions__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__TransitionDefinitions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionDefinitions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinitions__Group__2"


    // $ANTLR start "rule__TransitionDefinitions__Group__2__Impl"
    // InternalNavigationRules.g:1067:1: rule__TransitionDefinitions__Group__2__Impl : ( ( ( rule__TransitionDefinitions__TransitionsAssignment_2 ) ) ( ( rule__TransitionDefinitions__TransitionsAssignment_2 )* ) ) ;
    public final void rule__TransitionDefinitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1071:1: ( ( ( ( rule__TransitionDefinitions__TransitionsAssignment_2 ) ) ( ( rule__TransitionDefinitions__TransitionsAssignment_2 )* ) ) )
            // InternalNavigationRules.g:1072:1: ( ( ( rule__TransitionDefinitions__TransitionsAssignment_2 ) ) ( ( rule__TransitionDefinitions__TransitionsAssignment_2 )* ) )
            {
            // InternalNavigationRules.g:1072:1: ( ( ( rule__TransitionDefinitions__TransitionsAssignment_2 ) ) ( ( rule__TransitionDefinitions__TransitionsAssignment_2 )* ) )
            // InternalNavigationRules.g:1073:2: ( ( rule__TransitionDefinitions__TransitionsAssignment_2 ) ) ( ( rule__TransitionDefinitions__TransitionsAssignment_2 )* )
            {
            // InternalNavigationRules.g:1073:2: ( ( rule__TransitionDefinitions__TransitionsAssignment_2 ) )
            // InternalNavigationRules.g:1074:3: ( rule__TransitionDefinitions__TransitionsAssignment_2 )
            {
             before(grammarAccess.getTransitionDefinitionsAccess().getTransitionsAssignment_2()); 
            // InternalNavigationRules.g:1075:3: ( rule__TransitionDefinitions__TransitionsAssignment_2 )
            // InternalNavigationRules.g:1075:4: rule__TransitionDefinitions__TransitionsAssignment_2
            {
            pushFollow(FOLLOW_18);
            rule__TransitionDefinitions__TransitionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionDefinitionsAccess().getTransitionsAssignment_2()); 

            }

            // InternalNavigationRules.g:1078:2: ( ( rule__TransitionDefinitions__TransitionsAssignment_2 )* )
            // InternalNavigationRules.g:1079:3: ( rule__TransitionDefinitions__TransitionsAssignment_2 )*
            {
             before(grammarAccess.getTransitionDefinitionsAccess().getTransitionsAssignment_2()); 
            // InternalNavigationRules.g:1080:3: ( rule__TransitionDefinitions__TransitionsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalNavigationRules.g:1080:4: rule__TransitionDefinitions__TransitionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TransitionDefinitions__TransitionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTransitionDefinitionsAccess().getTransitionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinitions__Group__2__Impl"


    // $ANTLR start "rule__TransitionDefinitions__Group__3"
    // InternalNavigationRules.g:1089:1: rule__TransitionDefinitions__Group__3 : rule__TransitionDefinitions__Group__3__Impl ;
    public final void rule__TransitionDefinitions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1093:1: ( rule__TransitionDefinitions__Group__3__Impl )
            // InternalNavigationRules.g:1094:2: rule__TransitionDefinitions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionDefinitions__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinitions__Group__3"


    // $ANTLR start "rule__TransitionDefinitions__Group__3__Impl"
    // InternalNavigationRules.g:1100:1: rule__TransitionDefinitions__Group__3__Impl : ( '}' ) ;
    public final void rule__TransitionDefinitions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1104:1: ( ( '}' ) )
            // InternalNavigationRules.g:1105:1: ( '}' )
            {
            // InternalNavigationRules.g:1105:1: ( '}' )
            // InternalNavigationRules.g:1106:2: '}'
            {
             before(grammarAccess.getTransitionDefinitionsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransitionDefinitionsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinitions__Group__3__Impl"


    // $ANTLR start "rule__TransitionDefinition__Group__0"
    // InternalNavigationRules.g:1116:1: rule__TransitionDefinition__Group__0 : rule__TransitionDefinition__Group__0__Impl rule__TransitionDefinition__Group__1 ;
    public final void rule__TransitionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1120:1: ( rule__TransitionDefinition__Group__0__Impl rule__TransitionDefinition__Group__1 )
            // InternalNavigationRules.g:1121:2: rule__TransitionDefinition__Group__0__Impl rule__TransitionDefinition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TransitionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinition__Group__0"


    // $ANTLR start "rule__TransitionDefinition__Group__0__Impl"
    // InternalNavigationRules.g:1128:1: rule__TransitionDefinition__Group__0__Impl : ( 'define' ) ;
    public final void rule__TransitionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1132:1: ( ( 'define' ) )
            // InternalNavigationRules.g:1133:1: ( 'define' )
            {
            // InternalNavigationRules.g:1133:1: ( 'define' )
            // InternalNavigationRules.g:1134:2: 'define'
            {
             before(grammarAccess.getTransitionDefinitionAccess().getDefineKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionDefinitionAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinition__Group__0__Impl"


    // $ANTLR start "rule__TransitionDefinition__Group__1"
    // InternalNavigationRules.g:1143:1: rule__TransitionDefinition__Group__1 : rule__TransitionDefinition__Group__1__Impl rule__TransitionDefinition__Group__2 ;
    public final void rule__TransitionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1147:1: ( rule__TransitionDefinition__Group__1__Impl rule__TransitionDefinition__Group__2 )
            // InternalNavigationRules.g:1148:2: rule__TransitionDefinition__Group__1__Impl rule__TransitionDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TransitionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinition__Group__1"


    // $ANTLR start "rule__TransitionDefinition__Group__1__Impl"
    // InternalNavigationRules.g:1155:1: rule__TransitionDefinition__Group__1__Impl : ( 'navigation' ) ;
    public final void rule__TransitionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1159:1: ( ( 'navigation' ) )
            // InternalNavigationRules.g:1160:1: ( 'navigation' )
            {
            // InternalNavigationRules.g:1160:1: ( 'navigation' )
            // InternalNavigationRules.g:1161:2: 'navigation'
            {
             before(grammarAccess.getTransitionDefinitionAccess().getNavigationKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTransitionDefinitionAccess().getNavigationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinition__Group__1__Impl"


    // $ANTLR start "rule__TransitionDefinition__Group__2"
    // InternalNavigationRules.g:1170:1: rule__TransitionDefinition__Group__2 : rule__TransitionDefinition__Group__2__Impl ;
    public final void rule__TransitionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1174:1: ( rule__TransitionDefinition__Group__2__Impl )
            // InternalNavigationRules.g:1175:2: rule__TransitionDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinition__Group__2"


    // $ANTLR start "rule__TransitionDefinition__Group__2__Impl"
    // InternalNavigationRules.g:1181:1: rule__TransitionDefinition__Group__2__Impl : ( ( rule__TransitionDefinition__NameAssignment_2 ) ) ;
    public final void rule__TransitionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1185:1: ( ( ( rule__TransitionDefinition__NameAssignment_2 ) ) )
            // InternalNavigationRules.g:1186:1: ( ( rule__TransitionDefinition__NameAssignment_2 ) )
            {
            // InternalNavigationRules.g:1186:1: ( ( rule__TransitionDefinition__NameAssignment_2 ) )
            // InternalNavigationRules.g:1187:2: ( rule__TransitionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getTransitionDefinitionAccess().getNameAssignment_2()); 
            // InternalNavigationRules.g:1188:2: ( rule__TransitionDefinition__NameAssignment_2 )
            // InternalNavigationRules.g:1188:3: rule__TransitionDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinition__Group__2__Impl"


    // $ANTLR start "rule__NavigationRules__Group__0"
    // InternalNavigationRules.g:1197:1: rule__NavigationRules__Group__0 : rule__NavigationRules__Group__0__Impl rule__NavigationRules__Group__1 ;
    public final void rule__NavigationRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1201:1: ( rule__NavigationRules__Group__0__Impl rule__NavigationRules__Group__1 )
            // InternalNavigationRules.g:1202:2: rule__NavigationRules__Group__0__Impl rule__NavigationRules__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NavigationRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigationRules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationRules__Group__0"


    // $ANTLR start "rule__NavigationRules__Group__0__Impl"
    // InternalNavigationRules.g:1209:1: rule__NavigationRules__Group__0__Impl : ( 'navrules' ) ;
    public final void rule__NavigationRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1213:1: ( ( 'navrules' ) )
            // InternalNavigationRules.g:1214:1: ( 'navrules' )
            {
            // InternalNavigationRules.g:1214:1: ( 'navrules' )
            // InternalNavigationRules.g:1215:2: 'navrules'
            {
             before(grammarAccess.getNavigationRulesAccess().getNavrulesKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNavigationRulesAccess().getNavrulesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationRules__Group__0__Impl"


    // $ANTLR start "rule__NavigationRules__Group__1"
    // InternalNavigationRules.g:1224:1: rule__NavigationRules__Group__1 : rule__NavigationRules__Group__1__Impl rule__NavigationRules__Group__2 ;
    public final void rule__NavigationRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1228:1: ( rule__NavigationRules__Group__1__Impl rule__NavigationRules__Group__2 )
            // InternalNavigationRules.g:1229:2: rule__NavigationRules__Group__1__Impl rule__NavigationRules__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__NavigationRules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigationRules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationRules__Group__1"


    // $ANTLR start "rule__NavigationRules__Group__1__Impl"
    // InternalNavigationRules.g:1236:1: rule__NavigationRules__Group__1__Impl : ( '{' ) ;
    public final void rule__NavigationRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1240:1: ( ( '{' ) )
            // InternalNavigationRules.g:1241:1: ( '{' )
            {
            // InternalNavigationRules.g:1241:1: ( '{' )
            // InternalNavigationRules.g:1242:2: '{'
            {
             before(grammarAccess.getNavigationRulesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNavigationRulesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationRules__Group__1__Impl"


    // $ANTLR start "rule__NavigationRules__Group__2"
    // InternalNavigationRules.g:1251:1: rule__NavigationRules__Group__2 : rule__NavigationRules__Group__2__Impl rule__NavigationRules__Group__3 ;
    public final void rule__NavigationRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1255:1: ( rule__NavigationRules__Group__2__Impl rule__NavigationRules__Group__3 )
            // InternalNavigationRules.g:1256:2: rule__NavigationRules__Group__2__Impl rule__NavigationRules__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__NavigationRules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigationRules__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationRules__Group__2"


    // $ANTLR start "rule__NavigationRules__Group__2__Impl"
    // InternalNavigationRules.g:1263:1: rule__NavigationRules__Group__2__Impl : ( ( ( rule__NavigationRules__RulesAssignment_2 ) ) ( ( rule__NavigationRules__RulesAssignment_2 )* ) ) ;
    public final void rule__NavigationRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1267:1: ( ( ( ( rule__NavigationRules__RulesAssignment_2 ) ) ( ( rule__NavigationRules__RulesAssignment_2 )* ) ) )
            // InternalNavigationRules.g:1268:1: ( ( ( rule__NavigationRules__RulesAssignment_2 ) ) ( ( rule__NavigationRules__RulesAssignment_2 )* ) )
            {
            // InternalNavigationRules.g:1268:1: ( ( ( rule__NavigationRules__RulesAssignment_2 ) ) ( ( rule__NavigationRules__RulesAssignment_2 )* ) )
            // InternalNavigationRules.g:1269:2: ( ( rule__NavigationRules__RulesAssignment_2 ) ) ( ( rule__NavigationRules__RulesAssignment_2 )* )
            {
            // InternalNavigationRules.g:1269:2: ( ( rule__NavigationRules__RulesAssignment_2 ) )
            // InternalNavigationRules.g:1270:3: ( rule__NavigationRules__RulesAssignment_2 )
            {
             before(grammarAccess.getNavigationRulesAccess().getRulesAssignment_2()); 
            // InternalNavigationRules.g:1271:3: ( rule__NavigationRules__RulesAssignment_2 )
            // InternalNavigationRules.g:1271:4: rule__NavigationRules__RulesAssignment_2
            {
            pushFollow(FOLLOW_21);
            rule__NavigationRules__RulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNavigationRulesAccess().getRulesAssignment_2()); 

            }

            // InternalNavigationRules.g:1274:2: ( ( rule__NavigationRules__RulesAssignment_2 )* )
            // InternalNavigationRules.g:1275:3: ( rule__NavigationRules__RulesAssignment_2 )*
            {
             before(grammarAccess.getNavigationRulesAccess().getRulesAssignment_2()); 
            // InternalNavigationRules.g:1276:3: ( rule__NavigationRules__RulesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNavigationRules.g:1276:4: rule__NavigationRules__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__NavigationRules__RulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNavigationRulesAccess().getRulesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationRules__Group__2__Impl"


    // $ANTLR start "rule__NavigationRules__Group__3"
    // InternalNavigationRules.g:1285:1: rule__NavigationRules__Group__3 : rule__NavigationRules__Group__3__Impl ;
    public final void rule__NavigationRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1289:1: ( rule__NavigationRules__Group__3__Impl )
            // InternalNavigationRules.g:1290:2: rule__NavigationRules__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigationRules__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationRules__Group__3"


    // $ANTLR start "rule__NavigationRules__Group__3__Impl"
    // InternalNavigationRules.g:1296:1: rule__NavigationRules__Group__3__Impl : ( '}' ) ;
    public final void rule__NavigationRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1300:1: ( ( '}' ) )
            // InternalNavigationRules.g:1301:1: ( '}' )
            {
            // InternalNavigationRules.g:1301:1: ( '}' )
            // InternalNavigationRules.g:1302:2: '}'
            {
             before(grammarAccess.getNavigationRulesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNavigationRulesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationRules__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalNavigationRules.g:1312:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1316:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalNavigationRules.g:1317:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalNavigationRules.g:1324:1: rule__Rule__Group__0__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1328:1: ( ( 'from' ) )
            // InternalNavigationRules.g:1329:1: ( 'from' )
            {
            // InternalNavigationRules.g:1329:1: ( 'from' )
            // InternalNavigationRules.g:1330:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalNavigationRules.g:1339:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1343:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalNavigationRules.g:1344:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalNavigationRules.g:1351:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__SourceAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1355:1: ( ( ( rule__Rule__SourceAssignment_1 ) ) )
            // InternalNavigationRules.g:1356:1: ( ( rule__Rule__SourceAssignment_1 ) )
            {
            // InternalNavigationRules.g:1356:1: ( ( rule__Rule__SourceAssignment_1 ) )
            // InternalNavigationRules.g:1357:2: ( rule__Rule__SourceAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getSourceAssignment_1()); 
            // InternalNavigationRules.g:1358:2: ( rule__Rule__SourceAssignment_1 )
            // InternalNavigationRules.g:1358:3: rule__Rule__SourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalNavigationRules.g:1366:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1370:1: ( rule__Rule__Group__2__Impl )
            // InternalNavigationRules.g:1371:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalNavigationRules.g:1377:1: rule__Rule__Group__2__Impl : ( ( ( rule__Rule__DestinationsAssignment_2 ) ) ( ( rule__Rule__DestinationsAssignment_2 )* ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1381:1: ( ( ( ( rule__Rule__DestinationsAssignment_2 ) ) ( ( rule__Rule__DestinationsAssignment_2 )* ) ) )
            // InternalNavigationRules.g:1382:1: ( ( ( rule__Rule__DestinationsAssignment_2 ) ) ( ( rule__Rule__DestinationsAssignment_2 )* ) )
            {
            // InternalNavigationRules.g:1382:1: ( ( ( rule__Rule__DestinationsAssignment_2 ) ) ( ( rule__Rule__DestinationsAssignment_2 )* ) )
            // InternalNavigationRules.g:1383:2: ( ( rule__Rule__DestinationsAssignment_2 ) ) ( ( rule__Rule__DestinationsAssignment_2 )* )
            {
            // InternalNavigationRules.g:1383:2: ( ( rule__Rule__DestinationsAssignment_2 ) )
            // InternalNavigationRules.g:1384:3: ( rule__Rule__DestinationsAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getDestinationsAssignment_2()); 
            // InternalNavigationRules.g:1385:3: ( rule__Rule__DestinationsAssignment_2 )
            // InternalNavigationRules.g:1385:4: rule__Rule__DestinationsAssignment_2
            {
            pushFollow(FOLLOW_23);
            rule__Rule__DestinationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDestinationsAssignment_2()); 

            }

            // InternalNavigationRules.g:1388:2: ( ( rule__Rule__DestinationsAssignment_2 )* )
            // InternalNavigationRules.g:1389:3: ( rule__Rule__DestinationsAssignment_2 )*
            {
             before(grammarAccess.getRuleAccess().getDestinationsAssignment_2()); 
            // InternalNavigationRules.g:1390:3: ( rule__Rule__DestinationsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNavigationRules.g:1390:4: rule__Rule__DestinationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Rule__DestinationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getDestinationsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Destination__Group__0"
    // InternalNavigationRules.g:1400:1: rule__Destination__Group__0 : rule__Destination__Group__0__Impl rule__Destination__Group__1 ;
    public final void rule__Destination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1404:1: ( rule__Destination__Group__0__Impl rule__Destination__Group__1 )
            // InternalNavigationRules.g:1405:2: rule__Destination__Group__0__Impl rule__Destination__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Destination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__0"


    // $ANTLR start "rule__Destination__Group__0__Impl"
    // InternalNavigationRules.g:1412:1: rule__Destination__Group__0__Impl : ( 'on' ) ;
    public final void rule__Destination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1416:1: ( ( 'on' ) )
            // InternalNavigationRules.g:1417:1: ( 'on' )
            {
            // InternalNavigationRules.g:1417:1: ( 'on' )
            // InternalNavigationRules.g:1418:2: 'on'
            {
             before(grammarAccess.getDestinationAccess().getOnKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getOnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__0__Impl"


    // $ANTLR start "rule__Destination__Group__1"
    // InternalNavigationRules.g:1427:1: rule__Destination__Group__1 : rule__Destination__Group__1__Impl rule__Destination__Group__2 ;
    public final void rule__Destination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1431:1: ( rule__Destination__Group__1__Impl rule__Destination__Group__2 )
            // InternalNavigationRules.g:1432:2: rule__Destination__Group__1__Impl rule__Destination__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Destination__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__1"


    // $ANTLR start "rule__Destination__Group__1__Impl"
    // InternalNavigationRules.g:1439:1: rule__Destination__Group__1__Impl : ( 'navigation' ) ;
    public final void rule__Destination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1443:1: ( ( 'navigation' ) )
            // InternalNavigationRules.g:1444:1: ( 'navigation' )
            {
            // InternalNavigationRules.g:1444:1: ( 'navigation' )
            // InternalNavigationRules.g:1445:2: 'navigation'
            {
             before(grammarAccess.getDestinationAccess().getNavigationKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getNavigationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__1__Impl"


    // $ANTLR start "rule__Destination__Group__2"
    // InternalNavigationRules.g:1454:1: rule__Destination__Group__2 : rule__Destination__Group__2__Impl rule__Destination__Group__3 ;
    public final void rule__Destination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1458:1: ( rule__Destination__Group__2__Impl rule__Destination__Group__3 )
            // InternalNavigationRules.g:1459:2: rule__Destination__Group__2__Impl rule__Destination__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Destination__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__2"


    // $ANTLR start "rule__Destination__Group__2__Impl"
    // InternalNavigationRules.g:1466:1: rule__Destination__Group__2__Impl : ( ( rule__Destination__TransitionAssignment_2 ) ) ;
    public final void rule__Destination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1470:1: ( ( ( rule__Destination__TransitionAssignment_2 ) ) )
            // InternalNavigationRules.g:1471:1: ( ( rule__Destination__TransitionAssignment_2 ) )
            {
            // InternalNavigationRules.g:1471:1: ( ( rule__Destination__TransitionAssignment_2 ) )
            // InternalNavigationRules.g:1472:2: ( rule__Destination__TransitionAssignment_2 )
            {
             before(grammarAccess.getDestinationAccess().getTransitionAssignment_2()); 
            // InternalNavigationRules.g:1473:2: ( rule__Destination__TransitionAssignment_2 )
            // InternalNavigationRules.g:1473:3: rule__Destination__TransitionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Destination__TransitionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getTransitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__2__Impl"


    // $ANTLR start "rule__Destination__Group__3"
    // InternalNavigationRules.g:1481:1: rule__Destination__Group__3 : rule__Destination__Group__3__Impl rule__Destination__Group__4 ;
    public final void rule__Destination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1485:1: ( rule__Destination__Group__3__Impl rule__Destination__Group__4 )
            // InternalNavigationRules.g:1486:2: rule__Destination__Group__3__Impl rule__Destination__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Destination__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__3"


    // $ANTLR start "rule__Destination__Group__3__Impl"
    // InternalNavigationRules.g:1493:1: rule__Destination__Group__3__Impl : ( 'go' ) ;
    public final void rule__Destination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1497:1: ( ( 'go' ) )
            // InternalNavigationRules.g:1498:1: ( 'go' )
            {
            // InternalNavigationRules.g:1498:1: ( 'go' )
            // InternalNavigationRules.g:1499:2: 'go'
            {
             before(grammarAccess.getDestinationAccess().getGoKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getGoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__3__Impl"


    // $ANTLR start "rule__Destination__Group__4"
    // InternalNavigationRules.g:1508:1: rule__Destination__Group__4 : rule__Destination__Group__4__Impl rule__Destination__Group__5 ;
    public final void rule__Destination__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1512:1: ( rule__Destination__Group__4__Impl rule__Destination__Group__5 )
            // InternalNavigationRules.g:1513:2: rule__Destination__Group__4__Impl rule__Destination__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Destination__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__4"


    // $ANTLR start "rule__Destination__Group__4__Impl"
    // InternalNavigationRules.g:1520:1: rule__Destination__Group__4__Impl : ( 'to' ) ;
    public final void rule__Destination__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1524:1: ( ( 'to' ) )
            // InternalNavigationRules.g:1525:1: ( 'to' )
            {
            // InternalNavigationRules.g:1525:1: ( 'to' )
            // InternalNavigationRules.g:1526:2: 'to'
            {
             before(grammarAccess.getDestinationAccess().getToKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__4__Impl"


    // $ANTLR start "rule__Destination__Group__5"
    // InternalNavigationRules.g:1535:1: rule__Destination__Group__5 : rule__Destination__Group__5__Impl rule__Destination__Group__6 ;
    public final void rule__Destination__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1539:1: ( rule__Destination__Group__5__Impl rule__Destination__Group__6 )
            // InternalNavigationRules.g:1540:2: rule__Destination__Group__5__Impl rule__Destination__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Destination__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__5"


    // $ANTLR start "rule__Destination__Group__5__Impl"
    // InternalNavigationRules.g:1547:1: rule__Destination__Group__5__Impl : ( ( rule__Destination__TargetAssignment_5 ) ) ;
    public final void rule__Destination__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1551:1: ( ( ( rule__Destination__TargetAssignment_5 ) ) )
            // InternalNavigationRules.g:1552:1: ( ( rule__Destination__TargetAssignment_5 ) )
            {
            // InternalNavigationRules.g:1552:1: ( ( rule__Destination__TargetAssignment_5 ) )
            // InternalNavigationRules.g:1553:2: ( rule__Destination__TargetAssignment_5 )
            {
             before(grammarAccess.getDestinationAccess().getTargetAssignment_5()); 
            // InternalNavigationRules.g:1554:2: ( rule__Destination__TargetAssignment_5 )
            // InternalNavigationRules.g:1554:3: rule__Destination__TargetAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Destination__TargetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getTargetAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__5__Impl"


    // $ANTLR start "rule__Destination__Group__6"
    // InternalNavigationRules.g:1562:1: rule__Destination__Group__6 : rule__Destination__Group__6__Impl ;
    public final void rule__Destination__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1566:1: ( rule__Destination__Group__6__Impl )
            // InternalNavigationRules.g:1567:2: rule__Destination__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__6"


    // $ANTLR start "rule__Destination__Group__6__Impl"
    // InternalNavigationRules.g:1573:1: rule__Destination__Group__6__Impl : ( ( rule__Destination__PermissionsAssignment_6 )* ) ;
    public final void rule__Destination__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1577:1: ( ( ( rule__Destination__PermissionsAssignment_6 )* ) )
            // InternalNavigationRules.g:1578:1: ( ( rule__Destination__PermissionsAssignment_6 )* )
            {
            // InternalNavigationRules.g:1578:1: ( ( rule__Destination__PermissionsAssignment_6 )* )
            // InternalNavigationRules.g:1579:2: ( rule__Destination__PermissionsAssignment_6 )*
            {
             before(grammarAccess.getDestinationAccess().getPermissionsAssignment_6()); 
            // InternalNavigationRules.g:1580:2: ( rule__Destination__PermissionsAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalNavigationRules.g:1580:3: rule__Destination__PermissionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Destination__PermissionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDestinationAccess().getPermissionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__6__Impl"


    // $ANTLR start "rule__PermissionReference__Group__0"
    // InternalNavigationRules.g:1589:1: rule__PermissionReference__Group__0 : rule__PermissionReference__Group__0__Impl rule__PermissionReference__Group__1 ;
    public final void rule__PermissionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1593:1: ( rule__PermissionReference__Group__0__Impl rule__PermissionReference__Group__1 )
            // InternalNavigationRules.g:1594:2: rule__PermissionReference__Group__0__Impl rule__PermissionReference__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PermissionReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PermissionReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionReference__Group__0"


    // $ANTLR start "rule__PermissionReference__Group__0__Impl"
    // InternalNavigationRules.g:1601:1: rule__PermissionReference__Group__0__Impl : ( 'with' ) ;
    public final void rule__PermissionReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1605:1: ( ( 'with' ) )
            // InternalNavigationRules.g:1606:1: ( 'with' )
            {
            // InternalNavigationRules.g:1606:1: ( 'with' )
            // InternalNavigationRules.g:1607:2: 'with'
            {
             before(grammarAccess.getPermissionReferenceAccess().getWithKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPermissionReferenceAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionReference__Group__0__Impl"


    // $ANTLR start "rule__PermissionReference__Group__1"
    // InternalNavigationRules.g:1616:1: rule__PermissionReference__Group__1 : rule__PermissionReference__Group__1__Impl ;
    public final void rule__PermissionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1620:1: ( rule__PermissionReference__Group__1__Impl )
            // InternalNavigationRules.g:1621:2: rule__PermissionReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PermissionReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionReference__Group__1"


    // $ANTLR start "rule__PermissionReference__Group__1__Impl"
    // InternalNavigationRules.g:1627:1: rule__PermissionReference__Group__1__Impl : ( ( rule__PermissionReference__PermissionAssignment_1 ) ) ;
    public final void rule__PermissionReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1631:1: ( ( ( rule__PermissionReference__PermissionAssignment_1 ) ) )
            // InternalNavigationRules.g:1632:1: ( ( rule__PermissionReference__PermissionAssignment_1 ) )
            {
            // InternalNavigationRules.g:1632:1: ( ( rule__PermissionReference__PermissionAssignment_1 ) )
            // InternalNavigationRules.g:1633:2: ( rule__PermissionReference__PermissionAssignment_1 )
            {
             before(grammarAccess.getPermissionReferenceAccess().getPermissionAssignment_1()); 
            // InternalNavigationRules.g:1634:2: ( rule__PermissionReference__PermissionAssignment_1 )
            // InternalNavigationRules.g:1634:3: rule__PermissionReference__PermissionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PermissionReference__PermissionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPermissionReferenceAccess().getPermissionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionReference__Group__1__Impl"


    // $ANTLR start "rule__Root__NameAssignment_3"
    // InternalNavigationRules.g:1643:1: rule__Root__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Root__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1647:1: ( ( RULE_ID ) )
            // InternalNavigationRules.g:1648:2: ( RULE_ID )
            {
            // InternalNavigationRules.g:1648:2: ( RULE_ID )
            // InternalNavigationRules.g:1649:3: RULE_ID
            {
             before(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__NameAssignment_3"


    // $ANTLR start "rule__Root__MappingsdefsAssignment_4"
    // InternalNavigationRules.g:1658:1: rule__Root__MappingsdefsAssignment_4 : ( ruleMappings ) ;
    public final void rule__Root__MappingsdefsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1662:1: ( ( ruleMappings ) )
            // InternalNavigationRules.g:1663:2: ( ruleMappings )
            {
            // InternalNavigationRules.g:1663:2: ( ruleMappings )
            // InternalNavigationRules.g:1664:3: ruleMappings
            {
             before(grammarAccess.getRootAccess().getMappingsdefsMappingsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMappings();

            state._fsp--;

             after(grammarAccess.getRootAccess().getMappingsdefsMappingsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__MappingsdefsAssignment_4"


    // $ANTLR start "rule__Root__TransitiondefsAssignment_5"
    // InternalNavigationRules.g:1673:1: rule__Root__TransitiondefsAssignment_5 : ( ruleTransitionDefinitions ) ;
    public final void rule__Root__TransitiondefsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1677:1: ( ( ruleTransitionDefinitions ) )
            // InternalNavigationRules.g:1678:2: ( ruleTransitionDefinitions )
            {
            // InternalNavigationRules.g:1678:2: ( ruleTransitionDefinitions )
            // InternalNavigationRules.g:1679:3: ruleTransitionDefinitions
            {
             before(grammarAccess.getRootAccess().getTransitiondefsTransitionDefinitionsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionDefinitions();

            state._fsp--;

             after(grammarAccess.getRootAccess().getTransitiondefsTransitionDefinitionsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__TransitiondefsAssignment_5"


    // $ANTLR start "rule__Root__RuledefsAssignment_6"
    // InternalNavigationRules.g:1688:1: rule__Root__RuledefsAssignment_6 : ( ruleNavigationRules ) ;
    public final void rule__Root__RuledefsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1692:1: ( ( ruleNavigationRules ) )
            // InternalNavigationRules.g:1693:2: ( ruleNavigationRules )
            {
            // InternalNavigationRules.g:1693:2: ( ruleNavigationRules )
            // InternalNavigationRules.g:1694:3: ruleNavigationRules
            {
             before(grammarAccess.getRootAccess().getRuledefsNavigationRulesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigationRules();

            state._fsp--;

             after(grammarAccess.getRootAccess().getRuledefsNavigationRulesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__RuledefsAssignment_6"


    // $ANTLR start "rule__Mappings__MappingsAssignment_2"
    // InternalNavigationRules.g:1703:1: rule__Mappings__MappingsAssignment_2 : ( ruleMapping ) ;
    public final void rule__Mappings__MappingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1707:1: ( ( ruleMapping ) )
            // InternalNavigationRules.g:1708:2: ( ruleMapping )
            {
            // InternalNavigationRules.g:1708:2: ( ruleMapping )
            // InternalNavigationRules.g:1709:3: ruleMapping
            {
             before(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__MappingsAssignment_2"


    // $ANTLR start "rule__PermissionMappingSpec__NameAssignment_1"
    // InternalNavigationRules.g:1718:1: rule__PermissionMappingSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PermissionMappingSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1722:1: ( ( RULE_ID ) )
            // InternalNavigationRules.g:1723:2: ( RULE_ID )
            {
            // InternalNavigationRules.g:1723:2: ( RULE_ID )
            // InternalNavigationRules.g:1724:3: RULE_ID
            {
             before(grammarAccess.getPermissionMappingSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPermissionMappingSpecAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__NameAssignment_1"


    // $ANTLR start "rule__PermissionMappingSpec__ValueAssignment_3"
    // InternalNavigationRules.g:1733:1: rule__PermissionMappingSpec__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__PermissionMappingSpec__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1737:1: ( ( RULE_STRING ) )
            // InternalNavigationRules.g:1738:2: ( RULE_STRING )
            {
            // InternalNavigationRules.g:1738:2: ( RULE_STRING )
            // InternalNavigationRules.g:1739:3: RULE_STRING
            {
             before(grammarAccess.getPermissionMappingSpecAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPermissionMappingSpecAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionMappingSpec__ValueAssignment_3"


    // $ANTLR start "rule__CoordinateMappingSpec__NameAssignment_1"
    // InternalNavigationRules.g:1748:1: rule__CoordinateMappingSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinateMappingSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1752:1: ( ( RULE_ID ) )
            // InternalNavigationRules.g:1753:2: ( RULE_ID )
            {
            // InternalNavigationRules.g:1753:2: ( RULE_ID )
            // InternalNavigationRules.g:1754:3: RULE_ID
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinateMappingSpecAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__NameAssignment_1"


    // $ANTLR start "rule__CoordinateMappingSpec__ControllernameAssignment_3"
    // InternalNavigationRules.g:1763:1: rule__CoordinateMappingSpec__ControllernameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CoordinateMappingSpec__ControllernameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1767:1: ( ( RULE_STRING ) )
            // InternalNavigationRules.g:1768:2: ( RULE_STRING )
            {
            // InternalNavigationRules.g:1768:2: ( RULE_STRING )
            // InternalNavigationRules.g:1769:3: RULE_STRING
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getControllernameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCoordinateMappingSpecAccess().getControllernameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__ControllernameAssignment_3"


    // $ANTLR start "rule__CoordinateMappingSpec__BundleidAssignment_5"
    // InternalNavigationRules.g:1778:1: rule__CoordinateMappingSpec__BundleidAssignment_5 : ( RULE_STRING ) ;
    public final void rule__CoordinateMappingSpec__BundleidAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1782:1: ( ( RULE_STRING ) )
            // InternalNavigationRules.g:1783:2: ( RULE_STRING )
            {
            // InternalNavigationRules.g:1783:2: ( RULE_STRING )
            // InternalNavigationRules.g:1784:3: RULE_STRING
            {
             before(grammarAccess.getCoordinateMappingSpecAccess().getBundleidSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCoordinateMappingSpecAccess().getBundleidSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateMappingSpec__BundleidAssignment_5"


    // $ANTLR start "rule__TransitionDefinitions__TransitionsAssignment_2"
    // InternalNavigationRules.g:1793:1: rule__TransitionDefinitions__TransitionsAssignment_2 : ( ruleTransitionDefinition ) ;
    public final void rule__TransitionDefinitions__TransitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1797:1: ( ( ruleTransitionDefinition ) )
            // InternalNavigationRules.g:1798:2: ( ruleTransitionDefinition )
            {
            // InternalNavigationRules.g:1798:2: ( ruleTransitionDefinition )
            // InternalNavigationRules.g:1799:3: ruleTransitionDefinition
            {
             before(grammarAccess.getTransitionDefinitionsAccess().getTransitionsTransitionDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionDefinition();

            state._fsp--;

             after(grammarAccess.getTransitionDefinitionsAccess().getTransitionsTransitionDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinitions__TransitionsAssignment_2"


    // $ANTLR start "rule__TransitionDefinition__NameAssignment_2"
    // InternalNavigationRules.g:1808:1: rule__TransitionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TransitionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1812:1: ( ( RULE_ID ) )
            // InternalNavigationRules.g:1813:2: ( RULE_ID )
            {
            // InternalNavigationRules.g:1813:2: ( RULE_ID )
            // InternalNavigationRules.g:1814:3: RULE_ID
            {
             before(grammarAccess.getTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionDefinition__NameAssignment_2"


    // $ANTLR start "rule__NavigationRules__RulesAssignment_2"
    // InternalNavigationRules.g:1823:1: rule__NavigationRules__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__NavigationRules__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1827:1: ( ( ruleRule ) )
            // InternalNavigationRules.g:1828:2: ( ruleRule )
            {
            // InternalNavigationRules.g:1828:2: ( ruleRule )
            // InternalNavigationRules.g:1829:3: ruleRule
            {
             before(grammarAccess.getNavigationRulesAccess().getRulesRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getNavigationRulesAccess().getRulesRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationRules__RulesAssignment_2"


    // $ANTLR start "rule__Rule__SourceAssignment_1"
    // InternalNavigationRules.g:1838:1: rule__Rule__SourceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1842:1: ( ( ( RULE_ID ) ) )
            // InternalNavigationRules.g:1843:2: ( ( RULE_ID ) )
            {
            // InternalNavigationRules.g:1843:2: ( ( RULE_ID ) )
            // InternalNavigationRules.g:1844:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecCrossReference_1_0()); 
            // InternalNavigationRules.g:1845:3: ( RULE_ID )
            // InternalNavigationRules.g:1846:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__SourceAssignment_1"


    // $ANTLR start "rule__Rule__DestinationsAssignment_2"
    // InternalNavigationRules.g:1857:1: rule__Rule__DestinationsAssignment_2 : ( ruleDestination ) ;
    public final void rule__Rule__DestinationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1861:1: ( ( ruleDestination ) )
            // InternalNavigationRules.g:1862:2: ( ruleDestination )
            {
            // InternalNavigationRules.g:1862:2: ( ruleDestination )
            // InternalNavigationRules.g:1863:3: ruleDestination
            {
             before(grammarAccess.getRuleAccess().getDestinationsDestinationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDestination();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDestinationsDestinationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DestinationsAssignment_2"


    // $ANTLR start "rule__Destination__TransitionAssignment_2"
    // InternalNavigationRules.g:1872:1: rule__Destination__TransitionAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Destination__TransitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1876:1: ( ( ( RULE_ID ) ) )
            // InternalNavigationRules.g:1877:2: ( ( RULE_ID ) )
            {
            // InternalNavigationRules.g:1877:2: ( ( RULE_ID ) )
            // InternalNavigationRules.g:1878:3: ( RULE_ID )
            {
             before(grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionCrossReference_2_0()); 
            // InternalNavigationRules.g:1879:3: ( RULE_ID )
            // InternalNavigationRules.g:1880:4: RULE_ID
            {
             before(grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__TransitionAssignment_2"


    // $ANTLR start "rule__Destination__TargetAssignment_5"
    // InternalNavigationRules.g:1891:1: rule__Destination__TargetAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Destination__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1895:1: ( ( ( RULE_ID ) ) )
            // InternalNavigationRules.g:1896:2: ( ( RULE_ID ) )
            {
            // InternalNavigationRules.g:1896:2: ( ( RULE_ID ) )
            // InternalNavigationRules.g:1897:3: ( RULE_ID )
            {
             before(grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecCrossReference_5_0()); 
            // InternalNavigationRules.g:1898:3: ( RULE_ID )
            // InternalNavigationRules.g:1899:4: RULE_ID
            {
             before(grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__TargetAssignment_5"


    // $ANTLR start "rule__Destination__PermissionsAssignment_6"
    // InternalNavigationRules.g:1910:1: rule__Destination__PermissionsAssignment_6 : ( rulePermissionReference ) ;
    public final void rule__Destination__PermissionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1914:1: ( ( rulePermissionReference ) )
            // InternalNavigationRules.g:1915:2: ( rulePermissionReference )
            {
            // InternalNavigationRules.g:1915:2: ( rulePermissionReference )
            // InternalNavigationRules.g:1916:3: rulePermissionReference
            {
             before(grammarAccess.getDestinationAccess().getPermissionsPermissionReferenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePermissionReference();

            state._fsp--;

             after(grammarAccess.getDestinationAccess().getPermissionsPermissionReferenceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__PermissionsAssignment_6"


    // $ANTLR start "rule__PermissionReference__PermissionAssignment_1"
    // InternalNavigationRules.g:1925:1: rule__PermissionReference__PermissionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PermissionReference__PermissionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNavigationRules.g:1929:1: ( ( ( RULE_ID ) ) )
            // InternalNavigationRules.g:1930:2: ( ( RULE_ID ) )
            {
            // InternalNavigationRules.g:1930:2: ( ( RULE_ID ) )
            // InternalNavigationRules.g:1931:3: ( RULE_ID )
            {
             before(grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecCrossReference_1_0()); 
            // InternalNavigationRules.g:1932:3: ( RULE_ID )
            // InternalNavigationRules.g:1933:4: RULE_ID
            {
             before(grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionReference__PermissionAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000002L});

}