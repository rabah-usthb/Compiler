package application.antlr;

// Generated from Expr.g4 by ANTLR 4.7.2

  import java.util.HashMap;
  import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import application.antlr.SymboleTable.IDF_HashTable;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_varBlock = 1, RULE_declaration = 2, RULE_listIDF = 3, 
		RULE_normalDeclaration = 4, RULE_affectValue = 5, RULE_number = 6, RULE_arrayDeclaration = 7, 
		RULE_affectArray = 8, RULE_declarationKeyword = 9, RULE_listValue = 10, 
		RULE_value = 11, RULE_mainCode = 12, RULE_inst = 13, RULE_input = 14, 
		RULE_output = 15, RULE_content = 16, RULE_affectInst = 17, RULE_concatInst = 18, 
		RULE_arithmeticExpression = 19, RULE_operator = 20, RULE_var = 21, RULE_forInst = 22, 
		RULE_doWhileInst = 23, RULE_whileInst = 24, RULE_ifInst = 25, RULE_elseIfInst = 26, 
		RULE_elseInst = 27, RULE_switchInst = 28, RULE_caseInst = 29, RULE_defaultInst = 30, 
		RULE_condition = 31, RULE_partCondition = 32, RULE_comparaisonOperator = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "varBlock", "declaration", "listIDF", "normalDeclaration", "affectValue", 
			"number", "arrayDeclaration", "affectArray", "declarationKeyword", "listValue", 
			"value", "mainCode", "inst", "input", "output", "content", "affectInst", 
			"concatInst", "arithmeticExpression", "operator", "var", "forInst", "doWhileInst", 
			"whileInst", "ifInst", "elseIfInst", "elseInst", "switchInst", "caseInst", 
			"defaultInst", "condition", "partCondition", "comparaisonOperator"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static final LinkedHashSet<String> types = new LinkedHashSet<>();
	   public static final LinkedHashSet<String> boolTypes = new LinkedHashSet<>();
	   public static final LinkedHashSet<String> comTypes = new LinkedHashSet<>();

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(ExprParser.MAIN, 0); }
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public MainCodeContext mainCode() {
			return getRuleContext(MainCodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(ExprParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ExprParser.COMMENT, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(68);
				match(COMMENT);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(MAIN);
			setState(75);
			match(IDF);
			setState(76);
			match(SEMI);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(77);
				match(COMMENT);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			varBlock();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(84);
				match(COMMENT);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			mainCode();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(91);
				match(COMMENT);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarBlockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public VarBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVarBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVarBlock(this);
		}
	}

	public final VarBlockContext varBlock() throws RecognitionException {
		VarBlockContext _localctx = new VarBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varBlock);
		try {
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(VAR);
				setState(101); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(100);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(103); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(VAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public NormalDeclarationContext normalDeclaration() {
			return getRuleContext(NormalDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ExprParser.COMMENT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				normalDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(COMMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListIDFContext extends ParserRuleContext {
		public List<TerminalNode> IDF() { return getTokens(ExprParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(ExprParser.IDF, i);
		}
		public List<TerminalNode> COM() { return getTokens(ExprParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(ExprParser.COM, i);
		}
		public ListIDFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listIDF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterListIDF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitListIDF(this);
		}
	}

	public final ListIDFContext listIDF() throws RecognitionException {
		ListIDFContext _localctx = new ListIDFContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listIDF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IDF);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(114);
				match(COM);
				setState(115);
				match(IDF);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalDeclarationContext extends ParserRuleContext {
		public DeclarationKeywordContext declarationKeyword;
		public ListIDFContext listIDF;
		public Token TYPE;
		public ValueContext value;
		public DeclarationKeywordContext declarationKeyword() {
			return getRuleContext(DeclarationKeywordContext.class,0);
		}
		public ListIDFContext listIDF() {
			return getRuleContext(ListIDFContext.class,0);
		}
		public TerminalNode TWOPOINT() { return getToken(ExprParser.TWOPOINT, 0); }
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(ExprParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public NormalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNormalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNormalDeclaration(this);
		}
	}

	public final NormalDeclarationContext normalDeclaration() throws RecognitionException {
		NormalDeclarationContext _localctx = new NormalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_normalDeclaration);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((NormalDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(122);
				((NormalDeclarationContext)_localctx).listIDF = listIDF();
				setState(123);
				match(TWOPOINT);
				setState(124);
				((NormalDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(125);
				match(ASSIGN);
				setState(126);
				((NormalDeclarationContext)_localctx).value = value();
				setState(127);
				match(SEMI);

				    for (var idf : ((NormalDeclarationContext)_localctx).listIDF.getTokens(IDF)) { 
				        IDF_HashTable.table.updateTypeValue(idf.getText(), ((NormalDeclarationContext)_localctx).declarationKeyword.mul ,(((NormalDeclarationContext)_localctx).TYPE!=null?((NormalDeclarationContext)_localctx).TYPE.getText():null),(((NormalDeclarationContext)_localctx).value!=null?_input.getText(((NormalDeclarationContext)_localctx).value.start,((NormalDeclarationContext)_localctx).value.stop):null),((NormalDeclarationContext)_localctx).value.type,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				((NormalDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(131);
				((NormalDeclarationContext)_localctx).listIDF = listIDF();
				setState(132);
				match(TWOPOINT);
				setState(133);
				((NormalDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(134);
				match(SEMI);

				        for (var idf : ((NormalDeclarationContext)_localctx).listIDF.getTokens(IDF)) { 
				        IDF_HashTable.table.updateType(idf.getText(), ((NormalDeclarationContext)_localctx).declarationKeyword.mul ,(((NormalDeclarationContext)_localctx).TYPE!=null?((NormalDeclarationContext)_localctx).TYPE.getText():null),idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
				    }
				       
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffectValueContext extends ParserRuleContext {
		public String type;
		public NumberContext number;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(ExprParser.CHAR, 0); }
		public AffectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAffectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAffectValue(this);
		}
	}

	public final AffectValueContext affectValue() throws RecognitionException {
		AffectValueContext _localctx = new AffectValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_affectValue);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				((AffectValueContext)_localctx).number = number();
				((AffectValueContext)_localctx).type =  ((AffectValueContext)_localctx).number.type;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(STRING);
				((AffectValueContext)_localctx).type =  "STRING";
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(CHAR);
				((AffectValueContext)_localctx).type =  "CHAR";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public String type;
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(INT);
				 ((NumberContext)_localctx).type =  "INT"; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(FLOAT);
				 ((NumberContext)_localctx).type =  "FLOAT"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public DeclarationKeywordContext declarationKeyword;
		public ListIDFContext listIDF;
		public Token TYPE;
		public Token INT;
		public ListValueContext listValue;
		public DeclarationKeywordContext declarationKeyword() {
			return getRuleContext(DeclarationKeywordContext.class,0);
		}
		public ListIDFContext listIDF() {
			return getRuleContext(ListIDFContext.class,0);
		}
		public TerminalNode TWOPOINT() { return getToken(ExprParser.TWOPOINT, 0); }
		public TerminalNode LBRACKET() { return getToken(ExprParser.LBRACKET, 0); }
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ExprParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ExprParser.SEMI, i);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode RBRACKET() { return getToken(ExprParser.RBRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(ExprParser.ASSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public List<ListValueContext> listValue() {
			return getRuleContexts(ListValueContext.class);
		}
		public ListValueContext listValue(int i) {
			return getRuleContext(ListValueContext.class,i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArrayDeclaration(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayDeclaration);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((ArrayDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(155);
				((ArrayDeclarationContext)_localctx).listIDF = listIDF();
				setState(156);
				match(TWOPOINT);
				setState(157);
				match(LBRACKET);
				setState(158);
				((ArrayDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(159);
				match(SEMI);
				setState(160);
				((ArrayDeclarationContext)_localctx).INT = match(INT);
				setState(161);
				match(RBRACKET);
				setState(162);
				match(ASSIGN);
				setState(163);
				match(LBRACE);
				setState(164);
				match(RBRACE);
				setState(165);
				match(SEMI);

				  for (var idf : ((ArrayDeclarationContext)_localctx).listIDF.getTokens(IDF)) { 
				        IDF_HashTable.table.updateSizeTypeValue(idf.getText(), ((ArrayDeclarationContext)_localctx).declarationKeyword.mul ,(((ArrayDeclarationContext)_localctx).TYPE!=null?((ArrayDeclarationContext)_localctx).TYPE.getText():null),(((ArrayDeclarationContext)_localctx).INT!=null?((ArrayDeclarationContext)_localctx).INT.getText():null),idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
				  }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				((ArrayDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(169);
				((ArrayDeclarationContext)_localctx).listIDF = listIDF();
				setState(170);
				match(TWOPOINT);
				setState(171);
				match(LBRACKET);
				setState(172);
				((ArrayDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(173);
				match(SEMI);
				setState(174);
				((ArrayDeclarationContext)_localctx).INT = match(INT);
				setState(175);
				match(RBRACKET);
				setState(176);
				match(ASSIGN);
				setState(177);
				match(LBRACE);
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					((ArrayDeclarationContext)_localctx).listValue = listValue();
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANVALUE) | (1L << IDF) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << NOT) | (1L << LPAR))) != 0) );
				setState(183);
				match(RBRACE);
				setState(184);
				match(SEMI);

				  for (var idf : ((ArrayDeclarationContext)_localctx).listIDF.getTokens(IDF)) { 
				        IDF_HashTable.table.updateSizeTypeValue(idf.getText(), ((ArrayDeclarationContext)_localctx).declarationKeyword.mul ,(((ArrayDeclarationContext)_localctx).TYPE!=null?((ArrayDeclarationContext)_localctx).TYPE.getText():null),(((ArrayDeclarationContext)_localctx).INT!=null?((ArrayDeclarationContext)_localctx).INT.getText():null),((ArrayDeclarationContext)_localctx).listValue.values,((ArrayDeclarationContext)_localctx).listValue.types,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
				  }

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				((ArrayDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(188);
				((ArrayDeclarationContext)_localctx).listIDF = listIDF();
				setState(189);
				match(TWOPOINT);
				setState(190);
				match(LBRACKET);
				setState(191);
				((ArrayDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(192);
				match(SEMI);
				setState(193);
				((ArrayDeclarationContext)_localctx).INT = match(INT);
				setState(194);
				match(RBRACKET);
				setState(195);
				match(SEMI);

				  for (var idf : ((ArrayDeclarationContext)_localctx).listIDF.getTokens(IDF)) { 
				        IDF_HashTable.table.updateSizeType(idf.getText(), ((ArrayDeclarationContext)_localctx).declarationKeyword.mul ,(((ArrayDeclarationContext)_localctx).TYPE!=null?((ArrayDeclarationContext)_localctx).TYPE.getText():null),(((ArrayDeclarationContext)_localctx).INT!=null?((ArrayDeclarationContext)_localctx).INT.getText():null),idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
				  }

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffectArrayContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ExprParser.ASSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public List<ListValueContext> listValue() {
			return getRuleContexts(ListValueContext.class);
		}
		public ListValueContext listValue(int i) {
			return getRuleContext(ListValueContext.class,i);
		}
		public AffectArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAffectArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAffectArray(this);
		}
	}

	public final AffectArrayContext affectArray() throws RecognitionException {
		AffectArrayContext _localctx = new AffectArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_affectArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ASSIGN);
			setState(201);
			match(LBRACE);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANVALUE) | (1L << IDF) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << NOT) | (1L << LPAR))) != 0)) {
				{
				{
				setState(202);
				listValue();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationKeywordContext extends ParserRuleContext {
		public String mul;
		public TerminalNode DEFINE() { return getToken(ExprParser.DEFINE, 0); }
		public TerminalNode CONST() { return getToken(ExprParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ExprParser.LET, 0); }
		public DeclarationKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDeclarationKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDeclarationKeyword(this);
		}
	}

	public final DeclarationKeywordContext declarationKeyword() throws RecognitionException {
		DeclarationKeywordContext _localctx = new DeclarationKeywordContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarationKeyword);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(DEFINE);
				setState(211);
				match(CONST);
				((DeclarationKeywordContext)_localctx).mul =  "Constant";
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(LET);
				((DeclarationKeywordContext)_localctx).mul =  "Variable";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListValueContext extends ParserRuleContext {
		public LinkedHashSet<String> types;
		public ArrayList<String> values;
		public ValueContext v1;
		public ValueContext v;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(ExprParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(ExprParser.COM, i);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitListValue(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listValue);
		 ((ListValueContext)_localctx).types =  new LinkedHashSet<>();  ((ListValueContext)_localctx).values =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((ListValueContext)_localctx).v1 = value();
			 _localctx.types.add(((ListValueContext)_localctx).v1.type); _localctx.values.add((((ListValueContext)_localctx).v1!=null?_input.getText(((ListValueContext)_localctx).v1.start,((ListValueContext)_localctx).v1.stop):null)); 
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(219);
				match(COM);
				setState(220);
				((ListValueContext)_localctx).v = value();
				 _localctx.types.add(((ListValueContext)_localctx).v.type); _localctx.values.add((((ListValueContext)_localctx).v!=null?_input.getText(((ListValueContext)_localctx).v.start,((ListValueContext)_localctx).v.stop):null)); 
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public String type;
		public NumberContext number;
		public ConcatInstContext concatInst;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode BOOLEANVALUE() { return getToken(ExprParser.BOOLEANVALUE, 0); }
		public TerminalNode CHAR() { return getToken(ExprParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public ConcatInstContext concatInst() {
			return getRuleContext(ConcatInstContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		types.clear(); boolTypes.clear(); comTypes.clear();
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				((ValueContext)_localctx).number = number();
				((ValueContext)_localctx).type =  ((ValueContext)_localctx).number.type;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(BOOLEANVALUE);
				((ValueContext)_localctx).type =  "BOOL";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(CHAR);
				((ValueContext)_localctx).type =  "CHAR"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(STRING);
				((ValueContext)_localctx).type =  "STRING";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				condition(0);
				((ValueContext)_localctx).type =  IDF_HashTable.table.conditionType(boolTypes,comTypes);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				arithmeticExpression(0);
				((ValueContext)_localctx).type = IDF_HashTable.table.getType(types,0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				((ValueContext)_localctx).concatInst = concatInst();
				((ValueContext)_localctx).type = IDF_HashTable.table.getType(((ValueContext)_localctx).concatInst.types,1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainCodeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ExprParser.BEGIN, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public TerminalNode END() { return getToken(ExprParser.END, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(ExprParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ExprParser.COMMENT, i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public MainCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMainCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMainCode(this);
		}
	}

	public final MainCodeContext mainCode() throws RecognitionException {
		MainCodeContext _localctx = new MainCodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mainCode);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(BEGIN);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(249);
					match(COMMENT);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(LBRACE);
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(256);
					inst();
					}
					}
					setState(259); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(261);
				match(RBRACE);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(262);
					match(COMMENT);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				match(END);
				setState(269);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(BEGIN);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(272);
					match(COMMENT);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(LBRACE);
				setState(279);
				match(RBRACE);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(280);
					match(COMMENT);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(END);
				setState(287);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstContext extends ParserRuleContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public AffectInstContext affectInst() {
			return getRuleContext(AffectInstContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ExprParser.COMMENT, 0); }
		public DoWhileInstContext doWhileInst() {
			return getRuleContext(DoWhileInstContext.class,0);
		}
		public WhileInstContext whileInst() {
			return getRuleContext(WhileInstContext.class,0);
		}
		public IfInstContext ifInst() {
			return getRuleContext(IfInstContext.class,0);
		}
		public SwitchInstContext switchInst() {
			return getRuleContext(SwitchInstContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInst(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inst);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				output();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				input();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				affectInst();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(COMMENT);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				doWhileInst();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
				whileInst();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				ifInst();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				switchInst();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(ExprParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public ListIDFContext listIDF() {
			return getRuleContext(ListIDFContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(INPUT);
			setState(301);
			match(LPAR);
			setState(302);
			listIDF();
			setState(303);
			match(RPAR);
			setState(304);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(ExprParser.OUTPUT, 0); }
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(OUTPUT);
			setState(307);
			match(LPAR);
			setState(308);
			content();
			setState(309);
			match(RPAR);
			setState(310);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprParser.STRING, i);
		}
		public List<TerminalNode> IDF() { return getTokens(ExprParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(ExprParser.IDF, i);
		}
		public List<TerminalNode> COM() { return getTokens(ExprParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(ExprParser.COM, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_content);
		int _la;
		try {
			int _alt;
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(312);
						_la = _input.LA(1);
						if ( !(_la==IDF || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(313);
						match(COM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(316); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(318);
				_la = _input.LA(1);
				if ( !(_la==IDF || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				_la = _input.LA(1);
				if ( !(_la==IDF || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffectInstContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode AFFECT() { return getToken(ExprParser.AFFECT, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public ConcatInstContext concatInst() {
			return getRuleContext(ConcatInstContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public List<ListValueContext> listValue() {
			return getRuleContexts(ListValueContext.class);
		}
		public ListValueContext listValue(int i) {
			return getRuleContext(ListValueContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AffectInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAffectInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAffectInst(this);
		}
	}

	public final AffectInstContext affectInst() throws RecognitionException {
		AffectInstContext _localctx = new AffectInstContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_affectInst);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				var();
				setState(323);
				match(AFFECT);
				setState(324);
				arithmeticExpression(0);
				setState(325);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				var();
				setState(328);
				match(AFFECT);
				setState(329);
				concatInst();
				setState(330);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				var();
				setState(333);
				match(AFFECT);
				setState(334);
				match(LBRACE);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANVALUE) | (1L << IDF) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << NOT) | (1L << LPAR))) != 0)) {
					{
					{
					setState(335);
					listValue();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				match(RBRACE);
				setState(342);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				var();
				setState(345);
				match(AFFECT);
				setState(346);
				condition(0);
				setState(347);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcatInstContext extends ParserRuleContext {
		public LinkedHashSet<String> types;
		public VarContext var;
		public List<TerminalNode> STRING() { return getTokens(ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprParser.STRING, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(ExprParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(ExprParser.CHAR, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(ExprParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(ExprParser.CONCAT, i);
		}
		public ConcatInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConcatInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConcatInst(this);
		}
	}

	public final ConcatInstContext concatInst() throws RecognitionException {
		ConcatInstContext _localctx = new ConcatInstContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_concatInst);
		 ((ConcatInstContext)_localctx).types =  new LinkedHashSet<>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(351);
				match(STRING);
				_localctx.types.add("STRING");
				}
				break;
			case CHAR:
				{
				setState(353);
				match(CHAR);
				_localctx.types.add("STRING");
				}
				break;
			case IDF:
				{
				setState(355);
				((ConcatInstContext)_localctx).var = var();
				_localctx.types.add(((ConcatInstContext)_localctx).var.type);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360);
				match(CONCAT);
				{
				setState(368);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDF:
					{
					setState(361);
					((ConcatInstContext)_localctx).var = var();
					_localctx.types.add(((ConcatInstContext)_localctx).var.type);
					}
					break;
				case STRING:
					{
					setState(364);
					match(STRING);
					_localctx.types.add("STRING");
					}
					break;
				case CHAR:
					{
					setState(366);
					match(CHAR);
					_localctx.types.add("STRING");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				}
				setState(372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONCAT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public OperatorContext operator;
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ExprParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArithmeticExpression(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
			case INT:
			case FLOAT:
				{
				setState(375);
				((ArithmeticExpressionContext)_localctx).operator = operator();
				types.add(((ArithmeticExpressionContext)_localctx).operator.type);
				}
				break;
			case LPAR:
				{
				setState(378);
				match(LPAR);
				setState(379);
				arithmeticExpression(0);
				setState(380);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(390);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(384);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(385);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(386);
						arithmeticExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(387);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(388);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(389);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public String type;
		public NumberContext number;
		public VarContext var;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operator);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				((OperatorContext)_localctx).number = number();
				((OperatorContext)_localctx).type =  ((OperatorContext)_localctx).number.type;
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				((OperatorContext)_localctx).var = var();
				((OperatorContext)_localctx).type =  ((OperatorContext)_localctx).var.type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public String type;
		public Token IDF;
		public Token INT;
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public TerminalNode LBRACKET() { return getToken(ExprParser.LBRACKET, 0); }
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode RBRACKET() { return getToken(ExprParser.RBRACKET, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				((VarContext)_localctx).IDF = match(IDF);
				((VarContext)_localctx).type =  IDF_HashTable.table.getNormalTypeExpression((((VarContext)_localctx).IDF!=null?((VarContext)_localctx).IDF.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				((VarContext)_localctx).IDF = match(IDF);
				setState(406);
				match(LBRACKET);
				setState(407);
				((VarContext)_localctx).INT = match(INT);
				setState(408);
				match(RBRACKET);
				((VarContext)_localctx).type =  IDF_HashTable.table.getArrayTypeExpression((((VarContext)_localctx).IDF!=null?((VarContext)_localctx).IDF.getText():null),(((VarContext)_localctx).INT!=null?((VarContext)_localctx).INT.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInstContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ExprParser.FOR, 0); }
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public TerminalNode STEP() { return getToken(ExprParser.STEP, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ExprParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public ForInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterForInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitForInst(this);
		}
	}

	public final ForInstContext forInst() throws RecognitionException {
		ForInstContext _localctx = new ForInstContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(FOR);
			setState(413);
			match(IDF);
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(415);
				arithmeticExpression(0);
				}
				break;
			case PLUS:
			case SUB:
				{
				setState(416);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(417);
				arithmeticExpression(0);
				}
				break;
			case FROM:
				break;
			default:
				break;
			}
			setState(420);
			match(FROM);
			setState(421);
			arithmeticExpression(0);
			setState(422);
			match(TO);
			setState(423);
			arithmeticExpression(0);
			setState(424);
			match(STEP);
			setState(425);
			arithmeticExpression(0);
			setState(426);
			match(LBRACE);
			setState(428); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(427);
				inst();
				}
				}
				setState(430); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(432);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileInstContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ExprParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public DoWhileInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDoWhileInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDoWhileInst(this);
		}
	}

	public final DoWhileInstContext doWhileInst() throws RecognitionException {
		DoWhileInstContext _localctx = new DoWhileInstContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_doWhileInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(DO);
			setState(435);
			match(LBRACE);
			setState(437); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(436);
				inst();
				}
				}
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(441);
			match(RBRACE);
			setState(442);
			match(WHILE);
			setState(443);
			match(LPAR);
			setState(444);
			condition(0);
			setState(445);
			match(RPAR);
			setState(446);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileInstContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode DO() { return getToken(ExprParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public WhileInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWhileInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWhileInst(this);
		}
	}

	public final WhileInstContext whileInst() throws RecognitionException {
		WhileInstContext _localctx = new WhileInstContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(WHILE);
			setState(449);
			match(LPAR);
			setState(450);
			condition(0);
			setState(451);
			match(RPAR);
			setState(452);
			match(DO);
			setState(453);
			match(LBRACE);
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				inst();
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(459);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfInstContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(ExprParser.THEN, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ElseIfInstContext elseIfInst() {
			return getRuleContext(ElseIfInstContext.class,0);
		}
		public ElseInstContext elseInst() {
			return getRuleContext(ElseInstContext.class,0);
		}
		public IfInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfInst(this);
		}
	}

	public final IfInstContext ifInst() throws RecognitionException {
		IfInstContext _localctx = new IfInstContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(IF);
			setState(462);
			match(LPAR);
			setState(463);
			condition(0);
			setState(464);
			match(RPAR);
			setState(465);
			match(THEN);
			setState(466);
			match(LBRACE);
			setState(468); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(467);
				inst();
				}
				}
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(472);
			match(RBRACE);
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(473);
				elseIfInst();
				}
				break;
			}
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(476);
				elseInst();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfInstContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(ExprParser.ELSIF, 0); }
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(ExprParser.THEN, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public ElseIfInstContext elseIfInst() {
			return getRuleContext(ElseIfInstContext.class,0);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ExprParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ExprParser.COMMENT, i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ElseIfInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterElseIfInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitElseIfInst(this);
		}
	}

	public final ElseIfInstContext elseIfInst() throws RecognitionException {
		ElseIfInstContext _localctx = new ElseIfInstContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elseIfInst);
		int _la;
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(479);
					match(COMMENT);
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(485);
				match(ELSIF);
				setState(486);
				match(LPAR);
				setState(487);
				condition(0);
				setState(488);
				match(RPAR);
				setState(489);
				match(THEN);
				setState(490);
				match(LBRACE);
				setState(492); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(491);
					inst();
					}
					}
					setState(494); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(496);
				match(RBRACE);
				setState(497);
				elseIfInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(499);
					match(COMMENT);
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505);
				match(ELSIF);
				setState(506);
				match(LPAR);
				setState(507);
				condition(0);
				setState(508);
				match(RPAR);
				setState(509);
				match(THEN);
				setState(510);
				match(LBRACE);
				setState(512); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(511);
					inst();
					}
					}
					setState(514); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(516);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseInstContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ExprParser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(ExprParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ExprParser.COMMENT, i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ElseInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterElseInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitElseInst(this);
		}
	}

	public final ElseInstContext elseInst() throws RecognitionException {
		ElseInstContext _localctx = new ElseInstContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elseInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(520);
				match(COMMENT);
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(ELSE);
			setState(527);
			match(LBRACE);
			setState(529); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(528);
				inst();
				}
				}
				setState(531); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(533);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchInstContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(ExprParser.SWITCH, 0); }
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public CaseInstContext caseInst() {
			return getRuleContext(CaseInstContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public SwitchInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSwitchInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSwitchInst(this);
		}
	}

	public final SwitchInstContext switchInst() throws RecognitionException {
		SwitchInstContext _localctx = new SwitchInstContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(SWITCH);
			setState(536);
			match(LPAR);
			setState(537);
			match(IDF);
			setState(538);
			match(RPAR);
			setState(539);
			match(LBRACE);
			setState(540);
			caseInst();
			setState(541);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseInstContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ExprParser.CASE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TWOPOINT() { return getToken(ExprParser.TWOPOINT, 0); }
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public DefaultInstContext defaultInst() {
			return getRuleContext(DefaultInstContext.class,0);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public CaseInstContext caseInst() {
			return getRuleContext(CaseInstContext.class,0);
		}
		public CaseInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCaseInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCaseInst(this);
		}
	}

	public final CaseInstContext caseInst() throws RecognitionException {
		CaseInstContext _localctx = new CaseInstContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseInst);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(CASE);
				setState(544);
				number();
				setState(545);
				match(TWOPOINT);
				setState(547); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(546);
					inst();
					}
					}
					setState(549); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(551);
				match(BREAK);
				setState(552);
				match(SEMI);
				setState(553);
				defaultInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(CASE);
				setState(556);
				number();
				setState(557);
				match(TWOPOINT);
				setState(559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(558);
					inst();
					}
					}
					setState(561); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(563);
				match(BREAK);
				setState(564);
				match(SEMI);
				setState(565);
				caseInst();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultInstContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(ExprParser.DEFAULT, 0); }
		public TerminalNode TWOPOINT() { return getToken(ExprParser.TWOPOINT, 0); }
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public DefaultInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDefaultInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDefaultInst(this);
		}
	}

	public final DefaultInstContext defaultInst() throws RecognitionException {
		DefaultInstContext _localctx = new DefaultInstContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defaultInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(DEFAULT);
			setState(570);
			match(TWOPOINT);
			setState(572); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(571);
				inst();
				}
				}
				setState(574); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(576);
			match(BREAK);
			setState(577);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public VarContext var;
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public PartConditionContext partCondition() {
			return getRuleContext(PartConditionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode BOOLEANVALUE() { return getToken(ExprParser.BOOLEANVALUE, 0); }
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(580);
				match(LPAR);
				setState(581);
				condition(0);
				setState(582);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(584);
				match(NOT);
				setState(585);
				condition(6);
				}
				break;
			case 3:
				{
				setState(586);
				partCondition();
				}
				break;
			case 4:
				{
				setState(587);
				((ConditionContext)_localctx).var = var();
				boolTypes.add(((ConditionContext)_localctx).var.type);
				}
				break;
			case 5:
				{
				setState(590);
				match(BOOLEANVALUE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(599);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(593);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(594);
						match(AND);
						setState(595);
						condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(596);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(597);
						match(OR);
						setState(598);
						condition(5);
						}
						break;
					}
					} 
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PartConditionContext extends ParserRuleContext {
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ComparaisonOperatorContext comparaisonOperator() {
			return getRuleContext(ComparaisonOperatorContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public PartConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPartCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPartCondition(this);
		}
	}

	public final PartConditionContext partCondition() throws RecognitionException {
		PartConditionContext _localctx = new PartConditionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_partCondition);
		types.clear();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			((PartConditionContext)_localctx).var = var();
			setState(605);
			comparaisonOperator();
			setState(606);
			arithmeticExpression(0);
			types.add(((PartConditionContext)_localctx).var.type); comTypes.add(IDF_HashTable.table.getType(types,0)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparaisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ExprParser.NEQ, 0); }
		public TerminalNode GREATER() { return getToken(ExprParser.GREATER, 0); }
		public TerminalNode LESSER() { return getToken(ExprParser.LESSER, 0); }
		public TerminalNode GEQ() { return getToken(ExprParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(ExprParser.LEQ, 0); }
		public ComparaisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparaisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterComparaisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitComparaisonOperator(this);
		}
	}

	public final ComparaisonOperatorContext comparaisonOperator() throws RecognitionException {
		ComparaisonOperatorContext _localctx = new ComparaisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comparaisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESSER) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 31:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0266\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\2\3\2\7\2Q\n\2"+
		"\f\2\16\2T\13\2\3\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\7\2_\n\2\f\2\16"+
		"\2b\13\2\3\2\3\2\3\3\3\3\6\3h\n\3\r\3\16\3i\3\3\5\3m\n\3\3\4\3\4\3\4\5"+
		"\4r\n\4\3\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008c\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0095\n\7\3\b\3\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\6\t\u00b6\n\t\r\t\16\t\u00b7\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c9\n\t\3\n\3\n\3\n\7\n\u00ce"+
		"\n\n\f\n\16\n\u00d1\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00da\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e2\n\f\f\f\16\f\u00e5\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f9"+
		"\n\r\3\16\3\16\7\16\u00fd\n\16\f\16\16\16\u0100\13\16\3\16\3\16\6\16\u0104"+
		"\n\16\r\16\16\16\u0105\3\16\3\16\7\16\u010a\n\16\f\16\16\16\u010d\13\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0114\n\16\f\16\16\16\u0117\13\16\3\16"+
		"\3\16\3\16\7\16\u011c\n\16\f\16\16\16\u011f\13\16\3\16\3\16\5\16\u0123"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012d\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\6\22\u013d"+
		"\n\22\r\22\16\22\u013e\3\22\3\22\5\22\u0143\n\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0153\n\23\f\23"+
		"\16\23\u0156\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0160"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0169\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0173\n\24\6\24\u0175\n\24\r\24\16\24\u0176"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0181\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0189\n\25\f\25\16\25\u018c\13\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0194\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u019d\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01a5\n\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\6\30\u01af\n\30\r\30\16\30\u01b0\3\30\3\30"+
		"\3\31\3\31\3\31\6\31\u01b8\n\31\r\31\16\31\u01b9\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u01ca\n\32\r\32"+
		"\16\32\u01cb\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u01d7\n"+
		"\33\r\33\16\33\u01d8\3\33\3\33\5\33\u01dd\n\33\3\33\5\33\u01e0\n\33\3"+
		"\34\7\34\u01e3\n\34\f\34\16\34\u01e6\13\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\6\34\u01ef\n\34\r\34\16\34\u01f0\3\34\3\34\3\34\3\34\7\34\u01f7"+
		"\n\34\f\34\16\34\u01fa\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u0203"+
		"\n\34\r\34\16\34\u0204\3\34\3\34\5\34\u0209\n\34\3\35\7\35\u020c\n\35"+
		"\f\35\16\35\u020f\13\35\3\35\3\35\3\35\6\35\u0214\n\35\r\35\16\35\u0215"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\6\37\u0226\n\37\r\37\16\37\u0227\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\6\37\u0232\n\37\r\37\16\37\u0233\3\37\3\37\3\37\3\37\5\37\u023a\n"+
		"\37\3 \3 \3 \6 \u023f\n \r \16 \u0240\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u0252\n!\3!\3!\3!\3!\3!\3!\7!\u025a\n!\f!\16!\u025d\13"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\2\4(@$\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\6\4\2\36\36!!\3\2\60\61\3\2./\3\2"+
		"&+\2\u0292\2I\3\2\2\2\4l\3\2\2\2\6q\3\2\2\2\bs\3\2\2\2\n\u008b\3\2\2\2"+
		"\f\u0094\3\2\2\2\16\u009a\3\2\2\2\20\u00c8\3\2\2\2\22\u00ca\3\2\2\2\24"+
		"\u00d9\3\2\2\2\26\u00db\3\2\2\2\30\u00f8\3\2\2\2\32\u0122\3\2\2\2\34\u012c"+
		"\3\2\2\2\36\u012e\3\2\2\2 \u0134\3\2\2\2\"\u0142\3\2\2\2$\u015f\3\2\2"+
		"\2&\u0168\3\2\2\2(\u0180\3\2\2\2*\u0193\3\2\2\2,\u019c\3\2\2\2.\u019e"+
		"\3\2\2\2\60\u01b4\3\2\2\2\62\u01c2\3\2\2\2\64\u01cf\3\2\2\2\66\u0208\3"+
		"\2\2\28\u020d\3\2\2\2:\u0219\3\2\2\2<\u0239\3\2\2\2>\u023b\3\2\2\2@\u0251"+
		"\3\2\2\2B\u025e\3\2\2\2D\u0263\3\2\2\2FH\7:\2\2GF\3\2\2\2HK\3\2\2\2IG"+
		"\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\7\2\2MN\7\36\2\2NR\7\63\2\2"+
		"OQ\7:\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2"+
		"UY\5\4\3\2VX\7:\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2"+
		"[Y\3\2\2\2\\`\5\32\16\2]_\7:\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2"+
		"\2ac\3\2\2\2b`\3\2\2\2cd\7\2\2\3d\3\3\2\2\2eg\7\b\2\2fh\5\6\4\2gf\3\2"+
		"\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2km\7\b\2\2le\3\2\2\2lk\3\2"+
		"\2\2m\5\3\2\2\2nr\5\n\6\2or\5\20\t\2pr\7:\2\2qn\3\2\2\2qo\3\2\2\2qp\3"+
		"\2\2\2r\7\3\2\2\2sx\7\36\2\2tu\7\62\2\2uw\7\36\2\2vt\3\2\2\2wz\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2y\t\3\2\2\2zx\3\2\2\2{|\5\24\13\2|}\5\b\5\2}~\79\2"+
		"\2~\177\7\6\2\2\177\u0080\78\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7\63"+
		"\2\2\u0082\u0083\b\6\1\2\u0083\u008c\3\2\2\2\u0084\u0085\5\24\13\2\u0085"+
		"\u0086\5\b\5\2\u0086\u0087\79\2\2\u0087\u0088\7\6\2\2\u0088\u0089\7\63"+
		"\2\2\u0089\u008a\b\6\1\2\u008a\u008c\3\2\2\2\u008b{\3\2\2\2\u008b\u0084"+
		"\3\2\2\2\u008c\13\3\2\2\2\u008d\u008e\5\16\b\2\u008e\u008f\b\7\1\2\u008f"+
		"\u0095\3\2\2\2\u0090\u0091\7!\2\2\u0091\u0095\b\7\1\2\u0092\u0093\7\""+
		"\2\2\u0093\u0095\b\7\1\2\u0094\u008d\3\2\2\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\r\3\2\2\2\u0096\u0097\7\37\2\2\u0097\u009b\b\b\1"+
		"\2\u0098\u0099\7 \2\2\u0099\u009b\b\b\1\2\u009a\u0096\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\17\3\2\2\2\u009c\u009d\5\24\13\2\u009d\u009e\5\b\5\2\u009e"+
		"\u009f\79\2\2\u009f\u00a0\7\64\2\2\u00a0\u00a1\7\6\2\2\u00a1\u00a2\7\63"+
		"\2\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\7\65\2\2\u00a4\u00a5\78\2\2\u00a5"+
		"\u00a6\7,\2\2\u00a6\u00a7\7-\2\2\u00a7\u00a8\7\63\2\2\u00a8\u00a9\b\t"+
		"\1\2\u00a9\u00c9\3\2\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac\5\b\5\2\u00ac"+
		"\u00ad\79\2\2\u00ad\u00ae\7\64\2\2\u00ae\u00af\7\6\2\2\u00af\u00b0\7\63"+
		"\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2\7\65\2\2\u00b2\u00b3\78\2\2\u00b3"+
		"\u00b5\7,\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\7-\2\2\u00ba\u00bb\7\63\2\2\u00bb\u00bc\b\t\1\2\u00bc\u00c9\3\2"+
		"\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf\5\b\5\2\u00bf\u00c0\79\2\2\u00c0"+
		"\u00c1\7\64\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\7\63\2\2\u00c3\u00c4\7"+
		"\37\2\2\u00c4\u00c5\7\65\2\2\u00c5\u00c6\7\63\2\2\u00c6\u00c7\b\t\1\2"+
		"\u00c7\u00c9\3\2\2\2\u00c8\u009c\3\2\2\2\u00c8\u00aa\3\2\2\2\u00c8\u00bd"+
		"\3\2\2\2\u00c9\21\3\2\2\2\u00ca\u00cb\78\2\2\u00cb\u00cf\7,\2\2\u00cc"+
		"\u00ce\5\26\f\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7-\2\2\u00d3\23\3\2\2\2\u00d4\u00d5\7\34\2\2\u00d5\u00d6\7\35\2"+
		"\2\u00d6\u00da\b\13\1\2\u00d7\u00d8\7\33\2\2\u00d8\u00da\b\13\1\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\25\3\2\2\2\u00db\u00dc\5\30\r"+
		"\2\u00dc\u00e3\b\f\1\2\u00dd\u00de\7\62\2\2\u00de\u00df\5\30\r\2\u00df"+
		"\u00e0\b\f\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\27\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e7\5\16\b\2\u00e7\u00e8\b\r\1\2\u00e8\u00f9\3\2\2\2"+
		"\u00e9\u00ea\7\3\2\2\u00ea\u00f9\b\r\1\2\u00eb\u00ec\7\"\2\2\u00ec\u00f9"+
		"\b\r\1\2\u00ed\u00ee\7!\2\2\u00ee\u00f9\b\r\1\2\u00ef\u00f0\5@!\2\u00f0"+
		"\u00f1\b\r\1\2\u00f1\u00f9\3\2\2\2\u00f2\u00f3\5(\25\2\u00f3\u00f4\b\r"+
		"\1\2\u00f4\u00f9\3\2\2\2\u00f5\u00f6\5&\24\2\u00f6\u00f7\b\r\1\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00e6\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00eb\3\2"+
		"\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f9\31\3\2\2\2\u00fa\u00fe\7\t\2\2\u00fb\u00fd\7:\2\2"+
		"\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\7,\2\2\u0102"+
		"\u0104\5\34\17\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010b\7-\2\2\u0108"+
		"\u010a\7:\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\7\n\2\2\u010f\u0110\7\63\2\2\u0110\u0123\3\2\2\2\u0111\u0115\7"+
		"\t\2\2\u0112\u0114\7:\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u0119\7,\2\2\u0119\u011d\7-\2\2\u011a\u011c\7:\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\n\2\2\u0121\u0123\7\63"+
		"\2\2\u0122\u00fa\3\2\2\2\u0122\u0111\3\2\2\2\u0123\33\3\2\2\2\u0124\u012d"+
		"\5 \21\2\u0125\u012d\5\36\20\2\u0126\u012d\5$\23\2\u0127\u012d\7:\2\2"+
		"\u0128\u012d\5\60\31\2\u0129\u012d\5\62\32\2\u012a\u012d\5\64\33\2\u012b"+
		"\u012d\5:\36\2\u012c\u0124\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u0126\3\2"+
		"\2\2\u012c\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u0129\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\35\3\2\2\2\u012e\u012f\7\4\2"+
		"\2\u012f\u0130\7\66\2\2\u0130\u0131\5\b\5\2\u0131\u0132\7\67\2\2\u0132"+
		"\u0133\7\63\2\2\u0133\37\3\2\2\2\u0134\u0135\7\5\2\2\u0135\u0136\7\66"+
		"\2\2\u0136\u0137\5\"\22\2\u0137\u0138\7\67\2\2\u0138\u0139\7\63\2\2\u0139"+
		"!\3\2\2\2\u013a\u013b\t\2\2\2\u013b\u013d\7\62\2\2\u013c\u013a\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0143\t\2\2\2\u0141\u0143\t\2\2\2\u0142\u013c\3\2\2\2\u0142"+
		"\u0141\3\2\2\2\u0143#\3\2\2\2\u0144\u0145\5,\27\2\u0145\u0146\7$\2\2\u0146"+
		"\u0147\5(\25\2\u0147\u0148\7\63\2\2\u0148\u0160\3\2\2\2\u0149\u014a\5"+
		",\27\2\u014a\u014b\7$\2\2\u014b\u014c\5&\24\2\u014c\u014d\7\63\2\2\u014d"+
		"\u0160\3\2\2\2\u014e\u014f\5,\27\2\u014f\u0150\7$\2\2\u0150\u0154\7,\2"+
		"\2\u0151\u0153\5\26\f\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u0158\7-\2\2\u0158\u0159\7\63\2\2\u0159\u0160\3\2\2\2\u015a"+
		"\u015b\5,\27\2\u015b\u015c\7$\2\2\u015c\u015d\5@!\2\u015d\u015e\7\63\2"+
		"\2\u015e\u0160\3\2\2\2\u015f\u0144\3\2\2\2\u015f\u0149\3\2\2\2\u015f\u014e"+
		"\3\2\2\2\u015f\u015a\3\2\2\2\u0160%\3\2\2\2\u0161\u0162\7!\2\2\u0162\u0169"+
		"\b\24\1\2\u0163\u0164\7\"\2\2\u0164\u0169\b\24\1\2\u0165\u0166\5,\27\2"+
		"\u0166\u0167\b\24\1\2\u0167\u0169\3\2\2\2\u0168\u0161\3\2\2\2\u0168\u0163"+
		"\3\2\2\2\u0168\u0165\3\2\2\2\u0169\u0174\3\2\2\2\u016a\u0172\7#\2\2\u016b"+
		"\u016c\5,\27\2\u016c\u016d\b\24\1\2\u016d\u0173\3\2\2\2\u016e\u016f\7"+
		"!\2\2\u016f\u0173\b\24\1\2\u0170\u0171\7\"\2\2\u0171\u0173\b\24\1\2\u0172"+
		"\u016b\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u016a\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\'\3\2\2\2\u0178\u0179\b\25\1\2\u0179\u017a\5*\26"+
		"\2\u017a\u017b\b\25\1\2\u017b\u0181\3\2\2\2\u017c\u017d\7\66\2\2\u017d"+
		"\u017e\5(\25\2\u017e\u017f\7\67\2\2\u017f\u0181\3\2\2\2\u0180\u0178\3"+
		"\2\2\2\u0180\u017c\3\2\2\2\u0181\u018a\3\2\2\2\u0182\u0183\f\6\2\2\u0183"+
		"\u0184\t\3\2\2\u0184\u0189\5(\25\7\u0185\u0186\f\5\2\2\u0186\u0187\t\4"+
		"\2\2\u0187\u0189\5(\25\6\u0188\u0182\3\2\2\2\u0188\u0185\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b)\3\2\2\2"+
		"\u018c\u018a\3\2\2\2\u018d\u018e\5\16\b\2\u018e\u018f\b\26\1\2\u018f\u0194"+
		"\3\2\2\2\u0190\u0191\5,\27\2\u0191\u0192\b\26\1\2\u0192\u0194\3\2\2\2"+
		"\u0193\u018d\3\2\2\2\u0193\u0190\3\2\2\2\u0194+\3\2\2\2\u0195\u0196\7"+
		"\36\2\2\u0196\u019d\b\27\1\2\u0197\u0198\7\36\2\2\u0198\u0199\7\64\2\2"+
		"\u0199\u019a\7\37\2\2\u019a\u019b\7\65\2\2\u019b\u019d\b\27\1\2\u019c"+
		"\u0195\3\2\2\2\u019c\u0197\3\2\2\2\u019d-\3\2\2\2\u019e\u019f\7\25\2\2"+
		"\u019f\u01a4\7\36\2\2\u01a0\u01a1\t\3\2\2\u01a1\u01a5\5(\25\2\u01a2\u01a3"+
		"\t\4\2\2\u01a3\u01a5\5(\25\2\u01a4\u01a0\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\26\2\2\u01a7\u01a8\5"+
		"(\25\2\u01a8\u01a9\7\27\2\2\u01a9\u01aa\5(\25\2\u01aa\u01ab\7\30\2\2\u01ab"+
		"\u01ac\5(\25\2\u01ac\u01ae\7,\2\2\u01ad\u01af\5\34\17\2\u01ae\u01ad\3"+
		"\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\7-\2\2\u01b3/\3\2\2\2\u01b4\u01b5\7\24\2\2"+
		"\u01b5\u01b7\7,\2\2\u01b6\u01b8\5\34\17\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\7-\2\2\u01bc\u01bd\7\23\2\2\u01bd\u01be\7\66\2\2\u01be\u01bf\5"+
		"@!\2\u01bf\u01c0\7\67\2\2\u01c0\u01c1\7\63\2\2\u01c1\61\3\2\2\2\u01c2"+
		"\u01c3\7\23\2\2\u01c3\u01c4\7\66\2\2\u01c4\u01c5\5@!\2\u01c5\u01c6\7\67"+
		"\2\2\u01c6\u01c7\7\24\2\2\u01c7\u01c9\7,\2\2\u01c8\u01ca\5\34\17\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7-\2\2\u01ce\63\3\2\2\2\u01cf\u01d0"+
		"\7\13\2\2\u01d0\u01d1\7\66\2\2\u01d1\u01d2\5@!\2\u01d2\u01d3\7\67\2\2"+
		"\u01d3\u01d4\7\16\2\2\u01d4\u01d6\7,\2\2\u01d5\u01d7\5\34\17\2\u01d6\u01d5"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\7-\2\2\u01db\u01dd\5\66\34\2\u01dc\u01db\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\58\35\2\u01df"+
		"\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\65\3\2\2\2\u01e1\u01e3\7:\2\2"+
		"\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7\r\2\2\u01e8"+
		"\u01e9\7\66\2\2\u01e9\u01ea\5@!\2\u01ea\u01eb\7\67\2\2\u01eb\u01ec\7\16"+
		"\2\2\u01ec\u01ee\7,\2\2\u01ed\u01ef\5\34\17\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f3\7-\2\2\u01f3\u01f4\5\66\34\2\u01f4\u0209\3\2\2\2\u01f5"+
		"\u01f7\7:\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fc\7\r\2\2\u01fc\u01fd\7\66\2\2\u01fd\u01fe\5@!\2\u01fe\u01ff\7\67"+
		"\2\2\u01ff\u0200\7\16\2\2\u0200\u0202\7,\2\2\u0201\u0203\5\34\17\2\u0202"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7-\2\2\u0207\u0209\3\2\2\2\u0208"+
		"\u01e4\3\2\2\2\u0208\u01f8\3\2\2\2\u0209\67\3\2\2\2\u020a\u020c\7:\2\2"+
		"\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7\f\2\2\u0211"+
		"\u0213\7,\2\2\u0212\u0214\5\34\17\2\u0213\u0212\3\2\2\2\u0214\u0215\3"+
		"\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0218\7-\2\2\u02189\3\2\2\2\u0219\u021a\7\17\2\2\u021a\u021b\7\66\2\2"+
		"\u021b\u021c\7\36\2\2\u021c\u021d\7\67\2\2\u021d\u021e\7,\2\2\u021e\u021f"+
		"\5<\37\2\u021f\u0220\7-\2\2\u0220;\3\2\2\2\u0221\u0222\7\20\2\2\u0222"+
		"\u0223\5\16\b\2\u0223\u0225\79\2\2\u0224\u0226\5\34\17\2\u0225\u0224\3"+
		"\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022a\7\21\2\2\u022a\u022b\7\63\2\2\u022b\u022c\5"+
		"> \2\u022c\u023a\3\2\2\2\u022d\u022e\7\20\2\2\u022e\u022f\5\16\b\2\u022f"+
		"\u0231\79\2\2\u0230\u0232\5\34\17\2\u0231\u0230\3\2\2\2\u0232\u0233\3"+
		"\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0236\7\21\2\2\u0236\u0237\7\63\2\2\u0237\u0238\5<\37\2\u0238\u023a\3"+
		"\2\2\2\u0239\u0221\3\2\2\2\u0239\u022d\3\2\2\2\u023a=\3\2\2\2\u023b\u023c"+
		"\7\22\2\2\u023c\u023e\79\2\2\u023d\u023f\5\34\17\2\u023e\u023d\3\2\2\2"+
		"\u023f\u0240\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242"+
		"\3\2\2\2\u0242\u0243\7\21\2\2\u0243\u0244\7\63\2\2\u0244?\3\2\2\2\u0245"+
		"\u0246\b!\1\2\u0246\u0247\7\66\2\2\u0247\u0248\5@!\2\u0248\u0249\7\67"+
		"\2\2\u0249\u0252\3\2\2\2\u024a\u024b\7%\2\2\u024b\u0252\5@!\b\u024c\u0252"+
		"\5B\"\2\u024d\u024e\5,\27\2\u024e\u024f\b!\1\2\u024f\u0252\3\2\2\2\u0250"+
		"\u0252\7\3\2\2\u0251\u0245\3\2\2\2\u0251\u024a\3\2\2\2\u0251\u024c\3\2"+
		"\2\2\u0251\u024d\3\2\2\2\u0251\u0250\3\2\2\2\u0252\u025b\3\2\2\2\u0253"+
		"\u0254\f\7\2\2\u0254\u0255\7\31\2\2\u0255\u025a\5@!\b\u0256\u0257\f\6"+
		"\2\2\u0257\u0258\7\32\2\2\u0258\u025a\5@!\7\u0259\u0253\3\2\2\2\u0259"+
		"\u0256\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025cA\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u025f\5,\27\2\u025f\u0260"+
		"\5D#\2\u0260\u0261\5(\25\2\u0261\u0262\b\"\1\2\u0262C\3\2\2\2\u0263\u0264"+
		"\t\5\2\2\u0264E\3\2\2\2;IRY`ilqx\u008b\u0094\u009a\u00b7\u00c8\u00cf\u00d9"+
		"\u00e3\u00f8\u00fe\u0105\u010b\u0115\u011d\u0122\u012c\u013e\u0142\u0154"+
		"\u015f\u0168\u0172\u0176\u0180\u0188\u018a\u0193\u019c\u01a4\u01b0\u01b9"+
		"\u01cb\u01d8\u01dc\u01df\u01e4\u01f0\u01f8\u0204\u0208\u020d\u0215\u0227"+
		"\u0233\u0239\u0240\u0251\u0259\u025b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}