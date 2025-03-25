// Generated from Expr.g4 by ANTLR 4.7.2

  import java.util.HashMap;
  import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
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
		DEFINE=26, CONST=27, IDF=28, INT=29, FLOAT=30, STRING=31, CHAR=32, AFFECT=33, 
		NOT=34, GREATER=35, LESSER=36, GEQ=37, LEQ=38, EQ=39, NEQ=40, LBRACE=41, 
		RBRACE=42, PLUS=43, SUB=44, MUL=45, DIV=46, COM=47, SEMI=48, LBRACKET=49, 
		RBRACKET=50, LPAR=51, RPAR=52, ASSIGN=53, TWOPOINT=54, COMMENT=55, WS=56, 
		ERROR_TOKEN=57;
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				declarationKeyword();
				setState(122);
				listIDF();
				setState(123);
				match(TWOPOINT);
				setState(124);
				match(TYPE);
				setState(125);
				match(ASSIGN);
				setState(126);
				value();
				setState(127);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				declarationKeyword();
				setState(130);
				listIDF();
				setState(131);
				match(TWOPOINT);
				setState(132);
				match(TYPE);
				setState(133);
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((AffectValueContext)_localctx).number = number();
				((AffectValueContext)_localctx).type =  ((AffectValueContext)_localctx).number.type;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(STRING);
				((AffectValueContext)_localctx).type =  "STRING";
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(INT);
				 ((NumberContext)_localctx).type =  "INT"; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
		public AffectArrayContext affectArray() {
			return getRuleContext(AffectArrayContext.class,0);
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
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				declarationKeyword();
				setState(153);
				listIDF();
				setState(154);
				match(TWOPOINT);
				setState(155);
				match(LBRACKET);
				setState(156);
				match(TYPE);
				setState(157);
				match(SEMI);
				setState(158);
				match(INT);
				setState(159);
				match(RBRACKET);
				setState(160);
				affectArray();
				setState(161);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				declarationKeyword();
				setState(164);
				listIDF();
				setState(165);
				match(TWOPOINT);
				setState(166);
				match(LBRACKET);
				setState(167);
				match(TYPE);
				setState(168);
				match(SEMI);
				setState(169);
				match(INT);
				setState(170);
				match(RBRACKET);
				setState(171);
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
			setState(175);
			match(ASSIGN);
			setState(176);
			match(LBRACE);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANVALUE) | (1L << IDF) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << NOT) | (1L << LPAR))) != 0)) {
				{
				{
				setState(177);
				listValue();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(DEFINE);
				setState(186);
				match(CONST);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(LET);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			value();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(191);
				match(COM);
				setState(192);
				value();
				}
				}
				setState(197);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode BOOLEANVALUE() { return getToken(ExprParser.BOOLEANVALUE, 0); }
		public TerminalNode CHAR() { return getToken(ExprParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(BOOLEANVALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				var();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				condition(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				arithmeticExpression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				concatInst();
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(BEGIN);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(209);
					match(COMMENT);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(LBRACE);
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(216);
					inst();
					}
					}
					setState(219); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(221);
				match(RBRACE);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(222);
					match(COMMENT);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(END);
				setState(229);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(BEGIN);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(232);
					match(COMMENT);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(LBRACE);
				setState(239);
				match(RBRACE);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(240);
					match(COMMENT);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(END);
				setState(247);
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
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				output();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				input();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				affectInst();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(COMMENT);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				doWhileInst();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				whileInst();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				ifInst();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 8);
				{
				setState(257);
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
			setState(260);
			match(INPUT);
			setState(261);
			match(LPAR);
			setState(262);
			listIDF();
			setState(263);
			match(RPAR);
			setState(264);
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
			setState(266);
			match(OUTPUT);
			setState(267);
			match(LPAR);
			setState(268);
			content();
			setState(269);
			match(RPAR);
			setState(270);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(272);
						_la = _input.LA(1);
						if ( !(_la==IDF || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						match(COM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(276); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(278);
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
				setState(279);
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
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				var();
				setState(283);
				match(AFFECT);
				setState(284);
				arithmeticExpression(0);
				setState(285);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				var();
				setState(288);
				match(AFFECT);
				setState(289);
				concatInst();
				setState(290);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				var();
				setState(293);
				match(AFFECT);
				setState(294);
				match(LBRACE);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANVALUE) | (1L << IDF) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << NOT) | (1L << LPAR))) != 0)) {
					{
					{
					setState(295);
					listValue();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
				match(RBRACE);
				setState(302);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				var();
				setState(305);
				match(AFFECT);
				setState(306);
				condition(0);
				setState(307);
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
		public List<TerminalNode> STRING() { return getTokens(ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprParser.STRING, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ExprParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExprParser.PLUS, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(ExprParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(ExprParser.CHAR, i);
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
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(STRING);
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(312);
					match(PLUS);
					setState(313);
					match(STRING);
					}
					}
					setState(316); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(CHAR);
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(319);
					match(PLUS);
					setState(320);
					match(CHAR);
					}
					}
					setState(323); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
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
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
			case INT:
			case FLOAT:
				{
				setState(328);
				operator();
				}
				break;
			case LPAR:
				{
				setState(329);
				match(LPAR);
				setState(330);
				arithmeticExpression(0);
				setState(331);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(335);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(336);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						arithmeticExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(338);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(339);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(340);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				number();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				var();
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
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(IDF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(IDF);
				setState(352);
				match(LBRACKET);
				setState(353);
				match(INT);
				setState(354);
				match(RBRACKET);
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
			setState(357);
			match(FOR);
			setState(358);
			match(IDF);
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				{
				setState(359);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(360);
				arithmeticExpression(0);
				}
				break;
			case PLUS:
			case SUB:
				{
				setState(361);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(362);
				arithmeticExpression(0);
				}
				break;
			case FROM:
				break;
			default:
				break;
			}
			setState(365);
			match(FROM);
			setState(366);
			arithmeticExpression(0);
			setState(367);
			match(TO);
			setState(368);
			arithmeticExpression(0);
			setState(369);
			match(STEP);
			setState(370);
			arithmeticExpression(0);
			setState(371);
			match(LBRACE);
			setState(373); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(372);
				inst();
				}
				}
				setState(375); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(377);
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
			setState(379);
			match(DO);
			setState(380);
			match(LBRACE);
			setState(382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381);
				inst();
				}
				}
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(386);
			match(RBRACE);
			setState(387);
			match(WHILE);
			setState(388);
			match(LPAR);
			setState(389);
			condition(0);
			setState(390);
			match(RPAR);
			setState(391);
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
			setState(393);
			match(WHILE);
			setState(394);
			match(LPAR);
			setState(395);
			condition(0);
			setState(396);
			match(RPAR);
			setState(397);
			match(DO);
			setState(398);
			match(LBRACE);
			setState(400); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(399);
				inst();
				}
				}
				setState(402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(404);
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
			setState(406);
			match(IF);
			setState(407);
			match(LPAR);
			setState(408);
			condition(0);
			setState(409);
			match(RPAR);
			setState(410);
			match(THEN);
			setState(411);
			match(LBRACE);
			setState(413); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(412);
				inst();
				}
				}
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(417);
			match(RBRACE);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(418);
				elseIfInst();
				}
				break;
			}
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(421);
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
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(424);
					match(COMMENT);
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				match(ELSIF);
				setState(431);
				match(LPAR);
				setState(432);
				condition(0);
				setState(433);
				match(RPAR);
				setState(434);
				match(THEN);
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
				elseIfInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(444);
					match(COMMENT);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				match(ELSIF);
				setState(451);
				match(LPAR);
				setState(452);
				condition(0);
				setState(453);
				match(RPAR);
				setState(454);
				match(THEN);
				setState(455);
				match(LBRACE);
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(456);
					inst();
					}
					}
					setState(459); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(461);
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
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(465);
				match(COMMENT);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(ELSE);
			setState(472);
			match(LBRACE);
			setState(474); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(473);
				inst();
				}
				}
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(478);
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
			setState(480);
			match(SWITCH);
			setState(481);
			match(LPAR);
			setState(482);
			match(IDF);
			setState(483);
			match(RPAR);
			setState(484);
			match(LBRACE);
			setState(485);
			caseInst();
			setState(486);
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
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(CASE);
				setState(489);
				number();
				setState(490);
				match(TWOPOINT);
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
				match(BREAK);
				setState(497);
				match(SEMI);
				setState(498);
				defaultInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(CASE);
				setState(501);
				number();
				setState(502);
				match(TWOPOINT);
				setState(504); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(503);
					inst();
					}
					}
					setState(506); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(508);
				match(BREAK);
				setState(509);
				match(SEMI);
				setState(510);
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
			setState(514);
			match(DEFAULT);
			setState(515);
			match(TWOPOINT);
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(516);
				inst();
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(521);
			match(BREAK);
			setState(522);
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
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
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
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(525);
				match(LPAR);
				setState(526);
				condition(0);
				setState(527);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(529);
				match(NOT);
				setState(530);
				condition(6);
				}
				break;
			case 3:
				{
				setState(531);
				partCondition();
				}
				break;
			case 4:
				{
				setState(532);
				match(IDF);
				}
				break;
			case 5:
				{
				setState(533);
				match(BOOLEANVALUE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(542);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(536);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(537);
						match(AND);
						setState(538);
						condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(539);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(540);
						match(OR);
						setState(541);
						condition(5);
						}
						break;
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			var();
			setState(548);
			comparaisonOperator();
			setState(549);
			arithmeticExpression(0);
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
			setState(551);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u022c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\2\3\2\7\2Q\n\2"+
		"\f\2\16\2T\13\2\3\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\7\2_\n\2\f\2\16"+
		"\2b\13\2\3\2\3\2\3\3\3\3\6\3h\n\3\r\3\16\3i\3\3\5\3m\n\3\3\4\3\4\3\4\5"+
		"\4r\n\4\3\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0093\n\7\3\b\3\b\3\b\3\b\5\b\u0099\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b0"+
		"\n\t\3\n\3\n\3\n\7\n\u00b5\n\n\f\n\16\n\u00b8\13\n\3\n\3\n\3\13\3\13\3"+
		"\13\5\13\u00bf\n\13\3\f\3\f\3\f\7\f\u00c4\n\f\f\f\16\f\u00c7\13\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d1\n\r\3\16\3\16\7\16\u00d5\n\16\f"+
		"\16\16\16\u00d8\13\16\3\16\3\16\6\16\u00dc\n\16\r\16\16\16\u00dd\3\16"+
		"\3\16\7\16\u00e2\n\16\f\16\16\16\u00e5\13\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00ec\n\16\f\16\16\16\u00ef\13\16\3\16\3\16\3\16\7\16\u00f4\n\16"+
		"\f\16\16\16\u00f7\13\16\3\16\3\16\5\16\u00fb\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\6\22\u0115\n\22\r\22\16\22\u0116\3"+
		"\22\3\22\5\22\u011b\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u012b\n\23\f\23\16\23\u012e\13\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0138\n\23\3\24\3\24\3\24\6\24"+
		"\u013d\n\24\r\24\16\24\u013e\3\24\3\24\3\24\6\24\u0144\n\24\r\24\16\24"+
		"\u0145\5\24\u0148\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0150\n\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\7\25\u0158\n\25\f\25\16\25\u015b\13\25\3"+
		"\26\3\26\5\26\u015f\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u0166\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u016e\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\6\30\u0178\n\30\r\30\16\30\u0179\3\30\3\30\3\31\3\31\3\31\6"+
		"\31\u0181\n\31\r\31\16\31\u0182\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u0193\n\32\r\32\16\32\u0194\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u01a0\n\33\r\33\16\33\u01a1"+
		"\3\33\3\33\5\33\u01a6\n\33\3\33\5\33\u01a9\n\33\3\34\7\34\u01ac\n\34\f"+
		"\34\16\34\u01af\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u01b8\n"+
		"\34\r\34\16\34\u01b9\3\34\3\34\3\34\3\34\7\34\u01c0\n\34\f\34\16\34\u01c3"+
		"\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u01cc\n\34\r\34\16\34\u01cd"+
		"\3\34\3\34\5\34\u01d2\n\34\3\35\7\35\u01d5\n\35\f\35\16\35\u01d8\13\35"+
		"\3\35\3\35\3\35\6\35\u01dd\n\35\r\35\16\35\u01de\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\6\37\u01ef\n\37\r\37"+
		"\16\37\u01f0\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u01fb\n\37\r"+
		"\37\16\37\u01fc\3\37\3\37\3\37\3\37\5\37\u0203\n\37\3 \3 \3 \6 \u0208"+
		"\n \r \16 \u0209\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0219\n!\3"+
		"!\3!\3!\3!\3!\3!\7!\u0221\n!\f!\16!\u0224\13!\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\2\4(@$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BD\2\6\4\2\36\36!!\3\2/\60\3\2-.\3\2%*\2\u0255\2I\3\2\2\2\4l\3\2\2"+
		"\2\6q\3\2\2\2\bs\3\2\2\2\n\u0089\3\2\2\2\f\u0092\3\2\2\2\16\u0098\3\2"+
		"\2\2\20\u00af\3\2\2\2\22\u00b1\3\2\2\2\24\u00be\3\2\2\2\26\u00c0\3\2\2"+
		"\2\30\u00d0\3\2\2\2\32\u00fa\3\2\2\2\34\u0104\3\2\2\2\36\u0106\3\2\2\2"+
		" \u010c\3\2\2\2\"\u011a\3\2\2\2$\u0137\3\2\2\2&\u0147\3\2\2\2(\u014f\3"+
		"\2\2\2*\u015e\3\2\2\2,\u0165\3\2\2\2.\u0167\3\2\2\2\60\u017d\3\2\2\2\62"+
		"\u018b\3\2\2\2\64\u0198\3\2\2\2\66\u01d1\3\2\2\28\u01d6\3\2\2\2:\u01e2"+
		"\3\2\2\2<\u0202\3\2\2\2>\u0204\3\2\2\2@\u0218\3\2\2\2B\u0225\3\2\2\2D"+
		"\u0229\3\2\2\2FH\79\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2"+
		"\2\2KI\3\2\2\2LM\7\7\2\2MN\7\36\2\2NR\7\62\2\2OQ\79\2\2PO\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UY\5\4\3\2VX\79\2\2WV\3"+
		"\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\`\5\32\16\2"+
		"]_\79\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2"+
		"cd\7\2\2\3d\3\3\2\2\2eg\7\b\2\2fh\5\6\4\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2"+
		"\2ij\3\2\2\2jm\3\2\2\2km\7\b\2\2le\3\2\2\2lk\3\2\2\2m\5\3\2\2\2nr\5\n"+
		"\6\2or\5\20\t\2pr\79\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\7\3\2\2\2sx\7"+
		"\36\2\2tu\7\61\2\2uw\7\36\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y\t\3\2\2\2zx\3\2\2\2{|\5\24\13\2|}\5\b\5\2}~\78\2\2~\177\7\6\2\2\177"+
		"\u0080\7\67\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7\62\2\2\u0082\u008a"+
		"\3\2\2\2\u0083\u0084\5\24\13\2\u0084\u0085\5\b\5\2\u0085\u0086\78\2\2"+
		"\u0086\u0087\7\6\2\2\u0087\u0088\7\62\2\2\u0088\u008a\3\2\2\2\u0089{\3"+
		"\2\2\2\u0089\u0083\3\2\2\2\u008a\13\3\2\2\2\u008b\u008c\5\16\b\2\u008c"+
		"\u008d\b\7\1\2\u008d\u0093\3\2\2\2\u008e\u008f\7!\2\2\u008f\u0093\b\7"+
		"\1\2\u0090\u0091\7\"\2\2\u0091\u0093\b\7\1\2\u0092\u008b\3\2\2\2\u0092"+
		"\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0093\r\3\2\2\2\u0094\u0095\7\37\2"+
		"\2\u0095\u0099\b\b\1\2\u0096\u0097\7 \2\2\u0097\u0099\b\b\1\2\u0098\u0094"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0099\17\3\2\2\2\u009a\u009b\5\24\13\2\u009b"+
		"\u009c\5\b\5\2\u009c\u009d\78\2\2\u009d\u009e\7\63\2\2\u009e\u009f\7\6"+
		"\2\2\u009f\u00a0\7\62\2\2\u00a0\u00a1\7\37\2\2\u00a1\u00a2\7\64\2\2\u00a2"+
		"\u00a3\5\22\n\2\u00a3\u00a4\7\62\2\2\u00a4\u00b0\3\2\2\2\u00a5\u00a6\5"+
		"\24\13\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8\78\2\2\u00a8\u00a9\7\63\2\2\u00a9"+
		"\u00aa\7\6\2\2\u00aa\u00ab\7\62\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad\7"+
		"\64\2\2\u00ad\u00ae\7\62\2\2\u00ae\u00b0\3\2\2\2\u00af\u009a\3\2\2\2\u00af"+
		"\u00a5\3\2\2\2\u00b0\21\3\2\2\2\u00b1\u00b2\7\67\2\2\u00b2\u00b6\7+\2"+
		"\2\u00b3\u00b5\5\26\f\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00ba\7,\2\2\u00ba\23\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc\u00bf"+
		"\7\35\2\2\u00bd\u00bf\7\33\2\2\u00be\u00bb\3\2\2\2\u00be\u00bd\3\2\2\2"+
		"\u00bf\25\3\2\2\2\u00c0\u00c5\5\30\r\2\u00c1\u00c2\7\61\2\2\u00c2\u00c4"+
		"\5\30\r\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\27\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00d1"+
		"\5\16\b\2\u00c9\u00d1\7\3\2\2\u00ca\u00d1\7\"\2\2\u00cb\u00d1\7!\2\2\u00cc"+
		"\u00d1\5,\27\2\u00cd\u00d1\5@!\2\u00ce\u00d1\5(\25\2\u00cf\u00d1\5&\24"+
		"\2\u00d0\u00c8\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cb"+
		"\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d6\7\t\2\2\u00d3\u00d5\79\2\2"+
		"\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7+\2\2\u00da"+
		"\u00dc\5\34\17\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\7,\2\2\u00e0"+
		"\u00e2\79\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7\n\2\2\u00e7\u00e8\7\62\2\2\u00e8\u00fb\3\2\2\2\u00e9\u00ed\7"+
		"\t\2\2\u00ea\u00ec\79\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\7+\2\2\u00f1\u00f5\7,\2\2\u00f2\u00f4\79\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\n\2\2\u00f9\u00fb\7\62"+
		"\2\2\u00fa\u00d2\3\2\2\2\u00fa\u00e9\3\2\2\2\u00fb\33\3\2\2\2\u00fc\u0105"+
		"\5 \21\2\u00fd\u0105\5\36\20\2\u00fe\u0105\5$\23\2\u00ff\u0105\79\2\2"+
		"\u0100\u0105\5\60\31\2\u0101\u0105\5\62\32\2\u0102\u0105\5\64\33\2\u0103"+
		"\u0105\5:\36\2\u0104\u00fc\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00fe\3\2"+
		"\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\35\3\2\2\2\u0106\u0107\7\4\2"+
		"\2\u0107\u0108\7\65\2\2\u0108\u0109\5\b\5\2\u0109\u010a\7\66\2\2\u010a"+
		"\u010b\7\62\2\2\u010b\37\3\2\2\2\u010c\u010d\7\5\2\2\u010d\u010e\7\65"+
		"\2\2\u010e\u010f\5\"\22\2\u010f\u0110\7\66\2\2\u0110\u0111\7\62\2\2\u0111"+
		"!\3\2\2\2\u0112\u0113\t\2\2\2\u0113\u0115\7\61\2\2\u0114\u0112\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u011b\t\2\2\2\u0119\u011b\t\2\2\2\u011a\u0114\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b#\3\2\2\2\u011c\u011d\5,\27\2\u011d\u011e\7#\2\2\u011e"+
		"\u011f\5(\25\2\u011f\u0120\7\62\2\2\u0120\u0138\3\2\2\2\u0121\u0122\5"+
		",\27\2\u0122\u0123\7#\2\2\u0123\u0124\5&\24\2\u0124\u0125\7\62\2\2\u0125"+
		"\u0138\3\2\2\2\u0126\u0127\5,\27\2\u0127\u0128\7#\2\2\u0128\u012c\7+\2"+
		"\2\u0129\u012b\5\26\f\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0130\7,\2\2\u0130\u0131\7\62\2\2\u0131\u0138\3\2\2\2\u0132"+
		"\u0133\5,\27\2\u0133\u0134\7#\2\2\u0134\u0135\5@!\2\u0135\u0136\7\62\2"+
		"\2\u0136\u0138\3\2\2\2\u0137\u011c\3\2\2\2\u0137\u0121\3\2\2\2\u0137\u0126"+
		"\3\2\2\2\u0137\u0132\3\2\2\2\u0138%\3\2\2\2\u0139\u013c\7!\2\2\u013a\u013b"+
		"\7-\2\2\u013b\u013d\7!\2\2\u013c\u013a\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0148\3\2\2\2\u0140\u0143\7\""+
		"\2\2\u0141\u0142\7-\2\2\u0142\u0144\7\"\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0139\3\2\2\2\u0147\u0140\3\2\2\2\u0148\'\3\2\2\2\u0149\u014a"+
		"\b\25\1\2\u014a\u0150\5*\26\2\u014b\u014c\7\65\2\2\u014c\u014d\5(\25\2"+
		"\u014d\u014e\7\66\2\2\u014e\u0150\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014b"+
		"\3\2\2\2\u0150\u0159\3\2\2\2\u0151\u0152\f\6\2\2\u0152\u0153\t\3\2\2\u0153"+
		"\u0158\5(\25\7\u0154\u0155\f\5\2\2\u0155\u0156\t\4\2\2\u0156\u0158\5("+
		"\25\6\u0157\u0151\3\2\2\2\u0157\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a)\3\2\2\2\u015b\u0159\3\2\2\2"+
		"\u015c\u015f\5\16\b\2\u015d\u015f\5,\27\2\u015e\u015c\3\2\2\2\u015e\u015d"+
		"\3\2\2\2\u015f+\3\2\2\2\u0160\u0166\7\36\2\2\u0161\u0162\7\36\2\2\u0162"+
		"\u0163\7\63\2\2\u0163\u0164\7\37\2\2\u0164\u0166\7\64\2\2\u0165\u0160"+
		"\3\2\2\2\u0165\u0161\3\2\2\2\u0166-\3\2\2\2\u0167\u0168\7\25\2\2\u0168"+
		"\u016d\7\36\2\2\u0169\u016a\t\3\2\2\u016a\u016e\5(\25\2\u016b\u016c\t"+
		"\4\2\2\u016c\u016e\5(\25\2\u016d\u0169\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\26\2\2\u0170\u0171\5"+
		"(\25\2\u0171\u0172\7\27\2\2\u0172\u0173\5(\25\2\u0173\u0174\7\30\2\2\u0174"+
		"\u0175\5(\25\2\u0175\u0177\7+\2\2\u0176\u0178\5\34\17\2\u0177\u0176\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\7,\2\2\u017c/\3\2\2\2\u017d\u017e\7\24\2\2"+
		"\u017e\u0180\7+\2\2\u017f\u0181\5\34\17\2\u0180\u017f\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\7,\2\2\u0185\u0186\7\23\2\2\u0186\u0187\7\65\2\2\u0187\u0188\5"+
		"@!\2\u0188\u0189\7\66\2\2\u0189\u018a\7\62\2\2\u018a\61\3\2\2\2\u018b"+
		"\u018c\7\23\2\2\u018c\u018d\7\65\2\2\u018d\u018e\5@!\2\u018e\u018f\7\66"+
		"\2\2\u018f\u0190\7\24\2\2\u0190\u0192\7+\2\2\u0191\u0193\5\34\17\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0197\7,\2\2\u0197\63\3\2\2\2\u0198\u0199"+
		"\7\13\2\2\u0199\u019a\7\65\2\2\u019a\u019b\5@!\2\u019b\u019c\7\66\2\2"+
		"\u019c\u019d\7\16\2\2\u019d\u019f\7+\2\2\u019e\u01a0\5\34\17\2\u019f\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\7,\2\2\u01a4\u01a6\5\66\34\2\u01a5\u01a4\3"+
		"\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\58\35\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\65\3\2\2\2\u01aa\u01ac\79\2\2"+
		"\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7\r\2\2\u01b1"+
		"\u01b2\7\65\2\2\u01b2\u01b3\5@!\2\u01b3\u01b4\7\66\2\2\u01b4\u01b5\7\16"+
		"\2\2\u01b5\u01b7\7+\2\2\u01b6\u01b8\5\34\17\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bc\7,\2\2\u01bc\u01bd\5\66\34\2\u01bd\u01d2\3\2\2\2\u01be"+
		"\u01c0\79\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01c5\7\r\2\2\u01c5\u01c6\7\65\2\2\u01c6\u01c7\5@!\2\u01c7\u01c8\7\66"+
		"\2\2\u01c8\u01c9\7\16\2\2\u01c9\u01cb\7+\2\2\u01ca\u01cc\5\34\17\2\u01cb"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7,\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01ad\3\2\2\2\u01d1\u01c1\3\2\2\2\u01d2\67\3\2\2\2\u01d3\u01d5\79\2\2"+
		"\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7\f\2\2\u01da"+
		"\u01dc\7+\2\2\u01db\u01dd\5\34\17\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3"+
		"\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\7,\2\2\u01e19\3\2\2\2\u01e2\u01e3\7\17\2\2\u01e3\u01e4\7\65\2\2"+
		"\u01e4\u01e5\7\36\2\2\u01e5\u01e6\7\66\2\2\u01e6\u01e7\7+\2\2\u01e7\u01e8"+
		"\5<\37\2\u01e8\u01e9\7,\2\2\u01e9;\3\2\2\2\u01ea\u01eb\7\20\2\2\u01eb"+
		"\u01ec\5\16\b\2\u01ec\u01ee\78\2\2\u01ed\u01ef\5\34\17\2\u01ee\u01ed\3"+
		"\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\7\21\2\2\u01f3\u01f4\7\62\2\2\u01f4\u01f5\5"+
		"> \2\u01f5\u0203\3\2\2\2\u01f6\u01f7\7\20\2\2\u01f7\u01f8\5\16\b\2\u01f8"+
		"\u01fa\78\2\2\u01f9\u01fb\5\34\17\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3"+
		"\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\7\21\2\2\u01ff\u0200\7\62\2\2\u0200\u0201\5<\37\2\u0201\u0203\3"+
		"\2\2\2\u0202\u01ea\3\2\2\2\u0202\u01f6\3\2\2\2\u0203=\3\2\2\2\u0204\u0205"+
		"\7\22\2\2\u0205\u0207\78\2\2\u0206\u0208\5\34\17\2\u0207\u0206\3\2\2\2"+
		"\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020b\u020c\7\21\2\2\u020c\u020d\7\62\2\2\u020d?\3\2\2\2\u020e"+
		"\u020f\b!\1\2\u020f\u0210\7\65\2\2\u0210\u0211\5@!\2\u0211\u0212\7\66"+
		"\2\2\u0212\u0219\3\2\2\2\u0213\u0214\7$\2\2\u0214\u0219\5@!\b\u0215\u0219"+
		"\5B\"\2\u0216\u0219\7\36\2\2\u0217\u0219\7\3\2\2\u0218\u020e\3\2\2\2\u0218"+
		"\u0213\3\2\2\2\u0218\u0215\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2"+
		"\2\2\u0219\u0222\3\2\2\2\u021a\u021b\f\7\2\2\u021b\u021c\7\31\2\2\u021c"+
		"\u0221\5@!\b\u021d\u021e\f\6\2\2\u021e\u021f\7\32\2\2\u021f\u0221\5@!"+
		"\7\u0220\u021a\3\2\2\2\u0220\u021d\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223A\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0226\5,\27\2\u0226\u0227\5D#\2\u0227\u0228\5(\25\2\u0228C\3\2\2\2\u0229"+
		"\u022a\t\5\2\2\u022aE\3\2\2\2:IRY`ilqx\u0089\u0092\u0098\u00af\u00b6\u00be"+
		"\u00c5\u00d0\u00d6\u00dd\u00e3\u00ed\u00f5\u00fa\u0104\u0116\u011a\u012c"+
		"\u0137\u013e\u0145\u0147\u014f\u0157\u0159\u015e\u0165\u016d\u0179\u0182"+
		"\u0194\u01a1\u01a5\u01a8\u01ad\u01b9\u01c1\u01cd\u01d1\u01d6\u01de\u01f0"+
		"\u01fc\u0202\u0209\u0218\u0220\u0222";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}