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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INPUT=15, OUTPUT=16, 
		TYPE=17, MAIN=18, VAR=19, BEGIN=20, END=21, IF=22, ELSE=23, ELSIF=24, 
		THEN=25, SWITCH=26, CASE=27, BREAK=28, DEFAULT=29, WHILE=30, DO=31, FOR=32, 
		FROM=33, TO=34, STEP=35, AND=36, OR=37, LET=38, DEFINE=39, CONST=40, IDF=41, 
		INT=42, FLOAT=43, STRING=44, AFFECT=45, NOT=46, COMPARAISONOPERATOR=47, 
		Separators=48, COMMENT=49, WS=50, ERROR_TOKEN=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "LETTER", "DIGIT", "ALPHANUMERICAL", 
			"INLINECOMMENT", "MULTILINECOMMENT", "ARITHMETICOPERATOR", "INPUT", "OUTPUT", 
			"TYPE", "MAIN", "VAR", "BEGIN", "END", "IF", "ELSE", "ELSIF", "THEN", 
			"SWITCH", "CASE", "BREAK", "DEFAULT", "WHILE", "DO", "FOR", "FROM", "TO", 
			"STEP", "AND", "OR", "LET", "DEFINE", "CONST", "IDF", "INT", "FLOAT", 
			"STRING", "AFFECT", "NOT", "COMPARAISONOPERATOR", "Separators", "COMMENT", 
			"WS", "ERROR_TOKEN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'+'", "'-'", "'='", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'*'", "'/'", "'input'", "'output'", null, "'MainPrgm'", 
			"'Var'", "'BeginPg'", "'EndPg'", "'if'", "'else'", "'elsif'", "'then'", 
			"'switch'", "'case'", "'break'", "'default'", "'while'", "'do'", "'for'", 
			"'from'", "'to'", "'step'", "'AND'", "'OR'", "'let'", "'@Define'", "'const'", 
			null, null, null, null, "':='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INPUT", "OUTPUT", "TYPE", "MAIN", "VAR", "BEGIN", 
			"END", "IF", "ELSE", "ELSIF", "THEN", "SWITCH", "CASE", "BREAK", "DEFAULT", 
			"WHILE", "DO", "FOR", "FROM", "TO", "STEP", "AND", "OR", "LET", "DEFINE", 
			"CONST", "IDF", "INT", "FLOAT", "STRING", "AFFECT", "NOT", "COMPARAISONOPERATOR", 
			"Separators", "COMMENT", "WS", "ERROR_TOKEN"
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
		case 22:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			MAIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			BEGIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			THEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			DO_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			FROM_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			TO_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			STEP_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			LET_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			DEFINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			IDF_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			FLOAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			Separators_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01de\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u0098"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u009f\n\23\f\23\16\23\u00a2\13\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00ad\n\24\f\24\16"+
		"\24\u00b0\13\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00cf\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3\60\6\60\u0171\n\60\r\60\16\60\u0172\3\60\6\60\u0176\n\60\r\60\16"+
		"\60\u0177\3\60\3\60\6\60\u017c\n\60\r\60\16\60\u017d\7\60\u0180\n\60\f"+
		"\60\16\60\u0183\13\60\7\60\u0185\n\60\f\60\16\60\u0188\13\60\3\60\3\60"+
		"\3\61\6\61\u018d\n\61\r\61\16\61\u018e\3\61\3\61\3\62\6\62\u0194\n\62"+
		"\r\62\16\62\u0195\3\62\3\62\6\62\u019a\n\62\r\62\16\62\u019b\3\62\3\62"+
		"\6\62\u01a0\n\62\r\62\16\62\u01a1\3\62\6\62\u01a5\n\62\r\62\16\62\u01a6"+
		"\3\62\3\62\3\62\5\62\u01ac\n\62\3\63\3\63\7\63\u01b0\n\63\f\63\16\63\u01b3"+
		"\13\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u01c6\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u01cd"+
		"\n\67\38\38\38\38\58\u01d3\n8\39\69\u01d6\n9\r9\169\u01d7\39\39\3:\3:"+
		"\3:\3\u00ae\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\2!\2#\2%\2\'\2)\2+\21-\22/\23\61\24\63\25\65\26\67\27"+
		"9\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60"+
		"k\61m\62o\63q\64s\65\3\2\n\4\2C\\c|\3\2\62;\3\2\f\f\5\2,-//\61\61\4\2"+
		"\f\f$$\4\2>>@@\n\2*+..<=??]]__}}\177\177\5\2\13\f\17\17\"\"\2\u01f0\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t{"+
		"\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2\23"+
		"\u0085\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2\2\33\u008d"+
		"\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0093\3\2\2\2#\u0097\3\2\2"+
		"\2%\u0099\3\2\2\2\'\u00a7\3\2\2\2)\u00b5\3\2\2\2+\u00b7\3\2\2\2-\u00bd"+
		"\3\2\2\2/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63\u00db\3\2\2\2\65\u00e1\3\2"+
		"\2\2\67\u00eb\3\2\2\29\u00f3\3\2\2\2;\u00f8\3\2\2\2=\u00ff\3\2\2\2?\u0105"+
		"\3\2\2\2A\u010c\3\2\2\2C\u0113\3\2\2\2E\u0118\3\2\2\2G\u011e\3\2\2\2I"+
		"\u0126\3\2\2\2K\u012e\3\2\2\2M\u0133\3\2\2\2O\u0139\3\2\2\2Q\u0140\3\2"+
		"\2\2S\u0145\3\2\2\2U\u014c\3\2\2\2W\u0152\3\2\2\2Y\u0157\3\2\2\2[\u015d"+
		"\3\2\2\2]\u0167\3\2\2\2_\u0170\3\2\2\2a\u018c\3\2\2\2c\u01ab\3\2\2\2e"+
		"\u01ad\3\2\2\2g\u01b7\3\2\2\2i\u01ba\3\2\2\2k\u01c5\3\2\2\2m\u01cc\3\2"+
		"\2\2o\u01d2\3\2\2\2q\u01d5\3\2\2\2s\u01db\3\2\2\2uv\7=\2\2v\4\3\2\2\2"+
		"wx\7.\2\2x\6\3\2\2\2yz\7<\2\2z\b\3\2\2\2{|\7-\2\2|\n\3\2\2\2}~\7/\2\2"+
		"~\f\3\2\2\2\177\u0080\7?\2\2\u0080\16\3\2\2\2\u0081\u0082\7*\2\2\u0082"+
		"\20\3\2\2\2\u0083\u0084\7+\2\2\u0084\22\3\2\2\2\u0085\u0086\7]\2\2\u0086"+
		"\24\3\2\2\2\u0087\u0088\7_\2\2\u0088\26\3\2\2\2\u0089\u008a\7}\2\2\u008a"+
		"\30\3\2\2\2\u008b\u008c\7\177\2\2\u008c\32\3\2\2\2\u008d\u008e\7,\2\2"+
		"\u008e\34\3\2\2\2\u008f\u0090\7\61\2\2\u0090\36\3\2\2\2\u0091\u0092\t"+
		"\2\2\2\u0092 \3\2\2\2\u0093\u0094\t\3\2\2\u0094\"\3\2\2\2\u0095\u0098"+
		"\5\37\20\2\u0096\u0098\5!\21\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2"+
		"\u0098$\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7#\2\2\u009b\u009c\7/\2"+
		"\2\u009c\u00a0\3\2\2\2\u009d\u009f\n\4\2\2\u009e\u009d\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\7@\2"+
		"\2\u00a6&\3\2\2\2\u00a7\u00a8\7}\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa\7"+
		"/\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b4"+
		"\7\177\2\2\u00b4(\3\2\2\2\u00b5\u00b6\t\5\2\2\u00b6*\3\2\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc,\3\2\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7w\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7v\2\2"+
		"\u00c3.\3\2\2\2\u00c4\u00c5\7K\2\2\u00c5\u00c6\7p\2\2\u00c6\u00cf\7v\2"+
		"\2\u00c7\u00c8\7H\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\b\30\2\2\u00ce"+
		"\u00c4\3\2\2\2\u00ce\u00c7\3\2\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7O\2\2"+
		"\u00d1\u00d2\7c\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7R\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7i\2\2\u00d7\u00d8\7o\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\b\31\3\2\u00da\62\3\2\2\2\u00db\u00dc\7X\2"+
		"\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7t\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\b\32\4\2\u00e0\64\3\2\2\2\u00e1\u00e2\7D\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"\u00e4\7i\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7R\2\2"+
		"\u00e7\u00e8\7i\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b\33\5\2\u00ea\66"+
		"\3\2\2\2\u00eb\u00ec\7G\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7f\2\2\u00ee"+
		"\u00ef\7R\2\2\u00ef\u00f0\7i\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b\34"+
		"\6\2\u00f28\3\2\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f7\b\35\7\2\u00f7:\3\2\2\2\u00f8\u00f9\7g\2\2\u00f9"+
		"\u00fa\7n\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\3\2\2"+
		"\2\u00fd\u00fe\b\36\b\2\u00fe<\3\2\2\2\u00ff\u0100\7g\2\2\u0100\u0101"+
		"\7n\2\2\u0101\u0102\7u\2\2\u0102\u0103\7k\2\2\u0103\u0104\7h\2\2\u0104"+
		">\3\2\2\2\u0105\u0106\7v\2\2\u0106\u0107\7j\2\2\u0107\u0108\7g\2\2\u0108"+
		"\u0109\7p\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b \t\2\u010b@\3\2\2\2\u010c"+
		"\u010d\7u\2\2\u010d\u010e\7y\2\2\u010e\u010f\7k\2\2\u010f\u0110\7v\2\2"+
		"\u0110\u0111\7e\2\2\u0111\u0112\7j\2\2\u0112B\3\2\2\2\u0113\u0114\7e\2"+
		"\2\u0114\u0115\7c\2\2\u0115\u0116\7u\2\2\u0116\u0117\7g\2\2\u0117D\3\2"+
		"\2\2\u0118\u0119\7d\2\2\u0119\u011a\7t\2\2\u011a\u011b\7g\2\2\u011b\u011c"+
		"\7c\2\2\u011c\u011d\7m\2\2\u011dF\3\2\2\2\u011e\u011f\7f\2\2\u011f\u0120"+
		"\7g\2\2\u0120\u0121\7h\2\2\u0121\u0122\7c\2\2\u0122\u0123\7w\2\2\u0123"+
		"\u0124\7n\2\2\u0124\u0125\7v\2\2\u0125H\3\2\2\2\u0126\u0127\7y\2\2\u0127"+
		"\u0128\7j\2\2\u0128\u0129\7k\2\2\u0129\u012a\7n\2\2\u012a\u012b\7g\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\b%\n\2\u012dJ\3\2\2\2\u012e\u012f\7f"+
		"\2\2\u012f\u0130\7q\2\2\u0130\u0131\3\2\2\2\u0131\u0132\b&\13\2\u0132"+
		"L\3\2\2\2\u0133\u0134\7h\2\2\u0134\u0135\7q\2\2\u0135\u0136\7t\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\b\'\f\2\u0138N\3\2\2\2\u0139\u013a\7h\2\2\u013a"+
		"\u013b\7t\2\2\u013b\u013c\7q\2\2\u013c\u013d\7o\2\2\u013d\u013e\3\2\2"+
		"\2\u013e\u013f\b(\r\2\u013fP\3\2\2\2\u0140\u0141\7v\2\2\u0141\u0142\7"+
		"q\2\2\u0142\u0143\3\2\2\2\u0143\u0144\b)\16\2\u0144R\3\2\2\2\u0145\u0146"+
		"\7u\2\2\u0146\u0147\7v\2\2\u0147\u0148\7g\2\2\u0148\u0149\7r\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\b*\17\2\u014bT\3\2\2\2\u014c\u014d\7C\2\2\u014d"+
		"\u014e\7P\2\2\u014e\u014f\7F\2\2\u014f\u0150\3\2\2\2\u0150\u0151\b+\20"+
		"\2\u0151V\3\2\2\2\u0152\u0153\7Q\2\2\u0153\u0154\7T\2\2\u0154\u0155\3"+
		"\2\2\2\u0155\u0156\b,\21\2\u0156X\3\2\2\2\u0157\u0158\7n\2\2\u0158\u0159"+
		"\7g\2\2\u0159\u015a\7v\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b-\22\2\u015c"+
		"Z\3\2\2\2\u015d\u015e\7B\2\2\u015e\u015f\7F\2\2\u015f\u0160\7g\2\2\u0160"+
		"\u0161\7h\2\2\u0161\u0162\7k\2\2\u0162\u0163\7p\2\2\u0163\u0164\7g\2\2"+
		"\u0164\u0165\3\2\2\2\u0165\u0166\b.\23\2\u0166\\\3\2\2\2\u0167\u0168\7"+
		"e\2\2\u0168\u0169\7q\2\2\u0169\u016a\7p\2\2\u016a\u016b\7u\2\2\u016b\u016c"+
		"\7v\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b/\24\2\u016e^\3\2\2\2\u016f\u0171"+
		"\5\37\20\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0173\u0186\3\2\2\2\u0174\u0176\5#\22\2\u0175\u0174"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0181\3\2\2\2\u0179\u017b\7a\2\2\u017a\u017c\5#\22\2\u017b\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u0179\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0184"+
		"\u0175\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\b\60\25\2\u018a"+
		"`\3\2\2\2\u018b\u018d\5!\21\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191"+
		"\b\61\26\2\u0191b\3\2\2\2\u0192\u0194\5!\21\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0199\7\60\2\2\u0198\u019a\5!\21\2\u0199\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01ac\3\2"+
		"\2\2\u019d\u019f\7\60\2\2\u019e\u01a0\5!\21\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01ac\3\2"+
		"\2\2\u01a3\u01a5\5!\21\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7\60"+
		"\2\2\u01a9\u01aa\b\62\27\2\u01aa\u01ac\3\2\2\2\u01ab\u0193\3\2\2\2\u01ab"+
		"\u019d\3\2\2\2\u01ab\u01a4\3\2\2\2\u01acd\3\2\2\2\u01ad\u01b1\7$\2\2\u01ae"+
		"\u01b0\n\6\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b5\7$\2\2\u01b5\u01b6\b\63\30\2\u01b6f\3\2\2\2\u01b7\u01b8\7<\2\2"+
		"\u01b8\u01b9\7?\2\2\u01b9h\3\2\2\2\u01ba\u01bb\7#\2\2\u01bbj\3\2\2\2\u01bc"+
		"\u01c6\t\7\2\2\u01bd\u01be\7@\2\2\u01be\u01c6\7?\2\2\u01bf\u01c0\7>\2"+
		"\2\u01c0\u01c6\7?\2\2\u01c1\u01c2\7?\2\2\u01c2\u01c6\7?\2\2\u01c3\u01c4"+
		"\7#\2\2\u01c4\u01c6\7?\2\2\u01c5\u01bc\3\2\2\2\u01c5\u01bd\3\2\2\2\u01c5"+
		"\u01bf\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6l\3\2\2\2"+
		"\u01c7\u01cd\t\b\2\2\u01c8\u01cd\5)\25\2\u01c9\u01ca\5k\66\2\u01ca\u01cb"+
		"\b\67\31\2\u01cb\u01cd\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cc\u01c8\3\2\2\2"+
		"\u01cc\u01c9\3\2\2\2\u01cdn\3\2\2\2\u01ce\u01d3\5\'\24\2\u01cf\u01d0\5"+
		"%\23\2\u01d0\u01d1\b8\32\2\u01d1\u01d3\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2"+
		"\u01cf\3\2\2\2\u01d3p\3\2\2\2\u01d4\u01d6\t\t\2\2\u01d5\u01d4\3\2\2\2"+
		"\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\b9\33\2\u01dar\3\2\2\2\u01db\u01dc\13\2\2\2\u01dc"+
		"\u01dd\b:\34\2\u01ddt\3\2\2\2\27\2\u0097\u00a0\u00ae\u00ce\u0172\u0177"+
		"\u017d\u0181\u0186\u018e\u0195\u019b\u01a1\u01a6\u01ab\u01b1\u01c5\u01cc"+
		"\u01d2\u01d7\35\3\30\2\3\31\3\3\32\4\3\33\5\3\34\6\3\35\7\3\36\b\3 \t"+
		"\3%\n\3&\13\3\'\f\3(\r\3)\16\3*\17\3+\20\3,\21\3-\22\3.\23\3/\24\3\60"+
		"\25\3\61\26\3\62\27\3\63\30\3\67\31\38\32\b\2\2\3:\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}