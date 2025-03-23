package application.antlr;

// Generated from Expr.g4 by ANTLR 4.7.2

  import java.util.HashMap;
  import java.util.Map;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INPUT=9, 
		OUTPUT=10, TYPE=11, MAIN=12, VAR=13, BEGIN=14, END=15, IF=16, ELSE=17, 
		ELSIF=18, THEN=19, SWITCH=20, CASE=21, BREAK=22, DEFAULT=23, WHILE=24, 
		DO=25, FOR=26, FROM=27, TO=28, STEP=29, AND=30, OR=31, LET=32, DEFINE=33, 
		CONST=34, IDF=35, INT=36, FLOAT=37, STRING=38, AFFECT=39, NOT=40, COMPARAISONOPERATOR=41, 
		LBRACE=42, RBRACE=43, PLUS=44, SUB=45, MUL=46, DIV=47, Separators=48, 
		COMMENT=49, WS=50, ERROR_TOKEN=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "LETTER", 
			"DIGIT", "ALPHANUMERICAL", "INLINECOMMENT", "MULTILINECOMMENT", "INPUT", 
			"OUTPUT", "TYPE", "MAIN", "VAR", "BEGIN", "END", "IF", "ELSE", "ELSIF", 
			"THEN", "SWITCH", "CASE", "BREAK", "DEFAULT", "WHILE", "DO", "FOR", "FROM", 
			"TO", "STEP", "AND", "OR", "LET", "DEFINE", "CONST", "IDF", "INT", "FLOAT", 
			"STRING", "AFFECT", "NOT", "COMPARAISONOPERATOR", "LBRACE", "RBRACE", 
			"PLUS", "SUB", "MUL", "DIV", "Separators", "COMMENT", "WS", "ERROR_TOKEN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'='", "'('", "')'", "'['", "']'", "'input'", 
			"'output'", null, "'MainPrgm'", "'Var'", "'BeginPg'", "'EndPg'", "'if'", 
			"'else'", "'elsif'", "'then'", "'switch'", "'case'", "'break'", "'default'", 
			"'while'", "'do'", "'for'", "'from'", "'to'", "'step'", "'AND'", "'OR'", 
			"'let'", "'@Define'", "'const'", null, null, null, null, "':='", "'!'", 
			null, "'{'", "'}'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "INPUT", "OUTPUT", 
			"TYPE", "MAIN", "VAR", "BEGIN", "END", "IF", "ELSE", "ELSIF", "THEN", 
			"SWITCH", "CASE", "BREAK", "DEFAULT", "WHILE", "DO", "FOR", "FROM", "TO", 
			"STEP", "AND", "OR", "LET", "DEFINE", "CONST", "IDF", "INT", "FLOAT", 
			"STRING", "AFFECT", "NOT", "COMPARAISONOPERATOR", "LBRACE", "RBRACE", 
			"PLUS", "SUB", "MUL", "DIV", "Separators", "COMMENT", "WS", "ERROR_TOKEN"
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
	    System.out.println("Matched "+type+": "+token+" at line " + line + ", column " + column);
	 }

	  public void validateIntToken(String token , int min ,int max, int line , int column){
	  
	    int value = Integer.parseInt(token);
	    if(value<min || value >max) {
	    System.err.println("Error: Int Constant "+ token + " exceeds maximum value range of [" +min+"," +max+"] At line "+ line+" Column "+column);
	    //System.exit(1);
	   }
	  else {
	    printToken(token,"Int Constant",line,column);
	  }
	 }

	 public void validateIDFToken(String token , int maxLength , int line , int column){
	    column = column - token.length() + 1;
	    if(token.length()>14){
	      System.err.println("Error: Identifier "+ token + " exceeds maximum length of " + maxLength + " At line "+ line+" Column "+column);
	//      IDF_HashTable.table.updateError(token,"Identifier exceeds maximum length of " + maxLength);
	      //System.exit(1);
	    }
	    else {
	      printToken(token,"Identifier",line,column);
	   //   IDF_HashTable.table.insert(token);
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
		case 23:
			THEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			DO_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			FROM_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			TO_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			STEP_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			LET_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			DEFINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			IDF_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			FLOAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			Separators_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
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
			System.err.println("Error: Unknown Token "+ getText() + " At line "+ getLine()+" Column "+getCharPositionInLine());
			//System.exit(1);

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01e7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\5"+
		"\f\u008a\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u0091\n\r\f\r\16\r\u0094\13\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u009f\n\16\f\16\16\16\u00a2"+
		"\13\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00cd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3)\6)\u016f\n)\r)\16)\u0170\3)\6)\u0174\n)\r)\16)\u0175\3)\3)"+
		"\6)\u017a\n)\r)\16)\u017b\7)\u017e\n)\f)\16)\u0181\13)\7)\u0183\n)\f)"+
		"\16)\u0186\13)\3)\3)\3*\6*\u018b\n*\r*\16*\u018c\3*\3*\3+\6+\u0192\n+"+
		"\r+\16+\u0193\3+\3+\6+\u0198\n+\r+\16+\u0199\3+\3+\6+\u019e\n+\r+\16+"+
		"\u019f\3+\6+\u01a3\n+\r+\16+\u01a4\3+\3+\3+\5+\u01aa\n+\3,\3,\7,\u01ae"+
		"\n,\f,\16,\u01b1\13,\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\5/\u01c4\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\5\66\u01d6\n\66\3\67\3\67\3\67\3\67\5\67\u01dc"+
		"\n\67\38\68\u01df\n8\r8\168\u01e0\38\38\39\39\39\3\u00a0\2:\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\2\35\13\37\f!\r#\16%"+
		"\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C"+
		"\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65\3\2"+
		"\t\4\2C\\c|\3\2\62;\3\2\f\f\4\2\f\f$$\4\2>>@@\b\2*+..<=??]]__\5\2\13\f"+
		"\17\17\"\"\2\u01fc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w"+
		"\3\2\2\2\ty\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\177\3\2\2\2\21\u0081\3\2"+
		"\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2"+
		"\2\33\u0099\3\2\2\2\35\u00a7\3\2\2\2\37\u00ad\3\2\2\2!\u00cc\3\2\2\2#"+
		"\u00ce\3\2\2\2%\u00d9\3\2\2\2\'\u00df\3\2\2\2)\u00e9\3\2\2\2+\u00f1\3"+
		"\2\2\2-\u00f6\3\2\2\2/\u00fd\3\2\2\2\61\u0103\3\2\2\2\63\u010a\3\2\2\2"+
		"\65\u0111\3\2\2\2\67\u0116\3\2\2\29\u011c\3\2\2\2;\u0124\3\2\2\2=\u012c"+
		"\3\2\2\2?\u0131\3\2\2\2A\u0137\3\2\2\2C\u013e\3\2\2\2E\u0143\3\2\2\2G"+
		"\u014a\3\2\2\2I\u0150\3\2\2\2K\u0155\3\2\2\2M\u015b\3\2\2\2O\u0165\3\2"+
		"\2\2Q\u016e\3\2\2\2S\u018a\3\2\2\2U\u01a9\3\2\2\2W\u01ab\3\2\2\2Y\u01b5"+
		"\3\2\2\2[\u01b8\3\2\2\2]\u01c3\3\2\2\2_\u01c5\3\2\2\2a\u01c7\3\2\2\2c"+
		"\u01c9\3\2\2\2e\u01cb\3\2\2\2g\u01cd\3\2\2\2i\u01cf\3\2\2\2k\u01d5\3\2"+
		"\2\2m\u01db\3\2\2\2o\u01de\3\2\2\2q\u01e4\3\2\2\2st\7=\2\2t\4\3\2\2\2"+
		"uv\7.\2\2v\6\3\2\2\2wx\7<\2\2x\b\3\2\2\2yz\7?\2\2z\n\3\2\2\2{|\7*\2\2"+
		"|\f\3\2\2\2}~\7+\2\2~\16\3\2\2\2\177\u0080\7]\2\2\u0080\20\3\2\2\2\u0081"+
		"\u0082\7_\2\2\u0082\22\3\2\2\2\u0083\u0084\t\2\2\2\u0084\24\3\2\2\2\u0085"+
		"\u0086\t\3\2\2\u0086\26\3\2\2\2\u0087\u008a\5\23\n\2\u0088\u008a\5\25"+
		"\13\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\30\3\2\2\2\u008b\u008c"+
		"\7>\2\2\u008c\u008d\7#\2\2\u008d\u008e\7/\2\2\u008e\u0092\3\2\2\2\u008f"+
		"\u0091\n\4\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\7/\2\2\u0096\u0097\7#\2\2\u0097\u0098\7@\2\2\u0098\32\3\2\2\2\u0099"+
		"\u009a\7}\2\2\u009a\u009b\7/\2\2\u009b\u009c\7/\2\2\u009c\u00a0\3\2\2"+
		"\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\7\177\2\2\u00a6"+
		"\34\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7r\2\2\u00aa"+
		"\u00ab\7w\2\2\u00ab\u00ac\7v\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7w\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7w\2\2"+
		"\u00b2\u00b3\7v\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6\7p\2"+
		"\2\u00b6\u00cd\7v\2\2\u00b7\u00b8\7H\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7c\2\2\u00bb\u00cd\7v\2\2\u00bc\u00bd\7D\2\2\u00bd"+
		"\u00be\7q\2\2\u00be\u00bf\7q\2\2\u00bf\u00cd\7n\2\2\u00c0\u00c1\7U\2\2"+
		"\u00c1\u00c2\7v\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7p\2\2\u00c5\u00cd\7i\2\2\u00c6\u00c7\7E\2\2\u00c7\u00c8\7j\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\b\21"+
		"\2\2\u00cc\u00b4\3\2\2\2\u00cc\u00b7\3\2\2\2\u00cc\u00bc\3\2\2\2\u00cc"+
		"\u00c0\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7O\2\2"+
		"\u00cf\u00d0\7c\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3"+
		"\7R\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7i\2\2\u00d5\u00d6\7o\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\b\22\3\2\u00d8$\3\2\2\2\u00d9\u00da\7X\2\2"+
		"\u00da\u00db\7c\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\b\23\4\2\u00de&\3\2\2\2\u00df\u00e0\7D\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7i\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7R\2\2\u00e5"+
		"\u00e6\7i\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\24\5\2\u00e8(\3\2\2\2"+
		"\u00e9\u00ea\7G\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed"+
		"\7R\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\25\6\2\u00f0"+
		"*\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\b\26\7\2\u00f5,\3\2\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7n\2\2\u00f8"+
		"\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b\27"+
		"\b\2\u00fc.\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100"+
		"\7u\2\2\u0100\u0101\7k\2\2\u0101\u0102\7h\2\2\u0102\60\3\2\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7j\2\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\b\31\t\2\u0109\62\3\2\2\2\u010a\u010b\7u\2"+
		"\2\u010b\u010c\7y\2\2\u010c\u010d\7k\2\2\u010d\u010e\7v\2\2\u010e\u010f"+
		"\7e\2\2\u010f\u0110\7j\2\2\u0110\64\3\2\2\2\u0111\u0112\7e\2\2\u0112\u0113"+
		"\7c\2\2\u0113\u0114\7u\2\2\u0114\u0115\7g\2\2\u0115\66\3\2\2\2\u0116\u0117"+
		"\7d\2\2\u0117\u0118\7t\2\2\u0118\u0119\7g\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u011b\7m\2\2\u011b8\3\2\2\2\u011c\u011d\7f\2\2\u011d\u011e\7g\2\2\u011e"+
		"\u011f\7h\2\2\u011f\u0120\7c\2\2\u0120\u0121\7w\2\2\u0121\u0122\7n\2\2"+
		"\u0122\u0123\7v\2\2\u0123:\3\2\2\2\u0124\u0125\7y\2\2\u0125\u0126\7j\2"+
		"\2\u0126\u0127\7k\2\2\u0127\u0128\7n\2\2\u0128\u0129\7g\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012b\b\36\n\2\u012b<\3\2\2\2\u012c\u012d\7f\2\2\u012d"+
		"\u012e\7q\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b\37\13\2\u0130>\3\2\2\2"+
		"\u0131\u0132\7h\2\2\u0132\u0133\7q\2\2\u0133\u0134\7t\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0136\b \f\2\u0136@\3\2\2\2\u0137\u0138\7h\2\2\u0138\u0139"+
		"\7t\2\2\u0139\u013a\7q\2\2\u013a\u013b\7o\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\b!\r\2\u013dB\3\2\2\2\u013e\u013f\7v\2\2\u013f\u0140\7q\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\b\"\16\2\u0142D\3\2\2\2\u0143\u0144\7u\2\2"+
		"\u0144\u0145\7v\2\2\u0145\u0146\7g\2\2\u0146\u0147\7r\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\b#\17\2\u0149F\3\2\2\2\u014a\u014b\7C\2\2\u014b\u014c"+
		"\7P\2\2\u014c\u014d\7F\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b$\20\2\u014f"+
		"H\3\2\2\2\u0150\u0151\7Q\2\2\u0151\u0152\7T\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\b%\21\2\u0154J\3\2\2\2\u0155\u0156\7n\2\2\u0156\u0157\7g\2\2\u0157"+
		"\u0158\7v\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b&\22\2\u015aL\3\2\2\2\u015b"+
		"\u015c\7B\2\2\u015c\u015d\7F\2\2\u015d\u015e\7g\2\2\u015e\u015f\7h\2\2"+
		"\u015f\u0160\7k\2\2\u0160\u0161\7p\2\2\u0161\u0162\7g\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\b\'\23\2\u0164N\3\2\2\2\u0165\u0166\7e\2\2\u0166"+
		"\u0167\7q\2\2\u0167\u0168\7p\2\2\u0168\u0169\7u\2\2\u0169\u016a\7v\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\u016c\b(\24\2\u016cP\3\2\2\2\u016d\u016f\5"+
		"\23\n\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0184\3\2\2\2\u0172\u0174\5\27\f\2\u0173\u0172\3"+
		"\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u017f\3\2\2\2\u0177\u0179\7a\2\2\u0178\u017a\5\27\f\2\u0179\u0178\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u0177\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0173\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\b)\25\2\u0188"+
		"R\3\2\2\2\u0189\u018b\5\25\13\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2"+
		"\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f"+
		"\b*\26\2\u018fT\3\2\2\2\u0190\u0192\5\25\13\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0197\7\60\2\2\u0196\u0198\5\25\13\2\u0197\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01aa\3\2"+
		"\2\2\u019b\u019d\7\60\2\2\u019c\u019e\5\25\13\2\u019d\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01aa\3\2"+
		"\2\2\u01a1\u01a3\5\25\13\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\60"+
		"\2\2\u01a7\u01a8\b+\27\2\u01a8\u01aa\3\2\2\2\u01a9\u0191\3\2\2\2\u01a9"+
		"\u019b\3\2\2\2\u01a9\u01a2\3\2\2\2\u01aaV\3\2\2\2\u01ab\u01af\7$\2\2\u01ac"+
		"\u01ae\n\5\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b3\7$\2\2\u01b3\u01b4\b,\30\2\u01b4X\3\2\2\2\u01b5\u01b6\7<\2\2\u01b6"+
		"\u01b7\7?\2\2\u01b7Z\3\2\2\2\u01b8\u01b9\7#\2\2\u01b9\\\3\2\2\2\u01ba"+
		"\u01c4\t\6\2\2\u01bb\u01bc\7@\2\2\u01bc\u01c4\7?\2\2\u01bd\u01be\7>\2"+
		"\2\u01be\u01c4\7?\2\2\u01bf\u01c0\7?\2\2\u01c0\u01c4\7?\2\2\u01c1\u01c2"+
		"\7#\2\2\u01c2\u01c4\7?\2\2\u01c3\u01ba\3\2\2\2\u01c3\u01bb\3\2\2\2\u01c3"+
		"\u01bd\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4^\3\2\2\2"+
		"\u01c5\u01c6\7}\2\2\u01c6`\3\2\2\2\u01c7\u01c8\7\177\2\2\u01c8b\3\2\2"+
		"\2\u01c9\u01ca\7-\2\2\u01cad\3\2\2\2\u01cb\u01cc\7/\2\2\u01ccf\3\2\2\2"+
		"\u01cd\u01ce\7,\2\2\u01ceh\3\2\2\2\u01cf\u01d0\7\61\2\2\u01d0j\3\2\2\2"+
		"\u01d1\u01d6\t\7\2\2\u01d2\u01d3\5]/\2\u01d3\u01d4\b\66\31\2\u01d4\u01d6"+
		"\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d6l\3\2\2\2\u01d7"+
		"\u01dc\5\33\16\2\u01d8\u01d9\5\31\r\2\u01d9\u01da\b\67\32\2\u01da\u01dc"+
		"\3\2\2\2\u01db\u01d7\3\2\2\2\u01db\u01d8\3\2\2\2\u01dcn\3\2\2\2\u01dd"+
		"\u01df\t\b\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\b8\33\2\u01e3"+
		"p\3\2\2\2\u01e4\u01e5\13\2\2\2\u01e5\u01e6\b9\34\2\u01e6r\3\2\2\2\27\2"+
		"\u0089\u0092\u00a0\u00cc\u0170\u0175\u017b\u017f\u0184\u018c\u0193\u0199"+
		"\u019f\u01a4\u01a9\u01af\u01c3\u01d5\u01db\u01e0\35\3\21\2\3\22\3\3\23"+
		"\4\3\24\5\3\25\6\3\26\7\3\27\b\3\31\t\3\36\n\3\37\13\3 \f\3!\r\3\"\16"+
		"\3#\17\3$\20\3%\21\3&\22\3\'\23\3(\24\3)\25\3*\26\3+\27\3,\30\3\66\31"+
		"\3\67\32\b\2\2\39\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}