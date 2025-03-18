package application;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INPUT=13, OUTPUT=14, TYPE=15, MAIN=16, VAR=17, 
		BEGIN=18, END=19, IF=20, ELSE=21, ELSIF=22, THEN=23, SWITCH=24, CASE=25, 
		BREAK=26, DEFAULT=27, WHILE=28, DO=29, FOR=30, FROM=31, TO=32, STEP=33, 
		AND=34, OR=35, LET=36, DEFINE=37, CONST=38, IDF=39, INT=40, FLOAT=41, 
		STRING=42, AFFECT=43, NOT=44, COMPARAISONOPERATOR=45, LBRACE=46, RBRACE=47, 
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
			"T__9", "T__10", "T__11", "LETTER", "DIGIT", "ALPHANUMERICAL", "INLINECOMMENT", 
			"MULTILINECOMMENT", "ARITHMETICOPERATOR", "INPUT", "OUTPUT", "TYPE", 
			"MAIN", "VAR", "BEGIN", "END", "IF", "ELSE", "ELSIF", "THEN", "SWITCH", 
			"CASE", "BREAK", "DEFAULT", "WHILE", "DO", "FOR", "FROM", "TO", "STEP", 
			"AND", "OR", "LET", "DEFINE", "CONST", "IDF", "INT", "FLOAT", "STRING", 
			"AFFECT", "NOT", "COMPARAISONOPERATOR", "LBRACE", "RBRACE", "Separators", 
			"COMMENT", "WS", "ERROR_TOKEN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'='", "'+'", "'-'", "'('", "')'", "'['", 
			"']'", "'*'", "'/'", "'input'", "'output'", null, "'MainPrgm'", "'Var'", 
			"'BeginPg'", "'EndPg'", "'if'", "'else'", "'elsif'", "'then'", "'switch'", 
			"'case'", "'break'", "'default'", "'while'", "'do'", "'for'", "'from'", 
			"'to'", "'step'", "'AND'", "'OR'", "'let'", "'@Define'", "'const'", null, 
			null, null, null, "':='", "'!'", null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INPUT", "OUTPUT", "TYPE", "MAIN", "VAR", "BEGIN", "END", "IF", 
			"ELSE", "ELSIF", "THEN", "SWITCH", "CASE", "BREAK", "DEFAULT", "WHILE", 
			"DO", "FOR", "FROM", "TO", "STEP", "AND", "OR", "LET", "DEFINE", "CONST", 
			"IDF", "INT", "FLOAT", "STRING", "AFFECT", "NOT", "COMPARAISONOPERATOR", 
			"LBRACE", "RBRACE", "Separators", "COMMENT", "WS", "ERROR_TOKEN"
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
	  //    IDF_HashTable.table.updateError(token,"Identifier exceeds maximum length of " + maxLength);
	      //System.exit(1);
	    }
	    else {
	      printToken(token,"Identifier",line,column);
	      //IDF_HashTable.table.insert(token);
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
		case 20:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			MAIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			BEGIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			THEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			DO_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			FROM_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			TO_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			STEP_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			LET_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			DEFINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			IDF_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			FLOAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
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
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u0094\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u009b\n\21\f\21\16\21\u009e\13\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\7\22\u00a9\n\22\f\22\16\22\u00ac\13\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u00cb\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\6.\u016d\n.\r.\16.\u016e\3.\6.\u0172\n.\r.\16.\u0173"+
		"\3.\3.\6.\u0178\n.\r.\16.\u0179\7.\u017c\n.\f.\16.\u017f\13.\7.\u0181"+
		"\n.\f.\16.\u0184\13.\3.\3.\3/\6/\u0189\n/\r/\16/\u018a\3/\3/\3\60\6\60"+
		"\u0190\n\60\r\60\16\60\u0191\3\60\3\60\6\60\u0196\n\60\r\60\16\60\u0197"+
		"\3\60\3\60\6\60\u019c\n\60\r\60\16\60\u019d\3\60\6\60\u01a1\n\60\r\60"+
		"\16\60\u01a2\3\60\3\60\3\60\5\60\u01a8\n\60\3\61\3\61\7\61\u01ac\n\61"+
		"\f\61\16\61\u01af\13\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01c2\n\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\5\67\u01cd\n\67\38\38\38\38\58\u01d3\n"+
		"8\39\69\u01d6\n9\r9\169\u01d7\39\39\3:\3:\3:\3\u00aa\2;\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\2\'"+
		"\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36"+
		"G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65\3\2\n\4"+
		"\2C\\c|\3\2\62;\3\2\f\f\5\2,-//\61\61\4\2\f\f$$\4\2>>@@\b\2*+..<=??]]"+
		"__\5\2\13\f\17\17\"\"\2\u01f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2"+
		"\2\2\5w\3\2\2\2\7y\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081"+
		"\3\2\2\2\21\u0083\3\2\2\2\23\u0085\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3"+
		"\2\2\2\31\u008b\3\2\2\2\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0093\3\2"+
		"\2\2!\u0095\3\2\2\2#\u00a3\3\2\2\2%\u00b1\3\2\2\2\'\u00b3\3\2\2\2)\u00b9"+
		"\3\2\2\2+\u00ca\3\2\2\2-\u00cc\3\2\2\2/\u00d7\3\2\2\2\61\u00dd\3\2\2\2"+
		"\63\u00e7\3\2\2\2\65\u00ef\3\2\2\2\67\u00f4\3\2\2\29\u00fb\3\2\2\2;\u0101"+
		"\3\2\2\2=\u0108\3\2\2\2?\u010f\3\2\2\2A\u0114\3\2\2\2C\u011a\3\2\2\2E"+
		"\u0122\3\2\2\2G\u012a\3\2\2\2I\u012f\3\2\2\2K\u0135\3\2\2\2M\u013c\3\2"+
		"\2\2O\u0141\3\2\2\2Q\u0148\3\2\2\2S\u014e\3\2\2\2U\u0153\3\2\2\2W\u0159"+
		"\3\2\2\2Y\u0163\3\2\2\2[\u016c\3\2\2\2]\u0188\3\2\2\2_\u01a7\3\2\2\2a"+
		"\u01a9\3\2\2\2c\u01b3\3\2\2\2e\u01b6\3\2\2\2g\u01c1\3\2\2\2i\u01c3\3\2"+
		"\2\2k\u01c5\3\2\2\2m\u01cc\3\2\2\2o\u01d2\3\2\2\2q\u01d5\3\2\2\2s\u01db"+
		"\3\2\2\2uv\7=\2\2v\4\3\2\2\2wx\7.\2\2x\6\3\2\2\2yz\7<\2\2z\b\3\2\2\2{"+
		"|\7?\2\2|\n\3\2\2\2}~\7-\2\2~\f\3\2\2\2\177\u0080\7/\2\2\u0080\16\3\2"+
		"\2\2\u0081\u0082\7*\2\2\u0082\20\3\2\2\2\u0083\u0084\7+\2\2\u0084\22\3"+
		"\2\2\2\u0085\u0086\7]\2\2\u0086\24\3\2\2\2\u0087\u0088\7_\2\2\u0088\26"+
		"\3\2\2\2\u0089\u008a\7,\2\2\u008a\30\3\2\2\2\u008b\u008c\7\61\2\2\u008c"+
		"\32\3\2\2\2\u008d\u008e\t\2\2\2\u008e\34\3\2\2\2\u008f\u0090\t\3\2\2\u0090"+
		"\36\3\2\2\2\u0091\u0094\5\33\16\2\u0092\u0094\5\35\17\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0092\3\2\2\2\u0094 \3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097"+
		"\7#\2\2\u0097\u0098\7/\2\2\u0098\u009c\3\2\2\2\u0099\u009b\n\4\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7/\2\2\u00a0"+
		"\u00a1\7#\2\2\u00a1\u00a2\7@\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4"+
		"\u00a5\7/\2\2\u00a5\u00a6\7/\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7/"+
		"\2\2\u00ae\u00af\7/\2\2\u00af\u00b0\7\177\2\2\u00b0$\3\2\2\2\u00b1\u00b2"+
		"\t\5\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6"+
		"\7r\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7v\2\2\u00b8(\3\2\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7r\2\2\u00bd"+
		"\u00be\7w\2\2\u00be\u00bf\7v\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7K\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00cb\7v\2\2\u00c3\u00c4\7H\2\2\u00c4\u00c5\7n\2\2"+
		"\u00c5\u00c6\7q\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00cb\b\26\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c3\3\2\2\2"+
		"\u00cb,\3\2\2\2\u00cc\u00cd\7O\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7k\2"+
		"\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7R\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7i\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\27\3\2\u00d6"+
		".\3\2\2\2\u00d7\u00d8\7X\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\b\30\4\2\u00dc\60\3\2\2\2\u00dd\u00de\7D\2"+
		"\2\u00de\u00df\7g\2\2\u00df\u00e0\7i\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2"+
		"\7p\2\2\u00e2\u00e3\7R\2\2\u00e3\u00e4\7i\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\b\31\5\2\u00e6\62\3\2\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7p\2\2"+
		"\u00e9\u00ea\7f\2\2\u00ea\u00eb\7R\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\b\32\6\2\u00ee\64\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0"+
		"\u00f1\7h\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\33\7\2\u00f3\66\3\2\2"+
		"\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\34\b\2\u00fa8\3\2\2\2\u00fb"+
		"\u00fc\7g\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7k\2\2"+
		"\u00ff\u0100\7h\2\2\u0100:\3\2\2\2\u0101\u0102\7v\2\2\u0102\u0103\7j\2"+
		"\2\u0103\u0104\7g\2\2\u0104\u0105\7p\2\2\u0105\u0106\3\2\2\2\u0106\u0107"+
		"\b\36\t\2\u0107<\3\2\2\2\u0108\u0109\7u\2\2\u0109\u010a\7y\2\2\u010a\u010b"+
		"\7k\2\2\u010b\u010c\7v\2\2\u010c\u010d\7e\2\2\u010d\u010e\7j\2\2\u010e"+
		">\3\2\2\2\u010f\u0110\7e\2\2\u0110\u0111\7c\2\2\u0111\u0112\7u\2\2\u0112"+
		"\u0113\7g\2\2\u0113@\3\2\2\2\u0114\u0115\7d\2\2\u0115\u0116\7t\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7c\2\2\u0118\u0119\7m\2\2\u0119B\3\2\2\2\u011a"+
		"\u011b\7f\2\2\u011b\u011c\7g\2\2\u011c\u011d\7h\2\2\u011d\u011e\7c\2\2"+
		"\u011e\u011f\7w\2\2\u011f\u0120\7n\2\2\u0120\u0121\7v\2\2\u0121D\3\2\2"+
		"\2\u0122\u0123\7y\2\2\u0123\u0124\7j\2\2\u0124\u0125\7k\2\2\u0125\u0126"+
		"\7n\2\2\u0126\u0127\7g\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b#\n\2\u0129"+
		"F\3\2\2\2\u012a\u012b\7f\2\2\u012b\u012c\7q\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\b$\13\2\u012eH\3\2\2\2\u012f\u0130\7h\2\2\u0130\u0131\7q\2\2\u0131"+
		"\u0132\7t\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b%\f\2\u0134J\3\2\2\2\u0135"+
		"\u0136\7h\2\2\u0136\u0137\7t\2\2\u0137\u0138\7q\2\2\u0138\u0139\7o\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013b\b&\r\2\u013bL\3\2\2\2\u013c\u013d\7v"+
		"\2\2\u013d\u013e\7q\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\'\16\2\u0140"+
		"N\3\2\2\2\u0141\u0142\7u\2\2\u0142\u0143\7v\2\2\u0143\u0144\7g\2\2\u0144"+
		"\u0145\7r\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b(\17\2\u0147P\3\2\2\2\u0148"+
		"\u0149\7C\2\2\u0149\u014a\7P\2\2\u014a\u014b\7F\2\2\u014b\u014c\3\2\2"+
		"\2\u014c\u014d\b)\20\2\u014dR\3\2\2\2\u014e\u014f\7Q\2\2\u014f\u0150\7"+
		"T\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b*\21\2\u0152T\3\2\2\2\u0153\u0154"+
		"\7n\2\2\u0154\u0155\7g\2\2\u0155\u0156\7v\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\b+\22\2\u0158V\3\2\2\2\u0159\u015a\7B\2\2\u015a\u015b\7F\2\2\u015b"+
		"\u015c\7g\2\2\u015c\u015d\7h\2\2\u015d\u015e\7k\2\2\u015e\u015f\7p\2\2"+
		"\u015f\u0160\7g\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b,\23\2\u0162X\3\2"+
		"\2\2\u0163\u0164\7e\2\2\u0164\u0165\7q\2\2\u0165\u0166\7p\2\2\u0166\u0167"+
		"\7u\2\2\u0167\u0168\7v\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b-\24\2\u016a"+
		"Z\3\2\2\2\u016b\u016d\5\33\16\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2"+
		"\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0182\3\2\2\2\u0170\u0172"+
		"\5\37\20\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u017d\3\2\2\2\u0175\u0177\7a\2\2\u0176\u0178"+
		"\5\37\20\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2"+
		"\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0175\3\2\2\2\u017c\u017f"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0171\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0186\b.\25\2\u0186\\\3\2\2\2\u0187\u0189\5\35\17\2\u0188\u0187\3\2\2"+
		"\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018d\b/\26\2\u018d^\3\2\2\2\u018e\u0190\5\35\17\2\u018f"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u0195\7\60\2\2\u0194\u0196\5\35\17\2\u0195"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u01a8\3\2\2\2\u0199\u019b\7\60\2\2\u019a\u019c\5\35\17\2\u019b"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a8\3\2\2\2\u019f\u01a1\5\35\17\2\u01a0\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\7\60\2\2\u01a5\u01a6\b\60\27\2\u01a6\u01a8\3\2\2\2\u01a7"+
		"\u018f\3\2\2\2\u01a7\u0199\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a8`\3\2\2\2"+
		"\u01a9\u01ad\7$\2\2\u01aa\u01ac\n\6\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af"+
		"\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u01b1\7$\2\2\u01b1\u01b2\b\61\30\2\u01b2b\3\2\2\2"+
		"\u01b3\u01b4\7<\2\2\u01b4\u01b5\7?\2\2\u01b5d\3\2\2\2\u01b6\u01b7\7#\2"+
		"\2\u01b7f\3\2\2\2\u01b8\u01c2\t\7\2\2\u01b9\u01ba\7@\2\2\u01ba\u01c2\7"+
		"?\2\2\u01bb\u01bc\7>\2\2\u01bc\u01c2\7?\2\2\u01bd\u01be\7?\2\2\u01be\u01c2"+
		"\7?\2\2\u01bf\u01c0\7#\2\2\u01c0\u01c2\7?\2\2\u01c1\u01b8\3\2\2\2\u01c1"+
		"\u01b9\3\2\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2h\3\2\2\2\u01c3\u01c4\7}\2\2\u01c4j\3\2\2\2\u01c5\u01c6\7\177"+
		"\2\2\u01c6l\3\2\2\2\u01c7\u01cd\t\b\2\2\u01c8\u01cd\5%\23\2\u01c9\u01ca"+
		"\5g\64\2\u01ca\u01cb\b\67\31\2\u01cb\u01cd\3\2\2\2\u01cc\u01c7\3\2\2\2"+
		"\u01cc\u01c8\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cdn\3\2\2\2\u01ce\u01d3\5"+
		"#\22\2\u01cf\u01d0\5!\21\2\u01d0\u01d1\b8\32\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01ce\3\2\2\2\u01d2\u01cf\3\2\2\2\u01d3p\3\2\2\2\u01d4\u01d6\t\t\2\2"+
		"\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\b9\33\2\u01dar\3\2\2\2\u01db"+
		"\u01dc\13\2\2\2\u01dc\u01dd\b:\34\2\u01ddt\3\2\2\2\27\2\u0093\u009c\u00aa"+
		"\u00ca\u016e\u0173\u0179\u017d\u0182\u018a\u0191\u0197\u019d\u01a2\u01a7"+
		"\u01ad\u01c1\u01cc\u01d2\u01d7\35\3\26\2\3\27\3\3\30\4\3\31\5\3\32\6\3"+
		"\33\7\3\34\b\3\36\t\3#\n\3$\13\3%\f\3&\r\3\'\16\3(\17\3)\20\3*\21\3+\22"+
		"\3,\23\3-\24\3.\25\3/\26\3\60\27\3\61\30\3\67\31\38\32\b\2\2\3:\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}