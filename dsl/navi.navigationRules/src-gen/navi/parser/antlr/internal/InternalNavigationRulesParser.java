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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNavigationRulesParser extends AbstractInternalAntlrParser {
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




    // $ANTLR start "entryRuleRoot"
    // InternalNavigationRules.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalNavigationRules.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalNavigationRules.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalNavigationRules.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'navigation' otherlv_1= 'rules' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) ( (lv_mappingsdefs_4_0= ruleMappings ) ) ( (lv_transitiondefs_5_0= ruleTransitionDefinitions ) ) ( (lv_ruledefs_6_0= ruleNavigationRules ) ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_mappingsdefs_4_0 = null;

        EObject lv_transitiondefs_5_0 = null;

        EObject lv_ruledefs_6_0 = null;



        	enterRule();

        try {
            // InternalNavigationRules.g:77:2: ( (otherlv_0= 'navigation' otherlv_1= 'rules' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) ( (lv_mappingsdefs_4_0= ruleMappings ) ) ( (lv_transitiondefs_5_0= ruleTransitionDefinitions ) ) ( (lv_ruledefs_6_0= ruleNavigationRules ) ) ) )
            // InternalNavigationRules.g:78:2: (otherlv_0= 'navigation' otherlv_1= 'rules' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) ( (lv_mappingsdefs_4_0= ruleMappings ) ) ( (lv_transitiondefs_5_0= ruleTransitionDefinitions ) ) ( (lv_ruledefs_6_0= ruleNavigationRules ) ) )
            {
            // InternalNavigationRules.g:78:2: (otherlv_0= 'navigation' otherlv_1= 'rules' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) ( (lv_mappingsdefs_4_0= ruleMappings ) ) ( (lv_transitiondefs_5_0= ruleTransitionDefinitions ) ) ( (lv_ruledefs_6_0= ruleNavigationRules ) ) )
            // InternalNavigationRules.g:79:3: otherlv_0= 'navigation' otherlv_1= 'rules' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) ( (lv_mappingsdefs_4_0= ruleMappings ) ) ( (lv_transitiondefs_5_0= ruleTransitionDefinitions ) ) ( (lv_ruledefs_6_0= ruleNavigationRules ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getNavigationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRulesKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getForKeyword_2());
            		
            // InternalNavigationRules.g:91:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalNavigationRules.g:92:4: (lv_name_3_0= RULE_ID )
            {
            // InternalNavigationRules.g:92:4: (lv_name_3_0= RULE_ID )
            // InternalNavigationRules.g:93:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getRootAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRootRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalNavigationRules.g:109:3: ( (lv_mappingsdefs_4_0= ruleMappings ) )
            // InternalNavigationRules.g:110:4: (lv_mappingsdefs_4_0= ruleMappings )
            {
            // InternalNavigationRules.g:110:4: (lv_mappingsdefs_4_0= ruleMappings )
            // InternalNavigationRules.g:111:5: lv_mappingsdefs_4_0= ruleMappings
            {

            					newCompositeNode(grammarAccess.getRootAccess().getMappingsdefsMappingsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_mappingsdefs_4_0=ruleMappings();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"mappingsdefs",
            						lv_mappingsdefs_4_0,
            						"navi.NavigationRules.Mappings");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNavigationRules.g:128:3: ( (lv_transitiondefs_5_0= ruleTransitionDefinitions ) )
            // InternalNavigationRules.g:129:4: (lv_transitiondefs_5_0= ruleTransitionDefinitions )
            {
            // InternalNavigationRules.g:129:4: (lv_transitiondefs_5_0= ruleTransitionDefinitions )
            // InternalNavigationRules.g:130:5: lv_transitiondefs_5_0= ruleTransitionDefinitions
            {

            					newCompositeNode(grammarAccess.getRootAccess().getTransitiondefsTransitionDefinitionsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_transitiondefs_5_0=ruleTransitionDefinitions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"transitiondefs",
            						lv_transitiondefs_5_0,
            						"navi.NavigationRules.TransitionDefinitions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNavigationRules.g:147:3: ( (lv_ruledefs_6_0= ruleNavigationRules ) )
            // InternalNavigationRules.g:148:4: (lv_ruledefs_6_0= ruleNavigationRules )
            {
            // InternalNavigationRules.g:148:4: (lv_ruledefs_6_0= ruleNavigationRules )
            // InternalNavigationRules.g:149:5: lv_ruledefs_6_0= ruleNavigationRules
            {

            					newCompositeNode(grammarAccess.getRootAccess().getRuledefsNavigationRulesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_ruledefs_6_0=ruleNavigationRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"ruledefs",
            						lv_ruledefs_6_0,
            						"navi.NavigationRules.NavigationRules");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleMappings"
    // InternalNavigationRules.g:170:1: entryRuleMappings returns [EObject current=null] : iv_ruleMappings= ruleMappings EOF ;
    public final EObject entryRuleMappings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappings = null;


        try {
            // InternalNavigationRules.g:170:49: (iv_ruleMappings= ruleMappings EOF )
            // InternalNavigationRules.g:171:2: iv_ruleMappings= ruleMappings EOF
            {
             newCompositeNode(grammarAccess.getMappingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappings=ruleMappings();

            state._fsp--;

             current =iv_ruleMappings; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappings"


    // $ANTLR start "ruleMappings"
    // InternalNavigationRules.g:177:1: ruleMappings returns [EObject current=null] : (otherlv_0= 'mappings' otherlv_1= '{' ( (lv_mappings_2_0= ruleMapping ) )+ otherlv_3= '}' ) ;
    public final EObject ruleMappings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mappings_2_0 = null;



        	enterRule();

        try {
            // InternalNavigationRules.g:183:2: ( (otherlv_0= 'mappings' otherlv_1= '{' ( (lv_mappings_2_0= ruleMapping ) )+ otherlv_3= '}' ) )
            // InternalNavigationRules.g:184:2: (otherlv_0= 'mappings' otherlv_1= '{' ( (lv_mappings_2_0= ruleMapping ) )+ otherlv_3= '}' )
            {
            // InternalNavigationRules.g:184:2: (otherlv_0= 'mappings' otherlv_1= '{' ( (lv_mappings_2_0= ruleMapping ) )+ otherlv_3= '}' )
            // InternalNavigationRules.g:185:3: otherlv_0= 'mappings' otherlv_1= '{' ( (lv_mappings_2_0= ruleMapping ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingsAccess().getMappingsKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalNavigationRules.g:193:3: ( (lv_mappings_2_0= ruleMapping ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNavigationRules.g:194:4: (lv_mappings_2_0= ruleMapping )
            	    {
            	    // InternalNavigationRules.g:194:4: (lv_mappings_2_0= ruleMapping )
            	    // InternalNavigationRules.g:195:5: lv_mappings_2_0= ruleMapping
            	    {

            	    					newCompositeNode(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_mappings_2_0=ruleMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMappingsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mappings",
            	    						lv_mappings_2_0,
            	    						"navi.NavigationRules.Mapping");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMappingsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappings"


    // $ANTLR start "entryRuleMapping"
    // InternalNavigationRules.g:220:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalNavigationRules.g:220:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalNavigationRules.g:221:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalNavigationRules.g:227:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'map' this_MappingSpec_1= ruleMappingSpec ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MappingSpec_1 = null;



        	enterRule();

        try {
            // InternalNavigationRules.g:233:2: ( (otherlv_0= 'map' this_MappingSpec_1= ruleMappingSpec ) )
            // InternalNavigationRules.g:234:2: (otherlv_0= 'map' this_MappingSpec_1= ruleMappingSpec )
            {
            // InternalNavigationRules.g:234:2: (otherlv_0= 'map' this_MappingSpec_1= ruleMappingSpec )
            // InternalNavigationRules.g:235:3: otherlv_0= 'map' this_MappingSpec_1= ruleMappingSpec
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMapKeyword_0());
            		

            			newCompositeNode(grammarAccess.getMappingAccess().getMappingSpecParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_MappingSpec_1=ruleMappingSpec();

            state._fsp--;


            			current = this_MappingSpec_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMappingSpec"
    // InternalNavigationRules.g:251:1: entryRuleMappingSpec returns [EObject current=null] : iv_ruleMappingSpec= ruleMappingSpec EOF ;
    public final EObject entryRuleMappingSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingSpec = null;


        try {
            // InternalNavigationRules.g:251:52: (iv_ruleMappingSpec= ruleMappingSpec EOF )
            // InternalNavigationRules.g:252:2: iv_ruleMappingSpec= ruleMappingSpec EOF
            {
             newCompositeNode(grammarAccess.getMappingSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingSpec=ruleMappingSpec();

            state._fsp--;

             current =iv_ruleMappingSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingSpec"


    // $ANTLR start "ruleMappingSpec"
    // InternalNavigationRules.g:258:1: ruleMappingSpec returns [EObject current=null] : (this_PermissionMappingSpec_0= rulePermissionMappingSpec | this_CoordinateMappingSpec_1= ruleCoordinateMappingSpec ) ;
    public final EObject ruleMappingSpec() throws RecognitionException {
        EObject current = null;

        EObject this_PermissionMappingSpec_0 = null;

        EObject this_CoordinateMappingSpec_1 = null;



        	enterRule();

        try {
            // InternalNavigationRules.g:264:2: ( (this_PermissionMappingSpec_0= rulePermissionMappingSpec | this_CoordinateMappingSpec_1= ruleCoordinateMappingSpec ) )
            // InternalNavigationRules.g:265:2: (this_PermissionMappingSpec_0= rulePermissionMappingSpec | this_CoordinateMappingSpec_1= ruleCoordinateMappingSpec )
            {
            // InternalNavigationRules.g:265:2: (this_PermissionMappingSpec_0= rulePermissionMappingSpec | this_CoordinateMappingSpec_1= ruleCoordinateMappingSpec )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalNavigationRules.g:266:3: this_PermissionMappingSpec_0= rulePermissionMappingSpec
                    {

                    			newCompositeNode(grammarAccess.getMappingSpecAccess().getPermissionMappingSpecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PermissionMappingSpec_0=rulePermissionMappingSpec();

                    state._fsp--;


                    			current = this_PermissionMappingSpec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNavigationRules.g:275:3: this_CoordinateMappingSpec_1= ruleCoordinateMappingSpec
                    {

                    			newCompositeNode(grammarAccess.getMappingSpecAccess().getCoordinateMappingSpecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoordinateMappingSpec_1=ruleCoordinateMappingSpec();

                    state._fsp--;


                    			current = this_CoordinateMappingSpec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingSpec"


    // $ANTLR start "entryRulePermissionMappingSpec"
    // InternalNavigationRules.g:287:1: entryRulePermissionMappingSpec returns [EObject current=null] : iv_rulePermissionMappingSpec= rulePermissionMappingSpec EOF ;
    public final EObject entryRulePermissionMappingSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionMappingSpec = null;


        try {
            // InternalNavigationRules.g:287:62: (iv_rulePermissionMappingSpec= rulePermissionMappingSpec EOF )
            // InternalNavigationRules.g:288:2: iv_rulePermissionMappingSpec= rulePermissionMappingSpec EOF
            {
             newCompositeNode(grammarAccess.getPermissionMappingSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissionMappingSpec=rulePermissionMappingSpec();

            state._fsp--;

             current =iv_rulePermissionMappingSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionMappingSpec"


    // $ANTLR start "rulePermissionMappingSpec"
    // InternalNavigationRules.g:294:1: rulePermissionMappingSpec returns [EObject current=null] : (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject rulePermissionMappingSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalNavigationRules.g:300:2: ( (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalNavigationRules.g:301:2: (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalNavigationRules.g:301:2: (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalNavigationRules.g:302:3: otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissionMappingSpecAccess().getPermissionKeyword_0());
            		
            // InternalNavigationRules.g:306:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNavigationRules.g:307:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNavigationRules.g:307:4: (lv_name_1_0= RULE_ID )
            // InternalNavigationRules.g:308:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPermissionMappingSpecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPermissionMappingSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPermissionMappingSpecAccess().getToKeyword_2());
            		
            // InternalNavigationRules.g:328:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalNavigationRules.g:329:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalNavigationRules.g:329:4: (lv_value_3_0= RULE_STRING )
            // InternalNavigationRules.g:330:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getPermissionMappingSpecAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPermissionMappingSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePermissionMappingSpec"


    // $ANTLR start "entryRuleCoordinateMappingSpec"
    // InternalNavigationRules.g:350:1: entryRuleCoordinateMappingSpec returns [EObject current=null] : iv_ruleCoordinateMappingSpec= ruleCoordinateMappingSpec EOF ;
    public final EObject entryRuleCoordinateMappingSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinateMappingSpec = null;


        try {
            // InternalNavigationRules.g:350:62: (iv_ruleCoordinateMappingSpec= ruleCoordinateMappingSpec EOF )
            // InternalNavigationRules.g:351:2: iv_ruleCoordinateMappingSpec= ruleCoordinateMappingSpec EOF
            {
             newCompositeNode(grammarAccess.getCoordinateMappingSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinateMappingSpec=ruleCoordinateMappingSpec();

            state._fsp--;

             current =iv_ruleCoordinateMappingSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinateMappingSpec"


    // $ANTLR start "ruleCoordinateMappingSpec"
    // InternalNavigationRules.g:357:1: ruleCoordinateMappingSpec returns [EObject current=null] : (otherlv_0= 'coordinate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_controllername_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_bundleid_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleCoordinateMappingSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_controllername_3_0=null;
        Token otherlv_4=null;
        Token lv_bundleid_5_0=null;


        	enterRule();

        try {
            // InternalNavigationRules.g:363:2: ( (otherlv_0= 'coordinate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_controllername_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_bundleid_5_0= RULE_STRING ) ) ) )
            // InternalNavigationRules.g:364:2: (otherlv_0= 'coordinate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_controllername_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_bundleid_5_0= RULE_STRING ) ) )
            {
            // InternalNavigationRules.g:364:2: (otherlv_0= 'coordinate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_controllername_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_bundleid_5_0= RULE_STRING ) ) )
            // InternalNavigationRules.g:365:3: otherlv_0= 'coordinate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_controllername_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_bundleid_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinateMappingSpecAccess().getCoordinateKeyword_0());
            		
            // InternalNavigationRules.g:369:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNavigationRules.g:370:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNavigationRules.g:370:4: (lv_name_1_0= RULE_ID )
            // InternalNavigationRules.g:371:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCoordinateMappingSpecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateMappingSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinateMappingSpecAccess().getToKeyword_2());
            		
            // InternalNavigationRules.g:391:3: ( (lv_controllername_3_0= RULE_STRING ) )
            // InternalNavigationRules.g:392:4: (lv_controllername_3_0= RULE_STRING )
            {
            // InternalNavigationRules.g:392:4: (lv_controllername_3_0= RULE_STRING )
            // InternalNavigationRules.g:393:5: lv_controllername_3_0= RULE_STRING
            {
            lv_controllername_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_controllername_3_0, grammarAccess.getCoordinateMappingSpecAccess().getControllernameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateMappingSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"controllername",
            						lv_controllername_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinateMappingSpecAccess().getInKeyword_4());
            		
            // InternalNavigationRules.g:413:3: ( (lv_bundleid_5_0= RULE_STRING ) )
            // InternalNavigationRules.g:414:4: (lv_bundleid_5_0= RULE_STRING )
            {
            // InternalNavigationRules.g:414:4: (lv_bundleid_5_0= RULE_STRING )
            // InternalNavigationRules.g:415:5: lv_bundleid_5_0= RULE_STRING
            {
            lv_bundleid_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_bundleid_5_0, grammarAccess.getCoordinateMappingSpecAccess().getBundleidSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateMappingSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bundleid",
            						lv_bundleid_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinateMappingSpec"


    // $ANTLR start "entryRuleTransitionDefinitions"
    // InternalNavigationRules.g:435:1: entryRuleTransitionDefinitions returns [EObject current=null] : iv_ruleTransitionDefinitions= ruleTransitionDefinitions EOF ;
    public final EObject entryRuleTransitionDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDefinitions = null;


        try {
            // InternalNavigationRules.g:435:62: (iv_ruleTransitionDefinitions= ruleTransitionDefinitions EOF )
            // InternalNavigationRules.g:436:2: iv_ruleTransitionDefinitions= ruleTransitionDefinitions EOF
            {
             newCompositeNode(grammarAccess.getTransitionDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionDefinitions=ruleTransitionDefinitions();

            state._fsp--;

             current =iv_ruleTransitionDefinitions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionDefinitions"


    // $ANTLR start "ruleTransitionDefinitions"
    // InternalNavigationRules.g:442:1: ruleTransitionDefinitions returns [EObject current=null] : (otherlv_0= 'navigations' otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionDefinition ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTransitionDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transitions_2_0 = null;



        	enterRule();

        try {
            // InternalNavigationRules.g:448:2: ( (otherlv_0= 'navigations' otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionDefinition ) )+ otherlv_3= '}' ) )
            // InternalNavigationRules.g:449:2: (otherlv_0= 'navigations' otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionDefinition ) )+ otherlv_3= '}' )
            {
            // InternalNavigationRules.g:449:2: (otherlv_0= 'navigations' otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionDefinition ) )+ otherlv_3= '}' )
            // InternalNavigationRules.g:450:3: otherlv_0= 'navigations' otherlv_1= '{' ( (lv_transitions_2_0= ruleTransitionDefinition ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDefinitionsAccess().getNavigationsKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionDefinitionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalNavigationRules.g:458:3: ( (lv_transitions_2_0= ruleTransitionDefinition ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalNavigationRules.g:459:4: (lv_transitions_2_0= ruleTransitionDefinition )
            	    {
            	    // InternalNavigationRules.g:459:4: (lv_transitions_2_0= ruleTransitionDefinition )
            	    // InternalNavigationRules.g:460:5: lv_transitions_2_0= ruleTransitionDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTransitionDefinitionsAccess().getTransitionsTransitionDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_transitions_2_0=ruleTransitionDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransitionDefinitionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_2_0,
            	    						"navi.NavigationRules.TransitionDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionDefinitionsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionDefinitions"


    // $ANTLR start "entryRuleTransitionDefinition"
    // InternalNavigationRules.g:485:1: entryRuleTransitionDefinition returns [EObject current=null] : iv_ruleTransitionDefinition= ruleTransitionDefinition EOF ;
    public final EObject entryRuleTransitionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDefinition = null;


        try {
            // InternalNavigationRules.g:485:61: (iv_ruleTransitionDefinition= ruleTransitionDefinition EOF )
            // InternalNavigationRules.g:486:2: iv_ruleTransitionDefinition= ruleTransitionDefinition EOF
            {
             newCompositeNode(grammarAccess.getTransitionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionDefinition=ruleTransitionDefinition();

            state._fsp--;

             current =iv_ruleTransitionDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionDefinition"


    // $ANTLR start "ruleTransitionDefinition"
    // InternalNavigationRules.g:492:1: ruleTransitionDefinition returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'navigation' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTransitionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalNavigationRules.g:498:2: ( (otherlv_0= 'define' otherlv_1= 'navigation' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalNavigationRules.g:499:2: (otherlv_0= 'define' otherlv_1= 'navigation' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalNavigationRules.g:499:2: (otherlv_0= 'define' otherlv_1= 'navigation' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalNavigationRules.g:500:3: otherlv_0= 'define' otherlv_1= 'navigation' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDefinitionAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionDefinitionAccess().getNavigationKeyword_1());
            		
            // InternalNavigationRules.g:508:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalNavigationRules.g:509:4: (lv_name_2_0= RULE_ID )
            {
            // InternalNavigationRules.g:509:4: (lv_name_2_0= RULE_ID )
            // InternalNavigationRules.g:510:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTransitionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionDefinition"


    // $ANTLR start "entryRuleNavigationRules"
    // InternalNavigationRules.g:530:1: entryRuleNavigationRules returns [EObject current=null] : iv_ruleNavigationRules= ruleNavigationRules EOF ;
    public final EObject entryRuleNavigationRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationRules = null;


        try {
            // InternalNavigationRules.g:530:56: (iv_ruleNavigationRules= ruleNavigationRules EOF )
            // InternalNavigationRules.g:531:2: iv_ruleNavigationRules= ruleNavigationRules EOF
            {
             newCompositeNode(grammarAccess.getNavigationRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationRules=ruleNavigationRules();

            state._fsp--;

             current =iv_ruleNavigationRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigationRules"


    // $ANTLR start "ruleNavigationRules"
    // InternalNavigationRules.g:537:1: ruleNavigationRules returns [EObject current=null] : (otherlv_0= 'navrules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )+ otherlv_3= '}' ) ;
    public final EObject ruleNavigationRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalNavigationRules.g:543:2: ( (otherlv_0= 'navrules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )+ otherlv_3= '}' ) )
            // InternalNavigationRules.g:544:2: (otherlv_0= 'navrules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )+ otherlv_3= '}' )
            {
            // InternalNavigationRules.g:544:2: (otherlv_0= 'navrules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )+ otherlv_3= '}' )
            // InternalNavigationRules.g:545:3: otherlv_0= 'navrules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigationRulesAccess().getNavrulesKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getNavigationRulesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalNavigationRules.g:553:3: ( (lv_rules_2_0= ruleRule ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNavigationRules.g:554:4: (lv_rules_2_0= ruleRule )
            	    {
            	    // InternalNavigationRules.g:554:4: (lv_rules_2_0= ruleRule )
            	    // InternalNavigationRules.g:555:5: lv_rules_2_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getNavigationRulesAccess().getRulesRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_rules_2_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNavigationRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"navi.NavigationRules.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNavigationRulesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigationRules"


    // $ANTLR start "entryRuleRule"
    // InternalNavigationRules.g:580:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalNavigationRules.g:580:45: (iv_ruleRule= ruleRule EOF )
            // InternalNavigationRules.g:581:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalNavigationRules.g:587:1: ruleRule returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (lv_destinations_2_0= ruleDestination ) )+ ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_destinations_2_0 = null;



        	enterRule();

        try {
            // InternalNavigationRules.g:593:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (lv_destinations_2_0= ruleDestination ) )+ ) )
            // InternalNavigationRules.g:594:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (lv_destinations_2_0= ruleDestination ) )+ )
            {
            // InternalNavigationRules.g:594:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (lv_destinations_2_0= ruleDestination ) )+ )
            // InternalNavigationRules.g:595:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) ( (lv_destinations_2_0= ruleDestination ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getFromKeyword_0());
            		
            // InternalNavigationRules.g:599:3: ( (otherlv_1= RULE_ID ) )
            // InternalNavigationRules.g:600:4: (otherlv_1= RULE_ID )
            {
            // InternalNavigationRules.g:600:4: (otherlv_1= RULE_ID )
            // InternalNavigationRules.g:601:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getSourceCoordinateMappingSpecCrossReference_1_0());
            				

            }


            }

            // InternalNavigationRules.g:612:3: ( (lv_destinations_2_0= ruleDestination ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNavigationRules.g:613:4: (lv_destinations_2_0= ruleDestination )
            	    {
            	    // InternalNavigationRules.g:613:4: (lv_destinations_2_0= ruleDestination )
            	    // InternalNavigationRules.g:614:5: lv_destinations_2_0= ruleDestination
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getDestinationsDestinationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_destinations_2_0=ruleDestination();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"destinations",
            	    						lv_destinations_2_0,
            	    						"navi.NavigationRules.Destination");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDestination"
    // InternalNavigationRules.g:635:1: entryRuleDestination returns [EObject current=null] : iv_ruleDestination= ruleDestination EOF ;
    public final EObject entryRuleDestination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestination = null;


        try {
            // InternalNavigationRules.g:635:52: (iv_ruleDestination= ruleDestination EOF )
            // InternalNavigationRules.g:636:2: iv_ruleDestination= ruleDestination EOF
            {
             newCompositeNode(grammarAccess.getDestinationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestination=ruleDestination();

            state._fsp--;

             current =iv_ruleDestination; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestination"


    // $ANTLR start "ruleDestination"
    // InternalNavigationRules.g:642:1: ruleDestination returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'navigation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'go' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ( (lv_permissions_6_0= rulePermissionReference ) )* ) ;
    public final EObject ruleDestination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_permissions_6_0 = null;



        	enterRule();

        try {
            // InternalNavigationRules.g:648:2: ( (otherlv_0= 'on' otherlv_1= 'navigation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'go' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ( (lv_permissions_6_0= rulePermissionReference ) )* ) )
            // InternalNavigationRules.g:649:2: (otherlv_0= 'on' otherlv_1= 'navigation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'go' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ( (lv_permissions_6_0= rulePermissionReference ) )* )
            {
            // InternalNavigationRules.g:649:2: (otherlv_0= 'on' otherlv_1= 'navigation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'go' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ( (lv_permissions_6_0= rulePermissionReference ) )* )
            // InternalNavigationRules.g:650:3: otherlv_0= 'on' otherlv_1= 'navigation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'go' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ( (lv_permissions_6_0= rulePermissionReference ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getDestinationAccess().getOnKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDestinationAccess().getNavigationKeyword_1());
            		
            // InternalNavigationRules.g:658:3: ( (otherlv_2= RULE_ID ) )
            // InternalNavigationRules.g:659:4: (otherlv_2= RULE_ID )
            {
            // InternalNavigationRules.g:659:4: (otherlv_2= RULE_ID )
            // InternalNavigationRules.g:660:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestinationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getDestinationAccess().getTransitionTransitionDefinitionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDestinationAccess().getGoKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getDestinationAccess().getToKeyword_4());
            		
            // InternalNavigationRules.g:679:3: ( (otherlv_5= RULE_ID ) )
            // InternalNavigationRules.g:680:4: (otherlv_5= RULE_ID )
            {
            // InternalNavigationRules.g:680:4: (otherlv_5= RULE_ID )
            // InternalNavigationRules.g:681:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestinationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_5, grammarAccess.getDestinationAccess().getTargetCoordinateMappingSpecCrossReference_5_0());
            				

            }


            }

            // InternalNavigationRules.g:692:3: ( (lv_permissions_6_0= rulePermissionReference ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalNavigationRules.g:693:4: (lv_permissions_6_0= rulePermissionReference )
            	    {
            	    // InternalNavigationRules.g:693:4: (lv_permissions_6_0= rulePermissionReference )
            	    // InternalNavigationRules.g:694:5: lv_permissions_6_0= rulePermissionReference
            	    {

            	    					newCompositeNode(grammarAccess.getDestinationAccess().getPermissionsPermissionReferenceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_permissions_6_0=rulePermissionReference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDestinationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"permissions",
            	    						lv_permissions_6_0,
            	    						"navi.NavigationRules.PermissionReference");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestination"


    // $ANTLR start "entryRulePermissionReference"
    // InternalNavigationRules.g:715:1: entryRulePermissionReference returns [EObject current=null] : iv_rulePermissionReference= rulePermissionReference EOF ;
    public final EObject entryRulePermissionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionReference = null;


        try {
            // InternalNavigationRules.g:715:60: (iv_rulePermissionReference= rulePermissionReference EOF )
            // InternalNavigationRules.g:716:2: iv_rulePermissionReference= rulePermissionReference EOF
            {
             newCompositeNode(grammarAccess.getPermissionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissionReference=rulePermissionReference();

            state._fsp--;

             current =iv_rulePermissionReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionReference"


    // $ANTLR start "rulePermissionReference"
    // InternalNavigationRules.g:722:1: rulePermissionReference returns [EObject current=null] : (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePermissionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNavigationRules.g:728:2: ( (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalNavigationRules.g:729:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalNavigationRules.g:729:2: (otherlv_0= 'with' ( (otherlv_1= RULE_ID ) ) )
            // InternalNavigationRules.g:730:3: otherlv_0= 'with' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissionReferenceAccess().getWithKeyword_0());
            		
            // InternalNavigationRules.g:734:3: ( (otherlv_1= RULE_ID ) )
            // InternalNavigationRules.g:735:4: (otherlv_1= RULE_ID )
            {
            // InternalNavigationRules.g:735:4: (otherlv_1= RULE_ID )
            // InternalNavigationRules.g:736:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPermissionReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getPermissionReferenceAccess().getPermissionPermissionMappingSpecCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePermissionReference"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});

}