package es.um.uschema.xtext.skiql.ide.contentassist.antlr.internal;

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
import es.um.uschema.xtext.skiql.services.SkiqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSkiqlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'_'", "'[]'", "'string'", "'number'", "'boolean'", "'ANY'", "'REF'", "'AGGR'", "'ENTITY'", "'REL'", "'KEYS'", "'FROM'", "'TO'", "','", "'{'", "'}'", "'['", "']'", "':'", "'BEFORE'", "'('", "')'", "'AFTER'", "'BETWEEN'", "'-'", "'>>'", "'ONLY'"
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

    	public void setGrammarAccess(SkiqlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSkiQLModel"
    // InternalSkiql.g:54:1: entryRuleSkiQLModel : ruleSkiQLModel EOF ;
    public final void entryRuleSkiQLModel() throws RecognitionException {
        try {
            // InternalSkiql.g:55:1: ( ruleSkiQLModel EOF )
            // InternalSkiql.g:56:1: ruleSkiQLModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkiQLModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSkiQLModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkiQLModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSkiQLModel"


    // $ANTLR start "ruleSkiQLModel"
    // InternalSkiql.g:63:1: ruleSkiQLModel : ( ( rule__SkiQLModel__Group__0 ) ) ;
    public final void ruleSkiQLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:67:2: ( ( ( rule__SkiQLModel__Group__0 ) ) )
            // InternalSkiql.g:68:2: ( ( rule__SkiQLModel__Group__0 ) )
            {
            // InternalSkiql.g:68:2: ( ( rule__SkiQLModel__Group__0 ) )
            // InternalSkiql.g:69:3: ( rule__SkiQLModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkiQLModelAccess().getGroup()); 
            }
            // InternalSkiql.g:70:3: ( rule__SkiQLModel__Group__0 )
            // InternalSkiql.g:70:4: rule__SkiQLModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SkiQLModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkiQLModelAccess().getGroup()); 
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
    // $ANTLR end "ruleSkiQLModel"


    // $ANTLR start "entryRuleQuery"
    // InternalSkiql.g:79:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalSkiql.g:80:1: ( ruleQuery EOF )
            // InternalSkiql.g:81:1: ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalSkiql.g:88:1: ruleQuery : ( ( rule__Query__Alternatives ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:92:2: ( ( ( rule__Query__Alternatives ) ) )
            // InternalSkiql.g:93:2: ( ( rule__Query__Alternatives ) )
            {
            // InternalSkiql.g:93:2: ( ( rule__Query__Alternatives ) )
            // InternalSkiql.g:94:3: ( rule__Query__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives()); 
            }
            // InternalSkiql.g:95:3: ( rule__Query__Alternatives )
            // InternalSkiql.g:95:4: rule__Query__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Query__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getAlternatives()); 
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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleEntityTypeQuery"
    // InternalSkiql.g:104:1: entryRuleEntityTypeQuery : ruleEntityTypeQuery EOF ;
    public final void entryRuleEntityTypeQuery() throws RecognitionException {
        try {
            // InternalSkiql.g:105:1: ( ruleEntityTypeQuery EOF )
            // InternalSkiql.g:106:1: ruleEntityTypeQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntityTypeQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntityTypeQuery"


    // $ANTLR start "ruleEntityTypeQuery"
    // InternalSkiql.g:113:1: ruleEntityTypeQuery : ( ( rule__EntityTypeQuery__Group__0 ) ) ;
    public final void ruleEntityTypeQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:117:2: ( ( ( rule__EntityTypeQuery__Group__0 ) ) )
            // InternalSkiql.g:118:2: ( ( rule__EntityTypeQuery__Group__0 ) )
            {
            // InternalSkiql.g:118:2: ( ( rule__EntityTypeQuery__Group__0 ) )
            // InternalSkiql.g:119:3: ( rule__EntityTypeQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeQueryAccess().getGroup()); 
            }
            // InternalSkiql.g:120:3: ( rule__EntityTypeQuery__Group__0 )
            // InternalSkiql.g:120:4: rule__EntityTypeQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityTypeQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeQueryAccess().getGroup()); 
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
    // $ANTLR end "ruleEntityTypeQuery"


    // $ANTLR start "entryRuleRelationshipTypeQuery"
    // InternalSkiql.g:129:1: entryRuleRelationshipTypeQuery : ruleRelationshipTypeQuery EOF ;
    public final void entryRuleRelationshipTypeQuery() throws RecognitionException {
        try {
            // InternalSkiql.g:130:1: ( ruleRelationshipTypeQuery EOF )
            // InternalSkiql.g:131:1: ruleRelationshipTypeQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationshipTypeQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationshipTypeQuery"


    // $ANTLR start "ruleRelationshipTypeQuery"
    // InternalSkiql.g:138:1: ruleRelationshipTypeQuery : ( ( rule__RelationshipTypeQuery__Group__0 ) ) ;
    public final void ruleRelationshipTypeQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:142:2: ( ( ( rule__RelationshipTypeQuery__Group__0 ) ) )
            // InternalSkiql.g:143:2: ( ( rule__RelationshipTypeQuery__Group__0 ) )
            {
            // InternalSkiql.g:143:2: ( ( rule__RelationshipTypeQuery__Group__0 ) )
            // InternalSkiql.g:144:3: ( rule__RelationshipTypeQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeQueryAccess().getGroup()); 
            }
            // InternalSkiql.g:145:3: ( rule__RelationshipTypeQuery__Group__0 )
            // InternalSkiql.g:145:4: rule__RelationshipTypeQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeQueryAccess().getGroup()); 
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
    // $ANTLR end "ruleRelationshipTypeQuery"


    // $ANTLR start "entryRuleAnyQuery"
    // InternalSkiql.g:154:1: entryRuleAnyQuery : ruleAnyQuery EOF ;
    public final void entryRuleAnyQuery() throws RecognitionException {
        try {
            // InternalSkiql.g:155:1: ( ruleAnyQuery EOF )
            // InternalSkiql.g:156:1: ruleAnyQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnyQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnyQuery"


    // $ANTLR start "ruleAnyQuery"
    // InternalSkiql.g:163:1: ruleAnyQuery : ( ( rule__AnyQuery__Group__0 ) ) ;
    public final void ruleAnyQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:167:2: ( ( ( rule__AnyQuery__Group__0 ) ) )
            // InternalSkiql.g:168:2: ( ( rule__AnyQuery__Group__0 ) )
            {
            // InternalSkiql.g:168:2: ( ( rule__AnyQuery__Group__0 ) )
            // InternalSkiql.g:169:3: ( rule__AnyQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyQueryAccess().getGroup()); 
            }
            // InternalSkiql.g:170:3: ( rule__AnyQuery__Group__0 )
            // InternalSkiql.g:170:4: rule__AnyQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnyQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyQueryAccess().getGroup()); 
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
    // $ANTLR end "ruleAnyQuery"


    // $ANTLR start "entryRuleOperation"
    // InternalSkiql.g:179:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalSkiql.g:180:1: ( ruleOperation EOF )
            // InternalSkiql.g:181:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSkiql.g:188:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:192:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalSkiql.g:193:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalSkiql.g:193:2: ( ( rule__Operation__Alternatives ) )
            // InternalSkiql.g:194:3: ( rule__Operation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getAlternatives()); 
            }
            // InternalSkiql.g:195:3: ( rule__Operation__Alternatives )
            // InternalSkiql.g:195:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleKeysSpec"
    // InternalSkiql.g:204:1: entryRuleKeysSpec : ruleKeysSpec EOF ;
    public final void entryRuleKeysSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:205:1: ( ruleKeysSpec EOF )
            // InternalSkiql.g:206:1: ruleKeysSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeysSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKeysSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeysSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKeysSpec"


    // $ANTLR start "ruleKeysSpec"
    // InternalSkiql.g:213:1: ruleKeysSpec : ( ( rule__KeysSpec__Group__0 ) ) ;
    public final void ruleKeysSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:217:2: ( ( ( rule__KeysSpec__Group__0 ) ) )
            // InternalSkiql.g:218:2: ( ( rule__KeysSpec__Group__0 ) )
            {
            // InternalSkiql.g:218:2: ( ( rule__KeysSpec__Group__0 ) )
            // InternalSkiql.g:219:3: ( rule__KeysSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeysSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:220:3: ( rule__KeysSpec__Group__0 )
            // InternalSkiql.g:220:4: rule__KeysSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeysSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeysSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleKeysSpec"


    // $ANTLR start "entryRuleRelationshipTypeSpec"
    // InternalSkiql.g:229:1: entryRuleRelationshipTypeSpec : ruleRelationshipTypeSpec EOF ;
    public final void entryRuleRelationshipTypeSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:230:1: ( ruleRelationshipTypeSpec EOF )
            // InternalSkiql.g:231:1: ruleRelationshipTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationshipTypeSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationshipTypeSpec"


    // $ANTLR start "ruleRelationshipTypeSpec"
    // InternalSkiql.g:238:1: ruleRelationshipTypeSpec : ( ( rule__RelationshipTypeSpec__Group__0 ) ) ;
    public final void ruleRelationshipTypeSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:242:2: ( ( ( rule__RelationshipTypeSpec__Group__0 ) ) )
            // InternalSkiql.g:243:2: ( ( rule__RelationshipTypeSpec__Group__0 ) )
            {
            // InternalSkiql.g:243:2: ( ( rule__RelationshipTypeSpec__Group__0 ) )
            // InternalSkiql.g:244:3: ( rule__RelationshipTypeSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:245:3: ( rule__RelationshipTypeSpec__Group__0 )
            // InternalSkiql.g:245:4: rule__RelationshipTypeSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleRelationshipTypeSpec"


    // $ANTLR start "entryRuleSchemaTypeSpec"
    // InternalSkiql.g:254:1: entryRuleSchemaTypeSpec : ruleSchemaTypeSpec EOF ;
    public final void entryRuleSchemaTypeSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:255:1: ( ruleSchemaTypeSpec EOF )
            // InternalSkiql.g:256:1: ruleSchemaTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSchemaTypeSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaTypeSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSchemaTypeSpec"


    // $ANTLR start "ruleSchemaTypeSpec"
    // InternalSkiql.g:263:1: ruleSchemaTypeSpec : ( ( rule__SchemaTypeSpec__Group__0 ) ) ;
    public final void ruleSchemaTypeSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:267:2: ( ( ( rule__SchemaTypeSpec__Group__0 ) ) )
            // InternalSkiql.g:268:2: ( ( rule__SchemaTypeSpec__Group__0 ) )
            {
            // InternalSkiql.g:268:2: ( ( rule__SchemaTypeSpec__Group__0 ) )
            // InternalSkiql.g:269:3: ( rule__SchemaTypeSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaTypeSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:270:3: ( rule__SchemaTypeSpec__Group__0 )
            // InternalSkiql.g:270:4: rule__SchemaTypeSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SchemaTypeSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaTypeSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleSchemaTypeSpec"


    // $ANTLR start "entryRuleEntitySpec"
    // InternalSkiql.g:279:1: entryRuleEntitySpec : ruleEntitySpec EOF ;
    public final void entryRuleEntitySpec() throws RecognitionException {
        try {
            // InternalSkiql.g:280:1: ( ruleEntitySpec EOF )
            // InternalSkiql.g:281:1: ruleEntitySpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntitySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntitySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntitySpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntitySpec"


    // $ANTLR start "ruleEntitySpec"
    // InternalSkiql.g:288:1: ruleEntitySpec : ( ( rule__EntitySpec__Group__0 ) ) ;
    public final void ruleEntitySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:292:2: ( ( ( rule__EntitySpec__Group__0 ) ) )
            // InternalSkiql.g:293:2: ( ( rule__EntitySpec__Group__0 ) )
            {
            // InternalSkiql.g:293:2: ( ( rule__EntitySpec__Group__0 ) )
            // InternalSkiql.g:294:3: ( rule__EntitySpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntitySpecAccess().getGroup()); 
            }
            // InternalSkiql.g:295:3: ( rule__EntitySpec__Group__0 )
            // InternalSkiql.g:295:4: rule__EntitySpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntitySpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntitySpecAccess().getGroup()); 
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
    // $ANTLR end "ruleEntitySpec"


    // $ANTLR start "entryRuleReferenceEntitySpec"
    // InternalSkiql.g:304:1: entryRuleReferenceEntitySpec : ruleReferenceEntitySpec EOF ;
    public final void entryRuleReferenceEntitySpec() throws RecognitionException {
        try {
            // InternalSkiql.g:305:1: ( ruleReferenceEntitySpec EOF )
            // InternalSkiql.g:306:1: ruleReferenceEntitySpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceEntitySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceEntitySpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReferenceEntitySpec"


    // $ANTLR start "ruleReferenceEntitySpec"
    // InternalSkiql.g:313:1: ruleReferenceEntitySpec : ( ( rule__ReferenceEntitySpec__Group__0 ) ) ;
    public final void ruleReferenceEntitySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:317:2: ( ( ( rule__ReferenceEntitySpec__Group__0 ) ) )
            // InternalSkiql.g:318:2: ( ( rule__ReferenceEntitySpec__Group__0 ) )
            {
            // InternalSkiql.g:318:2: ( ( rule__ReferenceEntitySpec__Group__0 ) )
            // InternalSkiql.g:319:3: ( rule__ReferenceEntitySpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceEntitySpecAccess().getGroup()); 
            }
            // InternalSkiql.g:320:3: ( rule__ReferenceEntitySpec__Group__0 )
            // InternalSkiql.g:320:4: rule__ReferenceEntitySpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceEntitySpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceEntitySpecAccess().getGroup()); 
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
    // $ANTLR end "ruleReferenceEntitySpec"


    // $ANTLR start "entryRuleRelationshipQuery"
    // InternalSkiql.g:329:1: entryRuleRelationshipQuery : ruleRelationshipQuery EOF ;
    public final void entryRuleRelationshipQuery() throws RecognitionException {
        try {
            // InternalSkiql.g:330:1: ( ruleRelationshipQuery EOF )
            // InternalSkiql.g:331:1: ruleRelationshipQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationshipQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationshipQuery"


    // $ANTLR start "ruleRelationshipQuery"
    // InternalSkiql.g:338:1: ruleRelationshipQuery : ( ( rule__RelationshipQuery__Group__0 ) ) ;
    public final void ruleRelationshipQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:342:2: ( ( ( rule__RelationshipQuery__Group__0 ) ) )
            // InternalSkiql.g:343:2: ( ( rule__RelationshipQuery__Group__0 ) )
            {
            // InternalSkiql.g:343:2: ( ( rule__RelationshipQuery__Group__0 ) )
            // InternalSkiql.g:344:3: ( rule__RelationshipQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getGroup()); 
            }
            // InternalSkiql.g:345:3: ( rule__RelationshipQuery__Group__0 )
            // InternalSkiql.g:345:4: rule__RelationshipQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getGroup()); 
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
    // $ANTLR end "ruleRelationshipQuery"


    // $ANTLR start "entryRuleNestedRelationshipQuery"
    // InternalSkiql.g:354:1: entryRuleNestedRelationshipQuery : ruleNestedRelationshipQuery EOF ;
    public final void entryRuleNestedRelationshipQuery() throws RecognitionException {
        try {
            // InternalSkiql.g:355:1: ( ruleNestedRelationshipQuery EOF )
            // InternalSkiql.g:356:1: ruleNestedRelationshipQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNestedRelationshipQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNestedRelationshipQuery"


    // $ANTLR start "ruleNestedRelationshipQuery"
    // InternalSkiql.g:363:1: ruleNestedRelationshipQuery : ( ( rule__NestedRelationshipQuery__Group__0 ) ) ;
    public final void ruleNestedRelationshipQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:367:2: ( ( ( rule__NestedRelationshipQuery__Group__0 ) ) )
            // InternalSkiql.g:368:2: ( ( rule__NestedRelationshipQuery__Group__0 ) )
            {
            // InternalSkiql.g:368:2: ( ( rule__NestedRelationshipQuery__Group__0 ) )
            // InternalSkiql.g:369:3: ( rule__NestedRelationshipQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getGroup()); 
            }
            // InternalSkiql.g:370:3: ( rule__NestedRelationshipQuery__Group__0 )
            // InternalSkiql.g:370:4: rule__NestedRelationshipQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getGroup()); 
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
    // $ANTLR end "ruleNestedRelationshipQuery"


    // $ANTLR start "entryRuleRelationshipSpec"
    // InternalSkiql.g:379:1: entryRuleRelationshipSpec : ruleRelationshipSpec EOF ;
    public final void entryRuleRelationshipSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:380:1: ( ruleRelationshipSpec EOF )
            // InternalSkiql.g:381:1: ruleRelationshipSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationshipSpec"


    // $ANTLR start "ruleRelationshipSpec"
    // InternalSkiql.g:388:1: ruleRelationshipSpec : ( ( rule__RelationshipSpec__Group__0 ) ) ;
    public final void ruleRelationshipSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:392:2: ( ( ( rule__RelationshipSpec__Group__0 ) ) )
            // InternalSkiql.g:393:2: ( ( rule__RelationshipSpec__Group__0 ) )
            {
            // InternalSkiql.g:393:2: ( ( rule__RelationshipSpec__Group__0 ) )
            // InternalSkiql.g:394:3: ( rule__RelationshipSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:395:3: ( rule__RelationshipSpec__Group__0 )
            // InternalSkiql.g:395:4: rule__RelationshipSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleRelationshipSpec"


    // $ANTLR start "entryRuleRelationTypeSpec"
    // InternalSkiql.g:404:1: entryRuleRelationTypeSpec : ruleRelationTypeSpec EOF ;
    public final void entryRuleRelationTypeSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:405:1: ( ruleRelationTypeSpec EOF )
            // InternalSkiql.g:406:1: ruleRelationTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationTypeSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationTypeSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationTypeSpec"


    // $ANTLR start "ruleRelationTypeSpec"
    // InternalSkiql.g:413:1: ruleRelationTypeSpec : ( ( rule__RelationTypeSpec__Alternatives ) ) ;
    public final void ruleRelationTypeSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:417:2: ( ( ( rule__RelationTypeSpec__Alternatives ) ) )
            // InternalSkiql.g:418:2: ( ( rule__RelationTypeSpec__Alternatives ) )
            {
            // InternalSkiql.g:418:2: ( ( rule__RelationTypeSpec__Alternatives ) )
            // InternalSkiql.g:419:3: ( rule__RelationTypeSpec__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationTypeSpecAccess().getAlternatives()); 
            }
            // InternalSkiql.g:420:3: ( rule__RelationTypeSpec__Alternatives )
            // InternalSkiql.g:420:4: rule__RelationTypeSpec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationTypeSpec__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationTypeSpecAccess().getAlternatives()); 
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
    // $ANTLR end "ruleRelationTypeSpec"


    // $ANTLR start "entryRuleRelationSpec"
    // InternalSkiql.g:429:1: entryRuleRelationSpec : ruleRelationSpec EOF ;
    public final void entryRuleRelationSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:430:1: ( ruleRelationSpec EOF )
            // InternalSkiql.g:431:1: ruleRelationSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationSpec"


    // $ANTLR start "ruleRelationSpec"
    // InternalSkiql.g:438:1: ruleRelationSpec : ( ( rule__RelationSpec__Group__0 ) ) ;
    public final void ruleRelationSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:442:2: ( ( ( rule__RelationSpec__Group__0 ) ) )
            // InternalSkiql.g:443:2: ( ( rule__RelationSpec__Group__0 ) )
            {
            // InternalSkiql.g:443:2: ( ( rule__RelationSpec__Group__0 ) )
            // InternalSkiql.g:444:3: ( rule__RelationSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:445:3: ( rule__RelationSpec__Group__0 )
            // InternalSkiql.g:445:4: rule__RelationSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleRelationSpec"


    // $ANTLR start "entryRuleReferenceSpec"
    // InternalSkiql.g:454:1: entryRuleReferenceSpec : ruleReferenceSpec EOF ;
    public final void entryRuleReferenceSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:455:1: ( ruleReferenceSpec EOF )
            // InternalSkiql.g:456:1: ruleReferenceSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReferenceSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReferenceSpec"


    // $ANTLR start "ruleReferenceSpec"
    // InternalSkiql.g:463:1: ruleReferenceSpec : ( ( rule__ReferenceSpec__Group__0 ) ) ;
    public final void ruleReferenceSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:467:2: ( ( ( rule__ReferenceSpec__Group__0 ) ) )
            // InternalSkiql.g:468:2: ( ( rule__ReferenceSpec__Group__0 ) )
            {
            // InternalSkiql.g:468:2: ( ( rule__ReferenceSpec__Group__0 ) )
            // InternalSkiql.g:469:3: ( rule__ReferenceSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:470:3: ( rule__ReferenceSpec__Group__0 )
            // InternalSkiql.g:470:4: rule__ReferenceSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleReferenceSpec"


    // $ANTLR start "entryRuleAggregationSpec"
    // InternalSkiql.g:479:1: entryRuleAggregationSpec : ruleAggregationSpec EOF ;
    public final void entryRuleAggregationSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:480:1: ( ruleAggregationSpec EOF )
            // InternalSkiql.g:481:1: ruleAggregationSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAggregationSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAggregationSpec"


    // $ANTLR start "ruleAggregationSpec"
    // InternalSkiql.g:488:1: ruleAggregationSpec : ( ( rule__AggregationSpec__Group__0 ) ) ;
    public final void ruleAggregationSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:492:2: ( ( ( rule__AggregationSpec__Group__0 ) ) )
            // InternalSkiql.g:493:2: ( ( rule__AggregationSpec__Group__0 ) )
            {
            // InternalSkiql.g:493:2: ( ( rule__AggregationSpec__Group__0 ) )
            // InternalSkiql.g:494:3: ( rule__AggregationSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:495:3: ( rule__AggregationSpec__Group__0 )
            // InternalSkiql.g:495:4: rule__AggregationSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AggregationSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleAggregationSpec"


    // $ANTLR start "entryRuleIndirectRelationshipSpec"
    // InternalSkiql.g:504:1: entryRuleIndirectRelationshipSpec : ruleIndirectRelationshipSpec EOF ;
    public final void entryRuleIndirectRelationshipSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:505:1: ( ruleIndirectRelationshipSpec EOF )
            // InternalSkiql.g:506:1: ruleIndirectRelationshipSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIndirectRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIndirectRelationshipSpec"


    // $ANTLR start "ruleIndirectRelationshipSpec"
    // InternalSkiql.g:513:1: ruleIndirectRelationshipSpec : ( ( rule__IndirectRelationshipSpec__Group__0 ) ) ;
    public final void ruleIndirectRelationshipSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:517:2: ( ( ( rule__IndirectRelationshipSpec__Group__0 ) ) )
            // InternalSkiql.g:518:2: ( ( rule__IndirectRelationshipSpec__Group__0 ) )
            {
            // InternalSkiql.g:518:2: ( ( rule__IndirectRelationshipSpec__Group__0 ) )
            // InternalSkiql.g:519:3: ( rule__IndirectRelationshipSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:520:3: ( rule__IndirectRelationshipSpec__Group__0 )
            // InternalSkiql.g:520:4: rule__IndirectRelationshipSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndirectRelationshipSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleIndirectRelationshipSpec"


    // $ANTLR start "entryRuleIndirectRelationTypeSpec"
    // InternalSkiql.g:529:1: entryRuleIndirectRelationTypeSpec : ruleIndirectRelationTypeSpec EOF ;
    public final void entryRuleIndirectRelationTypeSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:530:1: ( ruleIndirectRelationTypeSpec EOF )
            // InternalSkiql.g:531:1: ruleIndirectRelationTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIndirectRelationTypeSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationTypeSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIndirectRelationTypeSpec"


    // $ANTLR start "ruleIndirectRelationTypeSpec"
    // InternalSkiql.g:538:1: ruleIndirectRelationTypeSpec : ( ( rule__IndirectRelationTypeSpec__Alternatives ) ) ;
    public final void ruleIndirectRelationTypeSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:542:2: ( ( ( rule__IndirectRelationTypeSpec__Alternatives ) ) )
            // InternalSkiql.g:543:2: ( ( rule__IndirectRelationTypeSpec__Alternatives ) )
            {
            // InternalSkiql.g:543:2: ( ( rule__IndirectRelationTypeSpec__Alternatives ) )
            // InternalSkiql.g:544:3: ( rule__IndirectRelationTypeSpec__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationTypeSpecAccess().getAlternatives()); 
            }
            // InternalSkiql.g:545:3: ( rule__IndirectRelationTypeSpec__Alternatives )
            // InternalSkiql.g:545:4: rule__IndirectRelationTypeSpec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IndirectRelationTypeSpec__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationTypeSpecAccess().getAlternatives()); 
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
    // $ANTLR end "ruleIndirectRelationTypeSpec"


    // $ANTLR start "entryRuleIndirectReferenceSpec"
    // InternalSkiql.g:554:1: entryRuleIndirectReferenceSpec : ruleIndirectReferenceSpec EOF ;
    public final void entryRuleIndirectReferenceSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:555:1: ( ruleIndirectReferenceSpec EOF )
            // InternalSkiql.g:556:1: ruleIndirectReferenceSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectReferenceSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIndirectReferenceSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectReferenceSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIndirectReferenceSpec"


    // $ANTLR start "ruleIndirectReferenceSpec"
    // InternalSkiql.g:563:1: ruleIndirectReferenceSpec : ( ( rule__IndirectReferenceSpec__Group__0 ) ) ;
    public final void ruleIndirectReferenceSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:567:2: ( ( ( rule__IndirectReferenceSpec__Group__0 ) ) )
            // InternalSkiql.g:568:2: ( ( rule__IndirectReferenceSpec__Group__0 ) )
            {
            // InternalSkiql.g:568:2: ( ( rule__IndirectReferenceSpec__Group__0 ) )
            // InternalSkiql.g:569:3: ( rule__IndirectReferenceSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectReferenceSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:570:3: ( rule__IndirectReferenceSpec__Group__0 )
            // InternalSkiql.g:570:4: rule__IndirectReferenceSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndirectReferenceSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectReferenceSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleIndirectReferenceSpec"


    // $ANTLR start "entryRuleIndirectAggregationSpec"
    // InternalSkiql.g:579:1: entryRuleIndirectAggregationSpec : ruleIndirectAggregationSpec EOF ;
    public final void entryRuleIndirectAggregationSpec() throws RecognitionException {
        try {
            // InternalSkiql.g:580:1: ( ruleIndirectAggregationSpec EOF )
            // InternalSkiql.g:581:1: ruleIndirectAggregationSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectAggregationSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIndirectAggregationSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectAggregationSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIndirectAggregationSpec"


    // $ANTLR start "ruleIndirectAggregationSpec"
    // InternalSkiql.g:588:1: ruleIndirectAggregationSpec : ( ( rule__IndirectAggregationSpec__Group__0 ) ) ;
    public final void ruleIndirectAggregationSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:592:2: ( ( ( rule__IndirectAggregationSpec__Group__0 ) ) )
            // InternalSkiql.g:593:2: ( ( rule__IndirectAggregationSpec__Group__0 ) )
            {
            // InternalSkiql.g:593:2: ( ( rule__IndirectAggregationSpec__Group__0 ) )
            // InternalSkiql.g:594:3: ( rule__IndirectAggregationSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectAggregationSpecAccess().getGroup()); 
            }
            // InternalSkiql.g:595:3: ( rule__IndirectAggregationSpec__Group__0 )
            // InternalSkiql.g:595:4: rule__IndirectAggregationSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndirectAggregationSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectAggregationSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleIndirectAggregationSpec"


    // $ANTLR start "entryRuleTargetExpression"
    // InternalSkiql.g:604:1: entryRuleTargetExpression : ruleTargetExpression EOF ;
    public final void entryRuleTargetExpression() throws RecognitionException {
        try {
            // InternalSkiql.g:605:1: ( ruleTargetExpression EOF )
            // InternalSkiql.g:606:1: ruleTargetExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTargetExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTargetExpression"


    // $ANTLR start "ruleTargetExpression"
    // InternalSkiql.g:613:1: ruleTargetExpression : ( ( rule__TargetExpression__Alternatives ) ) ;
    public final void ruleTargetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:617:2: ( ( ( rule__TargetExpression__Alternatives ) ) )
            // InternalSkiql.g:618:2: ( ( rule__TargetExpression__Alternatives ) )
            {
            // InternalSkiql.g:618:2: ( ( rule__TargetExpression__Alternatives ) )
            // InternalSkiql.g:619:3: ( rule__TargetExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetExpressionAccess().getAlternatives()); 
            }
            // InternalSkiql.g:620:3: ( rule__TargetExpression__Alternatives )
            // InternalSkiql.g:620:4: rule__TargetExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TargetExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTargetExpression"


    // $ANTLR start "entryRuleRelationshipExpression"
    // InternalSkiql.g:629:1: entryRuleRelationshipExpression : ruleRelationshipExpression EOF ;
    public final void entryRuleRelationshipExpression() throws RecognitionException {
        try {
            // InternalSkiql.g:630:1: ( ruleRelationshipExpression EOF )
            // InternalSkiql.g:631:1: ruleRelationshipExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationshipExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationshipExpression"


    // $ANTLR start "ruleRelationshipExpression"
    // InternalSkiql.g:638:1: ruleRelationshipExpression : ( ( rule__RelationshipExpression__Group__0 ) ) ;
    public final void ruleRelationshipExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:642:2: ( ( ( rule__RelationshipExpression__Group__0 ) ) )
            // InternalSkiql.g:643:2: ( ( rule__RelationshipExpression__Group__0 ) )
            {
            // InternalSkiql.g:643:2: ( ( rule__RelationshipExpression__Group__0 ) )
            // InternalSkiql.g:644:3: ( rule__RelationshipExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipExpressionAccess().getGroup()); 
            }
            // InternalSkiql.g:645:3: ( rule__RelationshipExpression__Group__0 )
            // InternalSkiql.g:645:4: rule__RelationshipExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleRelationshipExpression"


    // $ANTLR start "entryRuleEntityExpression"
    // InternalSkiql.g:654:1: entryRuleEntityExpression : ruleEntityExpression EOF ;
    public final void entryRuleEntityExpression() throws RecognitionException {
        try {
            // InternalSkiql.g:655:1: ( ruleEntityExpression EOF )
            // InternalSkiql.g:656:1: ruleEntityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntityExpression"


    // $ANTLR start "ruleEntityExpression"
    // InternalSkiql.g:663:1: ruleEntityExpression : ( ( rule__EntityExpression__Group__0 ) ) ;
    public final void ruleEntityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:667:2: ( ( ( rule__EntityExpression__Group__0 ) ) )
            // InternalSkiql.g:668:2: ( ( rule__EntityExpression__Group__0 ) )
            {
            // InternalSkiql.g:668:2: ( ( rule__EntityExpression__Group__0 ) )
            // InternalSkiql.g:669:3: ( rule__EntityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityExpressionAccess().getGroup()); 
            }
            // InternalSkiql.g:670:3: ( rule__EntityExpression__Group__0 )
            // InternalSkiql.g:670:4: rule__EntityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleEntityExpression"


    // $ANTLR start "entryRuleToReferenceEntitySpec"
    // InternalSkiql.g:679:1: entryRuleToReferenceEntitySpec : ruleToReferenceEntitySpec EOF ;
    public final void entryRuleToReferenceEntitySpec() throws RecognitionException {
        try {
            // InternalSkiql.g:680:1: ( ruleToReferenceEntitySpec EOF )
            // InternalSkiql.g:681:1: ruleToReferenceEntitySpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToReferenceEntitySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleToReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToReferenceEntitySpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleToReferenceEntitySpec"


    // $ANTLR start "ruleToReferenceEntitySpec"
    // InternalSkiql.g:688:1: ruleToReferenceEntitySpec : ( ( rule__ToReferenceEntitySpec__Group__0 ) ) ;
    public final void ruleToReferenceEntitySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:692:2: ( ( ( rule__ToReferenceEntitySpec__Group__0 ) ) )
            // InternalSkiql.g:693:2: ( ( rule__ToReferenceEntitySpec__Group__0 ) )
            {
            // InternalSkiql.g:693:2: ( ( rule__ToReferenceEntitySpec__Group__0 ) )
            // InternalSkiql.g:694:3: ( rule__ToReferenceEntitySpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToReferenceEntitySpecAccess().getGroup()); 
            }
            // InternalSkiql.g:695:3: ( rule__ToReferenceEntitySpec__Group__0 )
            // InternalSkiql.g:695:4: rule__ToReferenceEntitySpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ToReferenceEntitySpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToReferenceEntitySpecAccess().getGroup()); 
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
    // $ANTLR end "ruleToReferenceEntitySpec"


    // $ANTLR start "entryRuleReferenceVariationFilter"
    // InternalSkiql.g:704:1: entryRuleReferenceVariationFilter : ruleReferenceVariationFilter EOF ;
    public final void entryRuleReferenceVariationFilter() throws RecognitionException {
        try {
            // InternalSkiql.g:705:1: ( ruleReferenceVariationFilter EOF )
            // InternalSkiql.g:706:1: ruleReferenceVariationFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReferenceVariationFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReferenceVariationFilter"


    // $ANTLR start "ruleReferenceVariationFilter"
    // InternalSkiql.g:713:1: ruleReferenceVariationFilter : ( ( rule__ReferenceVariationFilter__Group__0 ) ) ;
    public final void ruleReferenceVariationFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:717:2: ( ( ( rule__ReferenceVariationFilter__Group__0 ) ) )
            // InternalSkiql.g:718:2: ( ( rule__ReferenceVariationFilter__Group__0 ) )
            {
            // InternalSkiql.g:718:2: ( ( rule__ReferenceVariationFilter__Group__0 ) )
            // InternalSkiql.g:719:3: ( rule__ReferenceVariationFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getGroup()); 
            }
            // InternalSkiql.g:720:3: ( rule__ReferenceVariationFilter__Group__0 )
            // InternalSkiql.g:720:4: rule__ReferenceVariationFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getGroup()); 
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
    // $ANTLR end "ruleReferenceVariationFilter"


    // $ANTLR start "entryRuleReferencePropertySpec"
    // InternalSkiql.g:729:1: entryRuleReferencePropertySpec : ruleReferencePropertySpec EOF ;
    public final void entryRuleReferencePropertySpec() throws RecognitionException {
        try {
            // InternalSkiql.g:730:1: ( ruleReferencePropertySpec EOF )
            // InternalSkiql.g:731:1: ruleReferencePropertySpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReferencePropertySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertySpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReferencePropertySpec"


    // $ANTLR start "ruleReferencePropertySpec"
    // InternalSkiql.g:738:1: ruleReferencePropertySpec : ( ( rule__ReferencePropertySpec__Group__0 ) ) ;
    public final void ruleReferencePropertySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:742:2: ( ( ( rule__ReferencePropertySpec__Group__0 ) ) )
            // InternalSkiql.g:743:2: ( ( rule__ReferencePropertySpec__Group__0 ) )
            {
            // InternalSkiql.g:743:2: ( ( rule__ReferencePropertySpec__Group__0 ) )
            // InternalSkiql.g:744:3: ( rule__ReferencePropertySpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertySpecAccess().getGroup()); 
            }
            // InternalSkiql.g:745:3: ( rule__ReferencePropertySpec__Group__0 )
            // InternalSkiql.g:745:4: rule__ReferencePropertySpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePropertySpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertySpecAccess().getGroup()); 
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
    // $ANTLR end "ruleReferencePropertySpec"


    // $ANTLR start "entryRuleVariationFilter"
    // InternalSkiql.g:754:1: entryRuleVariationFilter : ruleVariationFilter EOF ;
    public final void entryRuleVariationFilter() throws RecognitionException {
        try {
            // InternalSkiql.g:755:1: ( ruleVariationFilter EOF )
            // InternalSkiql.g:756:1: ruleVariationFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariationFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariationFilter"


    // $ANTLR start "ruleVariationFilter"
    // InternalSkiql.g:763:1: ruleVariationFilter : ( ( rule__VariationFilter__Group__0 ) ) ;
    public final void ruleVariationFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:767:2: ( ( ( rule__VariationFilter__Group__0 ) ) )
            // InternalSkiql.g:768:2: ( ( rule__VariationFilter__Group__0 ) )
            {
            // InternalSkiql.g:768:2: ( ( rule__VariationFilter__Group__0 ) )
            // InternalSkiql.g:769:3: ( rule__VariationFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getGroup()); 
            }
            // InternalSkiql.g:770:3: ( rule__VariationFilter__Group__0 )
            // InternalSkiql.g:770:4: rule__VariationFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getGroup()); 
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
    // $ANTLR end "ruleVariationFilter"


    // $ANTLR start "entryRulePropertySpec"
    // InternalSkiql.g:779:1: entryRulePropertySpec : rulePropertySpec EOF ;
    public final void entryRulePropertySpec() throws RecognitionException {
        try {
            // InternalSkiql.g:780:1: ( rulePropertySpec EOF )
            // InternalSkiql.g:781:1: rulePropertySpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySpecRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePropertySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertySpec"


    // $ANTLR start "rulePropertySpec"
    // InternalSkiql.g:788:1: rulePropertySpec : ( ( rule__PropertySpec__Group__0 ) ) ;
    public final void rulePropertySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:792:2: ( ( ( rule__PropertySpec__Group__0 ) ) )
            // InternalSkiql.g:793:2: ( ( rule__PropertySpec__Group__0 ) )
            {
            // InternalSkiql.g:793:2: ( ( rule__PropertySpec__Group__0 ) )
            // InternalSkiql.g:794:3: ( rule__PropertySpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySpecAccess().getGroup()); 
            }
            // InternalSkiql.g:795:3: ( rule__PropertySpec__Group__0 )
            // InternalSkiql.g:795:4: rule__PropertySpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertySpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySpecAccess().getGroup()); 
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
    // $ANTLR end "rulePropertySpec"


    // $ANTLR start "entryRuleType"
    // InternalSkiql.g:804:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSkiql.g:805:1: ( ruleType EOF )
            // InternalSkiql.g:806:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSkiql.g:813:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:817:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSkiql.g:818:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSkiql.g:818:2: ( ( rule__Type__Alternatives ) )
            // InternalSkiql.g:819:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalSkiql.g:820:3: ( rule__Type__Alternatives )
            // InternalSkiql.g:820:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalSkiql.g:829:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalSkiql.g:830:1: ( rulePrimitiveType EOF )
            // InternalSkiql.g:831:1: rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalSkiql.g:838:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:842:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalSkiql.g:843:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalSkiql.g:843:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalSkiql.g:844:3: ( rule__PrimitiveType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            }
            // InternalSkiql.g:845:3: ( rule__PrimitiveType__Group__0 )
            // InternalSkiql.g:845:4: rule__PrimitiveType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleRelationshipType"
    // InternalSkiql.g:854:1: entryRuleRelationshipType : ruleRelationshipType EOF ;
    public final void entryRuleRelationshipType() throws RecognitionException {
        try {
            // InternalSkiql.g:855:1: ( ruleRelationshipType EOF )
            // InternalSkiql.g:856:1: ruleRelationshipType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationshipType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationshipType"


    // $ANTLR start "ruleRelationshipType"
    // InternalSkiql.g:863:1: ruleRelationshipType : ( ( rule__RelationshipType__Group__0 ) ) ;
    public final void ruleRelationshipType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:867:2: ( ( ( rule__RelationshipType__Group__0 ) ) )
            // InternalSkiql.g:868:2: ( ( rule__RelationshipType__Group__0 ) )
            {
            // InternalSkiql.g:868:2: ( ( rule__RelationshipType__Group__0 ) )
            // InternalSkiql.g:869:3: ( rule__RelationshipType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeAccess().getGroup()); 
            }
            // InternalSkiql.g:870:3: ( rule__RelationshipType__Group__0 )
            // InternalSkiql.g:870:4: rule__RelationshipType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeAccess().getGroup()); 
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
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "entryRuleVersionHistory"
    // InternalSkiql.g:879:1: entryRuleVersionHistory : ruleVersionHistory EOF ;
    public final void entryRuleVersionHistory() throws RecognitionException {
        try {
            // InternalSkiql.g:880:1: ( ruleVersionHistory EOF )
            // InternalSkiql.g:881:1: ruleVersionHistory EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionHistoryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVersionHistory();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionHistoryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVersionHistory"


    // $ANTLR start "ruleVersionHistory"
    // InternalSkiql.g:888:1: ruleVersionHistory : ( ( rule__VersionHistory__Alternatives ) ) ;
    public final void ruleVersionHistory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:892:2: ( ( ( rule__VersionHistory__Alternatives ) ) )
            // InternalSkiql.g:893:2: ( ( rule__VersionHistory__Alternatives ) )
            {
            // InternalSkiql.g:893:2: ( ( rule__VersionHistory__Alternatives ) )
            // InternalSkiql.g:894:3: ( rule__VersionHistory__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionHistoryAccess().getAlternatives()); 
            }
            // InternalSkiql.g:895:3: ( rule__VersionHistory__Alternatives )
            // InternalSkiql.g:895:4: rule__VersionHistory__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VersionHistory__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionHistoryAccess().getAlternatives()); 
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
    // $ANTLR end "ruleVersionHistory"


    // $ANTLR start "entryRuleBeforeHistory"
    // InternalSkiql.g:904:1: entryRuleBeforeHistory : ruleBeforeHistory EOF ;
    public final void entryRuleBeforeHistory() throws RecognitionException {
        try {
            // InternalSkiql.g:905:1: ( ruleBeforeHistory EOF )
            // InternalSkiql.g:906:1: ruleBeforeHistory EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBeforeHistoryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBeforeHistory();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBeforeHistoryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBeforeHistory"


    // $ANTLR start "ruleBeforeHistory"
    // InternalSkiql.g:913:1: ruleBeforeHistory : ( ( rule__BeforeHistory__Group__0 ) ) ;
    public final void ruleBeforeHistory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:917:2: ( ( ( rule__BeforeHistory__Group__0 ) ) )
            // InternalSkiql.g:918:2: ( ( rule__BeforeHistory__Group__0 ) )
            {
            // InternalSkiql.g:918:2: ( ( rule__BeforeHistory__Group__0 ) )
            // InternalSkiql.g:919:3: ( rule__BeforeHistory__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBeforeHistoryAccess().getGroup()); 
            }
            // InternalSkiql.g:920:3: ( rule__BeforeHistory__Group__0 )
            // InternalSkiql.g:920:4: rule__BeforeHistory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BeforeHistory__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBeforeHistoryAccess().getGroup()); 
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
    // $ANTLR end "ruleBeforeHistory"


    // $ANTLR start "entryRuleAfterHistory"
    // InternalSkiql.g:929:1: entryRuleAfterHistory : ruleAfterHistory EOF ;
    public final void entryRuleAfterHistory() throws RecognitionException {
        try {
            // InternalSkiql.g:930:1: ( ruleAfterHistory EOF )
            // InternalSkiql.g:931:1: ruleAfterHistory EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAfterHistoryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAfterHistory();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAfterHistoryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAfterHistory"


    // $ANTLR start "ruleAfterHistory"
    // InternalSkiql.g:938:1: ruleAfterHistory : ( ( rule__AfterHistory__Group__0 ) ) ;
    public final void ruleAfterHistory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:942:2: ( ( ( rule__AfterHistory__Group__0 ) ) )
            // InternalSkiql.g:943:2: ( ( rule__AfterHistory__Group__0 ) )
            {
            // InternalSkiql.g:943:2: ( ( rule__AfterHistory__Group__0 ) )
            // InternalSkiql.g:944:3: ( rule__AfterHistory__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAfterHistoryAccess().getGroup()); 
            }
            // InternalSkiql.g:945:3: ( rule__AfterHistory__Group__0 )
            // InternalSkiql.g:945:4: rule__AfterHistory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AfterHistory__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAfterHistoryAccess().getGroup()); 
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
    // $ANTLR end "ruleAfterHistory"


    // $ANTLR start "entryRuleBetweenHistory"
    // InternalSkiql.g:954:1: entryRuleBetweenHistory : ruleBetweenHistory EOF ;
    public final void entryRuleBetweenHistory() throws RecognitionException {
        try {
            // InternalSkiql.g:955:1: ( ruleBetweenHistory EOF )
            // InternalSkiql.g:956:1: ruleBetweenHistory EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBetweenHistory();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBetweenHistory"


    // $ANTLR start "ruleBetweenHistory"
    // InternalSkiql.g:963:1: ruleBetweenHistory : ( ( rule__BetweenHistory__Group__0 ) ) ;
    public final void ruleBetweenHistory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:967:2: ( ( ( rule__BetweenHistory__Group__0 ) ) )
            // InternalSkiql.g:968:2: ( ( rule__BetweenHistory__Group__0 ) )
            {
            // InternalSkiql.g:968:2: ( ( rule__BetweenHistory__Group__0 ) )
            // InternalSkiql.g:969:3: ( rule__BetweenHistory__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getGroup()); 
            }
            // InternalSkiql.g:970:3: ( rule__BetweenHistory__Group__0 )
            // InternalSkiql.g:970:4: rule__BetweenHistory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getGroup()); 
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
    // $ANTLR end "ruleBetweenHistory"


    // $ANTLR start "entryRuleDateTime"
    // InternalSkiql.g:979:1: entryRuleDateTime : ruleDateTime EOF ;
    public final void entryRuleDateTime() throws RecognitionException {
        try {
            // InternalSkiql.g:980:1: ( ruleDateTime EOF )
            // InternalSkiql.g:981:1: ruleDateTime EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDateTime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // InternalSkiql.g:988:1: ruleDateTime : ( ( rule__DateTime__Group__0 ) ) ;
    public final void ruleDateTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:992:2: ( ( ( rule__DateTime__Group__0 ) ) )
            // InternalSkiql.g:993:2: ( ( rule__DateTime__Group__0 ) )
            {
            // InternalSkiql.g:993:2: ( ( rule__DateTime__Group__0 ) )
            // InternalSkiql.g:994:3: ( rule__DateTime__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getGroup()); 
            }
            // InternalSkiql.g:995:3: ( rule__DateTime__Group__0 )
            // InternalSkiql.g:995:4: rule__DateTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getGroup()); 
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
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "ruleTypeEnum"
    // InternalSkiql.g:1004:1: ruleTypeEnum : ( ( rule__TypeEnum__Alternatives ) ) ;
    public final void ruleTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1008:1: ( ( ( rule__TypeEnum__Alternatives ) ) )
            // InternalSkiql.g:1009:2: ( ( rule__TypeEnum__Alternatives ) )
            {
            // InternalSkiql.g:1009:2: ( ( rule__TypeEnum__Alternatives ) )
            // InternalSkiql.g:1010:3: ( rule__TypeEnum__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeEnumAccess().getAlternatives()); 
            }
            // InternalSkiql.g:1011:3: ( rule__TypeEnum__Alternatives )
            // InternalSkiql.g:1011:4: rule__TypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeEnum__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeEnumAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTypeEnum"


    // $ANTLR start "ruleRelationshipTypeEnum"
    // InternalSkiql.g:1020:1: ruleRelationshipTypeEnum : ( ( rule__RelationshipTypeEnum__Alternatives ) ) ;
    public final void ruleRelationshipTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1024:1: ( ( ( rule__RelationshipTypeEnum__Alternatives ) ) )
            // InternalSkiql.g:1025:2: ( ( rule__RelationshipTypeEnum__Alternatives ) )
            {
            // InternalSkiql.g:1025:2: ( ( rule__RelationshipTypeEnum__Alternatives ) )
            // InternalSkiql.g:1026:3: ( rule__RelationshipTypeEnum__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeEnumAccess().getAlternatives()); 
            }
            // InternalSkiql.g:1027:3: ( rule__RelationshipTypeEnum__Alternatives )
            // InternalSkiql.g:1027:4: rule__RelationshipTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeEnum__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeEnumAccess().getAlternatives()); 
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
    // $ANTLR end "ruleRelationshipTypeEnum"


    // $ANTLR start "rule__Query__Alternatives"
    // InternalSkiql.g:1035:1: rule__Query__Alternatives : ( ( ruleEntityTypeQuery ) | ( ruleRelationshipTypeQuery ) | ( ruleRelationshipQuery ) | ( ruleAnyQuery ) );
    public final void rule__Query__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1039:1: ( ( ruleEntityTypeQuery ) | ( ruleRelationshipTypeQuery ) | ( ruleRelationshipQuery ) | ( ruleAnyQuery ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSkiql.g:1040:2: ( ruleEntityTypeQuery )
                    {
                    // InternalSkiql.g:1040:2: ( ruleEntityTypeQuery )
                    // InternalSkiql.g:1041:3: ruleEntityTypeQuery
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getEntityTypeQueryParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEntityTypeQuery();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryAccess().getEntityTypeQueryParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1046:2: ( ruleRelationshipTypeQuery )
                    {
                    // InternalSkiql.g:1046:2: ( ruleRelationshipTypeQuery )
                    // InternalSkiql.g:1047:3: ruleRelationshipTypeQuery
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getRelationshipTypeQueryParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRelationshipTypeQuery();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryAccess().getRelationshipTypeQueryParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSkiql.g:1052:2: ( ruleRelationshipQuery )
                    {
                    // InternalSkiql.g:1052:2: ( ruleRelationshipQuery )
                    // InternalSkiql.g:1053:3: ruleRelationshipQuery
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getRelationshipQueryParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRelationshipQuery();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryAccess().getRelationshipQueryParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSkiql.g:1058:2: ( ruleAnyQuery )
                    {
                    // InternalSkiql.g:1058:2: ( ruleAnyQuery )
                    // InternalSkiql.g:1059:3: ruleAnyQuery
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getAnyQueryParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAnyQuery();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryAccess().getAnyQueryParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__Query__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalSkiql.g:1068:1: rule__Operation__Alternatives : ( ( ruleKeysSpec ) | ( ruleVersionHistory ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1072:1: ( ( ruleKeysSpec ) | ( ruleVersionHistory ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==31||(LA2_0>=34 && LA2_0<=35)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSkiql.g:1073:2: ( ruleKeysSpec )
                    {
                    // InternalSkiql.g:1073:2: ( ruleKeysSpec )
                    // InternalSkiql.g:1074:3: ruleKeysSpec
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getKeysSpecParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleKeysSpec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getKeysSpecParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1079:2: ( ruleVersionHistory )
                    {
                    // InternalSkiql.g:1079:2: ( ruleVersionHistory )
                    // InternalSkiql.g:1080:3: ruleVersionHistory
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getVersionHistoryParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVersionHistory();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getVersionHistoryParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__RelationshipTypeSpec__NameAlternatives_1_0"
    // InternalSkiql.g:1089:1: rule__RelationshipTypeSpec__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) );
    public final void rule__RelationshipTypeSpec__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1093:1: ( ( RULE_ID ) | ( '*' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSkiql.g:1094:2: ( RULE_ID )
                    {
                    // InternalSkiql.g:1094:2: ( RULE_ID )
                    // InternalSkiql.g:1095:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeSpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeSpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1100:2: ( '*' )
                    {
                    // InternalSkiql.g:1100:2: ( '*' )
                    // InternalSkiql.g:1101:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeSpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeSpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }

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
    // $ANTLR end "rule__RelationshipTypeSpec__NameAlternatives_1_0"


    // $ANTLR start "rule__SchemaTypeSpec__NameAlternatives_1_0"
    // InternalSkiql.g:1110:1: rule__SchemaTypeSpec__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) );
    public final void rule__SchemaTypeSpec__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1114:1: ( ( RULE_ID ) | ( '*' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSkiql.g:1115:2: ( RULE_ID )
                    {
                    // InternalSkiql.g:1115:2: ( RULE_ID )
                    // InternalSkiql.g:1116:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaTypeSpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaTypeSpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1121:2: ( '*' )
                    {
                    // InternalSkiql.g:1121:2: ( '*' )
                    // InternalSkiql.g:1122:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaTypeSpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaTypeSpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }

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
    // $ANTLR end "rule__SchemaTypeSpec__NameAlternatives_1_0"


    // $ANTLR start "rule__EntitySpec__NameAlternatives_1_0"
    // InternalSkiql.g:1131:1: rule__EntitySpec__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) );
    public final void rule__EntitySpec__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1135:1: ( ( RULE_ID ) | ( '*' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSkiql.g:1136:2: ( RULE_ID )
                    {
                    // InternalSkiql.g:1136:2: ( RULE_ID )
                    // InternalSkiql.g:1137:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntitySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntitySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1142:2: ( '*' )
                    {
                    // InternalSkiql.g:1142:2: ( '*' )
                    // InternalSkiql.g:1143:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntitySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntitySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }

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
    // $ANTLR end "rule__EntitySpec__NameAlternatives_1_0"


    // $ANTLR start "rule__ReferenceEntitySpec__NameAlternatives_1_0"
    // InternalSkiql.g:1152:1: rule__ReferenceEntitySpec__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) | ( '_' ) );
    public final void rule__ReferenceEntitySpec__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1156:1: ( ( RULE_ID ) | ( '*' ) | ( '_' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 11:
                {
                alt6=2;
                }
                break;
            case 12:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSkiql.g:1157:2: ( RULE_ID )
                    {
                    // InternalSkiql.g:1157:2: ( RULE_ID )
                    // InternalSkiql.g:1158:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceEntitySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceEntitySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1163:2: ( '*' )
                    {
                    // InternalSkiql.g:1163:2: ( '*' )
                    // InternalSkiql.g:1164:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceEntitySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceEntitySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSkiql.g:1169:2: ( '_' )
                    {
                    // InternalSkiql.g:1169:2: ( '_' )
                    // InternalSkiql.g:1170:3: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceEntitySpecAccess().getName_Keyword_1_0_2()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceEntitySpecAccess().getName_Keyword_1_0_2()); 
                    }

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
    // $ANTLR end "rule__ReferenceEntitySpec__NameAlternatives_1_0"


    // $ANTLR start "rule__RelationshipQuery__Alternatives_4"
    // InternalSkiql.g:1179:1: rule__RelationshipQuery__Alternatives_4 : ( ( ( rule__RelationshipQuery__ToAssignment_4_0 ) ) | ( ( rule__RelationshipQuery__ToAssignment_4_1 ) ) );
    public final void rule__RelationshipQuery__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1183:1: ( ( ( rule__RelationshipQuery__ToAssignment_4_0 ) ) | ( ( rule__RelationshipQuery__ToAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=12)||LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSkiql.g:1184:2: ( ( rule__RelationshipQuery__ToAssignment_4_0 ) )
                    {
                    // InternalSkiql.g:1184:2: ( ( rule__RelationshipQuery__ToAssignment_4_0 ) )
                    // InternalSkiql.g:1185:3: ( rule__RelationshipQuery__ToAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipQueryAccess().getToAssignment_4_0()); 
                    }
                    // InternalSkiql.g:1186:3: ( rule__RelationshipQuery__ToAssignment_4_0 )
                    // InternalSkiql.g:1186:4: rule__RelationshipQuery__ToAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipQuery__ToAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipQueryAccess().getToAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1190:2: ( ( rule__RelationshipQuery__ToAssignment_4_1 ) )
                    {
                    // InternalSkiql.g:1190:2: ( ( rule__RelationshipQuery__ToAssignment_4_1 ) )
                    // InternalSkiql.g:1191:3: ( rule__RelationshipQuery__ToAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipQueryAccess().getToAssignment_4_1()); 
                    }
                    // InternalSkiql.g:1192:3: ( rule__RelationshipQuery__ToAssignment_4_1 )
                    // InternalSkiql.g:1192:4: rule__RelationshipQuery__ToAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipQuery__ToAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipQueryAccess().getToAssignment_4_1()); 
                    }

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
    // $ANTLR end "rule__RelationshipQuery__Alternatives_4"


    // $ANTLR start "rule__RelationshipQuery__Alternatives_5_1"
    // InternalSkiql.g:1200:1: rule__RelationshipQuery__Alternatives_5_1 : ( ( ( rule__RelationshipQuery__ToAssignment_5_1_0 ) ) | ( ( rule__RelationshipQuery__ToAssignment_5_1_1 ) ) );
    public final void rule__RelationshipQuery__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1204:1: ( ( ( rule__RelationshipQuery__ToAssignment_5_1_0 ) ) | ( ( rule__RelationshipQuery__ToAssignment_5_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=11 && LA8_0<=12)||LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSkiql.g:1205:2: ( ( rule__RelationshipQuery__ToAssignment_5_1_0 ) )
                    {
                    // InternalSkiql.g:1205:2: ( ( rule__RelationshipQuery__ToAssignment_5_1_0 ) )
                    // InternalSkiql.g:1206:3: ( rule__RelationshipQuery__ToAssignment_5_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipQueryAccess().getToAssignment_5_1_0()); 
                    }
                    // InternalSkiql.g:1207:3: ( rule__RelationshipQuery__ToAssignment_5_1_0 )
                    // InternalSkiql.g:1207:4: rule__RelationshipQuery__ToAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipQuery__ToAssignment_5_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipQueryAccess().getToAssignment_5_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1211:2: ( ( rule__RelationshipQuery__ToAssignment_5_1_1 ) )
                    {
                    // InternalSkiql.g:1211:2: ( ( rule__RelationshipQuery__ToAssignment_5_1_1 ) )
                    // InternalSkiql.g:1212:3: ( rule__RelationshipQuery__ToAssignment_5_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipQueryAccess().getToAssignment_5_1_1()); 
                    }
                    // InternalSkiql.g:1213:3: ( rule__RelationshipQuery__ToAssignment_5_1_1 )
                    // InternalSkiql.g:1213:4: rule__RelationshipQuery__ToAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipQuery__ToAssignment_5_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipQueryAccess().getToAssignment_5_1_1()); 
                    }

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
    // $ANTLR end "rule__RelationshipQuery__Alternatives_5_1"


    // $ANTLR start "rule__NestedRelationshipQuery__Alternatives_5"
    // InternalSkiql.g:1221:1: rule__NestedRelationshipQuery__Alternatives_5 : ( ( ( rule__NestedRelationshipQuery__ToAssignment_5_0 ) ) | ( ( rule__NestedRelationshipQuery__ToAssignment_5_1 ) ) );
    public final void rule__NestedRelationshipQuery__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1225:1: ( ( ( rule__NestedRelationshipQuery__ToAssignment_5_0 ) ) | ( ( rule__NestedRelationshipQuery__ToAssignment_5_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=11 && LA9_0<=12)||LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==37) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSkiql.g:1226:2: ( ( rule__NestedRelationshipQuery__ToAssignment_5_0 ) )
                    {
                    // InternalSkiql.g:1226:2: ( ( rule__NestedRelationshipQuery__ToAssignment_5_0 ) )
                    // InternalSkiql.g:1227:3: ( rule__NestedRelationshipQuery__ToAssignment_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNestedRelationshipQueryAccess().getToAssignment_5_0()); 
                    }
                    // InternalSkiql.g:1228:3: ( rule__NestedRelationshipQuery__ToAssignment_5_0 )
                    // InternalSkiql.g:1228:4: rule__NestedRelationshipQuery__ToAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedRelationshipQuery__ToAssignment_5_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNestedRelationshipQueryAccess().getToAssignment_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1232:2: ( ( rule__NestedRelationshipQuery__ToAssignment_5_1 ) )
                    {
                    // InternalSkiql.g:1232:2: ( ( rule__NestedRelationshipQuery__ToAssignment_5_1 ) )
                    // InternalSkiql.g:1233:3: ( rule__NestedRelationshipQuery__ToAssignment_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNestedRelationshipQueryAccess().getToAssignment_5_1()); 
                    }
                    // InternalSkiql.g:1234:3: ( rule__NestedRelationshipQuery__ToAssignment_5_1 )
                    // InternalSkiql.g:1234:4: rule__NestedRelationshipQuery__ToAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedRelationshipQuery__ToAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNestedRelationshipQueryAccess().getToAssignment_5_1()); 
                    }

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
    // $ANTLR end "rule__NestedRelationshipQuery__Alternatives_5"


    // $ANTLR start "rule__NestedRelationshipQuery__Alternatives_6_1"
    // InternalSkiql.g:1242:1: rule__NestedRelationshipQuery__Alternatives_6_1 : ( ( ( rule__NestedRelationshipQuery__ToAssignment_6_1_0 ) ) | ( ( rule__NestedRelationshipQuery__ToAssignment_6_1_1 ) ) );
    public final void rule__NestedRelationshipQuery__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1246:1: ( ( ( rule__NestedRelationshipQuery__ToAssignment_6_1_0 ) ) | ( ( rule__NestedRelationshipQuery__ToAssignment_6_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=11 && LA10_0<=12)||LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==37) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSkiql.g:1247:2: ( ( rule__NestedRelationshipQuery__ToAssignment_6_1_0 ) )
                    {
                    // InternalSkiql.g:1247:2: ( ( rule__NestedRelationshipQuery__ToAssignment_6_1_0 ) )
                    // InternalSkiql.g:1248:3: ( rule__NestedRelationshipQuery__ToAssignment_6_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNestedRelationshipQueryAccess().getToAssignment_6_1_0()); 
                    }
                    // InternalSkiql.g:1249:3: ( rule__NestedRelationshipQuery__ToAssignment_6_1_0 )
                    // InternalSkiql.g:1249:4: rule__NestedRelationshipQuery__ToAssignment_6_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedRelationshipQuery__ToAssignment_6_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNestedRelationshipQueryAccess().getToAssignment_6_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1253:2: ( ( rule__NestedRelationshipQuery__ToAssignment_6_1_1 ) )
                    {
                    // InternalSkiql.g:1253:2: ( ( rule__NestedRelationshipQuery__ToAssignment_6_1_1 ) )
                    // InternalSkiql.g:1254:3: ( rule__NestedRelationshipQuery__ToAssignment_6_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNestedRelationshipQueryAccess().getToAssignment_6_1_1()); 
                    }
                    // InternalSkiql.g:1255:3: ( rule__NestedRelationshipQuery__ToAssignment_6_1_1 )
                    // InternalSkiql.g:1255:4: rule__NestedRelationshipQuery__ToAssignment_6_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NestedRelationshipQuery__ToAssignment_6_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNestedRelationshipQueryAccess().getToAssignment_6_1_1()); 
                    }

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
    // $ANTLR end "rule__NestedRelationshipQuery__Alternatives_6_1"


    // $ANTLR start "rule__RelationTypeSpec__Alternatives"
    // InternalSkiql.g:1263:1: rule__RelationTypeSpec__Alternatives : ( ( ruleRelationSpec ) | ( ruleReferenceSpec ) | ( ruleAggregationSpec ) );
    public final void rule__RelationTypeSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1267:1: ( ( ruleRelationSpec ) | ( ruleReferenceSpec ) | ( ruleAggregationSpec ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 19:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSkiql.g:1268:2: ( ruleRelationSpec )
                    {
                    // InternalSkiql.g:1268:2: ( ruleRelationSpec )
                    // InternalSkiql.g:1269:3: ruleRelationSpec
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeSpecAccess().getRelationSpecParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRelationSpec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeSpecAccess().getRelationSpecParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1274:2: ( ruleReferenceSpec )
                    {
                    // InternalSkiql.g:1274:2: ( ruleReferenceSpec )
                    // InternalSkiql.g:1275:3: ruleReferenceSpec
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeSpecAccess().getReferenceSpecParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleReferenceSpec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeSpecAccess().getReferenceSpecParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSkiql.g:1280:2: ( ruleAggregationSpec )
                    {
                    // InternalSkiql.g:1280:2: ( ruleAggregationSpec )
                    // InternalSkiql.g:1281:3: ruleAggregationSpec
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeSpecAccess().getAggregationSpecParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAggregationSpec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeSpecAccess().getAggregationSpecParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__RelationTypeSpec__Alternatives"


    // $ANTLR start "rule__IndirectRelationTypeSpec__Alternatives"
    // InternalSkiql.g:1290:1: rule__IndirectRelationTypeSpec__Alternatives : ( ( ruleIndirectReferenceSpec ) | ( ruleIndirectAggregationSpec ) );
    public final void rule__IndirectRelationTypeSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1294:1: ( ( ruleIndirectReferenceSpec ) | ( ruleIndirectAggregationSpec ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSkiql.g:1295:2: ( ruleIndirectReferenceSpec )
                    {
                    // InternalSkiql.g:1295:2: ( ruleIndirectReferenceSpec )
                    // InternalSkiql.g:1296:3: ruleIndirectReferenceSpec
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndirectRelationTypeSpecAccess().getIndirectReferenceSpecParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIndirectReferenceSpec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIndirectRelationTypeSpecAccess().getIndirectReferenceSpecParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1301:2: ( ruleIndirectAggregationSpec )
                    {
                    // InternalSkiql.g:1301:2: ( ruleIndirectAggregationSpec )
                    // InternalSkiql.g:1302:3: ruleIndirectAggregationSpec
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndirectRelationTypeSpecAccess().getIndirectAggregationSpecParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIndirectAggregationSpec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIndirectRelationTypeSpecAccess().getIndirectAggregationSpecParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__IndirectRelationTypeSpec__Alternatives"


    // $ANTLR start "rule__TargetExpression__Alternatives"
    // InternalSkiql.g:1311:1: rule__TargetExpression__Alternatives : ( ( ruleRelationshipExpression ) | ( ruleEntityExpression ) );
    public final void rule__TargetExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1315:1: ( ( ruleRelationshipExpression ) | ( ruleEntityExpression ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID||(LA13_0>=11 && LA13_0<=12)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSkiql.g:1316:2: ( ruleRelationshipExpression )
                    {
                    // InternalSkiql.g:1316:2: ( ruleRelationshipExpression )
                    // InternalSkiql.g:1317:3: ruleRelationshipExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTargetExpressionAccess().getRelationshipExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRelationshipExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTargetExpressionAccess().getRelationshipExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1322:2: ( ruleEntityExpression )
                    {
                    // InternalSkiql.g:1322:2: ( ruleEntityExpression )
                    // InternalSkiql.g:1323:3: ruleEntityExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTargetExpressionAccess().getEntityExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEntityExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTargetExpressionAccess().getEntityExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__TargetExpression__Alternatives"


    // $ANTLR start "rule__ToReferenceEntitySpec__NameAlternatives_1_0"
    // InternalSkiql.g:1332:1: rule__ToReferenceEntitySpec__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) | ( '_' ) );
    public final void rule__ToReferenceEntitySpec__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1336:1: ( ( RULE_ID ) | ( '*' ) | ( '_' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 11:
                {
                alt14=2;
                }
                break;
            case 12:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSkiql.g:1337:2: ( RULE_ID )
                    {
                    // InternalSkiql.g:1337:2: ( RULE_ID )
                    // InternalSkiql.g:1338:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToReferenceEntitySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToReferenceEntitySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1343:2: ( '*' )
                    {
                    // InternalSkiql.g:1343:2: ( '*' )
                    // InternalSkiql.g:1344:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToReferenceEntitySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToReferenceEntitySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSkiql.g:1349:2: ( '_' )
                    {
                    // InternalSkiql.g:1349:2: ( '_' )
                    // InternalSkiql.g:1350:3: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToReferenceEntitySpecAccess().getName_Keyword_1_0_2()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToReferenceEntitySpecAccess().getName_Keyword_1_0_2()); 
                    }

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
    // $ANTLR end "rule__ToReferenceEntitySpec__NameAlternatives_1_0"


    // $ANTLR start "rule__ReferenceVariationFilter__Alternatives_1"
    // InternalSkiql.g:1359:1: rule__ReferenceVariationFilter__Alternatives_1 : ( ( '[]' ) | ( ( rule__ReferenceVariationFilter__Group_1_1__0 ) ) );
    public final void rule__ReferenceVariationFilter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1363:1: ( ( '[]' ) | ( ( rule__ReferenceVariationFilter__Group_1_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSkiql.g:1364:2: ( '[]' )
                    {
                    // InternalSkiql.g:1364:2: ( '[]' )
                    // InternalSkiql.g:1365:3: '[]'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceVariationFilterAccess().getLeftSquareBracketRightSquareBracketKeyword_1_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceVariationFilterAccess().getLeftSquareBracketRightSquareBracketKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1370:2: ( ( rule__ReferenceVariationFilter__Group_1_1__0 ) )
                    {
                    // InternalSkiql.g:1370:2: ( ( rule__ReferenceVariationFilter__Group_1_1__0 ) )
                    // InternalSkiql.g:1371:3: ( rule__ReferenceVariationFilter__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceVariationFilterAccess().getGroup_1_1()); 
                    }
                    // InternalSkiql.g:1372:3: ( rule__ReferenceVariationFilter__Group_1_1__0 )
                    // InternalSkiql.g:1372:4: rule__ReferenceVariationFilter__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceVariationFilter__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceVariationFilterAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__ReferenceVariationFilter__Alternatives_1"


    // $ANTLR start "rule__ReferencePropertySpec__NameAlternatives_1_0"
    // InternalSkiql.g:1380:1: rule__ReferencePropertySpec__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) );
    public final void rule__ReferencePropertySpec__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1384:1: ( ( RULE_ID ) | ( '*' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==11) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSkiql.g:1385:2: ( RULE_ID )
                    {
                    // InternalSkiql.g:1385:2: ( RULE_ID )
                    // InternalSkiql.g:1386:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferencePropertySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferencePropertySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1391:2: ( '*' )
                    {
                    // InternalSkiql.g:1391:2: ( '*' )
                    // InternalSkiql.g:1392:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferencePropertySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferencePropertySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }

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
    // $ANTLR end "rule__ReferencePropertySpec__NameAlternatives_1_0"


    // $ANTLR start "rule__VariationFilter__Alternatives_1"
    // InternalSkiql.g:1401:1: rule__VariationFilter__Alternatives_1 : ( ( '[]' ) | ( ( rule__VariationFilter__Group_1_1__0 ) ) );
    public final void rule__VariationFilter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1405:1: ( ( '[]' ) | ( ( rule__VariationFilter__Group_1_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            else if ( (LA17_0==28) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSkiql.g:1406:2: ( '[]' )
                    {
                    // InternalSkiql.g:1406:2: ( '[]' )
                    // InternalSkiql.g:1407:3: '[]'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariationFilterAccess().getLeftSquareBracketRightSquareBracketKeyword_1_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariationFilterAccess().getLeftSquareBracketRightSquareBracketKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1412:2: ( ( rule__VariationFilter__Group_1_1__0 ) )
                    {
                    // InternalSkiql.g:1412:2: ( ( rule__VariationFilter__Group_1_1__0 ) )
                    // InternalSkiql.g:1413:3: ( rule__VariationFilter__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariationFilterAccess().getGroup_1_1()); 
                    }
                    // InternalSkiql.g:1414:3: ( rule__VariationFilter__Group_1_1__0 )
                    // InternalSkiql.g:1414:4: rule__VariationFilter__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariationFilter__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariationFilterAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__VariationFilter__Alternatives_1"


    // $ANTLR start "rule__PropertySpec__NameAlternatives_1_0"
    // InternalSkiql.g:1422:1: rule__PropertySpec__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) );
    public final void rule__PropertySpec__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1426:1: ( ( RULE_ID ) | ( '*' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==11) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSkiql.g:1427:2: ( RULE_ID )
                    {
                    // InternalSkiql.g:1427:2: ( RULE_ID )
                    // InternalSkiql.g:1428:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertySpecAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1433:2: ( '*' )
                    {
                    // InternalSkiql.g:1433:2: ( '*' )
                    // InternalSkiql.g:1434:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertySpecAccess().getNameAsteriskKeyword_1_0_1()); 
                    }

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
    // $ANTLR end "rule__PropertySpec__NameAlternatives_1_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSkiql.g:1443:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleRelationshipType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1447:1: ( ( rulePrimitiveType ) | ( ruleRelationshipType ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=14 && LA19_0<=16)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=17 && LA19_0<=19)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSkiql.g:1448:2: ( rulePrimitiveType )
                    {
                    // InternalSkiql.g:1448:2: ( rulePrimitiveType )
                    // InternalSkiql.g:1449:3: rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1454:2: ( ruleRelationshipType )
                    {
                    // InternalSkiql.g:1454:2: ( ruleRelationshipType )
                    // InternalSkiql.g:1455:3: ruleRelationshipType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getRelationshipTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRelationshipType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getRelationshipTypeParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__RelationshipType__TargetEntityNameAlternatives_2_0"
    // InternalSkiql.g:1464:1: rule__RelationshipType__TargetEntityNameAlternatives_2_0 : ( ( RULE_ID ) | ( '*' ) );
    public final void rule__RelationshipType__TargetEntityNameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1468:1: ( ( RULE_ID ) | ( '*' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==11) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSkiql.g:1469:2: ( RULE_ID )
                    {
                    // InternalSkiql.g:1469:2: ( RULE_ID )
                    // InternalSkiql.g:1470:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getTargetEntityNameIDTerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getTargetEntityNameIDTerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1475:2: ( '*' )
                    {
                    // InternalSkiql.g:1475:2: ( '*' )
                    // InternalSkiql.g:1476:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getTargetEntityNameAsteriskKeyword_2_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getTargetEntityNameAsteriskKeyword_2_0_1()); 
                    }

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
    // $ANTLR end "rule__RelationshipType__TargetEntityNameAlternatives_2_0"


    // $ANTLR start "rule__VersionHistory__Alternatives"
    // InternalSkiql.g:1485:1: rule__VersionHistory__Alternatives : ( ( ruleBeforeHistory ) | ( ruleAfterHistory ) | ( ruleBetweenHistory ) );
    public final void rule__VersionHistory__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1489:1: ( ( ruleBeforeHistory ) | ( ruleAfterHistory ) | ( ruleBetweenHistory ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSkiql.g:1490:2: ( ruleBeforeHistory )
                    {
                    // InternalSkiql.g:1490:2: ( ruleBeforeHistory )
                    // InternalSkiql.g:1491:3: ruleBeforeHistory
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionHistoryAccess().getBeforeHistoryParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBeforeHistory();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionHistoryAccess().getBeforeHistoryParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1496:2: ( ruleAfterHistory )
                    {
                    // InternalSkiql.g:1496:2: ( ruleAfterHistory )
                    // InternalSkiql.g:1497:3: ruleAfterHistory
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionHistoryAccess().getAfterHistoryParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAfterHistory();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionHistoryAccess().getAfterHistoryParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSkiql.g:1502:2: ( ruleBetweenHistory )
                    {
                    // InternalSkiql.g:1502:2: ( ruleBetweenHistory )
                    // InternalSkiql.g:1503:3: ruleBetweenHistory
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionHistoryAccess().getBetweenHistoryParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBetweenHistory();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionHistoryAccess().getBetweenHistoryParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__VersionHistory__Alternatives"


    // $ANTLR start "rule__TypeEnum__Alternatives"
    // InternalSkiql.g:1512:1: rule__TypeEnum__Alternatives : ( ( ( 'string' ) ) | ( ( 'number' ) ) | ( ( 'boolean' ) ) );
    public final void rule__TypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1516:1: ( ( ( 'string' ) ) | ( ( 'number' ) ) | ( ( 'boolean' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt22=1;
                }
                break;
            case 15:
                {
                alt22=2;
                }
                break;
            case 16:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSkiql.g:1517:2: ( ( 'string' ) )
                    {
                    // InternalSkiql.g:1517:2: ( ( 'string' ) )
                    // InternalSkiql.g:1518:3: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeEnumAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    }
                    // InternalSkiql.g:1519:3: ( 'string' )
                    // InternalSkiql.g:1519:4: 'string'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeEnumAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1523:2: ( ( 'number' ) )
                    {
                    // InternalSkiql.g:1523:2: ( ( 'number' ) )
                    // InternalSkiql.g:1524:3: ( 'number' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeEnumAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    }
                    // InternalSkiql.g:1525:3: ( 'number' )
                    // InternalSkiql.g:1525:4: 'number'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeEnumAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSkiql.g:1529:2: ( ( 'boolean' ) )
                    {
                    // InternalSkiql.g:1529:2: ( ( 'boolean' ) )
                    // InternalSkiql.g:1530:3: ( 'boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    }
                    // InternalSkiql.g:1531:3: ( 'boolean' )
                    // InternalSkiql.g:1531:4: 'boolean'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__TypeEnum__Alternatives"


    // $ANTLR start "rule__RelationshipTypeEnum__Alternatives"
    // InternalSkiql.g:1539:1: rule__RelationshipTypeEnum__Alternatives : ( ( ( 'ANY' ) ) | ( ( 'REF' ) ) | ( ( 'AGGR' ) ) );
    public final void rule__RelationshipTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1543:1: ( ( ( 'ANY' ) ) | ( ( 'REF' ) ) | ( ( 'AGGR' ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt23=1;
                }
                break;
            case 18:
                {
                alt23=2;
                }
                break;
            case 19:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSkiql.g:1544:2: ( ( 'ANY' ) )
                    {
                    // InternalSkiql.g:1544:2: ( ( 'ANY' ) )
                    // InternalSkiql.g:1545:3: ( 'ANY' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeEnumAccess().getRELATIONSHIPEnumLiteralDeclaration_0()); 
                    }
                    // InternalSkiql.g:1546:3: ( 'ANY' )
                    // InternalSkiql.g:1546:4: 'ANY'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeEnumAccess().getRELATIONSHIPEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSkiql.g:1550:2: ( ( 'REF' ) )
                    {
                    // InternalSkiql.g:1550:2: ( ( 'REF' ) )
                    // InternalSkiql.g:1551:3: ( 'REF' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeEnumAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    }
                    // InternalSkiql.g:1552:3: ( 'REF' )
                    // InternalSkiql.g:1552:4: 'REF'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeEnumAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSkiql.g:1556:2: ( ( 'AGGR' ) )
                    {
                    // InternalSkiql.g:1556:2: ( ( 'AGGR' ) )
                    // InternalSkiql.g:1557:3: ( 'AGGR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeEnumAccess().getAGGREGATIONEnumLiteralDeclaration_2()); 
                    }
                    // InternalSkiql.g:1558:3: ( 'AGGR' )
                    // InternalSkiql.g:1558:4: 'AGGR'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeEnumAccess().getAGGREGATIONEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__RelationshipTypeEnum__Alternatives"


    // $ANTLR start "rule__SkiQLModel__Group__0"
    // InternalSkiql.g:1566:1: rule__SkiQLModel__Group__0 : rule__SkiQLModel__Group__0__Impl rule__SkiQLModel__Group__1 ;
    public final void rule__SkiQLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1570:1: ( rule__SkiQLModel__Group__0__Impl rule__SkiQLModel__Group__1 )
            // InternalSkiql.g:1571:2: rule__SkiQLModel__Group__0__Impl rule__SkiQLModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SkiQLModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SkiQLModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SkiQLModel__Group__0"


    // $ANTLR start "rule__SkiQLModel__Group__0__Impl"
    // InternalSkiql.g:1578:1: rule__SkiQLModel__Group__0__Impl : ( () ) ;
    public final void rule__SkiQLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1582:1: ( ( () ) )
            // InternalSkiql.g:1583:1: ( () )
            {
            // InternalSkiql.g:1583:1: ( () )
            // InternalSkiql.g:1584:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkiQLModelAccess().getSkiQLModelAction_0()); 
            }
            // InternalSkiql.g:1585:2: ()
            // InternalSkiql.g:1585:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkiQLModelAccess().getSkiQLModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkiQLModel__Group__0__Impl"


    // $ANTLR start "rule__SkiQLModel__Group__1"
    // InternalSkiql.g:1593:1: rule__SkiQLModel__Group__1 : rule__SkiQLModel__Group__1__Impl ;
    public final void rule__SkiQLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1597:1: ( rule__SkiQLModel__Group__1__Impl )
            // InternalSkiql.g:1598:2: rule__SkiQLModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkiQLModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SkiQLModel__Group__1"


    // $ANTLR start "rule__SkiQLModel__Group__1__Impl"
    // InternalSkiql.g:1604:1: rule__SkiQLModel__Group__1__Impl : ( ( rule__SkiQLModel__QueryAssignment_1 ) ) ;
    public final void rule__SkiQLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1608:1: ( ( ( rule__SkiQLModel__QueryAssignment_1 ) ) )
            // InternalSkiql.g:1609:1: ( ( rule__SkiQLModel__QueryAssignment_1 ) )
            {
            // InternalSkiql.g:1609:1: ( ( rule__SkiQLModel__QueryAssignment_1 ) )
            // InternalSkiql.g:1610:2: ( rule__SkiQLModel__QueryAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkiQLModelAccess().getQueryAssignment_1()); 
            }
            // InternalSkiql.g:1611:2: ( rule__SkiQLModel__QueryAssignment_1 )
            // InternalSkiql.g:1611:3: rule__SkiQLModel__QueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SkiQLModel__QueryAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkiQLModelAccess().getQueryAssignment_1()); 
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
    // $ANTLR end "rule__SkiQLModel__Group__1__Impl"


    // $ANTLR start "rule__EntityTypeQuery__Group__0"
    // InternalSkiql.g:1620:1: rule__EntityTypeQuery__Group__0 : rule__EntityTypeQuery__Group__0__Impl rule__EntityTypeQuery__Group__1 ;
    public final void rule__EntityTypeQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1624:1: ( rule__EntityTypeQuery__Group__0__Impl rule__EntityTypeQuery__Group__1 )
            // InternalSkiql.g:1625:2: rule__EntityTypeQuery__Group__0__Impl rule__EntityTypeQuery__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EntityTypeQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntityTypeQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityTypeQuery__Group__0"


    // $ANTLR start "rule__EntityTypeQuery__Group__0__Impl"
    // InternalSkiql.g:1632:1: rule__EntityTypeQuery__Group__0__Impl : ( () ) ;
    public final void rule__EntityTypeQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1636:1: ( ( () ) )
            // InternalSkiql.g:1637:1: ( () )
            {
            // InternalSkiql.g:1637:1: ( () )
            // InternalSkiql.g:1638:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeQueryAccess().getSchemaQueryAction_0()); 
            }
            // InternalSkiql.g:1639:2: ()
            // InternalSkiql.g:1639:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeQueryAccess().getSchemaQueryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityTypeQuery__Group__0__Impl"


    // $ANTLR start "rule__EntityTypeQuery__Group__1"
    // InternalSkiql.g:1647:1: rule__EntityTypeQuery__Group__1 : rule__EntityTypeQuery__Group__1__Impl rule__EntityTypeQuery__Group__2 ;
    public final void rule__EntityTypeQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1651:1: ( rule__EntityTypeQuery__Group__1__Impl rule__EntityTypeQuery__Group__2 )
            // InternalSkiql.g:1652:2: rule__EntityTypeQuery__Group__1__Impl rule__EntityTypeQuery__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EntityTypeQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntityTypeQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityTypeQuery__Group__1"


    // $ANTLR start "rule__EntityTypeQuery__Group__1__Impl"
    // InternalSkiql.g:1659:1: rule__EntityTypeQuery__Group__1__Impl : ( 'ENTITY' ) ;
    public final void rule__EntityTypeQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1663:1: ( ( 'ENTITY' ) )
            // InternalSkiql.g:1664:1: ( 'ENTITY' )
            {
            // InternalSkiql.g:1664:1: ( 'ENTITY' )
            // InternalSkiql.g:1665:2: 'ENTITY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeQueryAccess().getENTITYKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeQueryAccess().getENTITYKeyword_1()); 
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
    // $ANTLR end "rule__EntityTypeQuery__Group__1__Impl"


    // $ANTLR start "rule__EntityTypeQuery__Group__2"
    // InternalSkiql.g:1674:1: rule__EntityTypeQuery__Group__2 : rule__EntityTypeQuery__Group__2__Impl rule__EntityTypeQuery__Group__3 ;
    public final void rule__EntityTypeQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1678:1: ( rule__EntityTypeQuery__Group__2__Impl rule__EntityTypeQuery__Group__3 )
            // InternalSkiql.g:1679:2: rule__EntityTypeQuery__Group__2__Impl rule__EntityTypeQuery__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__EntityTypeQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntityTypeQuery__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityTypeQuery__Group__2"


    // $ANTLR start "rule__EntityTypeQuery__Group__2__Impl"
    // InternalSkiql.g:1686:1: rule__EntityTypeQuery__Group__2__Impl : ( ( rule__EntityTypeQuery__SchemaSpecAssignment_2 ) ) ;
    public final void rule__EntityTypeQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1690:1: ( ( ( rule__EntityTypeQuery__SchemaSpecAssignment_2 ) ) )
            // InternalSkiql.g:1691:1: ( ( rule__EntityTypeQuery__SchemaSpecAssignment_2 ) )
            {
            // InternalSkiql.g:1691:1: ( ( rule__EntityTypeQuery__SchemaSpecAssignment_2 ) )
            // InternalSkiql.g:1692:2: ( rule__EntityTypeQuery__SchemaSpecAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeQueryAccess().getSchemaSpecAssignment_2()); 
            }
            // InternalSkiql.g:1693:2: ( rule__EntityTypeQuery__SchemaSpecAssignment_2 )
            // InternalSkiql.g:1693:3: rule__EntityTypeQuery__SchemaSpecAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EntityTypeQuery__SchemaSpecAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeQueryAccess().getSchemaSpecAssignment_2()); 
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
    // $ANTLR end "rule__EntityTypeQuery__Group__2__Impl"


    // $ANTLR start "rule__EntityTypeQuery__Group__3"
    // InternalSkiql.g:1701:1: rule__EntityTypeQuery__Group__3 : rule__EntityTypeQuery__Group__3__Impl ;
    public final void rule__EntityTypeQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1705:1: ( rule__EntityTypeQuery__Group__3__Impl )
            // InternalSkiql.g:1706:2: rule__EntityTypeQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityTypeQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityTypeQuery__Group__3"


    // $ANTLR start "rule__EntityTypeQuery__Group__3__Impl"
    // InternalSkiql.g:1712:1: rule__EntityTypeQuery__Group__3__Impl : ( ( rule__EntityTypeQuery__OperationAssignment_3 )? ) ;
    public final void rule__EntityTypeQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1716:1: ( ( ( rule__EntityTypeQuery__OperationAssignment_3 )? ) )
            // InternalSkiql.g:1717:1: ( ( rule__EntityTypeQuery__OperationAssignment_3 )? )
            {
            // InternalSkiql.g:1717:1: ( ( rule__EntityTypeQuery__OperationAssignment_3 )? )
            // InternalSkiql.g:1718:2: ( rule__EntityTypeQuery__OperationAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeQueryAccess().getOperationAssignment_3()); 
            }
            // InternalSkiql.g:1719:2: ( rule__EntityTypeQuery__OperationAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22||LA24_0==31||(LA24_0>=34 && LA24_0<=35)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSkiql.g:1719:3: rule__EntityTypeQuery__OperationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityTypeQuery__OperationAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeQueryAccess().getOperationAssignment_3()); 
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
    // $ANTLR end "rule__EntityTypeQuery__Group__3__Impl"


    // $ANTLR start "rule__RelationshipTypeQuery__Group__0"
    // InternalSkiql.g:1728:1: rule__RelationshipTypeQuery__Group__0 : rule__RelationshipTypeQuery__Group__0__Impl rule__RelationshipTypeQuery__Group__1 ;
    public final void rule__RelationshipTypeQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1732:1: ( rule__RelationshipTypeQuery__Group__0__Impl rule__RelationshipTypeQuery__Group__1 )
            // InternalSkiql.g:1733:2: rule__RelationshipTypeQuery__Group__0__Impl rule__RelationshipTypeQuery__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RelationshipTypeQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipTypeQuery__Group__0"


    // $ANTLR start "rule__RelationshipTypeQuery__Group__0__Impl"
    // InternalSkiql.g:1740:1: rule__RelationshipTypeQuery__Group__0__Impl : ( () ) ;
    public final void rule__RelationshipTypeQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1744:1: ( ( () ) )
            // InternalSkiql.g:1745:1: ( () )
            {
            // InternalSkiql.g:1745:1: ( () )
            // InternalSkiql.g:1746:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeQueryAccess().getSchemaQueryAction_0()); 
            }
            // InternalSkiql.g:1747:2: ()
            // InternalSkiql.g:1747:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeQueryAccess().getSchemaQueryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipTypeQuery__Group__0__Impl"


    // $ANTLR start "rule__RelationshipTypeQuery__Group__1"
    // InternalSkiql.g:1755:1: rule__RelationshipTypeQuery__Group__1 : rule__RelationshipTypeQuery__Group__1__Impl rule__RelationshipTypeQuery__Group__2 ;
    public final void rule__RelationshipTypeQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1759:1: ( rule__RelationshipTypeQuery__Group__1__Impl rule__RelationshipTypeQuery__Group__2 )
            // InternalSkiql.g:1760:2: rule__RelationshipTypeQuery__Group__1__Impl rule__RelationshipTypeQuery__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RelationshipTypeQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipTypeQuery__Group__1"


    // $ANTLR start "rule__RelationshipTypeQuery__Group__1__Impl"
    // InternalSkiql.g:1767:1: rule__RelationshipTypeQuery__Group__1__Impl : ( 'REL' ) ;
    public final void rule__RelationshipTypeQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1771:1: ( ( 'REL' ) )
            // InternalSkiql.g:1772:1: ( 'REL' )
            {
            // InternalSkiql.g:1772:1: ( 'REL' )
            // InternalSkiql.g:1773:2: 'REL'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeQueryAccess().getRELKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeQueryAccess().getRELKeyword_1()); 
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
    // $ANTLR end "rule__RelationshipTypeQuery__Group__1__Impl"


    // $ANTLR start "rule__RelationshipTypeQuery__Group__2"
    // InternalSkiql.g:1782:1: rule__RelationshipTypeQuery__Group__2 : rule__RelationshipTypeQuery__Group__2__Impl rule__RelationshipTypeQuery__Group__3 ;
    public final void rule__RelationshipTypeQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1786:1: ( rule__RelationshipTypeQuery__Group__2__Impl rule__RelationshipTypeQuery__Group__3 )
            // InternalSkiql.g:1787:2: rule__RelationshipTypeQuery__Group__2__Impl rule__RelationshipTypeQuery__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RelationshipTypeQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeQuery__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipTypeQuery__Group__2"


    // $ANTLR start "rule__RelationshipTypeQuery__Group__2__Impl"
    // InternalSkiql.g:1794:1: rule__RelationshipTypeQuery__Group__2__Impl : ( ( rule__RelationshipTypeQuery__SchemaSpecAssignment_2 ) ) ;
    public final void rule__RelationshipTypeQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1798:1: ( ( ( rule__RelationshipTypeQuery__SchemaSpecAssignment_2 ) ) )
            // InternalSkiql.g:1799:1: ( ( rule__RelationshipTypeQuery__SchemaSpecAssignment_2 ) )
            {
            // InternalSkiql.g:1799:1: ( ( rule__RelationshipTypeQuery__SchemaSpecAssignment_2 ) )
            // InternalSkiql.g:1800:2: ( rule__RelationshipTypeQuery__SchemaSpecAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeQueryAccess().getSchemaSpecAssignment_2()); 
            }
            // InternalSkiql.g:1801:2: ( rule__RelationshipTypeQuery__SchemaSpecAssignment_2 )
            // InternalSkiql.g:1801:3: rule__RelationshipTypeQuery__SchemaSpecAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeQuery__SchemaSpecAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeQueryAccess().getSchemaSpecAssignment_2()); 
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
    // $ANTLR end "rule__RelationshipTypeQuery__Group__2__Impl"


    // $ANTLR start "rule__RelationshipTypeQuery__Group__3"
    // InternalSkiql.g:1809:1: rule__RelationshipTypeQuery__Group__3 : rule__RelationshipTypeQuery__Group__3__Impl ;
    public final void rule__RelationshipTypeQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1813:1: ( rule__RelationshipTypeQuery__Group__3__Impl )
            // InternalSkiql.g:1814:2: rule__RelationshipTypeQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipTypeQuery__Group__3"


    // $ANTLR start "rule__RelationshipTypeQuery__Group__3__Impl"
    // InternalSkiql.g:1820:1: rule__RelationshipTypeQuery__Group__3__Impl : ( ( rule__RelationshipTypeQuery__OperationAssignment_3 )? ) ;
    public final void rule__RelationshipTypeQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1824:1: ( ( ( rule__RelationshipTypeQuery__OperationAssignment_3 )? ) )
            // InternalSkiql.g:1825:1: ( ( rule__RelationshipTypeQuery__OperationAssignment_3 )? )
            {
            // InternalSkiql.g:1825:1: ( ( rule__RelationshipTypeQuery__OperationAssignment_3 )? )
            // InternalSkiql.g:1826:2: ( rule__RelationshipTypeQuery__OperationAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeQueryAccess().getOperationAssignment_3()); 
            }
            // InternalSkiql.g:1827:2: ( rule__RelationshipTypeQuery__OperationAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22||LA25_0==31||(LA25_0>=34 && LA25_0<=35)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSkiql.g:1827:3: rule__RelationshipTypeQuery__OperationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipTypeQuery__OperationAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeQueryAccess().getOperationAssignment_3()); 
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
    // $ANTLR end "rule__RelationshipTypeQuery__Group__3__Impl"


    // $ANTLR start "rule__AnyQuery__Group__0"
    // InternalSkiql.g:1836:1: rule__AnyQuery__Group__0 : rule__AnyQuery__Group__0__Impl rule__AnyQuery__Group__1 ;
    public final void rule__AnyQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1840:1: ( rule__AnyQuery__Group__0__Impl rule__AnyQuery__Group__1 )
            // InternalSkiql.g:1841:2: rule__AnyQuery__Group__0__Impl rule__AnyQuery__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AnyQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnyQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnyQuery__Group__0"


    // $ANTLR start "rule__AnyQuery__Group__0__Impl"
    // InternalSkiql.g:1848:1: rule__AnyQuery__Group__0__Impl : ( () ) ;
    public final void rule__AnyQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1852:1: ( ( () ) )
            // InternalSkiql.g:1853:1: ( () )
            {
            // InternalSkiql.g:1853:1: ( () )
            // InternalSkiql.g:1854:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyQueryAccess().getSchemaQueryAction_0()); 
            }
            // InternalSkiql.g:1855:2: ()
            // InternalSkiql.g:1855:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyQueryAccess().getSchemaQueryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyQuery__Group__0__Impl"


    // $ANTLR start "rule__AnyQuery__Group__1"
    // InternalSkiql.g:1863:1: rule__AnyQuery__Group__1 : rule__AnyQuery__Group__1__Impl rule__AnyQuery__Group__2 ;
    public final void rule__AnyQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1867:1: ( rule__AnyQuery__Group__1__Impl rule__AnyQuery__Group__2 )
            // InternalSkiql.g:1868:2: rule__AnyQuery__Group__1__Impl rule__AnyQuery__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AnyQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnyQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnyQuery__Group__1"


    // $ANTLR start "rule__AnyQuery__Group__1__Impl"
    // InternalSkiql.g:1875:1: rule__AnyQuery__Group__1__Impl : ( 'ANY' ) ;
    public final void rule__AnyQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1879:1: ( ( 'ANY' ) )
            // InternalSkiql.g:1880:1: ( 'ANY' )
            {
            // InternalSkiql.g:1880:1: ( 'ANY' )
            // InternalSkiql.g:1881:2: 'ANY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyQueryAccess().getANYKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyQueryAccess().getANYKeyword_1()); 
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
    // $ANTLR end "rule__AnyQuery__Group__1__Impl"


    // $ANTLR start "rule__AnyQuery__Group__2"
    // InternalSkiql.g:1890:1: rule__AnyQuery__Group__2 : rule__AnyQuery__Group__2__Impl rule__AnyQuery__Group__3 ;
    public final void rule__AnyQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1894:1: ( rule__AnyQuery__Group__2__Impl rule__AnyQuery__Group__3 )
            // InternalSkiql.g:1895:2: rule__AnyQuery__Group__2__Impl rule__AnyQuery__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AnyQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnyQuery__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnyQuery__Group__2"


    // $ANTLR start "rule__AnyQuery__Group__2__Impl"
    // InternalSkiql.g:1902:1: rule__AnyQuery__Group__2__Impl : ( ( rule__AnyQuery__SchemaSpecAssignment_2 ) ) ;
    public final void rule__AnyQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1906:1: ( ( ( rule__AnyQuery__SchemaSpecAssignment_2 ) ) )
            // InternalSkiql.g:1907:1: ( ( rule__AnyQuery__SchemaSpecAssignment_2 ) )
            {
            // InternalSkiql.g:1907:1: ( ( rule__AnyQuery__SchemaSpecAssignment_2 ) )
            // InternalSkiql.g:1908:2: ( rule__AnyQuery__SchemaSpecAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyQueryAccess().getSchemaSpecAssignment_2()); 
            }
            // InternalSkiql.g:1909:2: ( rule__AnyQuery__SchemaSpecAssignment_2 )
            // InternalSkiql.g:1909:3: rule__AnyQuery__SchemaSpecAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AnyQuery__SchemaSpecAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyQueryAccess().getSchemaSpecAssignment_2()); 
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
    // $ANTLR end "rule__AnyQuery__Group__2__Impl"


    // $ANTLR start "rule__AnyQuery__Group__3"
    // InternalSkiql.g:1917:1: rule__AnyQuery__Group__3 : rule__AnyQuery__Group__3__Impl ;
    public final void rule__AnyQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1921:1: ( rule__AnyQuery__Group__3__Impl )
            // InternalSkiql.g:1922:2: rule__AnyQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnyQuery__Group__3"


    // $ANTLR start "rule__AnyQuery__Group__3__Impl"
    // InternalSkiql.g:1928:1: rule__AnyQuery__Group__3__Impl : ( ( rule__AnyQuery__OperationAssignment_3 )? ) ;
    public final void rule__AnyQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1932:1: ( ( ( rule__AnyQuery__OperationAssignment_3 )? ) )
            // InternalSkiql.g:1933:1: ( ( rule__AnyQuery__OperationAssignment_3 )? )
            {
            // InternalSkiql.g:1933:1: ( ( rule__AnyQuery__OperationAssignment_3 )? )
            // InternalSkiql.g:1934:2: ( rule__AnyQuery__OperationAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyQueryAccess().getOperationAssignment_3()); 
            }
            // InternalSkiql.g:1935:2: ( rule__AnyQuery__OperationAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22||LA26_0==31||(LA26_0>=34 && LA26_0<=35)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSkiql.g:1935:3: rule__AnyQuery__OperationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyQuery__OperationAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyQueryAccess().getOperationAssignment_3()); 
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
    // $ANTLR end "rule__AnyQuery__Group__3__Impl"


    // $ANTLR start "rule__KeysSpec__Group__0"
    // InternalSkiql.g:1944:1: rule__KeysSpec__Group__0 : rule__KeysSpec__Group__0__Impl rule__KeysSpec__Group__1 ;
    public final void rule__KeysSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1948:1: ( rule__KeysSpec__Group__0__Impl rule__KeysSpec__Group__1 )
            // InternalSkiql.g:1949:2: rule__KeysSpec__Group__0__Impl rule__KeysSpec__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__KeysSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeysSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__KeysSpec__Group__0"


    // $ANTLR start "rule__KeysSpec__Group__0__Impl"
    // InternalSkiql.g:1956:1: rule__KeysSpec__Group__0__Impl : ( () ) ;
    public final void rule__KeysSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1960:1: ( ( () ) )
            // InternalSkiql.g:1961:1: ( () )
            {
            // InternalSkiql.g:1961:1: ( () )
            // InternalSkiql.g:1962:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeysSpecAccess().getKeysSpecAction_0()); 
            }
            // InternalSkiql.g:1963:2: ()
            // InternalSkiql.g:1963:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeysSpecAccess().getKeysSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeysSpec__Group__0__Impl"


    // $ANTLR start "rule__KeysSpec__Group__1"
    // InternalSkiql.g:1971:1: rule__KeysSpec__Group__1 : rule__KeysSpec__Group__1__Impl ;
    public final void rule__KeysSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1975:1: ( rule__KeysSpec__Group__1__Impl )
            // InternalSkiql.g:1976:2: rule__KeysSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeysSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__KeysSpec__Group__1"


    // $ANTLR start "rule__KeysSpec__Group__1__Impl"
    // InternalSkiql.g:1982:1: rule__KeysSpec__Group__1__Impl : ( 'KEYS' ) ;
    public final void rule__KeysSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:1986:1: ( ( 'KEYS' ) )
            // InternalSkiql.g:1987:1: ( 'KEYS' )
            {
            // InternalSkiql.g:1987:1: ( 'KEYS' )
            // InternalSkiql.g:1988:2: 'KEYS'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeysSpecAccess().getKEYSKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeysSpecAccess().getKEYSKeyword_1()); 
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
    // $ANTLR end "rule__KeysSpec__Group__1__Impl"


    // $ANTLR start "rule__RelationshipTypeSpec__Group__0"
    // InternalSkiql.g:1998:1: rule__RelationshipTypeSpec__Group__0 : rule__RelationshipTypeSpec__Group__0__Impl rule__RelationshipTypeSpec__Group__1 ;
    public final void rule__RelationshipTypeSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2002:1: ( rule__RelationshipTypeSpec__Group__0__Impl rule__RelationshipTypeSpec__Group__1 )
            // InternalSkiql.g:2003:2: rule__RelationshipTypeSpec__Group__0__Impl rule__RelationshipTypeSpec__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RelationshipTypeSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipTypeSpec__Group__0"


    // $ANTLR start "rule__RelationshipTypeSpec__Group__0__Impl"
    // InternalSkiql.g:2010:1: rule__RelationshipTypeSpec__Group__0__Impl : ( () ) ;
    public final void rule__RelationshipTypeSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2014:1: ( ( () ) )
            // InternalSkiql.g:2015:1: ( () )
            {
            // InternalSkiql.g:2015:1: ( () )
            // InternalSkiql.g:2016:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeSpecAccess().getRelationshipTypeSpecAction_0()); 
            }
            // InternalSkiql.g:2017:2: ()
            // InternalSkiql.g:2017:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeSpecAccess().getRelationshipTypeSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipTypeSpec__Group__0__Impl"


    // $ANTLR start "rule__RelationshipTypeSpec__Group__1"
    // InternalSkiql.g:2025:1: rule__RelationshipTypeSpec__Group__1 : rule__RelationshipTypeSpec__Group__1__Impl rule__RelationshipTypeSpec__Group__2 ;
    public final void rule__RelationshipTypeSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2029:1: ( rule__RelationshipTypeSpec__Group__1__Impl rule__RelationshipTypeSpec__Group__2 )
            // InternalSkiql.g:2030:2: rule__RelationshipTypeSpec__Group__1__Impl rule__RelationshipTypeSpec__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__RelationshipTypeSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipTypeSpec__Group__1"


    // $ANTLR start "rule__RelationshipTypeSpec__Group__1__Impl"
    // InternalSkiql.g:2037:1: rule__RelationshipTypeSpec__Group__1__Impl : ( ( rule__RelationshipTypeSpec__NameAssignment_1 ) ) ;
    public final void rule__RelationshipTypeSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2041:1: ( ( ( rule__RelationshipTypeSpec__NameAssignment_1 ) ) )
            // InternalSkiql.g:2042:1: ( ( rule__RelationshipTypeSpec__NameAssignment_1 ) )
            {
            // InternalSkiql.g:2042:1: ( ( rule__RelationshipTypeSpec__NameAssignment_1 ) )
            // InternalSkiql.g:2043:2: ( rule__RelationshipTypeSpec__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeSpecAccess().getNameAssignment_1()); 
            }
            // InternalSkiql.g:2044:2: ( rule__RelationshipTypeSpec__NameAssignment_1 )
            // InternalSkiql.g:2044:3: rule__RelationshipTypeSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeSpec__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeSpecAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__RelationshipTypeSpec__Group__1__Impl"


    // $ANTLR start "rule__RelationshipTypeSpec__Group__2"
    // InternalSkiql.g:2052:1: rule__RelationshipTypeSpec__Group__2 : rule__RelationshipTypeSpec__Group__2__Impl ;
    public final void rule__RelationshipTypeSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2056:1: ( rule__RelationshipTypeSpec__Group__2__Impl )
            // InternalSkiql.g:2057:2: rule__RelationshipTypeSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipTypeSpec__Group__2"


    // $ANTLR start "rule__RelationshipTypeSpec__Group__2__Impl"
    // InternalSkiql.g:2063:1: rule__RelationshipTypeSpec__Group__2__Impl : ( ( rule__RelationshipTypeSpec__VariationFilterAssignment_2 )? ) ;
    public final void rule__RelationshipTypeSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2067:1: ( ( ( rule__RelationshipTypeSpec__VariationFilterAssignment_2 )? ) )
            // InternalSkiql.g:2068:1: ( ( rule__RelationshipTypeSpec__VariationFilterAssignment_2 )? )
            {
            // InternalSkiql.g:2068:1: ( ( rule__RelationshipTypeSpec__VariationFilterAssignment_2 )? )
            // InternalSkiql.g:2069:2: ( rule__RelationshipTypeSpec__VariationFilterAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeSpecAccess().getVariationFilterAssignment_2()); 
            }
            // InternalSkiql.g:2070:2: ( rule__RelationshipTypeSpec__VariationFilterAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13||LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSkiql.g:2070:3: rule__RelationshipTypeSpec__VariationFilterAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipTypeSpec__VariationFilterAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeSpecAccess().getVariationFilterAssignment_2()); 
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
    // $ANTLR end "rule__RelationshipTypeSpec__Group__2__Impl"


    // $ANTLR start "rule__SchemaTypeSpec__Group__0"
    // InternalSkiql.g:2079:1: rule__SchemaTypeSpec__Group__0 : rule__SchemaTypeSpec__Group__0__Impl rule__SchemaTypeSpec__Group__1 ;
    public final void rule__SchemaTypeSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2083:1: ( rule__SchemaTypeSpec__Group__0__Impl rule__SchemaTypeSpec__Group__1 )
            // InternalSkiql.g:2084:2: rule__SchemaTypeSpec__Group__0__Impl rule__SchemaTypeSpec__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SchemaTypeSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SchemaTypeSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SchemaTypeSpec__Group__0"


    // $ANTLR start "rule__SchemaTypeSpec__Group__0__Impl"
    // InternalSkiql.g:2091:1: rule__SchemaTypeSpec__Group__0__Impl : ( () ) ;
    public final void rule__SchemaTypeSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2095:1: ( ( () ) )
            // InternalSkiql.g:2096:1: ( () )
            {
            // InternalSkiql.g:2096:1: ( () )
            // InternalSkiql.g:2097:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaTypeSpecAccess().getSchemaSpecAction_0()); 
            }
            // InternalSkiql.g:2098:2: ()
            // InternalSkiql.g:2098:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaTypeSpecAccess().getSchemaSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaTypeSpec__Group__0__Impl"


    // $ANTLR start "rule__SchemaTypeSpec__Group__1"
    // InternalSkiql.g:2106:1: rule__SchemaTypeSpec__Group__1 : rule__SchemaTypeSpec__Group__1__Impl rule__SchemaTypeSpec__Group__2 ;
    public final void rule__SchemaTypeSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2110:1: ( rule__SchemaTypeSpec__Group__1__Impl rule__SchemaTypeSpec__Group__2 )
            // InternalSkiql.g:2111:2: rule__SchemaTypeSpec__Group__1__Impl rule__SchemaTypeSpec__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SchemaTypeSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SchemaTypeSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SchemaTypeSpec__Group__1"


    // $ANTLR start "rule__SchemaTypeSpec__Group__1__Impl"
    // InternalSkiql.g:2118:1: rule__SchemaTypeSpec__Group__1__Impl : ( ( rule__SchemaTypeSpec__NameAssignment_1 ) ) ;
    public final void rule__SchemaTypeSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2122:1: ( ( ( rule__SchemaTypeSpec__NameAssignment_1 ) ) )
            // InternalSkiql.g:2123:1: ( ( rule__SchemaTypeSpec__NameAssignment_1 ) )
            {
            // InternalSkiql.g:2123:1: ( ( rule__SchemaTypeSpec__NameAssignment_1 ) )
            // InternalSkiql.g:2124:2: ( rule__SchemaTypeSpec__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaTypeSpecAccess().getNameAssignment_1()); 
            }
            // InternalSkiql.g:2125:2: ( rule__SchemaTypeSpec__NameAssignment_1 )
            // InternalSkiql.g:2125:3: rule__SchemaTypeSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SchemaTypeSpec__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaTypeSpecAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__SchemaTypeSpec__Group__1__Impl"


    // $ANTLR start "rule__SchemaTypeSpec__Group__2"
    // InternalSkiql.g:2133:1: rule__SchemaTypeSpec__Group__2 : rule__SchemaTypeSpec__Group__2__Impl ;
    public final void rule__SchemaTypeSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2137:1: ( rule__SchemaTypeSpec__Group__2__Impl )
            // InternalSkiql.g:2138:2: rule__SchemaTypeSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchemaTypeSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SchemaTypeSpec__Group__2"


    // $ANTLR start "rule__SchemaTypeSpec__Group__2__Impl"
    // InternalSkiql.g:2144:1: rule__SchemaTypeSpec__Group__2__Impl : ( ( rule__SchemaTypeSpec__VariationFilterAssignment_2 )? ) ;
    public final void rule__SchemaTypeSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2148:1: ( ( ( rule__SchemaTypeSpec__VariationFilterAssignment_2 )? ) )
            // InternalSkiql.g:2149:1: ( ( rule__SchemaTypeSpec__VariationFilterAssignment_2 )? )
            {
            // InternalSkiql.g:2149:1: ( ( rule__SchemaTypeSpec__VariationFilterAssignment_2 )? )
            // InternalSkiql.g:2150:2: ( rule__SchemaTypeSpec__VariationFilterAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaTypeSpecAccess().getVariationFilterAssignment_2()); 
            }
            // InternalSkiql.g:2151:2: ( rule__SchemaTypeSpec__VariationFilterAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13||LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSkiql.g:2151:3: rule__SchemaTypeSpec__VariationFilterAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SchemaTypeSpec__VariationFilterAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaTypeSpecAccess().getVariationFilterAssignment_2()); 
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
    // $ANTLR end "rule__SchemaTypeSpec__Group__2__Impl"


    // $ANTLR start "rule__EntitySpec__Group__0"
    // InternalSkiql.g:2160:1: rule__EntitySpec__Group__0 : rule__EntitySpec__Group__0__Impl rule__EntitySpec__Group__1 ;
    public final void rule__EntitySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2164:1: ( rule__EntitySpec__Group__0__Impl rule__EntitySpec__Group__1 )
            // InternalSkiql.g:2165:2: rule__EntitySpec__Group__0__Impl rule__EntitySpec__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EntitySpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntitySpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntitySpec__Group__0"


    // $ANTLR start "rule__EntitySpec__Group__0__Impl"
    // InternalSkiql.g:2172:1: rule__EntitySpec__Group__0__Impl : ( () ) ;
    public final void rule__EntitySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2176:1: ( ( () ) )
            // InternalSkiql.g:2177:1: ( () )
            {
            // InternalSkiql.g:2177:1: ( () )
            // InternalSkiql.g:2178:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntitySpecAccess().getEntitySpecAction_0()); 
            }
            // InternalSkiql.g:2179:2: ()
            // InternalSkiql.g:2179:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntitySpecAccess().getEntitySpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntitySpec__Group__0__Impl"


    // $ANTLR start "rule__EntitySpec__Group__1"
    // InternalSkiql.g:2187:1: rule__EntitySpec__Group__1 : rule__EntitySpec__Group__1__Impl rule__EntitySpec__Group__2 ;
    public final void rule__EntitySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2191:1: ( rule__EntitySpec__Group__1__Impl rule__EntitySpec__Group__2 )
            // InternalSkiql.g:2192:2: rule__EntitySpec__Group__1__Impl rule__EntitySpec__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EntitySpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntitySpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntitySpec__Group__1"


    // $ANTLR start "rule__EntitySpec__Group__1__Impl"
    // InternalSkiql.g:2199:1: rule__EntitySpec__Group__1__Impl : ( ( rule__EntitySpec__NameAssignment_1 ) ) ;
    public final void rule__EntitySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2203:1: ( ( ( rule__EntitySpec__NameAssignment_1 ) ) )
            // InternalSkiql.g:2204:1: ( ( rule__EntitySpec__NameAssignment_1 ) )
            {
            // InternalSkiql.g:2204:1: ( ( rule__EntitySpec__NameAssignment_1 ) )
            // InternalSkiql.g:2205:2: ( rule__EntitySpec__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntitySpecAccess().getNameAssignment_1()); 
            }
            // InternalSkiql.g:2206:2: ( rule__EntitySpec__NameAssignment_1 )
            // InternalSkiql.g:2206:3: rule__EntitySpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntitySpec__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntitySpecAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__EntitySpec__Group__1__Impl"


    // $ANTLR start "rule__EntitySpec__Group__2"
    // InternalSkiql.g:2214:1: rule__EntitySpec__Group__2 : rule__EntitySpec__Group__2__Impl ;
    public final void rule__EntitySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2218:1: ( rule__EntitySpec__Group__2__Impl )
            // InternalSkiql.g:2219:2: rule__EntitySpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntitySpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntitySpec__Group__2"


    // $ANTLR start "rule__EntitySpec__Group__2__Impl"
    // InternalSkiql.g:2225:1: rule__EntitySpec__Group__2__Impl : ( ( rule__EntitySpec__VariationFilterAssignment_2 )? ) ;
    public final void rule__EntitySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2229:1: ( ( ( rule__EntitySpec__VariationFilterAssignment_2 )? ) )
            // InternalSkiql.g:2230:1: ( ( rule__EntitySpec__VariationFilterAssignment_2 )? )
            {
            // InternalSkiql.g:2230:1: ( ( rule__EntitySpec__VariationFilterAssignment_2 )? )
            // InternalSkiql.g:2231:2: ( rule__EntitySpec__VariationFilterAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntitySpecAccess().getVariationFilterAssignment_2()); 
            }
            // InternalSkiql.g:2232:2: ( rule__EntitySpec__VariationFilterAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13||LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSkiql.g:2232:3: rule__EntitySpec__VariationFilterAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntitySpec__VariationFilterAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntitySpecAccess().getVariationFilterAssignment_2()); 
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
    // $ANTLR end "rule__EntitySpec__Group__2__Impl"


    // $ANTLR start "rule__ReferenceEntitySpec__Group__0"
    // InternalSkiql.g:2241:1: rule__ReferenceEntitySpec__Group__0 : rule__ReferenceEntitySpec__Group__0__Impl rule__ReferenceEntitySpec__Group__1 ;
    public final void rule__ReferenceEntitySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2245:1: ( rule__ReferenceEntitySpec__Group__0__Impl rule__ReferenceEntitySpec__Group__1 )
            // InternalSkiql.g:2246:2: rule__ReferenceEntitySpec__Group__0__Impl rule__ReferenceEntitySpec__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ReferenceEntitySpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceEntitySpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceEntitySpec__Group__0"


    // $ANTLR start "rule__ReferenceEntitySpec__Group__0__Impl"
    // InternalSkiql.g:2253:1: rule__ReferenceEntitySpec__Group__0__Impl : ( () ) ;
    public final void rule__ReferenceEntitySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2257:1: ( ( () ) )
            // InternalSkiql.g:2258:1: ( () )
            {
            // InternalSkiql.g:2258:1: ( () )
            // InternalSkiql.g:2259:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceEntitySpecAccess().getEntitySpecAction_0()); 
            }
            // InternalSkiql.g:2260:2: ()
            // InternalSkiql.g:2260:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceEntitySpecAccess().getEntitySpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceEntitySpec__Group__0__Impl"


    // $ANTLR start "rule__ReferenceEntitySpec__Group__1"
    // InternalSkiql.g:2268:1: rule__ReferenceEntitySpec__Group__1 : rule__ReferenceEntitySpec__Group__1__Impl rule__ReferenceEntitySpec__Group__2 ;
    public final void rule__ReferenceEntitySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2272:1: ( rule__ReferenceEntitySpec__Group__1__Impl rule__ReferenceEntitySpec__Group__2 )
            // InternalSkiql.g:2273:2: rule__ReferenceEntitySpec__Group__1__Impl rule__ReferenceEntitySpec__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ReferenceEntitySpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceEntitySpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceEntitySpec__Group__1"


    // $ANTLR start "rule__ReferenceEntitySpec__Group__1__Impl"
    // InternalSkiql.g:2280:1: rule__ReferenceEntitySpec__Group__1__Impl : ( ( rule__ReferenceEntitySpec__NameAssignment_1 ) ) ;
    public final void rule__ReferenceEntitySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2284:1: ( ( ( rule__ReferenceEntitySpec__NameAssignment_1 ) ) )
            // InternalSkiql.g:2285:1: ( ( rule__ReferenceEntitySpec__NameAssignment_1 ) )
            {
            // InternalSkiql.g:2285:1: ( ( rule__ReferenceEntitySpec__NameAssignment_1 ) )
            // InternalSkiql.g:2286:2: ( rule__ReferenceEntitySpec__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceEntitySpecAccess().getNameAssignment_1()); 
            }
            // InternalSkiql.g:2287:2: ( rule__ReferenceEntitySpec__NameAssignment_1 )
            // InternalSkiql.g:2287:3: rule__ReferenceEntitySpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceEntitySpec__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceEntitySpecAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ReferenceEntitySpec__Group__1__Impl"


    // $ANTLR start "rule__ReferenceEntitySpec__Group__2"
    // InternalSkiql.g:2295:1: rule__ReferenceEntitySpec__Group__2 : rule__ReferenceEntitySpec__Group__2__Impl ;
    public final void rule__ReferenceEntitySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2299:1: ( rule__ReferenceEntitySpec__Group__2__Impl )
            // InternalSkiql.g:2300:2: rule__ReferenceEntitySpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceEntitySpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceEntitySpec__Group__2"


    // $ANTLR start "rule__ReferenceEntitySpec__Group__2__Impl"
    // InternalSkiql.g:2306:1: rule__ReferenceEntitySpec__Group__2__Impl : ( ( rule__ReferenceEntitySpec__VariationFilterAssignment_2 )? ) ;
    public final void rule__ReferenceEntitySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2310:1: ( ( ( rule__ReferenceEntitySpec__VariationFilterAssignment_2 )? ) )
            // InternalSkiql.g:2311:1: ( ( rule__ReferenceEntitySpec__VariationFilterAssignment_2 )? )
            {
            // InternalSkiql.g:2311:1: ( ( rule__ReferenceEntitySpec__VariationFilterAssignment_2 )? )
            // InternalSkiql.g:2312:2: ( rule__ReferenceEntitySpec__VariationFilterAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceEntitySpecAccess().getVariationFilterAssignment_2()); 
            }
            // InternalSkiql.g:2313:2: ( rule__ReferenceEntitySpec__VariationFilterAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13||LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSkiql.g:2313:3: rule__ReferenceEntitySpec__VariationFilterAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceEntitySpec__VariationFilterAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceEntitySpecAccess().getVariationFilterAssignment_2()); 
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
    // $ANTLR end "rule__ReferenceEntitySpec__Group__2__Impl"


    // $ANTLR start "rule__RelationshipQuery__Group__0"
    // InternalSkiql.g:2322:1: rule__RelationshipQuery__Group__0 : rule__RelationshipQuery__Group__0__Impl rule__RelationshipQuery__Group__1 ;
    public final void rule__RelationshipQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2326:1: ( rule__RelationshipQuery__Group__0__Impl rule__RelationshipQuery__Group__1 )
            // InternalSkiql.g:2327:2: rule__RelationshipQuery__Group__0__Impl rule__RelationshipQuery__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RelationshipQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipQuery__Group__0"


    // $ANTLR start "rule__RelationshipQuery__Group__0__Impl"
    // InternalSkiql.g:2334:1: rule__RelationshipQuery__Group__0__Impl : ( () ) ;
    public final void rule__RelationshipQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2338:1: ( ( () ) )
            // InternalSkiql.g:2339:1: ( () )
            {
            // InternalSkiql.g:2339:1: ( () )
            // InternalSkiql.g:2340:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getRelationshipQueryAction_0()); 
            }
            // InternalSkiql.g:2341:2: ()
            // InternalSkiql.g:2341:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getRelationshipQueryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipQuery__Group__0__Impl"


    // $ANTLR start "rule__RelationshipQuery__Group__1"
    // InternalSkiql.g:2349:1: rule__RelationshipQuery__Group__1 : rule__RelationshipQuery__Group__1__Impl rule__RelationshipQuery__Group__2 ;
    public final void rule__RelationshipQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2353:1: ( rule__RelationshipQuery__Group__1__Impl rule__RelationshipQuery__Group__2 )
            // InternalSkiql.g:2354:2: rule__RelationshipQuery__Group__1__Impl rule__RelationshipQuery__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__RelationshipQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipQuery__Group__1"


    // $ANTLR start "rule__RelationshipQuery__Group__1__Impl"
    // InternalSkiql.g:2361:1: rule__RelationshipQuery__Group__1__Impl : ( 'FROM' ) ;
    public final void rule__RelationshipQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2365:1: ( ( 'FROM' ) )
            // InternalSkiql.g:2366:1: ( 'FROM' )
            {
            // InternalSkiql.g:2366:1: ( 'FROM' )
            // InternalSkiql.g:2367:2: 'FROM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getFROMKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getFROMKeyword_1()); 
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
    // $ANTLR end "rule__RelationshipQuery__Group__1__Impl"


    // $ANTLR start "rule__RelationshipQuery__Group__2"
    // InternalSkiql.g:2376:1: rule__RelationshipQuery__Group__2 : rule__RelationshipQuery__Group__2__Impl rule__RelationshipQuery__Group__3 ;
    public final void rule__RelationshipQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2380:1: ( rule__RelationshipQuery__Group__2__Impl rule__RelationshipQuery__Group__3 )
            // InternalSkiql.g:2381:2: rule__RelationshipQuery__Group__2__Impl rule__RelationshipQuery__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RelationshipQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipQuery__Group__2"


    // $ANTLR start "rule__RelationshipQuery__Group__2__Impl"
    // InternalSkiql.g:2388:1: rule__RelationshipQuery__Group__2__Impl : ( ( rule__RelationshipQuery__FromAssignment_2 ) ) ;
    public final void rule__RelationshipQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2392:1: ( ( ( rule__RelationshipQuery__FromAssignment_2 ) ) )
            // InternalSkiql.g:2393:1: ( ( rule__RelationshipQuery__FromAssignment_2 ) )
            {
            // InternalSkiql.g:2393:1: ( ( rule__RelationshipQuery__FromAssignment_2 ) )
            // InternalSkiql.g:2394:2: ( rule__RelationshipQuery__FromAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getFromAssignment_2()); 
            }
            // InternalSkiql.g:2395:2: ( rule__RelationshipQuery__FromAssignment_2 )
            // InternalSkiql.g:2395:3: rule__RelationshipQuery__FromAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__FromAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getFromAssignment_2()); 
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
    // $ANTLR end "rule__RelationshipQuery__Group__2__Impl"


    // $ANTLR start "rule__RelationshipQuery__Group__3"
    // InternalSkiql.g:2403:1: rule__RelationshipQuery__Group__3 : rule__RelationshipQuery__Group__3__Impl rule__RelationshipQuery__Group__4 ;
    public final void rule__RelationshipQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2407:1: ( rule__RelationshipQuery__Group__3__Impl rule__RelationshipQuery__Group__4 )
            // InternalSkiql.g:2408:2: rule__RelationshipQuery__Group__3__Impl rule__RelationshipQuery__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RelationshipQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipQuery__Group__3"


    // $ANTLR start "rule__RelationshipQuery__Group__3__Impl"
    // InternalSkiql.g:2415:1: rule__RelationshipQuery__Group__3__Impl : ( 'TO' ) ;
    public final void rule__RelationshipQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2419:1: ( ( 'TO' ) )
            // InternalSkiql.g:2420:1: ( 'TO' )
            {
            // InternalSkiql.g:2420:1: ( 'TO' )
            // InternalSkiql.g:2421:2: 'TO'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getTOKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getTOKeyword_3()); 
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
    // $ANTLR end "rule__RelationshipQuery__Group__3__Impl"


    // $ANTLR start "rule__RelationshipQuery__Group__4"
    // InternalSkiql.g:2430:1: rule__RelationshipQuery__Group__4 : rule__RelationshipQuery__Group__4__Impl rule__RelationshipQuery__Group__5 ;
    public final void rule__RelationshipQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2434:1: ( rule__RelationshipQuery__Group__4__Impl rule__RelationshipQuery__Group__5 )
            // InternalSkiql.g:2435:2: rule__RelationshipQuery__Group__4__Impl rule__RelationshipQuery__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__RelationshipQuery__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipQuery__Group__4"


    // $ANTLR start "rule__RelationshipQuery__Group__4__Impl"
    // InternalSkiql.g:2442:1: rule__RelationshipQuery__Group__4__Impl : ( ( rule__RelationshipQuery__Alternatives_4 ) ) ;
    public final void rule__RelationshipQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2446:1: ( ( ( rule__RelationshipQuery__Alternatives_4 ) ) )
            // InternalSkiql.g:2447:1: ( ( rule__RelationshipQuery__Alternatives_4 ) )
            {
            // InternalSkiql.g:2447:1: ( ( rule__RelationshipQuery__Alternatives_4 ) )
            // InternalSkiql.g:2448:2: ( rule__RelationshipQuery__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getAlternatives_4()); 
            }
            // InternalSkiql.g:2449:2: ( rule__RelationshipQuery__Alternatives_4 )
            // InternalSkiql.g:2449:3: rule__RelationshipQuery__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getAlternatives_4()); 
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
    // $ANTLR end "rule__RelationshipQuery__Group__4__Impl"


    // $ANTLR start "rule__RelationshipQuery__Group__5"
    // InternalSkiql.g:2457:1: rule__RelationshipQuery__Group__5 : rule__RelationshipQuery__Group__5__Impl ;
    public final void rule__RelationshipQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2461:1: ( rule__RelationshipQuery__Group__5__Impl )
            // InternalSkiql.g:2462:2: rule__RelationshipQuery__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipQuery__Group__5"


    // $ANTLR start "rule__RelationshipQuery__Group__5__Impl"
    // InternalSkiql.g:2468:1: rule__RelationshipQuery__Group__5__Impl : ( ( rule__RelationshipQuery__Group_5__0 )* ) ;
    public final void rule__RelationshipQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2472:1: ( ( ( rule__RelationshipQuery__Group_5__0 )* ) )
            // InternalSkiql.g:2473:1: ( ( rule__RelationshipQuery__Group_5__0 )* )
            {
            // InternalSkiql.g:2473:1: ( ( rule__RelationshipQuery__Group_5__0 )* )
            // InternalSkiql.g:2474:2: ( rule__RelationshipQuery__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getGroup_5()); 
            }
            // InternalSkiql.g:2475:2: ( rule__RelationshipQuery__Group_5__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==25) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSkiql.g:2475:3: rule__RelationshipQuery__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RelationshipQuery__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getGroup_5()); 
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
    // $ANTLR end "rule__RelationshipQuery__Group__5__Impl"


    // $ANTLR start "rule__RelationshipQuery__Group_5__0"
    // InternalSkiql.g:2484:1: rule__RelationshipQuery__Group_5__0 : rule__RelationshipQuery__Group_5__0__Impl rule__RelationshipQuery__Group_5__1 ;
    public final void rule__RelationshipQuery__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2488:1: ( rule__RelationshipQuery__Group_5__0__Impl rule__RelationshipQuery__Group_5__1 )
            // InternalSkiql.g:2489:2: rule__RelationshipQuery__Group_5__0__Impl rule__RelationshipQuery__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__RelationshipQuery__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipQuery__Group_5__0"


    // $ANTLR start "rule__RelationshipQuery__Group_5__0__Impl"
    // InternalSkiql.g:2496:1: rule__RelationshipQuery__Group_5__0__Impl : ( ( ',' ) ) ;
    public final void rule__RelationshipQuery__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2500:1: ( ( ( ',' ) ) )
            // InternalSkiql.g:2501:1: ( ( ',' ) )
            {
            // InternalSkiql.g:2501:1: ( ( ',' ) )
            // InternalSkiql.g:2502:2: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getCommaKeyword_5_0()); 
            }
            // InternalSkiql.g:2503:2: ( ',' )
            // InternalSkiql.g:2503:3: ','
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getCommaKeyword_5_0()); 
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
    // $ANTLR end "rule__RelationshipQuery__Group_5__0__Impl"


    // $ANTLR start "rule__RelationshipQuery__Group_5__1"
    // InternalSkiql.g:2511:1: rule__RelationshipQuery__Group_5__1 : rule__RelationshipQuery__Group_5__1__Impl ;
    public final void rule__RelationshipQuery__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2515:1: ( rule__RelationshipQuery__Group_5__1__Impl )
            // InternalSkiql.g:2516:2: rule__RelationshipQuery__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipQuery__Group_5__1"


    // $ANTLR start "rule__RelationshipQuery__Group_5__1__Impl"
    // InternalSkiql.g:2522:1: rule__RelationshipQuery__Group_5__1__Impl : ( ( rule__RelationshipQuery__Alternatives_5_1 ) ) ;
    public final void rule__RelationshipQuery__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2526:1: ( ( ( rule__RelationshipQuery__Alternatives_5_1 ) ) )
            // InternalSkiql.g:2527:1: ( ( rule__RelationshipQuery__Alternatives_5_1 ) )
            {
            // InternalSkiql.g:2527:1: ( ( rule__RelationshipQuery__Alternatives_5_1 ) )
            // InternalSkiql.g:2528:2: ( rule__RelationshipQuery__Alternatives_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getAlternatives_5_1()); 
            }
            // InternalSkiql.g:2529:2: ( rule__RelationshipQuery__Alternatives_5_1 )
            // InternalSkiql.g:2529:3: rule__RelationshipQuery__Alternatives_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipQuery__Alternatives_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getAlternatives_5_1()); 
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
    // $ANTLR end "rule__RelationshipQuery__Group_5__1__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__0"
    // InternalSkiql.g:2538:1: rule__NestedRelationshipQuery__Group__0 : rule__NestedRelationshipQuery__Group__0__Impl rule__NestedRelationshipQuery__Group__1 ;
    public final void rule__NestedRelationshipQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2542:1: ( rule__NestedRelationshipQuery__Group__0__Impl rule__NestedRelationshipQuery__Group__1 )
            // InternalSkiql.g:2543:2: rule__NestedRelationshipQuery__Group__0__Impl rule__NestedRelationshipQuery__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__NestedRelationshipQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__0"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__0__Impl"
    // InternalSkiql.g:2550:1: rule__NestedRelationshipQuery__Group__0__Impl : ( () ) ;
    public final void rule__NestedRelationshipQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2554:1: ( ( () ) )
            // InternalSkiql.g:2555:1: ( () )
            {
            // InternalSkiql.g:2555:1: ( () )
            // InternalSkiql.g:2556:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getRelationshipQueryAction_0()); 
            }
            // InternalSkiql.g:2557:2: ()
            // InternalSkiql.g:2557:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getRelationshipQueryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRelationshipQuery__Group__0__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__1"
    // InternalSkiql.g:2565:1: rule__NestedRelationshipQuery__Group__1 : rule__NestedRelationshipQuery__Group__1__Impl rule__NestedRelationshipQuery__Group__2 ;
    public final void rule__NestedRelationshipQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2569:1: ( rule__NestedRelationshipQuery__Group__1__Impl rule__NestedRelationshipQuery__Group__2 )
            // InternalSkiql.g:2570:2: rule__NestedRelationshipQuery__Group__1__Impl rule__NestedRelationshipQuery__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__NestedRelationshipQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__1"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__1__Impl"
    // InternalSkiql.g:2577:1: rule__NestedRelationshipQuery__Group__1__Impl : ( '{' ) ;
    public final void rule__NestedRelationshipQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2581:1: ( ( '{' ) )
            // InternalSkiql.g:2582:1: ( '{' )
            {
            // InternalSkiql.g:2582:1: ( '{' )
            // InternalSkiql.g:2583:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__1__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__2"
    // InternalSkiql.g:2592:1: rule__NestedRelationshipQuery__Group__2 : rule__NestedRelationshipQuery__Group__2__Impl rule__NestedRelationshipQuery__Group__3 ;
    public final void rule__NestedRelationshipQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2596:1: ( rule__NestedRelationshipQuery__Group__2__Impl rule__NestedRelationshipQuery__Group__3 )
            // InternalSkiql.g:2597:2: rule__NestedRelationshipQuery__Group__2__Impl rule__NestedRelationshipQuery__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__NestedRelationshipQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__2"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__2__Impl"
    // InternalSkiql.g:2604:1: rule__NestedRelationshipQuery__Group__2__Impl : ( ( 'FROM' )? ) ;
    public final void rule__NestedRelationshipQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2608:1: ( ( ( 'FROM' )? ) )
            // InternalSkiql.g:2609:1: ( ( 'FROM' )? )
            {
            // InternalSkiql.g:2609:1: ( ( 'FROM' )? )
            // InternalSkiql.g:2610:2: ( 'FROM' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getFROMKeyword_2()); 
            }
            // InternalSkiql.g:2611:2: ( 'FROM' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSkiql.g:2611:3: 'FROM'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getFROMKeyword_2()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__2__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__3"
    // InternalSkiql.g:2619:1: rule__NestedRelationshipQuery__Group__3 : rule__NestedRelationshipQuery__Group__3__Impl rule__NestedRelationshipQuery__Group__4 ;
    public final void rule__NestedRelationshipQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2623:1: ( rule__NestedRelationshipQuery__Group__3__Impl rule__NestedRelationshipQuery__Group__4 )
            // InternalSkiql.g:2624:2: rule__NestedRelationshipQuery__Group__3__Impl rule__NestedRelationshipQuery__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__NestedRelationshipQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__3"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__3__Impl"
    // InternalSkiql.g:2631:1: rule__NestedRelationshipQuery__Group__3__Impl : ( ( rule__NestedRelationshipQuery__FromAssignment_3 ) ) ;
    public final void rule__NestedRelationshipQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2635:1: ( ( ( rule__NestedRelationshipQuery__FromAssignment_3 ) ) )
            // InternalSkiql.g:2636:1: ( ( rule__NestedRelationshipQuery__FromAssignment_3 ) )
            {
            // InternalSkiql.g:2636:1: ( ( rule__NestedRelationshipQuery__FromAssignment_3 ) )
            // InternalSkiql.g:2637:2: ( rule__NestedRelationshipQuery__FromAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getFromAssignment_3()); 
            }
            // InternalSkiql.g:2638:2: ( rule__NestedRelationshipQuery__FromAssignment_3 )
            // InternalSkiql.g:2638:3: rule__NestedRelationshipQuery__FromAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__FromAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getFromAssignment_3()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__3__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__4"
    // InternalSkiql.g:2646:1: rule__NestedRelationshipQuery__Group__4 : rule__NestedRelationshipQuery__Group__4__Impl rule__NestedRelationshipQuery__Group__5 ;
    public final void rule__NestedRelationshipQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2650:1: ( rule__NestedRelationshipQuery__Group__4__Impl rule__NestedRelationshipQuery__Group__5 )
            // InternalSkiql.g:2651:2: rule__NestedRelationshipQuery__Group__4__Impl rule__NestedRelationshipQuery__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__NestedRelationshipQuery__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__4"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__4__Impl"
    // InternalSkiql.g:2658:1: rule__NestedRelationshipQuery__Group__4__Impl : ( 'TO' ) ;
    public final void rule__NestedRelationshipQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2662:1: ( ( 'TO' ) )
            // InternalSkiql.g:2663:1: ( 'TO' )
            {
            // InternalSkiql.g:2663:1: ( 'TO' )
            // InternalSkiql.g:2664:2: 'TO'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getTOKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getTOKeyword_4()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__4__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__5"
    // InternalSkiql.g:2673:1: rule__NestedRelationshipQuery__Group__5 : rule__NestedRelationshipQuery__Group__5__Impl rule__NestedRelationshipQuery__Group__6 ;
    public final void rule__NestedRelationshipQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2677:1: ( rule__NestedRelationshipQuery__Group__5__Impl rule__NestedRelationshipQuery__Group__6 )
            // InternalSkiql.g:2678:2: rule__NestedRelationshipQuery__Group__5__Impl rule__NestedRelationshipQuery__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__NestedRelationshipQuery__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__5"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__5__Impl"
    // InternalSkiql.g:2685:1: rule__NestedRelationshipQuery__Group__5__Impl : ( ( rule__NestedRelationshipQuery__Alternatives_5 ) ) ;
    public final void rule__NestedRelationshipQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2689:1: ( ( ( rule__NestedRelationshipQuery__Alternatives_5 ) ) )
            // InternalSkiql.g:2690:1: ( ( rule__NestedRelationshipQuery__Alternatives_5 ) )
            {
            // InternalSkiql.g:2690:1: ( ( rule__NestedRelationshipQuery__Alternatives_5 ) )
            // InternalSkiql.g:2691:2: ( rule__NestedRelationshipQuery__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getAlternatives_5()); 
            }
            // InternalSkiql.g:2692:2: ( rule__NestedRelationshipQuery__Alternatives_5 )
            // InternalSkiql.g:2692:3: rule__NestedRelationshipQuery__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getAlternatives_5()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__5__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__6"
    // InternalSkiql.g:2700:1: rule__NestedRelationshipQuery__Group__6 : rule__NestedRelationshipQuery__Group__6__Impl rule__NestedRelationshipQuery__Group__7 ;
    public final void rule__NestedRelationshipQuery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2704:1: ( rule__NestedRelationshipQuery__Group__6__Impl rule__NestedRelationshipQuery__Group__7 )
            // InternalSkiql.g:2705:2: rule__NestedRelationshipQuery__Group__6__Impl rule__NestedRelationshipQuery__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__NestedRelationshipQuery__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__6"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__6__Impl"
    // InternalSkiql.g:2712:1: rule__NestedRelationshipQuery__Group__6__Impl : ( ( rule__NestedRelationshipQuery__Group_6__0 )* ) ;
    public final void rule__NestedRelationshipQuery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2716:1: ( ( ( rule__NestedRelationshipQuery__Group_6__0 )* ) )
            // InternalSkiql.g:2717:1: ( ( rule__NestedRelationshipQuery__Group_6__0 )* )
            {
            // InternalSkiql.g:2717:1: ( ( rule__NestedRelationshipQuery__Group_6__0 )* )
            // InternalSkiql.g:2718:2: ( rule__NestedRelationshipQuery__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getGroup_6()); 
            }
            // InternalSkiql.g:2719:2: ( rule__NestedRelationshipQuery__Group_6__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSkiql.g:2719:3: rule__NestedRelationshipQuery__Group_6__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__NestedRelationshipQuery__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getGroup_6()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__6__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__7"
    // InternalSkiql.g:2727:1: rule__NestedRelationshipQuery__Group__7 : rule__NestedRelationshipQuery__Group__7__Impl ;
    public final void rule__NestedRelationshipQuery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2731:1: ( rule__NestedRelationshipQuery__Group__7__Impl )
            // InternalSkiql.g:2732:2: rule__NestedRelationshipQuery__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__7"


    // $ANTLR start "rule__NestedRelationshipQuery__Group__7__Impl"
    // InternalSkiql.g:2738:1: rule__NestedRelationshipQuery__Group__7__Impl : ( '}' ) ;
    public final void rule__NestedRelationshipQuery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2742:1: ( ( '}' ) )
            // InternalSkiql.g:2743:1: ( '}' )
            {
            // InternalSkiql.g:2743:1: ( '}' )
            // InternalSkiql.g:2744:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__Group__7__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group_6__0"
    // InternalSkiql.g:2754:1: rule__NestedRelationshipQuery__Group_6__0 : rule__NestedRelationshipQuery__Group_6__0__Impl rule__NestedRelationshipQuery__Group_6__1 ;
    public final void rule__NestedRelationshipQuery__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2758:1: ( rule__NestedRelationshipQuery__Group_6__0__Impl rule__NestedRelationshipQuery__Group_6__1 )
            // InternalSkiql.g:2759:2: rule__NestedRelationshipQuery__Group_6__0__Impl rule__NestedRelationshipQuery__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__NestedRelationshipQuery__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group_6__0"


    // $ANTLR start "rule__NestedRelationshipQuery__Group_6__0__Impl"
    // InternalSkiql.g:2766:1: rule__NestedRelationshipQuery__Group_6__0__Impl : ( ( ',' ) ) ;
    public final void rule__NestedRelationshipQuery__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2770:1: ( ( ( ',' ) ) )
            // InternalSkiql.g:2771:1: ( ( ',' ) )
            {
            // InternalSkiql.g:2771:1: ( ( ',' ) )
            // InternalSkiql.g:2772:2: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getCommaKeyword_6_0()); 
            }
            // InternalSkiql.g:2773:2: ( ',' )
            // InternalSkiql.g:2773:3: ','
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getCommaKeyword_6_0()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__Group_6__0__Impl"


    // $ANTLR start "rule__NestedRelationshipQuery__Group_6__1"
    // InternalSkiql.g:2781:1: rule__NestedRelationshipQuery__Group_6__1 : rule__NestedRelationshipQuery__Group_6__1__Impl ;
    public final void rule__NestedRelationshipQuery__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2785:1: ( rule__NestedRelationshipQuery__Group_6__1__Impl )
            // InternalSkiql.g:2786:2: rule__NestedRelationshipQuery__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NestedRelationshipQuery__Group_6__1"


    // $ANTLR start "rule__NestedRelationshipQuery__Group_6__1__Impl"
    // InternalSkiql.g:2792:1: rule__NestedRelationshipQuery__Group_6__1__Impl : ( ( rule__NestedRelationshipQuery__Alternatives_6_1 ) ) ;
    public final void rule__NestedRelationshipQuery__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2796:1: ( ( ( rule__NestedRelationshipQuery__Alternatives_6_1 ) ) )
            // InternalSkiql.g:2797:1: ( ( rule__NestedRelationshipQuery__Alternatives_6_1 ) )
            {
            // InternalSkiql.g:2797:1: ( ( rule__NestedRelationshipQuery__Alternatives_6_1 ) )
            // InternalSkiql.g:2798:2: ( rule__NestedRelationshipQuery__Alternatives_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getAlternatives_6_1()); 
            }
            // InternalSkiql.g:2799:2: ( rule__NestedRelationshipQuery__Alternatives_6_1 )
            // InternalSkiql.g:2799:3: rule__NestedRelationshipQuery__Alternatives_6_1
            {
            pushFollow(FOLLOW_2);
            rule__NestedRelationshipQuery__Alternatives_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getAlternatives_6_1()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__Group_6__1__Impl"


    // $ANTLR start "rule__RelationshipSpec__Group__0"
    // InternalSkiql.g:2808:1: rule__RelationshipSpec__Group__0 : rule__RelationshipSpec__Group__0__Impl rule__RelationshipSpec__Group__1 ;
    public final void rule__RelationshipSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2812:1: ( rule__RelationshipSpec__Group__0__Impl rule__RelationshipSpec__Group__1 )
            // InternalSkiql.g:2813:2: rule__RelationshipSpec__Group__0__Impl rule__RelationshipSpec__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__RelationshipSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipSpec__Group__0"


    // $ANTLR start "rule__RelationshipSpec__Group__0__Impl"
    // InternalSkiql.g:2820:1: rule__RelationshipSpec__Group__0__Impl : ( () ) ;
    public final void rule__RelationshipSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2824:1: ( ( () ) )
            // InternalSkiql.g:2825:1: ( () )
            {
            // InternalSkiql.g:2825:1: ( () )
            // InternalSkiql.g:2826:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipSpecAccess().getRelationshipSpecAction_0()); 
            }
            // InternalSkiql.g:2827:2: ()
            // InternalSkiql.g:2827:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipSpecAccess().getRelationshipSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipSpec__Group__0__Impl"


    // $ANTLR start "rule__RelationshipSpec__Group__1"
    // InternalSkiql.g:2835:1: rule__RelationshipSpec__Group__1 : rule__RelationshipSpec__Group__1__Impl rule__RelationshipSpec__Group__2 ;
    public final void rule__RelationshipSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2839:1: ( rule__RelationshipSpec__Group__1__Impl rule__RelationshipSpec__Group__2 )
            // InternalSkiql.g:2840:2: rule__RelationshipSpec__Group__1__Impl rule__RelationshipSpec__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__RelationshipSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipSpec__Group__1"


    // $ANTLR start "rule__RelationshipSpec__Group__1__Impl"
    // InternalSkiql.g:2847:1: rule__RelationshipSpec__Group__1__Impl : ( ( rule__RelationshipSpec__TargetExpressionAssignment_1 ) ) ;
    public final void rule__RelationshipSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2851:1: ( ( ( rule__RelationshipSpec__TargetExpressionAssignment_1 ) ) )
            // InternalSkiql.g:2852:1: ( ( rule__RelationshipSpec__TargetExpressionAssignment_1 ) )
            {
            // InternalSkiql.g:2852:1: ( ( rule__RelationshipSpec__TargetExpressionAssignment_1 ) )
            // InternalSkiql.g:2853:2: ( rule__RelationshipSpec__TargetExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipSpecAccess().getTargetExpressionAssignment_1()); 
            }
            // InternalSkiql.g:2854:2: ( rule__RelationshipSpec__TargetExpressionAssignment_1 )
            // InternalSkiql.g:2854:3: rule__RelationshipSpec__TargetExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipSpec__TargetExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipSpecAccess().getTargetExpressionAssignment_1()); 
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
    // $ANTLR end "rule__RelationshipSpec__Group__1__Impl"


    // $ANTLR start "rule__RelationshipSpec__Group__2"
    // InternalSkiql.g:2862:1: rule__RelationshipSpec__Group__2 : rule__RelationshipSpec__Group__2__Impl ;
    public final void rule__RelationshipSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2866:1: ( rule__RelationshipSpec__Group__2__Impl )
            // InternalSkiql.g:2867:2: rule__RelationshipSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipSpec__Group__2"


    // $ANTLR start "rule__RelationshipSpec__Group__2__Impl"
    // InternalSkiql.g:2873:1: rule__RelationshipSpec__Group__2__Impl : ( ( rule__RelationshipSpec__RelationSpecAssignment_2 )? ) ;
    public final void rule__RelationshipSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2877:1: ( ( ( rule__RelationshipSpec__RelationSpecAssignment_2 )? ) )
            // InternalSkiql.g:2878:1: ( ( rule__RelationshipSpec__RelationSpecAssignment_2 )? )
            {
            // InternalSkiql.g:2878:1: ( ( rule__RelationshipSpec__RelationSpecAssignment_2 )? )
            // InternalSkiql.g:2879:2: ( rule__RelationshipSpec__RelationSpecAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipSpecAccess().getRelationSpecAssignment_2()); 
            }
            // InternalSkiql.g:2880:2: ( rule__RelationshipSpec__RelationSpecAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=17 && LA34_0<=19)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSkiql.g:2880:3: rule__RelationshipSpec__RelationSpecAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipSpec__RelationSpecAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipSpecAccess().getRelationSpecAssignment_2()); 
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
    // $ANTLR end "rule__RelationshipSpec__Group__2__Impl"


    // $ANTLR start "rule__RelationSpec__Group__0"
    // InternalSkiql.g:2889:1: rule__RelationSpec__Group__0 : rule__RelationSpec__Group__0__Impl rule__RelationSpec__Group__1 ;
    public final void rule__RelationSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2893:1: ( rule__RelationSpec__Group__0__Impl rule__RelationSpec__Group__1 )
            // InternalSkiql.g:2894:2: rule__RelationSpec__Group__0__Impl rule__RelationSpec__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__RelationSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationSpec__Group__0"


    // $ANTLR start "rule__RelationSpec__Group__0__Impl"
    // InternalSkiql.g:2901:1: rule__RelationSpec__Group__0__Impl : ( () ) ;
    public final void rule__RelationSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2905:1: ( ( () ) )
            // InternalSkiql.g:2906:1: ( () )
            {
            // InternalSkiql.g:2906:1: ( () )
            // InternalSkiql.g:2907:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationSpecAccess().getRelationSpecAction_0()); 
            }
            // InternalSkiql.g:2908:2: ()
            // InternalSkiql.g:2908:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationSpecAccess().getRelationSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSpec__Group__0__Impl"


    // $ANTLR start "rule__RelationSpec__Group__1"
    // InternalSkiql.g:2916:1: rule__RelationSpec__Group__1 : rule__RelationSpec__Group__1__Impl rule__RelationSpec__Group__2 ;
    public final void rule__RelationSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2920:1: ( rule__RelationSpec__Group__1__Impl rule__RelationSpec__Group__2 )
            // InternalSkiql.g:2921:2: rule__RelationSpec__Group__1__Impl rule__RelationSpec__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RelationSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationSpec__Group__1"


    // $ANTLR start "rule__RelationSpec__Group__1__Impl"
    // InternalSkiql.g:2928:1: rule__RelationSpec__Group__1__Impl : ( 'ANY' ) ;
    public final void rule__RelationSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2932:1: ( ( 'ANY' ) )
            // InternalSkiql.g:2933:1: ( 'ANY' )
            {
            // InternalSkiql.g:2933:1: ( 'ANY' )
            // InternalSkiql.g:2934:2: 'ANY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationSpecAccess().getANYKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationSpecAccess().getANYKeyword_1()); 
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
    // $ANTLR end "rule__RelationSpec__Group__1__Impl"


    // $ANTLR start "rule__RelationSpec__Group__2"
    // InternalSkiql.g:2943:1: rule__RelationSpec__Group__2 : rule__RelationSpec__Group__2__Impl ;
    public final void rule__RelationSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2947:1: ( rule__RelationSpec__Group__2__Impl )
            // InternalSkiql.g:2948:2: rule__RelationSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationSpec__Group__2"


    // $ANTLR start "rule__RelationSpec__Group__2__Impl"
    // InternalSkiql.g:2954:1: rule__RelationSpec__Group__2__Impl : ( ( rule__RelationSpec__NameAssignment_2 ) ) ;
    public final void rule__RelationSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2958:1: ( ( ( rule__RelationSpec__NameAssignment_2 ) ) )
            // InternalSkiql.g:2959:1: ( ( rule__RelationSpec__NameAssignment_2 ) )
            {
            // InternalSkiql.g:2959:1: ( ( rule__RelationSpec__NameAssignment_2 ) )
            // InternalSkiql.g:2960:2: ( rule__RelationSpec__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationSpecAccess().getNameAssignment_2()); 
            }
            // InternalSkiql.g:2961:2: ( rule__RelationSpec__NameAssignment_2 )
            // InternalSkiql.g:2961:3: rule__RelationSpec__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationSpec__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationSpecAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__RelationSpec__Group__2__Impl"


    // $ANTLR start "rule__ReferenceSpec__Group__0"
    // InternalSkiql.g:2970:1: rule__ReferenceSpec__Group__0 : rule__ReferenceSpec__Group__0__Impl rule__ReferenceSpec__Group__1 ;
    public final void rule__ReferenceSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2974:1: ( rule__ReferenceSpec__Group__0__Impl rule__ReferenceSpec__Group__1 )
            // InternalSkiql.g:2975:2: rule__ReferenceSpec__Group__0__Impl rule__ReferenceSpec__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ReferenceSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceSpec__Group__0"


    // $ANTLR start "rule__ReferenceSpec__Group__0__Impl"
    // InternalSkiql.g:2982:1: rule__ReferenceSpec__Group__0__Impl : ( () ) ;
    public final void rule__ReferenceSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:2986:1: ( ( () ) )
            // InternalSkiql.g:2987:1: ( () )
            {
            // InternalSkiql.g:2987:1: ( () )
            // InternalSkiql.g:2988:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceSpecAccess().getReferenceSpecAction_0()); 
            }
            // InternalSkiql.g:2989:2: ()
            // InternalSkiql.g:2989:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceSpecAccess().getReferenceSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceSpec__Group__0__Impl"


    // $ANTLR start "rule__ReferenceSpec__Group__1"
    // InternalSkiql.g:2997:1: rule__ReferenceSpec__Group__1 : rule__ReferenceSpec__Group__1__Impl rule__ReferenceSpec__Group__2 ;
    public final void rule__ReferenceSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3001:1: ( rule__ReferenceSpec__Group__1__Impl rule__ReferenceSpec__Group__2 )
            // InternalSkiql.g:3002:2: rule__ReferenceSpec__Group__1__Impl rule__ReferenceSpec__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ReferenceSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceSpec__Group__1"


    // $ANTLR start "rule__ReferenceSpec__Group__1__Impl"
    // InternalSkiql.g:3009:1: rule__ReferenceSpec__Group__1__Impl : ( 'REF' ) ;
    public final void rule__ReferenceSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3013:1: ( ( 'REF' ) )
            // InternalSkiql.g:3014:1: ( 'REF' )
            {
            // InternalSkiql.g:3014:1: ( 'REF' )
            // InternalSkiql.g:3015:2: 'REF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceSpecAccess().getREFKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceSpecAccess().getREFKeyword_1()); 
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
    // $ANTLR end "rule__ReferenceSpec__Group__1__Impl"


    // $ANTLR start "rule__ReferenceSpec__Group__2"
    // InternalSkiql.g:3024:1: rule__ReferenceSpec__Group__2 : rule__ReferenceSpec__Group__2__Impl rule__ReferenceSpec__Group__3 ;
    public final void rule__ReferenceSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3028:1: ( rule__ReferenceSpec__Group__2__Impl rule__ReferenceSpec__Group__3 )
            // InternalSkiql.g:3029:2: rule__ReferenceSpec__Group__2__Impl rule__ReferenceSpec__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ReferenceSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceSpec__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceSpec__Group__2"


    // $ANTLR start "rule__ReferenceSpec__Group__2__Impl"
    // InternalSkiql.g:3036:1: rule__ReferenceSpec__Group__2__Impl : ( ( rule__ReferenceSpec__NameAssignment_2 )? ) ;
    public final void rule__ReferenceSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3040:1: ( ( ( rule__ReferenceSpec__NameAssignment_2 )? ) )
            // InternalSkiql.g:3041:1: ( ( rule__ReferenceSpec__NameAssignment_2 )? )
            {
            // InternalSkiql.g:3041:1: ( ( rule__ReferenceSpec__NameAssignment_2 )? )
            // InternalSkiql.g:3042:2: ( rule__ReferenceSpec__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceSpecAccess().getNameAssignment_2()); 
            }
            // InternalSkiql.g:3043:2: ( rule__ReferenceSpec__NameAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSkiql.g:3043:3: rule__ReferenceSpec__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceSpec__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceSpecAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__ReferenceSpec__Group__2__Impl"


    // $ANTLR start "rule__ReferenceSpec__Group__3"
    // InternalSkiql.g:3051:1: rule__ReferenceSpec__Group__3 : rule__ReferenceSpec__Group__3__Impl ;
    public final void rule__ReferenceSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3055:1: ( rule__ReferenceSpec__Group__3__Impl )
            // InternalSkiql.g:3056:2: rule__ReferenceSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceSpec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceSpec__Group__3"


    // $ANTLR start "rule__ReferenceSpec__Group__3__Impl"
    // InternalSkiql.g:3062:1: rule__ReferenceSpec__Group__3__Impl : ( ( rule__ReferenceSpec__VariationFilterAssignment_3 )? ) ;
    public final void rule__ReferenceSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3066:1: ( ( ( rule__ReferenceSpec__VariationFilterAssignment_3 )? ) )
            // InternalSkiql.g:3067:1: ( ( rule__ReferenceSpec__VariationFilterAssignment_3 )? )
            {
            // InternalSkiql.g:3067:1: ( ( rule__ReferenceSpec__VariationFilterAssignment_3 )? )
            // InternalSkiql.g:3068:2: ( rule__ReferenceSpec__VariationFilterAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceSpecAccess().getVariationFilterAssignment_3()); 
            }
            // InternalSkiql.g:3069:2: ( rule__ReferenceSpec__VariationFilterAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13||LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSkiql.g:3069:3: rule__ReferenceSpec__VariationFilterAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceSpec__VariationFilterAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceSpecAccess().getVariationFilterAssignment_3()); 
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
    // $ANTLR end "rule__ReferenceSpec__Group__3__Impl"


    // $ANTLR start "rule__AggregationSpec__Group__0"
    // InternalSkiql.g:3078:1: rule__AggregationSpec__Group__0 : rule__AggregationSpec__Group__0__Impl rule__AggregationSpec__Group__1 ;
    public final void rule__AggregationSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3082:1: ( rule__AggregationSpec__Group__0__Impl rule__AggregationSpec__Group__1 )
            // InternalSkiql.g:3083:2: rule__AggregationSpec__Group__0__Impl rule__AggregationSpec__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__AggregationSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AggregationSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AggregationSpec__Group__0"


    // $ANTLR start "rule__AggregationSpec__Group__0__Impl"
    // InternalSkiql.g:3090:1: rule__AggregationSpec__Group__0__Impl : ( () ) ;
    public final void rule__AggregationSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3094:1: ( ( () ) )
            // InternalSkiql.g:3095:1: ( () )
            {
            // InternalSkiql.g:3095:1: ( () )
            // InternalSkiql.g:3096:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationSpecAccess().getAggregationSpecAction_0()); 
            }
            // InternalSkiql.g:3097:2: ()
            // InternalSkiql.g:3097:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationSpecAccess().getAggregationSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationSpec__Group__0__Impl"


    // $ANTLR start "rule__AggregationSpec__Group__1"
    // InternalSkiql.g:3105:1: rule__AggregationSpec__Group__1 : rule__AggregationSpec__Group__1__Impl rule__AggregationSpec__Group__2 ;
    public final void rule__AggregationSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3109:1: ( rule__AggregationSpec__Group__1__Impl rule__AggregationSpec__Group__2 )
            // InternalSkiql.g:3110:2: rule__AggregationSpec__Group__1__Impl rule__AggregationSpec__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__AggregationSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AggregationSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AggregationSpec__Group__1"


    // $ANTLR start "rule__AggregationSpec__Group__1__Impl"
    // InternalSkiql.g:3117:1: rule__AggregationSpec__Group__1__Impl : ( 'AGGR' ) ;
    public final void rule__AggregationSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3121:1: ( ( 'AGGR' ) )
            // InternalSkiql.g:3122:1: ( 'AGGR' )
            {
            // InternalSkiql.g:3122:1: ( 'AGGR' )
            // InternalSkiql.g:3123:2: 'AGGR'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationSpecAccess().getAGGRKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationSpecAccess().getAGGRKeyword_1()); 
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
    // $ANTLR end "rule__AggregationSpec__Group__1__Impl"


    // $ANTLR start "rule__AggregationSpec__Group__2"
    // InternalSkiql.g:3132:1: rule__AggregationSpec__Group__2 : rule__AggregationSpec__Group__2__Impl ;
    public final void rule__AggregationSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3136:1: ( rule__AggregationSpec__Group__2__Impl )
            // InternalSkiql.g:3137:2: rule__AggregationSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregationSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AggregationSpec__Group__2"


    // $ANTLR start "rule__AggregationSpec__Group__2__Impl"
    // InternalSkiql.g:3143:1: rule__AggregationSpec__Group__2__Impl : ( ( rule__AggregationSpec__NameAssignment_2 )? ) ;
    public final void rule__AggregationSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3147:1: ( ( ( rule__AggregationSpec__NameAssignment_2 )? ) )
            // InternalSkiql.g:3148:1: ( ( rule__AggregationSpec__NameAssignment_2 )? )
            {
            // InternalSkiql.g:3148:1: ( ( rule__AggregationSpec__NameAssignment_2 )? )
            // InternalSkiql.g:3149:2: ( rule__AggregationSpec__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationSpecAccess().getNameAssignment_2()); 
            }
            // InternalSkiql.g:3150:2: ( rule__AggregationSpec__NameAssignment_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSkiql.g:3150:3: rule__AggregationSpec__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AggregationSpec__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationSpecAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__AggregationSpec__Group__2__Impl"


    // $ANTLR start "rule__IndirectRelationshipSpec__Group__0"
    // InternalSkiql.g:3159:1: rule__IndirectRelationshipSpec__Group__0 : rule__IndirectRelationshipSpec__Group__0__Impl rule__IndirectRelationshipSpec__Group__1 ;
    public final void rule__IndirectRelationshipSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3163:1: ( rule__IndirectRelationshipSpec__Group__0__Impl rule__IndirectRelationshipSpec__Group__1 )
            // InternalSkiql.g:3164:2: rule__IndirectRelationshipSpec__Group__0__Impl rule__IndirectRelationshipSpec__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__IndirectRelationshipSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IndirectRelationshipSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IndirectRelationshipSpec__Group__0"


    // $ANTLR start "rule__IndirectRelationshipSpec__Group__0__Impl"
    // InternalSkiql.g:3171:1: rule__IndirectRelationshipSpec__Group__0__Impl : ( () ) ;
    public final void rule__IndirectRelationshipSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3175:1: ( ( () ) )
            // InternalSkiql.g:3176:1: ( () )
            {
            // InternalSkiql.g:3176:1: ( () )
            // InternalSkiql.g:3177:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecAccess().getRelationshipSpecAction_0()); 
            }
            // InternalSkiql.g:3178:2: ()
            // InternalSkiql.g:3178:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecAccess().getRelationshipSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndirectRelationshipSpec__Group__0__Impl"


    // $ANTLR start "rule__IndirectRelationshipSpec__Group__1"
    // InternalSkiql.g:3186:1: rule__IndirectRelationshipSpec__Group__1 : rule__IndirectRelationshipSpec__Group__1__Impl rule__IndirectRelationshipSpec__Group__2 ;
    public final void rule__IndirectRelationshipSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3190:1: ( rule__IndirectRelationshipSpec__Group__1__Impl rule__IndirectRelationshipSpec__Group__2 )
            // InternalSkiql.g:3191:2: rule__IndirectRelationshipSpec__Group__1__Impl rule__IndirectRelationshipSpec__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__IndirectRelationshipSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IndirectRelationshipSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IndirectRelationshipSpec__Group__1"


    // $ANTLR start "rule__IndirectRelationshipSpec__Group__1__Impl"
    // InternalSkiql.g:3198:1: rule__IndirectRelationshipSpec__Group__1__Impl : ( ( rule__IndirectRelationshipSpec__IndirectAssignment_1 ) ) ;
    public final void rule__IndirectRelationshipSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3202:1: ( ( ( rule__IndirectRelationshipSpec__IndirectAssignment_1 ) ) )
            // InternalSkiql.g:3203:1: ( ( rule__IndirectRelationshipSpec__IndirectAssignment_1 ) )
            {
            // InternalSkiql.g:3203:1: ( ( rule__IndirectRelationshipSpec__IndirectAssignment_1 ) )
            // InternalSkiql.g:3204:2: ( rule__IndirectRelationshipSpec__IndirectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecAccess().getIndirectAssignment_1()); 
            }
            // InternalSkiql.g:3205:2: ( rule__IndirectRelationshipSpec__IndirectAssignment_1 )
            // InternalSkiql.g:3205:3: rule__IndirectRelationshipSpec__IndirectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IndirectRelationshipSpec__IndirectAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecAccess().getIndirectAssignment_1()); 
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
    // $ANTLR end "rule__IndirectRelationshipSpec__Group__1__Impl"


    // $ANTLR start "rule__IndirectRelationshipSpec__Group__2"
    // InternalSkiql.g:3213:1: rule__IndirectRelationshipSpec__Group__2 : rule__IndirectRelationshipSpec__Group__2__Impl rule__IndirectRelationshipSpec__Group__3 ;
    public final void rule__IndirectRelationshipSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3217:1: ( rule__IndirectRelationshipSpec__Group__2__Impl rule__IndirectRelationshipSpec__Group__3 )
            // InternalSkiql.g:3218:2: rule__IndirectRelationshipSpec__Group__2__Impl rule__IndirectRelationshipSpec__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__IndirectRelationshipSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IndirectRelationshipSpec__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IndirectRelationshipSpec__Group__2"


    // $ANTLR start "rule__IndirectRelationshipSpec__Group__2__Impl"
    // InternalSkiql.g:3225:1: rule__IndirectRelationshipSpec__Group__2__Impl : ( ( rule__IndirectRelationshipSpec__TargetExpressionAssignment_2 ) ) ;
    public final void rule__IndirectRelationshipSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3229:1: ( ( ( rule__IndirectRelationshipSpec__TargetExpressionAssignment_2 ) ) )
            // InternalSkiql.g:3230:1: ( ( rule__IndirectRelationshipSpec__TargetExpressionAssignment_2 ) )
            {
            // InternalSkiql.g:3230:1: ( ( rule__IndirectRelationshipSpec__TargetExpressionAssignment_2 ) )
            // InternalSkiql.g:3231:2: ( rule__IndirectRelationshipSpec__TargetExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecAccess().getTargetExpressionAssignment_2()); 
            }
            // InternalSkiql.g:3232:2: ( rule__IndirectRelationshipSpec__TargetExpressionAssignment_2 )
            // InternalSkiql.g:3232:3: rule__IndirectRelationshipSpec__TargetExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IndirectRelationshipSpec__TargetExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecAccess().getTargetExpressionAssignment_2()); 
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
    // $ANTLR end "rule__IndirectRelationshipSpec__Group__2__Impl"


    // $ANTLR start "rule__IndirectRelationshipSpec__Group__3"
    // InternalSkiql.g:3240:1: rule__IndirectRelationshipSpec__Group__3 : rule__IndirectRelationshipSpec__Group__3__Impl ;
    public final void rule__IndirectRelationshipSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3244:1: ( rule__IndirectRelationshipSpec__Group__3__Impl )
            // InternalSkiql.g:3245:2: rule__IndirectRelationshipSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndirectRelationshipSpec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IndirectRelationshipSpec__Group__3"


    // $ANTLR start "rule__IndirectRelationshipSpec__Group__3__Impl"
    // InternalSkiql.g:3251:1: rule__IndirectRelationshipSpec__Group__3__Impl : ( ( rule__IndirectRelationshipSpec__RelationSpecAssignment_3 )? ) ;
    public final void rule__IndirectRelationshipSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3255:1: ( ( ( rule__IndirectRelationshipSpec__RelationSpecAssignment_3 )? ) )
            // InternalSkiql.g:3256:1: ( ( rule__IndirectRelationshipSpec__RelationSpecAssignment_3 )? )
            {
            // InternalSkiql.g:3256:1: ( ( rule__IndirectRelationshipSpec__RelationSpecAssignment_3 )? )
            // InternalSkiql.g:3257:2: ( rule__IndirectRelationshipSpec__RelationSpecAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecAccess().getRelationSpecAssignment_3()); 
            }
            // InternalSkiql.g:3258:2: ( rule__IndirectRelationshipSpec__RelationSpecAssignment_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=18 && LA38_0<=19)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSkiql.g:3258:3: rule__IndirectRelationshipSpec__RelationSpecAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__IndirectRelationshipSpec__RelationSpecAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecAccess().getRelationSpecAssignment_3()); 
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
    // $ANTLR end "rule__IndirectRelationshipSpec__Group__3__Impl"


    // $ANTLR start "rule__IndirectReferenceSpec__Group__0"
    // InternalSkiql.g:3267:1: rule__IndirectReferenceSpec__Group__0 : rule__IndirectReferenceSpec__Group__0__Impl rule__IndirectReferenceSpec__Group__1 ;
    public final void rule__IndirectReferenceSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3271:1: ( rule__IndirectReferenceSpec__Group__0__Impl rule__IndirectReferenceSpec__Group__1 )
            // InternalSkiql.g:3272:2: rule__IndirectReferenceSpec__Group__0__Impl rule__IndirectReferenceSpec__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__IndirectReferenceSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IndirectReferenceSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IndirectReferenceSpec__Group__0"


    // $ANTLR start "rule__IndirectReferenceSpec__Group__0__Impl"
    // InternalSkiql.g:3279:1: rule__IndirectReferenceSpec__Group__0__Impl : ( () ) ;
    public final void rule__IndirectReferenceSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3283:1: ( ( () ) )
            // InternalSkiql.g:3284:1: ( () )
            {
            // InternalSkiql.g:3284:1: ( () )
            // InternalSkiql.g:3285:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectReferenceSpecAccess().getReferenceSpecAction_0()); 
            }
            // InternalSkiql.g:3286:2: ()
            // InternalSkiql.g:3286:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectReferenceSpecAccess().getReferenceSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndirectReferenceSpec__Group__0__Impl"


    // $ANTLR start "rule__IndirectReferenceSpec__Group__1"
    // InternalSkiql.g:3294:1: rule__IndirectReferenceSpec__Group__1 : rule__IndirectReferenceSpec__Group__1__Impl ;
    public final void rule__IndirectReferenceSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3298:1: ( rule__IndirectReferenceSpec__Group__1__Impl )
            // InternalSkiql.g:3299:2: rule__IndirectReferenceSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndirectReferenceSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IndirectReferenceSpec__Group__1"


    // $ANTLR start "rule__IndirectReferenceSpec__Group__1__Impl"
    // InternalSkiql.g:3305:1: rule__IndirectReferenceSpec__Group__1__Impl : ( 'REF' ) ;
    public final void rule__IndirectReferenceSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3309:1: ( ( 'REF' ) )
            // InternalSkiql.g:3310:1: ( 'REF' )
            {
            // InternalSkiql.g:3310:1: ( 'REF' )
            // InternalSkiql.g:3311:2: 'REF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectReferenceSpecAccess().getREFKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectReferenceSpecAccess().getREFKeyword_1()); 
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
    // $ANTLR end "rule__IndirectReferenceSpec__Group__1__Impl"


    // $ANTLR start "rule__IndirectAggregationSpec__Group__0"
    // InternalSkiql.g:3321:1: rule__IndirectAggregationSpec__Group__0 : rule__IndirectAggregationSpec__Group__0__Impl rule__IndirectAggregationSpec__Group__1 ;
    public final void rule__IndirectAggregationSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3325:1: ( rule__IndirectAggregationSpec__Group__0__Impl rule__IndirectAggregationSpec__Group__1 )
            // InternalSkiql.g:3326:2: rule__IndirectAggregationSpec__Group__0__Impl rule__IndirectAggregationSpec__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__IndirectAggregationSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IndirectAggregationSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IndirectAggregationSpec__Group__0"


    // $ANTLR start "rule__IndirectAggregationSpec__Group__0__Impl"
    // InternalSkiql.g:3333:1: rule__IndirectAggregationSpec__Group__0__Impl : ( () ) ;
    public final void rule__IndirectAggregationSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3337:1: ( ( () ) )
            // InternalSkiql.g:3338:1: ( () )
            {
            // InternalSkiql.g:3338:1: ( () )
            // InternalSkiql.g:3339:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectAggregationSpecAccess().getAggregationSpecAction_0()); 
            }
            // InternalSkiql.g:3340:2: ()
            // InternalSkiql.g:3340:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectAggregationSpecAccess().getAggregationSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndirectAggregationSpec__Group__0__Impl"


    // $ANTLR start "rule__IndirectAggregationSpec__Group__1"
    // InternalSkiql.g:3348:1: rule__IndirectAggregationSpec__Group__1 : rule__IndirectAggregationSpec__Group__1__Impl ;
    public final void rule__IndirectAggregationSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3352:1: ( rule__IndirectAggregationSpec__Group__1__Impl )
            // InternalSkiql.g:3353:2: rule__IndirectAggregationSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndirectAggregationSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IndirectAggregationSpec__Group__1"


    // $ANTLR start "rule__IndirectAggregationSpec__Group__1__Impl"
    // InternalSkiql.g:3359:1: rule__IndirectAggregationSpec__Group__1__Impl : ( 'AGGR' ) ;
    public final void rule__IndirectAggregationSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3363:1: ( ( 'AGGR' ) )
            // InternalSkiql.g:3364:1: ( 'AGGR' )
            {
            // InternalSkiql.g:3364:1: ( 'AGGR' )
            // InternalSkiql.g:3365:2: 'AGGR'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectAggregationSpecAccess().getAGGRKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectAggregationSpecAccess().getAGGRKeyword_1()); 
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
    // $ANTLR end "rule__IndirectAggregationSpec__Group__1__Impl"


    // $ANTLR start "rule__RelationshipExpression__Group__0"
    // InternalSkiql.g:3375:1: rule__RelationshipExpression__Group__0 : rule__RelationshipExpression__Group__0__Impl rule__RelationshipExpression__Group__1 ;
    public final void rule__RelationshipExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3379:1: ( rule__RelationshipExpression__Group__0__Impl rule__RelationshipExpression__Group__1 )
            // InternalSkiql.g:3380:2: rule__RelationshipExpression__Group__0__Impl rule__RelationshipExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RelationshipExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipExpression__Group__0"


    // $ANTLR start "rule__RelationshipExpression__Group__0__Impl"
    // InternalSkiql.g:3387:1: rule__RelationshipExpression__Group__0__Impl : ( () ) ;
    public final void rule__RelationshipExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3391:1: ( ( () ) )
            // InternalSkiql.g:3392:1: ( () )
            {
            // InternalSkiql.g:3392:1: ( () )
            // InternalSkiql.g:3393:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipExpressionAccess().getRelationshipExpressionAction_0()); 
            }
            // InternalSkiql.g:3394:2: ()
            // InternalSkiql.g:3394:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipExpressionAccess().getRelationshipExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationshipExpression__Group__1"
    // InternalSkiql.g:3402:1: rule__RelationshipExpression__Group__1 : rule__RelationshipExpression__Group__1__Impl ;
    public final void rule__RelationshipExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3406:1: ( rule__RelationshipExpression__Group__1__Impl )
            // InternalSkiql.g:3407:2: rule__RelationshipExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipExpression__Group__1"


    // $ANTLR start "rule__RelationshipExpression__Group__1__Impl"
    // InternalSkiql.g:3413:1: rule__RelationshipExpression__Group__1__Impl : ( ( rule__RelationshipExpression__RelationshipQueryAssignment_1 ) ) ;
    public final void rule__RelationshipExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3417:1: ( ( ( rule__RelationshipExpression__RelationshipQueryAssignment_1 ) ) )
            // InternalSkiql.g:3418:1: ( ( rule__RelationshipExpression__RelationshipQueryAssignment_1 ) )
            {
            // InternalSkiql.g:3418:1: ( ( rule__RelationshipExpression__RelationshipQueryAssignment_1 ) )
            // InternalSkiql.g:3419:2: ( rule__RelationshipExpression__RelationshipQueryAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipExpressionAccess().getRelationshipQueryAssignment_1()); 
            }
            // InternalSkiql.g:3420:2: ( rule__RelationshipExpression__RelationshipQueryAssignment_1 )
            // InternalSkiql.g:3420:3: rule__RelationshipExpression__RelationshipQueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipExpression__RelationshipQueryAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipExpressionAccess().getRelationshipQueryAssignment_1()); 
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
    // $ANTLR end "rule__RelationshipExpression__Group__1__Impl"


    // $ANTLR start "rule__EntityExpression__Group__0"
    // InternalSkiql.g:3429:1: rule__EntityExpression__Group__0 : rule__EntityExpression__Group__0__Impl rule__EntityExpression__Group__1 ;
    public final void rule__EntityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3433:1: ( rule__EntityExpression__Group__0__Impl rule__EntityExpression__Group__1 )
            // InternalSkiql.g:3434:2: rule__EntityExpression__Group__0__Impl rule__EntityExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EntityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntityExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityExpression__Group__0"


    // $ANTLR start "rule__EntityExpression__Group__0__Impl"
    // InternalSkiql.g:3441:1: rule__EntityExpression__Group__0__Impl : ( () ) ;
    public final void rule__EntityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3445:1: ( ( () ) )
            // InternalSkiql.g:3446:1: ( () )
            {
            // InternalSkiql.g:3446:1: ( () )
            // InternalSkiql.g:3447:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityExpressionAccess().getEntityExpressionAction_0()); 
            }
            // InternalSkiql.g:3448:2: ()
            // InternalSkiql.g:3448:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityExpressionAccess().getEntityExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExpression__Group__0__Impl"


    // $ANTLR start "rule__EntityExpression__Group__1"
    // InternalSkiql.g:3456:1: rule__EntityExpression__Group__1 : rule__EntityExpression__Group__1__Impl ;
    public final void rule__EntityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3460:1: ( rule__EntityExpression__Group__1__Impl )
            // InternalSkiql.g:3461:2: rule__EntityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityExpression__Group__1"


    // $ANTLR start "rule__EntityExpression__Group__1__Impl"
    // InternalSkiql.g:3467:1: rule__EntityExpression__Group__1__Impl : ( ( rule__EntityExpression__EntitySpecAssignment_1 ) ) ;
    public final void rule__EntityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3471:1: ( ( ( rule__EntityExpression__EntitySpecAssignment_1 ) ) )
            // InternalSkiql.g:3472:1: ( ( rule__EntityExpression__EntitySpecAssignment_1 ) )
            {
            // InternalSkiql.g:3472:1: ( ( rule__EntityExpression__EntitySpecAssignment_1 ) )
            // InternalSkiql.g:3473:2: ( rule__EntityExpression__EntitySpecAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityExpressionAccess().getEntitySpecAssignment_1()); 
            }
            // InternalSkiql.g:3474:2: ( rule__EntityExpression__EntitySpecAssignment_1 )
            // InternalSkiql.g:3474:3: rule__EntityExpression__EntitySpecAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityExpression__EntitySpecAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityExpressionAccess().getEntitySpecAssignment_1()); 
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
    // $ANTLR end "rule__EntityExpression__Group__1__Impl"


    // $ANTLR start "rule__ToReferenceEntitySpec__Group__0"
    // InternalSkiql.g:3483:1: rule__ToReferenceEntitySpec__Group__0 : rule__ToReferenceEntitySpec__Group__0__Impl rule__ToReferenceEntitySpec__Group__1 ;
    public final void rule__ToReferenceEntitySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3487:1: ( rule__ToReferenceEntitySpec__Group__0__Impl rule__ToReferenceEntitySpec__Group__1 )
            // InternalSkiql.g:3488:2: rule__ToReferenceEntitySpec__Group__0__Impl rule__ToReferenceEntitySpec__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ToReferenceEntitySpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ToReferenceEntitySpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ToReferenceEntitySpec__Group__0"


    // $ANTLR start "rule__ToReferenceEntitySpec__Group__0__Impl"
    // InternalSkiql.g:3495:1: rule__ToReferenceEntitySpec__Group__0__Impl : ( () ) ;
    public final void rule__ToReferenceEntitySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3499:1: ( ( () ) )
            // InternalSkiql.g:3500:1: ( () )
            {
            // InternalSkiql.g:3500:1: ( () )
            // InternalSkiql.g:3501:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToReferenceEntitySpecAccess().getEntitySpecAction_0()); 
            }
            // InternalSkiql.g:3502:2: ()
            // InternalSkiql.g:3502:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToReferenceEntitySpecAccess().getEntitySpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToReferenceEntitySpec__Group__0__Impl"


    // $ANTLR start "rule__ToReferenceEntitySpec__Group__1"
    // InternalSkiql.g:3510:1: rule__ToReferenceEntitySpec__Group__1 : rule__ToReferenceEntitySpec__Group__1__Impl rule__ToReferenceEntitySpec__Group__2 ;
    public final void rule__ToReferenceEntitySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3514:1: ( rule__ToReferenceEntitySpec__Group__1__Impl rule__ToReferenceEntitySpec__Group__2 )
            // InternalSkiql.g:3515:2: rule__ToReferenceEntitySpec__Group__1__Impl rule__ToReferenceEntitySpec__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ToReferenceEntitySpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ToReferenceEntitySpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ToReferenceEntitySpec__Group__1"


    // $ANTLR start "rule__ToReferenceEntitySpec__Group__1__Impl"
    // InternalSkiql.g:3522:1: rule__ToReferenceEntitySpec__Group__1__Impl : ( ( rule__ToReferenceEntitySpec__NameAssignment_1 ) ) ;
    public final void rule__ToReferenceEntitySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3526:1: ( ( ( rule__ToReferenceEntitySpec__NameAssignment_1 ) ) )
            // InternalSkiql.g:3527:1: ( ( rule__ToReferenceEntitySpec__NameAssignment_1 ) )
            {
            // InternalSkiql.g:3527:1: ( ( rule__ToReferenceEntitySpec__NameAssignment_1 ) )
            // InternalSkiql.g:3528:2: ( rule__ToReferenceEntitySpec__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToReferenceEntitySpecAccess().getNameAssignment_1()); 
            }
            // InternalSkiql.g:3529:2: ( rule__ToReferenceEntitySpec__NameAssignment_1 )
            // InternalSkiql.g:3529:3: rule__ToReferenceEntitySpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ToReferenceEntitySpec__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToReferenceEntitySpecAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ToReferenceEntitySpec__Group__1__Impl"


    // $ANTLR start "rule__ToReferenceEntitySpec__Group__2"
    // InternalSkiql.g:3537:1: rule__ToReferenceEntitySpec__Group__2 : rule__ToReferenceEntitySpec__Group__2__Impl ;
    public final void rule__ToReferenceEntitySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3541:1: ( rule__ToReferenceEntitySpec__Group__2__Impl )
            // InternalSkiql.g:3542:2: rule__ToReferenceEntitySpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToReferenceEntitySpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ToReferenceEntitySpec__Group__2"


    // $ANTLR start "rule__ToReferenceEntitySpec__Group__2__Impl"
    // InternalSkiql.g:3548:1: rule__ToReferenceEntitySpec__Group__2__Impl : ( ( rule__ToReferenceEntitySpec__VariationFilterAssignment_2 )? ) ;
    public final void rule__ToReferenceEntitySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3552:1: ( ( ( rule__ToReferenceEntitySpec__VariationFilterAssignment_2 )? ) )
            // InternalSkiql.g:3553:1: ( ( rule__ToReferenceEntitySpec__VariationFilterAssignment_2 )? )
            {
            // InternalSkiql.g:3553:1: ( ( rule__ToReferenceEntitySpec__VariationFilterAssignment_2 )? )
            // InternalSkiql.g:3554:2: ( rule__ToReferenceEntitySpec__VariationFilterAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToReferenceEntitySpecAccess().getVariationFilterAssignment_2()); 
            }
            // InternalSkiql.g:3555:2: ( rule__ToReferenceEntitySpec__VariationFilterAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13||LA39_0==28) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSkiql.g:3555:3: rule__ToReferenceEntitySpec__VariationFilterAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ToReferenceEntitySpec__VariationFilterAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToReferenceEntitySpecAccess().getVariationFilterAssignment_2()); 
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
    // $ANTLR end "rule__ToReferenceEntitySpec__Group__2__Impl"


    // $ANTLR start "rule__ReferenceVariationFilter__Group__0"
    // InternalSkiql.g:3564:1: rule__ReferenceVariationFilter__Group__0 : rule__ReferenceVariationFilter__Group__0__Impl rule__ReferenceVariationFilter__Group__1 ;
    public final void rule__ReferenceVariationFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3568:1: ( rule__ReferenceVariationFilter__Group__0__Impl rule__ReferenceVariationFilter__Group__1 )
            // InternalSkiql.g:3569:2: rule__ReferenceVariationFilter__Group__0__Impl rule__ReferenceVariationFilter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ReferenceVariationFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceVariationFilter__Group__0"


    // $ANTLR start "rule__ReferenceVariationFilter__Group__0__Impl"
    // InternalSkiql.g:3576:1: rule__ReferenceVariationFilter__Group__0__Impl : ( () ) ;
    public final void rule__ReferenceVariationFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3580:1: ( ( () ) )
            // InternalSkiql.g:3581:1: ( () )
            {
            // InternalSkiql.g:3581:1: ( () )
            // InternalSkiql.g:3582:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getVariationFilterAction_0()); 
            }
            // InternalSkiql.g:3583:2: ()
            // InternalSkiql.g:3583:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getVariationFilterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceVariationFilter__Group__0__Impl"


    // $ANTLR start "rule__ReferenceVariationFilter__Group__1"
    // InternalSkiql.g:3591:1: rule__ReferenceVariationFilter__Group__1 : rule__ReferenceVariationFilter__Group__1__Impl ;
    public final void rule__ReferenceVariationFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3595:1: ( rule__ReferenceVariationFilter__Group__1__Impl )
            // InternalSkiql.g:3596:2: rule__ReferenceVariationFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceVariationFilter__Group__1"


    // $ANTLR start "rule__ReferenceVariationFilter__Group__1__Impl"
    // InternalSkiql.g:3602:1: rule__ReferenceVariationFilter__Group__1__Impl : ( ( rule__ReferenceVariationFilter__Alternatives_1 ) ) ;
    public final void rule__ReferenceVariationFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3606:1: ( ( ( rule__ReferenceVariationFilter__Alternatives_1 ) ) )
            // InternalSkiql.g:3607:1: ( ( rule__ReferenceVariationFilter__Alternatives_1 ) )
            {
            // InternalSkiql.g:3607:1: ( ( rule__ReferenceVariationFilter__Alternatives_1 ) )
            // InternalSkiql.g:3608:2: ( rule__ReferenceVariationFilter__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getAlternatives_1()); 
            }
            // InternalSkiql.g:3609:2: ( rule__ReferenceVariationFilter__Alternatives_1 )
            // InternalSkiql.g:3609:3: rule__ReferenceVariationFilter__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__Group__1__Impl"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1__0"
    // InternalSkiql.g:3618:1: rule__ReferenceVariationFilter__Group_1_1__0 : rule__ReferenceVariationFilter__Group_1_1__0__Impl rule__ReferenceVariationFilter__Group_1_1__1 ;
    public final void rule__ReferenceVariationFilter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3622:1: ( rule__ReferenceVariationFilter__Group_1_1__0__Impl rule__ReferenceVariationFilter__Group_1_1__1 )
            // InternalSkiql.g:3623:2: rule__ReferenceVariationFilter__Group_1_1__0__Impl rule__ReferenceVariationFilter__Group_1_1__1
            {
            pushFollow(FOLLOW_26);
            rule__ReferenceVariationFilter__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1__0"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1__0__Impl"
    // InternalSkiql.g:3630:1: rule__ReferenceVariationFilter__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__ReferenceVariationFilter__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3634:1: ( ( '[' ) )
            // InternalSkiql.g:3635:1: ( '[' )
            {
            // InternalSkiql.g:3635:1: ( '[' )
            // InternalSkiql.g:3636:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getLeftSquareBracketKeyword_1_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getLeftSquareBracketKeyword_1_1_0()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1__0__Impl"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1__1"
    // InternalSkiql.g:3645:1: rule__ReferenceVariationFilter__Group_1_1__1 : rule__ReferenceVariationFilter__Group_1_1__1__Impl rule__ReferenceVariationFilter__Group_1_1__2 ;
    public final void rule__ReferenceVariationFilter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3649:1: ( rule__ReferenceVariationFilter__Group_1_1__1__Impl rule__ReferenceVariationFilter__Group_1_1__2 )
            // InternalSkiql.g:3650:2: rule__ReferenceVariationFilter__Group_1_1__1__Impl rule__ReferenceVariationFilter__Group_1_1__2
            {
            pushFollow(FOLLOW_26);
            rule__ReferenceVariationFilter__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1__1"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1__1__Impl"
    // InternalSkiql.g:3657:1: rule__ReferenceVariationFilter__Group_1_1__1__Impl : ( ( rule__ReferenceVariationFilter__Group_1_1_1__0 )? ) ;
    public final void rule__ReferenceVariationFilter__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3661:1: ( ( ( rule__ReferenceVariationFilter__Group_1_1_1__0 )? ) )
            // InternalSkiql.g:3662:1: ( ( rule__ReferenceVariationFilter__Group_1_1_1__0 )? )
            {
            // InternalSkiql.g:3662:1: ( ( rule__ReferenceVariationFilter__Group_1_1_1__0 )? )
            // InternalSkiql.g:3663:2: ( rule__ReferenceVariationFilter__Group_1_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getGroup_1_1_1()); 
            }
            // InternalSkiql.g:3664:2: ( rule__ReferenceVariationFilter__Group_1_1_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==11) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSkiql.g:3664:3: rule__ReferenceVariationFilter__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceVariationFilter__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getGroup_1_1_1()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1__1__Impl"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1__2"
    // InternalSkiql.g:3672:1: rule__ReferenceVariationFilter__Group_1_1__2 : rule__ReferenceVariationFilter__Group_1_1__2__Impl ;
    public final void rule__ReferenceVariationFilter__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3676:1: ( rule__ReferenceVariationFilter__Group_1_1__2__Impl )
            // InternalSkiql.g:3677:2: rule__ReferenceVariationFilter__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1__2"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1__2__Impl"
    // InternalSkiql.g:3683:1: rule__ReferenceVariationFilter__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__ReferenceVariationFilter__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3687:1: ( ( ']' ) )
            // InternalSkiql.g:3688:1: ( ']' )
            {
            // InternalSkiql.g:3688:1: ( ']' )
            // InternalSkiql.g:3689:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getRightSquareBracketKeyword_1_1_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getRightSquareBracketKeyword_1_1_2()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1__2__Impl"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1_1__0"
    // InternalSkiql.g:3699:1: rule__ReferenceVariationFilter__Group_1_1_1__0 : rule__ReferenceVariationFilter__Group_1_1_1__0__Impl rule__ReferenceVariationFilter__Group_1_1_1__1 ;
    public final void rule__ReferenceVariationFilter__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3703:1: ( rule__ReferenceVariationFilter__Group_1_1_1__0__Impl rule__ReferenceVariationFilter__Group_1_1_1__1 )
            // InternalSkiql.g:3704:2: rule__ReferenceVariationFilter__Group_1_1_1__0__Impl rule__ReferenceVariationFilter__Group_1_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ReferenceVariationFilter__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1_1__0"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1_1__0__Impl"
    // InternalSkiql.g:3711:1: rule__ReferenceVariationFilter__Group_1_1_1__0__Impl : ( ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0 ) ) ;
    public final void rule__ReferenceVariationFilter__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3715:1: ( ( ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0 ) ) )
            // InternalSkiql.g:3716:1: ( ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0 ) )
            {
            // InternalSkiql.g:3716:1: ( ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0 ) )
            // InternalSkiql.g:3717:2: ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsAssignment_1_1_1_0()); 
            }
            // InternalSkiql.g:3718:2: ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0 )
            // InternalSkiql.g:3718:3: rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsAssignment_1_1_1_0()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1_1__1"
    // InternalSkiql.g:3726:1: rule__ReferenceVariationFilter__Group_1_1_1__1 : rule__ReferenceVariationFilter__Group_1_1_1__1__Impl ;
    public final void rule__ReferenceVariationFilter__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3730:1: ( rule__ReferenceVariationFilter__Group_1_1_1__1__Impl )
            // InternalSkiql.g:3731:2: rule__ReferenceVariationFilter__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1_1__1"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1_1__1__Impl"
    // InternalSkiql.g:3737:1: rule__ReferenceVariationFilter__Group_1_1_1__1__Impl : ( ( rule__ReferenceVariationFilter__Group_1_1_1_1__0 )* ) ;
    public final void rule__ReferenceVariationFilter__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3741:1: ( ( ( rule__ReferenceVariationFilter__Group_1_1_1_1__0 )* ) )
            // InternalSkiql.g:3742:1: ( ( rule__ReferenceVariationFilter__Group_1_1_1_1__0 )* )
            {
            // InternalSkiql.g:3742:1: ( ( rule__ReferenceVariationFilter__Group_1_1_1_1__0 )* )
            // InternalSkiql.g:3743:2: ( rule__ReferenceVariationFilter__Group_1_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getGroup_1_1_1_1()); 
            }
            // InternalSkiql.g:3744:2: ( rule__ReferenceVariationFilter__Group_1_1_1_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==25) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSkiql.g:3744:3: rule__ReferenceVariationFilter__Group_1_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ReferenceVariationFilter__Group_1_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getGroup_1_1_1_1()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1_1_1__0"
    // InternalSkiql.g:3753:1: rule__ReferenceVariationFilter__Group_1_1_1_1__0 : rule__ReferenceVariationFilter__Group_1_1_1_1__0__Impl rule__ReferenceVariationFilter__Group_1_1_1_1__1 ;
    public final void rule__ReferenceVariationFilter__Group_1_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3757:1: ( rule__ReferenceVariationFilter__Group_1_1_1_1__0__Impl rule__ReferenceVariationFilter__Group_1_1_1_1__1 )
            // InternalSkiql.g:3758:2: rule__ReferenceVariationFilter__Group_1_1_1_1__0__Impl rule__ReferenceVariationFilter__Group_1_1_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceVariationFilter__Group_1_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group_1_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1_1_1__0"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1_1_1__0__Impl"
    // InternalSkiql.g:3765:1: rule__ReferenceVariationFilter__Group_1_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__ReferenceVariationFilter__Group_1_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3769:1: ( ( ',' ) )
            // InternalSkiql.g:3770:1: ( ',' )
            {
            // InternalSkiql.g:3770:1: ( ',' )
            // InternalSkiql.g:3771:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getCommaKeyword_1_1_1_1_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getCommaKeyword_1_1_1_1_0()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1_1_1__0__Impl"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1_1_1__1"
    // InternalSkiql.g:3780:1: rule__ReferenceVariationFilter__Group_1_1_1_1__1 : rule__ReferenceVariationFilter__Group_1_1_1_1__1__Impl ;
    public final void rule__ReferenceVariationFilter__Group_1_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3784:1: ( rule__ReferenceVariationFilter__Group_1_1_1_1__1__Impl )
            // InternalSkiql.g:3785:2: rule__ReferenceVariationFilter__Group_1_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__Group_1_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1_1_1__1"


    // $ANTLR start "rule__ReferenceVariationFilter__Group_1_1_1_1__1__Impl"
    // InternalSkiql.g:3791:1: rule__ReferenceVariationFilter__Group_1_1_1_1__1__Impl : ( ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1 ) ) ;
    public final void rule__ReferenceVariationFilter__Group_1_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3795:1: ( ( ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1 ) ) )
            // InternalSkiql.g:3796:1: ( ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1 ) )
            {
            // InternalSkiql.g:3796:1: ( ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1 ) )
            // InternalSkiql.g:3797:2: ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsAssignment_1_1_1_1_1()); 
            }
            // InternalSkiql.g:3798:2: ( rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1 )
            // InternalSkiql.g:3798:3: rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsAssignment_1_1_1_1_1()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__Group_1_1_1_1__1__Impl"


    // $ANTLR start "rule__ReferencePropertySpec__Group__0"
    // InternalSkiql.g:3807:1: rule__ReferencePropertySpec__Group__0 : rule__ReferencePropertySpec__Group__0__Impl rule__ReferencePropertySpec__Group__1 ;
    public final void rule__ReferencePropertySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3811:1: ( rule__ReferencePropertySpec__Group__0__Impl rule__ReferencePropertySpec__Group__1 )
            // InternalSkiql.g:3812:2: rule__ReferencePropertySpec__Group__0__Impl rule__ReferencePropertySpec__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ReferencePropertySpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferencePropertySpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferencePropertySpec__Group__0"


    // $ANTLR start "rule__ReferencePropertySpec__Group__0__Impl"
    // InternalSkiql.g:3819:1: rule__ReferencePropertySpec__Group__0__Impl : ( () ) ;
    public final void rule__ReferencePropertySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3823:1: ( ( () ) )
            // InternalSkiql.g:3824:1: ( () )
            {
            // InternalSkiql.g:3824:1: ( () )
            // InternalSkiql.g:3825:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertySpecAccess().getPropertySpecAction_0()); 
            }
            // InternalSkiql.g:3826:2: ()
            // InternalSkiql.g:3826:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertySpecAccess().getPropertySpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePropertySpec__Group__0__Impl"


    // $ANTLR start "rule__ReferencePropertySpec__Group__1"
    // InternalSkiql.g:3834:1: rule__ReferencePropertySpec__Group__1 : rule__ReferencePropertySpec__Group__1__Impl rule__ReferencePropertySpec__Group__2 ;
    public final void rule__ReferencePropertySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3838:1: ( rule__ReferencePropertySpec__Group__1__Impl rule__ReferencePropertySpec__Group__2 )
            // InternalSkiql.g:3839:2: rule__ReferencePropertySpec__Group__1__Impl rule__ReferencePropertySpec__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ReferencePropertySpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferencePropertySpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferencePropertySpec__Group__1"


    // $ANTLR start "rule__ReferencePropertySpec__Group__1__Impl"
    // InternalSkiql.g:3846:1: rule__ReferencePropertySpec__Group__1__Impl : ( ( rule__ReferencePropertySpec__NameAssignment_1 ) ) ;
    public final void rule__ReferencePropertySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3850:1: ( ( ( rule__ReferencePropertySpec__NameAssignment_1 ) ) )
            // InternalSkiql.g:3851:1: ( ( rule__ReferencePropertySpec__NameAssignment_1 ) )
            {
            // InternalSkiql.g:3851:1: ( ( rule__ReferencePropertySpec__NameAssignment_1 ) )
            // InternalSkiql.g:3852:2: ( rule__ReferencePropertySpec__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertySpecAccess().getNameAssignment_1()); 
            }
            // InternalSkiql.g:3853:2: ( rule__ReferencePropertySpec__NameAssignment_1 )
            // InternalSkiql.g:3853:3: rule__ReferencePropertySpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePropertySpec__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertySpecAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ReferencePropertySpec__Group__1__Impl"


    // $ANTLR start "rule__ReferencePropertySpec__Group__2"
    // InternalSkiql.g:3861:1: rule__ReferencePropertySpec__Group__2 : rule__ReferencePropertySpec__Group__2__Impl ;
    public final void rule__ReferencePropertySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3865:1: ( rule__ReferencePropertySpec__Group__2__Impl )
            // InternalSkiql.g:3866:2: rule__ReferencePropertySpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePropertySpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferencePropertySpec__Group__2"


    // $ANTLR start "rule__ReferencePropertySpec__Group__2__Impl"
    // InternalSkiql.g:3872:1: rule__ReferencePropertySpec__Group__2__Impl : ( ( rule__ReferencePropertySpec__Group_2__0 )? ) ;
    public final void rule__ReferencePropertySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3876:1: ( ( ( rule__ReferencePropertySpec__Group_2__0 )? ) )
            // InternalSkiql.g:3877:1: ( ( rule__ReferencePropertySpec__Group_2__0 )? )
            {
            // InternalSkiql.g:3877:1: ( ( rule__ReferencePropertySpec__Group_2__0 )? )
            // InternalSkiql.g:3878:2: ( rule__ReferencePropertySpec__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertySpecAccess().getGroup_2()); 
            }
            // InternalSkiql.g:3879:2: ( rule__ReferencePropertySpec__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSkiql.g:3879:3: rule__ReferencePropertySpec__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferencePropertySpec__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertySpecAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ReferencePropertySpec__Group__2__Impl"


    // $ANTLR start "rule__ReferencePropertySpec__Group_2__0"
    // InternalSkiql.g:3888:1: rule__ReferencePropertySpec__Group_2__0 : rule__ReferencePropertySpec__Group_2__0__Impl rule__ReferencePropertySpec__Group_2__1 ;
    public final void rule__ReferencePropertySpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3892:1: ( rule__ReferencePropertySpec__Group_2__0__Impl rule__ReferencePropertySpec__Group_2__1 )
            // InternalSkiql.g:3893:2: rule__ReferencePropertySpec__Group_2__0__Impl rule__ReferencePropertySpec__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__ReferencePropertySpec__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferencePropertySpec__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferencePropertySpec__Group_2__0"


    // $ANTLR start "rule__ReferencePropertySpec__Group_2__0__Impl"
    // InternalSkiql.g:3900:1: rule__ReferencePropertySpec__Group_2__0__Impl : ( ':' ) ;
    public final void rule__ReferencePropertySpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3904:1: ( ( ':' ) )
            // InternalSkiql.g:3905:1: ( ':' )
            {
            // InternalSkiql.g:3905:1: ( ':' )
            // InternalSkiql.g:3906:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertySpecAccess().getColonKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertySpecAccess().getColonKeyword_2_0()); 
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
    // $ANTLR end "rule__ReferencePropertySpec__Group_2__0__Impl"


    // $ANTLR start "rule__ReferencePropertySpec__Group_2__1"
    // InternalSkiql.g:3915:1: rule__ReferencePropertySpec__Group_2__1 : rule__ReferencePropertySpec__Group_2__1__Impl ;
    public final void rule__ReferencePropertySpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3919:1: ( rule__ReferencePropertySpec__Group_2__1__Impl )
            // InternalSkiql.g:3920:2: rule__ReferencePropertySpec__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePropertySpec__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferencePropertySpec__Group_2__1"


    // $ANTLR start "rule__ReferencePropertySpec__Group_2__1__Impl"
    // InternalSkiql.g:3926:1: rule__ReferencePropertySpec__Group_2__1__Impl : ( ( rule__ReferencePropertySpec__TypeAssignment_2_1 ) ) ;
    public final void rule__ReferencePropertySpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3930:1: ( ( ( rule__ReferencePropertySpec__TypeAssignment_2_1 ) ) )
            // InternalSkiql.g:3931:1: ( ( rule__ReferencePropertySpec__TypeAssignment_2_1 ) )
            {
            // InternalSkiql.g:3931:1: ( ( rule__ReferencePropertySpec__TypeAssignment_2_1 ) )
            // InternalSkiql.g:3932:2: ( rule__ReferencePropertySpec__TypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertySpecAccess().getTypeAssignment_2_1()); 
            }
            // InternalSkiql.g:3933:2: ( rule__ReferencePropertySpec__TypeAssignment_2_1 )
            // InternalSkiql.g:3933:3: rule__ReferencePropertySpec__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePropertySpec__TypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertySpecAccess().getTypeAssignment_2_1()); 
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
    // $ANTLR end "rule__ReferencePropertySpec__Group_2__1__Impl"


    // $ANTLR start "rule__VariationFilter__Group__0"
    // InternalSkiql.g:3942:1: rule__VariationFilter__Group__0 : rule__VariationFilter__Group__0__Impl rule__VariationFilter__Group__1 ;
    public final void rule__VariationFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3946:1: ( rule__VariationFilter__Group__0__Impl rule__VariationFilter__Group__1 )
            // InternalSkiql.g:3947:2: rule__VariationFilter__Group__0__Impl rule__VariationFilter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__VariationFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group__0"


    // $ANTLR start "rule__VariationFilter__Group__0__Impl"
    // InternalSkiql.g:3954:1: rule__VariationFilter__Group__0__Impl : ( () ) ;
    public final void rule__VariationFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3958:1: ( ( () ) )
            // InternalSkiql.g:3959:1: ( () )
            {
            // InternalSkiql.g:3959:1: ( () )
            // InternalSkiql.g:3960:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getVariationFilterAction_0()); 
            }
            // InternalSkiql.g:3961:2: ()
            // InternalSkiql.g:3961:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getVariationFilterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariationFilter__Group__0__Impl"


    // $ANTLR start "rule__VariationFilter__Group__1"
    // InternalSkiql.g:3969:1: rule__VariationFilter__Group__1 : rule__VariationFilter__Group__1__Impl ;
    public final void rule__VariationFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3973:1: ( rule__VariationFilter__Group__1__Impl )
            // InternalSkiql.g:3974:2: rule__VariationFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group__1"


    // $ANTLR start "rule__VariationFilter__Group__1__Impl"
    // InternalSkiql.g:3980:1: rule__VariationFilter__Group__1__Impl : ( ( rule__VariationFilter__Alternatives_1 ) ) ;
    public final void rule__VariationFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:3984:1: ( ( ( rule__VariationFilter__Alternatives_1 ) ) )
            // InternalSkiql.g:3985:1: ( ( rule__VariationFilter__Alternatives_1 ) )
            {
            // InternalSkiql.g:3985:1: ( ( rule__VariationFilter__Alternatives_1 ) )
            // InternalSkiql.g:3986:2: ( rule__VariationFilter__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getAlternatives_1()); 
            }
            // InternalSkiql.g:3987:2: ( rule__VariationFilter__Alternatives_1 )
            // InternalSkiql.g:3987:3: rule__VariationFilter__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__VariationFilter__Group__1__Impl"


    // $ANTLR start "rule__VariationFilter__Group_1_1__0"
    // InternalSkiql.g:3996:1: rule__VariationFilter__Group_1_1__0 : rule__VariationFilter__Group_1_1__0__Impl rule__VariationFilter__Group_1_1__1 ;
    public final void rule__VariationFilter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4000:1: ( rule__VariationFilter__Group_1_1__0__Impl rule__VariationFilter__Group_1_1__1 )
            // InternalSkiql.g:4001:2: rule__VariationFilter__Group_1_1__0__Impl rule__VariationFilter__Group_1_1__1
            {
            pushFollow(FOLLOW_26);
            rule__VariationFilter__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group_1_1__0"


    // $ANTLR start "rule__VariationFilter__Group_1_1__0__Impl"
    // InternalSkiql.g:4008:1: rule__VariationFilter__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__VariationFilter__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4012:1: ( ( '[' ) )
            // InternalSkiql.g:4013:1: ( '[' )
            {
            // InternalSkiql.g:4013:1: ( '[' )
            // InternalSkiql.g:4014:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getLeftSquareBracketKeyword_1_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getLeftSquareBracketKeyword_1_1_0()); 
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
    // $ANTLR end "rule__VariationFilter__Group_1_1__0__Impl"


    // $ANTLR start "rule__VariationFilter__Group_1_1__1"
    // InternalSkiql.g:4023:1: rule__VariationFilter__Group_1_1__1 : rule__VariationFilter__Group_1_1__1__Impl rule__VariationFilter__Group_1_1__2 ;
    public final void rule__VariationFilter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4027:1: ( rule__VariationFilter__Group_1_1__1__Impl rule__VariationFilter__Group_1_1__2 )
            // InternalSkiql.g:4028:2: rule__VariationFilter__Group_1_1__1__Impl rule__VariationFilter__Group_1_1__2
            {
            pushFollow(FOLLOW_26);
            rule__VariationFilter__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group_1_1__1"


    // $ANTLR start "rule__VariationFilter__Group_1_1__1__Impl"
    // InternalSkiql.g:4035:1: rule__VariationFilter__Group_1_1__1__Impl : ( ( rule__VariationFilter__Group_1_1_1__0 )? ) ;
    public final void rule__VariationFilter__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4039:1: ( ( ( rule__VariationFilter__Group_1_1_1__0 )? ) )
            // InternalSkiql.g:4040:1: ( ( rule__VariationFilter__Group_1_1_1__0 )? )
            {
            // InternalSkiql.g:4040:1: ( ( rule__VariationFilter__Group_1_1_1__0 )? )
            // InternalSkiql.g:4041:2: ( rule__VariationFilter__Group_1_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getGroup_1_1_1()); 
            }
            // InternalSkiql.g:4042:2: ( rule__VariationFilter__Group_1_1_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==11) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSkiql.g:4042:3: rule__VariationFilter__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariationFilter__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getGroup_1_1_1()); 
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
    // $ANTLR end "rule__VariationFilter__Group_1_1__1__Impl"


    // $ANTLR start "rule__VariationFilter__Group_1_1__2"
    // InternalSkiql.g:4050:1: rule__VariationFilter__Group_1_1__2 : rule__VariationFilter__Group_1_1__2__Impl rule__VariationFilter__Group_1_1__3 ;
    public final void rule__VariationFilter__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4054:1: ( rule__VariationFilter__Group_1_1__2__Impl rule__VariationFilter__Group_1_1__3 )
            // InternalSkiql.g:4055:2: rule__VariationFilter__Group_1_1__2__Impl rule__VariationFilter__Group_1_1__3
            {
            pushFollow(FOLLOW_29);
            rule__VariationFilter__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group_1_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group_1_1__2"


    // $ANTLR start "rule__VariationFilter__Group_1_1__2__Impl"
    // InternalSkiql.g:4062:1: rule__VariationFilter__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__VariationFilter__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4066:1: ( ( ']' ) )
            // InternalSkiql.g:4067:1: ( ']' )
            {
            // InternalSkiql.g:4067:1: ( ']' )
            // InternalSkiql.g:4068:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getRightSquareBracketKeyword_1_1_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getRightSquareBracketKeyword_1_1_2()); 
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
    // $ANTLR end "rule__VariationFilter__Group_1_1__2__Impl"


    // $ANTLR start "rule__VariationFilter__Group_1_1__3"
    // InternalSkiql.g:4077:1: rule__VariationFilter__Group_1_1__3 : rule__VariationFilter__Group_1_1__3__Impl ;
    public final void rule__VariationFilter__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4081:1: ( rule__VariationFilter__Group_1_1__3__Impl )
            // InternalSkiql.g:4082:2: rule__VariationFilter__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group_1_1__3"


    // $ANTLR start "rule__VariationFilter__Group_1_1__3__Impl"
    // InternalSkiql.g:4088:1: rule__VariationFilter__Group_1_1__3__Impl : ( ( rule__VariationFilter__OnlyAssignment_1_1_3 )? ) ;
    public final void rule__VariationFilter__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4092:1: ( ( ( rule__VariationFilter__OnlyAssignment_1_1_3 )? ) )
            // InternalSkiql.g:4093:1: ( ( rule__VariationFilter__OnlyAssignment_1_1_3 )? )
            {
            // InternalSkiql.g:4093:1: ( ( rule__VariationFilter__OnlyAssignment_1_1_3 )? )
            // InternalSkiql.g:4094:2: ( rule__VariationFilter__OnlyAssignment_1_1_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getOnlyAssignment_1_1_3()); 
            }
            // InternalSkiql.g:4095:2: ( rule__VariationFilter__OnlyAssignment_1_1_3 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSkiql.g:4095:3: rule__VariationFilter__OnlyAssignment_1_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariationFilter__OnlyAssignment_1_1_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getOnlyAssignment_1_1_3()); 
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
    // $ANTLR end "rule__VariationFilter__Group_1_1__3__Impl"


    // $ANTLR start "rule__VariationFilter__Group_1_1_1__0"
    // InternalSkiql.g:4104:1: rule__VariationFilter__Group_1_1_1__0 : rule__VariationFilter__Group_1_1_1__0__Impl rule__VariationFilter__Group_1_1_1__1 ;
    public final void rule__VariationFilter__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4108:1: ( rule__VariationFilter__Group_1_1_1__0__Impl rule__VariationFilter__Group_1_1_1__1 )
            // InternalSkiql.g:4109:2: rule__VariationFilter__Group_1_1_1__0__Impl rule__VariationFilter__Group_1_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__VariationFilter__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group_1_1_1__0"


    // $ANTLR start "rule__VariationFilter__Group_1_1_1__0__Impl"
    // InternalSkiql.g:4116:1: rule__VariationFilter__Group_1_1_1__0__Impl : ( ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_0 ) ) ;
    public final void rule__VariationFilter__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4120:1: ( ( ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_0 ) ) )
            // InternalSkiql.g:4121:1: ( ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_0 ) )
            {
            // InternalSkiql.g:4121:1: ( ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_0 ) )
            // InternalSkiql.g:4122:2: ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getPropertySpecsAssignment_1_1_1_0()); 
            }
            // InternalSkiql.g:4123:2: ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_0 )
            // InternalSkiql.g:4123:3: rule__VariationFilter__PropertySpecsAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VariationFilter__PropertySpecsAssignment_1_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getPropertySpecsAssignment_1_1_1_0()); 
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
    // $ANTLR end "rule__VariationFilter__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__VariationFilter__Group_1_1_1__1"
    // InternalSkiql.g:4131:1: rule__VariationFilter__Group_1_1_1__1 : rule__VariationFilter__Group_1_1_1__1__Impl ;
    public final void rule__VariationFilter__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4135:1: ( rule__VariationFilter__Group_1_1_1__1__Impl )
            // InternalSkiql.g:4136:2: rule__VariationFilter__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group_1_1_1__1"


    // $ANTLR start "rule__VariationFilter__Group_1_1_1__1__Impl"
    // InternalSkiql.g:4142:1: rule__VariationFilter__Group_1_1_1__1__Impl : ( ( rule__VariationFilter__Group_1_1_1_1__0 )* ) ;
    public final void rule__VariationFilter__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4146:1: ( ( ( rule__VariationFilter__Group_1_1_1_1__0 )* ) )
            // InternalSkiql.g:4147:1: ( ( rule__VariationFilter__Group_1_1_1_1__0 )* )
            {
            // InternalSkiql.g:4147:1: ( ( rule__VariationFilter__Group_1_1_1_1__0 )* )
            // InternalSkiql.g:4148:2: ( rule__VariationFilter__Group_1_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getGroup_1_1_1_1()); 
            }
            // InternalSkiql.g:4149:2: ( rule__VariationFilter__Group_1_1_1_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==25) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSkiql.g:4149:3: rule__VariationFilter__Group_1_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VariationFilter__Group_1_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getGroup_1_1_1_1()); 
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
    // $ANTLR end "rule__VariationFilter__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__VariationFilter__Group_1_1_1_1__0"
    // InternalSkiql.g:4158:1: rule__VariationFilter__Group_1_1_1_1__0 : rule__VariationFilter__Group_1_1_1_1__0__Impl rule__VariationFilter__Group_1_1_1_1__1 ;
    public final void rule__VariationFilter__Group_1_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4162:1: ( rule__VariationFilter__Group_1_1_1_1__0__Impl rule__VariationFilter__Group_1_1_1_1__1 )
            // InternalSkiql.g:4163:2: rule__VariationFilter__Group_1_1_1_1__0__Impl rule__VariationFilter__Group_1_1_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__VariationFilter__Group_1_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group_1_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group_1_1_1_1__0"


    // $ANTLR start "rule__VariationFilter__Group_1_1_1_1__0__Impl"
    // InternalSkiql.g:4170:1: rule__VariationFilter__Group_1_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__VariationFilter__Group_1_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4174:1: ( ( ',' ) )
            // InternalSkiql.g:4175:1: ( ',' )
            {
            // InternalSkiql.g:4175:1: ( ',' )
            // InternalSkiql.g:4176:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getCommaKeyword_1_1_1_1_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getCommaKeyword_1_1_1_1_0()); 
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
    // $ANTLR end "rule__VariationFilter__Group_1_1_1_1__0__Impl"


    // $ANTLR start "rule__VariationFilter__Group_1_1_1_1__1"
    // InternalSkiql.g:4185:1: rule__VariationFilter__Group_1_1_1_1__1 : rule__VariationFilter__Group_1_1_1_1__1__Impl ;
    public final void rule__VariationFilter__Group_1_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4189:1: ( rule__VariationFilter__Group_1_1_1_1__1__Impl )
            // InternalSkiql.g:4190:2: rule__VariationFilter__Group_1_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariationFilter__Group_1_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariationFilter__Group_1_1_1_1__1"


    // $ANTLR start "rule__VariationFilter__Group_1_1_1_1__1__Impl"
    // InternalSkiql.g:4196:1: rule__VariationFilter__Group_1_1_1_1__1__Impl : ( ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1 ) ) ;
    public final void rule__VariationFilter__Group_1_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4200:1: ( ( ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1 ) ) )
            // InternalSkiql.g:4201:1: ( ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1 ) )
            {
            // InternalSkiql.g:4201:1: ( ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1 ) )
            // InternalSkiql.g:4202:2: ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getPropertySpecsAssignment_1_1_1_1_1()); 
            }
            // InternalSkiql.g:4203:2: ( rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1 )
            // InternalSkiql.g:4203:3: rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getPropertySpecsAssignment_1_1_1_1_1()); 
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
    // $ANTLR end "rule__VariationFilter__Group_1_1_1_1__1__Impl"


    // $ANTLR start "rule__PropertySpec__Group__0"
    // InternalSkiql.g:4212:1: rule__PropertySpec__Group__0 : rule__PropertySpec__Group__0__Impl rule__PropertySpec__Group__1 ;
    public final void rule__PropertySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4216:1: ( rule__PropertySpec__Group__0__Impl rule__PropertySpec__Group__1 )
            // InternalSkiql.g:4217:2: rule__PropertySpec__Group__0__Impl rule__PropertySpec__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PropertySpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertySpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertySpec__Group__0"


    // $ANTLR start "rule__PropertySpec__Group__0__Impl"
    // InternalSkiql.g:4224:1: rule__PropertySpec__Group__0__Impl : ( () ) ;
    public final void rule__PropertySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4228:1: ( ( () ) )
            // InternalSkiql.g:4229:1: ( () )
            {
            // InternalSkiql.g:4229:1: ( () )
            // InternalSkiql.g:4230:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySpecAccess().getPropertySpecAction_0()); 
            }
            // InternalSkiql.g:4231:2: ()
            // InternalSkiql.g:4231:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySpecAccess().getPropertySpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySpec__Group__0__Impl"


    // $ANTLR start "rule__PropertySpec__Group__1"
    // InternalSkiql.g:4239:1: rule__PropertySpec__Group__1 : rule__PropertySpec__Group__1__Impl rule__PropertySpec__Group__2 ;
    public final void rule__PropertySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4243:1: ( rule__PropertySpec__Group__1__Impl rule__PropertySpec__Group__2 )
            // InternalSkiql.g:4244:2: rule__PropertySpec__Group__1__Impl rule__PropertySpec__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__PropertySpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertySpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertySpec__Group__1"


    // $ANTLR start "rule__PropertySpec__Group__1__Impl"
    // InternalSkiql.g:4251:1: rule__PropertySpec__Group__1__Impl : ( ( rule__PropertySpec__NameAssignment_1 ) ) ;
    public final void rule__PropertySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4255:1: ( ( ( rule__PropertySpec__NameAssignment_1 ) ) )
            // InternalSkiql.g:4256:1: ( ( rule__PropertySpec__NameAssignment_1 ) )
            {
            // InternalSkiql.g:4256:1: ( ( rule__PropertySpec__NameAssignment_1 ) )
            // InternalSkiql.g:4257:2: ( rule__PropertySpec__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySpecAccess().getNameAssignment_1()); 
            }
            // InternalSkiql.g:4258:2: ( rule__PropertySpec__NameAssignment_1 )
            // InternalSkiql.g:4258:3: rule__PropertySpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertySpec__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySpecAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PropertySpec__Group__1__Impl"


    // $ANTLR start "rule__PropertySpec__Group__2"
    // InternalSkiql.g:4266:1: rule__PropertySpec__Group__2 : rule__PropertySpec__Group__2__Impl ;
    public final void rule__PropertySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4270:1: ( rule__PropertySpec__Group__2__Impl )
            // InternalSkiql.g:4271:2: rule__PropertySpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertySpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertySpec__Group__2"


    // $ANTLR start "rule__PropertySpec__Group__2__Impl"
    // InternalSkiql.g:4277:1: rule__PropertySpec__Group__2__Impl : ( ( rule__PropertySpec__Group_2__0 )? ) ;
    public final void rule__PropertySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4281:1: ( ( ( rule__PropertySpec__Group_2__0 )? ) )
            // InternalSkiql.g:4282:1: ( ( rule__PropertySpec__Group_2__0 )? )
            {
            // InternalSkiql.g:4282:1: ( ( rule__PropertySpec__Group_2__0 )? )
            // InternalSkiql.g:4283:2: ( rule__PropertySpec__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySpecAccess().getGroup_2()); 
            }
            // InternalSkiql.g:4284:2: ( rule__PropertySpec__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSkiql.g:4284:3: rule__PropertySpec__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertySpec__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySpecAccess().getGroup_2()); 
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
    // $ANTLR end "rule__PropertySpec__Group__2__Impl"


    // $ANTLR start "rule__PropertySpec__Group_2__0"
    // InternalSkiql.g:4293:1: rule__PropertySpec__Group_2__0 : rule__PropertySpec__Group_2__0__Impl rule__PropertySpec__Group_2__1 ;
    public final void rule__PropertySpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4297:1: ( rule__PropertySpec__Group_2__0__Impl rule__PropertySpec__Group_2__1 )
            // InternalSkiql.g:4298:2: rule__PropertySpec__Group_2__0__Impl rule__PropertySpec__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__PropertySpec__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertySpec__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertySpec__Group_2__0"


    // $ANTLR start "rule__PropertySpec__Group_2__0__Impl"
    // InternalSkiql.g:4305:1: rule__PropertySpec__Group_2__0__Impl : ( ':' ) ;
    public final void rule__PropertySpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4309:1: ( ( ':' ) )
            // InternalSkiql.g:4310:1: ( ':' )
            {
            // InternalSkiql.g:4310:1: ( ':' )
            // InternalSkiql.g:4311:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySpecAccess().getColonKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySpecAccess().getColonKeyword_2_0()); 
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
    // $ANTLR end "rule__PropertySpec__Group_2__0__Impl"


    // $ANTLR start "rule__PropertySpec__Group_2__1"
    // InternalSkiql.g:4320:1: rule__PropertySpec__Group_2__1 : rule__PropertySpec__Group_2__1__Impl ;
    public final void rule__PropertySpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4324:1: ( rule__PropertySpec__Group_2__1__Impl )
            // InternalSkiql.g:4325:2: rule__PropertySpec__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertySpec__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertySpec__Group_2__1"


    // $ANTLR start "rule__PropertySpec__Group_2__1__Impl"
    // InternalSkiql.g:4331:1: rule__PropertySpec__Group_2__1__Impl : ( ( rule__PropertySpec__TypeAssignment_2_1 ) ) ;
    public final void rule__PropertySpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4335:1: ( ( ( rule__PropertySpec__TypeAssignment_2_1 ) ) )
            // InternalSkiql.g:4336:1: ( ( rule__PropertySpec__TypeAssignment_2_1 ) )
            {
            // InternalSkiql.g:4336:1: ( ( rule__PropertySpec__TypeAssignment_2_1 ) )
            // InternalSkiql.g:4337:2: ( rule__PropertySpec__TypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySpecAccess().getTypeAssignment_2_1()); 
            }
            // InternalSkiql.g:4338:2: ( rule__PropertySpec__TypeAssignment_2_1 )
            // InternalSkiql.g:4338:3: rule__PropertySpec__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertySpec__TypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySpecAccess().getTypeAssignment_2_1()); 
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
    // $ANTLR end "rule__PropertySpec__Group_2__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__0"
    // InternalSkiql.g:4347:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4351:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalSkiql.g:4352:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__PrimitiveType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimitiveType__Group__0"


    // $ANTLR start "rule__PrimitiveType__Group__0__Impl"
    // InternalSkiql.g:4359:1: rule__PrimitiveType__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4363:1: ( ( () ) )
            // InternalSkiql.g:4364:1: ( () )
            {
            // InternalSkiql.g:4364:1: ( () )
            // InternalSkiql.g:4365:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0()); 
            }
            // InternalSkiql.g:4366:2: ()
            // InternalSkiql.g:4366:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__1"
    // InternalSkiql.g:4374:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl rule__PrimitiveType__Group__2 ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4378:1: ( rule__PrimitiveType__Group__1__Impl rule__PrimitiveType__Group__2 )
            // InternalSkiql.g:4379:2: rule__PrimitiveType__Group__1__Impl rule__PrimitiveType__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimitiveType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimitiveType__Group__1"


    // $ANTLR start "rule__PrimitiveType__Group__1__Impl"
    // InternalSkiql.g:4386:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__TypeAssignment_1 ) ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4390:1: ( ( ( rule__PrimitiveType__TypeAssignment_1 ) ) )
            // InternalSkiql.g:4391:1: ( ( rule__PrimitiveType__TypeAssignment_1 ) )
            {
            // InternalSkiql.g:4391:1: ( ( rule__PrimitiveType__TypeAssignment_1 ) )
            // InternalSkiql.g:4392:2: ( rule__PrimitiveType__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment_1()); 
            }
            // InternalSkiql.g:4393:2: ( rule__PrimitiveType__TypeAssignment_1 )
            // InternalSkiql.g:4393:3: rule__PrimitiveType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__PrimitiveType__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__2"
    // InternalSkiql.g:4401:1: rule__PrimitiveType__Group__2 : rule__PrimitiveType__Group__2__Impl ;
    public final void rule__PrimitiveType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4405:1: ( rule__PrimitiveType__Group__2__Impl )
            // InternalSkiql.g:4406:2: rule__PrimitiveType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimitiveType__Group__2"


    // $ANTLR start "rule__PrimitiveType__Group__2__Impl"
    // InternalSkiql.g:4412:1: rule__PrimitiveType__Group__2__Impl : ( ( rule__PrimitiveType__ArrayAssignment_2 )? ) ;
    public final void rule__PrimitiveType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4416:1: ( ( ( rule__PrimitiveType__ArrayAssignment_2 )? ) )
            // InternalSkiql.g:4417:1: ( ( rule__PrimitiveType__ArrayAssignment_2 )? )
            {
            // InternalSkiql.g:4417:1: ( ( rule__PrimitiveType__ArrayAssignment_2 )? )
            // InternalSkiql.g:4418:2: ( rule__PrimitiveType__ArrayAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_2()); 
            }
            // InternalSkiql.g:4419:2: ( rule__PrimitiveType__ArrayAssignment_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==13) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSkiql.g:4419:3: rule__PrimitiveType__ArrayAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__ArrayAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_2()); 
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
    // $ANTLR end "rule__PrimitiveType__Group__2__Impl"


    // $ANTLR start "rule__RelationshipType__Group__0"
    // InternalSkiql.g:4428:1: rule__RelationshipType__Group__0 : rule__RelationshipType__Group__0__Impl rule__RelationshipType__Group__1 ;
    public final void rule__RelationshipType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4432:1: ( rule__RelationshipType__Group__0__Impl rule__RelationshipType__Group__1 )
            // InternalSkiql.g:4433:2: rule__RelationshipType__Group__0__Impl rule__RelationshipType__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__RelationshipType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipType__Group__0"


    // $ANTLR start "rule__RelationshipType__Group__0__Impl"
    // InternalSkiql.g:4440:1: rule__RelationshipType__Group__0__Impl : ( () ) ;
    public final void rule__RelationshipType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4444:1: ( ( () ) )
            // InternalSkiql.g:4445:1: ( () )
            {
            // InternalSkiql.g:4445:1: ( () )
            // InternalSkiql.g:4446:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeAccess().getRelationshipTypeAction_0()); 
            }
            // InternalSkiql.g:4447:2: ()
            // InternalSkiql.g:4447:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeAccess().getRelationshipTypeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipType__Group__0__Impl"


    // $ANTLR start "rule__RelationshipType__Group__1"
    // InternalSkiql.g:4455:1: rule__RelationshipType__Group__1 : rule__RelationshipType__Group__1__Impl rule__RelationshipType__Group__2 ;
    public final void rule__RelationshipType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4459:1: ( rule__RelationshipType__Group__1__Impl rule__RelationshipType__Group__2 )
            // InternalSkiql.g:4460:2: rule__RelationshipType__Group__1__Impl rule__RelationshipType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RelationshipType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationshipType__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipType__Group__1"


    // $ANTLR start "rule__RelationshipType__Group__1__Impl"
    // InternalSkiql.g:4467:1: rule__RelationshipType__Group__1__Impl : ( ( rule__RelationshipType__RelationTypeAssignment_1 ) ) ;
    public final void rule__RelationshipType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4471:1: ( ( ( rule__RelationshipType__RelationTypeAssignment_1 ) ) )
            // InternalSkiql.g:4472:1: ( ( rule__RelationshipType__RelationTypeAssignment_1 ) )
            {
            // InternalSkiql.g:4472:1: ( ( rule__RelationshipType__RelationTypeAssignment_1 ) )
            // InternalSkiql.g:4473:2: ( rule__RelationshipType__RelationTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeAccess().getRelationTypeAssignment_1()); 
            }
            // InternalSkiql.g:4474:2: ( rule__RelationshipType__RelationTypeAssignment_1 )
            // InternalSkiql.g:4474:3: rule__RelationshipType__RelationTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipType__RelationTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeAccess().getRelationTypeAssignment_1()); 
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
    // $ANTLR end "rule__RelationshipType__Group__1__Impl"


    // $ANTLR start "rule__RelationshipType__Group__2"
    // InternalSkiql.g:4482:1: rule__RelationshipType__Group__2 : rule__RelationshipType__Group__2__Impl ;
    public final void rule__RelationshipType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4486:1: ( rule__RelationshipType__Group__2__Impl )
            // InternalSkiql.g:4487:2: rule__RelationshipType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationshipType__Group__2"


    // $ANTLR start "rule__RelationshipType__Group__2__Impl"
    // InternalSkiql.g:4493:1: rule__RelationshipType__Group__2__Impl : ( ( rule__RelationshipType__TargetEntityNameAssignment_2 )? ) ;
    public final void rule__RelationshipType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4497:1: ( ( ( rule__RelationshipType__TargetEntityNameAssignment_2 )? ) )
            // InternalSkiql.g:4498:1: ( ( rule__RelationshipType__TargetEntityNameAssignment_2 )? )
            {
            // InternalSkiql.g:4498:1: ( ( rule__RelationshipType__TargetEntityNameAssignment_2 )? )
            // InternalSkiql.g:4499:2: ( rule__RelationshipType__TargetEntityNameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeAccess().getTargetEntityNameAssignment_2()); 
            }
            // InternalSkiql.g:4500:2: ( rule__RelationshipType__TargetEntityNameAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==11) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSkiql.g:4500:3: rule__RelationshipType__TargetEntityNameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipType__TargetEntityNameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeAccess().getTargetEntityNameAssignment_2()); 
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
    // $ANTLR end "rule__RelationshipType__Group__2__Impl"


    // $ANTLR start "rule__BeforeHistory__Group__0"
    // InternalSkiql.g:4509:1: rule__BeforeHistory__Group__0 : rule__BeforeHistory__Group__0__Impl rule__BeforeHistory__Group__1 ;
    public final void rule__BeforeHistory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4513:1: ( rule__BeforeHistory__Group__0__Impl rule__BeforeHistory__Group__1 )
            // InternalSkiql.g:4514:2: rule__BeforeHistory__Group__0__Impl rule__BeforeHistory__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__BeforeHistory__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BeforeHistory__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BeforeHistory__Group__0"


    // $ANTLR start "rule__BeforeHistory__Group__0__Impl"
    // InternalSkiql.g:4521:1: rule__BeforeHistory__Group__0__Impl : ( () ) ;
    public final void rule__BeforeHistory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4525:1: ( ( () ) )
            // InternalSkiql.g:4526:1: ( () )
            {
            // InternalSkiql.g:4526:1: ( () )
            // InternalSkiql.g:4527:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBeforeHistoryAccess().getBeforeAction_0()); 
            }
            // InternalSkiql.g:4528:2: ()
            // InternalSkiql.g:4528:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBeforeHistoryAccess().getBeforeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeHistory__Group__0__Impl"


    // $ANTLR start "rule__BeforeHistory__Group__1"
    // InternalSkiql.g:4536:1: rule__BeforeHistory__Group__1 : rule__BeforeHistory__Group__1__Impl rule__BeforeHistory__Group__2 ;
    public final void rule__BeforeHistory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4540:1: ( rule__BeforeHistory__Group__1__Impl rule__BeforeHistory__Group__2 )
            // InternalSkiql.g:4541:2: rule__BeforeHistory__Group__1__Impl rule__BeforeHistory__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__BeforeHistory__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BeforeHistory__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BeforeHistory__Group__1"


    // $ANTLR start "rule__BeforeHistory__Group__1__Impl"
    // InternalSkiql.g:4548:1: rule__BeforeHistory__Group__1__Impl : ( 'BEFORE' ) ;
    public final void rule__BeforeHistory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4552:1: ( ( 'BEFORE' ) )
            // InternalSkiql.g:4553:1: ( 'BEFORE' )
            {
            // InternalSkiql.g:4553:1: ( 'BEFORE' )
            // InternalSkiql.g:4554:2: 'BEFORE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBeforeHistoryAccess().getBEFOREKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBeforeHistoryAccess().getBEFOREKeyword_1()); 
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
    // $ANTLR end "rule__BeforeHistory__Group__1__Impl"


    // $ANTLR start "rule__BeforeHistory__Group__2"
    // InternalSkiql.g:4563:1: rule__BeforeHistory__Group__2 : rule__BeforeHistory__Group__2__Impl rule__BeforeHistory__Group__3 ;
    public final void rule__BeforeHistory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4567:1: ( rule__BeforeHistory__Group__2__Impl rule__BeforeHistory__Group__3 )
            // InternalSkiql.g:4568:2: rule__BeforeHistory__Group__2__Impl rule__BeforeHistory__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__BeforeHistory__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BeforeHistory__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BeforeHistory__Group__2"


    // $ANTLR start "rule__BeforeHistory__Group__2__Impl"
    // InternalSkiql.g:4575:1: rule__BeforeHistory__Group__2__Impl : ( '(' ) ;
    public final void rule__BeforeHistory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4579:1: ( ( '(' ) )
            // InternalSkiql.g:4580:1: ( '(' )
            {
            // InternalSkiql.g:4580:1: ( '(' )
            // InternalSkiql.g:4581:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBeforeHistoryAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBeforeHistoryAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__BeforeHistory__Group__2__Impl"


    // $ANTLR start "rule__BeforeHistory__Group__3"
    // InternalSkiql.g:4590:1: rule__BeforeHistory__Group__3 : rule__BeforeHistory__Group__3__Impl rule__BeforeHistory__Group__4 ;
    public final void rule__BeforeHistory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4594:1: ( rule__BeforeHistory__Group__3__Impl rule__BeforeHistory__Group__4 )
            // InternalSkiql.g:4595:2: rule__BeforeHistory__Group__3__Impl rule__BeforeHistory__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__BeforeHistory__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BeforeHistory__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BeforeHistory__Group__3"


    // $ANTLR start "rule__BeforeHistory__Group__3__Impl"
    // InternalSkiql.g:4602:1: rule__BeforeHistory__Group__3__Impl : ( ( rule__BeforeHistory__DateTimeAssignment_3 ) ) ;
    public final void rule__BeforeHistory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4606:1: ( ( ( rule__BeforeHistory__DateTimeAssignment_3 ) ) )
            // InternalSkiql.g:4607:1: ( ( rule__BeforeHistory__DateTimeAssignment_3 ) )
            {
            // InternalSkiql.g:4607:1: ( ( rule__BeforeHistory__DateTimeAssignment_3 ) )
            // InternalSkiql.g:4608:2: ( rule__BeforeHistory__DateTimeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBeforeHistoryAccess().getDateTimeAssignment_3()); 
            }
            // InternalSkiql.g:4609:2: ( rule__BeforeHistory__DateTimeAssignment_3 )
            // InternalSkiql.g:4609:3: rule__BeforeHistory__DateTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BeforeHistory__DateTimeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBeforeHistoryAccess().getDateTimeAssignment_3()); 
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
    // $ANTLR end "rule__BeforeHistory__Group__3__Impl"


    // $ANTLR start "rule__BeforeHistory__Group__4"
    // InternalSkiql.g:4617:1: rule__BeforeHistory__Group__4 : rule__BeforeHistory__Group__4__Impl ;
    public final void rule__BeforeHistory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4621:1: ( rule__BeforeHistory__Group__4__Impl )
            // InternalSkiql.g:4622:2: rule__BeforeHistory__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BeforeHistory__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BeforeHistory__Group__4"


    // $ANTLR start "rule__BeforeHistory__Group__4__Impl"
    // InternalSkiql.g:4628:1: rule__BeforeHistory__Group__4__Impl : ( ')' ) ;
    public final void rule__BeforeHistory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4632:1: ( ( ')' ) )
            // InternalSkiql.g:4633:1: ( ')' )
            {
            // InternalSkiql.g:4633:1: ( ')' )
            // InternalSkiql.g:4634:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBeforeHistoryAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBeforeHistoryAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__BeforeHistory__Group__4__Impl"


    // $ANTLR start "rule__AfterHistory__Group__0"
    // InternalSkiql.g:4644:1: rule__AfterHistory__Group__0 : rule__AfterHistory__Group__0__Impl rule__AfterHistory__Group__1 ;
    public final void rule__AfterHistory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4648:1: ( rule__AfterHistory__Group__0__Impl rule__AfterHistory__Group__1 )
            // InternalSkiql.g:4649:2: rule__AfterHistory__Group__0__Impl rule__AfterHistory__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__AfterHistory__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AfterHistory__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AfterHistory__Group__0"


    // $ANTLR start "rule__AfterHistory__Group__0__Impl"
    // InternalSkiql.g:4656:1: rule__AfterHistory__Group__0__Impl : ( () ) ;
    public final void rule__AfterHistory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4660:1: ( ( () ) )
            // InternalSkiql.g:4661:1: ( () )
            {
            // InternalSkiql.g:4661:1: ( () )
            // InternalSkiql.g:4662:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAfterHistoryAccess().getAfterAction_0()); 
            }
            // InternalSkiql.g:4663:2: ()
            // InternalSkiql.g:4663:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAfterHistoryAccess().getAfterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterHistory__Group__0__Impl"


    // $ANTLR start "rule__AfterHistory__Group__1"
    // InternalSkiql.g:4671:1: rule__AfterHistory__Group__1 : rule__AfterHistory__Group__1__Impl rule__AfterHistory__Group__2 ;
    public final void rule__AfterHistory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4675:1: ( rule__AfterHistory__Group__1__Impl rule__AfterHistory__Group__2 )
            // InternalSkiql.g:4676:2: rule__AfterHistory__Group__1__Impl rule__AfterHistory__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__AfterHistory__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AfterHistory__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AfterHistory__Group__1"


    // $ANTLR start "rule__AfterHistory__Group__1__Impl"
    // InternalSkiql.g:4683:1: rule__AfterHistory__Group__1__Impl : ( 'AFTER' ) ;
    public final void rule__AfterHistory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4687:1: ( ( 'AFTER' ) )
            // InternalSkiql.g:4688:1: ( 'AFTER' )
            {
            // InternalSkiql.g:4688:1: ( 'AFTER' )
            // InternalSkiql.g:4689:2: 'AFTER'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAfterHistoryAccess().getAFTERKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAfterHistoryAccess().getAFTERKeyword_1()); 
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
    // $ANTLR end "rule__AfterHistory__Group__1__Impl"


    // $ANTLR start "rule__AfterHistory__Group__2"
    // InternalSkiql.g:4698:1: rule__AfterHistory__Group__2 : rule__AfterHistory__Group__2__Impl rule__AfterHistory__Group__3 ;
    public final void rule__AfterHistory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4702:1: ( rule__AfterHistory__Group__2__Impl rule__AfterHistory__Group__3 )
            // InternalSkiql.g:4703:2: rule__AfterHistory__Group__2__Impl rule__AfterHistory__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__AfterHistory__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AfterHistory__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AfterHistory__Group__2"


    // $ANTLR start "rule__AfterHistory__Group__2__Impl"
    // InternalSkiql.g:4710:1: rule__AfterHistory__Group__2__Impl : ( '(' ) ;
    public final void rule__AfterHistory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4714:1: ( ( '(' ) )
            // InternalSkiql.g:4715:1: ( '(' )
            {
            // InternalSkiql.g:4715:1: ( '(' )
            // InternalSkiql.g:4716:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAfterHistoryAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAfterHistoryAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__AfterHistory__Group__2__Impl"


    // $ANTLR start "rule__AfterHistory__Group__3"
    // InternalSkiql.g:4725:1: rule__AfterHistory__Group__3 : rule__AfterHistory__Group__3__Impl rule__AfterHistory__Group__4 ;
    public final void rule__AfterHistory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4729:1: ( rule__AfterHistory__Group__3__Impl rule__AfterHistory__Group__4 )
            // InternalSkiql.g:4730:2: rule__AfterHistory__Group__3__Impl rule__AfterHistory__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__AfterHistory__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AfterHistory__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AfterHistory__Group__3"


    // $ANTLR start "rule__AfterHistory__Group__3__Impl"
    // InternalSkiql.g:4737:1: rule__AfterHistory__Group__3__Impl : ( ( rule__AfterHistory__DateTimeAssignment_3 ) ) ;
    public final void rule__AfterHistory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4741:1: ( ( ( rule__AfterHistory__DateTimeAssignment_3 ) ) )
            // InternalSkiql.g:4742:1: ( ( rule__AfterHistory__DateTimeAssignment_3 ) )
            {
            // InternalSkiql.g:4742:1: ( ( rule__AfterHistory__DateTimeAssignment_3 ) )
            // InternalSkiql.g:4743:2: ( rule__AfterHistory__DateTimeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAfterHistoryAccess().getDateTimeAssignment_3()); 
            }
            // InternalSkiql.g:4744:2: ( rule__AfterHistory__DateTimeAssignment_3 )
            // InternalSkiql.g:4744:3: rule__AfterHistory__DateTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AfterHistory__DateTimeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAfterHistoryAccess().getDateTimeAssignment_3()); 
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
    // $ANTLR end "rule__AfterHistory__Group__3__Impl"


    // $ANTLR start "rule__AfterHistory__Group__4"
    // InternalSkiql.g:4752:1: rule__AfterHistory__Group__4 : rule__AfterHistory__Group__4__Impl ;
    public final void rule__AfterHistory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4756:1: ( rule__AfterHistory__Group__4__Impl )
            // InternalSkiql.g:4757:2: rule__AfterHistory__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AfterHistory__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AfterHistory__Group__4"


    // $ANTLR start "rule__AfterHistory__Group__4__Impl"
    // InternalSkiql.g:4763:1: rule__AfterHistory__Group__4__Impl : ( ')' ) ;
    public final void rule__AfterHistory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4767:1: ( ( ')' ) )
            // InternalSkiql.g:4768:1: ( ')' )
            {
            // InternalSkiql.g:4768:1: ( ')' )
            // InternalSkiql.g:4769:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAfterHistoryAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAfterHistoryAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__AfterHistory__Group__4__Impl"


    // $ANTLR start "rule__BetweenHistory__Group__0"
    // InternalSkiql.g:4779:1: rule__BetweenHistory__Group__0 : rule__BetweenHistory__Group__0__Impl rule__BetweenHistory__Group__1 ;
    public final void rule__BetweenHistory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4783:1: ( rule__BetweenHistory__Group__0__Impl rule__BetweenHistory__Group__1 )
            // InternalSkiql.g:4784:2: rule__BetweenHistory__Group__0__Impl rule__BetweenHistory__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BetweenHistory__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BetweenHistory__Group__0"


    // $ANTLR start "rule__BetweenHistory__Group__0__Impl"
    // InternalSkiql.g:4791:1: rule__BetweenHistory__Group__0__Impl : ( () ) ;
    public final void rule__BetweenHistory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4795:1: ( ( () ) )
            // InternalSkiql.g:4796:1: ( () )
            {
            // InternalSkiql.g:4796:1: ( () )
            // InternalSkiql.g:4797:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getBetweenAction_0()); 
            }
            // InternalSkiql.g:4798:2: ()
            // InternalSkiql.g:4798:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getBetweenAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BetweenHistory__Group__0__Impl"


    // $ANTLR start "rule__BetweenHistory__Group__1"
    // InternalSkiql.g:4806:1: rule__BetweenHistory__Group__1 : rule__BetweenHistory__Group__1__Impl rule__BetweenHistory__Group__2 ;
    public final void rule__BetweenHistory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4810:1: ( rule__BetweenHistory__Group__1__Impl rule__BetweenHistory__Group__2 )
            // InternalSkiql.g:4811:2: rule__BetweenHistory__Group__1__Impl rule__BetweenHistory__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__BetweenHistory__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BetweenHistory__Group__1"


    // $ANTLR start "rule__BetweenHistory__Group__1__Impl"
    // InternalSkiql.g:4818:1: rule__BetweenHistory__Group__1__Impl : ( 'BETWEEN' ) ;
    public final void rule__BetweenHistory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4822:1: ( ( 'BETWEEN' ) )
            // InternalSkiql.g:4823:1: ( 'BETWEEN' )
            {
            // InternalSkiql.g:4823:1: ( 'BETWEEN' )
            // InternalSkiql.g:4824:2: 'BETWEEN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getBETWEENKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getBETWEENKeyword_1()); 
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
    // $ANTLR end "rule__BetweenHistory__Group__1__Impl"


    // $ANTLR start "rule__BetweenHistory__Group__2"
    // InternalSkiql.g:4833:1: rule__BetweenHistory__Group__2 : rule__BetweenHistory__Group__2__Impl rule__BetweenHistory__Group__3 ;
    public final void rule__BetweenHistory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4837:1: ( rule__BetweenHistory__Group__2__Impl rule__BetweenHistory__Group__3 )
            // InternalSkiql.g:4838:2: rule__BetweenHistory__Group__2__Impl rule__BetweenHistory__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__BetweenHistory__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BetweenHistory__Group__2"


    // $ANTLR start "rule__BetweenHistory__Group__2__Impl"
    // InternalSkiql.g:4845:1: rule__BetweenHistory__Group__2__Impl : ( '(' ) ;
    public final void rule__BetweenHistory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4849:1: ( ( '(' ) )
            // InternalSkiql.g:4850:1: ( '(' )
            {
            // InternalSkiql.g:4850:1: ( '(' )
            // InternalSkiql.g:4851:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__BetweenHistory__Group__2__Impl"


    // $ANTLR start "rule__BetweenHistory__Group__3"
    // InternalSkiql.g:4860:1: rule__BetweenHistory__Group__3 : rule__BetweenHistory__Group__3__Impl rule__BetweenHistory__Group__4 ;
    public final void rule__BetweenHistory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4864:1: ( rule__BetweenHistory__Group__3__Impl rule__BetweenHistory__Group__4 )
            // InternalSkiql.g:4865:2: rule__BetweenHistory__Group__3__Impl rule__BetweenHistory__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__BetweenHistory__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BetweenHistory__Group__3"


    // $ANTLR start "rule__BetweenHistory__Group__3__Impl"
    // InternalSkiql.g:4872:1: rule__BetweenHistory__Group__3__Impl : ( ( rule__BetweenHistory__AfterDateTimeAssignment_3 ) ) ;
    public final void rule__BetweenHistory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4876:1: ( ( ( rule__BetweenHistory__AfterDateTimeAssignment_3 ) ) )
            // InternalSkiql.g:4877:1: ( ( rule__BetweenHistory__AfterDateTimeAssignment_3 ) )
            {
            // InternalSkiql.g:4877:1: ( ( rule__BetweenHistory__AfterDateTimeAssignment_3 ) )
            // InternalSkiql.g:4878:2: ( rule__BetweenHistory__AfterDateTimeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getAfterDateTimeAssignment_3()); 
            }
            // InternalSkiql.g:4879:2: ( rule__BetweenHistory__AfterDateTimeAssignment_3 )
            // InternalSkiql.g:4879:3: rule__BetweenHistory__AfterDateTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__AfterDateTimeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getAfterDateTimeAssignment_3()); 
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
    // $ANTLR end "rule__BetweenHistory__Group__3__Impl"


    // $ANTLR start "rule__BetweenHistory__Group__4"
    // InternalSkiql.g:4887:1: rule__BetweenHistory__Group__4 : rule__BetweenHistory__Group__4__Impl rule__BetweenHistory__Group__5 ;
    public final void rule__BetweenHistory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4891:1: ( rule__BetweenHistory__Group__4__Impl rule__BetweenHistory__Group__5 )
            // InternalSkiql.g:4892:2: rule__BetweenHistory__Group__4__Impl rule__BetweenHistory__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__BetweenHistory__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BetweenHistory__Group__4"


    // $ANTLR start "rule__BetweenHistory__Group__4__Impl"
    // InternalSkiql.g:4899:1: rule__BetweenHistory__Group__4__Impl : ( ',' ) ;
    public final void rule__BetweenHistory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4903:1: ( ( ',' ) )
            // InternalSkiql.g:4904:1: ( ',' )
            {
            // InternalSkiql.g:4904:1: ( ',' )
            // InternalSkiql.g:4905:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getCommaKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getCommaKeyword_4()); 
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
    // $ANTLR end "rule__BetweenHistory__Group__4__Impl"


    // $ANTLR start "rule__BetweenHistory__Group__5"
    // InternalSkiql.g:4914:1: rule__BetweenHistory__Group__5 : rule__BetweenHistory__Group__5__Impl rule__BetweenHistory__Group__6 ;
    public final void rule__BetweenHistory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4918:1: ( rule__BetweenHistory__Group__5__Impl rule__BetweenHistory__Group__6 )
            // InternalSkiql.g:4919:2: rule__BetweenHistory__Group__5__Impl rule__BetweenHistory__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__BetweenHistory__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BetweenHistory__Group__5"


    // $ANTLR start "rule__BetweenHistory__Group__5__Impl"
    // InternalSkiql.g:4926:1: rule__BetweenHistory__Group__5__Impl : ( ( rule__BetweenHistory__BeforeDateTimeAssignment_5 ) ) ;
    public final void rule__BetweenHistory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4930:1: ( ( ( rule__BetweenHistory__BeforeDateTimeAssignment_5 ) ) )
            // InternalSkiql.g:4931:1: ( ( rule__BetweenHistory__BeforeDateTimeAssignment_5 ) )
            {
            // InternalSkiql.g:4931:1: ( ( rule__BetweenHistory__BeforeDateTimeAssignment_5 ) )
            // InternalSkiql.g:4932:2: ( rule__BetweenHistory__BeforeDateTimeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getBeforeDateTimeAssignment_5()); 
            }
            // InternalSkiql.g:4933:2: ( rule__BetweenHistory__BeforeDateTimeAssignment_5 )
            // InternalSkiql.g:4933:3: rule__BetweenHistory__BeforeDateTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__BeforeDateTimeAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getBeforeDateTimeAssignment_5()); 
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
    // $ANTLR end "rule__BetweenHistory__Group__5__Impl"


    // $ANTLR start "rule__BetweenHistory__Group__6"
    // InternalSkiql.g:4941:1: rule__BetweenHistory__Group__6 : rule__BetweenHistory__Group__6__Impl ;
    public final void rule__BetweenHistory__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4945:1: ( rule__BetweenHistory__Group__6__Impl )
            // InternalSkiql.g:4946:2: rule__BetweenHistory__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BetweenHistory__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BetweenHistory__Group__6"


    // $ANTLR start "rule__BetweenHistory__Group__6__Impl"
    // InternalSkiql.g:4952:1: rule__BetweenHistory__Group__6__Impl : ( ')' ) ;
    public final void rule__BetweenHistory__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4956:1: ( ( ')' ) )
            // InternalSkiql.g:4957:1: ( ')' )
            {
            // InternalSkiql.g:4957:1: ( ')' )
            // InternalSkiql.g:4958:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getRightParenthesisKeyword_6()); 
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
    // $ANTLR end "rule__BetweenHistory__Group__6__Impl"


    // $ANTLR start "rule__DateTime__Group__0"
    // InternalSkiql.g:4968:1: rule__DateTime__Group__0 : rule__DateTime__Group__0__Impl rule__DateTime__Group__1 ;
    public final void rule__DateTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4972:1: ( rule__DateTime__Group__0__Impl rule__DateTime__Group__1 )
            // InternalSkiql.g:4973:2: rule__DateTime__Group__0__Impl rule__DateTime__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__DateTime__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group__0"


    // $ANTLR start "rule__DateTime__Group__0__Impl"
    // InternalSkiql.g:4980:1: rule__DateTime__Group__0__Impl : ( () ) ;
    public final void rule__DateTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4984:1: ( ( () ) )
            // InternalSkiql.g:4985:1: ( () )
            {
            // InternalSkiql.g:4985:1: ( () )
            // InternalSkiql.g:4986:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getDateTimeAction_0()); 
            }
            // InternalSkiql.g:4987:2: ()
            // InternalSkiql.g:4987:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getDateTimeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group__0__Impl"


    // $ANTLR start "rule__DateTime__Group__1"
    // InternalSkiql.g:4995:1: rule__DateTime__Group__1 : rule__DateTime__Group__1__Impl rule__DateTime__Group__2 ;
    public final void rule__DateTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:4999:1: ( rule__DateTime__Group__1__Impl rule__DateTime__Group__2 )
            // InternalSkiql.g:5000:2: rule__DateTime__Group__1__Impl rule__DateTime__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__DateTime__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group__1"


    // $ANTLR start "rule__DateTime__Group__1__Impl"
    // InternalSkiql.g:5007:1: rule__DateTime__Group__1__Impl : ( ( rule__DateTime__YearAssignment_1 ) ) ;
    public final void rule__DateTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5011:1: ( ( ( rule__DateTime__YearAssignment_1 ) ) )
            // InternalSkiql.g:5012:1: ( ( rule__DateTime__YearAssignment_1 ) )
            {
            // InternalSkiql.g:5012:1: ( ( rule__DateTime__YearAssignment_1 ) )
            // InternalSkiql.g:5013:2: ( rule__DateTime__YearAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getYearAssignment_1()); 
            }
            // InternalSkiql.g:5014:2: ( rule__DateTime__YearAssignment_1 )
            // InternalSkiql.g:5014:3: rule__DateTime__YearAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__YearAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getYearAssignment_1()); 
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
    // $ANTLR end "rule__DateTime__Group__1__Impl"


    // $ANTLR start "rule__DateTime__Group__2"
    // InternalSkiql.g:5022:1: rule__DateTime__Group__2 : rule__DateTime__Group__2__Impl rule__DateTime__Group__3 ;
    public final void rule__DateTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5026:1: ( rule__DateTime__Group__2__Impl rule__DateTime__Group__3 )
            // InternalSkiql.g:5027:2: rule__DateTime__Group__2__Impl rule__DateTime__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__DateTime__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group__2"


    // $ANTLR start "rule__DateTime__Group__2__Impl"
    // InternalSkiql.g:5034:1: rule__DateTime__Group__2__Impl : ( '-' ) ;
    public final void rule__DateTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5038:1: ( ( '-' ) )
            // InternalSkiql.g:5039:1: ( '-' )
            {
            // InternalSkiql.g:5039:1: ( '-' )
            // InternalSkiql.g:5040:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getHyphenMinusKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getHyphenMinusKeyword_2()); 
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
    // $ANTLR end "rule__DateTime__Group__2__Impl"


    // $ANTLR start "rule__DateTime__Group__3"
    // InternalSkiql.g:5049:1: rule__DateTime__Group__3 : rule__DateTime__Group__3__Impl rule__DateTime__Group__4 ;
    public final void rule__DateTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5053:1: ( rule__DateTime__Group__3__Impl rule__DateTime__Group__4 )
            // InternalSkiql.g:5054:2: rule__DateTime__Group__3__Impl rule__DateTime__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__DateTime__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group__3"


    // $ANTLR start "rule__DateTime__Group__3__Impl"
    // InternalSkiql.g:5061:1: rule__DateTime__Group__3__Impl : ( ( rule__DateTime__MonthAssignment_3 ) ) ;
    public final void rule__DateTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5065:1: ( ( ( rule__DateTime__MonthAssignment_3 ) ) )
            // InternalSkiql.g:5066:1: ( ( rule__DateTime__MonthAssignment_3 ) )
            {
            // InternalSkiql.g:5066:1: ( ( rule__DateTime__MonthAssignment_3 ) )
            // InternalSkiql.g:5067:2: ( rule__DateTime__MonthAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getMonthAssignment_3()); 
            }
            // InternalSkiql.g:5068:2: ( rule__DateTime__MonthAssignment_3 )
            // InternalSkiql.g:5068:3: rule__DateTime__MonthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__MonthAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getMonthAssignment_3()); 
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
    // $ANTLR end "rule__DateTime__Group__3__Impl"


    // $ANTLR start "rule__DateTime__Group__4"
    // InternalSkiql.g:5076:1: rule__DateTime__Group__4 : rule__DateTime__Group__4__Impl rule__DateTime__Group__5 ;
    public final void rule__DateTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5080:1: ( rule__DateTime__Group__4__Impl rule__DateTime__Group__5 )
            // InternalSkiql.g:5081:2: rule__DateTime__Group__4__Impl rule__DateTime__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__DateTime__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group__4"


    // $ANTLR start "rule__DateTime__Group__4__Impl"
    // InternalSkiql.g:5088:1: rule__DateTime__Group__4__Impl : ( '-' ) ;
    public final void rule__DateTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5092:1: ( ( '-' ) )
            // InternalSkiql.g:5093:1: ( '-' )
            {
            // InternalSkiql.g:5093:1: ( '-' )
            // InternalSkiql.g:5094:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getHyphenMinusKeyword_4()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getHyphenMinusKeyword_4()); 
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
    // $ANTLR end "rule__DateTime__Group__4__Impl"


    // $ANTLR start "rule__DateTime__Group__5"
    // InternalSkiql.g:5103:1: rule__DateTime__Group__5 : rule__DateTime__Group__5__Impl rule__DateTime__Group__6 ;
    public final void rule__DateTime__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5107:1: ( rule__DateTime__Group__5__Impl rule__DateTime__Group__6 )
            // InternalSkiql.g:5108:2: rule__DateTime__Group__5__Impl rule__DateTime__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__DateTime__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group__5"


    // $ANTLR start "rule__DateTime__Group__5__Impl"
    // InternalSkiql.g:5115:1: rule__DateTime__Group__5__Impl : ( ( rule__DateTime__DayAssignment_5 ) ) ;
    public final void rule__DateTime__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5119:1: ( ( ( rule__DateTime__DayAssignment_5 ) ) )
            // InternalSkiql.g:5120:1: ( ( rule__DateTime__DayAssignment_5 ) )
            {
            // InternalSkiql.g:5120:1: ( ( rule__DateTime__DayAssignment_5 ) )
            // InternalSkiql.g:5121:2: ( rule__DateTime__DayAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getDayAssignment_5()); 
            }
            // InternalSkiql.g:5122:2: ( rule__DateTime__DayAssignment_5 )
            // InternalSkiql.g:5122:3: rule__DateTime__DayAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__DayAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getDayAssignment_5()); 
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
    // $ANTLR end "rule__DateTime__Group__5__Impl"


    // $ANTLR start "rule__DateTime__Group__6"
    // InternalSkiql.g:5130:1: rule__DateTime__Group__6 : rule__DateTime__Group__6__Impl ;
    public final void rule__DateTime__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5134:1: ( rule__DateTime__Group__6__Impl )
            // InternalSkiql.g:5135:2: rule__DateTime__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group__6"


    // $ANTLR start "rule__DateTime__Group__6__Impl"
    // InternalSkiql.g:5141:1: rule__DateTime__Group__6__Impl : ( ( rule__DateTime__Group_6__0 )? ) ;
    public final void rule__DateTime__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5145:1: ( ( ( rule__DateTime__Group_6__0 )? ) )
            // InternalSkiql.g:5146:1: ( ( rule__DateTime__Group_6__0 )? )
            {
            // InternalSkiql.g:5146:1: ( ( rule__DateTime__Group_6__0 )? )
            // InternalSkiql.g:5147:2: ( rule__DateTime__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getGroup_6()); 
            }
            // InternalSkiql.g:5148:2: ( rule__DateTime__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSkiql.g:5148:3: rule__DateTime__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateTime__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getGroup_6()); 
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
    // $ANTLR end "rule__DateTime__Group__6__Impl"


    // $ANTLR start "rule__DateTime__Group_6__0"
    // InternalSkiql.g:5157:1: rule__DateTime__Group_6__0 : rule__DateTime__Group_6__0__Impl rule__DateTime__Group_6__1 ;
    public final void rule__DateTime__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5161:1: ( rule__DateTime__Group_6__0__Impl rule__DateTime__Group_6__1 )
            // InternalSkiql.g:5162:2: rule__DateTime__Group_6__0__Impl rule__DateTime__Group_6__1
            {
            pushFollow(FOLLOW_27);
            rule__DateTime__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group_6__0"


    // $ANTLR start "rule__DateTime__Group_6__0__Impl"
    // InternalSkiql.g:5169:1: rule__DateTime__Group_6__0__Impl : ( ( rule__DateTime__HourAssignment_6_0 ) ) ;
    public final void rule__DateTime__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5173:1: ( ( ( rule__DateTime__HourAssignment_6_0 ) ) )
            // InternalSkiql.g:5174:1: ( ( rule__DateTime__HourAssignment_6_0 ) )
            {
            // InternalSkiql.g:5174:1: ( ( rule__DateTime__HourAssignment_6_0 ) )
            // InternalSkiql.g:5175:2: ( rule__DateTime__HourAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getHourAssignment_6_0()); 
            }
            // InternalSkiql.g:5176:2: ( rule__DateTime__HourAssignment_6_0 )
            // InternalSkiql.g:5176:3: rule__DateTime__HourAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__HourAssignment_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getHourAssignment_6_0()); 
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
    // $ANTLR end "rule__DateTime__Group_6__0__Impl"


    // $ANTLR start "rule__DateTime__Group_6__1"
    // InternalSkiql.g:5184:1: rule__DateTime__Group_6__1 : rule__DateTime__Group_6__1__Impl rule__DateTime__Group_6__2 ;
    public final void rule__DateTime__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5188:1: ( rule__DateTime__Group_6__1__Impl rule__DateTime__Group_6__2 )
            // InternalSkiql.g:5189:2: rule__DateTime__Group_6__1__Impl rule__DateTime__Group_6__2
            {
            pushFollow(FOLLOW_34);
            rule__DateTime__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group_6__1"


    // $ANTLR start "rule__DateTime__Group_6__1__Impl"
    // InternalSkiql.g:5196:1: rule__DateTime__Group_6__1__Impl : ( ':' ) ;
    public final void rule__DateTime__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5200:1: ( ( ':' ) )
            // InternalSkiql.g:5201:1: ( ':' )
            {
            // InternalSkiql.g:5201:1: ( ':' )
            // InternalSkiql.g:5202:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getColonKeyword_6_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getColonKeyword_6_1()); 
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
    // $ANTLR end "rule__DateTime__Group_6__1__Impl"


    // $ANTLR start "rule__DateTime__Group_6__2"
    // InternalSkiql.g:5211:1: rule__DateTime__Group_6__2 : rule__DateTime__Group_6__2__Impl rule__DateTime__Group_6__3 ;
    public final void rule__DateTime__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5215:1: ( rule__DateTime__Group_6__2__Impl rule__DateTime__Group_6__3 )
            // InternalSkiql.g:5216:2: rule__DateTime__Group_6__2__Impl rule__DateTime__Group_6__3
            {
            pushFollow(FOLLOW_27);
            rule__DateTime__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group_6__2"


    // $ANTLR start "rule__DateTime__Group_6__2__Impl"
    // InternalSkiql.g:5223:1: rule__DateTime__Group_6__2__Impl : ( ( rule__DateTime__MinutesAssignment_6_2 ) ) ;
    public final void rule__DateTime__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5227:1: ( ( ( rule__DateTime__MinutesAssignment_6_2 ) ) )
            // InternalSkiql.g:5228:1: ( ( rule__DateTime__MinutesAssignment_6_2 ) )
            {
            // InternalSkiql.g:5228:1: ( ( rule__DateTime__MinutesAssignment_6_2 ) )
            // InternalSkiql.g:5229:2: ( rule__DateTime__MinutesAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getMinutesAssignment_6_2()); 
            }
            // InternalSkiql.g:5230:2: ( rule__DateTime__MinutesAssignment_6_2 )
            // InternalSkiql.g:5230:3: rule__DateTime__MinutesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__MinutesAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getMinutesAssignment_6_2()); 
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
    // $ANTLR end "rule__DateTime__Group_6__2__Impl"


    // $ANTLR start "rule__DateTime__Group_6__3"
    // InternalSkiql.g:5238:1: rule__DateTime__Group_6__3 : rule__DateTime__Group_6__3__Impl rule__DateTime__Group_6__4 ;
    public final void rule__DateTime__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5242:1: ( rule__DateTime__Group_6__3__Impl rule__DateTime__Group_6__4 )
            // InternalSkiql.g:5243:2: rule__DateTime__Group_6__3__Impl rule__DateTime__Group_6__4
            {
            pushFollow(FOLLOW_34);
            rule__DateTime__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DateTime__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group_6__3"


    // $ANTLR start "rule__DateTime__Group_6__3__Impl"
    // InternalSkiql.g:5250:1: rule__DateTime__Group_6__3__Impl : ( ':' ) ;
    public final void rule__DateTime__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5254:1: ( ( ':' ) )
            // InternalSkiql.g:5255:1: ( ':' )
            {
            // InternalSkiql.g:5255:1: ( ':' )
            // InternalSkiql.g:5256:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getColonKeyword_6_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getColonKeyword_6_3()); 
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
    // $ANTLR end "rule__DateTime__Group_6__3__Impl"


    // $ANTLR start "rule__DateTime__Group_6__4"
    // InternalSkiql.g:5265:1: rule__DateTime__Group_6__4 : rule__DateTime__Group_6__4__Impl ;
    public final void rule__DateTime__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5269:1: ( rule__DateTime__Group_6__4__Impl )
            // InternalSkiql.g:5270:2: rule__DateTime__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DateTime__Group_6__4"


    // $ANTLR start "rule__DateTime__Group_6__4__Impl"
    // InternalSkiql.g:5276:1: rule__DateTime__Group_6__4__Impl : ( ( rule__DateTime__SecondsAssignment_6_4 ) ) ;
    public final void rule__DateTime__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5280:1: ( ( ( rule__DateTime__SecondsAssignment_6_4 ) ) )
            // InternalSkiql.g:5281:1: ( ( rule__DateTime__SecondsAssignment_6_4 ) )
            {
            // InternalSkiql.g:5281:1: ( ( rule__DateTime__SecondsAssignment_6_4 ) )
            // InternalSkiql.g:5282:2: ( rule__DateTime__SecondsAssignment_6_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getSecondsAssignment_6_4()); 
            }
            // InternalSkiql.g:5283:2: ( rule__DateTime__SecondsAssignment_6_4 )
            // InternalSkiql.g:5283:3: rule__DateTime__SecondsAssignment_6_4
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__SecondsAssignment_6_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getSecondsAssignment_6_4()); 
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
    // $ANTLR end "rule__DateTime__Group_6__4__Impl"


    // $ANTLR start "rule__SkiQLModel__QueryAssignment_1"
    // InternalSkiql.g:5292:1: rule__SkiQLModel__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__SkiQLModel__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5296:1: ( ( ruleQuery ) )
            // InternalSkiql.g:5297:2: ( ruleQuery )
            {
            // InternalSkiql.g:5297:2: ( ruleQuery )
            // InternalSkiql.g:5298:3: ruleQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkiQLModelAccess().getQueryQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkiQLModelAccess().getQueryQueryParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__SkiQLModel__QueryAssignment_1"


    // $ANTLR start "rule__EntityTypeQuery__SchemaSpecAssignment_2"
    // InternalSkiql.g:5307:1: rule__EntityTypeQuery__SchemaSpecAssignment_2 : ( ruleEntitySpec ) ;
    public final void rule__EntityTypeQuery__SchemaSpecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5311:1: ( ( ruleEntitySpec ) )
            // InternalSkiql.g:5312:2: ( ruleEntitySpec )
            {
            // InternalSkiql.g:5312:2: ( ruleEntitySpec )
            // InternalSkiql.g:5313:3: ruleEntitySpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeQueryAccess().getSchemaSpecEntitySpecParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntitySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeQueryAccess().getSchemaSpecEntitySpecParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__EntityTypeQuery__SchemaSpecAssignment_2"


    // $ANTLR start "rule__EntityTypeQuery__OperationAssignment_3"
    // InternalSkiql.g:5322:1: rule__EntityTypeQuery__OperationAssignment_3 : ( ruleOperation ) ;
    public final void rule__EntityTypeQuery__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5326:1: ( ( ruleOperation ) )
            // InternalSkiql.g:5327:2: ( ruleOperation )
            {
            // InternalSkiql.g:5327:2: ( ruleOperation )
            // InternalSkiql.g:5328:3: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeQueryAccess().getOperationOperationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeQueryAccess().getOperationOperationParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__EntityTypeQuery__OperationAssignment_3"


    // $ANTLR start "rule__RelationshipTypeQuery__SchemaSpecAssignment_2"
    // InternalSkiql.g:5337:1: rule__RelationshipTypeQuery__SchemaSpecAssignment_2 : ( ruleRelationshipTypeSpec ) ;
    public final void rule__RelationshipTypeQuery__SchemaSpecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5341:1: ( ( ruleRelationshipTypeSpec ) )
            // InternalSkiql.g:5342:2: ( ruleRelationshipTypeSpec )
            {
            // InternalSkiql.g:5342:2: ( ruleRelationshipTypeSpec )
            // InternalSkiql.g:5343:3: ruleRelationshipTypeSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeQueryAccess().getSchemaSpecRelationshipTypeSpecParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationshipTypeSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeQueryAccess().getSchemaSpecRelationshipTypeSpecParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__RelationshipTypeQuery__SchemaSpecAssignment_2"


    // $ANTLR start "rule__RelationshipTypeQuery__OperationAssignment_3"
    // InternalSkiql.g:5352:1: rule__RelationshipTypeQuery__OperationAssignment_3 : ( ruleOperation ) ;
    public final void rule__RelationshipTypeQuery__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5356:1: ( ( ruleOperation ) )
            // InternalSkiql.g:5357:2: ( ruleOperation )
            {
            // InternalSkiql.g:5357:2: ( ruleOperation )
            // InternalSkiql.g:5358:3: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeQueryAccess().getOperationOperationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeQueryAccess().getOperationOperationParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__RelationshipTypeQuery__OperationAssignment_3"


    // $ANTLR start "rule__AnyQuery__SchemaSpecAssignment_2"
    // InternalSkiql.g:5367:1: rule__AnyQuery__SchemaSpecAssignment_2 : ( ruleSchemaTypeSpec ) ;
    public final void rule__AnyQuery__SchemaSpecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5371:1: ( ( ruleSchemaTypeSpec ) )
            // InternalSkiql.g:5372:2: ( ruleSchemaTypeSpec )
            {
            // InternalSkiql.g:5372:2: ( ruleSchemaTypeSpec )
            // InternalSkiql.g:5373:3: ruleSchemaTypeSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyQueryAccess().getSchemaSpecSchemaTypeSpecParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSchemaTypeSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyQueryAccess().getSchemaSpecSchemaTypeSpecParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__AnyQuery__SchemaSpecAssignment_2"


    // $ANTLR start "rule__AnyQuery__OperationAssignment_3"
    // InternalSkiql.g:5382:1: rule__AnyQuery__OperationAssignment_3 : ( ruleOperation ) ;
    public final void rule__AnyQuery__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5386:1: ( ( ruleOperation ) )
            // InternalSkiql.g:5387:2: ( ruleOperation )
            {
            // InternalSkiql.g:5387:2: ( ruleOperation )
            // InternalSkiql.g:5388:3: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyQueryAccess().getOperationOperationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyQueryAccess().getOperationOperationParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__AnyQuery__OperationAssignment_3"


    // $ANTLR start "rule__RelationshipTypeSpec__NameAssignment_1"
    // InternalSkiql.g:5397:1: rule__RelationshipTypeSpec__NameAssignment_1 : ( ( rule__RelationshipTypeSpec__NameAlternatives_1_0 ) ) ;
    public final void rule__RelationshipTypeSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5401:1: ( ( ( rule__RelationshipTypeSpec__NameAlternatives_1_0 ) ) )
            // InternalSkiql.g:5402:2: ( ( rule__RelationshipTypeSpec__NameAlternatives_1_0 ) )
            {
            // InternalSkiql.g:5402:2: ( ( rule__RelationshipTypeSpec__NameAlternatives_1_0 ) )
            // InternalSkiql.g:5403:3: ( rule__RelationshipTypeSpec__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeSpecAccess().getNameAlternatives_1_0()); 
            }
            // InternalSkiql.g:5404:3: ( rule__RelationshipTypeSpec__NameAlternatives_1_0 )
            // InternalSkiql.g:5404:4: rule__RelationshipTypeSpec__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipTypeSpec__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeSpecAccess().getNameAlternatives_1_0()); 
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
    // $ANTLR end "rule__RelationshipTypeSpec__NameAssignment_1"


    // $ANTLR start "rule__RelationshipTypeSpec__VariationFilterAssignment_2"
    // InternalSkiql.g:5412:1: rule__RelationshipTypeSpec__VariationFilterAssignment_2 : ( ruleVariationFilter ) ;
    public final void rule__RelationshipTypeSpec__VariationFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5416:1: ( ( ruleVariationFilter ) )
            // InternalSkiql.g:5417:2: ( ruleVariationFilter )
            {
            // InternalSkiql.g:5417:2: ( ruleVariationFilter )
            // InternalSkiql.g:5418:3: ruleVariationFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeSpecAccess().getVariationFilterVariationFilterParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariationFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeSpecAccess().getVariationFilterVariationFilterParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__RelationshipTypeSpec__VariationFilterAssignment_2"


    // $ANTLR start "rule__SchemaTypeSpec__NameAssignment_1"
    // InternalSkiql.g:5427:1: rule__SchemaTypeSpec__NameAssignment_1 : ( ( rule__SchemaTypeSpec__NameAlternatives_1_0 ) ) ;
    public final void rule__SchemaTypeSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5431:1: ( ( ( rule__SchemaTypeSpec__NameAlternatives_1_0 ) ) )
            // InternalSkiql.g:5432:2: ( ( rule__SchemaTypeSpec__NameAlternatives_1_0 ) )
            {
            // InternalSkiql.g:5432:2: ( ( rule__SchemaTypeSpec__NameAlternatives_1_0 ) )
            // InternalSkiql.g:5433:3: ( rule__SchemaTypeSpec__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaTypeSpecAccess().getNameAlternatives_1_0()); 
            }
            // InternalSkiql.g:5434:3: ( rule__SchemaTypeSpec__NameAlternatives_1_0 )
            // InternalSkiql.g:5434:4: rule__SchemaTypeSpec__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SchemaTypeSpec__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaTypeSpecAccess().getNameAlternatives_1_0()); 
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
    // $ANTLR end "rule__SchemaTypeSpec__NameAssignment_1"


    // $ANTLR start "rule__SchemaTypeSpec__VariationFilterAssignment_2"
    // InternalSkiql.g:5442:1: rule__SchemaTypeSpec__VariationFilterAssignment_2 : ( ruleVariationFilter ) ;
    public final void rule__SchemaTypeSpec__VariationFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5446:1: ( ( ruleVariationFilter ) )
            // InternalSkiql.g:5447:2: ( ruleVariationFilter )
            {
            // InternalSkiql.g:5447:2: ( ruleVariationFilter )
            // InternalSkiql.g:5448:3: ruleVariationFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaTypeSpecAccess().getVariationFilterVariationFilterParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariationFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaTypeSpecAccess().getVariationFilterVariationFilterParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SchemaTypeSpec__VariationFilterAssignment_2"


    // $ANTLR start "rule__EntitySpec__NameAssignment_1"
    // InternalSkiql.g:5457:1: rule__EntitySpec__NameAssignment_1 : ( ( rule__EntitySpec__NameAlternatives_1_0 ) ) ;
    public final void rule__EntitySpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5461:1: ( ( ( rule__EntitySpec__NameAlternatives_1_0 ) ) )
            // InternalSkiql.g:5462:2: ( ( rule__EntitySpec__NameAlternatives_1_0 ) )
            {
            // InternalSkiql.g:5462:2: ( ( rule__EntitySpec__NameAlternatives_1_0 ) )
            // InternalSkiql.g:5463:3: ( rule__EntitySpec__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntitySpecAccess().getNameAlternatives_1_0()); 
            }
            // InternalSkiql.g:5464:3: ( rule__EntitySpec__NameAlternatives_1_0 )
            // InternalSkiql.g:5464:4: rule__EntitySpec__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EntitySpec__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntitySpecAccess().getNameAlternatives_1_0()); 
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
    // $ANTLR end "rule__EntitySpec__NameAssignment_1"


    // $ANTLR start "rule__EntitySpec__VariationFilterAssignment_2"
    // InternalSkiql.g:5472:1: rule__EntitySpec__VariationFilterAssignment_2 : ( ruleVariationFilter ) ;
    public final void rule__EntitySpec__VariationFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5476:1: ( ( ruleVariationFilter ) )
            // InternalSkiql.g:5477:2: ( ruleVariationFilter )
            {
            // InternalSkiql.g:5477:2: ( ruleVariationFilter )
            // InternalSkiql.g:5478:3: ruleVariationFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntitySpecAccess().getVariationFilterVariationFilterParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariationFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntitySpecAccess().getVariationFilterVariationFilterParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__EntitySpec__VariationFilterAssignment_2"


    // $ANTLR start "rule__ReferenceEntitySpec__NameAssignment_1"
    // InternalSkiql.g:5487:1: rule__ReferenceEntitySpec__NameAssignment_1 : ( ( rule__ReferenceEntitySpec__NameAlternatives_1_0 ) ) ;
    public final void rule__ReferenceEntitySpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5491:1: ( ( ( rule__ReferenceEntitySpec__NameAlternatives_1_0 ) ) )
            // InternalSkiql.g:5492:2: ( ( rule__ReferenceEntitySpec__NameAlternatives_1_0 ) )
            {
            // InternalSkiql.g:5492:2: ( ( rule__ReferenceEntitySpec__NameAlternatives_1_0 ) )
            // InternalSkiql.g:5493:3: ( rule__ReferenceEntitySpec__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceEntitySpecAccess().getNameAlternatives_1_0()); 
            }
            // InternalSkiql.g:5494:3: ( rule__ReferenceEntitySpec__NameAlternatives_1_0 )
            // InternalSkiql.g:5494:4: rule__ReferenceEntitySpec__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceEntitySpec__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceEntitySpecAccess().getNameAlternatives_1_0()); 
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
    // $ANTLR end "rule__ReferenceEntitySpec__NameAssignment_1"


    // $ANTLR start "rule__ReferenceEntitySpec__VariationFilterAssignment_2"
    // InternalSkiql.g:5502:1: rule__ReferenceEntitySpec__VariationFilterAssignment_2 : ( ruleReferenceVariationFilter ) ;
    public final void rule__ReferenceEntitySpec__VariationFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5506:1: ( ( ruleReferenceVariationFilter ) )
            // InternalSkiql.g:5507:2: ( ruleReferenceVariationFilter )
            {
            // InternalSkiql.g:5507:2: ( ruleReferenceVariationFilter )
            // InternalSkiql.g:5508:3: ruleReferenceVariationFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceEntitySpecAccess().getVariationFilterReferenceVariationFilterParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReferenceVariationFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceEntitySpecAccess().getVariationFilterReferenceVariationFilterParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ReferenceEntitySpec__VariationFilterAssignment_2"


    // $ANTLR start "rule__RelationshipQuery__FromAssignment_2"
    // InternalSkiql.g:5517:1: rule__RelationshipQuery__FromAssignment_2 : ( ruleReferenceEntitySpec ) ;
    public final void rule__RelationshipQuery__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5521:1: ( ( ruleReferenceEntitySpec ) )
            // InternalSkiql.g:5522:2: ( ruleReferenceEntitySpec )
            {
            // InternalSkiql.g:5522:2: ( ruleReferenceEntitySpec )
            // InternalSkiql.g:5523:3: ruleReferenceEntitySpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getFromReferenceEntitySpecParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getFromReferenceEntitySpecParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__RelationshipQuery__FromAssignment_2"


    // $ANTLR start "rule__RelationshipQuery__ToAssignment_4_0"
    // InternalSkiql.g:5532:1: rule__RelationshipQuery__ToAssignment_4_0 : ( ruleRelationshipSpec ) ;
    public final void rule__RelationshipQuery__ToAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5536:1: ( ( ruleRelationshipSpec ) )
            // InternalSkiql.g:5537:2: ( ruleRelationshipSpec )
            {
            // InternalSkiql.g:5537:2: ( ruleRelationshipSpec )
            // InternalSkiql.g:5538:3: ruleRelationshipSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__RelationshipQuery__ToAssignment_4_0"


    // $ANTLR start "rule__RelationshipQuery__ToAssignment_4_1"
    // InternalSkiql.g:5547:1: rule__RelationshipQuery__ToAssignment_4_1 : ( ruleIndirectRelationshipSpec ) ;
    public final void rule__RelationshipQuery__ToAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5551:1: ( ( ruleIndirectRelationshipSpec ) )
            // InternalSkiql.g:5552:2: ( ruleIndirectRelationshipSpec )
            {
            // InternalSkiql.g:5552:2: ( ruleIndirectRelationshipSpec )
            // InternalSkiql.g:5553:3: ruleIndirectRelationshipSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIndirectRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__RelationshipQuery__ToAssignment_4_1"


    // $ANTLR start "rule__RelationshipQuery__ToAssignment_5_1_0"
    // InternalSkiql.g:5562:1: rule__RelationshipQuery__ToAssignment_5_1_0 : ( ruleRelationshipSpec ) ;
    public final void rule__RelationshipQuery__ToAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5566:1: ( ( ruleRelationshipSpec ) )
            // InternalSkiql.g:5567:2: ( ruleRelationshipSpec )
            {
            // InternalSkiql.g:5567:2: ( ruleRelationshipSpec )
            // InternalSkiql.g:5568:3: ruleRelationshipSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_5_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_5_1_0_0()); 
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
    // $ANTLR end "rule__RelationshipQuery__ToAssignment_5_1_0"


    // $ANTLR start "rule__RelationshipQuery__ToAssignment_5_1_1"
    // InternalSkiql.g:5577:1: rule__RelationshipQuery__ToAssignment_5_1_1 : ( ruleIndirectRelationshipSpec ) ;
    public final void rule__RelationshipQuery__ToAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5581:1: ( ( ruleIndirectRelationshipSpec ) )
            // InternalSkiql.g:5582:2: ( ruleIndirectRelationshipSpec )
            {
            // InternalSkiql.g:5582:2: ( ruleIndirectRelationshipSpec )
            // InternalSkiql.g:5583:3: ruleIndirectRelationshipSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_5_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIndirectRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_5_1_1_0()); 
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
    // $ANTLR end "rule__RelationshipQuery__ToAssignment_5_1_1"


    // $ANTLR start "rule__NestedRelationshipQuery__FromAssignment_3"
    // InternalSkiql.g:5592:1: rule__NestedRelationshipQuery__FromAssignment_3 : ( ruleReferenceEntitySpec ) ;
    public final void rule__NestedRelationshipQuery__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5596:1: ( ( ruleReferenceEntitySpec ) )
            // InternalSkiql.g:5597:2: ( ruleReferenceEntitySpec )
            {
            // InternalSkiql.g:5597:2: ( ruleReferenceEntitySpec )
            // InternalSkiql.g:5598:3: ruleReferenceEntitySpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getFromReferenceEntitySpecParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getFromReferenceEntitySpecParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__FromAssignment_3"


    // $ANTLR start "rule__NestedRelationshipQuery__ToAssignment_5_0"
    // InternalSkiql.g:5607:1: rule__NestedRelationshipQuery__ToAssignment_5_0 : ( ruleRelationshipSpec ) ;
    public final void rule__NestedRelationshipQuery__ToAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5611:1: ( ( ruleRelationshipSpec ) )
            // InternalSkiql.g:5612:2: ( ruleRelationshipSpec )
            {
            // InternalSkiql.g:5612:2: ( ruleRelationshipSpec )
            // InternalSkiql.g:5613:3: ruleRelationshipSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_5_0_0()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__ToAssignment_5_0"


    // $ANTLR start "rule__NestedRelationshipQuery__ToAssignment_5_1"
    // InternalSkiql.g:5622:1: rule__NestedRelationshipQuery__ToAssignment_5_1 : ( ruleIndirectRelationshipSpec ) ;
    public final void rule__NestedRelationshipQuery__ToAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5626:1: ( ( ruleIndirectRelationshipSpec ) )
            // InternalSkiql.g:5627:2: ( ruleIndirectRelationshipSpec )
            {
            // InternalSkiql.g:5627:2: ( ruleIndirectRelationshipSpec )
            // InternalSkiql.g:5628:3: ruleIndirectRelationshipSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIndirectRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__ToAssignment_5_1"


    // $ANTLR start "rule__NestedRelationshipQuery__ToAssignment_6_1_0"
    // InternalSkiql.g:5637:1: rule__NestedRelationshipQuery__ToAssignment_6_1_0 : ( ruleRelationshipSpec ) ;
    public final void rule__NestedRelationshipQuery__ToAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5641:1: ( ( ruleRelationshipSpec ) )
            // InternalSkiql.g:5642:2: ( ruleRelationshipSpec )
            {
            // InternalSkiql.g:5642:2: ( ruleRelationshipSpec )
            // InternalSkiql.g:5643:3: ruleRelationshipSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_6_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getToRelationshipSpecParserRuleCall_6_1_0_0()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__ToAssignment_6_1_0"


    // $ANTLR start "rule__NestedRelationshipQuery__ToAssignment_6_1_1"
    // InternalSkiql.g:5652:1: rule__NestedRelationshipQuery__ToAssignment_6_1_1 : ( ruleIndirectRelationshipSpec ) ;
    public final void rule__NestedRelationshipQuery__ToAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5656:1: ( ( ruleIndirectRelationshipSpec ) )
            // InternalSkiql.g:5657:2: ( ruleIndirectRelationshipSpec )
            {
            // InternalSkiql.g:5657:2: ( ruleIndirectRelationshipSpec )
            // InternalSkiql.g:5658:3: ruleIndirectRelationshipSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIndirectRelationshipSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRelationshipQueryAccess().getToIndirectRelationshipSpecParserRuleCall_6_1_1_0()); 
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
    // $ANTLR end "rule__NestedRelationshipQuery__ToAssignment_6_1_1"


    // $ANTLR start "rule__RelationshipSpec__TargetExpressionAssignment_1"
    // InternalSkiql.g:5667:1: rule__RelationshipSpec__TargetExpressionAssignment_1 : ( ruleTargetExpression ) ;
    public final void rule__RelationshipSpec__TargetExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5671:1: ( ( ruleTargetExpression ) )
            // InternalSkiql.g:5672:2: ( ruleTargetExpression )
            {
            // InternalSkiql.g:5672:2: ( ruleTargetExpression )
            // InternalSkiql.g:5673:3: ruleTargetExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipSpecAccess().getTargetExpressionTargetExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTargetExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipSpecAccess().getTargetExpressionTargetExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__RelationshipSpec__TargetExpressionAssignment_1"


    // $ANTLR start "rule__RelationshipSpec__RelationSpecAssignment_2"
    // InternalSkiql.g:5682:1: rule__RelationshipSpec__RelationSpecAssignment_2 : ( ruleRelationTypeSpec ) ;
    public final void rule__RelationshipSpec__RelationSpecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5686:1: ( ( ruleRelationTypeSpec ) )
            // InternalSkiql.g:5687:2: ( ruleRelationTypeSpec )
            {
            // InternalSkiql.g:5687:2: ( ruleRelationTypeSpec )
            // InternalSkiql.g:5688:3: ruleRelationTypeSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipSpecAccess().getRelationSpecRelationTypeSpecParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationTypeSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipSpecAccess().getRelationSpecRelationTypeSpecParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__RelationshipSpec__RelationSpecAssignment_2"


    // $ANTLR start "rule__RelationSpec__NameAssignment_2"
    // InternalSkiql.g:5697:1: rule__RelationSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RelationSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5701:1: ( ( RULE_ID ) )
            // InternalSkiql.g:5702:2: ( RULE_ID )
            {
            // InternalSkiql.g:5702:2: ( RULE_ID )
            // InternalSkiql.g:5703:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationSpecAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__RelationSpec__NameAssignment_2"


    // $ANTLR start "rule__ReferenceSpec__NameAssignment_2"
    // InternalSkiql.g:5712:1: rule__ReferenceSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ReferenceSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5716:1: ( ( RULE_ID ) )
            // InternalSkiql.g:5717:2: ( RULE_ID )
            {
            // InternalSkiql.g:5717:2: ( RULE_ID )
            // InternalSkiql.g:5718:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceSpecAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__ReferenceSpec__NameAssignment_2"


    // $ANTLR start "rule__ReferenceSpec__VariationFilterAssignment_3"
    // InternalSkiql.g:5727:1: rule__ReferenceSpec__VariationFilterAssignment_3 : ( ruleVariationFilter ) ;
    public final void rule__ReferenceSpec__VariationFilterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5731:1: ( ( ruleVariationFilter ) )
            // InternalSkiql.g:5732:2: ( ruleVariationFilter )
            {
            // InternalSkiql.g:5732:2: ( ruleVariationFilter )
            // InternalSkiql.g:5733:3: ruleVariationFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceSpecAccess().getVariationFilterVariationFilterParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariationFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceSpecAccess().getVariationFilterVariationFilterParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ReferenceSpec__VariationFilterAssignment_3"


    // $ANTLR start "rule__AggregationSpec__NameAssignment_2"
    // InternalSkiql.g:5742:1: rule__AggregationSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AggregationSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5746:1: ( ( RULE_ID ) )
            // InternalSkiql.g:5747:2: ( RULE_ID )
            {
            // InternalSkiql.g:5747:2: ( RULE_ID )
            // InternalSkiql.g:5748:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationSpecAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__AggregationSpec__NameAssignment_2"


    // $ANTLR start "rule__IndirectRelationshipSpec__IndirectAssignment_1"
    // InternalSkiql.g:5757:1: rule__IndirectRelationshipSpec__IndirectAssignment_1 : ( ( '>>' ) ) ;
    public final void rule__IndirectRelationshipSpec__IndirectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5761:1: ( ( ( '>>' ) ) )
            // InternalSkiql.g:5762:2: ( ( '>>' ) )
            {
            // InternalSkiql.g:5762:2: ( ( '>>' ) )
            // InternalSkiql.g:5763:3: ( '>>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecAccess().getIndirectGreaterThanSignGreaterThanSignKeyword_1_0()); 
            }
            // InternalSkiql.g:5764:3: ( '>>' )
            // InternalSkiql.g:5765:4: '>>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecAccess().getIndirectGreaterThanSignGreaterThanSignKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecAccess().getIndirectGreaterThanSignGreaterThanSignKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecAccess().getIndirectGreaterThanSignGreaterThanSignKeyword_1_0()); 
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
    // $ANTLR end "rule__IndirectRelationshipSpec__IndirectAssignment_1"


    // $ANTLR start "rule__IndirectRelationshipSpec__TargetExpressionAssignment_2"
    // InternalSkiql.g:5776:1: rule__IndirectRelationshipSpec__TargetExpressionAssignment_2 : ( ruleTargetExpression ) ;
    public final void rule__IndirectRelationshipSpec__TargetExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5780:1: ( ( ruleTargetExpression ) )
            // InternalSkiql.g:5781:2: ( ruleTargetExpression )
            {
            // InternalSkiql.g:5781:2: ( ruleTargetExpression )
            // InternalSkiql.g:5782:3: ruleTargetExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecAccess().getTargetExpressionTargetExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTargetExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecAccess().getTargetExpressionTargetExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__IndirectRelationshipSpec__TargetExpressionAssignment_2"


    // $ANTLR start "rule__IndirectRelationshipSpec__RelationSpecAssignment_3"
    // InternalSkiql.g:5791:1: rule__IndirectRelationshipSpec__RelationSpecAssignment_3 : ( ruleIndirectRelationTypeSpec ) ;
    public final void rule__IndirectRelationshipSpec__RelationSpecAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5795:1: ( ( ruleIndirectRelationTypeSpec ) )
            // InternalSkiql.g:5796:2: ( ruleIndirectRelationTypeSpec )
            {
            // InternalSkiql.g:5796:2: ( ruleIndirectRelationTypeSpec )
            // InternalSkiql.g:5797:3: ruleIndirectRelationTypeSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndirectRelationshipSpecAccess().getRelationSpecIndirectRelationTypeSpecParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIndirectRelationTypeSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndirectRelationshipSpecAccess().getRelationSpecIndirectRelationTypeSpecParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__IndirectRelationshipSpec__RelationSpecAssignment_3"


    // $ANTLR start "rule__RelationshipExpression__RelationshipQueryAssignment_1"
    // InternalSkiql.g:5806:1: rule__RelationshipExpression__RelationshipQueryAssignment_1 : ( ruleNestedRelationshipQuery ) ;
    public final void rule__RelationshipExpression__RelationshipQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5810:1: ( ( ruleNestedRelationshipQuery ) )
            // InternalSkiql.g:5811:2: ( ruleNestedRelationshipQuery )
            {
            // InternalSkiql.g:5811:2: ( ruleNestedRelationshipQuery )
            // InternalSkiql.g:5812:3: ruleNestedRelationshipQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipExpressionAccess().getRelationshipQueryNestedRelationshipQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNestedRelationshipQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipExpressionAccess().getRelationshipQueryNestedRelationshipQueryParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__RelationshipExpression__RelationshipQueryAssignment_1"


    // $ANTLR start "rule__EntityExpression__EntitySpecAssignment_1"
    // InternalSkiql.g:5821:1: rule__EntityExpression__EntitySpecAssignment_1 : ( ruleToReferenceEntitySpec ) ;
    public final void rule__EntityExpression__EntitySpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5825:1: ( ( ruleToReferenceEntitySpec ) )
            // InternalSkiql.g:5826:2: ( ruleToReferenceEntitySpec )
            {
            // InternalSkiql.g:5826:2: ( ruleToReferenceEntitySpec )
            // InternalSkiql.g:5827:3: ruleToReferenceEntitySpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityExpressionAccess().getEntitySpecToReferenceEntitySpecParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleToReferenceEntitySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityExpressionAccess().getEntitySpecToReferenceEntitySpecParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__EntityExpression__EntitySpecAssignment_1"


    // $ANTLR start "rule__ToReferenceEntitySpec__NameAssignment_1"
    // InternalSkiql.g:5836:1: rule__ToReferenceEntitySpec__NameAssignment_1 : ( ( rule__ToReferenceEntitySpec__NameAlternatives_1_0 ) ) ;
    public final void rule__ToReferenceEntitySpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5840:1: ( ( ( rule__ToReferenceEntitySpec__NameAlternatives_1_0 ) ) )
            // InternalSkiql.g:5841:2: ( ( rule__ToReferenceEntitySpec__NameAlternatives_1_0 ) )
            {
            // InternalSkiql.g:5841:2: ( ( rule__ToReferenceEntitySpec__NameAlternatives_1_0 ) )
            // InternalSkiql.g:5842:3: ( rule__ToReferenceEntitySpec__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToReferenceEntitySpecAccess().getNameAlternatives_1_0()); 
            }
            // InternalSkiql.g:5843:3: ( rule__ToReferenceEntitySpec__NameAlternatives_1_0 )
            // InternalSkiql.g:5843:4: rule__ToReferenceEntitySpec__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ToReferenceEntitySpec__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToReferenceEntitySpecAccess().getNameAlternatives_1_0()); 
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
    // $ANTLR end "rule__ToReferenceEntitySpec__NameAssignment_1"


    // $ANTLR start "rule__ToReferenceEntitySpec__VariationFilterAssignment_2"
    // InternalSkiql.g:5851:1: rule__ToReferenceEntitySpec__VariationFilterAssignment_2 : ( ruleReferenceVariationFilter ) ;
    public final void rule__ToReferenceEntitySpec__VariationFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5855:1: ( ( ruleReferenceVariationFilter ) )
            // InternalSkiql.g:5856:2: ( ruleReferenceVariationFilter )
            {
            // InternalSkiql.g:5856:2: ( ruleReferenceVariationFilter )
            // InternalSkiql.g:5857:3: ruleReferenceVariationFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToReferenceEntitySpecAccess().getVariationFilterReferenceVariationFilterParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReferenceVariationFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToReferenceEntitySpecAccess().getVariationFilterReferenceVariationFilterParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ToReferenceEntitySpec__VariationFilterAssignment_2"


    // $ANTLR start "rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0"
    // InternalSkiql.g:5866:1: rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0 : ( ruleReferencePropertySpec ) ;
    public final void rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5870:1: ( ( ruleReferencePropertySpec ) )
            // InternalSkiql.g:5871:2: ( ruleReferencePropertySpec )
            {
            // InternalSkiql.g:5871:2: ( ruleReferencePropertySpec )
            // InternalSkiql.g:5872:3: ruleReferencePropertySpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsReferencePropertySpecParserRuleCall_1_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReferencePropertySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsReferencePropertySpecParserRuleCall_1_1_1_0_0()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_0"


    // $ANTLR start "rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1"
    // InternalSkiql.g:5881:1: rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1 : ( ruleReferencePropertySpec ) ;
    public final void rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5885:1: ( ( ruleReferencePropertySpec ) )
            // InternalSkiql.g:5886:2: ( ruleReferencePropertySpec )
            {
            // InternalSkiql.g:5886:2: ( ruleReferencePropertySpec )
            // InternalSkiql.g:5887:3: ruleReferencePropertySpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsReferencePropertySpecParserRuleCall_1_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReferencePropertySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceVariationFilterAccess().getPropertySpecsReferencePropertySpecParserRuleCall_1_1_1_1_1_0()); 
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
    // $ANTLR end "rule__ReferenceVariationFilter__PropertySpecsAssignment_1_1_1_1_1"


    // $ANTLR start "rule__ReferencePropertySpec__NameAssignment_1"
    // InternalSkiql.g:5896:1: rule__ReferencePropertySpec__NameAssignment_1 : ( ( rule__ReferencePropertySpec__NameAlternatives_1_0 ) ) ;
    public final void rule__ReferencePropertySpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5900:1: ( ( ( rule__ReferencePropertySpec__NameAlternatives_1_0 ) ) )
            // InternalSkiql.g:5901:2: ( ( rule__ReferencePropertySpec__NameAlternatives_1_0 ) )
            {
            // InternalSkiql.g:5901:2: ( ( rule__ReferencePropertySpec__NameAlternatives_1_0 ) )
            // InternalSkiql.g:5902:3: ( rule__ReferencePropertySpec__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertySpecAccess().getNameAlternatives_1_0()); 
            }
            // InternalSkiql.g:5903:3: ( rule__ReferencePropertySpec__NameAlternatives_1_0 )
            // InternalSkiql.g:5903:4: rule__ReferencePropertySpec__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePropertySpec__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertySpecAccess().getNameAlternatives_1_0()); 
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
    // $ANTLR end "rule__ReferencePropertySpec__NameAssignment_1"


    // $ANTLR start "rule__ReferencePropertySpec__TypeAssignment_2_1"
    // InternalSkiql.g:5911:1: rule__ReferencePropertySpec__TypeAssignment_2_1 : ( rulePrimitiveType ) ;
    public final void rule__ReferencePropertySpec__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5915:1: ( ( rulePrimitiveType ) )
            // InternalSkiql.g:5916:2: ( rulePrimitiveType )
            {
            // InternalSkiql.g:5916:2: ( rulePrimitiveType )
            // InternalSkiql.g:5917:3: rulePrimitiveType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertySpecAccess().getTypePrimitiveTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertySpecAccess().getTypePrimitiveTypeParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__ReferencePropertySpec__TypeAssignment_2_1"


    // $ANTLR start "rule__VariationFilter__PropertySpecsAssignment_1_1_1_0"
    // InternalSkiql.g:5926:1: rule__VariationFilter__PropertySpecsAssignment_1_1_1_0 : ( rulePropertySpec ) ;
    public final void rule__VariationFilter__PropertySpecsAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5930:1: ( ( rulePropertySpec ) )
            // InternalSkiql.g:5931:2: ( rulePropertySpec )
            {
            // InternalSkiql.g:5931:2: ( rulePropertySpec )
            // InternalSkiql.g:5932:3: rulePropertySpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getPropertySpecsPropertySpecParserRuleCall_1_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePropertySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getPropertySpecsPropertySpecParserRuleCall_1_1_1_0_0()); 
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
    // $ANTLR end "rule__VariationFilter__PropertySpecsAssignment_1_1_1_0"


    // $ANTLR start "rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1"
    // InternalSkiql.g:5941:1: rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1 : ( rulePropertySpec ) ;
    public final void rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5945:1: ( ( rulePropertySpec ) )
            // InternalSkiql.g:5946:2: ( rulePropertySpec )
            {
            // InternalSkiql.g:5946:2: ( rulePropertySpec )
            // InternalSkiql.g:5947:3: rulePropertySpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getPropertySpecsPropertySpecParserRuleCall_1_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePropertySpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getPropertySpecsPropertySpecParserRuleCall_1_1_1_1_1_0()); 
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
    // $ANTLR end "rule__VariationFilter__PropertySpecsAssignment_1_1_1_1_1"


    // $ANTLR start "rule__VariationFilter__OnlyAssignment_1_1_3"
    // InternalSkiql.g:5956:1: rule__VariationFilter__OnlyAssignment_1_1_3 : ( ( 'ONLY' ) ) ;
    public final void rule__VariationFilter__OnlyAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5960:1: ( ( ( 'ONLY' ) ) )
            // InternalSkiql.g:5961:2: ( ( 'ONLY' ) )
            {
            // InternalSkiql.g:5961:2: ( ( 'ONLY' ) )
            // InternalSkiql.g:5962:3: ( 'ONLY' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getOnlyONLYKeyword_1_1_3_0()); 
            }
            // InternalSkiql.g:5963:3: ( 'ONLY' )
            // InternalSkiql.g:5964:4: 'ONLY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariationFilterAccess().getOnlyONLYKeyword_1_1_3_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getOnlyONLYKeyword_1_1_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariationFilterAccess().getOnlyONLYKeyword_1_1_3_0()); 
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
    // $ANTLR end "rule__VariationFilter__OnlyAssignment_1_1_3"


    // $ANTLR start "rule__PropertySpec__NameAssignment_1"
    // InternalSkiql.g:5975:1: rule__PropertySpec__NameAssignment_1 : ( ( rule__PropertySpec__NameAlternatives_1_0 ) ) ;
    public final void rule__PropertySpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5979:1: ( ( ( rule__PropertySpec__NameAlternatives_1_0 ) ) )
            // InternalSkiql.g:5980:2: ( ( rule__PropertySpec__NameAlternatives_1_0 ) )
            {
            // InternalSkiql.g:5980:2: ( ( rule__PropertySpec__NameAlternatives_1_0 ) )
            // InternalSkiql.g:5981:3: ( rule__PropertySpec__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySpecAccess().getNameAlternatives_1_0()); 
            }
            // InternalSkiql.g:5982:3: ( rule__PropertySpec__NameAlternatives_1_0 )
            // InternalSkiql.g:5982:4: rule__PropertySpec__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertySpec__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySpecAccess().getNameAlternatives_1_0()); 
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
    // $ANTLR end "rule__PropertySpec__NameAssignment_1"


    // $ANTLR start "rule__PropertySpec__TypeAssignment_2_1"
    // InternalSkiql.g:5990:1: rule__PropertySpec__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__PropertySpec__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:5994:1: ( ( ruleType ) )
            // InternalSkiql.g:5995:2: ( ruleType )
            {
            // InternalSkiql.g:5995:2: ( ruleType )
            // InternalSkiql.g:5996:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertySpecAccess().getTypeTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertySpecAccess().getTypeTypeParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__PropertySpec__TypeAssignment_2_1"


    // $ANTLR start "rule__PrimitiveType__TypeAssignment_1"
    // InternalSkiql.g:6005:1: rule__PrimitiveType__TypeAssignment_1 : ( ruleTypeEnum ) ;
    public final void rule__PrimitiveType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6009:1: ( ( ruleTypeEnum ) )
            // InternalSkiql.g:6010:2: ( ruleTypeEnum )
            {
            // InternalSkiql.g:6010:2: ( ruleTypeEnum )
            // InternalSkiql.g:6011:3: ruleTypeEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getTypeTypeEnumEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getTypeTypeEnumEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__PrimitiveType__TypeAssignment_1"


    // $ANTLR start "rule__PrimitiveType__ArrayAssignment_2"
    // InternalSkiql.g:6020:1: rule__PrimitiveType__ArrayAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__PrimitiveType__ArrayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6024:1: ( ( ( '[]' ) ) )
            // InternalSkiql.g:6025:2: ( ( '[]' ) )
            {
            // InternalSkiql.g:6025:2: ( ( '[]' ) )
            // InternalSkiql.g:6026:3: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            // InternalSkiql.g:6027:3: ( '[]' )
            // InternalSkiql.g:6028:4: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0()); 
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
    // $ANTLR end "rule__PrimitiveType__ArrayAssignment_2"


    // $ANTLR start "rule__RelationshipType__RelationTypeAssignment_1"
    // InternalSkiql.g:6039:1: rule__RelationshipType__RelationTypeAssignment_1 : ( ruleRelationshipTypeEnum ) ;
    public final void rule__RelationshipType__RelationTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6043:1: ( ( ruleRelationshipTypeEnum ) )
            // InternalSkiql.g:6044:2: ( ruleRelationshipTypeEnum )
            {
            // InternalSkiql.g:6044:2: ( ruleRelationshipTypeEnum )
            // InternalSkiql.g:6045:3: ruleRelationshipTypeEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeAccess().getRelationTypeRelationshipTypeEnumEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationshipTypeEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeAccess().getRelationTypeRelationshipTypeEnumEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__RelationshipType__RelationTypeAssignment_1"


    // $ANTLR start "rule__RelationshipType__TargetEntityNameAssignment_2"
    // InternalSkiql.g:6054:1: rule__RelationshipType__TargetEntityNameAssignment_2 : ( ( rule__RelationshipType__TargetEntityNameAlternatives_2_0 ) ) ;
    public final void rule__RelationshipType__TargetEntityNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6058:1: ( ( ( rule__RelationshipType__TargetEntityNameAlternatives_2_0 ) ) )
            // InternalSkiql.g:6059:2: ( ( rule__RelationshipType__TargetEntityNameAlternatives_2_0 ) )
            {
            // InternalSkiql.g:6059:2: ( ( rule__RelationshipType__TargetEntityNameAlternatives_2_0 ) )
            // InternalSkiql.g:6060:3: ( rule__RelationshipType__TargetEntityNameAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeAccess().getTargetEntityNameAlternatives_2_0()); 
            }
            // InternalSkiql.g:6061:3: ( rule__RelationshipType__TargetEntityNameAlternatives_2_0 )
            // InternalSkiql.g:6061:4: rule__RelationshipType__TargetEntityNameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipType__TargetEntityNameAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeAccess().getTargetEntityNameAlternatives_2_0()); 
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
    // $ANTLR end "rule__RelationshipType__TargetEntityNameAssignment_2"


    // $ANTLR start "rule__BeforeHistory__DateTimeAssignment_3"
    // InternalSkiql.g:6069:1: rule__BeforeHistory__DateTimeAssignment_3 : ( ruleDateTime ) ;
    public final void rule__BeforeHistory__DateTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6073:1: ( ( ruleDateTime ) )
            // InternalSkiql.g:6074:2: ( ruleDateTime )
            {
            // InternalSkiql.g:6074:2: ( ruleDateTime )
            // InternalSkiql.g:6075:3: ruleDateTime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBeforeHistoryAccess().getDateTimeDateTimeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBeforeHistoryAccess().getDateTimeDateTimeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__BeforeHistory__DateTimeAssignment_3"


    // $ANTLR start "rule__AfterHistory__DateTimeAssignment_3"
    // InternalSkiql.g:6084:1: rule__AfterHistory__DateTimeAssignment_3 : ( ruleDateTime ) ;
    public final void rule__AfterHistory__DateTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6088:1: ( ( ruleDateTime ) )
            // InternalSkiql.g:6089:2: ( ruleDateTime )
            {
            // InternalSkiql.g:6089:2: ( ruleDateTime )
            // InternalSkiql.g:6090:3: ruleDateTime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAfterHistoryAccess().getDateTimeDateTimeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAfterHistoryAccess().getDateTimeDateTimeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__AfterHistory__DateTimeAssignment_3"


    // $ANTLR start "rule__BetweenHistory__AfterDateTimeAssignment_3"
    // InternalSkiql.g:6099:1: rule__BetweenHistory__AfterDateTimeAssignment_3 : ( ruleDateTime ) ;
    public final void rule__BetweenHistory__AfterDateTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6103:1: ( ( ruleDateTime ) )
            // InternalSkiql.g:6104:2: ( ruleDateTime )
            {
            // InternalSkiql.g:6104:2: ( ruleDateTime )
            // InternalSkiql.g:6105:3: ruleDateTime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getAfterDateTimeDateTimeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getAfterDateTimeDateTimeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__BetweenHistory__AfterDateTimeAssignment_3"


    // $ANTLR start "rule__BetweenHistory__BeforeDateTimeAssignment_5"
    // InternalSkiql.g:6114:1: rule__BetweenHistory__BeforeDateTimeAssignment_5 : ( ruleDateTime ) ;
    public final void rule__BetweenHistory__BeforeDateTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6118:1: ( ( ruleDateTime ) )
            // InternalSkiql.g:6119:2: ( ruleDateTime )
            {
            // InternalSkiql.g:6119:2: ( ruleDateTime )
            // InternalSkiql.g:6120:3: ruleDateTime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBetweenHistoryAccess().getBeforeDateTimeDateTimeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBetweenHistoryAccess().getBeforeDateTimeDateTimeParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__BetweenHistory__BeforeDateTimeAssignment_5"


    // $ANTLR start "rule__DateTime__YearAssignment_1"
    // InternalSkiql.g:6129:1: rule__DateTime__YearAssignment_1 : ( RULE_INT ) ;
    public final void rule__DateTime__YearAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6133:1: ( ( RULE_INT ) )
            // InternalSkiql.g:6134:2: ( RULE_INT )
            {
            // InternalSkiql.g:6134:2: ( RULE_INT )
            // InternalSkiql.g:6135:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getYearINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getYearINTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__DateTime__YearAssignment_1"


    // $ANTLR start "rule__DateTime__MonthAssignment_3"
    // InternalSkiql.g:6144:1: rule__DateTime__MonthAssignment_3 : ( RULE_INT ) ;
    public final void rule__DateTime__MonthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6148:1: ( ( RULE_INT ) )
            // InternalSkiql.g:6149:2: ( RULE_INT )
            {
            // InternalSkiql.g:6149:2: ( RULE_INT )
            // InternalSkiql.g:6150:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getMonthINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getMonthINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__DateTime__MonthAssignment_3"


    // $ANTLR start "rule__DateTime__DayAssignment_5"
    // InternalSkiql.g:6159:1: rule__DateTime__DayAssignment_5 : ( RULE_INT ) ;
    public final void rule__DateTime__DayAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6163:1: ( ( RULE_INT ) )
            // InternalSkiql.g:6164:2: ( RULE_INT )
            {
            // InternalSkiql.g:6164:2: ( RULE_INT )
            // InternalSkiql.g:6165:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getDayINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getDayINTTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__DateTime__DayAssignment_5"


    // $ANTLR start "rule__DateTime__HourAssignment_6_0"
    // InternalSkiql.g:6174:1: rule__DateTime__HourAssignment_6_0 : ( RULE_INT ) ;
    public final void rule__DateTime__HourAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6178:1: ( ( RULE_INT ) )
            // InternalSkiql.g:6179:2: ( RULE_INT )
            {
            // InternalSkiql.g:6179:2: ( RULE_INT )
            // InternalSkiql.g:6180:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getHourINTTerminalRuleCall_6_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getHourINTTerminalRuleCall_6_0_0()); 
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
    // $ANTLR end "rule__DateTime__HourAssignment_6_0"


    // $ANTLR start "rule__DateTime__MinutesAssignment_6_2"
    // InternalSkiql.g:6189:1: rule__DateTime__MinutesAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__DateTime__MinutesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6193:1: ( ( RULE_INT ) )
            // InternalSkiql.g:6194:2: ( RULE_INT )
            {
            // InternalSkiql.g:6194:2: ( RULE_INT )
            // InternalSkiql.g:6195:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getMinutesINTTerminalRuleCall_6_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getMinutesINTTerminalRuleCall_6_2_0()); 
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
    // $ANTLR end "rule__DateTime__MinutesAssignment_6_2"


    // $ANTLR start "rule__DateTime__SecondsAssignment_6_4"
    // InternalSkiql.g:6204:1: rule__DateTime__SecondsAssignment_6_4 : ( RULE_INT ) ;
    public final void rule__DateTime__SecondsAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkiql.g:6208:1: ( ( RULE_INT ) )
            // InternalSkiql.g:6209:2: ( RULE_INT )
            {
            // InternalSkiql.g:6209:2: ( RULE_INT )
            // InternalSkiql.g:6210:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateTimeAccess().getSecondsINTTerminalRuleCall_6_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateTimeAccess().getSecondsINTTerminalRuleCall_6_4_0()); 
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
    // $ANTLR end "rule__DateTime__SecondsAssignment_6_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000B20000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000C80400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002004001810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000801810L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004001810L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010002010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000810L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});

}