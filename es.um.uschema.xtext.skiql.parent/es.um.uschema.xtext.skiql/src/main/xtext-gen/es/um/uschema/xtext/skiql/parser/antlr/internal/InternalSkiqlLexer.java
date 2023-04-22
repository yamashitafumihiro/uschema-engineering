package es.um.uschema.xtext.skiql.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSkiqlLexer extends Lexer {
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

    public InternalSkiqlLexer() {;} 
    public InternalSkiqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSkiqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSkiql.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:11:7: ( 'ENTITY' )
            // InternalSkiql.g:11:9: 'ENTITY'
            {
            match("ENTITY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:12:7: ( 'REL' )
            // InternalSkiql.g:12:9: 'REL'
            {
            match("REL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:13:7: ( 'ANY' )
            // InternalSkiql.g:13:9: 'ANY'
            {
            match("ANY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:14:7: ( 'KEYS' )
            // InternalSkiql.g:14:9: 'KEYS'
            {
            match("KEYS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:15:7: ( '*' )
            // InternalSkiql.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:16:7: ( '_' )
            // InternalSkiql.g:16:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:17:7: ( 'FROM' )
            // InternalSkiql.g:17:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:18:7: ( 'TO' )
            // InternalSkiql.g:18:9: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:19:7: ( ',' )
            // InternalSkiql.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:20:7: ( '{' )
            // InternalSkiql.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:21:7: ( '}' )
            // InternalSkiql.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:22:7: ( 'REF' )
            // InternalSkiql.g:22:9: 'REF'
            {
            match("REF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:23:7: ( 'AGGR' )
            // InternalSkiql.g:23:9: 'AGGR'
            {
            match("AGGR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:24:7: ( '>>' )
            // InternalSkiql.g:24:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:25:7: ( '[]' )
            // InternalSkiql.g:25:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:26:7: ( '[' )
            // InternalSkiql.g:26:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:27:7: ( ']' )
            // InternalSkiql.g:27:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:28:7: ( ':' )
            // InternalSkiql.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:29:7: ( 'ONLY' )
            // InternalSkiql.g:29:9: 'ONLY'
            {
            match("ONLY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:30:7: ( 'BEFORE' )
            // InternalSkiql.g:30:9: 'BEFORE'
            {
            match("BEFORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:31:7: ( '(' )
            // InternalSkiql.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:32:7: ( ')' )
            // InternalSkiql.g:32:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:33:7: ( 'AFTER' )
            // InternalSkiql.g:33:9: 'AFTER'
            {
            match("AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:34:7: ( 'BETWEEN' )
            // InternalSkiql.g:34:9: 'BETWEEN'
            {
            match("BETWEEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:35:7: ( '-' )
            // InternalSkiql.g:35:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:36:7: ( 'string' )
            // InternalSkiql.g:36:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:37:7: ( 'number' )
            // InternalSkiql.g:37:9: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:38:7: ( 'boolean' )
            // InternalSkiql.g:38:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:2717:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '0' .. '9' )* )
            // InternalSkiql.g:2717:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '0' .. '9' )*
            {
            if ( input.LA(1)=='*'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSkiql.g:2717:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSkiql.g:
            	    {
            	    if ( input.LA(1)=='*'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:2719:10: ( ( '0' .. '9' )+ )
            // InternalSkiql.g:2719:12: ( '0' .. '9' )+
            {
            // InternalSkiql.g:2719:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSkiql.g:2719:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:2721:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSkiql.g:2721:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSkiql.g:2721:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSkiql.g:2721:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSkiql.g:2721:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSkiql.g:2721:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSkiql.g:2721:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSkiql.g:2721:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSkiql.g:2721:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSkiql.g:2721:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSkiql.g:2721:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:2723:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSkiql.g:2723:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSkiql.g:2723:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSkiql.g:2723:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:2725:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSkiql.g:2725:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSkiql.g:2725:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSkiql.g:2725:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalSkiql.g:2725:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSkiql.g:2725:41: ( '\\r' )? '\\n'
                    {
                    // InternalSkiql.g:2725:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSkiql.g:2725:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:2727:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSkiql.g:2727:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSkiql.g:2727:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSkiql.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSkiql.g:2729:16: ( . )
            // InternalSkiql.g:2729:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSkiql.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=35;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalSkiql.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalSkiql.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalSkiql.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalSkiql.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalSkiql.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalSkiql.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalSkiql.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalSkiql.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalSkiql.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalSkiql.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalSkiql.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalSkiql.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalSkiql.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalSkiql.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalSkiql.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalSkiql.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalSkiql.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalSkiql.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalSkiql.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalSkiql.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalSkiql.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalSkiql.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalSkiql.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalSkiql.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalSkiql.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalSkiql.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalSkiql.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalSkiql.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalSkiql.g:1:178: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalSkiql.g:1:186: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // InternalSkiql.g:1:195: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalSkiql.g:1:207: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // InternalSkiql.g:1:223: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalSkiql.g:1:239: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalSkiql.g:1:247: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\4\40\1\46\1\47\2\40\3\uffff\1\36\1\57\2\uffff\2\40\3\uffff\3\40\2\uffff\3\36\2\uffff\1\40\1\uffff\5\40\2\uffff\1\40\1\107\10\uffff\2\40\3\uffff\3\40\5\uffff\1\40\1\117\1\120\1\121\4\40\1\uffff\7\40\3\uffff\1\135\1\40\1\137\1\140\1\141\6\40\1\uffff\1\150\3\uffff\5\40\1\156\1\uffff\1\157\1\40\1\161\1\162\1\40\2\uffff\1\164\2\uffff\1\165\2\uffff";
    static final String DFA11_eofS =
        "\166\uffff";
    static final String DFA11_minS =
        "\1\0\1\116\1\105\1\106\1\105\2\52\1\122\1\117\3\uffff\1\76\1\135\2\uffff\1\116\1\105\3\uffff\1\164\1\165\1\157\2\uffff\2\0\1\52\2\uffff\1\124\1\uffff\1\106\1\131\1\107\1\124\1\131\2\uffff\1\117\1\52\10\uffff\1\114\1\106\3\uffff\1\162\1\155\1\157\5\uffff\1\111\3\52\1\122\1\105\1\123\1\115\1\uffff\1\131\1\117\1\127\1\151\1\142\1\154\1\124\3\uffff\1\52\1\122\3\52\1\122\1\105\1\156\2\145\1\131\1\uffff\1\52\3\uffff\2\105\1\147\1\162\1\141\1\52\1\uffff\1\52\1\116\2\52\1\156\2\uffff\1\52\2\uffff\1\52\2\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\116\1\105\1\116\1\105\2\172\1\122\1\117\3\uffff\1\76\1\135\2\uffff\1\116\1\105\3\uffff\1\164\1\165\1\157\2\uffff\2\uffff\1\57\2\uffff\1\124\1\uffff\1\114\1\131\1\107\1\124\1\131\2\uffff\1\117\1\172\10\uffff\1\114\1\124\3\uffff\1\162\1\155\1\157\5\uffff\1\111\3\172\1\122\1\105\1\123\1\115\1\uffff\1\131\1\117\1\127\1\151\1\142\1\154\1\124\3\uffff\1\172\1\122\3\172\1\122\1\105\1\156\2\145\1\131\1\uffff\1\172\3\uffff\2\105\1\147\1\162\1\141\1\172\1\uffff\1\172\1\116\2\172\1\156\2\uffff\1\172\2\uffff\1\172\2\uffff";
    static final String DFA11_acceptS =
        "\11\uffff\1\11\1\12\1\13\2\uffff\1\21\1\22\2\uffff\1\25\1\26\1\31\3\uffff\1\35\1\36\3\uffff\1\42\1\43\1\uffff\1\35\5\uffff\1\5\1\6\2\uffff\1\11\1\12\1\13\1\16\1\17\1\20\1\21\1\22\2\uffff\1\25\1\26\1\31\3\uffff\1\36\1\37\1\40\1\41\1\42\10\uffff\1\10\7\uffff\1\2\1\14\1\3\13\uffff\1\15\1\uffff\1\4\1\7\1\23\6\uffff\1\27\5\uffff\1\1\1\24\1\uffff\1\32\1\33\1\uffff\1\30\1\34";
    static final String DFA11_specialS =
        "\1\0\31\uffff\1\2\1\1\132\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\32\4\36\1\33\1\22\1\23\1\5\1\36\1\11\1\24\1\36\1\34\12\31\1\17\3\36\1\14\2\36\1\3\1\21\2\30\1\1\1\7\4\30\1\4\3\30\1\20\2\30\1\2\1\30\1\10\6\30\1\15\1\36\1\16\1\36\1\6\1\36\1\30\1\27\13\30\1\26\4\30\1\25\7\30\1\12\1\36\1\13\uff82\36",
            "\1\37",
            "\1\41",
            "\1\44\1\43\6\uffff\1\42",
            "\1\45",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\0\73",
            "\0\73",
            "\1\74\4\uffff\1\75",
            "",
            "",
            "\1\77",
            "",
            "\1\101\5\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "\1\106",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111\15\uffff\1\112",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\136",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\160",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\163",
            "",
            "",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\40\5\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='E') ) {s = 1;}

                        else if ( (LA11_0=='R') ) {s = 2;}

                        else if ( (LA11_0=='A') ) {s = 3;}

                        else if ( (LA11_0=='K') ) {s = 4;}

                        else if ( (LA11_0=='*') ) {s = 5;}

                        else if ( (LA11_0=='_') ) {s = 6;}

                        else if ( (LA11_0=='F') ) {s = 7;}

                        else if ( (LA11_0=='T') ) {s = 8;}

                        else if ( (LA11_0==',') ) {s = 9;}

                        else if ( (LA11_0=='{') ) {s = 10;}

                        else if ( (LA11_0=='}') ) {s = 11;}

                        else if ( (LA11_0=='>') ) {s = 12;}

                        else if ( (LA11_0=='[') ) {s = 13;}

                        else if ( (LA11_0==']') ) {s = 14;}

                        else if ( (LA11_0==':') ) {s = 15;}

                        else if ( (LA11_0=='O') ) {s = 16;}

                        else if ( (LA11_0=='B') ) {s = 17;}

                        else if ( (LA11_0=='(') ) {s = 18;}

                        else if ( (LA11_0==')') ) {s = 19;}

                        else if ( (LA11_0=='-') ) {s = 20;}

                        else if ( (LA11_0=='s') ) {s = 21;}

                        else if ( (LA11_0=='n') ) {s = 22;}

                        else if ( (LA11_0=='b') ) {s = 23;}

                        else if ( ((LA11_0>='C' && LA11_0<='D')||(LA11_0>='G' && LA11_0<='J')||(LA11_0>='L' && LA11_0<='N')||(LA11_0>='P' && LA11_0<='Q')||LA11_0=='S'||(LA11_0>='U' && LA11_0<='Z')||LA11_0=='a'||(LA11_0>='c' && LA11_0<='m')||(LA11_0>='o' && LA11_0<='r')||(LA11_0>='t' && LA11_0<='z')) ) {s = 24;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 25;}

                        else if ( (LA11_0=='\"') ) {s = 26;}

                        else if ( (LA11_0=='\'') ) {s = 27;}

                        else if ( (LA11_0=='/') ) {s = 28;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 29;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||LA11_0=='+'||LA11_0=='.'||(LA11_0>=';' && LA11_0<='=')||(LA11_0>='?' && LA11_0<='@')||LA11_0=='\\'||LA11_0=='^'||LA11_0=='`'||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_27 = input.LA(1);

                        s = -1;
                        if ( ((LA11_27>='\u0000' && LA11_27<='\uFFFF')) ) {s = 59;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_26 = input.LA(1);

                        s = -1;
                        if ( ((LA11_26>='\u0000' && LA11_26<='\uFFFF')) ) {s = 59;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}