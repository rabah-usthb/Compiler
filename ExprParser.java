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
		INPUT=1, OUTPUT=2, TYPE=3, MAIN=4, VAR=5, BEGIN=6, END=7, IF=8, ELSE=9, 
		ELSIF=10, THEN=11, SWITCH=12, CASE=13, BREAK=14, DEFAULT=15, WHILE=16, 
		DO=17, FOR=18, FROM=19, TO=20, STEP=21, AND=22, OR=23, LET=24, DEFINE=25, 
		CONST=26, IDF=27, INT=28, FLOAT=29, STRING=30, CHAR=31, AFFECT=32, NOT=33, 
		GREATER=34, LESSER=35, GEQ=36, LEQ=37, EQ=38, NEQ=39, LBRACE=40, RBRACE=41, 
		PLUS=42, SUB=43, MUL=44, DIV=45, COM=46, SEMI=47, LBRACKET=48, RBRACKET=49, 
		LPAR=50, RPAR=51, ASSIGN=52, TWOPOINT=53, COMMENT=54, WS=55, ERROR_TOKEN=56;
	public static final int
		RULE_prog = 0, RULE_varBlock = 1, RULE_declaration = 2, RULE_listIDF = 3, 
		RULE_normalDeclaration = 4, RULE_sign = 5, RULE_affectValue = 6, RULE_number = 7, 
		RULE_arrayDeclaration = 8, RULE_affectArray = 9, RULE_declarationKeyword = 10, 
		RULE_listNumber = 11, RULE_mainCode = 12, RULE_inst = 13, RULE_input = 14, 
		RULE_output = 15, RULE_content = 16, RULE_affectInst = 17, RULE_arithmeticExpression = 18, 
		RULE_operator = 19, RULE_var = 20, RULE_operation = 21, RULE_forInst = 22, 
		RULE_doWhileInst = 23, RULE_whileInst = 24, RULE_ifInst = 25, RULE_elseIfInst = 26, 
		RULE_elseInst = 27, RULE_switchInst = 28, RULE_caseInst = 29, RULE_defaultInst = 30, 
		RULE_condition = 31, RULE_partCondition = 32, RULE_comparaisonOperator = 33, 
		RULE_logicalOperator = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "varBlock", "declaration", "listIDF", "normalDeclaration", "sign", 
			"affectValue", "number", "arrayDeclaration", "affectArray", "declarationKeyword", 
			"listNumber", "mainCode", "inst", "input", "output", "content", "affectInst", 
			"arithmeticExpression", "operator", "var", "operation", "forInst", "doWhileInst", 
			"whileInst", "ifInst", "elseIfInst", "elseInst", "switchInst", "caseInst", 
			"defaultInst", "condition", "partCondition", "comparaisonOperator", "logicalOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'input'", "'output'", null, "'MainPrgm'", "'Var'", "'BeginPg'", 
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
			null, "INPUT", "OUTPUT", "TYPE", "MAIN", "VAR", "BEGIN", "END", "IF", 
			"ELSE", "ELSIF", "THEN", "SWITCH", "CASE", "BREAK", "DEFAULT", "WHILE", 
			"DO", "FOR", "FROM", "TO", "STEP", "AND", "OR", "LET", "DEFINE", "CONST", 
			"IDF", "INT", "FLOAT", "STRING", "CHAR", "AFFECT", "NOT", "GREATER", 
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(70);
				match(COMMENT);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(MAIN);
			setState(77);
			match(IDF);
			setState(78);
			match(SEMI);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(79);
				match(COMMENT);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			varBlock();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(86);
				match(COMMENT);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			mainCode();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(93);
				match(COMMENT);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(EOF);
			IDF_HashTable.table.printTable();
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(VAR);
				setState(104); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(103);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(106); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				normalDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
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
			setState(116);
			match(IDF);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(117);
				match(COM);
				setState(118);
				match(IDF);
				}
				}
				setState(123);
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
		public ListIDFContext listIDF;
		public Token TYPE;
		public AffectValueContext affectValue;
		public DeclarationKeywordContext declarationKeyword() {
			return getRuleContext(DeclarationKeywordContext.class,0);
		}
		public ListIDFContext listIDF() {
			return getRuleContext(ListIDFContext.class,0);
		}
		public TerminalNode TWOPOINT() { return getToken(ExprParser.TWOPOINT, 0); }
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(ExprParser.ASSIGN, 0); }
		public AffectValueContext affectValue() {
			return getRuleContext(AffectValueContext.class,0);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				declarationKeyword();
				setState(125);
				((NormalDeclarationContext)_localctx).listIDF = listIDF();
				setState(126);
				match(TWOPOINT);
				setState(127);
				((NormalDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(128);
				match(ASSIGN);
				setState(129);
				((NormalDeclarationContext)_localctx).affectValue = affectValue();
				setState(130);
				match(SEMI);

				    for (String idf : (((NormalDeclarationContext)_localctx).listIDF!=null?_input.getText(((NormalDeclarationContext)_localctx).listIDF.start,((NormalDeclarationContext)_localctx).listIDF.stop):null).split(",")) { 
				        IDF_HashTable.table.updateTypeValue(idf.trim(), (((NormalDeclarationContext)_localctx).TYPE!=null?((NormalDeclarationContext)_localctx).TYPE.getText():null),(((NormalDeclarationContext)_localctx).affectValue!=null?_input.getText(((NormalDeclarationContext)_localctx).affectValue.start,((NormalDeclarationContext)_localctx).affectValue.stop):null),((NormalDeclarationContext)_localctx).affectValue.type);
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				declarationKeyword();
				setState(134);
				((NormalDeclarationContext)_localctx).listIDF = listIDF();
				setState(135);
				match(TWOPOINT);
				setState(136);
				((NormalDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(137);
				match(SEMI);

				    for (String idf : (((NormalDeclarationContext)_localctx).listIDF!=null?_input.getText(((NormalDeclarationContext)_localctx).listIDF.start,((NormalDeclarationContext)_localctx).listIDF.stop):null).split(",")) { 
				        IDF_HashTable.table.updateType(idf.trim(), (((NormalDeclarationContext)_localctx).TYPE!=null?((NormalDeclarationContext)_localctx).TYPE.getText():null));
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ExprParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==SUB) ) {
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
		enterRule(_localctx, 12, RULE_affectValue);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((AffectValueContext)_localctx).number = number();
				((AffectValueContext)_localctx).type =  ((AffectValueContext)_localctx).number.type;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(STRING);
				((AffectValueContext)_localctx).type =  "STRING";
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
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
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
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
		enterRule(_localctx, 14, RULE_number);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(LPAR);
				setState(154);
				sign();
				setState(155);
				match(INT);
				setState(156);
				match(RPAR);
				 ((NumberContext)_localctx).type =  "INT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(LPAR);
				setState(160);
				sign();
				setState(161);
				match(FLOAT);
				setState(162);
				match(RPAR);
				 ((NumberContext)_localctx).type =  "FLOAT"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(INT);
				 ((NumberContext)_localctx).type =  "INT"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(FLOAT);
				 ((NumberContext)_localctx).type =  "FLOAT"; 
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
		enterRule(_localctx, 16, RULE_arrayDeclaration);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				declarationKeyword();
				setState(172);
				listIDF();
				setState(173);
				match(TWOPOINT);
				setState(174);
				match(LBRACKET);
				setState(175);
				match(TYPE);
				setState(176);
				match(SEMI);
				setState(177);
				match(INT);
				setState(178);
				match(RBRACKET);
				setState(179);
				affectArray();
				setState(180);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				declarationKeyword();
				setState(183);
				listIDF();
				setState(184);
				match(TWOPOINT);
				setState(185);
				match(LBRACKET);
				setState(186);
				match(TYPE);
				setState(187);
				match(SEMI);
				setState(188);
				match(INT);
				setState(189);
				match(RBRACKET);
				setState(190);
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
		public ListNumberContext listNumber() {
			return getRuleContext(ListNumberContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
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
		enterRule(_localctx, 18, RULE_affectArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ASSIGN);
			setState(195);
			match(LBRACE);
			setState(196);
			listNumber();
			setState(197);
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
		enterRule(_localctx, 20, RULE_declarationKeyword);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(DEFINE);
				setState(200);
				match(CONST);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
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

	public static class ListNumberContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(ExprParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(ExprParser.COM, i);
		}
		public ListNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterListNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitListNumber(this);
		}
	}

	public final ListNumberContext listNumber() throws RecognitionException {
		ListNumberContext _localctx = new ListNumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			number();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(205);
				match(COM);
				setState(206);
				number();
				}
				}
				setState(211);
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
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(BEGIN);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(213);
					match(COMMENT);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(LBRACE);
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					inst();
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(225);
				match(RBRACE);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(226);
					match(COMMENT);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(END);
				setState(233);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(BEGIN);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(236);
					match(COMMENT);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(LBRACE);
				setState(243);
				match(RBRACE);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(244);
					match(COMMENT);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(END);
				setState(251);
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
		public ForInstContext forInst() {
			return getRuleContext(ForInstContext.class,0);
		}
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
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				output();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				input();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				affectInst();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(COMMENT);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				forInst();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				doWhileInst();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				whileInst();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				ifInst();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 9);
				{
				setState(262);
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
			setState(265);
			match(INPUT);
			setState(266);
			match(LPAR);
			setState(267);
			listIDF();
			setState(268);
			match(RPAR);
			setState(269);
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
			setState(271);
			match(OUTPUT);
			setState(272);
			match(LPAR);
			setState(273);
			content();
			setState(274);
			match(RPAR);
			setState(275);
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
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(277);
						_la = _input.LA(1);
						if ( !(_la==IDF || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						match(COM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(281); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(283);
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
				setState(284);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			var();
			setState(288);
			match(AFFECT);
			setState(289);
			arithmeticExpression(0);
			setState(290);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ExprParser.LPAR, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ExprParser.RPAR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(293);
				match(LPAR);
				setState(294);
				arithmeticExpression(0);
				setState(295);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(297);
				operator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
					setState(300);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(301);
					operation();
					setState(302);
					arithmeticExpression(4);
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 38, RULE_operator);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				number();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
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
		enterRule(_localctx, 40, RULE_var);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(IDF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(IDF);
				setState(315);
				match(LBRACKET);
				setState(316);
				match(INT);
				setState(317);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ExprParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
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
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
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
			setState(322);
			match(FOR);
			setState(323);
			match(IDF);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				setState(324);
				operation();
				setState(325);
				arithmeticExpression(0);
				}
			}

			setState(329);
			match(FROM);
			setState(330);
			arithmeticExpression(0);
			setState(331);
			match(TO);
			setState(332);
			arithmeticExpression(0);
			setState(333);
			match(STEP);
			setState(334);
			arithmeticExpression(0);
			setState(335);
			match(LBRACE);
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(336);
				inst();
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(341);
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
			setState(343);
			match(DO);
			setState(344);
			match(LBRACE);
			setState(346); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345);
				inst();
				}
				}
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(350);
			match(RBRACE);
			setState(351);
			match(WHILE);
			setState(352);
			match(LPAR);
			setState(353);
			condition(0);
			setState(354);
			match(RPAR);
			setState(355);
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
			setState(357);
			match(WHILE);
			setState(358);
			match(LPAR);
			setState(359);
			condition(0);
			setState(360);
			match(RPAR);
			setState(361);
			match(DO);
			setState(362);
			match(LBRACE);
			setState(364); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(363);
				inst();
				}
				}
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(368);
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
			setState(370);
			match(IF);
			setState(371);
			match(LPAR);
			setState(372);
			condition(0);
			setState(373);
			match(RPAR);
			setState(374);
			match(THEN);
			setState(375);
			match(LBRACE);
			setState(377); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(376);
				inst();
				}
				}
				setState(379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(381);
			match(RBRACE);
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(382);
				elseIfInst();
				}
				break;
			}
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(385);
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
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(388);
					match(COMMENT);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				match(ELSIF);
				setState(395);
				match(LPAR);
				setState(396);
				condition(0);
				setState(397);
				match(RPAR);
				setState(398);
				match(THEN);
				setState(399);
				match(LBRACE);
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(400);
					inst();
					}
					}
					setState(403); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(405);
				match(RBRACE);
				setState(406);
				elseIfInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(408);
					match(COMMENT);
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414);
				match(ELSIF);
				setState(415);
				match(LPAR);
				setState(416);
				condition(0);
				setState(417);
				match(RPAR);
				setState(418);
				match(THEN);
				setState(419);
				match(LBRACE);
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(420);
					inst();
					}
					}
					setState(423); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(425);
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
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(429);
				match(COMMENT);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			match(ELSE);
			setState(436);
			match(LBRACE);
			setState(438); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(437);
				inst();
				}
				}
				setState(440); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(442);
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
			setState(444);
			match(SWITCH);
			setState(445);
			match(LPAR);
			setState(446);
			match(IDF);
			setState(447);
			match(RPAR);
			setState(448);
			match(LBRACE);
			setState(449);
			caseInst();
			setState(450);
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
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(CASE);
				setState(453);
				number();
				setState(454);
				match(TWOPOINT);
				setState(456); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(455);
					inst();
					}
					}
					setState(458); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(460);
				match(BREAK);
				setState(461);
				match(SEMI);
				setState(462);
				defaultInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(CASE);
				setState(465);
				number();
				setState(466);
				match(TWOPOINT);
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(472);
				match(BREAK);
				setState(473);
				match(SEMI);
				setState(474);
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
			setState(478);
			match(DEFAULT);
			setState(479);
			match(TWOPOINT);
			setState(481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(480);
				inst();
				}
				}
				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(485);
			match(BREAK);
			setState(486);
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
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
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
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(489);
				match(LPAR);
				setState(490);
				condition(0);
				setState(491);
				match(RPAR);
				}
				break;
			case NOT:
				{
				setState(493);
				match(NOT);
				setState(494);
				match(LPAR);
				setState(495);
				condition(0);
				setState(496);
				match(RPAR);
				}
				break;
			case IDF:
				{
				setState(498);
				partCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(501);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(502);
					logicalOperator();
					setState(503);
					condition(3);
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
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
			setState(510);
			match(IDF);
			setState(511);
			comparaisonOperator();
			setState(512);
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
			setState(514);
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
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
		case 18:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 31:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0209\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\2\3\2\7"+
		"\2S\n\2\f\2\16\2V\13\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\7\2a\n"+
		"\2\f\2\16\2d\13\2\3\2\3\2\3\2\3\3\3\3\6\3k\n\3\r\3\16\3l\3\3\5\3p\n\3"+
		"\3\4\3\4\3\4\5\4u\n\4\3\5\3\5\3\5\7\5z\n\5\f\5\16\5}\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008f\n\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00c3\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00cd\n\f\3\r\3"+
		"\r\3\r\7\r\u00d2\n\r\f\r\16\r\u00d5\13\r\3\16\3\16\7\16\u00d9\n\16\f\16"+
		"\16\16\u00dc\13\16\3\16\3\16\6\16\u00e0\n\16\r\16\16\16\u00e1\3\16\3\16"+
		"\7\16\u00e6\n\16\f\16\16\16\u00e9\13\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u00f0\n\16\f\16\16\16\u00f3\13\16\3\16\3\16\3\16\7\16\u00f8\n\16\f\16"+
		"\16\16\u00fb\13\16\3\16\3\16\5\16\u00ff\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u010a\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\6\22\u011a\n\22\r\22\16\22\u011b\3"+
		"\22\3\22\5\22\u0120\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u012d\n\24\3\24\3\24\3\24\3\24\7\24\u0133\n\24\f\24\16"+
		"\24\u0136\13\24\3\25\3\25\5\25\u013a\n\25\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0141\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u014a\n\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0154\n\30\r\30\16\30\u0155\3\30"+
		"\3\30\3\31\3\31\3\31\6\31\u015d\n\31\r\31\16\31\u015e\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u016f\n\32"+
		"\r\32\16\32\u0170\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u017c"+
		"\n\33\r\33\16\33\u017d\3\33\3\33\5\33\u0182\n\33\3\33\5\33\u0185\n\33"+
		"\3\34\7\34\u0188\n\34\f\34\16\34\u018b\13\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\6\34\u0194\n\34\r\34\16\34\u0195\3\34\3\34\3\34\3\34\7\34\u019c"+
		"\n\34\f\34\16\34\u019f\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u01a8"+
		"\n\34\r\34\16\34\u01a9\3\34\3\34\5\34\u01ae\n\34\3\35\7\35\u01b1\n\35"+
		"\f\35\16\35\u01b4\13\35\3\35\3\35\3\35\6\35\u01b9\n\35\r\35\16\35\u01ba"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\6\37\u01cb\n\37\r\37\16\37\u01cc\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\6\37\u01d7\n\37\r\37\16\37\u01d8\3\37\3\37\3\37\3\37\5\37\u01df\n"+
		"\37\3 \3 \3 \6 \u01e4\n \r \16 \u01e5\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u01f6\n!\3!\3!\3!\3!\7!\u01fc\n!\f!\16!\u01ff\13!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3$\2\4&@%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDF\2\7\3\2,-\4\2\35\35  \3\2,/\3\2$)\4\2\30"+
		"\31##\2\u0220\2K\3\2\2\2\4o\3\2\2\2\6t\3\2\2\2\bv\3\2\2\2\n\u008e\3\2"+
		"\2\2\f\u0090\3\2\2\2\16\u0099\3\2\2\2\20\u00ab\3\2\2\2\22\u00c2\3\2\2"+
		"\2\24\u00c4\3\2\2\2\26\u00cc\3\2\2\2\30\u00ce\3\2\2\2\32\u00fe\3\2\2\2"+
		"\34\u0109\3\2\2\2\36\u010b\3\2\2\2 \u0111\3\2\2\2\"\u011f\3\2\2\2$\u0121"+
		"\3\2\2\2&\u012c\3\2\2\2(\u0139\3\2\2\2*\u0140\3\2\2\2,\u0142\3\2\2\2."+
		"\u0144\3\2\2\2\60\u0159\3\2\2\2\62\u0167\3\2\2\2\64\u0174\3\2\2\2\66\u01ad"+
		"\3\2\2\28\u01b2\3\2\2\2:\u01be\3\2\2\2<\u01de\3\2\2\2>\u01e0\3\2\2\2@"+
		"\u01f5\3\2\2\2B\u0200\3\2\2\2D\u0204\3\2\2\2F\u0206\3\2\2\2HJ\78\2\2I"+
		"H\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\6\2\2"+
		"OP\7\35\2\2PT\7\61\2\2QS\78\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2UW\3\2\2\2VT\3\2\2\2W[\5\4\3\2XZ\78\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^b\5\32\16\2_a\78\2\2`_\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\2\2\3fg\b\2\1\2g\3"+
		"\3\2\2\2hj\7\7\2\2ik\5\6\4\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m"+
		"p\3\2\2\2np\7\7\2\2oh\3\2\2\2on\3\2\2\2p\5\3\2\2\2qu\5\n\6\2ru\5\22\n"+
		"\2su\78\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\7\3\2\2\2v{\7\35\2\2wx\7\60"+
		"\2\2xz\7\35\2\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\t\3\2\2\2}{\3"+
		"\2\2\2~\177\5\26\f\2\177\u0080\5\b\5\2\u0080\u0081\7\67\2\2\u0081\u0082"+
		"\7\5\2\2\u0082\u0083\7\66\2\2\u0083\u0084\5\16\b\2\u0084\u0085\7\61\2"+
		"\2\u0085\u0086\b\6\1\2\u0086\u008f\3\2\2\2\u0087\u0088\5\26\f\2\u0088"+
		"\u0089\5\b\5\2\u0089\u008a\7\67\2\2\u008a\u008b\7\5\2\2\u008b\u008c\7"+
		"\61\2\2\u008c\u008d\b\6\1\2\u008d\u008f\3\2\2\2\u008e~\3\2\2\2\u008e\u0087"+
		"\3\2\2\2\u008f\13\3\2\2\2\u0090\u0091\t\2\2\2\u0091\r\3\2\2\2\u0092\u0093"+
		"\5\20\t\2\u0093\u0094\b\b\1\2\u0094\u009a\3\2\2\2\u0095\u0096\7 \2\2\u0096"+
		"\u009a\b\b\1\2\u0097\u0098\7!\2\2\u0098\u009a\b\b\1\2\u0099\u0092\3\2"+
		"\2\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2\2\2\u009a\17\3\2\2\2\u009b\u009c"+
		"\7\64\2\2\u009c\u009d\5\f\7\2\u009d\u009e\7\36\2\2\u009e\u009f\7\65\2"+
		"\2\u009f\u00a0\b\t\1\2\u00a0\u00ac\3\2\2\2\u00a1\u00a2\7\64\2\2\u00a2"+
		"\u00a3\5\f\7\2\u00a3\u00a4\7\37\2\2\u00a4\u00a5\7\65\2\2\u00a5\u00a6\b"+
		"\t\1\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\7\36\2\2\u00a8\u00ac\b\t\1\2\u00a9"+
		"\u00aa\7\37\2\2\u00aa\u00ac\b\t\1\2\u00ab\u009b\3\2\2\2\u00ab\u00a1\3"+
		"\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\21\3\2\2\2\u00ad"+
		"\u00ae\5\26\f\2\u00ae\u00af\5\b\5\2\u00af\u00b0\7\67\2\2\u00b0\u00b1\7"+
		"\62\2\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7\36\2\2"+
		"\u00b4\u00b5\7\63\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7\61\2\2\u00b7"+
		"\u00c3\3\2\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb\7"+
		"\67\2\2\u00bb\u00bc\7\62\2\2\u00bc\u00bd\7\5\2\2\u00bd\u00be\7\61\2\2"+
		"\u00be\u00bf\7\36\2\2\u00bf\u00c0\7\63\2\2\u00c0\u00c1\7\61\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00ad\3\2\2\2\u00c2\u00b8\3\2\2\2\u00c3\23\3\2\2"+
		"\2\u00c4\u00c5\7\66\2\2\u00c5\u00c6\7*\2\2\u00c6\u00c7\5\30\r\2\u00c7"+
		"\u00c8\7+\2\2\u00c8\25\3\2\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00cd\7\34\2"+
		"\2\u00cb\u00cd\7\32\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\27\3\2\2\2\u00ce\u00d3\5\20\t\2\u00cf\u00d0\7\60\2\2\u00d0\u00d2\5\20"+
		"\t\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\31\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00da\7\b\2"+
		"\2\u00d7\u00d9\78\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\7*\2\2\u00de\u00e0\5\34\17\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e7\7+\2\2\u00e4\u00e6\78\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2"+
		"\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00eb\7\t\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ff\3\2\2\2"+
		"\u00ed\u00f1\7\b\2\2\u00ee\u00f0\78\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f5\7*\2\2\u00f5\u00f9\7+\2\2\u00f6\u00f8\78\2"+
		"\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\t\2\2\u00fd"+
		"\u00ff\7\61\2\2\u00fe\u00d6\3\2\2\2\u00fe\u00ed\3\2\2\2\u00ff\33\3\2\2"+
		"\2\u0100\u010a\5 \21\2\u0101\u010a\5\36\20\2\u0102\u010a\5$\23\2\u0103"+
		"\u010a\78\2\2\u0104\u010a\5.\30\2\u0105\u010a\5\60\31\2\u0106\u010a\5"+
		"\62\32\2\u0107\u010a\5\64\33\2\u0108\u010a\5:\36\2\u0109\u0100\3\2\2\2"+
		"\u0109\u0101\3\2\2\2\u0109\u0102\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0104"+
		"\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\35\3\2\2\2\u010b\u010c\7\3\2\2\u010c\u010d\7\64\2"+
		"\2\u010d\u010e\5\b\5\2\u010e\u010f\7\65\2\2\u010f\u0110\7\61\2\2\u0110"+
		"\37\3\2\2\2\u0111\u0112\7\4\2\2\u0112\u0113\7\64\2\2\u0113\u0114\5\"\22"+
		"\2\u0114\u0115\7\65\2\2\u0115\u0116\7\61\2\2\u0116!\3\2\2\2\u0117\u0118"+
		"\t\3\2\2\u0118\u011a\7\60\2\2\u0119\u0117\3\2\2\2\u011a\u011b\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120"+
		"\t\3\2\2\u011e\u0120\t\3\2\2\u011f\u0119\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"#\3\2\2\2\u0121\u0122\5*\26\2\u0122\u0123\7\"\2\2\u0123\u0124\5&\24\2"+
		"\u0124\u0125\7\61\2\2\u0125%\3\2\2\2\u0126\u0127\b\24\1\2\u0127\u0128"+
		"\7\64\2\2\u0128\u0129\5&\24\2\u0129\u012a\7\65\2\2\u012a\u012d\3\2\2\2"+
		"\u012b\u012d\5(\25\2\u012c\u0126\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0134"+
		"\3\2\2\2\u012e\u012f\f\5\2\2\u012f\u0130\5,\27\2\u0130\u0131\5&\24\6\u0131"+
		"\u0133\3\2\2\2\u0132\u012e\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\'\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013a"+
		"\5\20\t\2\u0138\u013a\5*\26\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2"+
		"\u013a)\3\2\2\2\u013b\u0141\7\35\2\2\u013c\u013d\7\35\2\2\u013d\u013e"+
		"\7\62\2\2\u013e\u013f\7\36\2\2\u013f\u0141\7\63\2\2\u0140\u013b\3\2\2"+
		"\2\u0140\u013c\3\2\2\2\u0141+\3\2\2\2\u0142\u0143\t\4\2\2\u0143-\3\2\2"+
		"\2\u0144\u0145\7\24\2\2\u0145\u0149\7\35\2\2\u0146\u0147\5,\27\2\u0147"+
		"\u0148\5&\24\2\u0148\u014a\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7\25\2\2\u014c\u014d\5&\24\2\u014d"+
		"\u014e\7\26\2\2\u014e\u014f\5&\24\2\u014f\u0150\7\27\2\2\u0150\u0151\5"+
		"&\24\2\u0151\u0153\7*\2\2\u0152\u0154\5\34\17\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\7+\2\2\u0158/\3\2\2\2\u0159\u015a\7\23\2\2\u015a\u015c"+
		"\7*\2\2\u015b\u015d\5\34\17\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161"+
		"\7+\2\2\u0161\u0162\7\22\2\2\u0162\u0163\7\64\2\2\u0163\u0164\5@!\2\u0164"+
		"\u0165\7\65\2\2\u0165\u0166\7\61\2\2\u0166\61\3\2\2\2\u0167\u0168\7\22"+
		"\2\2\u0168\u0169\7\64\2\2\u0169\u016a\5@!\2\u016a\u016b\7\65\2\2\u016b"+
		"\u016c\7\23\2\2\u016c\u016e\7*\2\2\u016d\u016f\5\34\17\2\u016e\u016d\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\7+\2\2\u0173\63\3\2\2\2\u0174\u0175\7\n\2\2"+
		"\u0175\u0176\7\64\2\2\u0176\u0177\5@!\2\u0177\u0178\7\65\2\2\u0178\u0179"+
		"\7\r\2\2\u0179\u017b\7*\2\2\u017a\u017c\5\34\17\2\u017b\u017a\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0181\7+\2\2\u0180\u0182\5\66\34\2\u0181\u0180\3\2\2\2"+
		"\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0185\58\35\2\u0184\u0183"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\65\3\2\2\2\u0186\u0188\78\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\f\2\2\u018d"+
		"\u018e\7\64\2\2\u018e\u018f\5@!\2\u018f\u0190\7\65\2\2\u0190\u0191\7\r"+
		"\2\2\u0191\u0193\7*\2\2\u0192\u0194\5\34\17\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\7+\2\2\u0198\u0199\5\66\34\2\u0199\u01ae\3\2\2\2\u019a"+
		"\u019c\78\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a1\7\f\2\2\u01a1\u01a2\7\64\2\2\u01a2\u01a3\5@!\2\u01a3\u01a4\7\65"+
		"\2\2\u01a4\u01a5\7\r\2\2\u01a5\u01a7\7*\2\2\u01a6\u01a8\5\34\17\2\u01a7"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7+\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u0189\3\2\2\2\u01ad\u019d\3\2\2\2\u01ae\67\3\2\2\2\u01af\u01b1\78\2\2"+
		"\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7\13\2\2"+
		"\u01b6\u01b8\7*\2\2\u01b7\u01b9\5\34\17\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\7+\2\2\u01bd9\3\2\2\2\u01be\u01bf\7\16\2\2\u01bf\u01c0\7\64\2\2"+
		"\u01c0\u01c1\7\35\2\2\u01c1\u01c2\7\65\2\2\u01c2\u01c3\7*\2\2\u01c3\u01c4"+
		"\5<\37\2\u01c4\u01c5\7+\2\2\u01c5;\3\2\2\2\u01c6\u01c7\7\17\2\2\u01c7"+
		"\u01c8\5\20\t\2\u01c8\u01ca\7\67\2\2\u01c9\u01cb\5\34\17\2\u01ca\u01c9"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cf\7\20\2\2\u01cf\u01d0\7\61\2\2\u01d0\u01d1\5"+
		"> \2\u01d1\u01df\3\2\2\2\u01d2\u01d3\7\17\2\2\u01d3\u01d4\5\20\t\2\u01d4"+
		"\u01d6\7\67\2\2\u01d5\u01d7\5\34\17\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\7\20\2\2\u01db\u01dc\7\61\2\2\u01dc\u01dd\5<\37\2\u01dd\u01df\3"+
		"\2\2\2\u01de\u01c6\3\2\2\2\u01de\u01d2\3\2\2\2\u01df=\3\2\2\2\u01e0\u01e1"+
		"\7\21\2\2\u01e1\u01e3\7\67\2\2\u01e2\u01e4\5\34\17\2\u01e3\u01e2\3\2\2"+
		"\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e8\7\20\2\2\u01e8\u01e9\7\61\2\2\u01e9?\3\2\2\2\u01ea"+
		"\u01eb\b!\1\2\u01eb\u01ec\7\64\2\2\u01ec\u01ed\5@!\2\u01ed\u01ee\7\65"+
		"\2\2\u01ee\u01f6\3\2\2\2\u01ef\u01f0\7#\2\2\u01f0\u01f1\7\64\2\2\u01f1"+
		"\u01f2\5@!\2\u01f2\u01f3\7\65\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f6\5B\""+
		"\2\u01f5\u01ea\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01fd"+
		"\3\2\2\2\u01f7\u01f8\f\4\2\2\u01f8\u01f9\5F$\2\u01f9\u01fa\5@!\5\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01f7\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01feA\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201"+
		"\7\35\2\2\u0201\u0202\5D#\2\u0202\u0203\5&\24\2\u0203C\3\2\2\2\u0204\u0205"+
		"\t\5\2\2\u0205E\3\2\2\2\u0206\u0207\t\6\2\2\u0207G\3\2\2\2\61KT[blot{"+
		"\u008e\u0099\u00ab\u00c2\u00cc\u00d3\u00da\u00e1\u00e7\u00f1\u00f9\u00fe"+
		"\u0109\u011b\u011f\u012c\u0134\u0139\u0140\u0149\u0155\u015e\u0170\u017d"+
		"\u0181\u0184\u0189\u0195\u019d\u01a9\u01ad\u01b2\u01ba\u01cc\u01d8\u01de"+
		"\u01e5\u01f5\u01fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}