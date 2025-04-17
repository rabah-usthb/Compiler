// Generated from Expr.g4 by ANTLR 4.7.2

  package application.antlr;
  import application.antlr.SymboleTable.IDF_HashTable;
  import application.antlr.SymboleTable.Constant_Hashtable;
  import application.antlr.SymboleTable.Keywords_Hashtable;

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
			"SIGN", "LETTER", "DIGIT", "ALPHANUMERICAL", "INTEGER", "FLOATED", "INLINECOMMENT", 
			"MULTILINECOMMENT", "BOOLEANVALUE", "INPUT", "OUTPUT", "TYPE", "MAIN", 
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


	    {
	     printLexerConsole.console.nb = 0;
	     printLexerConsole.console.output.setLength(0);
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
		case 40:
			CONCAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			AFFECT_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			NOT_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			GREATER_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			LESSER_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			GEQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			LEQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			EQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			NEQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			LBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			RBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			PLUS_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			SUB_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			MUL_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			DIV_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			COM_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			SEMI_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			LBRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			RBRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			LPAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 60:
			RPAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
			ASSIGN_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			TWOPOINT_action((RuleContext)_localctx, actionIndex);
			break;
		case 63:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BOOLEANVALUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine());  Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Boolean Value");
			break;
		}
	}
	private void INPUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine());  Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Read Function");
			break;
		}
	}
	private void OUTPUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Print Function");
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");
			break;
		}
	}
	private void MAIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainProgram Header");
			break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Variable Block Delimiter");
			break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainCode Delimiter");
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainCode Delimiter");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"If Keyword");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Else Keyword");
			break;
		}
	}
	private void ELSIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Else If Keyword");
			break;
		}
	}
	private void THEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Then Keyword");
			break;
		}
	}
	private void SWITCH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Switch Keyword");
			break;
		}
	}
	private void CASE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Case Delimiter");
			break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Case Delimiter");
			break;
		}
	}
	private void DEFAULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Default Case Delimiter");
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");
			break;
		}
	}
	private void DO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");
			break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");
			break;
		}
	}
	private void FROM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"From Keyword");
			break;
		}
	}
	private void TO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"To Keyword");
			break;
		}
	}
	private void STEP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Step Keyword");
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Logical AND");
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Logical OR");
			break;
		}
	}
	private void LET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Variable Declarator");
			break;
		}
	}
	private void DEFINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Constant Declarator");
			break;
		}
	}
	private void CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Constant Declarator");
			break;
		}
	}
	private void IDF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			 printLexerConsole.console.printIDF(getText(),getLine(),getCharPositionInLine()); IDF_HashTable.table.insertFirst(getText(),getLine(),getCharPositionInLine());
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:
			printLexerConsole.console.printConstant(getText(),"int",getLine(),getCharPositionInLine()); Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:
			printLexerConsole.console.printConstant(getText(),"float",getLine(),getCharPositionInLine()); Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:
			printLexerConsole.console.printConstant(getText(),"string",getLine(),getCharPositionInLine()); Constant_Hashtable.ConstantTable.insertTable(getText(),"string",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:
			printLexerConsole.console.printConstant(getText(),"char",getLine(),getCharPositionInLine()); Constant_Hashtable.ConstantTable.insertTable(getText(),"char",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void CONCAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void AFFECT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void GREATER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void LESSER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void GEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void LEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void EQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void NEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void LBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void RBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void PLUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void SUB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void MUL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void COM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void SEMI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void LBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 49:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void RBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 50:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void LPAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 51:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void RPAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 52:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 53:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void TWOPOINT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 54:
			printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 55:
			printLexerConsole.console.printToken(getText(),"Comment",getLine(),getCharPositionInLine());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u024f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5"+
		"\5\u0090\n\5\3\6\6\6\u0093\n\6\r\6\16\6\u0094\3\7\6\7\u0098\n\7\r\7\16"+
		"\7\u0099\3\7\3\7\6\7\u009e\n\7\r\7\16\7\u009f\3\7\3\7\6\7\u00a4\n\7\r"+
		"\7\16\7\u00a5\3\7\6\7\u00a9\n\7\r\7\16\7\u00aa\3\7\3\7\5\7\u00af\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7\13\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d6\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0101\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\6%\u01af\n%\r%\16%\u01b0"+
		"\3%\7%\u01b4\n%\f%\16%\u01b7\13%\3%\3%\6%\u01bb\n%\r%\16%\u01bc\7%\u01bf"+
		"\n%\f%\16%\u01c2\13%\5%\u01c4\n%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u01ce\n&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01d8\n\'\3\'\3\'\3(\3(\7(\u01de\n(\f"+
		"(\16(\u01e1\13(\3(\3(\3(\3)\3)\7)\u01e8\n)\f)\16)\u01eb\13)\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3"+
		"?\3?\3?\3@\3@\3@\3A\3A\5A\u0241\nA\3A\3A\3A\3A\3B\6B\u0248\nB\rB\16B\u0249"+
		"\3B\3B\3C\3C\4\u00b7\u00c5\2D\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\3"+
		"\25\4\27\5\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/\21\61\22\63"+
		"\23\65\24\67\259\26;\27=\30?\31A\32C\33E\34G\35I\36K\37M O!Q\"S#U$W%Y"+
		"&[\'](_)a*c+e,g-i.k/m\60o\61q\62s\63u\64w\65y\66{\67}8\1779\u0081:\u0083"+
		";\u0085<\3\2\t\4\2--//\4\2C\\c|\3\2\62;\3\2\f\f\4\2\f\f$$\4\2\f\f))\5"+
		"\2\13\f\17\17\"\"\2\u0260\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\3\u0087\3\2\2\2\5\u0089\3\2\2\2\7\u008b\3\2\2\2\t\u008f\3\2\2"+
		"\2\13\u0092\3\2\2\2\r\u00ae\3\2\2\2\17\u00b0\3\2\2\2\21\u00be\3\2\2\2"+
		"\23\u00d5\3\2\2\2\25\u00d9\3\2\2\2\27\u00e1\3\2\2\2\31\u0100\3\2\2\2\33"+
		"\u0104\3\2\2\2\35\u010f\3\2\2\2\37\u0115\3\2\2\2!\u011f\3\2\2\2#\u0127"+
		"\3\2\2\2%\u012c\3\2\2\2\'\u0133\3\2\2\2)\u013b\3\2\2\2+\u0142\3\2\2\2"+
		"-\u014b\3\2\2\2/\u0152\3\2\2\2\61\u015a\3\2\2\2\63\u0164\3\2\2\2\65\u016c"+
		"\3\2\2\2\67\u0171\3\2\2\29\u0177\3\2\2\2;\u017e\3\2\2\2=\u0183\3\2\2\2"+
		"?\u018a\3\2\2\2A\u0190\3\2\2\2C\u0195\3\2\2\2E\u019b\3\2\2\2G\u01a5\3"+
		"\2\2\2I\u01ae\3\2\2\2K\u01cd\3\2\2\2M\u01d7\3\2\2\2O\u01db\3\2\2\2Q\u01e5"+
		"\3\2\2\2S\u01ef\3\2\2\2U\u01f2\3\2\2\2W\u01f7\3\2\2\2Y\u01fa\3\2\2\2["+
		"\u01fd\3\2\2\2]\u0200\3\2\2\2_\u0205\3\2\2\2a\u020a\3\2\2\2c\u020f\3\2"+
		"\2\2e\u0214\3\2\2\2g\u0217\3\2\2\2i\u021a\3\2\2\2k\u021d\3\2\2\2m\u0220"+
		"\3\2\2\2o\u0223\3\2\2\2q\u0226\3\2\2\2s\u0229\3\2\2\2u\u022c\3\2\2\2w"+
		"\u022f\3\2\2\2y\u0232\3\2\2\2{\u0235\3\2\2\2}\u0238\3\2\2\2\177\u023b"+
		"\3\2\2\2\u0081\u0240\3\2\2\2\u0083\u0247\3\2\2\2\u0085\u024d\3\2\2\2\u0087"+
		"\u0088\t\2\2\2\u0088\4\3\2\2\2\u0089\u008a\t\3\2\2\u008a\6\3\2\2\2\u008b"+
		"\u008c\t\4\2\2\u008c\b\3\2\2\2\u008d\u0090\5\5\3\2\u008e\u0090\5\7\4\2"+
		"\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\n\3\2\2\2\u0091\u0093\5"+
		"\7\4\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\f\3\2\2\2\u0096\u0098\5\7\4\2\u0097\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009d\7\60\2\2\u009c\u009e\5\7\4\2\u009d\u009c\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00af"+
		"\3\2\2\2\u00a1\u00a3\7\60\2\2\u00a2\u00a4\5\7\4\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00af"+
		"\3\2\2\2\u00a7\u00a9\5\7\4\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\60"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u0097\3\2\2\2\u00ae\u00a1\3\2\2\2\u00ae"+
		"\u00a8\3\2\2\2\u00af\16\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b2\7#\2\2"+
		"\u00b2\u00b3\7/\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6\n\5\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb\u00bc\7#\2"+
		"\2\u00bc\u00bd\7@\2\2\u00bd\20\3\2\2\2\u00be\u00bf\7}\2\2\u00bf\u00c0"+
		"\7/\2\2\u00c0\u00c1\7/\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\13\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9"+
		"\u00ca\7/\2\2\u00ca\u00cb\7\177\2\2\u00cb\22\3\2\2\2\u00cc\u00cd\7V\2"+
		"\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d6\7g\2\2\u00d0\u00d1"+
		"\7H\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2\u00d4"+
		"\u00d6\7g\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d8\b\n\2\2\u00d8\24\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db"+
		"\7p\2\2\u00db\u00dc\7r\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\b\13\3\2\u00e0\26\3\2\2\2\u00e1\u00e2\7q\2"+
		"\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6"+
		"\7w\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\f\4\2\u00e9"+
		"\30\3\2\2\2\u00ea\u00eb\7K\2\2\u00eb\u00ec\7p\2\2\u00ec\u0101\7v\2\2\u00ed"+
		"\u00ee\7H\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7c\2\2"+
		"\u00f1\u0101\7v\2\2\u00f2\u00f3\7D\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5"+
		"\7q\2\2\u00f5\u0101\7n\2\2\u00f6\u00f7\7U\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb\u0101\7i\2\2"+
		"\u00fc\u00fd\7E\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff\7c\2\2\u00ff\u0101"+
		"\7t\2\2\u0100\u00ea\3\2\2\2\u0100\u00ed\3\2\2\2\u0100\u00f2\3\2\2\2\u0100"+
		"\u00f6\3\2\2\2\u0100\u00fc\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b\r"+
		"\5\2\u0103\32\3\2\2\2\u0104\u0105\7O\2\2\u0105\u0106\7c\2\2\u0106\u0107"+
		"\7k\2\2\u0107\u0108\7p\2\2\u0108\u0109\7R\2\2\u0109\u010a\7t\2\2\u010a"+
		"\u010b\7i\2\2\u010b\u010c\7o\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b\16"+
		"\6\2\u010e\34\3\2\2\2\u010f\u0110\7X\2\2\u0110\u0111\7c\2\2\u0111\u0112"+
		"\7t\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b\17\7\2\u0114\36\3\2\2\2\u0115"+
		"\u0116\7D\2\2\u0116\u0117\7g\2\2\u0117\u0118\7i\2\2\u0118\u0119\7k\2\2"+
		"\u0119\u011a\7p\2\2\u011a\u011b\7R\2\2\u011b\u011c\7i\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\b\20\b\2\u011e \3\2\2\2\u011f\u0120\7G\2\2\u0120"+
		"\u0121\7p\2\2\u0121\u0122\7f\2\2\u0122\u0123\7R\2\2\u0123\u0124\7i\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0126\b\21\t\2\u0126\"\3\2\2\2\u0127\u0128"+
		"\7k\2\2\u0128\u0129\7h\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b\22\n\2\u012b"+
		"$\3\2\2\2\u012c\u012d\7g\2\2\u012d\u012e\7n\2\2\u012e\u012f\7u\2\2\u012f"+
		"\u0130\7g\2\2\u0130\u0131\3\2\2\2\u0131\u0132\b\23\13\2\u0132&\3\2\2\2"+
		"\u0133\u0134\7g\2\2\u0134\u0135\7n\2\2\u0135\u0136\7u\2\2\u0136\u0137"+
		"\7k\2\2\u0137\u0138\7h\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b\24\f\2\u013a"+
		"(\3\2\2\2\u013b\u013c\7v\2\2\u013c\u013d\7j\2\2\u013d\u013e\7g\2\2\u013e"+
		"\u013f\7p\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\25\r\2\u0141*\3\2\2\2"+
		"\u0142\u0143\7u\2\2\u0143\u0144\7y\2\2\u0144\u0145\7k\2\2\u0145\u0146"+
		"\7v\2\2\u0146\u0147\7e\2\2\u0147\u0148\7j\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\b\26\16\2\u014a,\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d\7c\2\2"+
		"\u014d\u014e\7u\2\2\u014e\u014f\7g\2\2\u014f\u0150\3\2\2\2\u0150\u0151"+
		"\b\27\17\2\u0151.\3\2\2\2\u0152\u0153\7d\2\2\u0153\u0154\7t\2\2\u0154"+
		"\u0155\7g\2\2\u0155\u0156\7c\2\2\u0156\u0157\7m\2\2\u0157\u0158\3\2\2"+
		"\2\u0158\u0159\b\30\20\2\u0159\60\3\2\2\2\u015a\u015b\7f\2\2\u015b\u015c"+
		"\7g\2\2\u015c\u015d\7h\2\2\u015d\u015e\7c\2\2\u015e\u015f\7w\2\2\u015f"+
		"\u0160\7n\2\2\u0160\u0161\7v\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b\31"+
		"\21\2\u0163\62\3\2\2\2\u0164\u0165\7y\2\2\u0165\u0166\7j\2\2\u0166\u0167"+
		"\7k\2\2\u0167\u0168\7n\2\2\u0168\u0169\7g\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016b\b\32\22\2\u016b\64\3\2\2\2\u016c\u016d\7f\2\2\u016d\u016e\7q\2"+
		"\2\u016e\u016f\3\2\2\2\u016f\u0170\b\33\23\2\u0170\66\3\2\2\2\u0171\u0172"+
		"\7h\2\2\u0172\u0173\7q\2\2\u0173\u0174\7t\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\b\34\24\2\u01768\3\2\2\2\u0177\u0178\7h\2\2\u0178\u0179\7t\2\2"+
		"\u0179\u017a\7q\2\2\u017a\u017b\7o\2\2\u017b\u017c\3\2\2\2\u017c\u017d"+
		"\b\35\25\2\u017d:\3\2\2\2\u017e\u017f\7v\2\2\u017f\u0180\7q\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\b\36\26\2\u0182<\3\2\2\2\u0183\u0184\7u\2\2"+
		"\u0184\u0185\7v\2\2\u0185\u0186\7g\2\2\u0186\u0187\7r\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0189\b\37\27\2\u0189>\3\2\2\2\u018a\u018b\7C\2\2\u018b"+
		"\u018c\7P\2\2\u018c\u018d\7F\2\2\u018d\u018e\3\2\2\2\u018e\u018f\b \30"+
		"\2\u018f@\3\2\2\2\u0190\u0191\7Q\2\2\u0191\u0192\7T\2\2\u0192\u0193\3"+
		"\2\2\2\u0193\u0194\b!\31\2\u0194B\3\2\2\2\u0195\u0196\7n\2\2\u0196\u0197"+
		"\7g\2\2\u0197\u0198\7v\2\2\u0198\u0199\3\2\2\2\u0199\u019a\b\"\32\2\u019a"+
		"D\3\2\2\2\u019b\u019c\7B\2\2\u019c\u019d\7f\2\2\u019d\u019e\7g\2\2\u019e"+
		"\u019f\7h\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2\7g\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b#\33\2\u01a4F\3\2\2\2\u01a5\u01a6\7"+
		"E\2\2\u01a6\u01a7\7q\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7u\2\2\u01a9\u01aa"+
		"\7v\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\b$\34\2\u01acH\3\2\2\2\u01ad\u01af"+
		"\5\5\3\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01c3\3\2\2\2\u01b2\u01b4\5\t\5\2\u01b3\u01b2\3\2"+
		"\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01c0\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\7a\2\2\u01b9\u01bb\5\t"+
		"\5\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01b8\3\2\2\2\u01bf\u01c2\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01b5\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c6\b%\35\2\u01c6J\3\2\2\2\u01c7\u01c8\7*\2\2\u01c8\u01c9"+
		"\5\3\2\2\u01c9\u01ca\5\13\6\2\u01ca\u01cb\7+\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ce\5\13\6\2\u01cd\u01c7\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3"+
		"\2\2\2\u01cf\u01d0\b&\36\2\u01d0L\3\2\2\2\u01d1\u01d2\7*\2\2\u01d2\u01d3"+
		"\5\3\2\2\u01d3\u01d4\5\r\7\2\u01d4\u01d5\7+\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d8\5\r\7\2\u01d7\u01d1\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\b\'\37\2\u01daN\3\2\2\2\u01db\u01df\7$\2\2\u01dc\u01de"+
		"\n\6\2\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7$"+
		"\2\2\u01e3\u01e4\b( \2\u01e4P\3\2\2\2\u01e5\u01e9\7)\2\2\u01e6\u01e8\n"+
		"\7\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7)"+
		"\2\2\u01ed\u01ee\b)!\2\u01eeR\3\2\2\2\u01ef\u01f0\7\60\2\2\u01f0\u01f1"+
		"\b*\"\2\u01f1T\3\2\2\2\u01f2\u01f3\7<\2\2\u01f3\u01f4\7?\2\2\u01f4\u01f5"+
		"\3\2\2\2\u01f5\u01f6\b+#\2\u01f6V\3\2\2\2\u01f7\u01f8\7#\2\2\u01f8\u01f9"+
		"\b,$\2\u01f9X\3\2\2\2\u01fa\u01fb\7@\2\2\u01fb\u01fc\b-%\2\u01fcZ\3\2"+
		"\2\2\u01fd\u01fe\7>\2\2\u01fe\u01ff\b.&\2\u01ff\\\3\2\2\2\u0200\u0201"+
		"\7@\2\2\u0201\u0202\7?\2\2\u0202\u0203\3\2\2\2\u0203\u0204\b/\'\2\u0204"+
		"^\3\2\2\2\u0205\u0206\7>\2\2\u0206\u0207\7?\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\b\60(\2\u0209`\3\2\2\2\u020a\u020b\7?\2\2\u020b\u020c\7?\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\b\61)\2\u020eb\3\2\2\2\u020f\u0210\7#\2\2\u0210"+
		"\u0211\7?\2\2\u0211\u0212\3\2\2\2\u0212\u0213\b\62*\2\u0213d\3\2\2\2\u0214"+
		"\u0215\7}\2\2\u0215\u0216\b\63+\2\u0216f\3\2\2\2\u0217\u0218\7\177\2\2"+
		"\u0218\u0219\b\64,\2\u0219h\3\2\2\2\u021a\u021b\7-\2\2\u021b\u021c\b\65"+
		"-\2\u021cj\3\2\2\2\u021d\u021e\7/\2\2\u021e\u021f\b\66.\2\u021fl\3\2\2"+
		"\2\u0220\u0221\7,\2\2\u0221\u0222\b\67/\2\u0222n\3\2\2\2\u0223\u0224\7"+
		"\61\2\2\u0224\u0225\b8\60\2\u0225p\3\2\2\2\u0226\u0227\7.\2\2\u0227\u0228"+
		"\b9\61\2\u0228r\3\2\2\2\u0229\u022a\7=\2\2\u022a\u022b\b:\62\2\u022bt"+
		"\3\2\2\2\u022c\u022d\7]\2\2\u022d\u022e\b;\63\2\u022ev\3\2\2\2\u022f\u0230"+
		"\7_\2\2\u0230\u0231\b<\64\2\u0231x\3\2\2\2\u0232\u0233\7*\2\2\u0233\u0234"+
		"\b=\65\2\u0234z\3\2\2\2\u0235\u0236\7+\2\2\u0236\u0237\b>\66\2\u0237|"+
		"\3\2\2\2\u0238\u0239\7?\2\2\u0239\u023a\b?\67\2\u023a~\3\2\2\2\u023b\u023c"+
		"\7<\2\2\u023c\u023d\b@8\2\u023d\u0080\3\2\2\2\u023e\u0241\5\21\t\2\u023f"+
		"\u0241\5\17\b\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241\u0242\3"+
		"\2\2\2\u0242\u0243\bA9\2\u0243\u0244\3\2\2\2\u0244\u0245\bA:\2\u0245\u0082"+
		"\3\2\2\2\u0246\u0248\t\b\2\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\bB"+
		";\2\u024c\u0084\3\2\2\2\u024d\u024e\13\2\2\2\u024e\u0086\3\2\2\2\31\2"+
		"\u008f\u0094\u0099\u009f\u00a5\u00aa\u00ae\u00b7\u00c5\u00d5\u0100\u01b0"+
		"\u01b5\u01bc\u01c0\u01c3\u01cd\u01d7\u01df\u01e9\u0240\u0249<\3\n\2\3"+
		"\13\3\3\f\4\3\r\5\3\16\6\3\17\7\3\20\b\3\21\t\3\22\n\3\23\13\3\24\f\3"+
		"\25\r\3\26\16\3\27\17\3\30\20\3\31\21\3\32\22\3\33\23\3\34\24\3\35\25"+
		"\3\36\26\3\37\27\3 \30\3!\31\3\"\32\3#\33\3$\34\3%\35\3&\36\3\'\37\3("+
		" \3)!\3*\"\3+#\3,$\3-%\3.&\3/\'\3\60(\3\61)\3\62*\3\63+\3\64,\3\65-\3"+
		"\66.\3\67/\38\60\39\61\3:\62\3;\63\3<\64\3=\65\3>\66\3?\67\3@8\3A9\2\3"+
		"\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}