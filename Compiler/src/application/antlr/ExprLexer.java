package application.antlr;

// Generated from Expr.g4 by ANTLR 4.7.2

  import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

import application.antlr.SymboleTable.Constant_Hashtable;
import application.antlr.SymboleTable.IDF_HashTable;
import application.antlr.SymboleTable.Keywords_Hashtable;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEANVALUE=1, INPUT=2, OUTPUT=3, TYPE=4, MAIN=5, VAR=6, BEGIN=7, END=8, 
		IF=9, ELSE=10, ELSIF=11, THEN=12, SWITCH=13, CASE=14, BREAK=15, DEFAULT=16, 
		WHILE=17, DO=18, FOR=19, FROM=20, TO=21, STEP=22, AND=23, OR=24, LET=25, 
		DEFINE=26, CONST=27, IDF=28, INT=29, FLOAT=30, STRING=31, CHAR=32, CONCAT=33, 
		AFFECT=34, NOT=35, GREATER=36, LESSER=37, GEQ=38, LEQ=39, EQ=40, NEQ=41, 
		LBRACE=42, RBRACE=43, PLUS=44, SUB=45, MUL=46, DIV=47, COM=48, SEMI=49, 
		LBRACKET=50, RBRACKET=51, LPAR=52, RPAR=53, ASSIGN=54, TWOPOINT=55, COMMENT=56, 
		WS=57, ERROR_TOKEN=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SIGN", "LETTER", "DIGIT", "ALPHANUMERICAL", "INLINECOMMENT", "MULTILINECOMMENT", 
			"INTEGER", "FLOATED", "BOOLEANVALUE", "INPUT", "OUTPUT", "TYPE", "MAIN", 
			"VAR", "BEGIN", "END", "IF", "ELSE", "ELSIF", "THEN", "SWITCH", "CASE", 
			"BREAK", "DEFAULT", "WHILE", "DO", "FOR", "FROM", "TO", "STEP", "AND", 
			"OR", "LET", "DEFINE", "CONST", "IDF", "INT", "FLOAT", "STRING", "CHAR", 
			"CONCAT", "AFFECT", "NOT", "GREATER", "LESSER", "GEQ", "LEQ", "EQ", "NEQ", 
			"LBRACE", "RBRACE", "PLUS", "SUB", "MUL", "DIV", "COM", "SEMI", "LBRACKET", 
			"RBRACKET", "LPAR", "RPAR", "ASSIGN", "TWOPOINT", "COMMENT", "WS", "ERROR_TOKEN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'input'", "'output'", null, "'MainPrgm'", "'Var'", "'BeginPg'", 
			"'EndPg'", "'if'", "'else'", "'elsif'", "'then'", "'switch'", "'case'", 
			"'break'", "'default'", "'while'", "'do'", "'for'", "'from'", "'to'", 
			"'step'", "'AND'", "'OR'", "'let'", "'@define'", "'Const'", null, null, 
			null, null, null, "'.'", "':='", "'!'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "','", "';'", 
			"'['", "']'", "'('", "')'", "'='", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEANVALUE", "INPUT", "OUTPUT", "TYPE", "MAIN", "VAR", "BEGIN", 
			"END", "IF", "ELSE", "ELSIF", "THEN", "SWITCH", "CASE", "BREAK", "DEFAULT", 
			"WHILE", "DO", "FOR", "FROM", "TO", "STEP", "AND", "OR", "LET", "DEFINE", 
			"CONST", "IDF", "INT", "FLOAT", "STRING", "CHAR", "CONCAT", "AFFECT", 
			"NOT", "GREATER", "LESSER", "GEQ", "LEQ", "EQ", "NEQ", "LBRACE", "RBRACE", 
			"PLUS", "SUB", "MUL", "DIV", "COM", "SEMI", "LBRACKET", "RBRACKET", "LPAR", 
			"RPAR", "ASSIGN", "TWOPOINT", "COMMENT", "WS", "ERROR_TOKEN"
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


	   public static final LinkedHashSet<String> types = new LinkedHashSet<>();
	   public static final LinkedHashSet<String> boolTypes = new LinkedHashSet<>();
	   public static final LinkedHashSet<String> comTypes = new LinkedHashSet<>();


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
		case 8:
			BOOLEANVALUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			INPUT_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			OUTPUT_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			MAIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			BEGIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			ELSIF_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			THEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			SWITCH_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			CASE_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			BREAK_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			DEFAULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			DO_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			FROM_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			TO_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			STEP_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			LET_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			DEFINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			IDF_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			FLOAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BOOLEANVALUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Boolean Value");
			break;
		case 1:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Boolean Value");
			break;
		}
	}
	private void INPUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Read Function");
			break;
		}
	}
	private void OUTPUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Print Function");
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");
			break;
		case 5:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");
			break;
		case 6:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");
			break;
		case 7:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");
			break;
		case 8:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");
			break;
		}
	}
	private void MAIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainProgram Header");
			break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Variable Block Delimiter");
			break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainCode Delimiter");
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainCode Delimiter");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"If Keyword");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Else Keyword");
			break;
		}
	}
	private void ELSIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Else If Keyword");
			break;
		}
	}
	private void THEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Then Keyword");
			break;
		}
	}
	private void SWITCH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Switch Keyword");
			break;
		}
	}
	private void CASE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Case Delimiter");
			break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Case Delimiter");
			break;
		}
	}
	private void DEFAULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Default Case Delimiter");
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");
			break;
		}
	}
	private void DO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");
			break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");
			break;
		}
	}
	private void FROM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"From Keyword");
			break;
		}
	}
	private void TO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"To Keyword");
			break;
		}
	}
	private void STEP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Step Keyword");
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Logical AND");
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Logical OR");
			break;
		}
	}
	private void LET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Variable Declarator");
			break;
		}
	}
	private void DEFINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Constant Declarator");
			break;
		}
	}
	private void CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:
			Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Constant Declarator");
			break;
		}
	}
	private void IDF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			IDF_HashTable.table.insertFirst(getText(),getLine(),getCharPositionInLine());
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());
			break;
		case 34:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());
			break;
		case 36:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"string",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"char",getLine(),getCharPositionInLine());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u023d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5"+
		"\5\u0090\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\7"+
		"\3\7\3\7\3\7\3\b\6\b\u00af\n\b\r\b\16\b\u00b0\3\t\6\t\u00b4\n\t\r\t\16"+
		"\t\u00b5\3\t\3\t\6\t\u00ba\n\t\r\t\16\t\u00bb\3\t\3\t\6\t\u00c0\n\t\r"+
		"\t\16\t\u00c1\3\t\6\t\u00c5\n\t\r\t\16\t\u00c6\3\t\3\t\5\t\u00cb\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00da\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010d"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3%\6%\u01b9\n%\r%\16%\u01ba\3%\6%\u01be\n%\r%\16%\u01bf"+
		"\3%\3%\6%\u01c4\n%\r%\16%\u01c5\7%\u01c8\n%\f%\16%\u01cb\13%\7%\u01cd"+
		"\n%\f%\16%\u01d0\13%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01dd\n&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01e8\n\'\3(\3(\7(\u01ec\n(\f(\16"+
		"(\u01ef\13(\3(\3(\3(\3)\3)\7)\u01f6\n)\f)\16)\u01f9\13)\3)\3)\3)\3*\3"+
		"*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38"+
		"\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\5A\u0233\nA\3B"+
		"\6B\u0236\nB\rB\16B\u0237\3B\3B\3C\3C\3\u00a6\2D\3\2\5\2\7\2\t\2\13\2"+
		"\r\2\17\2\21\2\23\3\25\4\27\5\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17"+
		"-\20/\21\61\22\63\23\65\24\67\259\26;\27=\30?\31A\32C\33E\34G\35I\36K"+
		"\37M O!Q\"S#U$W%Y&[\'](_)a*c+e,g-i.k/m\60o\61q\62s\63u\64w\65y\66{\67"+
		"}8\1779\u0081:\u0083;\u0085<\3\2\t\4\2--//\4\2C\\c|\3\2\62;\3\2\f\f\4"+
		"\2\f\f$$\4\2\f\f))\5\2\13\f\17\17\"\"\2\u024e\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u0089\3\2\2\2\7\u008b"+
		"\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u009f\3\2\2\2\17\u00ae\3\2"+
		"\2\2\21\u00ca\3\2\2\2\23\u00d9\3\2\2\2\25\u00db\3\2\2\2\27\u00e3\3\2\2"+
		"\2\31\u010c\3\2\2\2\33\u010e\3\2\2\2\35\u0119\3\2\2\2\37\u011f\3\2\2\2"+
		"!\u0129\3\2\2\2#\u0131\3\2\2\2%\u0136\3\2\2\2\'\u013d\3\2\2\2)\u0145\3"+
		"\2\2\2+\u014c\3\2\2\2-\u0155\3\2\2\2/\u015c\3\2\2\2\61\u0164\3\2\2\2\63"+
		"\u016e\3\2\2\2\65\u0176\3\2\2\2\67\u017b\3\2\2\29\u0181\3\2\2\2;\u0188"+
		"\3\2\2\2=\u018d\3\2\2\2?\u0194\3\2\2\2A\u019a\3\2\2\2C\u019f\3\2\2\2E"+
		"\u01a5\3\2\2\2G\u01af\3\2\2\2I\u01b8\3\2\2\2K\u01dc\3\2\2\2M\u01e7\3\2"+
		"\2\2O\u01e9\3\2\2\2Q\u01f3\3\2\2\2S\u01fd\3\2\2\2U\u01ff\3\2\2\2W\u0202"+
		"\3\2\2\2Y\u0204\3\2\2\2[\u0206\3\2\2\2]\u0208\3\2\2\2_\u020b\3\2\2\2a"+
		"\u020e\3\2\2\2c\u0211\3\2\2\2e\u0214\3\2\2\2g\u0216\3\2\2\2i\u0218\3\2"+
		"\2\2k\u021a\3\2\2\2m\u021c\3\2\2\2o\u021e\3\2\2\2q\u0220\3\2\2\2s\u0222"+
		"\3\2\2\2u\u0224\3\2\2\2w\u0226\3\2\2\2y\u0228\3\2\2\2{\u022a\3\2\2\2}"+
		"\u022c\3\2\2\2\177\u022e\3\2\2\2\u0081\u0232\3\2\2\2\u0083\u0235\3\2\2"+
		"\2\u0085\u023b\3\2\2\2\u0087\u0088\t\2\2\2\u0088\4\3\2\2\2\u0089\u008a"+
		"\t\3\2\2\u008a\6\3\2\2\2\u008b\u008c\t\4\2\2\u008c\b\3\2\2\2\u008d\u0090"+
		"\5\5\3\2\u008e\u0090\5\7\4\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\n\3\2\2\2\u0091\u0092\7>\2\2\u0092\u0093\7#\2\2\u0093\u0094\7/\2\2\u0094"+
		"\u0098\3\2\2\2\u0095\u0097\n\5\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\7/\2\2\u009c\u009d\7#\2\2\u009d\u009e\7@\2"+
		"\2\u009e\f\3\2\2\2\u009f\u00a0\7}\2\2\u00a0\u00a1\7/\2\2\u00a1\u00a2\7"+
		"/\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab\7/\2\2\u00ab\u00ac"+
		"\7\177\2\2\u00ac\16\3\2\2\2\u00ad\u00af\5\7\4\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\20\3\2\2"+
		"\2\u00b2\u00b4\5\7\4\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\7\60\2\2"+
		"\u00b8\u00ba\5\7\4\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00cb\3\2\2\2\u00bd\u00bf\7\60\2\2"+
		"\u00be\u00c0\5\7\4\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00cb\3\2\2\2\u00c3\u00c5\5\7\4\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\60\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00b3\3\2\2\2\u00ca\u00bd\3\2\2\2\u00ca\u00c4\3\2\2\2\u00cb\22\3\2\2"+
		"\2\u00cc\u00cd\7V\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00da\b\n\2\2\u00d2\u00d3\7H\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00da\b\n\3\2\u00d9\u00cc\3\2\2\2\u00d9\u00d2"+
		"\3\2\2\2\u00da\24\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd"+
		"\u00de\7r\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\3\2\2"+
		"\2\u00e1\u00e2\b\13\4\2\u00e2\26\3\2\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5"+
		"\7w\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7w\2\2\u00e8"+
		"\u00e9\7v\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\f\5\2\u00eb\30\3\2\2\2"+
		"\u00ec\u00ed\7K\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u010d\b\r\6\2\u00f1\u00f2\7H\2\2\u00f2\u00f3\7n\2\2\u00f3"+
		"\u00f4\7q\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\3\2\2"+
		"\2\u00f7\u010d\b\r\7\2\u00f8\u00f9\7D\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb"+
		"\7q\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\3\2\2\2\u00fd\u010d\b\r\b\2\u00fe"+
		"\u00ff\7U\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7t\2\2\u0101\u0102\7k\2\2"+
		"\u0102\u0103\7p\2\2\u0103\u0104\7i\2\2\u0104\u0105\3\2\2\2\u0105\u010d"+
		"\b\r\t\2\u0106\u0107\7E\2\2\u0107\u0108\7j\2\2\u0108\u0109\7c\2\2\u0109"+
		"\u010a\7t\2\2\u010a\u010b\3\2\2\2\u010b\u010d\b\r\n\2\u010c\u00ec\3\2"+
		"\2\2\u010c\u00f1\3\2\2\2\u010c\u00f8\3\2\2\2\u010c\u00fe\3\2\2\2\u010c"+
		"\u0106\3\2\2\2\u010d\32\3\2\2\2\u010e\u010f\7O\2\2\u010f\u0110\7c\2\2"+
		"\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7R\2\2\u0113\u0114"+
		"\7t\2\2\u0114\u0115\7i\2\2\u0115\u0116\7o\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\b\16\13\2\u0118\34\3\2\2\2\u0119\u011a\7X\2\2\u011a\u011b\7c\2"+
		"\2\u011b\u011c\7t\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b\17\f\2\u011e\36"+
		"\3\2\2\2\u011f\u0120\7D\2\2\u0120\u0121\7g\2\2\u0121\u0122\7i\2\2\u0122"+
		"\u0123\7k\2\2\u0123\u0124\7p\2\2\u0124\u0125\7R\2\2\u0125\u0126\7i\2\2"+
		"\u0126\u0127\3\2\2\2\u0127\u0128\b\20\r\2\u0128 \3\2\2\2\u0129\u012a\7"+
		"G\2\2\u012a\u012b\7p\2\2\u012b\u012c\7f\2\2\u012c\u012d\7R\2\2\u012d\u012e"+
		"\7i\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b\21\16\2\u0130\"\3\2\2\2\u0131"+
		"\u0132\7k\2\2\u0132\u0133\7h\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b\22"+
		"\17\2\u0135$\3\2\2\2\u0136\u0137\7g\2\2\u0137\u0138\7n\2\2\u0138\u0139"+
		"\7u\2\2\u0139\u013a\7g\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b\23\20\2\u013c"+
		"&\3\2\2\2\u013d\u013e\7g\2\2\u013e\u013f\7n\2\2\u013f\u0140\7u\2\2\u0140"+
		"\u0141\7k\2\2\u0141\u0142\7h\2\2\u0142\u0143\3\2\2\2\u0143\u0144\b\24"+
		"\21\2\u0144(\3\2\2\2\u0145\u0146\7v\2\2\u0146\u0147\7j\2\2\u0147\u0148"+
		"\7g\2\2\u0148\u0149\7p\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b\25\22\2\u014b"+
		"*\3\2\2\2\u014c\u014d\7u\2\2\u014d\u014e\7y\2\2\u014e\u014f\7k\2\2\u014f"+
		"\u0150\7v\2\2\u0150\u0151\7e\2\2\u0151\u0152\7j\2\2\u0152\u0153\3\2\2"+
		"\2\u0153\u0154\b\26\23\2\u0154,\3\2\2\2\u0155\u0156\7e\2\2\u0156\u0157"+
		"\7c\2\2\u0157\u0158\7u\2\2\u0158\u0159\7g\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\b\27\24\2\u015b.\3\2\2\2\u015c\u015d\7d\2\2\u015d\u015e\7t\2\2"+
		"\u015e\u015f\7g\2\2\u015f\u0160\7c\2\2\u0160\u0161\7m\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0163\b\30\25\2\u0163\60\3\2\2\2\u0164\u0165\7f\2\2\u0165"+
		"\u0166\7g\2\2\u0166\u0167\7h\2\2\u0167\u0168\7c\2\2\u0168\u0169\7w\2\2"+
		"\u0169\u016a\7n\2\2\u016a\u016b\7v\2\2\u016b\u016c\3\2\2\2\u016c\u016d"+
		"\b\31\26\2\u016d\62\3\2\2\2\u016e\u016f\7y\2\2\u016f\u0170\7j\2\2\u0170"+
		"\u0171\7k\2\2\u0171\u0172\7n\2\2\u0172\u0173\7g\2\2\u0173\u0174\3\2\2"+
		"\2\u0174\u0175\b\32\27\2\u0175\64\3\2\2\2\u0176\u0177\7f\2\2\u0177\u0178"+
		"\7q\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b\33\30\2\u017a\66\3\2\2\2\u017b"+
		"\u017c\7h\2\2\u017c\u017d\7q\2\2\u017d\u017e\7t\2\2\u017e\u017f\3\2\2"+
		"\2\u017f\u0180\b\34\31\2\u01808\3\2\2\2\u0181\u0182\7h\2\2\u0182\u0183"+
		"\7t\2\2\u0183\u0184\7q\2\2\u0184\u0185\7o\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\b\35\32\2\u0187:\3\2\2\2\u0188\u0189\7v\2\2\u0189\u018a\7q\2\2"+
		"\u018a\u018b\3\2\2\2\u018b\u018c\b\36\33\2\u018c<\3\2\2\2\u018d\u018e"+
		"\7u\2\2\u018e\u018f\7v\2\2\u018f\u0190\7g\2\2\u0190\u0191\7r\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0193\b\37\34\2\u0193>\3\2\2\2\u0194\u0195\7C\2\2"+
		"\u0195\u0196\7P\2\2\u0196\u0197\7F\2\2\u0197\u0198\3\2\2\2\u0198\u0199"+
		"\b \35\2\u0199@\3\2\2\2\u019a\u019b\7Q\2\2\u019b\u019c\7T\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u019e\b!\36\2\u019eB\3\2\2\2\u019f\u01a0\7n\2\2\u01a0\u01a1"+
		"\7g\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b\"\37\2\u01a4"+
		"D\3\2\2\2\u01a5\u01a6\7B\2\2\u01a6\u01a7\7f\2\2\u01a7\u01a8\7g\2\2\u01a8"+
		"\u01a9\7h\2\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7g\2\2"+
		"\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b# \2\u01aeF\3\2\2\2\u01af\u01b0\7E\2"+
		"\2\u01b0\u01b1\7q\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7u\2\2\u01b3\u01b4"+
		"\7v\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\b$!\2\u01b6H\3\2\2\2\u01b7\u01b9"+
		"\5\5\3\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01ce\3\2\2\2\u01bc\u01be\5\t\5\2\u01bd\u01bc\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c9\3\2\2\2\u01c1\u01c3\7a\2\2\u01c2\u01c4\5\t\5\2\u01c3\u01c2\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01bd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\b%\"\2\u01d2"+
		"J\3\2\2\2\u01d3\u01d4\7*\2\2\u01d4\u01d5\5\3\2\2\u01d5\u01d6\5\17\b\2"+
		"\u01d6\u01d7\7+\2\2\u01d7\u01d8\b&#\2\u01d8\u01dd\3\2\2\2\u01d9\u01da"+
		"\5\17\b\2\u01da\u01db\b&$\2\u01db\u01dd\3\2\2\2\u01dc\u01d3\3\2\2\2\u01dc"+
		"\u01d9\3\2\2\2\u01ddL\3\2\2\2\u01de\u01df\7*\2\2\u01df\u01e0\5\3\2\2\u01e0"+
		"\u01e1\5\21\t\2\u01e1\u01e2\7+\2\2\u01e2\u01e3\b\'%\2\u01e3\u01e8\3\2"+
		"\2\2\u01e4\u01e5\5\21\t\2\u01e5\u01e6\b\'&\2\u01e6\u01e8\3\2\2\2\u01e7"+
		"\u01de\3\2\2\2\u01e7\u01e4\3\2\2\2\u01e8N\3\2\2\2\u01e9\u01ed\7$\2\2\u01ea"+
		"\u01ec\n\6\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f1\7$\2\2\u01f1\u01f2\b(\'\2\u01f2P\3\2\2\2\u01f3\u01f7\7)\2\2\u01f4"+
		"\u01f6\n\7\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fb\7)\2\2\u01fb\u01fc\b)(\2\u01fcR\3\2\2\2\u01fd\u01fe\7\60\2\2\u01fe"+
		"T\3\2\2\2\u01ff\u0200\7<\2\2\u0200\u0201\7?\2\2\u0201V\3\2\2\2\u0202\u0203"+
		"\7#\2\2\u0203X\3\2\2\2\u0204\u0205\7@\2\2\u0205Z\3\2\2\2\u0206\u0207\7"+
		">\2\2\u0207\\\3\2\2\2\u0208\u0209\7@\2\2\u0209\u020a\7?\2\2\u020a^\3\2"+
		"\2\2\u020b\u020c\7>\2\2\u020c\u020d\7?\2\2\u020d`\3\2\2\2\u020e\u020f"+
		"\7?\2\2\u020f\u0210\7?\2\2\u0210b\3\2\2\2\u0211\u0212\7#\2\2\u0212\u0213"+
		"\7?\2\2\u0213d\3\2\2\2\u0214\u0215\7}\2\2\u0215f\3\2\2\2\u0216\u0217\7"+
		"\177\2\2\u0217h\3\2\2\2\u0218\u0219\7-\2\2\u0219j\3\2\2\2\u021a\u021b"+
		"\7/\2\2\u021bl\3\2\2\2\u021c\u021d\7,\2\2\u021dn\3\2\2\2\u021e\u021f\7"+
		"\61\2\2\u021fp\3\2\2\2\u0220\u0221\7.\2\2\u0221r\3\2\2\2\u0222\u0223\7"+
		"=\2\2\u0223t\3\2\2\2\u0224\u0225\7]\2\2\u0225v\3\2\2\2\u0226\u0227\7_"+
		"\2\2\u0227x\3\2\2\2\u0228\u0229\7*\2\2\u0229z\3\2\2\2\u022a\u022b\7+\2"+
		"\2\u022b|\3\2\2\2\u022c\u022d\7?\2\2\u022d~\3\2\2\2\u022e\u022f\7<\2\2"+
		"\u022f\u0080\3\2\2\2\u0230\u0233\5\r\7\2\u0231\u0233\5\13\6\2\u0232\u0230"+
		"\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0082\3\2\2\2\u0234\u0236\t\b\2\2\u0235"+
		"\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u023a\bB)\2\u023a\u0084\3\2\2\2\u023b\u023c"+
		"\13\2\2\2\u023c\u0086\3\2\2\2\31\2\u008f\u0098\u00a6\u00b0\u00b5\u00bb"+
		"\u00c1\u00c6\u00ca\u00d9\u010c\u01ba\u01bf\u01c5\u01c9\u01ce\u01dc\u01e7"+
		"\u01ed\u01f7\u0232\u0237*\3\n\2\3\n\3\3\13\4\3\f\5\3\r\6\3\r\7\3\r\b\3"+
		"\r\t\3\r\n\3\16\13\3\17\f\3\20\r\3\21\16\3\22\17\3\23\20\3\24\21\3\25"+
		"\22\3\26\23\3\27\24\3\30\25\3\31\26\3\32\27\3\33\30\3\34\31\3\35\32\3"+
		"\36\33\3\37\34\3 \35\3!\36\3\"\37\3# \3$!\3%\"\3&#\3&$\3\'%\3\'&\3(\'"+
		"\3)(\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}