package org.muml.reconfigurationverification.fotctl.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFOTCTLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_NODE_PREDICATE_NAME=4;
    public static final int RULE_EDGE_PREDICATE_NAME=5;
    public static final int RULE_ID=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_CONSTANT_NAME=6;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int RULE_VARIABLE_NAME=7;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalFOTCTLLexer() {;} 
    public InternalFOTCTLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFOTCTLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFOTCTL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:11:7: ( 'Declaration\\n' )
            // InternalFOTCTL.g:11:9: 'Declaration\\n'
            {
            match("Declaration\n"); 


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
            // InternalFOTCTL.g:12:7: ( 'NodeLabelPredicates {' )
            // InternalFOTCTL.g:12:9: 'NodeLabelPredicates {'
            {
            match("NodeLabelPredicates {"); 


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
            // InternalFOTCTL.g:13:7: ( ',' )
            // InternalFOTCTL.g:13:9: ','
            {
            match(','); 

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
            // InternalFOTCTL.g:14:7: ( '}\\n' )
            // InternalFOTCTL.g:14:9: '}\\n'
            {
            match("}\n"); 


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
            // InternalFOTCTL.g:15:7: ( 'EdgeLabelPredicates {' )
            // InternalFOTCTL.g:15:9: 'EdgeLabelPredicates {'
            {
            match("EdgeLabelPredicates {"); 


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
            // InternalFOTCTL.g:16:7: ( 'Constants {' )
            // InternalFOTCTL.g:16:9: 'Constants {'
            {
            match("Constants {"); 


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
            // InternalFOTCTL.g:17:7: ( 'Formulas\\n' )
            // InternalFOTCTL.g:17:9: 'Formulas\\n'
            {
            match("Formulas\n"); 


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
            // InternalFOTCTL.g:18:7: ( ';\\n' )
            // InternalFOTCTL.g:18:9: ';\\n'
            {
            match(";\n"); 


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
            // InternalFOTCTL.g:19:7: ( '(' )
            // InternalFOTCTL.g:19:9: '('
            {
            match('('); 

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
            // InternalFOTCTL.g:20:7: ( ')' )
            // InternalFOTCTL.g:20:9: ')'
            {
            match(')'); 

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
            // InternalFOTCTL.g:21:7: ( ' ' )
            // InternalFOTCTL.g:21:9: ' '
            {
            match(' '); 

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
            // InternalFOTCTL.g:22:7: ( 'NOT ' )
            // InternalFOTCTL.g:22:9: 'NOT '
            {
            match("NOT "); 


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
            // InternalFOTCTL.g:23:7: ( '[' )
            // InternalFOTCTL.g:23:9: '['
            {
            match('['); 

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
            // InternalFOTCTL.g:24:7: ( '] ' )
            // InternalFOTCTL.g:24:9: '] '
            {
            match("] "); 


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
            // InternalFOTCTL.g:25:7: ( 'exists' )
            // InternalFOTCTL.g:25:9: 'exists'
            {
            match("exists"); 


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
            // InternalFOTCTL.g:26:7: ( 'forall' )
            // InternalFOTCTL.g:26:9: 'forall'
            {
            match("forall"); 


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
            // InternalFOTCTL.g:27:7: ( ' & ' )
            // InternalFOTCTL.g:27:9: ' & '
            {
            match(" & "); 


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
            // InternalFOTCTL.g:28:7: ( ' <=> ' )
            // InternalFOTCTL.g:28:9: ' <=> '
            {
            match(" <=> "); 


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
            // InternalFOTCTL.g:29:7: ( ' => ' )
            // InternalFOTCTL.g:29:9: ' => '
            {
            match(" => "); 


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
            // InternalFOTCTL.g:30:7: ( ' | ' )
            // InternalFOTCTL.g:30:9: ' | '
            {
            match(" | "); 


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
            // InternalFOTCTL.g:31:7: ( ' ^ ' )
            // InternalFOTCTL.g:31:9: ' ^ '
            {
            match(" ^ "); 


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
            // InternalFOTCTL.g:32:7: ( ' = ' )
            // InternalFOTCTL.g:32:9: ' = '
            {
            match(" = "); 


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
            // InternalFOTCTL.g:33:7: ( ' > ' )
            // InternalFOTCTL.g:33:9: ' > '
            {
            match(" > "); 


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
            // InternalFOTCTL.g:34:7: ( ' >= ' )
            // InternalFOTCTL.g:34:9: ' >= '
            {
            match(" >= "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:35:7: ( ' < ' )
            // InternalFOTCTL.g:35:9: ' < '
            {
            match(" < "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:36:7: ( ' <= ' )
            // InternalFOTCTL.g:36:9: ' <= '
            {
            match(" <= "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:37:7: ( 'AF' )
            // InternalFOTCTL.g:37:9: 'AF'
            {
            match("AF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:38:7: ( 'AG' )
            // InternalFOTCTL.g:38:9: 'AG'
            {
            match("AG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:39:7: ( 'AU' )
            // InternalFOTCTL.g:39:9: 'AU'
            {
            match("AU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:40:7: ( 'EF' )
            // InternalFOTCTL.g:40:9: 'EF'
            {
            match("EF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:41:7: ( 'EG' )
            // InternalFOTCTL.g:41:9: 'EG'
            {
            match("EG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:42:7: ( 'EU' )
            // InternalFOTCTL.g:42:9: 'EU'
            {
            match("EU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_NODE_PREDICATE_NAME"
    public final void mRULE_NODE_PREDICATE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NODE_PREDICATE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:1670:26: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // InternalFOTCTL.g:1670:28: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            matchRange('A','Z'); 
            // InternalFOTCTL.g:1670:37: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFOTCTL.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NODE_PREDICATE_NAME"

    // $ANTLR start "RULE_EDGE_PREDICATE_NAME"
    public final void mRULE_EDGE_PREDICATE_NAME() throws RecognitionException {
        try {
            int _type = RULE_EDGE_PREDICATE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:1672:26: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // InternalFOTCTL.g:1672:28: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            matchRange('a','z'); 
            // InternalFOTCTL.g:1672:37: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFOTCTL.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_EDGE_PREDICATE_NAME"

    // $ANTLR start "RULE_VARIABLE_NAME"
    public final void mRULE_VARIABLE_NAME() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:1674:20: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFOTCTL.g:1674:22: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // InternalFOTCTL.g:1674:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFOTCTL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE_NAME"

    // $ANTLR start "RULE_CONSTANT_NAME"
    public final void mRULE_CONSTANT_NAME() throws RecognitionException {
        try {
            int _type = RULE_CONSTANT_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:1676:20: ( 'A' .. 'Z' ( 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFOTCTL.g:1676:22: 'A' .. 'Z' ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // InternalFOTCTL.g:1676:31: ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFOTCTL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONSTANT_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFOTCTL.g:1678:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFOTCTL.g:1678:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFOTCTL.g:1678:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFOTCTL.g:1678:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalFOTCTL.g:1678:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFOTCTL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
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
            // InternalFOTCTL.g:1680:10: ( ( '0' .. '9' )+ )
            // InternalFOTCTL.g:1680:12: ( '0' .. '9' )+
            {
            // InternalFOTCTL.g:1680:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFOTCTL.g:1680:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalFOTCTL.g:1682:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFOTCTL.g:1682:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFOTCTL.g:1682:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFOTCTL.g:1682:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFOTCTL.g:1682:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalFOTCTL.g:1682:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFOTCTL.g:1682:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:1682:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFOTCTL.g:1682:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalFOTCTL.g:1682:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFOTCTL.g:1682:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalFOTCTL.g:1684:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFOTCTL.g:1684:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFOTCTL.g:1684:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFOTCTL.g:1684:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalFOTCTL.g:1686:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFOTCTL.g:1686:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFOTCTL.g:1686:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFOTCTL.g:1686:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalFOTCTL.g:1686:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFOTCTL.g:1686:41: ( '\\r' )? '\\n'
                    {
                    // InternalFOTCTL.g:1686:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalFOTCTL.g:1686:41: '\\r'
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
            // InternalFOTCTL.g:1688:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFOTCTL.g:1688:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFOTCTL.g:1688:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFOTCTL.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalFOTCTL.g:1690:16: ( . )
            // InternalFOTCTL.g:1690:18: .
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
        // InternalFOTCTL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_NODE_PREDICATE_NAME | RULE_EDGE_PREDICATE_NAME | RULE_VARIABLE_NAME | RULE_CONSTANT_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=43;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalFOTCTL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalFOTCTL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalFOTCTL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalFOTCTL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalFOTCTL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalFOTCTL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalFOTCTL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalFOTCTL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalFOTCTL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalFOTCTL.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalFOTCTL.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalFOTCTL.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalFOTCTL.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalFOTCTL.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalFOTCTL.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalFOTCTL.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalFOTCTL.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalFOTCTL.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalFOTCTL.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalFOTCTL.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalFOTCTL.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalFOTCTL.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalFOTCTL.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalFOTCTL.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalFOTCTL.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalFOTCTL.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalFOTCTL.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalFOTCTL.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalFOTCTL.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalFOTCTL.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalFOTCTL.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalFOTCTL.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalFOTCTL.g:1:202: RULE_NODE_PREDICATE_NAME
                {
                mRULE_NODE_PREDICATE_NAME(); 

                }
                break;
            case 34 :
                // InternalFOTCTL.g:1:227: RULE_EDGE_PREDICATE_NAME
                {
                mRULE_EDGE_PREDICATE_NAME(); 

                }
                break;
            case 35 :
                // InternalFOTCTL.g:1:252: RULE_VARIABLE_NAME
                {
                mRULE_VARIABLE_NAME(); 

                }
                break;
            case 36 :
                // InternalFOTCTL.g:1:271: RULE_CONSTANT_NAME
                {
                mRULE_CONSTANT_NAME(); 

                }
                break;
            case 37 :
                // InternalFOTCTL.g:1:290: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalFOTCTL.g:1:298: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalFOTCTL.g:1:307: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalFOTCTL.g:1:319: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalFOTCTL.g:1:335: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalFOTCTL.g:1:351: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalFOTCTL.g:1:359: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\2\34\1\uffff\1\32\3\34\1\32\2\uffff\1\63\1\uffff\1\32\2\71\2\34\1\71\1\32\2\uffff\3\32\2\uffff\1\105\1\uffff\2\105\1\34\2\105\2\uffff\1\105\1\111\1\112\1\113\2\105\15\uffff\2\125\1\uffff\1\71\1\125\1\127\1\130\1\131\5\uffff\1\105\1\uffff\3\105\3\uffff\2\105\6\uffff\1\125\1\uffff\1\125\3\uffff\2\105\1\uffff\3\105\2\uffff\2\125\5\105\2\125\5\105\1\167\1\170\5\105\2\uffff\11\105\1\uffff\3\105\1\uffff\3\105\1\uffff\20\105\2\uffff";
    static final String DFA16_eofS =
        "\u009d\uffff";
    static final String DFA16_minS =
        "\1\0\2\60\1\uffff\1\12\3\60\1\12\2\uffff\1\11\1\uffff\1\40\5\60\1\101\2\uffff\2\0\1\52\2\uffff\1\60\1\uffff\5\60\2\uffff\6\60\4\uffff\2\40\2\uffff\1\40\4\uffff\2\60\1\uffff\5\60\5\uffff\1\60\1\uffff\1\60\1\40\1\60\3\uffff\2\60\1\40\5\uffff\1\60\1\uffff\1\60\3\uffff\2\60\1\uffff\3\60\2\uffff\25\60\2\uffff\4\60\1\12\3\60\1\40\1\uffff\3\60\1\uffff\1\12\2\60\1\uffff\16\60\2\40\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\2\172\1\uffff\1\12\3\172\1\12\2\uffff\1\174\1\uffff\1\40\6\172\2\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\5\172\2\uffff\6\172\4\uffff\1\75\1\76\2\uffff\1\75\4\uffff\2\172\1\uffff\5\172\5\uffff\1\172\1\uffff\3\172\3\uffff\2\172\1\76\5\uffff\1\172\1\uffff\1\172\3\uffff\2\172\1\uffff\3\172\2\uffff\25\172\2\uffff\11\172\1\uffff\3\172\1\uffff\3\172\1\uffff\20\172\2\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\3\5\uffff\1\11\1\12\1\uffff\1\15\7\uffff\1\45\1\46\3\uffff\1\52\1\53\1\uffff\1\44\5\uffff\1\3\1\4\6\uffff\1\10\1\11\1\12\1\21\2\uffff\1\24\1\25\1\uffff\1\13\1\52\1\15\1\16\2\uffff\1\43\5\uffff\1\45\1\46\1\47\1\50\1\51\1\uffff\1\41\3\uffff\1\36\1\37\1\40\3\uffff\1\31\1\23\1\26\1\27\1\30\1\uffff\1\42\1\uffff\1\33\1\34\1\35\2\uffff\1\14\3\uffff\1\22\1\32\25\uffff\1\17\1\20\11\uffff\1\7\3\uffff\1\6\3\uffff\1\1\20\uffff\1\2\1\5";
    static final String DFA16_specialS =
        "\1\1\25\uffff\1\0\1\2\u0085\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\13\1\32\1\26\4\32\1\27\1\11\1\12\2\32\1\3\2\32\1\30\12\25\1\32\1\10\5\32\1\20\1\21\1\6\1\1\1\5\1\7\7\21\1\2\14\21\1\14\1\32\1\15\1\23\1\24\1\32\4\22\1\16\1\17\24\22\2\32\1\4\uff82\32",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\4\36\1\33\25\36",
            "\12\37\7\uffff\16\35\1\41\13\35\4\uffff\1\37\1\uffff\16\36\1\40\13\36",
            "",
            "\1\43",
            "\12\37\7\uffff\5\35\1\45\1\46\15\35\1\47\5\35\4\uffff\1\37\1\uffff\3\36\1\44\26\36",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\16\36\1\50\13\36",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\16\36\1\51\13\36",
            "\1\52",
            "",
            "",
            "\2\64\2\uffff\1\64\22\uffff\1\64\5\uffff\1\55\25\uffff\1\56\1\57\1\62\37\uffff\1\61\35\uffff\1\60",
            "",
            "\1\66",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\27\70\1\67\2\70",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\16\70\1\73\13\70",
            "\12\37\7\uffff\5\35\1\74\1\75\15\35\1\76\5\35\4\uffff\1\37\1\uffff\32\36",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\32\36",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\32\70",
            "\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\0\101",
            "\0\101",
            "\1\102\4\uffff\1\103",
            "",
            "",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\2\36\1\104\27\36",
            "",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\32\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\32\36",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\77",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\3\36\1\106\26\36",
            "\12\37\7\uffff\23\35\1\107\6\35\4\uffff\1\37\1\uffff\32\36",
            "",
            "",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\6\36\1\110\23\36",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\32\36",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\32\36",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\32\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\15\36\1\114\14\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\21\36\1\115\10\36",
            "",
            "",
            "",
            "",
            "\1\117\34\uffff\1\116",
            "\1\121\35\uffff\1\120",
            "",
            "",
            "\1\122\34\uffff\1\123",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\10\70\1\124\21\70",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\32\70",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\21\70\1\126\10\70",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\32\36",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\32\36",
            "\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\32\36",
            "",
            "",
            "",
            "",
            "",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\13\36\1\132\16\36",
            "",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\4\36\1\133\25\36",
            "\1\134\17\uffff\12\37\7\uffff\32\35\4\uffff\1\37\1\uffff\32\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\4\36\1\135\25\36",
            "",
            "",
            "",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\22\36\1\136\7\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\14\36\1\137\15\36",
            "\1\141\35\uffff\1\140",
            "",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\22\70\1\142\7\70",
            "",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\1\143\31\70",
            "",
            "",
            "",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\144\31\36",
            "\12\77\7\uffff\13\36\1\145\16\36\4\uffff\1\77\1\uffff\32\36",
            "",
            "\12\77\7\uffff\13\36\1\146\16\36\4\uffff\1\77\1\uffff\32\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\23\36\1\147\6\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\24\36\1\150\5\36",
            "",
            "",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\23\70\1\151\6\70",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\13\70\1\152\16\70",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\21\36\1\153\10\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\154\31\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\155\31\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\156\31\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\13\36\1\157\16\36",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\22\70\1\160\7\70",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\13\70\1\161\16\70",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\162\31\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\36\1\163\30\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\36\1\164\30\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\15\36\1\165\14\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\166\31\36",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\32\70",
            "\12\72\7\uffff\32\70\4\uffff\1\72\1\uffff\32\70",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\23\36\1\171\6\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\4\36\1\172\25\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\4\36\1\173\25\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\23\36\1\174\6\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\22\36\1\175\7\36",
            "",
            "",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\10\36\1\176\21\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\13\36\1\177\16\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\13\36\1\u0080\16\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\22\36\1\u0081\7\36",
            "\1\u0082\45\uffff\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\32\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\16\36\1\u0083\13\36",
            "\12\77\7\uffff\17\36\1\u0084\12\36\4\uffff\1\77\1\uffff\32\36",
            "\12\77\7\uffff\17\36\1\u0085\12\36\4\uffff\1\77\1\uffff\32\36",
            "\1\u0086\17\uffff\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\32\36",
            "",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\15\36\1\u0087\14\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\21\36\1\u0088\10\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\21\36\1\u0089\10\36",
            "",
            "\1\u008a\45\uffff\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\32\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\4\36\1\u008b\25\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\4\36\1\u008c\25\36",
            "",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\3\36\1\u008d\26\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\3\36\1\u008e\26\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\10\36\1\u008f\21\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\10\36\1\u0090\21\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\2\36\1\u0091\27\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\2\36\1\u0092\27\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\u0093\31\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\1\u0094\31\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\23\36\1\u0095\6\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\23\36\1\u0096\6\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\4\36\1\u0097\25\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\4\36\1\u0098\25\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\22\36\1\u0099\7\36",
            "\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\22\36\1\u009a\7\36",
            "\1\u009b\17\uffff\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\32\36",
            "\1\u009c\17\uffff\12\77\7\uffff\32\36\4\uffff\1\77\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    static class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_NODE_PREDICATE_NAME | RULE_EDGE_PREDICATE_NAME | RULE_VARIABLE_NAME | RULE_CONSTANT_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_22 = input.LA(1);

                        s = -1;
                        if ( ((LA16_22>='\u0000' && LA16_22<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='D') ) {s = 1;}

                        else if ( (LA16_0=='N') ) {s = 2;}

                        else if ( (LA16_0==',') ) {s = 3;}

                        else if ( (LA16_0=='}') ) {s = 4;}

                        else if ( (LA16_0=='E') ) {s = 5;}

                        else if ( (LA16_0=='C') ) {s = 6;}

                        else if ( (LA16_0=='F') ) {s = 7;}

                        else if ( (LA16_0==';') ) {s = 8;}

                        else if ( (LA16_0=='(') ) {s = 9;}

                        else if ( (LA16_0==')') ) {s = 10;}

                        else if ( (LA16_0==' ') ) {s = 11;}

                        else if ( (LA16_0=='[') ) {s = 12;}

                        else if ( (LA16_0==']') ) {s = 13;}

                        else if ( (LA16_0=='e') ) {s = 14;}

                        else if ( (LA16_0=='f') ) {s = 15;}

                        else if ( (LA16_0=='A') ) {s = 16;}

                        else if ( (LA16_0=='B'||(LA16_0>='G' && LA16_0<='M')||(LA16_0>='O' && LA16_0<='Z')) ) {s = 17;}

                        else if ( ((LA16_0>='a' && LA16_0<='d')||(LA16_0>='g' && LA16_0<='z')) ) {s = 18;}

                        else if ( (LA16_0=='^') ) {s = 19;}

                        else if ( (LA16_0=='_') ) {s = 20;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 21;}

                        else if ( (LA16_0=='\"') ) {s = 22;}

                        else if ( (LA16_0=='\'') ) {s = 23;}

                        else if ( (LA16_0=='/') ) {s = 24;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r') ) {s = 25;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||(LA16_0>='-' && LA16_0<='.')||LA16_0==':'||(LA16_0>='<' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||(LA16_0>='{' && LA16_0<='|')||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_23 = input.LA(1);

                        s = -1;
                        if ( ((LA16_23>='\u0000' && LA16_23<='\uFFFF')) ) {s = 65;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}