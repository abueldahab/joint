// $ANTLR 3.3 Nov 30, 2010 12:50:56 Pass.g 2012-04-05 20:58:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PassLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int DEDENT=4;
    public static final int INDENT=5;
    public static final int LT=6;
    public static final int ID=7;
    public static final int CMP=8;
    public static final int BOP=9;
    public static final int NUMBER=10;
    public static final int STRING=11;
    public static final int ARITH_ASSIGN=12;
    public static final int EXPONENT=13;
    public static final int COMMENT=14;
    public static final int WS=15;
    public static final int ESC_SEQ=16;
    public static final int HEX_DIGIT=17;
    public static final int UNICODE_ESC=18;
    public static final int OCTAL_ESC=19;

      int indentLevel = 0;
      int DENT_SIZE = 2;

      java.util.Queue<Token> tokens = new java.util.LinkedList<Token>();

      // Note that this will occur at the end of each production if it is not
      // called explicitly.
      @Override
      public void emit(Token t) {
        state.token = t;
        tokens.offer(t);
      }

      @Override
      public Token nextToken() {
        super.nextToken();
        
        if (tokens.isEmpty()) { // Clean up and return EOF
          
          if (indentLevel != 0) {
            emit(new CommonToken(LT, "LT"));
            reindent(0);
          }

          if (tokens.isEmpty()) // Still empty
            return Token.EOF_TOKEN;
        }

        return tokens.poll();
      }
      
      
      // This is rediculous but for some reason the modulo operator isn't working here.
      int mod(int a, int b) {
       while (a >= b)
          a -= b;
        return (a > 0)? a : 0;
      }
      
      void reindent(int spaces) {
        System.out.println("reindent()");
        if (mod(spaces, DENT_SIZE) != 0) {
          System.out.println("Odd indentation (" + spaces + " spaces).");
          // TODO: report an error... sloppy indentation
        }
        
        int indents = spaces / DENT_SIZE;
          if ((indents - indentLevel) > 1) {
            System.out.println("too many indents");
            // TODO: report an error... too many indents
          }

        if (indents > indentLevel)
          for (int i = 0; i < (indents - indentLevel); i++)
            emit(new CommonToken(INDENT, "INDENT"));              
        else if (indents < indentLevel)
          for (int i = 0; i < (indentLevel - indents); i++) {
            emit(new CommonToken(DEDENT, "DEDENT"));
            emit(new CommonToken(LT, "LT"));
          }
        else
          skip();
        
        indentLevel = indents;
      }


    // delegates
    // delegators

    public PassLexer() {;} 
    public PassLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PassLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Pass.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:71:7: ( '(' )
            // Pass.g:71:9: '('
            {
            match('('); 

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
            // Pass.g:72:7: ( ',' )
            // Pass.g:72:9: ','
            {
            match(','); 

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
            // Pass.g:73:7: ( ')' )
            // Pass.g:73:9: ')'
            {
            match(')'); 

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
            // Pass.g:74:7: ( '~' )
            // Pass.g:74:9: '~'
            {
            match('~'); 

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
            // Pass.g:75:7: ( 'break' )
            // Pass.g:75:9: 'break'
            {
            match("break"); 


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
            // Pass.g:76:7: ( 'return' )
            // Pass.g:76:9: 'return'
            {
            match("return"); 


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
            // Pass.g:77:7: ( '+' )
            // Pass.g:77:9: '+'
            {
            match('+'); 

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
            // Pass.g:78:7: ( '-' )
            // Pass.g:78:9: '-'
            {
            match('-'); 

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
            // Pass.g:79:7: ( '*' )
            // Pass.g:79:9: '*'
            {
            match('*'); 

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
            // Pass.g:80:7: ( '/' )
            // Pass.g:80:9: '/'
            {
            match('/'); 

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
            // Pass.g:81:7: ( '%' )
            // Pass.g:81:9: '%'
            {
            match('%'); 

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
            // Pass.g:82:7: ( '[' )
            // Pass.g:82:9: '['
            {
            match('['); 

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
            // Pass.g:83:7: ( ']' )
            // Pass.g:83:9: ']'
            {
            match(']'); 

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
            // Pass.g:84:7: ( '.' )
            // Pass.g:84:9: '.'
            {
            match('.'); 

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
            // Pass.g:85:7: ( 'for' )
            // Pass.g:85:9: 'for'
            {
            match("for"); 


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
            // Pass.g:86:7: ( 'in' )
            // Pass.g:86:9: 'in'
            {
            match("in"); 


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
            // Pass.g:87:7: ( 'while' )
            // Pass.g:87:9: 'while'
            {
            match("while"); 


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
            // Pass.g:88:7: ( 'if' )
            // Pass.g:88:9: 'if'
            {
            match("if"); 


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
            // Pass.g:89:7: ( 'else' )
            // Pass.g:89:9: 'else'
            {
            match("else"); 


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
            // Pass.g:90:7: ( '=' )
            // Pass.g:90:9: '='
            {
            match('='); 

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
            // Pass.g:91:7: ( '{' )
            // Pass.g:91:9: '{'
            {
            match('{'); 

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
            // Pass.g:92:7: ( '}' )
            // Pass.g:92:9: '}'
            {
            match('}'); 

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
            // Pass.g:93:7: ( ':' )
            // Pass.g:93:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "INDENT"
    public final void mINDENT() throws RecognitionException {
        try {
            int _type = INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:199:5: ({...}? => ( ' ' )+ )
            // Pass.g:200:8: {...}? => ( ' ' )+
            {
            if ( !((getCharPositionInLine()==0)) ) {
                throw new FailedPredicateException(input, "INDENT", "getCharPositionInLine()==0");
            }
            // Pass.g:201:9: ( ' ' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Pass.g:201:10: ' '
            	    {
            	    match(' '); 

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


                      reindent(getText().length());
                      skip();
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDENT"

    // $ANTLR start "DEDENT"
    public final void mDEDENT() throws RecognitionException {
        try {
            int _type = DEDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:209:5: ( '\\n' (~ ' ' ) )
            // Pass.g:209:9: '\\n' (~ ' ' )
            {
            match('\n'); 
            getCharStream().mark();
            // Pass.g:211:9: (~ ' ' )
            // Pass.g:211:10: ~ ' '
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

             
                      emit(new CommonToken(LT, "\n"));
                      reindent(0);
                      getCharStream().rewind();
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEDENT"

    // $ANTLR start "ARITH_ASSIGN"
    public final void mARITH_ASSIGN() throws RecognitionException {
        try {
            int _type = ARITH_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:220:5: ( '+=' | '-=' | '*=' | '/=' | '%=' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt2=1;
                }
                break;
            case '-':
                {
                alt2=2;
                }
                break;
            case '*':
                {
                alt2=3;
                }
                break;
            case '/':
                {
                alt2=4;
                }
                break;
            case '%':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // Pass.g:220:9: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 2 :
                    // Pass.g:220:14: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 3 :
                    // Pass.g:220:19: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 4 :
                    // Pass.g:220:24: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 5 :
                    // Pass.g:220:29: '%='
                    {
                    match("%="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARITH_ASSIGN"

    // $ANTLR start "CMP"
    public final void mCMP() throws RecognitionException {
        try {
            int _type = CMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:224:5: ( '<' | '>' | '==' | '>=' | '<=' | '<>' | '!=' )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // Pass.g:224:9: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // Pass.g:224:13: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // Pass.g:224:17: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // Pass.g:224:22: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // Pass.g:224:27: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 6 :
                    // Pass.g:224:32: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 7 :
                    // Pass.g:224:37: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CMP"

    // $ANTLR start "BOP"
    public final void mBOP() throws RecognitionException {
        try {
            int _type = BOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:228:5: ( '||' | '&&' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='|') ) {
                alt4=1;
            }
            else if ( (LA4_0=='&') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // Pass.g:228:9: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // Pass.g:228:14: '&&'
                    {
                    match("&&"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOP"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:231:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Pass.g:231:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Pass.g:231:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Pass.g:
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
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:235:5: ( ( '-' )? ( '0' .. '9' )+ | ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '-' )? ( '0' .. '9' )+ EXPONENT )
            int alt17=4;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // Pass.g:235:9: ( '-' )? ( '0' .. '9' )+
                    {
                    // Pass.g:235:9: ( '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Pass.g:235:9: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // Pass.g:235:13: ( '0' .. '9' )+
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
                    	    // Pass.g:235:14: '0' .. '9'
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
                    break;
                case 2 :
                    // Pass.g:236:9: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // Pass.g:236:9: ( '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Pass.g:236:9: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // Pass.g:236:13: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Pass.g:236:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    match('.'); 
                    // Pass.g:236:29: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Pass.g:236:30: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // Pass.g:236:41: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Pass.g:236:41: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Pass.g:237:9: ( '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // Pass.g:237:9: ( '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Pass.g:237:9: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    match('.'); 
                    // Pass.g:237:17: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Pass.g:237:18: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // Pass.g:237:29: ( EXPONENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Pass.g:237:29: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Pass.g:238:9: ( '-' )? ( '0' .. '9' )+ EXPONENT
                    {
                    // Pass.g:238:9: ( '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Pass.g:238:9: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // Pass.g:238:13: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Pass.g:238:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:242:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='/') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='/') ) {
                    alt21=1;
                }
                else if ( (LA21_1=='*') ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // Pass.g:242:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // Pass.g:242:14: (~ ( '\\n' | '\\r' ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Pass.g:242:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop18;
                        }
                    } while (true);

                    // Pass.g:242:28: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Pass.g:242:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // Pass.g:243:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // Pass.g:243:14: ( options {greedy=false; } : . )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='*') ) {
                            int LA20_1 = input.LA(2);

                            if ( (LA20_1=='/') ) {
                                alt20=2;
                            }
                            else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                                alt20=1;
                            }


                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Pass.g:243:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:247:5: ( ( '\\n' | '\\r\\n' )+ )
            // Pass.g:247:9: ( '\\n' | '\\r\\n' )+
            {
            // Pass.g:247:9: ( '\\n' | '\\r\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\n') ) {
                    alt22=1;
                }
                else if ( (LA22_0=='\r') ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // Pass.g:247:10: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 2 :
            	    // Pass.g:247:15: '\\r\\n'
            	    {
            	    match("\r\n"); 


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:250:5: ( ( ' ' | '\\t' | '\\r' ) )
            // Pass.g:250:9: ( ' ' | '\\t' | '\\r' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:257:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // Pass.g:257:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // Pass.g:257:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\\') ) {
                    alt23=1;
                }
                else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // Pass.g:257:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // Pass.g:257:24: ~ ( '\\\\' | '\"' )
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
            	    break loop23;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // Pass.g:262:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // Pass.g:262:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Pass.g:262:19: ( '+' | '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='+'||LA24_0=='-') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Pass.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // Pass.g:262:30: ( '0' .. '9' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Pass.g:262:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // Pass.g:267:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Pass.g:267:9: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // Pass.g:272:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt26=1;
                    }
                    break;
                case 'u':
                    {
                    alt26=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt26=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // Pass.g:272:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // Pass.g:273:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // Pass.g:274:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // Pass.g:279:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\\') ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>='0' && LA27_1<='3')) ) {
                    int LA27_2 = input.LA(3);

                    if ( ((LA27_2>='0' && LA27_2<='7')) ) {
                        int LA27_4 = input.LA(4);

                        if ( ((LA27_4>='0' && LA27_4<='7')) ) {
                            alt27=1;
                        }
                        else {
                            alt27=2;}
                    }
                    else {
                        alt27=3;}
                }
                else if ( ((LA27_1>='4' && LA27_1<='7')) ) {
                    int LA27_3 = input.LA(3);

                    if ( ((LA27_3>='0' && LA27_3<='7')) ) {
                        alt27=2;
                    }
                    else {
                        alt27=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // Pass.g:279:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // Pass.g:279:14: ( '0' .. '3' )
                    // Pass.g:279:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // Pass.g:279:25: ( '0' .. '7' )
                    // Pass.g:279:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // Pass.g:279:36: ( '0' .. '7' )
                    // Pass.g:279:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // Pass.g:280:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // Pass.g:280:14: ( '0' .. '7' )
                    // Pass.g:280:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // Pass.g:280:25: ( '0' .. '7' )
                    // Pass.g:280:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // Pass.g:281:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // Pass.g:281:14: ( '0' .. '7' )
                    // Pass.g:281:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // Pass.g:286:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // Pass.g:286:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // Pass.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | INDENT | DEDENT | ARITH_ASSIGN | CMP | BOP | ID | NUMBER | COMMENT | LT | WS | STRING )
        int alt28=34;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // Pass.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // Pass.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // Pass.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // Pass.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // Pass.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // Pass.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // Pass.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // Pass.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // Pass.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // Pass.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // Pass.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // Pass.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // Pass.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // Pass.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // Pass.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // Pass.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // Pass.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // Pass.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // Pass.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // Pass.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // Pass.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // Pass.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // Pass.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // Pass.g:1:148: INDENT
                {
                mINDENT(); 

                }
                break;
            case 25 :
                // Pass.g:1:155: DEDENT
                {
                mDEDENT(); 

                }
                break;
            case 26 :
                // Pass.g:1:162: ARITH_ASSIGN
                {
                mARITH_ASSIGN(); 

                }
                break;
            case 27 :
                // Pass.g:1:175: CMP
                {
                mCMP(); 

                }
                break;
            case 28 :
                // Pass.g:1:179: BOP
                {
                mBOP(); 

                }
                break;
            case 29 :
                // Pass.g:1:183: ID
                {
                mID(); 

                }
                break;
            case 30 :
                // Pass.g:1:186: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 31 :
                // Pass.g:1:193: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 32 :
                // Pass.g:1:201: LT
                {
                mLT(); 

                }
                break;
            case 33 :
                // Pass.g:1:204: WS
                {
                mWS(); 

                }
                break;
            case 34 :
                // Pass.g:1:207: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA3_eotS =
        "\1\uffff\1\7\1\11\7\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\41\2\75\7\uffff";
    static final String DFA3_maxS =
        "\2\76\1\75\7\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\3\1\7\1\5\1\6\1\1\1\4\1\2";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\32\uffff\1\1\1\3\1\2",
            "\1\5\1\6",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "224:1: CMP : ( '<' | '>' | '==' | '>=' | '<=' | '<>' | '!=' );";
        }
    }
    static final String DFA17_eotS =
        "\2\uffff\1\4\4\uffff";
    static final String DFA17_eofS =
        "\7\uffff";
    static final String DFA17_minS =
        "\1\55\2\56\4\uffff";
    static final String DFA17_maxS =
        "\2\71\1\145\4\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\1\1\1\2\1\4";
    static final String DFA17_specialS =
        "\7\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\5\1\uffff\12\2\13\uffff\1\6\37\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "234:1: NUMBER : ( ( '-' )? ( '0' .. '9' )+ | ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '-' )? ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA28_eotS =
        "\5\uffff\2\33\1\43\1\44\1\45\1\47\1\50\2\uffff\1\51\4\33\1\57\3"+
        "\uffff\1\60\1\63\4\uffff\1\36\2\uffff\2\33\10\uffff\1\33\1\71\1"+
        "\72\2\33\3\uffff\1\65\1\uffff\1\65\1\uffff\2\33\1\77\2\uffff\4\33"+
        "\1\uffff\1\33\1\105\1\106\1\33\1\110\2\uffff\1\111\2\uffff";
    static final String DFA28_eofS =
        "\112\uffff";
    static final String DFA28_minS =
        "\1\11\4\uffff\1\162\1\145\1\75\1\56\1\75\1\52\1\75\2\uffff\1\60"+
        "\1\157\1\146\1\150\1\154\1\75\3\uffff\1\40\1\0\4\uffff\1\12\2\uffff"+
        "\1\145\1\164\10\uffff\1\162\2\60\1\151\1\163\1\uffff\1\0\1\uffff"+
        "\1\12\1\uffff\1\12\1\uffff\1\141\1\165\1\60\2\uffff\1\154\1\145"+
        "\1\153\1\162\1\uffff\1\145\2\60\1\156\1\60\2\uffff\1\60\2\uffff";
    static final String DFA28_maxS =
        "\1\176\4\uffff\1\162\1\145\5\75\2\uffff\1\71\1\157\1\156\1\150\1"+
        "\154\1\75\3\uffff\1\40\1\uffff\4\uffff\1\12\2\uffff\1\145\1\164"+
        "\10\uffff\1\162\2\172\1\151\1\163\1\uffff\1\0\1\uffff\1\15\1\uffff"+
        "\1\12\1\uffff\1\141\1\165\1\172\2\uffff\1\154\1\145\1\153\1\162"+
        "\1\uffff\1\145\2\172\1\156\1\172\2\uffff\1\172\2\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\7\uffff\1\14\1\15\6\uffff\1\25\1\26\1\27"+
        "\2\uffff\1\33\1\34\1\35\1\36\1\uffff\1\41\1\42\2\uffff\1\32\1\7"+
        "\1\10\1\11\1\37\1\12\1\13\1\16\5\uffff\1\24\1\uffff\1\30\1\uffff"+
        "\1\40\1\uffff\1\31\3\uffff\1\20\1\22\4\uffff\1\17\5\uffff\1\23\1"+
        "\5\1\uffff\1\21\1\6";
    static final String DFA28_specialS =
        "\27\uffff\1\0\1\2\27\uffff\1\1\31\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\36\1\30\2\uffff\1\35\22\uffff\1\27\1\31\1\37\2\uffff\1\13"+
            "\1\32\1\uffff\1\1\1\3\1\11\1\7\1\2\1\10\1\16\1\12\12\34\1\26"+
            "\1\uffff\1\31\1\23\1\31\2\uffff\32\33\1\14\1\uffff\1\15\1\uffff"+
            "\1\33\1\uffff\1\33\1\5\2\33\1\22\1\17\2\33\1\20\10\33\1\6\4"+
            "\33\1\21\3\33\1\24\1\32\1\25\1\4",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\34\1\uffff\12\34\3\uffff\1\42",
            "\1\42",
            "\1\46\4\uffff\1\46\15\uffff\1\42",
            "\1\42",
            "",
            "",
            "\12\34",
            "\1\52",
            "\1\54\7\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\31",
            "",
            "",
            "",
            "\1\61",
            "\12\65\1\62\2\65\1\64\22\65\1\uffff\uffdf\65",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\73",
            "\1\74",
            "",
            "\1\uffff",
            "",
            "\1\63\2\uffff\1\63",
            "",
            "\1\63",
            "",
            "\1\75",
            "\1\76",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\107",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | INDENT | DEDENT | ARITH_ASSIGN | CMP | BOP | ID | NUMBER | COMMENT | LT | WS | STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_23 = input.LA(1);

                         
                        int index28_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_23==' ') && ((getCharPositionInLine()==0))) {s = 49;}

                        else s = 48;

                         
                        input.seek(index28_23);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_48 = input.LA(1);

                         
                        int index28_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((getCharPositionInLine()==0)) ) {s = 49;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index28_48);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_24 = input.LA(1);

                        s = -1;
                        if ( (LA28_24=='\n') ) {s = 50;}

                        else if ( (LA28_24=='\r') ) {s = 52;}

                        else if ( ((LA28_24>='\u0000' && LA28_24<='\t')||(LA28_24>='\u000B' && LA28_24<='\f')||(LA28_24>='\u000E' && LA28_24<='\u001F')||(LA28_24>='!' && LA28_24<='\uFFFF')) ) {s = 53;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}