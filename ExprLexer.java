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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TYPE=9, 
		MAIN=10, VAR=11, BEGIN=12, END=13, IF=14, ELSE=15, THEN=16, WHILE=17, 
		DO=18, FOR=19, FROM=20, TO=21, STEP=22, AND=23, OR=24, LET=25, DEFINE=26, 
		CONST=27, IDF=28, INT=29, FLOAT=30, STRING=31, Separators=32, COMMENT=33, 
		WS=34, ERROR_TOKEN=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "LETTER", 
			"DIGIT", "ALPHANUMERICAL", "INLINECOMMENT", "MULTILINECOMMENT", "ARITHMETICOPERATOR", 
			"COMPARAISONOPERATOR", "TYPE", "MAIN", "VAR", "BEGIN", "END", "IF", "ELSE", 
			"THEN", "WHILE", "DO", "FOR", "FROM", "TO", "STEP", "AND", "OR", "LET", 
			"DEFINE", "CONST", "IDF", "INT", "FLOAT", "STRING", "Separators", "COMMENT", 
			"WS", "ERROR_TOKEN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'='", "'['", "']'", "'{'", "'}'", null, "'MainPrgm'", 
			"'Var'", "'BeginPg'", "'EndPg'", "'if'", "'else'", "'then'", "'while'", 
			"'do'", "'for'", "'from'", "'to'", "'step'", "'AND'", "'OR'", "'let'", 
			"'@Define'", "'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TYPE", "MAIN", 
			"VAR", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DO", "FOR", "FROM", 
			"TO", "STEP", "AND", "OR", "LET", "DEFINE", "CONST", "IDF", "INT", "FLOAT", 
			"STRING", "Separators", "COMMENT", "WS", "ERROR_TOKEN"
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
		case 15:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			MAIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			BEGIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			THEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			DO_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			FROM_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			TO_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			STEP_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			LET_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			DEFINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			IDF_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			FLOAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			Separators_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			ERROR_TOKEN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void MAIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void THEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void DO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void FROM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void TO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void STEP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void LET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void DEFINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			printToken(getText(),"Keyword",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void IDF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			validateIDFToken(getText(), 14,getLine(), getCharPositionInLine());
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			validateIntToken(getText(), -32768,32767,getLine(), getCharPositionInLine());
			break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			printToken(getText(),"Float Constant",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			printToken(getText(),"String Constant",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void Separators_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			printToken(getText(),"Comment",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void ERROR_TOKEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			System.err.println("Error: Unknown Token "+ getText() + " At line "+ getLine()+" Column "+getCharPositionInLine());System.exit(1);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0182\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\5\fn\n\f\3\r\3\r\3\r\3\r\3\r\7\ru\n\r\f\r\16\rx\13"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u0083\n\16\f\16\16\16"+
		"\u0086\13\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u0097\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00a3\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\6$\u0125"+
		"\n$\r$\16$\u0126\3$\6$\u012a\n$\r$\16$\u012b\3$\3$\6$\u0130\n$\r$\16$"+
		"\u0131\7$\u0134\n$\f$\16$\u0137\13$\7$\u0139\n$\f$\16$\u013c\13$\3$\3"+
		"$\3%\6%\u0141\n%\r%\16%\u0142\3%\3%\3&\6&\u0148\n&\r&\16&\u0149\3&\3&"+
		"\6&\u014e\n&\r&\16&\u014f\3&\3&\6&\u0154\n&\r&\16&\u0155\3&\6&\u0159\n"+
		"&\r&\16&\u015a\3&\3&\3&\5&\u0160\n&\3\'\3\'\7\'\u0164\n\'\f\'\16\'\u0167"+
		"\13\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0171\n(\3)\3)\3)\3)\5)\u0177\n)\3"+
		"*\6*\u017a\n*\r*\16*\u017b\3*\3*\3+\3+\3+\3\u0084\2,\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\13#\f%\r\'\16)\17"+
		"+\20-\21/\22\61\23\63\24\65\25\67\269\27;\30=\31?\32A\33C\34E\35G\36I"+
		"\37K M!O\"Q#S$U%\3\2\n\4\2C\\c|\3\2\62;\3\2\f\f\5\2,-//\61\61\4\2>>@@"+
		"\4\2\f\f$$\n\2*+..<=??]]__}}\177\177\5\2\13\f\17\17\"\"\2\u0194\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2"+
		"\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2\21e\3\2"+
		"\2\2\23g\3\2\2\2\25i\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33}\3\2\2\2\35\u008b"+
		"\3\2\2\2\37\u0096\3\2\2\2!\u00a2\3\2\2\2#\u00a4\3\2\2\2%\u00af\3\2\2\2"+
		"\'\u00b5\3\2\2\2)\u00bf\3\2\2\2+\u00c7\3\2\2\2-\u00cc\3\2\2\2/\u00d3\3"+
		"\2\2\2\61\u00da\3\2\2\2\63\u00e2\3\2\2\2\65\u00e7\3\2\2\2\67\u00ed\3\2"+
		"\2\29\u00f4\3\2\2\2;\u00f9\3\2\2\2=\u0100\3\2\2\2?\u0106\3\2\2\2A\u010b"+
		"\3\2\2\2C\u0111\3\2\2\2E\u011b\3\2\2\2G\u0124\3\2\2\2I\u0140\3\2\2\2K"+
		"\u015f\3\2\2\2M\u0161\3\2\2\2O\u0170\3\2\2\2Q\u0176\3\2\2\2S\u0179\3\2"+
		"\2\2U\u017f\3\2\2\2WX\7=\2\2X\4\3\2\2\2YZ\7.\2\2Z\6\3\2\2\2[\\\7<\2\2"+
		"\\\b\3\2\2\2]^\7?\2\2^\n\3\2\2\2_`\7]\2\2`\f\3\2\2\2ab\7_\2\2b\16\3\2"+
		"\2\2cd\7}\2\2d\20\3\2\2\2ef\7\177\2\2f\22\3\2\2\2gh\t\2\2\2h\24\3\2\2"+
		"\2ij\t\3\2\2j\26\3\2\2\2kn\5\23\n\2ln\5\25\13\2mk\3\2\2\2ml\3\2\2\2n\30"+
		"\3\2\2\2op\7>\2\2pq\7#\2\2qr\7/\2\2rv\3\2\2\2su\n\4\2\2ts\3\2\2\2ux\3"+
		"\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7/\2\2z{\7#\2\2{|\7@"+
		"\2\2|\32\3\2\2\2}~\7}\2\2~\177\7/\2\2\177\u0080\7/\2\2\u0080\u0084\3\2"+
		"\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7/\2\2\u0088\u0089\7/\2\2\u0089\u008a\7\177\2\2\u008a"+
		"\34\3\2\2\2\u008b\u008c\t\5\2\2\u008c\36\3\2\2\2\u008d\u0097\t\6\2\2\u008e"+
		"\u008f\7@\2\2\u008f\u0097\7?\2\2\u0090\u0091\7>\2\2\u0091\u0097\7?\2\2"+
		"\u0092\u0093\7?\2\2\u0093\u0097\7?\2\2\u0094\u0095\7#\2\2\u0095\u0097"+
		"\7?\2\2\u0096\u008d\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0090\3\2\2\2\u0096"+
		"\u0092\3\2\2\2\u0096\u0094\3\2\2\2\u0097 \3\2\2\2\u0098\u0099\7K\2\2\u0099"+
		"\u009a\7p\2\2\u009a\u00a3\7v\2\2\u009b\u009c\7H\2\2\u009c\u009d\7n\2\2"+
		"\u009d\u009e\7q\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a3\b\21\2\2\u00a2\u0098\3\2\2\2\u00a2\u009b\3\2\2\2"+
		"\u00a3\"\3\2\2\2\u00a4\u00a5\7O\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7k"+
		"\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7R\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab"+
		"\7i\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\22\3\2\u00ae"+
		"$\3\2\2\2\u00af\u00b0\7X\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7t\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\b\23\4\2\u00b4&\3\2\2\2\u00b5\u00b6\7D\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7\u00b8\7i\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\u00bb\7R\2\2\u00bb\u00bc\7i\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\b\24\5\2\u00be(\3\2\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\u00c2\7f\2\2\u00c2\u00c3\7R\2\2\u00c3\u00c4\7i\2\2\u00c4\u00c5\3\2\2"+
		"\2\u00c5\u00c6\b\25\6\2\u00c6*\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9"+
		"\7h\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\26\7\2\u00cb,\3\2\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\27\b\2\u00d2.\3\2\2\2\u00d3\u00d4\7"+
		"v\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\b\30\t\2\u00d9\60\3\2\2\2\u00da\u00db\7y\2\2\u00db"+
		"\u00dc\7j\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\31\n\2\u00e1\62\3\2\2\2\u00e2\u00e3"+
		"\7f\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\32\13\2\u00e6"+
		"\64\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\b\33\f\2\u00ec\66\3\2\2\2\u00ed\u00ee\7h\2"+
		"\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7o\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\b\34\r\2\u00f38\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5"+
		"\u00f6\7q\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b\35\16\2\u00f8:\3\2\2\2"+
		"\u00f9\u00fa\7u\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd"+
		"\7r\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\36\17\2\u00ff<\3\2\2\2\u0100"+
		"\u0101\7C\2\2\u0101\u0102\7P\2\2\u0102\u0103\7F\2\2\u0103\u0104\3\2\2"+
		"\2\u0104\u0105\b\37\20\2\u0105>\3\2\2\2\u0106\u0107\7Q\2\2\u0107\u0108"+
		"\7T\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b \21\2\u010a@\3\2\2\2\u010b\u010c"+
		"\7n\2\2\u010c\u010d\7g\2\2\u010d\u010e\7v\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\b!\22\2\u0110B\3\2\2\2\u0111\u0112\7B\2\2\u0112\u0113\7F\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0115\7h\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2"+
		"\u0117\u0118\7g\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b\"\23\2\u011aD\3"+
		"\2\2\2\u011b\u011c\7e\2\2\u011c\u011d\7q\2\2\u011d\u011e\7p\2\2\u011e"+
		"\u011f\7u\2\2\u011f\u0120\7v\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b#\24"+
		"\2\u0122F\3\2\2\2\u0123\u0125\5\23\n\2\u0124\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u013a\3\2\2\2\u0128"+
		"\u012a\5\27\f\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u0135\3\2\2\2\u012d\u012f\7a\2\2\u012e"+
		"\u0130\5\27\f\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012d\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u0129\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013e\b$\25\2\u013eH\3\2\2\2\u013f\u0141\5\25\13\2\u0140\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\b%\26\2\u0145J\3\2\2\2\u0146\u0148\5\25\13"+
		"\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\7\60\2\2\u014c\u014e\5\25\13"+
		"\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0160\3\2\2\2\u0151\u0153\7\60\2\2\u0152\u0154\5\25\13"+
		"\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0160\3\2\2\2\u0157\u0159\5\25\13\2\u0158\u0157\3\2\2\2"+
		"\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015d\7\60\2\2\u015d\u015e\b&\27\2\u015e\u0160\3\2\2\2"+
		"\u015f\u0147\3\2\2\2\u015f\u0151\3\2\2\2\u015f\u0158\3\2\2\2\u0160L\3"+
		"\2\2\2\u0161\u0165\7$\2\2\u0162\u0164\n\7\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7$\2\2\u0169\u016a\b\'\30\2\u016a"+
		"N\3\2\2\2\u016b\u0171\t\b\2\2\u016c\u0171\5\35\17\2\u016d\u0171\5\37\20"+
		"\2\u016e\u016f\7#\2\2\u016f\u0171\b(\31\2\u0170\u016b\3\2\2\2\u0170\u016c"+
		"\3\2\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0171P\3\2\2\2\u0172"+
		"\u0177\5\33\16\2\u0173\u0174\5\31\r\2\u0174\u0175\b)\32\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0173\3\2\2\2\u0177R\3\2\2\2\u0178"+
		"\u017a\t\t\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\b*\33\2\u017e"+
		"T\3\2\2\2\u017f\u0180\13\2\2\2\u0180\u0181\b+\34\2\u0181V\3\2\2\2\27\2"+
		"mv\u0084\u0096\u00a2\u0126\u012b\u0131\u0135\u013a\u0142\u0149\u014f\u0155"+
		"\u015a\u015f\u0165\u0170\u0176\u017b\35\3\21\2\3\22\3\3\23\4\3\24\5\3"+
		"\25\6\3\26\7\3\27\b\3\30\t\3\31\n\3\32\13\3\33\f\3\34\r\3\35\16\3\36\17"+
		"\3\37\20\3 \21\3!\22\3\"\23\3#\24\3$\25\3%\26\3&\27\3\'\30\3(\31\3)\32"+
		"\b\2\2\3+\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}