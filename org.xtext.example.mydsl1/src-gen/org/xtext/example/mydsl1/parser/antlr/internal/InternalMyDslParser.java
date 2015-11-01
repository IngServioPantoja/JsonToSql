package org.xtext.example.mydsl1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'['", "']'", "':'", "','", "'\"'", "'-'", "'true'", "'false'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Document";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDocument"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument75);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument85); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:76:1: ruleDocument returns [EObject current=null] : ( ( (lv_objects_0_0= ruleObject ) ) | ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE ) ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_objects_0_0 = null;

        EObject lv_objects_2_0 = null;

        EObject lv_objects_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( ( (lv_objects_0_0= ruleObject ) ) | ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_objects_0_0= ruleObject ) ) | ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_objects_0_0= ruleObject ) ) | ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_objects_0_0= ruleObject ) )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_objects_0_0= ruleObject ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_objects_0_0= ruleObject )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_objects_0_0= ruleObject )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:82:3: lv_objects_0_0= ruleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getObjectsObjectParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObject_in_ruleDocument131);
                    lv_objects_0_0=ruleObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		add(
                           			current, 
                           			"objects",
                            		lv_objects_0_0, 
                            		"Object");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:6: ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:6: ( ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:100:5: ruleLSQUARE ( (lv_objects_2_0= ruleObject ) ) ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )* ruleRSQUARE
                    {
                     
                            newCompositeNode(grammarAccess.getDocumentAccess().getLSQUAREParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleLSQUARE_in_ruleDocument154);
                    ruleLSQUARE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:107:1: ( (lv_objects_2_0= ruleObject ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:108:1: (lv_objects_2_0= ruleObject )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:108:1: (lv_objects_2_0= ruleObject )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:109:3: lv_objects_2_0= ruleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getObjectsObjectParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObject_in_ruleDocument174);
                    lv_objects_2_0=ruleObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		add(
                           			current, 
                           			"objects",
                            		lv_objects_2_0, 
                            		"Object");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:125:2: ( ruleCOMMA ( (lv_objects_4_0= ruleObject ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:126:5: ruleCOMMA ( (lv_objects_4_0= ruleObject ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getDocumentAccess().getCOMMAParserRuleCall_1_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleCOMMA_in_ruleDocument191);
                    	    ruleCOMMA();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:133:1: ( (lv_objects_4_0= ruleObject ) )
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:134:1: (lv_objects_4_0= ruleObject )
                    	    {
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:134:1: (lv_objects_4_0= ruleObject )
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:135:3: lv_objects_4_0= ruleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDocumentAccess().getObjectsObjectParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleObject_in_ruleDocument211);
                    	    lv_objects_4_0=ruleObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"objects",
                    	            		lv_objects_4_0, 
                    	            		"Object");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getDocumentAccess().getRSQUAREParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleRSQUARE_in_ruleDocument229);
                    ruleRSQUARE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleObject"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:167:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:168:2: (iv_ruleObject= ruleObject EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject265);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject275); 

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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:176:1: ruleObject returns [EObject current=null] : ( ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject lv_pairs_1_0 = null;

        EObject lv_pairs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:179:28: ( ( ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:180:1: ( ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:180:1: ( ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:181:5: ruleLCURLY ( (lv_pairs_1_0= rulePair ) ) ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )* ruleRCURLY
            {
             
                    newCompositeNode(grammarAccess.getObjectAccess().getLCURLYParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLCURLY_in_ruleObject316);
            ruleLCURLY();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:188:1: ( (lv_pairs_1_0= rulePair ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:189:1: (lv_pairs_1_0= rulePair )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:189:1: (lv_pairs_1_0= rulePair )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:190:3: lv_pairs_1_0= rulePair
            {
             
            	        newCompositeNode(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePair_in_ruleObject336);
            lv_pairs_1_0=rulePair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjectRule());
            	        }
                   		add(
                   			current, 
                   			"pairs",
                    		lv_pairs_1_0, 
                    		"Pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:206:2: ( ruleCOMMA ( (lv_pairs_3_0= rulePair ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:207:5: ruleCOMMA ( (lv_pairs_3_0= rulePair ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getObjectAccess().getCOMMAParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleCOMMA_in_ruleObject353);
            	    ruleCOMMA();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:214:1: ( (lv_pairs_3_0= rulePair ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:215:1: (lv_pairs_3_0= rulePair )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:215:1: (lv_pairs_3_0= rulePair )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:216:3: lv_pairs_3_0= rulePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectAccess().getPairsPairParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePair_in_ruleObject373);
            	    lv_pairs_3_0=rulePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pairs",
            	            		lv_pairs_3_0, 
            	            		"Pair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getObjectAccess().getRCURLYParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleRCURLY_in_ruleObject391);
            ruleRCURLY();

            state._fsp--;

             
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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRulePair"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:248:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:249:2: (iv_rulePair= rulePair EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:250:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair426);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair436); 

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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:257:1: rulePair returns [EObject current=null] : ( ruleQUOTES ( (lv_name_1_0= ruleEString ) ) ruleQUOTES ruleCOLON ruleQUOTES ( (lv_value_5_0= ruleValue ) ) ruleQUOTES ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:260:28: ( ( ruleQUOTES ( (lv_name_1_0= ruleEString ) ) ruleQUOTES ruleCOLON ruleQUOTES ( (lv_value_5_0= ruleValue ) ) ruleQUOTES ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:261:1: ( ruleQUOTES ( (lv_name_1_0= ruleEString ) ) ruleQUOTES ruleCOLON ruleQUOTES ( (lv_value_5_0= ruleValue ) ) ruleQUOTES )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:261:1: ( ruleQUOTES ( (lv_name_1_0= ruleEString ) ) ruleQUOTES ruleCOLON ruleQUOTES ( (lv_value_5_0= ruleValue ) ) ruleQUOTES )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:262:5: ruleQUOTES ( (lv_name_1_0= ruleEString ) ) ruleQUOTES ruleCOLON ruleQUOTES ( (lv_value_5_0= ruleValue ) ) ruleQUOTES
            {
             
                    newCompositeNode(grammarAccess.getPairAccess().getQUOTESParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQUOTES_in_rulePair477);
            ruleQUOTES();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:269:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:270:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:270:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:271:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPairAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_rulePair497);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPairRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getPairAccess().getQUOTESParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleQUOTES_in_rulePair513);
            ruleQUOTES();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getPairAccess().getCOLONParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleCOLON_in_rulePair528);
            ruleCOLON();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getPairAccess().getQUOTESParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleQUOTES_in_rulePair543);
            ruleQUOTES();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:311:1: ( (lv_value_5_0= ruleValue ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:312:1: (lv_value_5_0= ruleValue )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:312:1: (lv_value_5_0= ruleValue )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:313:3: lv_value_5_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getPairAccess().getValueValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_rulePair563);
            lv_value_5_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPairRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getPairAccess().getQUOTESParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleQUOTES_in_rulePair579);
            ruleQUOTES();

            state._fsp--;

             
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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:345:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:346:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:347:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue614);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue624); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:354:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_DecimalValue_2= ruleDecimalValue | this_ArrayValue_3= ruleArrayValue | this_BooleanValue_4= ruleBooleanValue | this_ValueObject_5= ruleValueObject ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_NumberValue_1 = null;

        EObject this_DecimalValue_2 = null;

        EObject this_ArrayValue_3 = null;

        EObject this_BooleanValue_4 = null;

        EObject this_ValueObject_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:357:28: ( (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_DecimalValue_2= ruleDecimalValue | this_ArrayValue_3= ruleArrayValue | this_BooleanValue_4= ruleBooleanValue | this_ValueObject_5= ruleValueObject ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:358:1: (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_DecimalValue_2= ruleDecimalValue | this_ArrayValue_3= ruleArrayValue | this_BooleanValue_4= ruleBooleanValue | this_ValueObject_5= ruleValueObject )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:358:1: (this_StringValue_0= ruleStringValue | this_NumberValue_1= ruleNumberValue | this_DecimalValue_2= ruleDecimalValue | this_ArrayValue_3= ruleArrayValue | this_BooleanValue_4= ruleBooleanValue | this_ValueObject_5= ruleValueObject )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_INT) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==EOF||LA4_3==14||(LA4_3>=16 && LA4_3<=17)) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==21) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==21) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==EOF||LA4_3==14||(LA4_3>=16 && LA4_3<=17)) ) {
                    alt4=2;
                }
                else if ( (LA4_3==21) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 13:
                {
                alt4=4;
                }
                break;
            case 19:
            case 20:
                {
                alt4=5;
                }
                break;
            case 11:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:359:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue671);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:369:5: this_NumberValue_1= ruleNumberValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumberValue_in_ruleValue698);
                    this_NumberValue_1=ruleNumberValue();

                    state._fsp--;

                     
                            current = this_NumberValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:379:5: this_DecimalValue_2= ruleDecimalValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDecimalValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDecimalValue_in_ruleValue725);
                    this_DecimalValue_2=ruleDecimalValue();

                    state._fsp--;

                     
                            current = this_DecimalValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:389:5: this_ArrayValue_3= ruleArrayValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getArrayValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleArrayValue_in_ruleValue752);
                    this_ArrayValue_3=ruleArrayValue();

                    state._fsp--;

                     
                            current = this_ArrayValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:399:5: this_BooleanValue_4= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleValue779);
                    this_BooleanValue_4=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:409:5: this_ValueObject_5= ruleValueObject
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getValueObjectParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleValueObject_in_ruleValue806);
                    this_ValueObject_5=ruleValueObject();

                    state._fsp--;

                     
                            current = this_ValueObject_5; 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:425:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:426:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:427:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue841);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue851); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:434:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:437:28: ( ( (lv_value_0_0= ruleEString ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:438:1: ( (lv_value_0_0= ruleEString ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:438:1: ( (lv_value_0_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_value_0_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_value_0_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:440:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleStringValue896);
            lv_value_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumberValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:464:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:465:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:466:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue931);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue941); 

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:473:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:476:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:477:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:477:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:478:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:478:1: (lv_value_0_0= ruleEInt )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:479:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumberValueAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEInt_in_ruleNumberValue986);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleDecimalValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:503:1: entryRuleDecimalValue returns [EObject current=null] : iv_ruleDecimalValue= ruleDecimalValue EOF ;
    public final EObject entryRuleDecimalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValue = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:504:2: (iv_ruleDecimalValue= ruleDecimalValue EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:505:2: iv_ruleDecimalValue= ruleDecimalValue EOF
            {
             newCompositeNode(grammarAccess.getDecimalValueRule()); 
            pushFollow(FOLLOW_ruleDecimalValue_in_entryRuleDecimalValue1021);
            iv_ruleDecimalValue=ruleDecimalValue();

            state._fsp--;

             current =iv_ruleDecimalValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalValue1031); 

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
    // $ANTLR end "entryRuleDecimalValue"


    // $ANTLR start "ruleDecimalValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:512:1: ruleDecimalValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleDecimalValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:515:28: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:516:1: ( (lv_value_0_0= ruleEDouble ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:516:1: ( (lv_value_0_0= ruleEDouble ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:517:1: (lv_value_0_0= ruleEDouble )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:517:1: (lv_value_0_0= ruleEDouble )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:518:3: lv_value_0_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDecimalValueAccess().getValueEDoubleParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEDouble_in_ruleDecimalValue1076);
            lv_value_0_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDecimalValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDecimalValue"


    // $ANTLR start "entryRuleValueObject"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:542:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:543:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject1111);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject1121); 

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
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:551:1: ruleValueObject returns [EObject current=null] : ( (lv_value_0_0= ruleObject ) ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:554:28: ( ( (lv_value_0_0= ruleObject ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:555:1: ( (lv_value_0_0= ruleObject ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:555:1: ( (lv_value_0_0= ruleObject ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:556:1: (lv_value_0_0= ruleObject )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:556:1: (lv_value_0_0= ruleObject )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:557:3: lv_value_0_0= ruleObject
            {
             
            	        newCompositeNode(grammarAccess.getValueObjectAccess().getValueObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleObject_in_ruleValueObject1166);
            lv_value_0_0=ruleObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Object");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleArrayValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:581:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:582:2: (iv_ruleArrayValue= ruleArrayValue EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:583:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
             newCompositeNode(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_ruleArrayValue_in_entryRuleArrayValue1201);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;

             current =iv_ruleArrayValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayValue1211); 

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
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:590:1: ruleArrayValue returns [EObject current=null] : ( ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:593:28: ( ( ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:594:1: ( ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:594:1: ( ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:595:5: ruleLSQUARE ( (lv_values_1_0= ruleValue ) ) ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )* ruleRSQUARE
            {
             
                    newCompositeNode(grammarAccess.getArrayValueAccess().getLSQUAREParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLSQUARE_in_ruleArrayValue1252);
            ruleLSQUARE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:602:1: ( (lv_values_1_0= ruleValue ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:603:1: (lv_values_1_0= ruleValue )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:603:1: (lv_values_1_0= ruleValue )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:604:3: lv_values_1_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getArrayValueAccess().getValuesValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleArrayValue1272);
            lv_values_1_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayValueRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_1_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:620:2: ( ruleCOMMA ( (lv_values_3_0= ruleValue ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:621:5: ruleCOMMA ( (lv_values_3_0= ruleValue ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getArrayValueAccess().getCOMMAParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleCOMMA_in_ruleArrayValue1289);
            	    ruleCOMMA();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:628:1: ( (lv_values_3_0= ruleValue ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:629:1: (lv_values_3_0= ruleValue )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:629:1: (lv_values_3_0= ruleValue )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:630:3: lv_values_3_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayValueAccess().getValuesValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleArrayValue1309);
            	    lv_values_3_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_3_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getArrayValueAccess().getRSQUAREParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleRSQUARE_in_ruleArrayValue1327);
            ruleRSQUARE();

            state._fsp--;

             
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
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:662:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:663:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:664:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1362);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1372); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:671:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:674:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:675:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:675:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:676:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:676:1: (lv_value_0_0= ruleEBoolean )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:677:3: lv_value_0_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEBoolean_in_ruleBooleanValue1417);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleLCURLY"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:701:1: entryRuleLCURLY returns [String current=null] : iv_ruleLCURLY= ruleLCURLY EOF ;
    public final String entryRuleLCURLY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLCURLY = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:702:2: (iv_ruleLCURLY= ruleLCURLY EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:703:2: iv_ruleLCURLY= ruleLCURLY EOF
            {
             newCompositeNode(grammarAccess.getLCURLYRule()); 
            pushFollow(FOLLOW_ruleLCURLY_in_entryRuleLCURLY1453);
            iv_ruleLCURLY=ruleLCURLY();

            state._fsp--;

             current =iv_ruleLCURLY.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLCURLY1464); 

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
    // $ANTLR end "entryRuleLCURLY"


    // $ANTLR start "ruleLCURLY"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:710:1: ruleLCURLY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{' ;
    public final AntlrDatatypeRuleToken ruleLCURLY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:713:28: (kw= '{' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:715:2: kw= '{'
            {
            kw=(Token)match(input,11,FOLLOW_11_in_ruleLCURLY1501); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLCURLYAccess().getLeftCurlyBracketKeyword()); 
                

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
    // $ANTLR end "ruleLCURLY"


    // $ANTLR start "entryRuleRCURLY"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:728:1: entryRuleRCURLY returns [String current=null] : iv_ruleRCURLY= ruleRCURLY EOF ;
    public final String entryRuleRCURLY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRCURLY = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:729:2: (iv_ruleRCURLY= ruleRCURLY EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:730:2: iv_ruleRCURLY= ruleRCURLY EOF
            {
             newCompositeNode(grammarAccess.getRCURLYRule()); 
            pushFollow(FOLLOW_ruleRCURLY_in_entryRuleRCURLY1541);
            iv_ruleRCURLY=ruleRCURLY();

            state._fsp--;

             current =iv_ruleRCURLY.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRCURLY1552); 

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
    // $ANTLR end "entryRuleRCURLY"


    // $ANTLR start "ruleRCURLY"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:737:1: ruleRCURLY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '}' ;
    public final AntlrDatatypeRuleToken ruleRCURLY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:28: (kw= '}' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:742:2: kw= '}'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleRCURLY1589); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRCURLYAccess().getRightCurlyBracketKeyword()); 
                

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
    // $ANTLR end "ruleRCURLY"


    // $ANTLR start "entryRuleLSQUARE"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:755:1: entryRuleLSQUARE returns [String current=null] : iv_ruleLSQUARE= ruleLSQUARE EOF ;
    public final String entryRuleLSQUARE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLSQUARE = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:756:2: (iv_ruleLSQUARE= ruleLSQUARE EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:757:2: iv_ruleLSQUARE= ruleLSQUARE EOF
            {
             newCompositeNode(grammarAccess.getLSQUARERule()); 
            pushFollow(FOLLOW_ruleLSQUARE_in_entryRuleLSQUARE1629);
            iv_ruleLSQUARE=ruleLSQUARE();

            state._fsp--;

             current =iv_ruleLSQUARE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLSQUARE1640); 

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
    // $ANTLR end "entryRuleLSQUARE"


    // $ANTLR start "ruleLSQUARE"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:764:1: ruleLSQUARE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '[' ;
    public final AntlrDatatypeRuleToken ruleLSQUARE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:767:28: (kw= '[' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:769:2: kw= '['
            {
            kw=(Token)match(input,13,FOLLOW_13_in_ruleLSQUARE1677); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLSQUAREAccess().getLeftSquareBracketKeyword()); 
                

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
    // $ANTLR end "ruleLSQUARE"


    // $ANTLR start "entryRuleRSQUARE"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:782:1: entryRuleRSQUARE returns [String current=null] : iv_ruleRSQUARE= ruleRSQUARE EOF ;
    public final String entryRuleRSQUARE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRSQUARE = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:783:2: (iv_ruleRSQUARE= ruleRSQUARE EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:784:2: iv_ruleRSQUARE= ruleRSQUARE EOF
            {
             newCompositeNode(grammarAccess.getRSQUARERule()); 
            pushFollow(FOLLOW_ruleRSQUARE_in_entryRuleRSQUARE1717);
            iv_ruleRSQUARE=ruleRSQUARE();

            state._fsp--;

             current =iv_ruleRSQUARE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSQUARE1728); 

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
    // $ANTLR end "entryRuleRSQUARE"


    // $ANTLR start "ruleRSQUARE"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:791:1: ruleRSQUARE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ']' ;
    public final AntlrDatatypeRuleToken ruleRSQUARE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:794:28: (kw= ']' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:796:2: kw= ']'
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleRSQUARE1765); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRSQUAREAccess().getRightSquareBracketKeyword()); 
                

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
    // $ANTLR end "ruleRSQUARE"


    // $ANTLR start "entryRuleCOLON"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:809:1: entryRuleCOLON returns [String current=null] : iv_ruleCOLON= ruleCOLON EOF ;
    public final String entryRuleCOLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOLON = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:810:2: (iv_ruleCOLON= ruleCOLON EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:811:2: iv_ruleCOLON= ruleCOLON EOF
            {
             newCompositeNode(grammarAccess.getCOLONRule()); 
            pushFollow(FOLLOW_ruleCOLON_in_entryRuleCOLON1805);
            iv_ruleCOLON=ruleCOLON();

            state._fsp--;

             current =iv_ruleCOLON.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLON1816); 

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
    // $ANTLR end "entryRuleCOLON"


    // $ANTLR start "ruleCOLON"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:818:1: ruleCOLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleCOLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:821:28: (kw= ':' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:823:2: kw= ':'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleCOLON1853); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCOLONAccess().getColonKeyword()); 
                

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
    // $ANTLR end "ruleCOLON"


    // $ANTLR start "entryRuleCOMMA"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:836:1: entryRuleCOMMA returns [String current=null] : iv_ruleCOMMA= ruleCOMMA EOF ;
    public final String entryRuleCOMMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMMA = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:837:2: (iv_ruleCOMMA= ruleCOMMA EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:838:2: iv_ruleCOMMA= ruleCOMMA EOF
            {
             newCompositeNode(grammarAccess.getCOMMARule()); 
            pushFollow(FOLLOW_ruleCOMMA_in_entryRuleCOMMA1893);
            iv_ruleCOMMA=ruleCOMMA();

            state._fsp--;

             current =iv_ruleCOMMA.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOMMA1904); 

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
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:845:1: ruleCOMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleCOMMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:848:28: (kw= ',' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:850:2: kw= ','
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleCOMMA1941); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCOMMAAccess().getCommaKeyword()); 
                

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
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "entryRuleQUOTES"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:863:1: entryRuleQUOTES returns [String current=null] : iv_ruleQUOTES= ruleQUOTES EOF ;
    public final String entryRuleQUOTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUOTES = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:864:2: (iv_ruleQUOTES= ruleQUOTES EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:865:2: iv_ruleQUOTES= ruleQUOTES EOF
            {
             newCompositeNode(grammarAccess.getQUOTESRule()); 
            pushFollow(FOLLOW_ruleQUOTES_in_entryRuleQUOTES1981);
            iv_ruleQUOTES=ruleQUOTES();

            state._fsp--;

             current =iv_ruleQUOTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUOTES1992); 

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
    // $ANTLR end "entryRuleQUOTES"


    // $ANTLR start "ruleQUOTES"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:872:1: ruleQUOTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\"' ;
    public final AntlrDatatypeRuleToken ruleQUOTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:875:28: (kw= '\"' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:877:2: kw= '\"'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleQUOTES2029); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQUOTESAccess().getQuotationMarkKeyword()); 
                

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
    // $ANTLR end "ruleQUOTES"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:892:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:893:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:894:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString2071);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString2082); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:901:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:904:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:905:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:905:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:905:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString2122); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:913:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString2148); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:928:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:929:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:930:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt2194);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt2205); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:937:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:940:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:941:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:941:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:941:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:941:2: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:942:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleEInt2244); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt2261); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:962:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:963:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:964:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean2307);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean2318); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:971:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:974:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:975:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:975:1: (kw= 'true' | kw= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:976:2: kw= 'true'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleEBoolean2356); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:983:2: kw= 'false'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleEBoolean2375); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDouble"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:996:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:997:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:998:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_ruleEDouble_in_entryRuleEDouble2416);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDouble2427); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1005:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1008:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1009:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1009:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1009:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1009:2: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1010:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleEDouble2466); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1015:3: (this_INT_1= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1015:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEDouble2484); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,21,FOLLOW_21_in_ruleEDouble2504); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEDouble2519); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1035:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=22 && LA13_0<=23)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1035:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1035:2: (kw= 'E' | kw= 'e' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==23) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1036:2: kw= 'E'
                            {
                            kw=(Token)match(input,22,FOLLOW_22_in_ruleEDouble2539); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1043:2: kw= 'e'
                            {
                            kw=(Token)match(input,23,FOLLOW_23_in_ruleEDouble2558); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1048:2: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==18) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1049:2: kw= '-'
                            {
                            kw=(Token)match(input,18,FOLLOW_18_in_ruleEDouble2573); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEDouble2590); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleDocument131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSQUARE_in_ruleDocument154 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleObject_in_ruleDocument174 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleCOMMA_in_ruleDocument191 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleObject_in_ruleDocument211 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleRSQUARE_in_ruleDocument229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCURLY_in_ruleObject316 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePair_in_ruleObject336 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_ruleCOMMA_in_ruleObject353 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePair_in_ruleObject373 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_ruleRCURLY_in_ruleObject391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUOTES_in_rulePair477 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_rulePair497 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleQUOTES_in_rulePair513 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCOLON_in_rulePair528 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleQUOTES_in_rulePair543 = new BitSet(new long[]{0x00000000003C2870L});
    public static final BitSet FOLLOW_ruleValue_in_rulePair563 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleQUOTES_in_rulePair579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_ruleValue698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValue_in_ruleValue725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayValue_in_ruleValue752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleValue806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleStringValue896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleNumberValue986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalValue_in_entryRuleDecimalValue1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalValue1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDouble_in_ruleDecimalValue1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject1111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleValueObject1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayValue_in_entryRuleArrayValue1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayValue1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSQUARE_in_ruleArrayValue1252 = new BitSet(new long[]{0x00000000003C2870L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArrayValue1272 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleCOMMA_in_ruleArrayValue1289 = new BitSet(new long[]{0x00000000003C2870L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArrayValue1309 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleRSQUARE_in_ruleArrayValue1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleBooleanValue1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLCURLY_in_entryRuleLCURLY1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLCURLY1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleLCURLY1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRCURLY_in_entryRuleRCURLY1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRCURLY1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRCURLY1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSQUARE_in_entryRuleLSQUARE1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLSQUARE1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLSQUARE1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSQUARE_in_entryRuleRSQUARE1717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSQUARE1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRSQUARE1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLON_in_entryRuleCOLON1805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLON1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCOLON1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMMA_in_entryRuleCOMMA1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOMMA1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCOMMA1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUOTES_in_entryRuleQUOTES1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUOTES1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleQUOTES2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEInt2244 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEBoolean2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEBoolean2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEDouble2466 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2484 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEDouble2504 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2519 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22_in_ruleEDouble2539 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_23_in_ruleEDouble2558 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_18_in_ruleEDouble2573 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2590 = new BitSet(new long[]{0x0000000000000002L});

}