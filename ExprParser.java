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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INPUT=13, OUTPUT=14, TYPE=15, MAIN=16, VAR=17, 
		BEGIN=18, END=19, IF=20, ELSE=21, ELSIF=22, THEN=23, SWITCH=24, CASE=25, 
		BREAK=26, DEFAULT=27, WHILE=28, DO=29, FOR=30, FROM=31, TO=32, STEP=33, 
		AND=34, OR=35, LET=36, DEFINE=37, CONST=38, IDF=39, INT=40, FLOAT=41, 
		STRING=42, AFFECT=43, NOT=44, COMPARAISONOPERATOR=45, LBRACE=46, RBRACE=47, 
		Separators=48, COMMENT=49, WS=50, ERROR_TOKEN=51;
	public static final int
		RULE_prog = 0, RULE_varBlock = 1, RULE_declaration = 2, RULE_listIDF = 3, 
		RULE_normalDeclaration = 4, RULE_sign = 5, RULE_affectValue = 6, RULE_number = 7, 
		RULE_arrayDeclaration = 8, RULE_affectArray = 9, RULE_declarationKeyword = 10, 
		RULE_listNumber = 11, RULE_mainCode = 12, RULE_inst = 13, RULE_input = 14, 
		RULE_output = 15, RULE_content = 16, RULE_affectInst = 17, RULE_arithmeticExpression = 18, 
		RULE_operator = 19, RULE_var = 20, RULE_operation = 21, RULE_forInst = 22, 
		RULE_doWhileInst = 23, RULE_whileInst = 24, RULE_ifInst = 25, RULE_elseIfInst = 26, 
		RULE_elseInst = 27, RULE_switchInst = 28, RULE_caseInst = 29, RULE_defaultInst = 30, 
		RULE_condition = 31, RULE_partCondition = 32, RULE_logicalOperator = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "varBlock", "declaration", "listIDF", "normalDeclaration", "sign", 
			"affectValue", "number", "arrayDeclaration", "affectArray", "declarationKeyword", 
			"listNumber", "mainCode", "inst", "input", "output", "content", "affectInst", 
			"arithmeticExpression", "operator", "var", "operation", "forInst", "doWhileInst", 
			"whileInst", "ifInst", "elseIfInst", "elseInst", "switchInst", "caseInst", 
			"defaultInst", "condition", "partCondition", "logicalOperator"
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
			match(T__0);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(VAR);
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(101);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				normalDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
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
			setState(114);
			match(IDF);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(115);
				match(T__1);
				setState(116);
				match(IDF);
				}
				}
				setState(121);
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
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public AffectValueContext affectValue() {
			return getRuleContext(AffectValueContext.class,0);
		}
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				declarationKeyword();
				setState(123);
				((NormalDeclarationContext)_localctx).listIDF = listIDF();
				setState(124);
				match(T__2);
				setState(125);
				((NormalDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(126);
				match(T__3);
				setState(127);
				((NormalDeclarationContext)_localctx).affectValue = affectValue();
				setState(128);
				match(T__0);

				    for (String idf : (((NormalDeclarationContext)_localctx).listIDF!=null?_input.getText(((NormalDeclarationContext)_localctx).listIDF.start,((NormalDeclarationContext)_localctx).listIDF.stop):null).split(",")) { 
				        IDF_HashTable.table.updateTypeValue(idf.trim(), (((NormalDeclarationContext)_localctx).TYPE!=null?((NormalDeclarationContext)_localctx).TYPE.getText():null),(((NormalDeclarationContext)_localctx).affectValue!=null?_input.getText(((NormalDeclarationContext)_localctx).affectValue.start,((NormalDeclarationContext)_localctx).affectValue.stop):null),((NormalDeclarationContext)_localctx).affectValue.type);
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				declarationKeyword();
				setState(132);
				((NormalDeclarationContext)_localctx).listIDF = listIDF();
				setState(133);
				match(T__2);
				setState(134);
				((NormalDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(135);
				match(T__0);

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
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((AffectValueContext)_localctx).number = number();
			((AffectValueContext)_localctx).type =  ((AffectValueContext)_localctx).number.type;
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
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_number);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__6);
				setState(146);
				sign();
				setState(147);
				match(INT);
				setState(148);
				match(T__7);
				 ((NumberContext)_localctx).type =  "INT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__6);
				setState(152);
				sign();
				setState(153);
				match(FLOAT);
				setState(154);
				match(T__7);
				 ((NumberContext)_localctx).type =  "FLOAT"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(INT);
				 ((NumberContext)_localctx).type =  "INT"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
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
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				declarationKeyword();
				setState(164);
				listIDF();
				setState(165);
				match(T__2);
				setState(166);
				match(T__8);
				setState(167);
				match(TYPE);
				setState(168);
				match(T__0);
				setState(169);
				match(INT);
				setState(170);
				match(T__9);
				setState(171);
				affectArray();
				setState(172);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				declarationKeyword();
				setState(175);
				listIDF();
				setState(176);
				match(T__2);
				setState(177);
				match(T__8);
				setState(178);
				match(TYPE);
				setState(179);
				match(T__0);
				setState(180);
				match(INT);
				setState(181);
				match(T__9);
				setState(182);
				match(T__0);
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
			setState(186);
			match(T__3);
			setState(187);
			match(LBRACE);
			setState(188);
			listNumber();
			setState(189);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(DEFINE);
				setState(192);
				match(CONST);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
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
			setState(196);
			number();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(197);
				match(T__1);
				setState(198);
				number();
				}
				}
				setState(203);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(BEGIN);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(205);
					match(COMMENT);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(LBRACE);
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(212);
					inst();
					}
					}
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(217);
				match(RBRACE);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(218);
					match(COMMENT);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(END);
				setState(225);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(BEGIN);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(228);
					match(COMMENT);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(LBRACE);
				setState(235);
				match(RBRACE);
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
				match(END);
				setState(243);
				match(T__0);
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
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				output();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				input();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				affectInst();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(COMMENT);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				forInst();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				doWhileInst();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				whileInst();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				ifInst();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
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
		public ListIDFContext listIDF() {
			return getRuleContext(ListIDFContext.class,0);
		}
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
			setState(257);
			match(INPUT);
			setState(258);
			match(T__6);
			setState(259);
			listIDF();
			setState(260);
			match(T__7);
			setState(261);
			match(T__0);
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
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
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
			setState(263);
			match(OUTPUT);
			setState(264);
			match(T__6);
			setState(265);
			content();
			setState(266);
			match(T__7);
			setState(267);
			match(T__0);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(269);
						_la = _input.LA(1);
						if ( !(_la==IDF || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						match(T__1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(275);
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
				setState(276);
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
			setState(279);
			var();
			setState(280);
			match(AFFECT);
			setState(281);
			arithmeticExpression(0);
			setState(282);
			match(T__0);
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
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(285);
				match(T__6);
				setState(286);
				arithmeticExpression(0);
				setState(287);
				match(T__7);
				}
				break;
			case 2:
				{
				setState(289);
				operator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
					setState(292);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(293);
					operation();
					setState(294);
					arithmeticExpression(4);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				number();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
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
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(IDF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(IDF);
				setState(307);
				match(T__8);
				setState(308);
				match(INT);
				setState(309);
				match(T__9);
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
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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
			setState(314);
			match(FOR);
			setState(315);
			match(IDF);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(316);
				operation();
				setState(317);
				arithmeticExpression(0);
				}
			}

			setState(321);
			match(FROM);
			setState(322);
			arithmeticExpression(0);
			setState(323);
			match(TO);
			setState(324);
			arithmeticExpression(0);
			setState(325);
			match(STEP);
			setState(326);
			arithmeticExpression(0);
			setState(327);
			match(LBRACE);
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				inst();
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(333);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
			setState(335);
			match(DO);
			setState(336);
			match(LBRACE);
			setState(338); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(337);
				inst();
				}
				}
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(342);
			match(RBRACE);
			setState(343);
			match(WHILE);
			setState(344);
			match(T__6);
			setState(345);
			condition(0);
			setState(346);
			match(T__7);
			setState(347);
			match(T__0);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
			setState(349);
			match(WHILE);
			setState(350);
			match(T__6);
			setState(351);
			condition(0);
			setState(352);
			match(T__7);
			setState(353);
			match(DO);
			setState(354);
			match(LBRACE);
			setState(356); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(355);
				inst();
				}
				}
				setState(358); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(360);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
			setState(362);
			match(IF);
			setState(363);
			match(T__6);
			setState(364);
			condition(0);
			setState(365);
			match(T__7);
			setState(366);
			match(THEN);
			setState(367);
			match(LBRACE);
			setState(369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				inst();
				}
				}
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(373);
			match(RBRACE);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(374);
				elseIfInst();
				}
				break;
			}
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(377);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(380);
					match(COMMENT);
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386);
				match(ELSIF);
				setState(387);
				match(T__6);
				setState(388);
				condition(0);
				setState(389);
				match(T__7);
				setState(390);
				match(THEN);
				setState(391);
				match(LBRACE);
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(392);
					inst();
					}
					}
					setState(395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(397);
				match(RBRACE);
				setState(398);
				elseIfInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(400);
					match(COMMENT);
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(ELSIF);
				setState(407);
				match(T__6);
				setState(408);
				condition(0);
				setState(409);
				match(T__7);
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(417);
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
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(421);
				match(COMMENT);
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			match(ELSE);
			setState(428);
			match(LBRACE);
			setState(430); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(429);
				inst();
				}
				}
				setState(432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(434);
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
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
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
			setState(436);
			match(SWITCH);
			setState(437);
			match(T__6);
			setState(438);
			match(IDF);
			setState(439);
			match(T__7);
			setState(440);
			match(LBRACE);
			setState(441);
			caseInst();
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

	public static class CaseInstContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ExprParser.CASE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
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
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(CASE);
				setState(445);
				number();
				setState(446);
				match(T__2);
				setState(448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(447);
					inst();
					}
					}
					setState(450); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(452);
				match(BREAK);
				setState(453);
				match(T__0);
				setState(454);
				defaultInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(CASE);
				setState(457);
				number();
				setState(458);
				match(T__2);
				setState(460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(459);
					inst();
					}
					}
					setState(462); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(464);
				match(BREAK);
				setState(465);
				match(T__0);
				setState(466);
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
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
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
			setState(470);
			match(DEFAULT);
			setState(471);
			match(T__2);
			setState(473); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(472);
				inst();
				}
				}
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(477);
			match(BREAK);
			setState(478);
			match(T__0);
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
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
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(481);
				match(T__6);
				setState(482);
				condition(0);
				setState(483);
				match(T__7);
				}
				break;
			case NOT:
				{
				setState(485);
				match(NOT);
				setState(486);
				match(T__6);
				setState(487);
				condition(0);
				setState(488);
				match(T__7);
				}
				break;
			case IDF:
				{
				setState(490);
				partCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(493);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(494);
					logicalOperator();
					setState(495);
					condition(3);
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		public TerminalNode COMPARAISONOPERATOR() { return getToken(ExprParser.COMPARAISONOPERATOR, 0); }
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
			setState(502);
			match(IDF);
			setState(503);
			match(COMPARAISONOPERATOR);
			setState(504);
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
		enterRule(_localctx, 66, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01ff\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\2\3\2\7\2Q\n\2"+
		"\f\2\16\2T\13\2\3\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\7\2_\n\2\f\2\16"+
		"\2b\13\2\3\2\3\2\3\2\3\3\3\3\6\3i\n\3\r\3\16\3j\3\3\5\3n\n\3\3\4\3\4\3"+
		"\4\5\4s\n\4\3\5\3\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00a4\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bb\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\5\f\u00c5\n\f\3\r\3\r\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd\13\r"+
		"\3\16\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4\13\16\3\16\3\16\6\16\u00d8"+
		"\n\16\r\16\16\16\u00d9\3\16\3\16\7\16\u00de\n\16\f\16\16\16\u00e1\13\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00e8\n\16\f\16\16\16\u00eb\13\16\3\16"+
		"\3\16\3\16\7\16\u00f0\n\16\f\16\16\16\u00f3\13\16\3\16\3\16\5\16\u00f7"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0102\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\6\22"+
		"\u0112\n\22\r\22\16\22\u0113\3\22\3\22\5\22\u0118\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0125\n\24\3\24\3\24\3\24"+
		"\3\24\7\24\u012b\n\24\f\24\16\24\u012e\13\24\3\25\3\25\5\25\u0132\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0139\n\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0142\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u014c"+
		"\n\30\r\30\16\30\u014d\3\30\3\30\3\31\3\31\3\31\6\31\u0155\n\31\r\31\16"+
		"\31\u0156\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\6\32\u0167\n\32\r\32\16\32\u0168\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\6\33\u0174\n\33\r\33\16\33\u0175\3\33\3\33\5\33\u017a"+
		"\n\33\3\33\5\33\u017d\n\33\3\34\7\34\u0180\n\34\f\34\16\34\u0183\13\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u018c\n\34\r\34\16\34\u018d\3"+
		"\34\3\34\3\34\3\34\7\34\u0194\n\34\f\34\16\34\u0197\13\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\6\34\u01a0\n\34\r\34\16\34\u01a1\3\34\3\34\5\34"+
		"\u01a6\n\34\3\35\7\35\u01a9\n\35\f\35\16\35\u01ac\13\35\3\35\3\35\3\35"+
		"\6\35\u01b1\n\35\r\35\16\35\u01b2\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\6\37\u01c3\n\37\r\37\16\37\u01c4\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u01cf\n\37\r\37\16\37\u01d0\3"+
		"\37\3\37\3\37\3\37\5\37\u01d7\n\37\3 \3 \3 \6 \u01dc\n \r \16 \u01dd\3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01ee\n!\3!\3!\3!\3!\7!\u01f4"+
		"\n!\f!\16!\u01f7\13!\3\"\3\"\3\"\3\"\3#\3#\3#\2\4&@$\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\6\3\2\7\b\4\2)),,"+
		"\4\2\7\b\r\16\4\2$%..\2\u0215\2I\3\2\2\2\4m\3\2\2\2\6r\3\2\2\2\bt\3\2"+
		"\2\2\n\u008c\3\2\2\2\f\u008e\3\2\2\2\16\u0090\3\2\2\2\20\u00a3\3\2\2\2"+
		"\22\u00ba\3\2\2\2\24\u00bc\3\2\2\2\26\u00c4\3\2\2\2\30\u00c6\3\2\2\2\32"+
		"\u00f6\3\2\2\2\34\u0101\3\2\2\2\36\u0103\3\2\2\2 \u0109\3\2\2\2\"\u0117"+
		"\3\2\2\2$\u0119\3\2\2\2&\u0124\3\2\2\2(\u0131\3\2\2\2*\u0138\3\2\2\2,"+
		"\u013a\3\2\2\2.\u013c\3\2\2\2\60\u0151\3\2\2\2\62\u015f\3\2\2\2\64\u016c"+
		"\3\2\2\2\66\u01a5\3\2\2\28\u01aa\3\2\2\2:\u01b6\3\2\2\2<\u01d6\3\2\2\2"+
		">\u01d8\3\2\2\2@\u01ed\3\2\2\2B\u01f8\3\2\2\2D\u01fc\3\2\2\2FH\7\63\2"+
		"\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\22"+
		"\2\2MN\7)\2\2NR\7\3\2\2OQ\7\63\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2SU\3\2\2\2TR\3\2\2\2UY\5\4\3\2VX\7\63\2\2WV\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\`\5\32\16\2]_\7\63\2\2^]\3\2\2"+
		"\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\2\2\3de\b\2\1"+
		"\2e\3\3\2\2\2fh\7\23\2\2gi\5\6\4\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2kn\3\2\2\2ln\7\23\2\2mf\3\2\2\2ml\3\2\2\2n\5\3\2\2\2os\5\n\6\2ps\5"+
		"\22\n\2qs\7\63\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\7\3\2\2\2ty\7)\2\2u"+
		"v\7\4\2\2vx\7)\2\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\t\3\2\2\2"+
		"{y\3\2\2\2|}\5\26\f\2}~\5\b\5\2~\177\7\5\2\2\177\u0080\7\21\2\2\u0080"+
		"\u0081\7\6\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7\3\2\2\u0083\u0084\b"+
		"\6\1\2\u0084\u008d\3\2\2\2\u0085\u0086\5\26\f\2\u0086\u0087\5\b\5\2\u0087"+
		"\u0088\7\5\2\2\u0088\u0089\7\21\2\2\u0089\u008a\7\3\2\2\u008a\u008b\b"+
		"\6\1\2\u008b\u008d\3\2\2\2\u008c|\3\2\2\2\u008c\u0085\3\2\2\2\u008d\13"+
		"\3\2\2\2\u008e\u008f\t\2\2\2\u008f\r\3\2\2\2\u0090\u0091\5\20\t\2\u0091"+
		"\u0092\b\b\1\2\u0092\17\3\2\2\2\u0093\u0094\7\t\2\2\u0094\u0095\5\f\7"+
		"\2\u0095\u0096\7*\2\2\u0096\u0097\7\n\2\2\u0097\u0098\b\t\1\2\u0098\u00a4"+
		"\3\2\2\2\u0099\u009a\7\t\2\2\u009a\u009b\5\f\7\2\u009b\u009c\7+\2\2\u009c"+
		"\u009d\7\n\2\2\u009d\u009e\b\t\1\2\u009e\u00a4\3\2\2\2\u009f\u00a0\7*"+
		"\2\2\u00a0\u00a4\b\t\1\2\u00a1\u00a2\7+\2\2\u00a2\u00a4\b\t\1\2\u00a3"+
		"\u0093\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\21\3\2\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8"+
		"\7\5\2\2\u00a8\u00a9\7\13\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\7\3\2\2"+
		"\u00ab\u00ac\7*\2\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af"+
		"\7\3\2\2\u00af\u00bb\3\2\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2\5\b\5\2"+
		"\u00b2\u00b3\7\5\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6"+
		"\7\3\2\2\u00b6\u00b7\7*\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9\7\3\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00a5\3\2\2\2\u00ba\u00b0\3\2\2\2\u00bb\23\3\2\2"+
		"\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\7\60\2\2\u00be\u00bf\5\30\r\2\u00bf"+
		"\u00c0\7\61\2\2\u00c0\25\3\2\2\2\u00c1\u00c2\7\'\2\2\u00c2\u00c5\7(\2"+
		"\2\u00c3\u00c5\7&\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\27"+
		"\3\2\2\2\u00c6\u00cb\5\20\t\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca\5\20\t\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\31\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\7\24\2\2\u00cf"+
		"\u00d1\7\63\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\7\60\2\2\u00d6\u00d8\5\34\17\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00df\7\61\2\2\u00dc\u00de\7\63\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4\7\3\2\2\u00e4\u00f7\3"+
		"\2\2\2\u00e5\u00e9\7\24\2\2\u00e6\u00e8\7\63\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\60\2\2\u00ed\u00f1\7\61\2\2\u00ee"+
		"\u00f0\7\63\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7\25\2\2\u00f5\u00f7\7\3\2\2\u00f6\u00ce\3\2\2\2\u00f6\u00e5\3"+
		"\2\2\2\u00f7\33\3\2\2\2\u00f8\u0102\5 \21\2\u00f9\u0102\5\36\20\2\u00fa"+
		"\u0102\5$\23\2\u00fb\u0102\7\63\2\2\u00fc\u0102\5.\30\2\u00fd\u0102\5"+
		"\60\31\2\u00fe\u0102\5\62\32\2\u00ff\u0102\5\64\33\2\u0100\u0102\5:\36"+
		"\2\u0101\u00f8\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u00fb"+
		"\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\35\3\2\2\2\u0103\u0104\7\17\2"+
		"\2\u0104\u0105\7\t\2\2\u0105\u0106\5\b\5\2\u0106\u0107\7\n\2\2\u0107\u0108"+
		"\7\3\2\2\u0108\37\3\2\2\2\u0109\u010a\7\20\2\2\u010a\u010b\7\t\2\2\u010b"+
		"\u010c\5\"\22\2\u010c\u010d\7\n\2\2\u010d\u010e\7\3\2\2\u010e!\3\2\2\2"+
		"\u010f\u0110\t\3\2\2\u0110\u0112\7\4\2\2\u0111\u010f\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0118\t\3\2\2\u0116\u0118\t\3\2\2\u0117\u0111\3\2\2\2\u0117\u0116\3\2"+
		"\2\2\u0118#\3\2\2\2\u0119\u011a\5*\26\2\u011a\u011b\7-\2\2\u011b\u011c"+
		"\5&\24\2\u011c\u011d\7\3\2\2\u011d%\3\2\2\2\u011e\u011f\b\24\1\2\u011f"+
		"\u0120\7\t\2\2\u0120\u0121\5&\24\2\u0121\u0122\7\n\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0125\5(\25\2\u0124\u011e\3\2\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u012c\3\2\2\2\u0126\u0127\f\5\2\2\u0127\u0128\5,\27\2\u0128\u0129\5&"+
		"\24\6\u0129\u012b\3\2\2\2\u012a\u0126\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\'\3\2\2\2\u012e\u012c\3\2\2\2"+
		"\u012f\u0132\5\20\t\2\u0130\u0132\5*\26\2\u0131\u012f\3\2\2\2\u0131\u0130"+
		"\3\2\2\2\u0132)\3\2\2\2\u0133\u0139\7)\2\2\u0134\u0135\7)\2\2\u0135\u0136"+
		"\7\13\2\2\u0136\u0137\7*\2\2\u0137\u0139\7\f\2\2\u0138\u0133\3\2\2\2\u0138"+
		"\u0134\3\2\2\2\u0139+\3\2\2\2\u013a\u013b\t\4\2\2\u013b-\3\2\2\2\u013c"+
		"\u013d\7 \2\2\u013d\u0141\7)\2\2\u013e\u013f\5,\27\2\u013f\u0140\5&\24"+
		"\2\u0140\u0142\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\7!\2\2\u0144\u0145\5&\24\2\u0145\u0146\7\"\2\2\u0146"+
		"\u0147\5&\24\2\u0147\u0148\7#\2\2\u0148\u0149\5&\24\2\u0149\u014b\7\60"+
		"\2\2\u014a\u014c\5\34\17\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\61"+
		"\2\2\u0150/\3\2\2\2\u0151\u0152\7\37\2\2\u0152\u0154\7\60\2\2\u0153\u0155"+
		"\5\34\17\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2"+
		"\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7\61\2\2\u0159\u015a"+
		"\7\36\2\2\u015a\u015b\7\t\2\2\u015b\u015c\5@!\2\u015c\u015d\7\n\2\2\u015d"+
		"\u015e\7\3\2\2\u015e\61\3\2\2\2\u015f\u0160\7\36\2\2\u0160\u0161\7\t\2"+
		"\2\u0161\u0162\5@!\2\u0162\u0163\7\n\2\2\u0163\u0164\7\37\2\2\u0164\u0166"+
		"\7\60\2\2\u0165\u0167\5\34\17\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2"+
		"\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b"+
		"\7\61\2\2\u016b\63\3\2\2\2\u016c\u016d\7\26\2\2\u016d\u016e\7\t\2\2\u016e"+
		"\u016f\5@!\2\u016f\u0170\7\n\2\2\u0170\u0171\7\31\2\2\u0171\u0173\7\60"+
		"\2\2\u0172\u0174\5\34\17\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\7\61"+
		"\2\2\u0178\u017a\5\66\34\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u017d\58\35\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\65\3\2\2\2\u017e\u0180\7\63\2\2\u017f\u017e\3\2\2\2\u0180\u0183"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0185\7\30\2\2\u0185\u0186\7\t\2\2\u0186\u0187\5"+
		"@!\2\u0187\u0188\7\n\2\2\u0188\u0189\7\31\2\2\u0189\u018b\7\60\2\2\u018a"+
		"\u018c\5\34\17\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3"+
		"\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\61\2\2\u0190"+
		"\u0191\5\66\34\2\u0191\u01a6\3\2\2\2\u0192\u0194\7\63\2\2\u0193\u0192"+
		"\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\30\2\2\u0199\u019a\7"+
		"\t\2\2\u019a\u019b\5@!\2\u019b\u019c\7\n\2\2\u019c\u019d\7\31\2\2\u019d"+
		"\u019f\7\60\2\2\u019e\u01a0\5\34\17\2\u019f\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\7\61\2\2\u01a4\u01a6\3\2\2\2\u01a5\u0181\3\2\2\2\u01a5\u0195\3"+
		"\2\2\2\u01a6\67\3\2\2\2\u01a7\u01a9\7\63\2\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7\27\2\2\u01ae\u01b0\7\60\2\2\u01af"+
		"\u01b1\5\34\17\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3"+
		"\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\7\61\2\2\u01b5"+
		"9\3\2\2\2\u01b6\u01b7\7\32\2\2\u01b7\u01b8\7\t\2\2\u01b8\u01b9\7)\2\2"+
		"\u01b9\u01ba\7\n\2\2\u01ba\u01bb\7\60\2\2\u01bb\u01bc\5<\37\2\u01bc\u01bd"+
		"\7\61\2\2\u01bd;\3\2\2\2\u01be\u01bf\7\33\2\2\u01bf\u01c0\5\20\t\2\u01c0"+
		"\u01c2\7\5\2\2\u01c1\u01c3\5\34\17\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3"+
		"\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\7\34\2\2\u01c7\u01c8\7\3\2\2\u01c8\u01c9\5> \2\u01c9\u01d7\3\2"+
		"\2\2\u01ca\u01cb\7\33\2\2\u01cb\u01cc\5\20\t\2\u01cc\u01ce\7\5\2\2\u01cd"+
		"\u01cf\5\34\17\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7\34\2\2\u01d3"+
		"\u01d4\7\3\2\2\u01d4\u01d5\5<\37\2\u01d5\u01d7\3\2\2\2\u01d6\u01be\3\2"+
		"\2\2\u01d6\u01ca\3\2\2\2\u01d7=\3\2\2\2\u01d8\u01d9\7\35\2\2\u01d9\u01db"+
		"\7\5\2\2\u01da\u01dc\5\34\17\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2"+
		"\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0"+
		"\7\34\2\2\u01e0\u01e1\7\3\2\2\u01e1?\3\2\2\2\u01e2\u01e3\b!\1\2\u01e3"+
		"\u01e4\7\t\2\2\u01e4\u01e5\5@!\2\u01e5\u01e6\7\n\2\2\u01e6\u01ee\3\2\2"+
		"\2\u01e7\u01e8\7.\2\2\u01e8\u01e9\7\t\2\2\u01e9\u01ea\5@!\2\u01ea\u01eb"+
		"\7\n\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ee\5B\"\2\u01ed\u01e2\3\2\2\2\u01ed"+
		"\u01e7\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f5\3\2\2\2\u01ef\u01f0\f\4"+
		"\2\2\u01f0\u01f1\5D#\2\u01f1\u01f2\5@!\5\u01f2\u01f4\3\2\2\2\u01f3\u01ef"+
		"\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"A\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7)\2\2\u01f9\u01fa\7/\2\2\u01fa"+
		"\u01fb\5&\24\2\u01fbC\3\2\2\2\u01fc\u01fd\t\5\2\2\u01fdE\3\2\2\2\60IR"+
		"Y`jmry\u008c\u00a3\u00ba\u00c4\u00cb\u00d2\u00d9\u00df\u00e9\u00f1\u00f6"+
		"\u0101\u0113\u0117\u0124\u012c\u0131\u0138\u0141\u014d\u0156\u0168\u0175"+
		"\u0179\u017c\u0181\u018d\u0195\u01a1\u01a5\u01aa\u01b2\u01c4\u01d0\u01d6"+
		"\u01dd\u01ed\u01f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}