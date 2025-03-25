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
		BOOLEANVALUE=1, INPUT=2, OUTPUT=3, TYPE=4, MAIN=5, VAR=6, BEGIN=7, END=8, 
		IF=9, ELSE=10, ELSIF=11, THEN=12, SWITCH=13, CASE=14, BREAK=15, DEFAULT=16, 
		WHILE=17, DO=18, FOR=19, FROM=20, TO=21, STEP=22, AND=23, OR=24, LET=25, 
		DEFINE=26, CONST=27, IDF=28, INT=29, FLOAT=30, STRING=31, CHAR=32, AFFECT=33, 
		NOT=34, GREATER=35, LESSER=36, GEQ=37, LEQ=38, EQ=39, NEQ=40, LBRACE=41, 
		RBRACE=42, PLUS=43, SUB=44, MUL=45, DIV=46, COM=47, SEMI=48, LBRACKET=49, 
		RBRACKET=50, LPAR=51, RPAR=52, ASSIGN=53, TWOPOINT=54, COMMENT=55, WS=56, 
		ERROR_TOKEN=57;
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
			"AFFECT", "NOT", "GREATER", "LESSER", "GEQ", "LEQ", "EQ", "NEQ", "LBRACE", 
			"RBRACE", "PLUS", "SUB", "MUL", "DIV", "COM", "SEMI", "LBRACKET", "RBRACKET", 
			"LPAR", "RPAR", "ASSIGN", "TWOPOINT", "COMMENT", "WS", "ERROR_TOKEN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'input'", "'output'", null, "'MainPrgm'", "'Var'", "'BeginPg'", 
			"'EndPg'", "'if'", "'else'", "'elsif'", "'then'", "'switch'", "'case'", 
			"'break'", "'default'", "'while'", "'do'", "'for'", "'from'", "'to'", 
			"'step'", "'AND'", "'OR'", "'let'", "'@define'", "'Const'", null, null, 
			null, null, null, "':='", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "','", "';'", "'['", 
			"']'", "'('", "')'", "'='", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEANVALUE", "INPUT", "OUTPUT", "TYPE", "MAIN", "VAR", "BEGIN", 
			"END", "IF", "ELSE", "ELSIF", "THEN", "SWITCH", "CASE", "BREAK", "DEFAULT", 
			"WHILE", "DO", "FOR", "FROM", "TO", "STEP", "AND", "OR", "LET", "DEFINE", 
			"CONST", "IDF", "INT", "FLOAT", "STRING", "CHAR", "AFFECT", "NOT", "GREATER", 
			"LESSER", "GEQ", "LEQ", "EQ", "NEQ", "LBRACE", "RBRACE", "PLUS", "SUB", 
			"MUL", "DIV", "COM", "SEMI", "LBRACKET", "RBRACKET", "LPAR", "RPAR", 
			"ASSIGN", "TWOPOINT", "COMMENT", "WS", "ERROR_TOKEN"
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
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());
			break;
		case 33:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());
			break;
		case 35:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"string",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37:
			Constant_Hashtable.ConstantTable.insertTable(getText(),"char",getLine(),getCharPositionInLine());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0237\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u008e"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098\13\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u00a3\n\7\f\7\16\7\u00a6\13\7\3\7\3\7\3\7"+
		"\3\7\3\b\6\b\u00ad\n\b\r\b\16\b\u00ae\3\t\6\t\u00b2\n\t\r\t\16\t\u00b3"+
		"\3\t\3\t\6\t\u00b8\n\t\r\t\16\t\u00b9\3\t\3\t\6\t\u00be\n\t\r\t\16\t\u00bf"+
		"\3\t\6\t\u00c3\n\t\r\t\16\t\u00c4\3\t\3\t\5\t\u00c9\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d8\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010b\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\6%\u01b7\n%\r%\16%\u01b8\3%\6%\u01bc\n%\r%\16%\u01bd\3%\3%\6%"+
		"\u01c2\n%\r%\16%\u01c3\7%\u01c6\n%\f%\16%\u01c9\13%\7%\u01cb\n%\f%\16"+
		"%\u01ce\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01d9\n&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u01e4\n\'\3(\3(\7(\u01e8\n(\f(\16(\u01eb\13(\3(\3"+
		"(\3(\3)\3)\7)\u01f2\n)\f)\16)\u01f5\13)\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\5@\u022d\n@\3A\6A\u0230\nA\rA\16A\u0231"+
		"\3A\3A\3B\3B\3\u00a4\2C\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\3\25\4\27"+
		"\5\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/\21\61\22\63\23\65\24"+
		"\67\259\26;\27=\30?\31A\32C\33E\34G\35I\36K\37M O!Q\"S#U$W%Y&[\'](_)a"+
		"*c+e,g-i.k/m\60o\61q\62s\63u\64w\65y\66{\67}8\1779\u0081:\u0083;\3\2\t"+
		"\4\2--//\4\2C\\c|\3\2\62;\3\2\f\f\4\2\f\f$$\4\2\f\f))\5\2\13\f\17\17\""+
		"\"\2\u0248\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0087"+
		"\3\2\2\2\7\u0089\3\2\2\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u009d\3\2"+
		"\2\2\17\u00ac\3\2\2\2\21\u00c8\3\2\2\2\23\u00d7\3\2\2\2\25\u00d9\3\2\2"+
		"\2\27\u00e1\3\2\2\2\31\u010a\3\2\2\2\33\u010c\3\2\2\2\35\u0117\3\2\2\2"+
		"\37\u011d\3\2\2\2!\u0127\3\2\2\2#\u012f\3\2\2\2%\u0134\3\2\2\2\'\u013b"+
		"\3\2\2\2)\u0143\3\2\2\2+\u014a\3\2\2\2-\u0153\3\2\2\2/\u015a\3\2\2\2\61"+
		"\u0162\3\2\2\2\63\u016c\3\2\2\2\65\u0174\3\2\2\2\67\u0179\3\2\2\29\u017f"+
		"\3\2\2\2;\u0186\3\2\2\2=\u018b\3\2\2\2?\u0192\3\2\2\2A\u0198\3\2\2\2C"+
		"\u019d\3\2\2\2E\u01a3\3\2\2\2G\u01ad\3\2\2\2I\u01b6\3\2\2\2K\u01d8\3\2"+
		"\2\2M\u01e3\3\2\2\2O\u01e5\3\2\2\2Q\u01ef\3\2\2\2S\u01f9\3\2\2\2U\u01fc"+
		"\3\2\2\2W\u01fe\3\2\2\2Y\u0200\3\2\2\2[\u0202\3\2\2\2]\u0205\3\2\2\2_"+
		"\u0208\3\2\2\2a\u020b\3\2\2\2c\u020e\3\2\2\2e\u0210\3\2\2\2g\u0212\3\2"+
		"\2\2i\u0214\3\2\2\2k\u0216\3\2\2\2m\u0218\3\2\2\2o\u021a\3\2\2\2q\u021c"+
		"\3\2\2\2s\u021e\3\2\2\2u\u0220\3\2\2\2w\u0222\3\2\2\2y\u0224\3\2\2\2{"+
		"\u0226\3\2\2\2}\u0228\3\2\2\2\177\u022c\3\2\2\2\u0081\u022f\3\2\2\2\u0083"+
		"\u0235\3\2\2\2\u0085\u0086\t\2\2\2\u0086\4\3\2\2\2\u0087\u0088\t\3\2\2"+
		"\u0088\6\3\2\2\2\u0089\u008a\t\4\2\2\u008a\b\3\2\2\2\u008b\u008e\5\5\3"+
		"\2\u008c\u008e\5\7\4\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\n"+
		"\3\2\2\2\u008f\u0090\7>\2\2\u0090\u0091\7#\2\2\u0091\u0092\7/\2\2\u0092"+
		"\u0096\3\2\2\2\u0093\u0095\n\5\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7/\2\2\u009a\u009b\7#\2\2\u009b\u009c\7@\2"+
		"\2\u009c\f\3\2\2\2\u009d\u009e\7}\2\2\u009e\u009f\7/\2\2\u009f\u00a0\7"+
		"/\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\13\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7/\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa"+
		"\7\177\2\2\u00aa\16\3\2\2\2\u00ab\u00ad\5\7\4\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\20\3\2\2"+
		"\2\u00b0\u00b2\5\7\4\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7\60\2\2"+
		"\u00b6\u00b8\5\7\4\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c9\3\2\2\2\u00bb\u00bd\7\60\2\2"+
		"\u00bc\u00be\5\7\4\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c9\3\2\2\2\u00c1\u00c3\5\7\4\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\60\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00b1\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c9\22\3\2\2"+
		"\2\u00ca\u00cb\7V\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d8\b\n\2\2\u00d0\u00d1\7H\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d8\b\n\3\2\u00d7\u00ca\3\2\2\2\u00d7\u00d0"+
		"\3\2\2\2\u00d8\24\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db"+
		"\u00dc\7r\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7v\2\2\u00de\u00df\3\2\2"+
		"\2\u00df\u00e0\b\13\4\2\u00e0\26\3\2\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3"+
		"\7w\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e7\7v\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\f\5\2\u00e9\30\3\2\2\2"+
		"\u00ea\u00eb\7K\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u010b\b\r\6\2\u00ef\u00f0\7H\2\2\u00f0\u00f1\7n\2\2\u00f1"+
		"\u00f2\7q\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\3\2\2"+
		"\2\u00f5\u010b\b\r\7\2\u00f6\u00f7\7D\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\3\2\2\2\u00fb\u010b\b\r\b\2\u00fc"+
		"\u00fd\7U\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7k\2\2"+
		"\u0100\u0101\7p\2\2\u0101\u0102\7i\2\2\u0102\u0103\3\2\2\2\u0103\u010b"+
		"\b\r\t\2\u0104\u0105\7E\2\2\u0105\u0106\7j\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7t\2\2\u0108\u0109\3\2\2\2\u0109\u010b\b\r\n\2\u010a\u00ea\3\2"+
		"\2\2\u010a\u00ef\3\2\2\2\u010a\u00f6\3\2\2\2\u010a\u00fc\3\2\2\2\u010a"+
		"\u0104\3\2\2\2\u010b\32\3\2\2\2\u010c\u010d\7O\2\2\u010d\u010e\7c\2\2"+
		"\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110\u0111\7R\2\2\u0111\u0112"+
		"\7t\2\2\u0112\u0113\7i\2\2\u0113\u0114\7o\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\b\16\13\2\u0116\34\3\2\2\2\u0117\u0118\7X\2\2\u0118\u0119\7c\2"+
		"\2\u0119\u011a\7t\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b\17\f\2\u011c\36"+
		"\3\2\2\2\u011d\u011e\7D\2\2\u011e\u011f\7g\2\2\u011f\u0120\7i\2\2\u0120"+
		"\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122\u0123\7R\2\2\u0123\u0124\7i\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0126\b\20\r\2\u0126 \3\2\2\2\u0127\u0128\7"+
		"G\2\2\u0128\u0129\7p\2\2\u0129\u012a\7f\2\2\u012a\u012b\7R\2\2\u012b\u012c"+
		"\7i\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\21\16\2\u012e\"\3\2\2\2\u012f"+
		"\u0130\7k\2\2\u0130\u0131\7h\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b\22"+
		"\17\2\u0133$\3\2\2\2\u0134\u0135\7g\2\2\u0135\u0136\7n\2\2\u0136\u0137"+
		"\7u\2\2\u0137\u0138\7g\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b\23\20\2\u013a"+
		"&\3\2\2\2\u013b\u013c\7g\2\2\u013c\u013d\7n\2\2\u013d\u013e\7u\2\2\u013e"+
		"\u013f\7k\2\2\u013f\u0140\7h\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b\24"+
		"\21\2\u0142(\3\2\2\2\u0143\u0144\7v\2\2\u0144\u0145\7j\2\2\u0145\u0146"+
		"\7g\2\2\u0146\u0147\7p\2\2\u0147\u0148\3\2\2\2\u0148\u0149\b\25\22\2\u0149"+
		"*\3\2\2\2\u014a\u014b\7u\2\2\u014b\u014c\7y\2\2\u014c\u014d\7k\2\2\u014d"+
		"\u014e\7v\2\2\u014e\u014f\7e\2\2\u014f\u0150\7j\2\2\u0150\u0151\3\2\2"+
		"\2\u0151\u0152\b\26\23\2\u0152,\3\2\2\2\u0153\u0154\7e\2\2\u0154\u0155"+
		"\7c\2\2\u0155\u0156\7u\2\2\u0156\u0157\7g\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\b\27\24\2\u0159.\3\2\2\2\u015a\u015b\7d\2\2\u015b\u015c\7t\2\2"+
		"\u015c\u015d\7g\2\2\u015d\u015e\7c\2\2\u015e\u015f\7m\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\b\30\25\2\u0161\60\3\2\2\2\u0162\u0163\7f\2\2\u0163"+
		"\u0164\7g\2\2\u0164\u0165\7h\2\2\u0165\u0166\7c\2\2\u0166\u0167\7w\2\2"+
		"\u0167\u0168\7n\2\2\u0168\u0169\7v\2\2\u0169\u016a\3\2\2\2\u016a\u016b"+
		"\b\31\26\2\u016b\62\3\2\2\2\u016c\u016d\7y\2\2\u016d\u016e\7j\2\2\u016e"+
		"\u016f\7k\2\2\u016f\u0170\7n\2\2\u0170\u0171\7g\2\2\u0171\u0172\3\2\2"+
		"\2\u0172\u0173\b\32\27\2\u0173\64\3\2\2\2\u0174\u0175\7f\2\2\u0175\u0176"+
		"\7q\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b\33\30\2\u0178\66\3\2\2\2\u0179"+
		"\u017a\7h\2\2\u017a\u017b\7q\2\2\u017b\u017c\7t\2\2\u017c\u017d\3\2\2"+
		"\2\u017d\u017e\b\34\31\2\u017e8\3\2\2\2\u017f\u0180\7h\2\2\u0180\u0181"+
		"\7t\2\2\u0181\u0182\7q\2\2\u0182\u0183\7o\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\b\35\32\2\u0185:\3\2\2\2\u0186\u0187\7v\2\2\u0187\u0188\7q\2\2"+
		"\u0188\u0189\3\2\2\2\u0189\u018a\b\36\33\2\u018a<\3\2\2\2\u018b\u018c"+
		"\7u\2\2\u018c\u018d\7v\2\2\u018d\u018e\7g\2\2\u018e\u018f\7r\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\b\37\34\2\u0191>\3\2\2\2\u0192\u0193\7C\2\2"+
		"\u0193\u0194\7P\2\2\u0194\u0195\7F\2\2\u0195\u0196\3\2\2\2\u0196\u0197"+
		"\b \35\2\u0197@\3\2\2\2\u0198\u0199\7Q\2\2\u0199\u019a\7T\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019c\b!\36\2\u019cB\3\2\2\2\u019d\u019e\7n\2\2\u019e\u019f"+
		"\7g\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\b\"\37\2\u01a2"+
		"D\3\2\2\2\u01a3\u01a4\7B\2\2\u01a4\u01a5\7f\2\2\u01a5\u01a6\7g\2\2\u01a6"+
		"\u01a7\7h\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7g\2\2"+
		"\u01aa\u01ab\3\2\2\2\u01ab\u01ac\b# \2\u01acF\3\2\2\2\u01ad\u01ae\7E\2"+
		"\2\u01ae\u01af\7q\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7u\2\2\u01b1\u01b2"+
		"\7v\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\b$!\2\u01b4H\3\2\2\2\u01b5\u01b7"+
		"\5\5\3\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01cc\3\2\2\2\u01ba\u01bc\5\t\5\2\u01bb\u01ba\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c7\3\2\2\2\u01bf\u01c1\7a\2\2\u01c0\u01c2\5\t\5\2\u01c1\u01c0\3\2"+
		"\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca"+
		"\u01bb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cdJ\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\5\17\b\2\u01d0\u01d1"+
		"\b&\"\2\u01d1\u01d9\3\2\2\2\u01d2\u01d3\7*\2\2\u01d3\u01d4\5\3\2\2\u01d4"+
		"\u01d5\5\17\b\2\u01d5\u01d6\7+\2\2\u01d6\u01d7\b&#\2\u01d7\u01d9\3\2\2"+
		"\2\u01d8\u01cf\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d9L\3\2\2\2\u01da\u01db"+
		"\5\21\t\2\u01db\u01dc\b\'$\2\u01dc\u01e4\3\2\2\2\u01dd\u01de\7*\2\2\u01de"+
		"\u01df\5\3\2\2\u01df\u01e0\5M\'\2\u01e0\u01e1\7+\2\2\u01e1\u01e2\b\'%"+
		"\2\u01e2\u01e4\3\2\2\2\u01e3\u01da\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e4N"+
		"\3\2\2\2\u01e5\u01e9\7$\2\2\u01e6\u01e8\n\6\2\2\u01e7\u01e6\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2"+
		"\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7$\2\2\u01ed\u01ee\b(&\2\u01eeP\3"+
		"\2\2\2\u01ef\u01f3\7)\2\2\u01f0\u01f2\n\7\2\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7)\2\2\u01f7\u01f8\b)\'\2\u01f8R"+
		"\3\2\2\2\u01f9\u01fa\7<\2\2\u01fa\u01fb\7?\2\2\u01fbT\3\2\2\2\u01fc\u01fd"+
		"\7#\2\2\u01fdV\3\2\2\2\u01fe\u01ff\7@\2\2\u01ffX\3\2\2\2\u0200\u0201\7"+
		">\2\2\u0201Z\3\2\2\2\u0202\u0203\7@\2\2\u0203\u0204\7?\2\2\u0204\\\3\2"+
		"\2\2\u0205\u0206\7>\2\2\u0206\u0207\7?\2\2\u0207^\3\2\2\2\u0208\u0209"+
		"\7?\2\2\u0209\u020a\7?\2\2\u020a`\3\2\2\2\u020b\u020c\7#\2\2\u020c\u020d"+
		"\7?\2\2\u020db\3\2\2\2\u020e\u020f\7}\2\2\u020fd\3\2\2\2\u0210\u0211\7"+
		"\177\2\2\u0211f\3\2\2\2\u0212\u0213\7-\2\2\u0213h\3\2\2\2\u0214\u0215"+
		"\7/\2\2\u0215j\3\2\2\2\u0216\u0217\7,\2\2\u0217l\3\2\2\2\u0218\u0219\7"+
		"\61\2\2\u0219n\3\2\2\2\u021a\u021b\7.\2\2\u021bp\3\2\2\2\u021c\u021d\7"+
		"=\2\2\u021dr\3\2\2\2\u021e\u021f\7]\2\2\u021ft\3\2\2\2\u0220\u0221\7_"+
		"\2\2\u0221v\3\2\2\2\u0222\u0223\7*\2\2\u0223x\3\2\2\2\u0224\u0225\7+\2"+
		"\2\u0225z\3\2\2\2\u0226\u0227\7?\2\2\u0227|\3\2\2\2\u0228\u0229\7<\2\2"+
		"\u0229~\3\2\2\2\u022a\u022d\5\r\7\2\u022b\u022d\5\13\6\2\u022c\u022a\3"+
		"\2\2\2\u022c\u022b\3\2\2\2\u022d\u0080\3\2\2\2\u022e\u0230\t\b\2\2\u022f"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232\u0233\3\2\2\2\u0233\u0234\bA(\2\u0234\u0082\3\2\2\2\u0235\u0236"+
		"\13\2\2\2\u0236\u0084\3\2\2\2\31\2\u008d\u0096\u00a4\u00ae\u00b3\u00b9"+
		"\u00bf\u00c4\u00c8\u00d7\u010a\u01b8\u01bd\u01c3\u01c7\u01cc\u01d8\u01e3"+
		"\u01e9\u01f3\u022c\u0231)\3\n\2\3\n\3\3\13\4\3\f\5\3\r\6\3\r\7\3\r\b\3"+
		"\r\t\3\r\n\3\16\13\3\17\f\3\20\r\3\21\16\3\22\17\3\23\20\3\24\21\3\25"+
		"\22\3\26\23\3\27\24\3\30\25\3\31\26\3\32\27\3\33\30\3\34\31\3\35\32\3"+
		"\36\33\3\37\34\3 \35\3!\36\3\"\37\3# \3$!\3&\"\3&#\3\'$\3\'%\3(&\3)\'"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}