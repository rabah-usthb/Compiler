// Generated from Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MAIN=7, VAR=8, BEGIN=9, 
		END=10, IF=11, ELSE=12, THEN=13, WHILE=14, DO=15, FOR=16, FROM=17, TO=18, 
		STEP=19, AND=20, OR=21, LET=22, DEFINE=23, CONST=24, IDF=25, INT=26, FLOAT=27, 
		STRING=28, Separators=29, COMMENT=30, WS=31, ERROR_TOKEN=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "LETTER", "DIGIT", "ALPHANUMERICAL", 
			"INLINECOMMENT", "MULTILINECOMMENT", "ARITHMETICOPERATOR", "COMPARAISONOPERATOR", 
			"MAIN", "VAR", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DO", "FOR", 
			"FROM", "TO", "STEP", "AND", "OR", "LET", "DEFINE", "CONST", "IDF", "INT", 
			"FLOAT", "STRING", "Separators", "COMMENT", "WS", "ERROR_TOKEN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'MainPrgm'", "'Var'", 
			"'BeginPg'", "'EndPg'", "'if'", "'else'", "'then'", "'while'", "'do'", 
			"'for'", "'from'", "'to'", "'step'", "'AND'", "'OR'", "'let'", "'@Define'", 
			"'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "MAIN", "VAR", "BEGIN", "END", 
			"IF", "ELSE", "THEN", "WHILE", "DO", "FOR", "FROM", "TO", "STEP", "AND", 
			"OR", "LET", "DEFINE", "CONST", "IDF", "INT", "FLOAT", "STRING", "Separators", 
			"COMMENT", "WS", "ERROR_TOKEN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	 public void printToken(String token , String type, int line , int column) {
	    //column = column - token.length() + 1;
	    System.out.println("Matched "+type+": "+token+" at line " + line + ", column " + column);
	 }

	  public void validateIntToken(String token , int min ,int max, int line , int column){
	    //int column_1 = column - token.length() + 1;
	    int value = Integer.parseInt(token);
	  if(value<min || value >max){
	 System.err.println("Error: Int Constant "+ token + " exceeds maximum value range of [" +min+"," +max+"] At line "+ line+" Column "+column);
	            System.exit(1);
	  }
	  else {
	    printToken(token,"Int Constant",line,column);
	  }
	 }

	 public void validateIDFToken(String token , int maxLength , int line , int column){
	    column = column - token.length() + 1;
	  if(token.length()>14){
	 System.err.println("Error: Identifier "+ token + " exceeds maximum length of " + maxLength + " At line "+ line+" Column "+column);
	            System.exit(1);
	  }
	  else {
	    printToken(token,"Identifier",line,column);
	  }
	 }


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13:
			MAIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			BEGIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			THEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			DO_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			FROM_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			TO_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			STEP_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			LET_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			DEFINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			IDF_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			FLOAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			Separators_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			ERROR_TOKEN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void MAIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void THEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void DO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void FROM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void TO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void STEP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void LET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void DEFINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void IDF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			validateIDFToken(getText(), 14,getLine(), getCharPositionInLine());
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			validateIntToken(getText(), -32768,32767,getLine(), getCharPositionInLine());
			break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			printToken(getText(),"Float Constant",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			printToken(getText(),"String Constant",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void Separators_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			printToken(getText(),"Comment",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void ERROR_TOKEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			System.err.println("Error: Unknown Token "+ getText() + " At line "+ getLine()+" Column "+getCharPositionInLine());System.exit(1);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u016c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\nd\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008d\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\6!\u010f\n!\r!\16!\u0110"+
		"\3!\6!\u0114\n!\r!\16!\u0115\3!\3!\6!\u011a\n!\r!\16!\u011b\7!\u011e\n"+
		"!\f!\16!\u0121\13!\7!\u0123\n!\f!\16!\u0126\13!\3!\3!\3\"\6\"\u012b\n"+
		"\"\r\"\16\"\u012c\3\"\3\"\3#\6#\u0132\n#\r#\16#\u0133\3#\3#\6#\u0138\n"+
		"#\r#\16#\u0139\3#\3#\6#\u013e\n#\r#\16#\u013f\3#\6#\u0143\n#\r#\16#\u0144"+
		"\3#\3#\3#\5#\u014a\n#\3$\3$\7$\u014e\n$\f$\16$\u0151\13$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\5%\u015b\n%\3&\3&\3&\3&\5&\u0161\n&\3\'\6\'\u0164\n\'\r\'\16"+
		"\'\u0165\3\'\3\'\3(\3(\3(\3z\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\t\37\n!\13#\f%\r\'\16)\17+\20-\21/\22\61\23"+
		"\63\24\65\25\67\269\27;\30=\31?\32A\33C\34E\35G\36I\37K M!O\"\3\2\n\4"+
		"\2C\\c|\3\2\62;\3\2\f\f\5\2,-//\61\61\4\2>>@@\4\2\f\f$$\n\2*+..<=??]]"+
		"__}}\177\177\5\2\13\f\17\17\"\"\2\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2"+
		"\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3"+
		"\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2"+
		"\2\2\21_\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27s\3\2\2\2\31\u0081\3\2\2\2"+
		"\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0099\3\2\2\2!\u009f\3\2\2\2#\u00a9"+
		"\3\2\2\2%\u00b1\3\2\2\2\'\u00b6\3\2\2\2)\u00bd\3\2\2\2+\u00c4\3\2\2\2"+
		"-\u00cc\3\2\2\2/\u00d1\3\2\2\2\61\u00d7\3\2\2\2\63\u00de\3\2\2\2\65\u00e3"+
		"\3\2\2\2\67\u00ea\3\2\2\29\u00f0\3\2\2\2;\u00f5\3\2\2\2=\u00fb\3\2\2\2"+
		"?\u0105\3\2\2\2A\u010e\3\2\2\2C\u012a\3\2\2\2E\u0149\3\2\2\2G\u014b\3"+
		"\2\2\2I\u015a\3\2\2\2K\u0160\3\2\2\2M\u0163\3\2\2\2O\u0169\3\2\2\2QR\7"+
		",\2\2R\4\3\2\2\2ST\7\61\2\2T\6\3\2\2\2UV\7-\2\2V\b\3\2\2\2WX\7/\2\2X\n"+
		"\3\2\2\2YZ\7*\2\2Z\f\3\2\2\2[\\\7+\2\2\\\16\3\2\2\2]^\t\2\2\2^\20\3\2"+
		"\2\2_`\t\3\2\2`\22\3\2\2\2ad\5\17\b\2bd\5\21\t\2ca\3\2\2\2cb\3\2\2\2d"+
		"\24\3\2\2\2ef\7>\2\2fg\7#\2\2gh\7/\2\2hl\3\2\2\2ik\n\4\2\2ji\3\2\2\2k"+
		"n\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7/\2\2pq\7#\2\2qr"+
		"\7@\2\2r\26\3\2\2\2st\7}\2\2tu\7/\2\2uv\7/\2\2vz\3\2\2\2wy\13\2\2\2xw"+
		"\3\2\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7/\2\2~\177"+
		"\7/\2\2\177\u0080\7\177\2\2\u0080\30\3\2\2\2\u0081\u0082\t\5\2\2\u0082"+
		"\32\3\2\2\2\u0083\u008d\t\6\2\2\u0084\u0085\7@\2\2\u0085\u008d\7?\2\2"+
		"\u0086\u0087\7>\2\2\u0087\u008d\7?\2\2\u0088\u0089\7?\2\2\u0089\u008d"+
		"\7?\2\2\u008a\u008b\7#\2\2\u008b\u008d\7?\2\2\u008c\u0083\3\2\2\2\u008c"+
		"\u0084\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\34\3\2\2\2\u008e\u008f\7O\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7R\2\2\u0093\u0094\7t\2\2\u0094"+
		"\u0095\7i\2\2\u0095\u0096\7o\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\17"+
		"\2\2\u0098\36\3\2\2\2\u0099\u009a\7X\2\2\u009a\u009b\7c\2\2\u009b\u009c"+
		"\7t\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\20\3\2\u009e \3\2\2\2\u009f"+
		"\u00a0\7D\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7k\2\2"+
		"\u00a3\u00a4\7p\2\2\u00a4\u00a5\7R\2\2\u00a5\u00a6\7i\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\b\21\4\2\u00a8\"\3\2\2\2\u00a9\u00aa\7G\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7R\2\2\u00ad\u00ae\7i\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\b\22\5\2\u00b0$\3\2\2\2\u00b1\u00b2\7"+
		"k\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\23\6\2\u00b5"+
		"&\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\24\7\2\u00bc(\3\2\2\2"+
		"\u00bd\u00be\7v\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7p\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\25\b\2\u00c3*\3\2\2\2\u00c4"+
		"\u00c5\7y\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7n\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\26\t\2\u00cb,\3"+
		"\2\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\b\27\n\2\u00d0.\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\30\13\2\u00d6\60\3\2\2"+
		"\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7q\2\2\u00da\u00db"+
		"\7o\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\31\f\2\u00dd\62\3\2\2\2\u00de"+
		"\u00df\7v\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\32"+
		"\r\2\u00e2\64\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6"+
		"\7g\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\33\16\2\u00e9"+
		"\66\3\2\2\2\u00ea\u00eb\7C\2\2\u00eb\u00ec\7P\2\2\u00ec\u00ed\7F\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\b\34\17\2\u00ef8\3\2\2\2\u00f0\u00f1\7Q\2\2"+
		"\u00f1\u00f2\7T\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\35\20\2\u00f4:\3"+
		"\2\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\b\36\21\2\u00fa<\3\2\2\2\u00fb\u00fc\7B\2\2"+
		"\u00fc\u00fd\7F\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100"+
		"\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7g\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\b\37\22\2\u0104>\3\2\2\2\u0105\u0106\7e\2\2\u0106\u0107\7q\2\2"+
		"\u0107\u0108\7p\2\2\u0108\u0109\7u\2\2\u0109\u010a\7v\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010c\b \23\2\u010c@\3\2\2\2\u010d\u010f\5\17\b\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0124\3\2\2\2\u0112\u0114\5\23\n\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011f\3\2"+
		"\2\2\u0117\u0119\7a\2\2\u0118\u011a\5\23\n\2\u0119\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u0117\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0113\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\b!\24\2\u0128B\3\2\2\2"+
		"\u0129\u012b\5\21\t\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\"\25\2"+
		"\u012fD\3\2\2\2\u0130\u0132\5\21\t\2\u0131\u0130\3\2\2\2\u0132\u0133\3"+
		"\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0137\7\60\2\2\u0136\u0138\5\21\t\2\u0137\u0136\3\2\2\2\u0138\u0139\3"+
		"\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u014a\3\2\2\2\u013b"+
		"\u013d\7\60\2\2\u013c\u013e\5\21\t\2\u013d\u013c\3\2\2\2\u013e\u013f\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u014a\3\2\2\2\u0141"+
		"\u0143\5\21\t\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\60\2\2\u0147"+
		"\u0148\b#\26\2\u0148\u014a\3\2\2\2\u0149\u0131\3\2\2\2\u0149\u013b\3\2"+
		"\2\2\u0149\u0142\3\2\2\2\u014aF\3\2\2\2\u014b\u014f\7$\2\2\u014c\u014e"+
		"\n\7\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7$"+
		"\2\2\u0153\u0154\b$\27\2\u0154H\3\2\2\2\u0155\u015b\t\b\2\2\u0156\u015b"+
		"\5\31\r\2\u0157\u015b\5\33\16\2\u0158\u0159\7#\2\2\u0159\u015b\b%\30\2"+
		"\u015a\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015bJ\3\2\2\2\u015c\u0161\5\27\f\2\u015d\u015e\5\25\13\2\u015e"+
		"\u015f\b&\31\2\u015f\u0161\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2"+
		"\2\2\u0161L\3\2\2\2\u0162\u0164\t\t\2\2\u0163\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\b\'\32\2\u0168N\3\2\2\2\u0169\u016a\13\2\2\2\u016a\u016b\b(\33"+
		"\2\u016bP\3\2\2\2\26\2clz\u008c\u0110\u0115\u011b\u011f\u0124\u012c\u0133"+
		"\u0139\u013f\u0144\u0149\u014f\u015a\u0160\u0165\34\3\17\2\3\20\3\3\21"+
		"\4\3\22\5\3\23\6\3\24\7\3\25\b\3\26\t\3\27\n\3\30\13\3\31\f\3\32\r\3\33"+
		"\16\3\34\17\3\35\20\3\36\21\3\37\22\3 \23\3!\24\3\"\25\3#\26\3$\27\3%"+
		"\30\3&\31\b\2\2\3(\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}