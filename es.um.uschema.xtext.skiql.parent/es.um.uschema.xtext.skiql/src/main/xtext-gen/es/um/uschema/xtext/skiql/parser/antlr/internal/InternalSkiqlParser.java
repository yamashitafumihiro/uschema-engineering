package es.um.uschema.xtext.skiql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.um.uschema.xtext.skiql.services.SkiqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSkiqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ENTITY'", "'REL'", "'ANY'", "'KEYS'", "'*'", "'_'", "'FROM'", "'TO'", "','", "'{'", "'}'", "'REF'", "'AGGR'", "'>>'", "'[]'", "'['", "']'", "':'", "'ONLY'", "'BEFORE'", "'('", "')'", "'AFTER'", "'BETWEEN'", "'-'", "'string'", "'number'", "'boolean'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSkiqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSkiqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSkiqlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSkiql.g"; }



     	private SkiqlGrammarAccess grammarAccess;

        public InternalSkiqlParser(TokenStream input, SkiqlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SkiQLModel";
       	}

       	@Override
       	protected SkiqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSkiQLModel"
    // InternalSkiql.g:65:1: entryRuleSkiQLModel returns [EObject current=null] : iv_ruleSkiQLModel= ruleSkiQLModel EOF ;
    public final EObject entryRuleSkiQLModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkiQLModel = null;


        try {
            // InternalSkiql.g:65:51: (iv_ruleSkiQLModel= ruleSkiQLModel EOF )
            // InternalSkiql.g:66:2: iv_ruleSkiQLModel= ruleSkiQLModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkiQLModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSkiQLModel=ruleSkiQLModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkiQLModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSkiQLModel"


    // $ANTLR start "ruleSkiQLModel"
    // InternalSkiql.g:72:1: ruleSkiQLModel returns [EObject current=null] : ( () ( (lv_query_1_0= ruleQuery ) ) ) ;
    public final EObject ruleSkiQLModel() throws RecognitionException {
        EObject current = null;

        EObject lv_query_1_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:78:2: ( ( () ( (lv_query_1_0= ruleQuery ) ) ) )
            // InternalSkiql.g:79:2: ( () ( (lv_query_1_0= ruleQuery ) ) )
            {
            // InternalSkiql.g:79:2: ( () ( (lv_query_1_0= ruleQuery ) ) )
            // InternalSkiql.g:80:3: () ( (lv_query_1_0= ruleQuery ) )
            {
            // InternalSkiql.g:80:3: ()
            // InternalSkiql.g:81:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSkiQLModelAccess().getSkiQLModelAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:87:3: ( (lv_query_1_0= ruleQuery ) )
            // InternalSkiql.g:88:4: (lv_query_1_0= ruleQuery )
            {
            // InternalSkiql.g:88:4: (lv_query_1_0= ruleQuery )
            // InternalSkiql.g:89:5: lv_query_1_0= ruleQuery
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSkiQLModelAccess().getQueryQueryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_query_1_0=ruleQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSkiQLModelRule());
              					}
              					set(
              						current,
              						"query",
              						lv_query_1_0,
              						"es.um.uschema.xtext.skiql.Skiql.Query");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSkiQLModel"


    // $ANTLR start "entryRuleQuery"
    // InternalSkiql.g:110:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSkiql.g:110:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSkiql.g:111:2: iv_ruleQuery= ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalSkiql.g:117:1: ruleQuery returns [EObject current=null] : (this_EntityTypeQuery_0= ruleEntityTypeQuery | this_RelationshipTypeQuery_1= ruleRelationshipTypeQuery | this_RelationshipQuery_2= ruleRelationshipQuery | this_AnyQuery_3= ruleAnyQuery ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject this_EntityTypeQuery_0 = null;

        EObject this_RelationshipTypeQuery_1 = null;

        EObject this_RelationshipQuery_2 = null;

        EObject this_AnyQuery_3 = null;



        	enterRule();

        try {
            // InternalSkiql.g:123:2: ( (this_EntityTypeQuery_0= ruleEntityTypeQuery | this_RelationshipTypeQuery_1= ruleRelationshipTypeQuery | this_RelationshipQuery_2= ruleRelationshipQuery | this_AnyQuery_3= ruleAnyQuery ) )
            // InternalSkiql.g:124:2: (this_EntityTypeQuery_0= ruleEntityTypeQuery | this_RelationshipTypeQuery_1= ruleRelationshipTypeQuery | this_RelationshipQuery_2= ruleRelationshipQuery | this_AnyQuery_3= ruleAnyQuery )
            {
            // InternalSkiql.g:124:2: (this_EntityTypeQuery_0= ruleEntityTypeQuery | this_RelationshipTypeQuery_1= ruleRelationshipTypeQuery | this_RelationshipQuery_2= ruleRelationshipQuery | this_AnyQuery_3= ruleAnyQuery )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSkiql.g:125:3: this_EntityTypeQuery_0= ruleEntityTypeQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQueryAccess().getEntityTypeQueryParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EntityTypeQuery_0=ruleEntityTypeQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EntityTypeQuery_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:134:3: this_RelationshipTypeQuery_1= ruleRelationshipTypeQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQueryAccess().getRelationshipTypeQueryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationshipTypeQuery_1=ruleRelationshipTypeQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationshipTypeQuery_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSkiql.g:143:3: this_RelationshipQuery_2= ruleRelationshipQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQueryAccess().getRelationshipQueryParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationshipQuery_2=ruleRelationshipQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationshipQuery_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSkiql.g:152:3: this_AnyQuery_3= ruleAnyQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQueryAccess().getAnyQueryParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AnyQuery_3=ruleAnyQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AnyQuery_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleEntityTypeQuery"
    // InternalSkiql.g:164:1: entryRuleEntityTypeQuery returns [EObject current=null] : iv_ruleEntityTypeQuery= ruleEntityTypeQuery EOF ;
    public final EObject entryRuleEntityTypeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityTypeQuery = null;


        try {
            // InternalSkiql.g:164:56: (iv_ruleEntityTypeQuery= ruleEntityTypeQuery EOF )
            // InternalSkiql.g:165:2: iv_ruleEntityTypeQuery= ruleEntityTypeQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityTypeQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntityTypeQuery=ruleEntityTypeQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityTypeQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntityTypeQuery"


    // $ANTLR start "ruleEntityTypeQuery"
    // InternalSkiql.g:171:1: ruleEntityTypeQuery returns [EObject current=null] : ( () otherlv_1= 'ENTITY' ( (lv_schemaSpec_2_0= ruleEntitySpec ) ) ( (lv_operation_3_0= ruleOperation ) )? ) ;
    public final EObject ruleEntityTypeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_schemaSpec_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:177:2: ( ( () otherlv_1= 'ENTITY' ( (lv_schemaSpec_2_0= ruleEntitySpec ) ) ( (lv_operation_3_0= ruleOperation ) )? ) )
            // InternalSkiql.g:178:2: ( () otherlv_1= 'ENTITY' ( (lv_schemaSpec_2_0= ruleEntitySpec ) ) ( (lv_operation_3_0= ruleOperation ) )? )
            {
            // InternalSkiql.g:178:2: ( () otherlv_1= 'ENTITY' ( (lv_schemaSpec_2_0= ruleEntitySpec ) ) ( (lv_operation_3_0= ruleOperation ) )? )
            // InternalSkiql.g:179:3: () otherlv_1= 'ENTITY' ( (lv_schemaSpec_2_0= ruleEntitySpec ) ) ( (lv_operation_3_0= ruleOperation ) )?
            {
            // InternalSkiql.g:179:3: ()
            // InternalSkiql.g:180:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEntityTypeQueryAccess().getSchemaQueryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEntityTypeQueryAccess().getENTITYKeyword_1());
              		
            }
            // InternalSkiql.g:190:3: ( (lv_schemaSpec_2_0= ruleEntitySpec ) )
            // InternalSkiql.g:191:4: (lv_schemaSpec_2_0= ruleEntitySpec )
            {
            // InternalSkiql.g:191:4: (lv_schemaSpec_2_0= ruleEntitySpec )
            // InternalSkiql.g:192:5: lv_schemaSpec_2_0= ruleEntitySpec
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntityTypeQueryAccess().getSchemaSpecEntitySpecParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_schemaSpec_2_0=ruleEntitySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEntityTypeQueryRule());
              					}
              					set(
              						current,
              						"schemaSpec",
              						lv_schemaSpec_2_0,
              						"es.um.uschema.xtext.skiql.Skiql.EntitySpec");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSkiql.g:209:3: ( (lv_operation_3_0= ruleOperation ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14||LA2_0==30||(LA2_0>=33 && LA2_0<=34)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSkiql.g:210:4: (lv_operation_3_0= ruleOperation )
                    {
                    // InternalSkiql.g:210:4: (lv_operation_3_0= ruleOperation )
                    // InternalSkiql.g:211:5: lv_operation_3_0= ruleOperation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEntityTypeQueryAccess().getOperationOperationParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_operation_3_0=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEntityTypeQueryRule());
                      					}
                      					set(
                      						current,
                      						"operation",
                      						lv_operation_3_0,
                      						"es.um.uschema.xtext.skiql.Skiql.Operation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntityTypeQuery"


    // $ANTLR start "entryRuleRelationshipTypeQuery"
    // InternalSkiql.g:232:1: entryRuleRelationshipTypeQuery returns [EObject current=null] : iv_ruleRelationshipTypeQuery= ruleRelationshipTypeQuery EOF ;
    public final EObject entryRuleRelationshipTypeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipTypeQuery = null;


        try {
            // InternalSkiql.g:232:62: (iv_ruleRelationshipTypeQuery= ruleRelationshipTypeQuery EOF )
            // InternalSkiql.g:233:2: iv_ruleRelationshipTypeQuery= ruleRelationshipTypeQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipTypeQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipTypeQuery=ruleRelationshipTypeQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipTypeQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationshipTypeQuery"


    // $ANTLR start "ruleRelationshipTypeQuery"
    // InternalSkiql.g:239:1: ruleRelationshipTypeQuery returns [EObject current=null] : ( () otherlv_1= 'REL' ( (lv_schemaSpec_2_0= ruleRelationshipTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )? ) ;
    public final EObject ruleRelationshipTypeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_schemaSpec_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:245:2: ( ( () otherlv_1= 'REL' ( (lv_schemaSpec_2_0= ruleRelationshipTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )? ) )
            // InternalSkiql.g:246:2: ( () otherlv_1= 'REL' ( (lv_schemaSpec_2_0= ruleRelationshipTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )? )
            {
            // InternalSkiql.g:246:2: ( () otherlv_1= 'REL' ( (lv_schemaSpec_2_0= ruleRelationshipTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )? )
            // InternalSkiql.g:247:3: () otherlv_1= 'REL' ( (lv_schemaSpec_2_0= ruleRelationshipTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )?
            {
            // InternalSkiql.g:247:3: ()
            // InternalSkiql.g:248:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipTypeQueryAccess().getSchemaQueryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelationshipTypeQueryAccess().getRELKeyword_1());
              		
            }
            // InternalSkiql.g:258:3: ( (lv_schemaSpec_2_0= ruleRelationshipTypeSpec ) )
            // InternalSkiql.g:259:4: (lv_schemaSpec_2_0= ruleRelationshipTypeSpec )
            {
            // InternalSkiql.g:259:4: (lv_schemaSpec_2_0= ruleRelationshipTypeSpec )
            // InternalSkiql.g:260:5: lv_schemaSpec_2_0= ruleRelationshipTypeSpec
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipTypeQueryAccess().getSchemaSpecRelationshipTypeSpecParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_schemaSpec_2_0=ruleRelationshipTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipTypeQueryRule());
              					}
              					set(
              						current,
              						"schemaSpec",
              						lv_schemaSpec_2_0,
              						"es.um.uschema.xtext.skiql.Skiql.RelationshipTypeSpec");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSkiql.g:277:3: ( (lv_operation_3_0= ruleOperation ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14||LA3_0==30||(LA3_0>=33 && LA3_0<=34)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSkiql.g:278:4: (lv_operation_3_0= ruleOperation )
                    {
                    // InternalSkiql.g:278:4: (lv_operation_3_0= ruleOperation )
                    // InternalSkiql.g:279:5: lv_operation_3_0= ruleOperation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRelationshipTypeQueryAccess().getOperationOperationParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_operation_3_0=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRelationshipTypeQueryRule());
                      					}
                      					set(
                      						current,
                      						"operation",
                      						lv_operation_3_0,
                      						"es.um.uschema.xtext.skiql.Skiql.Operation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationshipTypeQuery"


    // $ANTLR start "entryRuleAnyQuery"
    // InternalSkiql.g:300:1: entryRuleAnyQuery returns [EObject current=null] : iv_ruleAnyQuery= ruleAnyQuery EOF ;
    public final EObject entryRuleAnyQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyQuery = null;


        try {
            // InternalSkiql.g:300:49: (iv_ruleAnyQuery= ruleAnyQuery EOF )
            // InternalSkiql.g:301:2: iv_ruleAnyQuery= ruleAnyQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnyQuery=ruleAnyQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnyQuery"


    // $ANTLR start "ruleAnyQuery"
    // InternalSkiql.g:307:1: ruleAnyQuery returns [EObject current=null] : ( () otherlv_1= 'ANY' ( (lv_schemaSpec_2_0= ruleSchemaTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )? ) ;
    public final EObject ruleAnyQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_schemaSpec_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:313:2: ( ( () otherlv_1= 'ANY' ( (lv_schemaSpec_2_0= ruleSchemaTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )? ) )
            // InternalSkiql.g:314:2: ( () otherlv_1= 'ANY' ( (lv_schemaSpec_2_0= ruleSchemaTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )? )
            {
            // InternalSkiql.g:314:2: ( () otherlv_1= 'ANY' ( (lv_schemaSpec_2_0= ruleSchemaTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )? )
            // InternalSkiql.g:315:3: () otherlv_1= 'ANY' ( (lv_schemaSpec_2_0= ruleSchemaTypeSpec ) ) ( (lv_operation_3_0= ruleOperation ) )?
            {
            // InternalSkiql.g:315:3: ()
            // InternalSkiql.g:316:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAnyQueryAccess().getSchemaQueryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAnyQueryAccess().getANYKeyword_1());
              		
            }
            // InternalSkiql.g:326:3: ( (lv_schemaSpec_2_0= ruleSchemaTypeSpec ) )
            // InternalSkiql.g:327:4: (lv_schemaSpec_2_0= ruleSchemaTypeSpec )
            {
            // InternalSkiql.g:327:4: (lv_schemaSpec_2_0= ruleSchemaTypeSpec )
            // InternalSkiql.g:328:5: lv_schemaSpec_2_0= ruleSchemaTypeSpec
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnyQueryAccess().getSchemaSpecSchemaTypeSpecParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_schemaSpec_2_0=ruleSchemaTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnyQueryRule());
              					}
              					set(
              						current,
              						"schemaSpec",
              						lv_schemaSpec_2_0,
              						"es.um.uschema.xtext.skiql.Skiql.SchemaTypeSpec");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSkiql.g:345:3: ( (lv_operation_3_0= ruleOperation ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14||LA4_0==30||(LA4_0>=33 && LA4_0<=34)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSkiql.g:346:4: (lv_operation_3_0= ruleOperation )
                    {
                    // InternalSkiql.g:346:4: (lv_operation_3_0= ruleOperation )
                    // InternalSkiql.g:347:5: lv_operation_3_0= ruleOperation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAnyQueryAccess().getOperationOperationParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_operation_3_0=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAnyQueryRule());
                      					}
                      					set(
                      						current,
                      						"operation",
                      						lv_operation_3_0,
                      						"es.um.uschema.xtext.skiql.Skiql.Operation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnyQuery"


    // $ANTLR start "entryRuleOperation"
    // InternalSkiql.g:368:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSkiql.g:368:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSkiql.g:369:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSkiql.g:375:1: ruleOperation returns [EObject current=null] : (this_KeysSpec_0= ruleKeysSpec | this_VersionHistory_1= ruleVersionHistory ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_KeysSpec_0 = null;

        EObject this_VersionHistory_1 = null;



        	enterRule();

        try {
            // InternalSkiql.g:381:2: ( (this_KeysSpec_0= ruleKeysSpec | this_VersionHistory_1= ruleVersionHistory ) )
            // InternalSkiql.g:382:2: (this_KeysSpec_0= ruleKeysSpec | this_VersionHistory_1= ruleVersionHistory )
            {
            // InternalSkiql.g:382:2: (this_KeysSpec_0= ruleKeysSpec | this_VersionHistory_1= ruleVersionHistory )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==30||(LA5_0>=33 && LA5_0<=34)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSkiql.g:383:3: this_KeysSpec_0= ruleKeysSpec
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getKeysSpecParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_KeysSpec_0=ruleKeysSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_KeysSpec_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:392:3: this_VersionHistory_1= ruleVersionHistory
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getVersionHistoryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VersionHistory_1=ruleVersionHistory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VersionHistory_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleKeysSpec"
    // InternalSkiql.g:404:1: entryRuleKeysSpec returns [EObject current=null] : iv_ruleKeysSpec= ruleKeysSpec EOF ;
    public final EObject entryRuleKeysSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeysSpec = null;


        try {
            // InternalSkiql.g:404:49: (iv_ruleKeysSpec= ruleKeysSpec EOF )
            // InternalSkiql.g:405:2: iv_ruleKeysSpec= ruleKeysSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeysSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeysSpec=ruleKeysSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeysSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeysSpec"


    // $ANTLR start "ruleKeysSpec"
    // InternalSkiql.g:411:1: ruleKeysSpec returns [EObject current=null] : ( () otherlv_1= 'KEYS' ) ;
    public final EObject ruleKeysSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSkiql.g:417:2: ( ( () otherlv_1= 'KEYS' ) )
            // InternalSkiql.g:418:2: ( () otherlv_1= 'KEYS' )
            {
            // InternalSkiql.g:418:2: ( () otherlv_1= 'KEYS' )
            // InternalSkiql.g:419:3: () otherlv_1= 'KEYS'
            {
            // InternalSkiql.g:419:3: ()
            // InternalSkiql.g:420:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getKeysSpecAccess().getKeysSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeysSpecAccess().getKEYSKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleKeysSpec"


    // $ANTLR start "entryRuleRelationshipTypeSpec"
    // InternalSkiql.g:434:1: entryRuleRelationshipTypeSpec returns [EObject current=null] : iv_ruleRelationshipTypeSpec= ruleRelationshipTypeSpec EOF ;
    public final EObject entryRuleRelationshipTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipTypeSpec = null;


        try {
            // InternalSkiql.g:434:61: (iv_ruleRelationshipTypeSpec= ruleRelationshipTypeSpec EOF )
            // InternalSkiql.g:435:2: iv_ruleRelationshipTypeSpec= ruleRelationshipTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipTypeSpec=ruleRelationshipTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipTypeSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationshipTypeSpec"


    // $ANTLR start "ruleRelationshipTypeSpec"
    // InternalSkiql.g:441:1: ruleRelationshipTypeSpec returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? ) ;
    public final EObject ruleRelationshipTypeSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        EObject lv_variationFilter_2_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:447:2: ( ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? ) )
            // InternalSkiql.g:448:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? )
            {
            // InternalSkiql.g:448:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? )
            // InternalSkiql.g:449:3: () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )?
            {
            // InternalSkiql.g:449:3: ()
            // InternalSkiql.g:450:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipTypeSpecAccess().getRelationshipTypeSpecAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:456:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) )
            // InternalSkiql.g:457:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            {
            // InternalSkiql.g:457:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            // InternalSkiql.g:458:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            {
            // InternalSkiql.g:458:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSkiql.g:459:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_1, grammarAccess.getRelationshipTypeSpecAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRelationshipTypeSpecRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_1,
                      							"es.um.uschema.xtext.skiql.Skiql.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:474:6: lv_name_1_2= '*'
                    {
                    lv_name_1_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_2, grammarAccess.getRelationshipTypeSpecAccess().getNameAsteriskKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRelationshipTypeSpecRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSkiql.g:487:3: ( (lv_variationFilter_2_0= ruleVariationFilter ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=25 && LA7_0<=26)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSkiql.g:488:4: (lv_variationFilter_2_0= ruleVariationFilter )
                    {
                    // InternalSkiql.g:488:4: (lv_variationFilter_2_0= ruleVariationFilter )
                    // InternalSkiql.g:489:5: lv_variationFilter_2_0= ruleVariationFilter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRelationshipTypeSpecAccess().getVariationFilterVariationFilterParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variationFilter_2_0=ruleVariationFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRelationshipTypeSpecRule());
                      					}
                      					set(
                      						current,
                      						"variationFilter",
                      						lv_variationFilter_2_0,
                      						"es.um.uschema.xtext.skiql.Skiql.VariationFilter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationshipTypeSpec"


    // $ANTLR start "entryRuleSchemaTypeSpec"
    // InternalSkiql.g:510:1: entryRuleSchemaTypeSpec returns [EObject current=null] : iv_ruleSchemaTypeSpec= ruleSchemaTypeSpec EOF ;
    public final EObject entryRuleSchemaTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaTypeSpec = null;


        try {
            // InternalSkiql.g:510:55: (iv_ruleSchemaTypeSpec= ruleSchemaTypeSpec EOF )
            // InternalSkiql.g:511:2: iv_ruleSchemaTypeSpec= ruleSchemaTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemaTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSchemaTypeSpec=ruleSchemaTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemaTypeSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSchemaTypeSpec"


    // $ANTLR start "ruleSchemaTypeSpec"
    // InternalSkiql.g:517:1: ruleSchemaTypeSpec returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? ) ;
    public final EObject ruleSchemaTypeSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        EObject lv_variationFilter_2_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:523:2: ( ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? ) )
            // InternalSkiql.g:524:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? )
            {
            // InternalSkiql.g:524:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? )
            // InternalSkiql.g:525:3: () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )?
            {
            // InternalSkiql.g:525:3: ()
            // InternalSkiql.g:526:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSchemaTypeSpecAccess().getSchemaSpecAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:532:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) )
            // InternalSkiql.g:533:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            {
            // InternalSkiql.g:533:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            // InternalSkiql.g:534:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            {
            // InternalSkiql.g:534:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSkiql.g:535:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_1, grammarAccess.getSchemaTypeSpecAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSchemaTypeSpecRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_1,
                      							"es.um.uschema.xtext.skiql.Skiql.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:550:6: lv_name_1_2= '*'
                    {
                    lv_name_1_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_2, grammarAccess.getSchemaTypeSpecAccess().getNameAsteriskKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSchemaTypeSpecRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSkiql.g:563:3: ( (lv_variationFilter_2_0= ruleVariationFilter ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=25 && LA9_0<=26)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSkiql.g:564:4: (lv_variationFilter_2_0= ruleVariationFilter )
                    {
                    // InternalSkiql.g:564:4: (lv_variationFilter_2_0= ruleVariationFilter )
                    // InternalSkiql.g:565:5: lv_variationFilter_2_0= ruleVariationFilter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSchemaTypeSpecAccess().getVariationFilterVariationFilterParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variationFilter_2_0=ruleVariationFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSchemaTypeSpecRule());
                      					}
                      					set(
                      						current,
                      						"variationFilter",
                      						lv_variationFilter_2_0,
                      						"es.um.uschema.xtext.skiql.Skiql.VariationFilter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSchemaTypeSpec"


    // $ANTLR start "entryRuleEntitySpec"
    // InternalSkiql.g:586:1: entryRuleEntitySpec returns [EObject current=null] : iv_ruleEntitySpec= ruleEntitySpec EOF ;
    public final EObject entryRuleEntitySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitySpec = null;


        try {
            // InternalSkiql.g:586:51: (iv_ruleEntitySpec= ruleEntitySpec EOF )
            // InternalSkiql.g:587:2: iv_ruleEntitySpec= ruleEntitySpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntitySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntitySpec=ruleEntitySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntitySpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntitySpec"


    // $ANTLR start "ruleEntitySpec"
    // InternalSkiql.g:593:1: ruleEntitySpec returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? ) ;
    public final EObject ruleEntitySpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        EObject lv_variationFilter_2_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:599:2: ( ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? ) )
            // InternalSkiql.g:600:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? )
            {
            // InternalSkiql.g:600:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )? )
            // InternalSkiql.g:601:3: () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) ( (lv_variationFilter_2_0= ruleVariationFilter ) )?
            {
            // InternalSkiql.g:601:3: ()
            // InternalSkiql.g:602:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEntitySpecAccess().getEntitySpecAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:608:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) )
            // InternalSkiql.g:609:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            {
            // InternalSkiql.g:609:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            // InternalSkiql.g:610:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            {
            // InternalSkiql.g:610:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSkiql.g:611:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_1, grammarAccess.getEntitySpecAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEntitySpecRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_1,
                      							"es.um.uschema.xtext.skiql.Skiql.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:626:6: lv_name_1_2= '*'
                    {
                    lv_name_1_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_2, grammarAccess.getEntitySpecAccess().getNameAsteriskKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEntitySpecRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSkiql.g:639:3: ( (lv_variationFilter_2_0= ruleVariationFilter ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=25 && LA11_0<=26)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSkiql.g:640:4: (lv_variationFilter_2_0= ruleVariationFilter )
                    {
                    // InternalSkiql.g:640:4: (lv_variationFilter_2_0= ruleVariationFilter )
                    // InternalSkiql.g:641:5: lv_variationFilter_2_0= ruleVariationFilter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEntitySpecAccess().getVariationFilterVariationFilterParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variationFilter_2_0=ruleVariationFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEntitySpecRule());
                      					}
                      					set(
                      						current,
                      						"variationFilter",
                      						lv_variationFilter_2_0,
                      						"es.um.uschema.xtext.skiql.Skiql.VariationFilter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntitySpec"


    // $ANTLR start "entryRuleReferenceEntitySpec"
    // InternalSkiql.g:662:1: entryRuleReferenceEntitySpec returns [EObject current=null] : iv_ruleReferenceEntitySpec= ruleReferenceEntitySpec EOF ;
    public final EObject entryRuleReferenceEntitySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceEntitySpec = null;


        try {
            // InternalSkiql.g:662:60: (iv_ruleReferenceEntitySpec= ruleReferenceEntitySpec EOF )
            // InternalSkiql.g:663:2: iv_ruleReferenceEntitySpec= ruleReferenceEntitySpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceEntitySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferenceEntitySpec=ruleReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceEntitySpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceEntitySpec"


    // $ANTLR start "ruleReferenceEntitySpec"
    // InternalSkiql.g:669:1: ruleReferenceEntitySpec returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )? ) ;
    public final EObject ruleReferenceEntitySpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        EObject lv_variationFilter_2_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:675:2: ( ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )? ) )
            // InternalSkiql.g:676:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )? )
            {
            // InternalSkiql.g:676:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )? )
            // InternalSkiql.g:677:3: () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )?
            {
            // InternalSkiql.g:677:3: ()
            // InternalSkiql.g:678:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReferenceEntitySpecAccess().getEntitySpecAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:684:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) )
            // InternalSkiql.g:685:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) )
            {
            // InternalSkiql.g:685:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) )
            // InternalSkiql.g:686:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' )
            {
            // InternalSkiql.g:686:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case 15:
                {
                alt12=2;
                }
                break;
            case 16:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSkiql.g:687:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_1, grammarAccess.getReferenceEntitySpecAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReferenceEntitySpecRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_1,
                      							"es.um.uschema.xtext.skiql.Skiql.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:702:6: lv_name_1_2= '*'
                    {
                    lv_name_1_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_2, grammarAccess.getReferenceEntitySpecAccess().getNameAsteriskKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReferenceEntitySpecRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalSkiql.g:713:6: lv_name_1_3= '_'
                    {
                    lv_name_1_3=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_3, grammarAccess.getReferenceEntitySpecAccess().getName_Keyword_1_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReferenceEntitySpecRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSkiql.g:726:3: ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=25 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSkiql.g:727:4: (lv_variationFilter_2_0= ruleReferenceVariationFilter )
                    {
                    // InternalSkiql.g:727:4: (lv_variationFilter_2_0= ruleReferenceVariationFilter )
                    // InternalSkiql.g:728:5: lv_variationFilter_2_0= ruleReferenceVariationFilter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getReferenceEntitySpecAccess().getVariationFilterReferenceVariationFilterParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variationFilter_2_0=ruleReferenceVariationFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getReferenceEntitySpecRule());
                      					}
                      					set(
                      						current,
                      						"variationFilter",
                      						lv_variationFilter_2_0,
                      						"es.um.uschema.xtext.skiql.Skiql.ReferenceVariationFilter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReferenceEntitySpec"


    // $ANTLR start "entryRuleRelationshipQuery"
    // InternalSkiql.g:749:1: entryRuleRelationshipQuery returns [EObject current=null] : iv_ruleRelationshipQuery= ruleRelationshipQuery EOF ;
    public final EObject entryRuleRelationshipQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipQuery = null;


        try {
            // InternalSkiql.g:749:58: (iv_ruleRelationshipQuery= ruleRelationshipQuery EOF )
            // InternalSkiql.g:750:2: iv_ruleRelationshipQuery= ruleRelationshipQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipQuery=ruleRelationshipQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationshipQuery"


    // $ANTLR start "ruleRelationshipQuery"
    // InternalSkiql.g:756:1: ruleRelationshipQuery returns [EObject current=null] : ( () otherlv_1= 'FROM' ( (lv_from_2_0= ruleReferenceEntitySpec ) ) otherlv_3= 'TO' ( ( (lv_to_4_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_5_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_6= ',' ) ( ( (lv_to_7_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) ) ) )* ) ;
    public final EObject ruleRelationshipQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_from_2_0 = null;

        EObject lv_to_4_0 = null;

        EObject lv_to_5_0 = null;

        EObject lv_to_7_0 = null;

        EObject lv_to_8_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:762:2: ( ( () otherlv_1= 'FROM' ( (lv_from_2_0= ruleReferenceEntitySpec ) ) otherlv_3= 'TO' ( ( (lv_to_4_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_5_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_6= ',' ) ( ( (lv_to_7_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) ) ) )* ) )
            // InternalSkiql.g:763:2: ( () otherlv_1= 'FROM' ( (lv_from_2_0= ruleReferenceEntitySpec ) ) otherlv_3= 'TO' ( ( (lv_to_4_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_5_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_6= ',' ) ( ( (lv_to_7_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) ) ) )* )
            {
            // InternalSkiql.g:763:2: ( () otherlv_1= 'FROM' ( (lv_from_2_0= ruleReferenceEntitySpec ) ) otherlv_3= 'TO' ( ( (lv_to_4_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_5_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_6= ',' ) ( ( (lv_to_7_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) ) ) )* )
            // InternalSkiql.g:764:3: () otherlv_1= 'FROM' ( (lv_from_2_0= ruleReferenceEntitySpec ) ) otherlv_3= 'TO' ( ( (lv_to_4_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_5_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_6= ',' ) ( ( (lv_to_7_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) ) ) )*
            {
            // InternalSkiql.g:764:3: ()
            // InternalSkiql.g:765:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipQueryAccess().getRelationshipQueryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelationshipQueryAccess().getFROMKeyword_1());
              		
            }
            // InternalSkiql.g:775:3: ( (lv_from_2_0= ruleReferenceEntitySpec ) )
            // InternalSkiql.g:776:4: (lv_from_2_0= ruleReferenceEntitySpec )
            {
            // InternalSkiql.g:776:4: (lv_from_2_0= ruleReferenceEntitySpec )
            // InternalSkiql.g:777:5: lv_from_2_0= ruleReferenceEntitySpec
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipQueryAccess().getFromReferenceEntitySpecParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_from_2_0=ruleReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipQueryRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_2_0,
              						"es.um.uschema.xtext.skiql.Skiql.ReferenceEntitySpec");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRelationshipQueryAccess().getTOKeyword_3());
              		
            }
            // InternalSkiql.g:798:3: ( ( (lv_to_4_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_5_0= ruleIndirectRelationshipSpec ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=15 && LA14_0<=16)||LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) && (synpred1_InternalSkiql())) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSkiql.g:799:4: ( (lv_to_4_0= ruleRelationshipSpec ) )
                    {
                    // InternalSkiql.g:799:4: ( (lv_to_4_0= ruleRelationshipSpec ) )
                    // InternalSkiql.g:800:5: (lv_to_4_0= ruleRelationshipSpec )
                    {
                    // InternalSkiql.g:800:5: (lv_to_4_0= ruleRelationshipSpec )
                    // InternalSkiql.g:801:6: lv_to_4_0= ruleRelationshipSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_to_4_0=ruleRelationshipSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRelationshipQueryRule());
                      						}
                      						add(
                      							current,
                      							"to",
                      							lv_to_4_0,
                      							"es.um.uschema.xtext.skiql.Skiql.RelationshipSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:819:4: ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_5_0= ruleIndirectRelationshipSpec ) )
                    {
                    // InternalSkiql.g:819:4: ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_5_0= ruleIndirectRelationshipSpec ) )
                    // InternalSkiql.g:820:5: ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_5_0= ruleIndirectRelationshipSpec )
                    {
                    // InternalSkiql.g:824:5: (lv_to_5_0= ruleIndirectRelationshipSpec )
                    // InternalSkiql.g:825:6: lv_to_5_0= ruleIndirectRelationshipSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_to_5_0=ruleIndirectRelationshipSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRelationshipQueryRule());
                      						}
                      						add(
                      							current,
                      							"to",
                      							lv_to_5_0,
                      							"es.um.uschema.xtext.skiql.Skiql.IndirectRelationshipSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSkiql.g:843:3: ( ( ( ',' )=>otherlv_6= ',' ) ( ( (lv_to_7_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) && (synpred2_InternalSkiql())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSkiql.g:844:4: ( ( ',' )=>otherlv_6= ',' ) ( ( (lv_to_7_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) ) )
            	    {
            	    // InternalSkiql.g:844:4: ( ( ',' )=>otherlv_6= ',' )
            	    // InternalSkiql.g:845:5: ( ',' )=>otherlv_6= ','
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getRelationshipQueryAccess().getCommaKeyword_5_0());
            	      				
            	    }

            	    }

            	    // InternalSkiql.g:851:4: ( ( (lv_to_7_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==RULE_ID||(LA15_0>=15 && LA15_0<=16)||LA15_0==20) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==24) && (synpred3_InternalSkiql())) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalSkiql.g:852:5: ( (lv_to_7_0= ruleRelationshipSpec ) )
            	            {
            	            // InternalSkiql.g:852:5: ( (lv_to_7_0= ruleRelationshipSpec ) )
            	            // InternalSkiql.g:853:6: (lv_to_7_0= ruleRelationshipSpec )
            	            {
            	            // InternalSkiql.g:853:6: (lv_to_7_0= ruleRelationshipSpec )
            	            // InternalSkiql.g:854:7: lv_to_7_0= ruleRelationshipSpec
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_5_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_9);
            	            lv_to_7_0=ruleRelationshipSpec();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getRelationshipQueryRule());
            	              							}
            	              							add(
            	              								current,
            	              								"to",
            	              								lv_to_7_0,
            	              								"es.um.uschema.xtext.skiql.Skiql.RelationshipSpec");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSkiql.g:872:5: ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) )
            	            {
            	            // InternalSkiql.g:872:5: ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec ) )
            	            // InternalSkiql.g:873:6: ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_8_0= ruleIndirectRelationshipSpec )
            	            {
            	            // InternalSkiql.g:877:6: (lv_to_8_0= ruleIndirectRelationshipSpec )
            	            // InternalSkiql.g:878:7: lv_to_8_0= ruleIndirectRelationshipSpec
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_5_1_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_9);
            	            lv_to_8_0=ruleIndirectRelationshipSpec();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getRelationshipQueryRule());
            	              							}
            	              							add(
            	              								current,
            	              								"to",
            	              								lv_to_8_0,
            	              								"es.um.uschema.xtext.skiql.Skiql.IndirectRelationshipSpec");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationshipQuery"


    // $ANTLR start "entryRuleNestedRelationshipQuery"
    // InternalSkiql.g:901:1: entryRuleNestedRelationshipQuery returns [EObject current=null] : iv_ruleNestedRelationshipQuery= ruleNestedRelationshipQuery EOF ;
    public final EObject entryRuleNestedRelationshipQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRelationshipQuery = null;


        try {
            // InternalSkiql.g:901:64: (iv_ruleNestedRelationshipQuery= ruleNestedRelationshipQuery EOF )
            // InternalSkiql.g:902:2: iv_ruleNestedRelationshipQuery= ruleNestedRelationshipQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedRelationshipQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNestedRelationshipQuery=ruleNestedRelationshipQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedRelationshipQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedRelationshipQuery"


    // $ANTLR start "ruleNestedRelationshipQuery"
    // InternalSkiql.g:908:1: ruleNestedRelationshipQuery returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'FROM' )? ( (lv_from_3_0= ruleReferenceEntitySpec ) ) otherlv_4= 'TO' ( ( (lv_to_5_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_6_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_7= ',' ) ( ( (lv_to_8_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleNestedRelationshipQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_from_3_0 = null;

        EObject lv_to_5_0 = null;

        EObject lv_to_6_0 = null;

        EObject lv_to_8_0 = null;

        EObject lv_to_9_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:914:2: ( ( () otherlv_1= '{' (otherlv_2= 'FROM' )? ( (lv_from_3_0= ruleReferenceEntitySpec ) ) otherlv_4= 'TO' ( ( (lv_to_5_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_6_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_7= ',' ) ( ( (lv_to_8_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) ) ) )* otherlv_10= '}' ) )
            // InternalSkiql.g:915:2: ( () otherlv_1= '{' (otherlv_2= 'FROM' )? ( (lv_from_3_0= ruleReferenceEntitySpec ) ) otherlv_4= 'TO' ( ( (lv_to_5_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_6_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_7= ',' ) ( ( (lv_to_8_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) ) ) )* otherlv_10= '}' )
            {
            // InternalSkiql.g:915:2: ( () otherlv_1= '{' (otherlv_2= 'FROM' )? ( (lv_from_3_0= ruleReferenceEntitySpec ) ) otherlv_4= 'TO' ( ( (lv_to_5_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_6_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_7= ',' ) ( ( (lv_to_8_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) ) ) )* otherlv_10= '}' )
            // InternalSkiql.g:916:3: () otherlv_1= '{' (otherlv_2= 'FROM' )? ( (lv_from_3_0= ruleReferenceEntitySpec ) ) otherlv_4= 'TO' ( ( (lv_to_5_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_6_0= ruleIndirectRelationshipSpec ) ) ) ( ( ( ',' )=>otherlv_7= ',' ) ( ( (lv_to_8_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) ) ) )* otherlv_10= '}'
            {
            // InternalSkiql.g:916:3: ()
            // InternalSkiql.g:917:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNestedRelationshipQueryAccess().getRelationshipQueryAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNestedRelationshipQueryAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalSkiql.g:927:3: (otherlv_2= 'FROM' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSkiql.g:928:4: otherlv_2= 'FROM'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNestedRelationshipQueryAccess().getFROMKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSkiql.g:933:3: ( (lv_from_3_0= ruleReferenceEntitySpec ) )
            // InternalSkiql.g:934:4: (lv_from_3_0= ruleReferenceEntitySpec )
            {
            // InternalSkiql.g:934:4: (lv_from_3_0= ruleReferenceEntitySpec )
            // InternalSkiql.g:935:5: lv_from_3_0= ruleReferenceEntitySpec
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedRelationshipQueryAccess().getFromReferenceEntitySpecParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_from_3_0=ruleReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedRelationshipQueryRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_3_0,
              						"es.um.uschema.xtext.skiql.Skiql.ReferenceEntitySpec");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getNestedRelationshipQueryAccess().getTOKeyword_4());
              		
            }
            // InternalSkiql.g:956:3: ( ( (lv_to_5_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_6_0= ruleIndirectRelationshipSpec ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=15 && LA18_0<=16)||LA18_0==20) ) {
                alt18=1;
            }
            else if ( (LA18_0==24) && (synpred4_InternalSkiql())) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSkiql.g:957:4: ( (lv_to_5_0= ruleRelationshipSpec ) )
                    {
                    // InternalSkiql.g:957:4: ( (lv_to_5_0= ruleRelationshipSpec ) )
                    // InternalSkiql.g:958:5: (lv_to_5_0= ruleRelationshipSpec )
                    {
                    // InternalSkiql.g:958:5: (lv_to_5_0= ruleRelationshipSpec )
                    // InternalSkiql.g:959:6: lv_to_5_0= ruleRelationshipSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNestedRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_to_5_0=ruleRelationshipSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNestedRelationshipQueryRule());
                      						}
                      						add(
                      							current,
                      							"to",
                      							lv_to_5_0,
                      							"es.um.uschema.xtext.skiql.Skiql.RelationshipSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:977:4: ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_6_0= ruleIndirectRelationshipSpec ) )
                    {
                    // InternalSkiql.g:977:4: ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_6_0= ruleIndirectRelationshipSpec ) )
                    // InternalSkiql.g:978:5: ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_6_0= ruleIndirectRelationshipSpec )
                    {
                    // InternalSkiql.g:982:5: (lv_to_6_0= ruleIndirectRelationshipSpec )
                    // InternalSkiql.g:983:6: lv_to_6_0= ruleIndirectRelationshipSpec
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNestedRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_to_6_0=ruleIndirectRelationshipSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNestedRelationshipQueryRule());
                      						}
                      						add(
                      							current,
                      							"to",
                      							lv_to_6_0,
                      							"es.um.uschema.xtext.skiql.Skiql.IndirectRelationshipSpec");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSkiql.g:1001:3: ( ( ( ',' )=>otherlv_7= ',' ) ( ( (lv_to_8_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) && (synpred5_InternalSkiql())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSkiql.g:1002:4: ( ( ',' )=>otherlv_7= ',' ) ( ( (lv_to_8_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) ) )
            	    {
            	    // InternalSkiql.g:1002:4: ( ( ',' )=>otherlv_7= ',' )
            	    // InternalSkiql.g:1003:5: ( ',' )=>otherlv_7= ','
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getNestedRelationshipQueryAccess().getCommaKeyword_6_0());
            	      				
            	    }

            	    }

            	    // InternalSkiql.g:1009:4: ( ( (lv_to_8_0= ruleRelationshipSpec ) ) | ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_ID||(LA19_0>=15 && LA19_0<=16)||LA19_0==20) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==24) && (synpred6_InternalSkiql())) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalSkiql.g:1010:5: ( (lv_to_8_0= ruleRelationshipSpec ) )
            	            {
            	            // InternalSkiql.g:1010:5: ( (lv_to_8_0= ruleRelationshipSpec ) )
            	            // InternalSkiql.g:1011:6: (lv_to_8_0= ruleRelationshipSpec )
            	            {
            	            // InternalSkiql.g:1011:6: (lv_to_8_0= ruleRelationshipSpec )
            	            // InternalSkiql.g:1012:7: lv_to_8_0= ruleRelationshipSpec
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getNestedRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_6_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_11);
            	            lv_to_8_0=ruleRelationshipSpec();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getNestedRelationshipQueryRule());
            	              							}
            	              							add(
            	              								current,
            	              								"to",
            	              								lv_to_8_0,
            	              								"es.um.uschema.xtext.skiql.Skiql.RelationshipSpec");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSkiql.g:1030:5: ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) )
            	            {
            	            // InternalSkiql.g:1030:5: ( ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec ) )
            	            // InternalSkiql.g:1031:6: ( ( ruleIndirectRelationshipSpec ) )=> (lv_to_9_0= ruleIndirectRelationshipSpec )
            	            {
            	            // InternalSkiql.g:1035:6: (lv_to_9_0= ruleIndirectRelationshipSpec )
            	            // InternalSkiql.g:1036:7: lv_to_9_0= ruleIndirectRelationshipSpec
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getNestedRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_6_1_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_11);
            	            lv_to_9_0=ruleIndirectRelationshipSpec();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getNestedRelationshipQueryRule());
            	              							}
            	              							add(
            	              								current,
            	              								"to",
            	              								lv_to_9_0,
            	              								"es.um.uschema.xtext.skiql.Skiql.IndirectRelationshipSpec");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getNestedRelationshipQueryAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedRelationshipQuery"


    // $ANTLR start "entryRuleRelationshipSpec"
    // InternalSkiql.g:1063:1: entryRuleRelationshipSpec returns [EObject current=null] : iv_ruleRelationshipSpec= ruleRelationshipSpec EOF ;
    public final EObject entryRuleRelationshipSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipSpec = null;


        try {
            // InternalSkiql.g:1063:57: (iv_ruleRelationshipSpec= ruleRelationshipSpec EOF )
            // InternalSkiql.g:1064:2: iv_ruleRelationshipSpec= ruleRelationshipSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipSpec=ruleRelationshipSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationshipSpec"


    // $ANTLR start "ruleRelationshipSpec"
    // InternalSkiql.g:1070:1: ruleRelationshipSpec returns [EObject current=null] : ( () ( (lv_targetExpression_1_0= ruleTargetExpression ) ) ( ( ( ruleRelationTypeSpec ) )=> (lv_relationSpec_2_0= ruleRelationTypeSpec ) )? ) ;
    public final EObject ruleRelationshipSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_targetExpression_1_0 = null;

        EObject lv_relationSpec_2_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1076:2: ( ( () ( (lv_targetExpression_1_0= ruleTargetExpression ) ) ( ( ( ruleRelationTypeSpec ) )=> (lv_relationSpec_2_0= ruleRelationTypeSpec ) )? ) )
            // InternalSkiql.g:1077:2: ( () ( (lv_targetExpression_1_0= ruleTargetExpression ) ) ( ( ( ruleRelationTypeSpec ) )=> (lv_relationSpec_2_0= ruleRelationTypeSpec ) )? )
            {
            // InternalSkiql.g:1077:2: ( () ( (lv_targetExpression_1_0= ruleTargetExpression ) ) ( ( ( ruleRelationTypeSpec ) )=> (lv_relationSpec_2_0= ruleRelationTypeSpec ) )? )
            // InternalSkiql.g:1078:3: () ( (lv_targetExpression_1_0= ruleTargetExpression ) ) ( ( ( ruleRelationTypeSpec ) )=> (lv_relationSpec_2_0= ruleRelationTypeSpec ) )?
            {
            // InternalSkiql.g:1078:3: ()
            // InternalSkiql.g:1079:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipSpecAccess().getRelationshipSpecAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:1085:3: ( (lv_targetExpression_1_0= ruleTargetExpression ) )
            // InternalSkiql.g:1086:4: (lv_targetExpression_1_0= ruleTargetExpression )
            {
            // InternalSkiql.g:1086:4: (lv_targetExpression_1_0= ruleTargetExpression )
            // InternalSkiql.g:1087:5: lv_targetExpression_1_0= ruleTargetExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipSpecAccess().getTargetExpressionTargetExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_targetExpression_1_0=ruleTargetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipSpecRule());
              					}
              					set(
              						current,
              						"targetExpression",
              						lv_targetExpression_1_0,
              						"es.um.uschema.xtext.skiql.Skiql.TargetExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSkiql.g:1104:3: ( ( ( ruleRelationTypeSpec ) )=> (lv_relationSpec_2_0= ruleRelationTypeSpec ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) && (synpred7_InternalSkiql())) {
                alt21=1;
            }
            else if ( (LA21_0==22) && (synpred7_InternalSkiql())) {
                alt21=1;
            }
            else if ( (LA21_0==23) && (synpred7_InternalSkiql())) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSkiql.g:1105:4: ( ( ruleRelationTypeSpec ) )=> (lv_relationSpec_2_0= ruleRelationTypeSpec )
                    {
                    // InternalSkiql.g:1109:4: (lv_relationSpec_2_0= ruleRelationTypeSpec )
                    // InternalSkiql.g:1110:5: lv_relationSpec_2_0= ruleRelationTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRelationshipSpecAccess().getRelationSpecRelationTypeSpecParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_relationSpec_2_0=ruleRelationTypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRelationshipSpecRule());
                      					}
                      					set(
                      						current,
                      						"relationSpec",
                      						lv_relationSpec_2_0,
                      						"es.um.uschema.xtext.skiql.Skiql.RelationTypeSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationshipSpec"


    // $ANTLR start "entryRuleRelationTypeSpec"
    // InternalSkiql.g:1131:1: entryRuleRelationTypeSpec returns [EObject current=null] : iv_ruleRelationTypeSpec= ruleRelationTypeSpec EOF ;
    public final EObject entryRuleRelationTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationTypeSpec = null;


        try {
            // InternalSkiql.g:1131:57: (iv_ruleRelationTypeSpec= ruleRelationTypeSpec EOF )
            // InternalSkiql.g:1132:2: iv_ruleRelationTypeSpec= ruleRelationTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationTypeSpec=ruleRelationTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationTypeSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationTypeSpec"


    // $ANTLR start "ruleRelationTypeSpec"
    // InternalSkiql.g:1138:1: ruleRelationTypeSpec returns [EObject current=null] : (this_RelationSpec_0= ruleRelationSpec | this_ReferenceSpec_1= ruleReferenceSpec | this_AggregationSpec_2= ruleAggregationSpec ) ;
    public final EObject ruleRelationTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RelationSpec_0 = null;

        EObject this_ReferenceSpec_1 = null;

        EObject this_AggregationSpec_2 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1144:2: ( (this_RelationSpec_0= ruleRelationSpec | this_ReferenceSpec_1= ruleReferenceSpec | this_AggregationSpec_2= ruleAggregationSpec ) )
            // InternalSkiql.g:1145:2: (this_RelationSpec_0= ruleRelationSpec | this_ReferenceSpec_1= ruleReferenceSpec | this_AggregationSpec_2= ruleAggregationSpec )
            {
            // InternalSkiql.g:1145:2: (this_RelationSpec_0= ruleRelationSpec | this_ReferenceSpec_1= ruleReferenceSpec | this_AggregationSpec_2= ruleAggregationSpec )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt22=1;
                }
                break;
            case 22:
                {
                alt22=2;
                }
                break;
            case 23:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSkiql.g:1146:3: this_RelationSpec_0= ruleRelationSpec
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRelationTypeSpecAccess().getRelationSpecParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationSpec_0=ruleRelationSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationSpec_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1155:3: this_ReferenceSpec_1= ruleReferenceSpec
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRelationTypeSpecAccess().getReferenceSpecParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReferenceSpec_1=ruleReferenceSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReferenceSpec_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSkiql.g:1164:3: this_AggregationSpec_2= ruleAggregationSpec
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRelationTypeSpecAccess().getAggregationSpecParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AggregationSpec_2=ruleAggregationSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AggregationSpec_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationTypeSpec"


    // $ANTLR start "entryRuleRelationSpec"
    // InternalSkiql.g:1176:1: entryRuleRelationSpec returns [EObject current=null] : iv_ruleRelationSpec= ruleRelationSpec EOF ;
    public final EObject entryRuleRelationSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationSpec = null;


        try {
            // InternalSkiql.g:1176:53: (iv_ruleRelationSpec= ruleRelationSpec EOF )
            // InternalSkiql.g:1177:2: iv_ruleRelationSpec= ruleRelationSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationSpec=ruleRelationSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationSpec"


    // $ANTLR start "ruleRelationSpec"
    // InternalSkiql.g:1183:1: ruleRelationSpec returns [EObject current=null] : ( () otherlv_1= 'ANY' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRelationSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSkiql.g:1189:2: ( ( () otherlv_1= 'ANY' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSkiql.g:1190:2: ( () otherlv_1= 'ANY' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSkiql.g:1190:2: ( () otherlv_1= 'ANY' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSkiql.g:1191:3: () otherlv_1= 'ANY' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalSkiql.g:1191:3: ()
            // InternalSkiql.g:1192:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationSpecAccess().getRelationSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelationSpecAccess().getANYKeyword_1());
              		
            }
            // InternalSkiql.g:1202:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSkiql.g:1203:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSkiql.g:1203:4: (lv_name_2_0= RULE_ID )
            // InternalSkiql.g:1204:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getRelationSpecAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRelationSpecRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"es.um.uschema.xtext.skiql.Skiql.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationSpec"


    // $ANTLR start "entryRuleReferenceSpec"
    // InternalSkiql.g:1224:1: entryRuleReferenceSpec returns [EObject current=null] : iv_ruleReferenceSpec= ruleReferenceSpec EOF ;
    public final EObject entryRuleReferenceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceSpec = null;


        try {
            // InternalSkiql.g:1224:54: (iv_ruleReferenceSpec= ruleReferenceSpec EOF )
            // InternalSkiql.g:1225:2: iv_ruleReferenceSpec= ruleReferenceSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferenceSpec=ruleReferenceSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceSpec"


    // $ANTLR start "ruleReferenceSpec"
    // InternalSkiql.g:1231:1: ruleReferenceSpec returns [EObject current=null] : ( () otherlv_1= 'REF' ( (lv_name_2_0= RULE_ID ) )? ( (lv_variationFilter_3_0= ruleVariationFilter ) )? ) ;
    public final EObject ruleReferenceSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_variationFilter_3_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1237:2: ( ( () otherlv_1= 'REF' ( (lv_name_2_0= RULE_ID ) )? ( (lv_variationFilter_3_0= ruleVariationFilter ) )? ) )
            // InternalSkiql.g:1238:2: ( () otherlv_1= 'REF' ( (lv_name_2_0= RULE_ID ) )? ( (lv_variationFilter_3_0= ruleVariationFilter ) )? )
            {
            // InternalSkiql.g:1238:2: ( () otherlv_1= 'REF' ( (lv_name_2_0= RULE_ID ) )? ( (lv_variationFilter_3_0= ruleVariationFilter ) )? )
            // InternalSkiql.g:1239:3: () otherlv_1= 'REF' ( (lv_name_2_0= RULE_ID ) )? ( (lv_variationFilter_3_0= ruleVariationFilter ) )?
            {
            // InternalSkiql.g:1239:3: ()
            // InternalSkiql.g:1240:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReferenceSpecAccess().getReferenceSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReferenceSpecAccess().getREFKeyword_1());
              		
            }
            // InternalSkiql.g:1250:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSkiql.g:1251:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSkiql.g:1251:4: (lv_name_2_0= RULE_ID )
                    // InternalSkiql.g:1252:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_2_0, grammarAccess.getReferenceSpecAccess().getNameIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getReferenceSpecRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_2_0,
                      						"es.um.uschema.xtext.skiql.Skiql.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSkiql.g:1268:3: ( (lv_variationFilter_3_0= ruleVariationFilter ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=25 && LA24_0<=26)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSkiql.g:1269:4: (lv_variationFilter_3_0= ruleVariationFilter )
                    {
                    // InternalSkiql.g:1269:4: (lv_variationFilter_3_0= ruleVariationFilter )
                    // InternalSkiql.g:1270:5: lv_variationFilter_3_0= ruleVariationFilter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getReferenceSpecAccess().getVariationFilterVariationFilterParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variationFilter_3_0=ruleVariationFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getReferenceSpecRule());
                      					}
                      					set(
                      						current,
                      						"variationFilter",
                      						lv_variationFilter_3_0,
                      						"es.um.uschema.xtext.skiql.Skiql.VariationFilter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReferenceSpec"


    // $ANTLR start "entryRuleAggregationSpec"
    // InternalSkiql.g:1291:1: entryRuleAggregationSpec returns [EObject current=null] : iv_ruleAggregationSpec= ruleAggregationSpec EOF ;
    public final EObject entryRuleAggregationSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregationSpec = null;


        try {
            // InternalSkiql.g:1291:56: (iv_ruleAggregationSpec= ruleAggregationSpec EOF )
            // InternalSkiql.g:1292:2: iv_ruleAggregationSpec= ruleAggregationSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregationSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregationSpec=ruleAggregationSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregationSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAggregationSpec"


    // $ANTLR start "ruleAggregationSpec"
    // InternalSkiql.g:1298:1: ruleAggregationSpec returns [EObject current=null] : ( () otherlv_1= 'AGGR' ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleAggregationSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSkiql.g:1304:2: ( ( () otherlv_1= 'AGGR' ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalSkiql.g:1305:2: ( () otherlv_1= 'AGGR' ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalSkiql.g:1305:2: ( () otherlv_1= 'AGGR' ( (lv_name_2_0= RULE_ID ) )? )
            // InternalSkiql.g:1306:3: () otherlv_1= 'AGGR' ( (lv_name_2_0= RULE_ID ) )?
            {
            // InternalSkiql.g:1306:3: ()
            // InternalSkiql.g:1307:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAggregationSpecAccess().getAggregationSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAggregationSpecAccess().getAGGRKeyword_1());
              		
            }
            // InternalSkiql.g:1317:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSkiql.g:1318:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSkiql.g:1318:4: (lv_name_2_0= RULE_ID )
                    // InternalSkiql.g:1319:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_2_0, grammarAccess.getAggregationSpecAccess().getNameIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAggregationSpecRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_2_0,
                      						"es.um.uschema.xtext.skiql.Skiql.ID");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAggregationSpec"


    // $ANTLR start "entryRuleIndirectRelationshipSpec"
    // InternalSkiql.g:1339:1: entryRuleIndirectRelationshipSpec returns [EObject current=null] : iv_ruleIndirectRelationshipSpec= ruleIndirectRelationshipSpec EOF ;
    public final EObject entryRuleIndirectRelationshipSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectRelationshipSpec = null;


        try {
            // InternalSkiql.g:1339:65: (iv_ruleIndirectRelationshipSpec= ruleIndirectRelationshipSpec EOF )
            // InternalSkiql.g:1340:2: iv_ruleIndirectRelationshipSpec= ruleIndirectRelationshipSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndirectRelationshipSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndirectRelationshipSpec=ruleIndirectRelationshipSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndirectRelationshipSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIndirectRelationshipSpec"


    // $ANTLR start "ruleIndirectRelationshipSpec"
    // InternalSkiql.g:1346:1: ruleIndirectRelationshipSpec returns [EObject current=null] : ( () ( (lv_indirect_1_0= '>>' ) ) ( (lv_targetExpression_2_0= ruleTargetExpression ) ) ( ( ( ruleIndirectRelationTypeSpec ) )=> (lv_relationSpec_3_0= ruleIndirectRelationTypeSpec ) )? ) ;
    public final EObject ruleIndirectRelationshipSpec() throws RecognitionException {
        EObject current = null;

        Token lv_indirect_1_0=null;
        EObject lv_targetExpression_2_0 = null;

        EObject lv_relationSpec_3_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1352:2: ( ( () ( (lv_indirect_1_0= '>>' ) ) ( (lv_targetExpression_2_0= ruleTargetExpression ) ) ( ( ( ruleIndirectRelationTypeSpec ) )=> (lv_relationSpec_3_0= ruleIndirectRelationTypeSpec ) )? ) )
            // InternalSkiql.g:1353:2: ( () ( (lv_indirect_1_0= '>>' ) ) ( (lv_targetExpression_2_0= ruleTargetExpression ) ) ( ( ( ruleIndirectRelationTypeSpec ) )=> (lv_relationSpec_3_0= ruleIndirectRelationTypeSpec ) )? )
            {
            // InternalSkiql.g:1353:2: ( () ( (lv_indirect_1_0= '>>' ) ) ( (lv_targetExpression_2_0= ruleTargetExpression ) ) ( ( ( ruleIndirectRelationTypeSpec ) )=> (lv_relationSpec_3_0= ruleIndirectRelationTypeSpec ) )? )
            // InternalSkiql.g:1354:3: () ( (lv_indirect_1_0= '>>' ) ) ( (lv_targetExpression_2_0= ruleTargetExpression ) ) ( ( ( ruleIndirectRelationTypeSpec ) )=> (lv_relationSpec_3_0= ruleIndirectRelationTypeSpec ) )?
            {
            // InternalSkiql.g:1354:3: ()
            // InternalSkiql.g:1355:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndirectRelationshipSpecAccess().getRelationshipSpecAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:1361:3: ( (lv_indirect_1_0= '>>' ) )
            // InternalSkiql.g:1362:4: (lv_indirect_1_0= '>>' )
            {
            // InternalSkiql.g:1362:4: (lv_indirect_1_0= '>>' )
            // InternalSkiql.g:1363:5: lv_indirect_1_0= '>>'
            {
            lv_indirect_1_0=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_indirect_1_0, grammarAccess.getIndirectRelationshipSpecAccess().getIndirectGreaterThanSignGreaterThanSignKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIndirectRelationshipSpecRule());
              					}
              					setWithLastConsumed(current, "indirect", lv_indirect_1_0 != null, ">>");
              				
            }

            }


            }

            // InternalSkiql.g:1375:3: ( (lv_targetExpression_2_0= ruleTargetExpression ) )
            // InternalSkiql.g:1376:4: (lv_targetExpression_2_0= ruleTargetExpression )
            {
            // InternalSkiql.g:1376:4: (lv_targetExpression_2_0= ruleTargetExpression )
            // InternalSkiql.g:1377:5: lv_targetExpression_2_0= ruleTargetExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIndirectRelationshipSpecAccess().getTargetExpressionTargetExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_targetExpression_2_0=ruleTargetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIndirectRelationshipSpecRule());
              					}
              					set(
              						current,
              						"targetExpression",
              						lv_targetExpression_2_0,
              						"es.um.uschema.xtext.skiql.Skiql.TargetExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSkiql.g:1394:3: ( ( ( ruleIndirectRelationTypeSpec ) )=> (lv_relationSpec_3_0= ruleIndirectRelationTypeSpec ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) && (synpred8_InternalSkiql())) {
                alt26=1;
            }
            else if ( (LA26_0==23) && (synpred8_InternalSkiql())) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSkiql.g:1395:4: ( ( ruleIndirectRelationTypeSpec ) )=> (lv_relationSpec_3_0= ruleIndirectRelationTypeSpec )
                    {
                    // InternalSkiql.g:1399:4: (lv_relationSpec_3_0= ruleIndirectRelationTypeSpec )
                    // InternalSkiql.g:1400:5: lv_relationSpec_3_0= ruleIndirectRelationTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIndirectRelationshipSpecAccess().getRelationSpecIndirectRelationTypeSpecParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_relationSpec_3_0=ruleIndirectRelationTypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIndirectRelationshipSpecRule());
                      					}
                      					set(
                      						current,
                      						"relationSpec",
                      						lv_relationSpec_3_0,
                      						"es.um.uschema.xtext.skiql.Skiql.IndirectRelationTypeSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIndirectRelationshipSpec"


    // $ANTLR start "entryRuleIndirectRelationTypeSpec"
    // InternalSkiql.g:1421:1: entryRuleIndirectRelationTypeSpec returns [EObject current=null] : iv_ruleIndirectRelationTypeSpec= ruleIndirectRelationTypeSpec EOF ;
    public final EObject entryRuleIndirectRelationTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectRelationTypeSpec = null;


        try {
            // InternalSkiql.g:1421:65: (iv_ruleIndirectRelationTypeSpec= ruleIndirectRelationTypeSpec EOF )
            // InternalSkiql.g:1422:2: iv_ruleIndirectRelationTypeSpec= ruleIndirectRelationTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndirectRelationTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndirectRelationTypeSpec=ruleIndirectRelationTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndirectRelationTypeSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIndirectRelationTypeSpec"


    // $ANTLR start "ruleIndirectRelationTypeSpec"
    // InternalSkiql.g:1428:1: ruleIndirectRelationTypeSpec returns [EObject current=null] : (this_IndirectReferenceSpec_0= ruleIndirectReferenceSpec | this_IndirectAggregationSpec_1= ruleIndirectAggregationSpec ) ;
    public final EObject ruleIndirectRelationTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject this_IndirectReferenceSpec_0 = null;

        EObject this_IndirectAggregationSpec_1 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1434:2: ( (this_IndirectReferenceSpec_0= ruleIndirectReferenceSpec | this_IndirectAggregationSpec_1= ruleIndirectAggregationSpec ) )
            // InternalSkiql.g:1435:2: (this_IndirectReferenceSpec_0= ruleIndirectReferenceSpec | this_IndirectAggregationSpec_1= ruleIndirectAggregationSpec )
            {
            // InternalSkiql.g:1435:2: (this_IndirectReferenceSpec_0= ruleIndirectReferenceSpec | this_IndirectAggregationSpec_1= ruleIndirectAggregationSpec )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            else if ( (LA27_0==23) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSkiql.g:1436:3: this_IndirectReferenceSpec_0= ruleIndirectReferenceSpec
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIndirectRelationTypeSpecAccess().getIndirectReferenceSpecParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IndirectReferenceSpec_0=ruleIndirectReferenceSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IndirectReferenceSpec_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1445:3: this_IndirectAggregationSpec_1= ruleIndirectAggregationSpec
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIndirectRelationTypeSpecAccess().getIndirectAggregationSpecParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IndirectAggregationSpec_1=ruleIndirectAggregationSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IndirectAggregationSpec_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIndirectRelationTypeSpec"


    // $ANTLR start "entryRuleIndirectReferenceSpec"
    // InternalSkiql.g:1457:1: entryRuleIndirectReferenceSpec returns [EObject current=null] : iv_ruleIndirectReferenceSpec= ruleIndirectReferenceSpec EOF ;
    public final EObject entryRuleIndirectReferenceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectReferenceSpec = null;


        try {
            // InternalSkiql.g:1457:62: (iv_ruleIndirectReferenceSpec= ruleIndirectReferenceSpec EOF )
            // InternalSkiql.g:1458:2: iv_ruleIndirectReferenceSpec= ruleIndirectReferenceSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndirectReferenceSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndirectReferenceSpec=ruleIndirectReferenceSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndirectReferenceSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIndirectReferenceSpec"


    // $ANTLR start "ruleIndirectReferenceSpec"
    // InternalSkiql.g:1464:1: ruleIndirectReferenceSpec returns [EObject current=null] : ( () otherlv_1= 'REF' ) ;
    public final EObject ruleIndirectReferenceSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSkiql.g:1470:2: ( ( () otherlv_1= 'REF' ) )
            // InternalSkiql.g:1471:2: ( () otherlv_1= 'REF' )
            {
            // InternalSkiql.g:1471:2: ( () otherlv_1= 'REF' )
            // InternalSkiql.g:1472:3: () otherlv_1= 'REF'
            {
            // InternalSkiql.g:1472:3: ()
            // InternalSkiql.g:1473:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndirectReferenceSpecAccess().getReferenceSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIndirectReferenceSpecAccess().getREFKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIndirectReferenceSpec"


    // $ANTLR start "entryRuleIndirectAggregationSpec"
    // InternalSkiql.g:1487:1: entryRuleIndirectAggregationSpec returns [EObject current=null] : iv_ruleIndirectAggregationSpec= ruleIndirectAggregationSpec EOF ;
    public final EObject entryRuleIndirectAggregationSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectAggregationSpec = null;


        try {
            // InternalSkiql.g:1487:64: (iv_ruleIndirectAggregationSpec= ruleIndirectAggregationSpec EOF )
            // InternalSkiql.g:1488:2: iv_ruleIndirectAggregationSpec= ruleIndirectAggregationSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndirectAggregationSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndirectAggregationSpec=ruleIndirectAggregationSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndirectAggregationSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIndirectAggregationSpec"


    // $ANTLR start "ruleIndirectAggregationSpec"
    // InternalSkiql.g:1494:1: ruleIndirectAggregationSpec returns [EObject current=null] : ( () otherlv_1= 'AGGR' ) ;
    public final EObject ruleIndirectAggregationSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSkiql.g:1500:2: ( ( () otherlv_1= 'AGGR' ) )
            // InternalSkiql.g:1501:2: ( () otherlv_1= 'AGGR' )
            {
            // InternalSkiql.g:1501:2: ( () otherlv_1= 'AGGR' )
            // InternalSkiql.g:1502:3: () otherlv_1= 'AGGR'
            {
            // InternalSkiql.g:1502:3: ()
            // InternalSkiql.g:1503:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIndirectAggregationSpecAccess().getAggregationSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIndirectAggregationSpecAccess().getAGGRKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIndirectAggregationSpec"


    // $ANTLR start "entryRuleTargetExpression"
    // InternalSkiql.g:1517:1: entryRuleTargetExpression returns [EObject current=null] : iv_ruleTargetExpression= ruleTargetExpression EOF ;
    public final EObject entryRuleTargetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetExpression = null;


        try {
            // InternalSkiql.g:1517:57: (iv_ruleTargetExpression= ruleTargetExpression EOF )
            // InternalSkiql.g:1518:2: iv_ruleTargetExpression= ruleTargetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTargetExpression=ruleTargetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTargetExpression"


    // $ANTLR start "ruleTargetExpression"
    // InternalSkiql.g:1524:1: ruleTargetExpression returns [EObject current=null] : (this_RelationshipExpression_0= ruleRelationshipExpression | this_EntityExpression_1= ruleEntityExpression ) ;
    public final EObject ruleTargetExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationshipExpression_0 = null;

        EObject this_EntityExpression_1 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1530:2: ( (this_RelationshipExpression_0= ruleRelationshipExpression | this_EntityExpression_1= ruleEntityExpression ) )
            // InternalSkiql.g:1531:2: (this_RelationshipExpression_0= ruleRelationshipExpression | this_EntityExpression_1= ruleEntityExpression )
            {
            // InternalSkiql.g:1531:2: (this_RelationshipExpression_0= ruleRelationshipExpression | this_EntityExpression_1= ruleEntityExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID||(LA28_0>=15 && LA28_0<=16)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSkiql.g:1532:3: this_RelationshipExpression_0= ruleRelationshipExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTargetExpressionAccess().getRelationshipExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationshipExpression_0=ruleRelationshipExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationshipExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1541:3: this_EntityExpression_1= ruleEntityExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTargetExpressionAccess().getEntityExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EntityExpression_1=ruleEntityExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EntityExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTargetExpression"


    // $ANTLR start "entryRuleRelationshipExpression"
    // InternalSkiql.g:1553:1: entryRuleRelationshipExpression returns [EObject current=null] : iv_ruleRelationshipExpression= ruleRelationshipExpression EOF ;
    public final EObject entryRuleRelationshipExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipExpression = null;


        try {
            // InternalSkiql.g:1553:63: (iv_ruleRelationshipExpression= ruleRelationshipExpression EOF )
            // InternalSkiql.g:1554:2: iv_ruleRelationshipExpression= ruleRelationshipExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipExpression=ruleRelationshipExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationshipExpression"


    // $ANTLR start "ruleRelationshipExpression"
    // InternalSkiql.g:1560:1: ruleRelationshipExpression returns [EObject current=null] : ( () ( (lv_relationshipQuery_1_0= ruleNestedRelationshipQuery ) ) ) ;
    public final EObject ruleRelationshipExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_relationshipQuery_1_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1566:2: ( ( () ( (lv_relationshipQuery_1_0= ruleNestedRelationshipQuery ) ) ) )
            // InternalSkiql.g:1567:2: ( () ( (lv_relationshipQuery_1_0= ruleNestedRelationshipQuery ) ) )
            {
            // InternalSkiql.g:1567:2: ( () ( (lv_relationshipQuery_1_0= ruleNestedRelationshipQuery ) ) )
            // InternalSkiql.g:1568:3: () ( (lv_relationshipQuery_1_0= ruleNestedRelationshipQuery ) )
            {
            // InternalSkiql.g:1568:3: ()
            // InternalSkiql.g:1569:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipExpressionAccess().getRelationshipExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:1575:3: ( (lv_relationshipQuery_1_0= ruleNestedRelationshipQuery ) )
            // InternalSkiql.g:1576:4: (lv_relationshipQuery_1_0= ruleNestedRelationshipQuery )
            {
            // InternalSkiql.g:1576:4: (lv_relationshipQuery_1_0= ruleNestedRelationshipQuery )
            // InternalSkiql.g:1577:5: lv_relationshipQuery_1_0= ruleNestedRelationshipQuery
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getRelationshipQueryNestedRelationshipQueryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_relationshipQuery_1_0=ruleNestedRelationshipQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipExpressionRule());
              					}
              					set(
              						current,
              						"relationshipQuery",
              						lv_relationshipQuery_1_0,
              						"es.um.uschema.xtext.skiql.Skiql.NestedRelationshipQuery");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationshipExpression"


    // $ANTLR start "entryRuleEntityExpression"
    // InternalSkiql.g:1598:1: entryRuleEntityExpression returns [EObject current=null] : iv_ruleEntityExpression= ruleEntityExpression EOF ;
    public final EObject entryRuleEntityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityExpression = null;


        try {
            // InternalSkiql.g:1598:57: (iv_ruleEntityExpression= ruleEntityExpression EOF )
            // InternalSkiql.g:1599:2: iv_ruleEntityExpression= ruleEntityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntityExpression=ruleEntityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntityExpression"


    // $ANTLR start "ruleEntityExpression"
    // InternalSkiql.g:1605:1: ruleEntityExpression returns [EObject current=null] : ( () ( (lv_entitySpec_1_0= ruleToReferenceEntitySpec ) ) ) ;
    public final EObject ruleEntityExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_entitySpec_1_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1611:2: ( ( () ( (lv_entitySpec_1_0= ruleToReferenceEntitySpec ) ) ) )
            // InternalSkiql.g:1612:2: ( () ( (lv_entitySpec_1_0= ruleToReferenceEntitySpec ) ) )
            {
            // InternalSkiql.g:1612:2: ( () ( (lv_entitySpec_1_0= ruleToReferenceEntitySpec ) ) )
            // InternalSkiql.g:1613:3: () ( (lv_entitySpec_1_0= ruleToReferenceEntitySpec ) )
            {
            // InternalSkiql.g:1613:3: ()
            // InternalSkiql.g:1614:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEntityExpressionAccess().getEntityExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:1620:3: ( (lv_entitySpec_1_0= ruleToReferenceEntitySpec ) )
            // InternalSkiql.g:1621:4: (lv_entitySpec_1_0= ruleToReferenceEntitySpec )
            {
            // InternalSkiql.g:1621:4: (lv_entitySpec_1_0= ruleToReferenceEntitySpec )
            // InternalSkiql.g:1622:5: lv_entitySpec_1_0= ruleToReferenceEntitySpec
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntityExpressionAccess().getEntitySpecToReferenceEntitySpecParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_entitySpec_1_0=ruleToReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEntityExpressionRule());
              					}
              					set(
              						current,
              						"entitySpec",
              						lv_entitySpec_1_0,
              						"es.um.uschema.xtext.skiql.Skiql.ToReferenceEntitySpec");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntityExpression"


    // $ANTLR start "entryRuleToReferenceEntitySpec"
    // InternalSkiql.g:1643:1: entryRuleToReferenceEntitySpec returns [EObject current=null] : iv_ruleToReferenceEntitySpec= ruleToReferenceEntitySpec EOF ;
    public final EObject entryRuleToReferenceEntitySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToReferenceEntitySpec = null;


        try {
            // InternalSkiql.g:1643:62: (iv_ruleToReferenceEntitySpec= ruleToReferenceEntitySpec EOF )
            // InternalSkiql.g:1644:2: iv_ruleToReferenceEntitySpec= ruleToReferenceEntitySpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToReferenceEntitySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleToReferenceEntitySpec=ruleToReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToReferenceEntitySpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleToReferenceEntitySpec"


    // $ANTLR start "ruleToReferenceEntitySpec"
    // InternalSkiql.g:1650:1: ruleToReferenceEntitySpec returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )? ) ;
    public final EObject ruleToReferenceEntitySpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        EObject lv_variationFilter_2_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1656:2: ( ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )? ) )
            // InternalSkiql.g:1657:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )? )
            {
            // InternalSkiql.g:1657:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )? )
            // InternalSkiql.g:1658:3: () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) ) ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )?
            {
            // InternalSkiql.g:1658:3: ()
            // InternalSkiql.g:1659:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getToReferenceEntitySpecAccess().getEntitySpecAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:1665:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) ) )
            // InternalSkiql.g:1666:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) )
            {
            // InternalSkiql.g:1666:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' ) )
            // InternalSkiql.g:1667:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' )
            {
            // InternalSkiql.g:1667:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' | lv_name_1_3= '_' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt29=1;
                }
                break;
            case 15:
                {
                alt29=2;
                }
                break;
            case 16:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSkiql.g:1668:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_1, grammarAccess.getToReferenceEntitySpecAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getToReferenceEntitySpecRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_1,
                      							"es.um.uschema.xtext.skiql.Skiql.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1683:6: lv_name_1_2= '*'
                    {
                    lv_name_1_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_2, grammarAccess.getToReferenceEntitySpecAccess().getNameAsteriskKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getToReferenceEntitySpecRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalSkiql.g:1694:6: lv_name_1_3= '_'
                    {
                    lv_name_1_3=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_3, grammarAccess.getToReferenceEntitySpecAccess().getName_Keyword_1_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getToReferenceEntitySpecRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSkiql.g:1707:3: ( (lv_variationFilter_2_0= ruleReferenceVariationFilter ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=25 && LA30_0<=26)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSkiql.g:1708:4: (lv_variationFilter_2_0= ruleReferenceVariationFilter )
                    {
                    // InternalSkiql.g:1708:4: (lv_variationFilter_2_0= ruleReferenceVariationFilter )
                    // InternalSkiql.g:1709:5: lv_variationFilter_2_0= ruleReferenceVariationFilter
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getToReferenceEntitySpecAccess().getVariationFilterReferenceVariationFilterParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variationFilter_2_0=ruleReferenceVariationFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getToReferenceEntitySpecRule());
                      					}
                      					set(
                      						current,
                      						"variationFilter",
                      						lv_variationFilter_2_0,
                      						"es.um.uschema.xtext.skiql.Skiql.ReferenceVariationFilter");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleToReferenceEntitySpec"


    // $ANTLR start "entryRuleReferenceVariationFilter"
    // InternalSkiql.g:1730:1: entryRuleReferenceVariationFilter returns [EObject current=null] : iv_ruleReferenceVariationFilter= ruleReferenceVariationFilter EOF ;
    public final EObject entryRuleReferenceVariationFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceVariationFilter = null;


        try {
            // InternalSkiql.g:1730:65: (iv_ruleReferenceVariationFilter= ruleReferenceVariationFilter EOF )
            // InternalSkiql.g:1731:2: iv_ruleReferenceVariationFilter= ruleReferenceVariationFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceVariationFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferenceVariationFilter=ruleReferenceVariationFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceVariationFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceVariationFilter"


    // $ANTLR start "ruleReferenceVariationFilter"
    // InternalSkiql.g:1737:1: ruleReferenceVariationFilter returns [EObject current=null] : ( () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )? otherlv_6= ']' ) ) ) ;
    public final EObject ruleReferenceVariationFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_propertySpecs_3_0 = null;

        EObject lv_propertySpecs_5_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1743:2: ( ( () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )? otherlv_6= ']' ) ) ) )
            // InternalSkiql.g:1744:2: ( () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )? otherlv_6= ']' ) ) )
            {
            // InternalSkiql.g:1744:2: ( () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )? otherlv_6= ']' ) ) )
            // InternalSkiql.g:1745:3: () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )? otherlv_6= ']' ) )
            {
            // InternalSkiql.g:1745:3: ()
            // InternalSkiql.g:1746:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReferenceVariationFilterAccess().getVariationFilterAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:1752:3: (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )? otherlv_6= ']' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            else if ( (LA33_0==26) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalSkiql.g:1753:4: otherlv_1= '[]'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getReferenceVariationFilterAccess().getLeftSquareBracketRightSquareBracketKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1758:4: (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )? otherlv_6= ']' )
                    {
                    // InternalSkiql.g:1758:4: (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )? otherlv_6= ']' )
                    // InternalSkiql.g:1759:5: otherlv_2= '[' ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getReferenceVariationFilterAccess().getLeftSquareBracketKeyword_1_1_0());
                      				
                    }
                    // InternalSkiql.g:1763:5: ( ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID||LA32_0==15) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalSkiql.g:1764:6: ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )*
                            {
                            // InternalSkiql.g:1764:6: ( (lv_propertySpecs_3_0= ruleReferencePropertySpec ) )
                            // InternalSkiql.g:1765:7: (lv_propertySpecs_3_0= ruleReferencePropertySpec )
                            {
                            // InternalSkiql.g:1765:7: (lv_propertySpecs_3_0= ruleReferencePropertySpec )
                            // InternalSkiql.g:1766:8: lv_propertySpecs_3_0= ruleReferencePropertySpec
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsReferencePropertySpecParserRuleCall_1_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_19);
                            lv_propertySpecs_3_0=ruleReferencePropertySpec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getReferenceVariationFilterRule());
                              								}
                              								add(
                              									current,
                              									"propertySpecs",
                              									lv_propertySpecs_3_0,
                              									"es.um.uschema.xtext.skiql.Skiql.ReferencePropertySpec");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalSkiql.g:1783:6: (otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==19) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // InternalSkiql.g:1784:7: otherlv_4= ',' ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getReferenceVariationFilterAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalSkiql.g:1788:7: ( (lv_propertySpecs_5_0= ruleReferencePropertySpec ) )
                            	    // InternalSkiql.g:1789:8: (lv_propertySpecs_5_0= ruleReferencePropertySpec )
                            	    {
                            	    // InternalSkiql.g:1789:8: (lv_propertySpecs_5_0= ruleReferencePropertySpec )
                            	    // InternalSkiql.g:1790:9: lv_propertySpecs_5_0= ruleReferencePropertySpec
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsReferencePropertySpecParserRuleCall_1_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_19);
                            	    lv_propertySpecs_5_0=ruleReferencePropertySpec();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getReferenceVariationFilterRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"propertySpecs",
                            	      										lv_propertySpecs_5_0,
                            	      										"es.um.uschema.xtext.skiql.Skiql.ReferencePropertySpec");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getReferenceVariationFilterAccess().getRightSquareBracketKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReferenceVariationFilter"


    // $ANTLR start "entryRuleReferencePropertySpec"
    // InternalSkiql.g:1819:1: entryRuleReferencePropertySpec returns [EObject current=null] : iv_ruleReferencePropertySpec= ruleReferencePropertySpec EOF ;
    public final EObject entryRuleReferencePropertySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencePropertySpec = null;


        try {
            // InternalSkiql.g:1819:62: (iv_ruleReferencePropertySpec= ruleReferencePropertySpec EOF )
            // InternalSkiql.g:1820:2: iv_ruleReferencePropertySpec= ruleReferencePropertySpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferencePropertySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferencePropertySpec=ruleReferencePropertySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferencePropertySpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferencePropertySpec"


    // $ANTLR start "ruleReferencePropertySpec"
    // InternalSkiql.g:1826:1: ruleReferencePropertySpec returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveType ) ) )? ) ;
    public final EObject ruleReferencePropertySpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1832:2: ( ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveType ) ) )? ) )
            // InternalSkiql.g:1833:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveType ) ) )? )
            {
            // InternalSkiql.g:1833:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveType ) ) )? )
            // InternalSkiql.g:1834:3: () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveType ) ) )?
            {
            // InternalSkiql.g:1834:3: ()
            // InternalSkiql.g:1835:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReferencePropertySpecAccess().getPropertySpecAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:1841:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) )
            // InternalSkiql.g:1842:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            {
            // InternalSkiql.g:1842:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            // InternalSkiql.g:1843:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            {
            // InternalSkiql.g:1843:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==15) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSkiql.g:1844:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_1, grammarAccess.getReferencePropertySpecAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReferencePropertySpecRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_1,
                      							"es.um.uschema.xtext.skiql.Skiql.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1859:6: lv_name_1_2= '*'
                    {
                    lv_name_1_2=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_2, grammarAccess.getReferencePropertySpecAccess().getNameAsteriskKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReferencePropertySpecRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSkiql.g:1872:3: (otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveType ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSkiql.g:1873:4: otherlv_2= ':' ( (lv_type_3_0= rulePrimitiveType ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getReferencePropertySpecAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalSkiql.g:1877:4: ( (lv_type_3_0= rulePrimitiveType ) )
                    // InternalSkiql.g:1878:5: (lv_type_3_0= rulePrimitiveType )
                    {
                    // InternalSkiql.g:1878:5: (lv_type_3_0= rulePrimitiveType )
                    // InternalSkiql.g:1879:6: lv_type_3_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReferencePropertySpecAccess().getTypePrimitiveTypeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReferencePropertySpecRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_3_0,
                      							"es.um.uschema.xtext.skiql.Skiql.PrimitiveType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReferencePropertySpec"


    // $ANTLR start "entryRuleVariationFilter"
    // InternalSkiql.g:1901:1: entryRuleVariationFilter returns [EObject current=null] : iv_ruleVariationFilter= ruleVariationFilter EOF ;
    public final EObject entryRuleVariationFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariationFilter = null;


        try {
            // InternalSkiql.g:1901:56: (iv_ruleVariationFilter= ruleVariationFilter EOF )
            // InternalSkiql.g:1902:2: iv_ruleVariationFilter= ruleVariationFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariationFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariationFilter=ruleVariationFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariationFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariationFilter"


    // $ANTLR start "ruleVariationFilter"
    // InternalSkiql.g:1908:1: ruleVariationFilter returns [EObject current=null] : ( () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )? otherlv_6= ']' ( (lv_only_7_0= 'ONLY' ) )? ) ) ) ;
    public final EObject ruleVariationFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_only_7_0=null;
        EObject lv_propertySpecs_3_0 = null;

        EObject lv_propertySpecs_5_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:1914:2: ( ( () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )? otherlv_6= ']' ( (lv_only_7_0= 'ONLY' ) )? ) ) ) )
            // InternalSkiql.g:1915:2: ( () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )? otherlv_6= ']' ( (lv_only_7_0= 'ONLY' ) )? ) ) )
            {
            // InternalSkiql.g:1915:2: ( () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )? otherlv_6= ']' ( (lv_only_7_0= 'ONLY' ) )? ) ) )
            // InternalSkiql.g:1916:3: () (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )? otherlv_6= ']' ( (lv_only_7_0= 'ONLY' ) )? ) )
            {
            // InternalSkiql.g:1916:3: ()
            // InternalSkiql.g:1917:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVariationFilterAccess().getVariationFilterAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:1923:3: (otherlv_1= '[]' | (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )? otherlv_6= ']' ( (lv_only_7_0= 'ONLY' ) )? ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            else if ( (LA39_0==26) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSkiql.g:1924:4: otherlv_1= '[]'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getVariationFilterAccess().getLeftSquareBracketRightSquareBracketKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1929:4: (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )? otherlv_6= ']' ( (lv_only_7_0= 'ONLY' ) )? )
                    {
                    // InternalSkiql.g:1929:4: (otherlv_2= '[' ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )? otherlv_6= ']' ( (lv_only_7_0= 'ONLY' ) )? )
                    // InternalSkiql.g:1930:5: otherlv_2= '[' ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )? otherlv_6= ']' ( (lv_only_7_0= 'ONLY' ) )?
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getVariationFilterAccess().getLeftSquareBracketKeyword_1_1_0());
                      				
                    }
                    // InternalSkiql.g:1934:5: ( ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID||LA37_0==15) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalSkiql.g:1935:6: ( (lv_propertySpecs_3_0= rulePropertySpec ) ) (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )*
                            {
                            // InternalSkiql.g:1935:6: ( (lv_propertySpecs_3_0= rulePropertySpec ) )
                            // InternalSkiql.g:1936:7: (lv_propertySpecs_3_0= rulePropertySpec )
                            {
                            // InternalSkiql.g:1936:7: (lv_propertySpecs_3_0= rulePropertySpec )
                            // InternalSkiql.g:1937:8: lv_propertySpecs_3_0= rulePropertySpec
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getVariationFilterAccess().getPropertySpecsPropertySpecParserRuleCall_1_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_19);
                            lv_propertySpecs_3_0=rulePropertySpec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getVariationFilterRule());
                              								}
                              								add(
                              									current,
                              									"propertySpecs",
                              									lv_propertySpecs_3_0,
                              									"es.um.uschema.xtext.skiql.Skiql.PropertySpec");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalSkiql.g:1954:6: (otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==19) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // InternalSkiql.g:1955:7: otherlv_4= ',' ( (lv_propertySpecs_5_0= rulePropertySpec ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getVariationFilterAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalSkiql.g:1959:7: ( (lv_propertySpecs_5_0= rulePropertySpec ) )
                            	    // InternalSkiql.g:1960:8: (lv_propertySpecs_5_0= rulePropertySpec )
                            	    {
                            	    // InternalSkiql.g:1960:8: (lv_propertySpecs_5_0= rulePropertySpec )
                            	    // InternalSkiql.g:1961:9: lv_propertySpecs_5_0= rulePropertySpec
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getVariationFilterAccess().getPropertySpecsPropertySpecParserRuleCall_1_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_19);
                            	    lv_propertySpecs_5_0=rulePropertySpec();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getVariationFilterRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"propertySpecs",
                            	      										lv_propertySpecs_5_0,
                            	      										"es.um.uschema.xtext.skiql.Skiql.PropertySpec");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getVariationFilterAccess().getRightSquareBracketKeyword_1_1_2());
                      				
                    }
                    // InternalSkiql.g:1984:5: ( (lv_only_7_0= 'ONLY' ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==29) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSkiql.g:1985:6: (lv_only_7_0= 'ONLY' )
                            {
                            // InternalSkiql.g:1985:6: (lv_only_7_0= 'ONLY' )
                            // InternalSkiql.g:1986:7: lv_only_7_0= 'ONLY'
                            {
                            lv_only_7_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_only_7_0, grammarAccess.getVariationFilterAccess().getOnlyONLYKeyword_1_1_3_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getVariationFilterRule());
                              							}
                              							setWithLastConsumed(current, "only", lv_only_7_0 != null, "ONLY");
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariationFilter"


    // $ANTLR start "entryRulePropertySpec"
    // InternalSkiql.g:2004:1: entryRulePropertySpec returns [EObject current=null] : iv_rulePropertySpec= rulePropertySpec EOF ;
    public final EObject entryRulePropertySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySpec = null;


        try {
            // InternalSkiql.g:2004:53: (iv_rulePropertySpec= rulePropertySpec EOF )
            // InternalSkiql.g:2005:2: iv_rulePropertySpec= rulePropertySpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertySpec=rulePropertySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertySpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertySpec"


    // $ANTLR start "rulePropertySpec"
    // InternalSkiql.g:2011:1: rulePropertySpec returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? ) ;
    public final EObject rulePropertySpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:2017:2: ( ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? ) )
            // InternalSkiql.g:2018:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? )
            {
            // InternalSkiql.g:2018:2: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? )
            // InternalSkiql.g:2019:3: () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )?
            {
            // InternalSkiql.g:2019:3: ()
            // InternalSkiql.g:2020:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPropertySpecAccess().getPropertySpecAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:2026:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) ) )
            // InternalSkiql.g:2027:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            {
            // InternalSkiql.g:2027:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= '*' ) )
            // InternalSkiql.g:2028:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            {
            // InternalSkiql.g:2028:5: (lv_name_1_1= RULE_ID | lv_name_1_2= '*' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==15) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSkiql.g:2029:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_1, grammarAccess.getPropertySpecAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPropertySpecRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_1,
                      							"es.um.uschema.xtext.skiql.Skiql.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:2044:6: lv_name_1_2= '*'
                    {
                    lv_name_1_2=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_2, grammarAccess.getPropertySpecAccess().getNameAsteriskKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPropertySpecRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalSkiql.g:2057:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSkiql.g:2058:4: otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPropertySpecAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalSkiql.g:2062:4: ( (lv_type_3_0= ruleType ) )
                    // InternalSkiql.g:2063:5: (lv_type_3_0= ruleType )
                    {
                    // InternalSkiql.g:2063:5: (lv_type_3_0= ruleType )
                    // InternalSkiql.g:2064:6: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPropertySpecAccess().getTypeTypeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPropertySpecRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_3_0,
                      							"es.um.uschema.xtext.skiql.Skiql.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertySpec"


    // $ANTLR start "entryRuleType"
    // InternalSkiql.g:2086:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSkiql.g:2086:45: (iv_ruleType= ruleType EOF )
            // InternalSkiql.g:2087:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSkiql.g:2093:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_RelationshipType_1= ruleRelationshipType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_RelationshipType_1 = null;



        	enterRule();

        try {
            // InternalSkiql.g:2099:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_RelationshipType_1= ruleRelationshipType ) )
            // InternalSkiql.g:2100:2: (this_PrimitiveType_0= rulePrimitiveType | this_RelationshipType_1= ruleRelationshipType )
            {
            // InternalSkiql.g:2100:2: (this_PrimitiveType_0= rulePrimitiveType | this_RelationshipType_1= ruleRelationshipType )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=36 && LA42_0<=38)) ) {
                alt42=1;
            }
            else if ( (LA42_0==13||(LA42_0>=22 && LA42_0<=23)) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalSkiql.g:2101:3: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:2110:3: this_RelationshipType_1= ruleRelationshipType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getRelationshipTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelationshipType_1=ruleRelationshipType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelationshipType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalSkiql.g:2122:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalSkiql.g:2122:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalSkiql.g:2123:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalSkiql.g:2129:1: rulePrimitiveType returns [EObject current=null] : ( () ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_array_2_0= '[]' ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_array_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:2135:2: ( ( () ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_array_2_0= '[]' ) )? ) )
            // InternalSkiql.g:2136:2: ( () ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_array_2_0= '[]' ) )? )
            {
            // InternalSkiql.g:2136:2: ( () ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_array_2_0= '[]' ) )? )
            // InternalSkiql.g:2137:3: () ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_array_2_0= '[]' ) )?
            {
            // InternalSkiql.g:2137:3: ()
            // InternalSkiql.g:2138:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:2144:3: ( (lv_type_1_0= ruleTypeEnum ) )
            // InternalSkiql.g:2145:4: (lv_type_1_0= ruleTypeEnum )
            {
            // InternalSkiql.g:2145:4: (lv_type_1_0= ruleTypeEnum )
            // InternalSkiql.g:2146:5: lv_type_1_0= ruleTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeTypeEnumEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_type_1_0=ruleTypeEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"es.um.uschema.xtext.skiql.Skiql.TypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSkiql.g:2163:3: ( (lv_array_2_0= '[]' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSkiql.g:2164:4: (lv_array_2_0= '[]' )
                    {
                    // InternalSkiql.g:2164:4: (lv_array_2_0= '[]' )
                    // InternalSkiql.g:2165:5: lv_array_2_0= '[]'
                    {
                    lv_array_2_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_array_2_0, grammarAccess.getPrimitiveTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                      					}
                      					setWithLastConsumed(current, "array", lv_array_2_0 != null, "[]");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleRelationshipType"
    // InternalSkiql.g:2181:1: entryRuleRelationshipType returns [EObject current=null] : iv_ruleRelationshipType= ruleRelationshipType EOF ;
    public final EObject entryRuleRelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipType = null;


        try {
            // InternalSkiql.g:2181:57: (iv_ruleRelationshipType= ruleRelationshipType EOF )
            // InternalSkiql.g:2182:2: iv_ruleRelationshipType= ruleRelationshipType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipType=ruleRelationshipType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationshipType"


    // $ANTLR start "ruleRelationshipType"
    // InternalSkiql.g:2188:1: ruleRelationshipType returns [EObject current=null] : ( () ( (lv_relationType_1_0= ruleRelationshipTypeEnum ) ) ( ( (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' ) ) )? ) ;
    public final EObject ruleRelationshipType() throws RecognitionException {
        EObject current = null;

        Token lv_targetEntityName_2_1=null;
        Token lv_targetEntityName_2_2=null;
        Enumerator lv_relationType_1_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:2194:2: ( ( () ( (lv_relationType_1_0= ruleRelationshipTypeEnum ) ) ( ( (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' ) ) )? ) )
            // InternalSkiql.g:2195:2: ( () ( (lv_relationType_1_0= ruleRelationshipTypeEnum ) ) ( ( (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' ) ) )? )
            {
            // InternalSkiql.g:2195:2: ( () ( (lv_relationType_1_0= ruleRelationshipTypeEnum ) ) ( ( (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' ) ) )? )
            // InternalSkiql.g:2196:3: () ( (lv_relationType_1_0= ruleRelationshipTypeEnum ) ) ( ( (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' ) ) )?
            {
            // InternalSkiql.g:2196:3: ()
            // InternalSkiql.g:2197:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelationshipTypeAccess().getRelationshipTypeAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:2203:3: ( (lv_relationType_1_0= ruleRelationshipTypeEnum ) )
            // InternalSkiql.g:2204:4: (lv_relationType_1_0= ruleRelationshipTypeEnum )
            {
            // InternalSkiql.g:2204:4: (lv_relationType_1_0= ruleRelationshipTypeEnum )
            // InternalSkiql.g:2205:5: lv_relationType_1_0= ruleRelationshipTypeEnum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipTypeAccess().getRelationTypeRelationshipTypeEnumEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_relationType_1_0=ruleRelationshipTypeEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipTypeRule());
              					}
              					set(
              						current,
              						"relationType",
              						lv_relationType_1_0,
              						"es.um.uschema.xtext.skiql.Skiql.RelationshipTypeEnum");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSkiql.g:2222:3: ( ( (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==15) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSkiql.g:2223:4: ( (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' ) )
                    {
                    // InternalSkiql.g:2223:4: ( (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' ) )
                    // InternalSkiql.g:2224:5: (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' )
                    {
                    // InternalSkiql.g:2224:5: (lv_targetEntityName_2_1= RULE_ID | lv_targetEntityName_2_2= '*' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==15) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalSkiql.g:2225:6: lv_targetEntityName_2_1= RULE_ID
                            {
                            lv_targetEntityName_2_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_targetEntityName_2_1, grammarAccess.getRelationshipTypeAccess().getTargetEntityNameIDTerminalRuleCall_2_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getRelationshipTypeRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"targetEntityName",
                              							lv_targetEntityName_2_1,
                              							"es.um.uschema.xtext.skiql.Skiql.ID");
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSkiql.g:2240:6: lv_targetEntityName_2_2= '*'
                            {
                            lv_targetEntityName_2_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_targetEntityName_2_2, grammarAccess.getRelationshipTypeAccess().getTargetEntityNameAsteriskKeyword_2_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getRelationshipTypeRule());
                              						}
                              						setWithLastConsumed(current, "targetEntityName", lv_targetEntityName_2_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "entryRuleVersionHistory"
    // InternalSkiql.g:2257:1: entryRuleVersionHistory returns [EObject current=null] : iv_ruleVersionHistory= ruleVersionHistory EOF ;
    public final EObject entryRuleVersionHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionHistory = null;


        try {
            // InternalSkiql.g:2257:55: (iv_ruleVersionHistory= ruleVersionHistory EOF )
            // InternalSkiql.g:2258:2: iv_ruleVersionHistory= ruleVersionHistory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionHistoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVersionHistory=ruleVersionHistory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionHistory; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVersionHistory"


    // $ANTLR start "ruleVersionHistory"
    // InternalSkiql.g:2264:1: ruleVersionHistory returns [EObject current=null] : (this_BeforeHistory_0= ruleBeforeHistory | this_AfterHistory_1= ruleAfterHistory | this_BetweenHistory_2= ruleBetweenHistory ) ;
    public final EObject ruleVersionHistory() throws RecognitionException {
        EObject current = null;

        EObject this_BeforeHistory_0 = null;

        EObject this_AfterHistory_1 = null;

        EObject this_BetweenHistory_2 = null;



        	enterRule();

        try {
            // InternalSkiql.g:2270:2: ( (this_BeforeHistory_0= ruleBeforeHistory | this_AfterHistory_1= ruleAfterHistory | this_BetweenHistory_2= ruleBetweenHistory ) )
            // InternalSkiql.g:2271:2: (this_BeforeHistory_0= ruleBeforeHistory | this_AfterHistory_1= ruleAfterHistory | this_BetweenHistory_2= ruleBetweenHistory )
            {
            // InternalSkiql.g:2271:2: (this_BeforeHistory_0= ruleBeforeHistory | this_AfterHistory_1= ruleAfterHistory | this_BetweenHistory_2= ruleBetweenHistory )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt46=1;
                }
                break;
            case 33:
                {
                alt46=2;
                }
                break;
            case 34:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalSkiql.g:2272:3: this_BeforeHistory_0= ruleBeforeHistory
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVersionHistoryAccess().getBeforeHistoryParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BeforeHistory_0=ruleBeforeHistory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BeforeHistory_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:2281:3: this_AfterHistory_1= ruleAfterHistory
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVersionHistoryAccess().getAfterHistoryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AfterHistory_1=ruleAfterHistory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AfterHistory_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSkiql.g:2290:3: this_BetweenHistory_2= ruleBetweenHistory
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVersionHistoryAccess().getBetweenHistoryParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BetweenHistory_2=ruleBetweenHistory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BetweenHistory_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVersionHistory"


    // $ANTLR start "entryRuleBeforeHistory"
    // InternalSkiql.g:2302:1: entryRuleBeforeHistory returns [EObject current=null] : iv_ruleBeforeHistory= ruleBeforeHistory EOF ;
    public final EObject entryRuleBeforeHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeforeHistory = null;


        try {
            // InternalSkiql.g:2302:54: (iv_ruleBeforeHistory= ruleBeforeHistory EOF )
            // InternalSkiql.g:2303:2: iv_ruleBeforeHistory= ruleBeforeHistory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBeforeHistoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBeforeHistory=ruleBeforeHistory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBeforeHistory; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBeforeHistory"


    // $ANTLR start "ruleBeforeHistory"
    // InternalSkiql.g:2309:1: ruleBeforeHistory returns [EObject current=null] : ( () otherlv_1= 'BEFORE' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')' ) ;
    public final EObject ruleBeforeHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dateTime_3_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:2315:2: ( ( () otherlv_1= 'BEFORE' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')' ) )
            // InternalSkiql.g:2316:2: ( () otherlv_1= 'BEFORE' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')' )
            {
            // InternalSkiql.g:2316:2: ( () otherlv_1= 'BEFORE' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')' )
            // InternalSkiql.g:2317:3: () otherlv_1= 'BEFORE' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')'
            {
            // InternalSkiql.g:2317:3: ()
            // InternalSkiql.g:2318:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBeforeHistoryAccess().getBeforeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBeforeHistoryAccess().getBEFOREKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBeforeHistoryAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSkiql.g:2332:3: ( (lv_dateTime_3_0= ruleDateTime ) )
            // InternalSkiql.g:2333:4: (lv_dateTime_3_0= ruleDateTime )
            {
            // InternalSkiql.g:2333:4: (lv_dateTime_3_0= ruleDateTime )
            // InternalSkiql.g:2334:5: lv_dateTime_3_0= ruleDateTime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBeforeHistoryAccess().getDateTimeDateTimeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_dateTime_3_0=ruleDateTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBeforeHistoryRule());
              					}
              					set(
              						current,
              						"dateTime",
              						lv_dateTime_3_0,
              						"es.um.uschema.xtext.skiql.Skiql.DateTime");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBeforeHistoryAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBeforeHistory"


    // $ANTLR start "entryRuleAfterHistory"
    // InternalSkiql.g:2359:1: entryRuleAfterHistory returns [EObject current=null] : iv_ruleAfterHistory= ruleAfterHistory EOF ;
    public final EObject entryRuleAfterHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterHistory = null;


        try {
            // InternalSkiql.g:2359:53: (iv_ruleAfterHistory= ruleAfterHistory EOF )
            // InternalSkiql.g:2360:2: iv_ruleAfterHistory= ruleAfterHistory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAfterHistoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAfterHistory=ruleAfterHistory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAfterHistory; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAfterHistory"


    // $ANTLR start "ruleAfterHistory"
    // InternalSkiql.g:2366:1: ruleAfterHistory returns [EObject current=null] : ( () otherlv_1= 'AFTER' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')' ) ;
    public final EObject ruleAfterHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dateTime_3_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:2372:2: ( ( () otherlv_1= 'AFTER' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')' ) )
            // InternalSkiql.g:2373:2: ( () otherlv_1= 'AFTER' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')' )
            {
            // InternalSkiql.g:2373:2: ( () otherlv_1= 'AFTER' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')' )
            // InternalSkiql.g:2374:3: () otherlv_1= 'AFTER' otherlv_2= '(' ( (lv_dateTime_3_0= ruleDateTime ) ) otherlv_4= ')'
            {
            // InternalSkiql.g:2374:3: ()
            // InternalSkiql.g:2375:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAfterHistoryAccess().getAfterAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAfterHistoryAccess().getAFTERKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAfterHistoryAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSkiql.g:2389:3: ( (lv_dateTime_3_0= ruleDateTime ) )
            // InternalSkiql.g:2390:4: (lv_dateTime_3_0= ruleDateTime )
            {
            // InternalSkiql.g:2390:4: (lv_dateTime_3_0= ruleDateTime )
            // InternalSkiql.g:2391:5: lv_dateTime_3_0= ruleDateTime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAfterHistoryAccess().getDateTimeDateTimeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_dateTime_3_0=ruleDateTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAfterHistoryRule());
              					}
              					set(
              						current,
              						"dateTime",
              						lv_dateTime_3_0,
              						"es.um.uschema.xtext.skiql.Skiql.DateTime");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAfterHistoryAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAfterHistory"


    // $ANTLR start "entryRuleBetweenHistory"
    // InternalSkiql.g:2416:1: entryRuleBetweenHistory returns [EObject current=null] : iv_ruleBetweenHistory= ruleBetweenHistory EOF ;
    public final EObject entryRuleBetweenHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenHistory = null;


        try {
            // InternalSkiql.g:2416:55: (iv_ruleBetweenHistory= ruleBetweenHistory EOF )
            // InternalSkiql.g:2417:2: iv_ruleBetweenHistory= ruleBetweenHistory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBetweenHistoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBetweenHistory=ruleBetweenHistory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBetweenHistory; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBetweenHistory"


    // $ANTLR start "ruleBetweenHistory"
    // InternalSkiql.g:2423:1: ruleBetweenHistory returns [EObject current=null] : ( () otherlv_1= 'BETWEEN' otherlv_2= '(' ( (lv_afterDateTime_3_0= ruleDateTime ) ) otherlv_4= ',' ( (lv_beforeDateTime_5_0= ruleDateTime ) ) otherlv_6= ')' ) ;
    public final EObject ruleBetweenHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_afterDateTime_3_0 = null;

        EObject lv_beforeDateTime_5_0 = null;



        	enterRule();

        try {
            // InternalSkiql.g:2429:2: ( ( () otherlv_1= 'BETWEEN' otherlv_2= '(' ( (lv_afterDateTime_3_0= ruleDateTime ) ) otherlv_4= ',' ( (lv_beforeDateTime_5_0= ruleDateTime ) ) otherlv_6= ')' ) )
            // InternalSkiql.g:2430:2: ( () otherlv_1= 'BETWEEN' otherlv_2= '(' ( (lv_afterDateTime_3_0= ruleDateTime ) ) otherlv_4= ',' ( (lv_beforeDateTime_5_0= ruleDateTime ) ) otherlv_6= ')' )
            {
            // InternalSkiql.g:2430:2: ( () otherlv_1= 'BETWEEN' otherlv_2= '(' ( (lv_afterDateTime_3_0= ruleDateTime ) ) otherlv_4= ',' ( (lv_beforeDateTime_5_0= ruleDateTime ) ) otherlv_6= ')' )
            // InternalSkiql.g:2431:3: () otherlv_1= 'BETWEEN' otherlv_2= '(' ( (lv_afterDateTime_3_0= ruleDateTime ) ) otherlv_4= ',' ( (lv_beforeDateTime_5_0= ruleDateTime ) ) otherlv_6= ')'
            {
            // InternalSkiql.g:2431:3: ()
            // InternalSkiql.g:2432:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBetweenHistoryAccess().getBetweenAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBetweenHistoryAccess().getBETWEENKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBetweenHistoryAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalSkiql.g:2446:3: ( (lv_afterDateTime_3_0= ruleDateTime ) )
            // InternalSkiql.g:2447:4: (lv_afterDateTime_3_0= ruleDateTime )
            {
            // InternalSkiql.g:2447:4: (lv_afterDateTime_3_0= ruleDateTime )
            // InternalSkiql.g:2448:5: lv_afterDateTime_3_0= ruleDateTime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBetweenHistoryAccess().getAfterDateTimeDateTimeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_afterDateTime_3_0=ruleDateTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBetweenHistoryRule());
              					}
              					set(
              						current,
              						"afterDateTime",
              						lv_afterDateTime_3_0,
              						"es.um.uschema.xtext.skiql.Skiql.DateTime");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBetweenHistoryAccess().getCommaKeyword_4());
              		
            }
            // InternalSkiql.g:2469:3: ( (lv_beforeDateTime_5_0= ruleDateTime ) )
            // InternalSkiql.g:2470:4: (lv_beforeDateTime_5_0= ruleDateTime )
            {
            // InternalSkiql.g:2470:4: (lv_beforeDateTime_5_0= ruleDateTime )
            // InternalSkiql.g:2471:5: lv_beforeDateTime_5_0= ruleDateTime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBetweenHistoryAccess().getBeforeDateTimeDateTimeParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_beforeDateTime_5_0=ruleDateTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBetweenHistoryRule());
              					}
              					set(
              						current,
              						"beforeDateTime",
              						lv_beforeDateTime_5_0,
              						"es.um.uschema.xtext.skiql.Skiql.DateTime");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBetweenHistoryAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBetweenHistory"


    // $ANTLR start "entryRuleDateTime"
    // InternalSkiql.g:2496:1: entryRuleDateTime returns [EObject current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final EObject entryRuleDateTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTime = null;


        try {
            // InternalSkiql.g:2496:49: (iv_ruleDateTime= ruleDateTime EOF )
            // InternalSkiql.g:2497:2: iv_ruleDateTime= ruleDateTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDateTime=ruleDateTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateTime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // InternalSkiql.g:2503:1: ruleDateTime returns [EObject current=null] : ( () ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_day_5_0= RULE_INT ) ) ( ( (lv_hour_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minutes_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconds_10_0= RULE_INT ) ) )? ) ;
    public final EObject ruleDateTime() throws RecognitionException {
        EObject current = null;

        Token lv_year_1_0=null;
        Token otherlv_2=null;
        Token lv_month_3_0=null;
        Token otherlv_4=null;
        Token lv_day_5_0=null;
        Token lv_hour_6_0=null;
        Token otherlv_7=null;
        Token lv_minutes_8_0=null;
        Token otherlv_9=null;
        Token lv_seconds_10_0=null;


        	enterRule();

        try {
            // InternalSkiql.g:2509:2: ( ( () ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_day_5_0= RULE_INT ) ) ( ( (lv_hour_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minutes_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconds_10_0= RULE_INT ) ) )? ) )
            // InternalSkiql.g:2510:2: ( () ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_day_5_0= RULE_INT ) ) ( ( (lv_hour_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minutes_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconds_10_0= RULE_INT ) ) )? )
            {
            // InternalSkiql.g:2510:2: ( () ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_day_5_0= RULE_INT ) ) ( ( (lv_hour_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minutes_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconds_10_0= RULE_INT ) ) )? )
            // InternalSkiql.g:2511:3: () ( (lv_year_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_day_5_0= RULE_INT ) ) ( ( (lv_hour_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minutes_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconds_10_0= RULE_INT ) ) )?
            {
            // InternalSkiql.g:2511:3: ()
            // InternalSkiql.g:2512:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDateTimeAccess().getDateTimeAction_0(),
              					current);
              			
            }

            }

            // InternalSkiql.g:2518:3: ( (lv_year_1_0= RULE_INT ) )
            // InternalSkiql.g:2519:4: (lv_year_1_0= RULE_INT )
            {
            // InternalSkiql.g:2519:4: (lv_year_1_0= RULE_INT )
            // InternalSkiql.g:2520:5: lv_year_1_0= RULE_INT
            {
            lv_year_1_0=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_year_1_0, grammarAccess.getDateTimeAccess().getYearINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDateTimeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"year",
              						lv_year_1_0,
              						"es.um.uschema.xtext.skiql.Skiql.INT");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDateTimeAccess().getHyphenMinusKeyword_2());
              		
            }
            // InternalSkiql.g:2540:3: ( (lv_month_3_0= RULE_INT ) )
            // InternalSkiql.g:2541:4: (lv_month_3_0= RULE_INT )
            {
            // InternalSkiql.g:2541:4: (lv_month_3_0= RULE_INT )
            // InternalSkiql.g:2542:5: lv_month_3_0= RULE_INT
            {
            lv_month_3_0=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_month_3_0, grammarAccess.getDateTimeAccess().getMonthINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDateTimeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"month",
              						lv_month_3_0,
              						"es.um.uschema.xtext.skiql.Skiql.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDateTimeAccess().getHyphenMinusKeyword_4());
              		
            }
            // InternalSkiql.g:2562:3: ( (lv_day_5_0= RULE_INT ) )
            // InternalSkiql.g:2563:4: (lv_day_5_0= RULE_INT )
            {
            // InternalSkiql.g:2563:4: (lv_day_5_0= RULE_INT )
            // InternalSkiql.g:2564:5: lv_day_5_0= RULE_INT
            {
            lv_day_5_0=(Token)match(input,RULE_INT,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_day_5_0, grammarAccess.getDateTimeAccess().getDayINTTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDateTimeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"day",
              						lv_day_5_0,
              						"es.um.uschema.xtext.skiql.Skiql.INT");
              				
            }

            }


            }

            // InternalSkiql.g:2580:3: ( ( (lv_hour_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minutes_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconds_10_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSkiql.g:2581:4: ( (lv_hour_6_0= RULE_INT ) ) otherlv_7= ':' ( (lv_minutes_8_0= RULE_INT ) ) otherlv_9= ':' ( (lv_seconds_10_0= RULE_INT ) )
                    {
                    // InternalSkiql.g:2581:4: ( (lv_hour_6_0= RULE_INT ) )
                    // InternalSkiql.g:2582:5: (lv_hour_6_0= RULE_INT )
                    {
                    // InternalSkiql.g:2582:5: (lv_hour_6_0= RULE_INT )
                    // InternalSkiql.g:2583:6: lv_hour_6_0= RULE_INT
                    {
                    lv_hour_6_0=(Token)match(input,RULE_INT,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hour_6_0, grammarAccess.getDateTimeAccess().getHourINTTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDateTimeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hour",
                      							lv_hour_6_0,
                      							"es.um.uschema.xtext.skiql.Skiql.INT");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDateTimeAccess().getColonKeyword_6_1());
                      			
                    }
                    // InternalSkiql.g:2603:4: ( (lv_minutes_8_0= RULE_INT ) )
                    // InternalSkiql.g:2604:5: (lv_minutes_8_0= RULE_INT )
                    {
                    // InternalSkiql.g:2604:5: (lv_minutes_8_0= RULE_INT )
                    // InternalSkiql.g:2605:6: lv_minutes_8_0= RULE_INT
                    {
                    lv_minutes_8_0=(Token)match(input,RULE_INT,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minutes_8_0, grammarAccess.getDateTimeAccess().getMinutesINTTerminalRuleCall_6_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDateTimeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"minutes",
                      							lv_minutes_8_0,
                      							"es.um.uschema.xtext.skiql.Skiql.INT");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDateTimeAccess().getColonKeyword_6_3());
                      			
                    }
                    // InternalSkiql.g:2625:4: ( (lv_seconds_10_0= RULE_INT ) )
                    // InternalSkiql.g:2626:5: (lv_seconds_10_0= RULE_INT )
                    {
                    // InternalSkiql.g:2626:5: (lv_seconds_10_0= RULE_INT )
                    // InternalSkiql.g:2627:6: lv_seconds_10_0= RULE_INT
                    {
                    lv_seconds_10_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_seconds_10_0, grammarAccess.getDateTimeAccess().getSecondsINTTerminalRuleCall_6_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDateTimeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"seconds",
                      							lv_seconds_10_0,
                      							"es.um.uschema.xtext.skiql.Skiql.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "ruleTypeEnum"
    // InternalSkiql.g:2648:1: ruleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'boolean' ) ) ;
    public final Enumerator ruleTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSkiql.g:2654:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'boolean' ) ) )
            // InternalSkiql.g:2655:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'boolean' ) )
            {
            // InternalSkiql.g:2655:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'boolean' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt48=1;
                }
                break;
            case 37:
                {
                alt48=2;
                }
                break;
            case 38:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalSkiql.g:2656:3: (enumLiteral_0= 'string' )
                    {
                    // InternalSkiql.g:2656:3: (enumLiteral_0= 'string' )
                    // InternalSkiql.g:2657:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeEnumAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTypeEnumAccess().getSTRINGEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:2664:3: (enumLiteral_1= 'number' )
                    {
                    // InternalSkiql.g:2664:3: (enumLiteral_1= 'number' )
                    // InternalSkiql.g:2665:4: enumLiteral_1= 'number'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeEnumAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTypeEnumAccess().getNUMBEREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSkiql.g:2672:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalSkiql.g:2672:3: (enumLiteral_2= 'boolean' )
                    // InternalSkiql.g:2673:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeEnum"


    // $ANTLR start "ruleRelationshipTypeEnum"
    // InternalSkiql.g:2683:1: ruleRelationshipTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'REF' ) | (enumLiteral_2= 'AGGR' ) ) ;
    public final Enumerator ruleRelationshipTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSkiql.g:2689:2: ( ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'REF' ) | (enumLiteral_2= 'AGGR' ) ) )
            // InternalSkiql.g:2690:2: ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'REF' ) | (enumLiteral_2= 'AGGR' ) )
            {
            // InternalSkiql.g:2690:2: ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'REF' ) | (enumLiteral_2= 'AGGR' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt49=1;
                }
                break;
            case 22:
                {
                alt49=2;
                }
                break;
            case 23:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalSkiql.g:2691:3: (enumLiteral_0= 'ANY' )
                    {
                    // InternalSkiql.g:2691:3: (enumLiteral_0= 'ANY' )
                    // InternalSkiql.g:2692:4: enumLiteral_0= 'ANY'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeEnumAccess().getRELATIONSHIPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelationshipTypeEnumAccess().getRELATIONSHIPEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:2699:3: (enumLiteral_1= 'REF' )
                    {
                    // InternalSkiql.g:2699:3: (enumLiteral_1= 'REF' )
                    // InternalSkiql.g:2700:4: enumLiteral_1= 'REF'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeEnumAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelationshipTypeEnumAccess().getREFERENCEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSkiql.g:2707:3: (enumLiteral_2= 'AGGR' )
                    {
                    // InternalSkiql.g:2707:3: (enumLiteral_2= 'AGGR' )
                    // InternalSkiql.g:2708:4: enumLiteral_2= 'AGGR'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeEnumAccess().getAGGREGATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getRelationshipTypeEnumAccess().getAGGREGATIONEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationshipTypeEnum"

    // $ANTLR start synpred1_InternalSkiql
    public final void synpred1_InternalSkiql_fragment() throws RecognitionException {   
        // InternalSkiql.g:820:5: ( ( ruleIndirectRelationshipSpec ) )
        // InternalSkiql.g:820:6: ( ruleIndirectRelationshipSpec )
        {
        // InternalSkiql.g:820:6: ( ruleIndirectRelationshipSpec )
        // InternalSkiql.g:821:6: ruleIndirectRelationshipSpec
        {
        pushFollow(FOLLOW_2);
        ruleIndirectRelationshipSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalSkiql

    // $ANTLR start synpred2_InternalSkiql
    public final void synpred2_InternalSkiql_fragment() throws RecognitionException {   
        // InternalSkiql.g:845:5: ( ',' )
        // InternalSkiql.g:845:6: ','
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSkiql

    // $ANTLR start synpred3_InternalSkiql
    public final void synpred3_InternalSkiql_fragment() throws RecognitionException {   
        // InternalSkiql.g:873:6: ( ( ruleIndirectRelationshipSpec ) )
        // InternalSkiql.g:873:7: ( ruleIndirectRelationshipSpec )
        {
        // InternalSkiql.g:873:7: ( ruleIndirectRelationshipSpec )
        // InternalSkiql.g:874:7: ruleIndirectRelationshipSpec
        {
        pushFollow(FOLLOW_2);
        ruleIndirectRelationshipSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSkiql

    // $ANTLR start synpred4_InternalSkiql
    public final void synpred4_InternalSkiql_fragment() throws RecognitionException {   
        // InternalSkiql.g:978:5: ( ( ruleIndirectRelationshipSpec ) )
        // InternalSkiql.g:978:6: ( ruleIndirectRelationshipSpec )
        {
        // InternalSkiql.g:978:6: ( ruleIndirectRelationshipSpec )
        // InternalSkiql.g:979:6: ruleIndirectRelationshipSpec
        {
        pushFollow(FOLLOW_2);
        ruleIndirectRelationshipSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSkiql

    // $ANTLR start synpred5_InternalSkiql
    public final void synpred5_InternalSkiql_fragment() throws RecognitionException {   
        // InternalSkiql.g:1003:5: ( ',' )
        // InternalSkiql.g:1003:6: ','
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalSkiql

    // $ANTLR start synpred6_InternalSkiql
    public final void synpred6_InternalSkiql_fragment() throws RecognitionException {   
        // InternalSkiql.g:1031:6: ( ( ruleIndirectRelationshipSpec ) )
        // InternalSkiql.g:1031:7: ( ruleIndirectRelationshipSpec )
        {
        // InternalSkiql.g:1031:7: ( ruleIndirectRelationshipSpec )
        // InternalSkiql.g:1032:7: ruleIndirectRelationshipSpec
        {
        pushFollow(FOLLOW_2);
        ruleIndirectRelationshipSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalSkiql

    // $ANTLR start synpred7_InternalSkiql
    public final void synpred7_InternalSkiql_fragment() throws RecognitionException {   
        // InternalSkiql.g:1105:4: ( ( ruleRelationTypeSpec ) )
        // InternalSkiql.g:1105:5: ( ruleRelationTypeSpec )
        {
        // InternalSkiql.g:1105:5: ( ruleRelationTypeSpec )
        // InternalSkiql.g:1106:5: ruleRelationTypeSpec
        {
        pushFollow(FOLLOW_2);
        ruleRelationTypeSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalSkiql

    // $ANTLR start synpred8_InternalSkiql
    public final void synpred8_InternalSkiql_fragment() throws RecognitionException {   
        // InternalSkiql.g:1395:4: ( ( ruleIndirectRelationTypeSpec ) )
        // InternalSkiql.g:1395:5: ( ruleIndirectRelationTypeSpec )
        {
        // InternalSkiql.g:1395:5: ( ruleIndirectRelationTypeSpec )
        // InternalSkiql.g:1396:5: ruleIndirectRelationTypeSpec
        {
        pushFollow(FOLLOW_2);
        ruleIndirectRelationTypeSpec();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalSkiql

    // Delegated rules

    public final boolean synpred7_InternalSkiql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSkiql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSkiql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSkiql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSkiql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSkiql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSkiql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSkiql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSkiql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSkiql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSkiql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSkiql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSkiql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSkiql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSkiql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSkiql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000640004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001118010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C02002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000118010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008008010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007000C02000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});

}