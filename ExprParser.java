// Generated from Expr.g4 by ANTLR 4.7.2

  package application.antlr;
  import java.util.HashMap;
  import java.util.Map;
  import application.antlr.SymboleTable.ErrorToken;
  import application.antlr.SymboleTable.IDF_HashTable;
  import application.antlr.validate.validateIDF;

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
		DEFINE=26, CONST=27, IDF=28, INT=29, FLOAT=30, STRING=31, CHAR=32, CONCAT=33, 
		AFFECT=34, NOT=35, GREATER=36, LESSER=37, GEQ=38, LEQ=39, EQ=40, NEQ=41, 
		LBRACE=42, RBRACE=43, PLUS=44, SUB=45, MUL=46, DIV=47, COM=48, SEMI=49, 
		LBRACKET=50, RBRACKET=51, LPAR=52, RPAR=53, ASSIGN=54, TWOPOINT=55, COMMENT=56, 
		WS=57, ERROR_TOKEN=58;
	public static final int
		RULE_prog = 0, RULE_varBlock = 1, RULE_declaration = 2, RULE_listIDF = 3, 
		RULE_normalDeclaration = 4, RULE_number = 5, RULE_arrayDeclaration = 6, 
		RULE_affectArray = 7, RULE_declarationKeyword = 8, RULE_listValue = 9, 
		RULE_value = 10, RULE_mainCode = 11, RULE_inst = 12, RULE_input = 13, 
		RULE_output = 14, RULE_content = 15, RULE_affectInst = 16, RULE_concatInst = 17, 
		RULE_arithmeticExpression = 18, RULE_operator = 19, RULE_var = 20, RULE_forInst = 21, 
		RULE_doWhileInst = 22, RULE_whileInst = 23, RULE_ifInst = 24, RULE_elseIfInst = 25, 
		RULE_elseInst = 26, RULE_switchInst = 27, RULE_caseInst = 28, RULE_defaultInst = 29, 
		RULE_condition = 30, RULE_partCondition = 31, RULE_comparaisonOperator = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "varBlock", "declaration", "listIDF", "normalDeclaration", "number", 
			"arrayDeclaration", "affectArray", "declarationKeyword", "listValue", 
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


	   public static final ArrayList<ErrorToken> types  = new ArrayList<>();
	   public static final ArrayList<ErrorToken> arithmeticList  = new ArrayList<>();
	   public static final ArrayList<ErrorToken> concatList  = new ArrayList<>();
	   public static final ArrayList<ErrorToken> boolList  = new ArrayList<>();
	   public static final ArrayList<ErrorToken> compareList  = new ArrayList<>();
	   public static final ArrayList<String> valueList  = new ArrayList<>();

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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(66);
				match(COMMENT);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(MAIN);
			setState(73);
			match(IDF);
			setState(74);
			match(SEMI);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(75);
				match(COMMENT);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			varBlock();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(82);
				match(COMMENT);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			mainCode();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(89);
				match(COMMENT);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(VAR);
				setState(99); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(98);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(101); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				normalDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
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
			setState(111);
			match(IDF);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(112);
				match(COM);
				setState(113);
				match(IDF);
				}
				}
				setState(118);
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
		types.clear();
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				((NormalDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(120);
				((NormalDeclarationContext)_localctx).listIDF = listIDF();
				setState(121);
				match(TWOPOINT);
				setState(122);
				((NormalDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(123);
				match(ASSIGN);
				setState(124);
				((NormalDeclarationContext)_localctx).value = value();
				setState(125);
				match(SEMI);

				this.types.add(((NormalDeclarationContext)_localctx).value.type);
				    for (var idf : ((NormalDeclarationContext)_localctx).listIDF.getTokens(IDF)) { 
				        IDF_HashTable.table.updateTypeValue(idf.getText(), ((NormalDeclarationContext)_localctx).declarationKeyword.mul ,(((NormalDeclarationContext)_localctx).TYPE!=null?((NormalDeclarationContext)_localctx).TYPE.getText():null),(((NormalDeclarationContext)_localctx).value!=null?_input.getText(((NormalDeclarationContext)_localctx).value.start,((NormalDeclarationContext)_localctx).value.stop):null),types,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((NormalDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(129);
				((NormalDeclarationContext)_localctx).listIDF = listIDF();
				setState(130);
				match(TWOPOINT);
				setState(131);
				((NormalDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(132);
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

	public static class NumberContext extends ParserRuleContext {
		public ErrorToken type;
		public Token INT;
		public Token FLOAT;
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
		enterRule(_localctx, 10, RULE_number);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((NumberContext)_localctx).INT = match(INT);
				 ((NumberContext)_localctx).type =  new ErrorToken((((NumberContext)_localctx).INT!=null?((NumberContext)_localctx).INT.getText():null),"INT",(((NumberContext)_localctx).INT!=null?((NumberContext)_localctx).INT.getLine():0),(((NumberContext)_localctx).INT!=null?((NumberContext)_localctx).INT.getCharPositionInLine():0)); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((NumberContext)_localctx).FLOAT = match(FLOAT);
				 ((NumberContext)_localctx).type =  new ErrorToken((((NumberContext)_localctx).FLOAT!=null?((NumberContext)_localctx).FLOAT.getText():null),"FLOAT",(((NumberContext)_localctx).FLOAT!=null?((NumberContext)_localctx).FLOAT.getLine():0),(((NumberContext)_localctx).FLOAT!=null?((NumberContext)_localctx).FLOAT.getCharPositionInLine():0)); 
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
		enterRule(_localctx, 12, RULE_arrayDeclaration);
		types.clear();
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				((ArrayDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(144);
				((ArrayDeclarationContext)_localctx).listIDF = listIDF();
				setState(145);
				match(TWOPOINT);
				setState(146);
				match(LBRACKET);
				setState(147);
				((ArrayDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(148);
				match(SEMI);
				setState(149);
				((ArrayDeclarationContext)_localctx).INT = match(INT);
				setState(150);
				match(RBRACKET);
				setState(151);
				match(ASSIGN);
				setState(152);
				match(LBRACE);
				setState(153);
				match(RBRACE);
				setState(154);
				match(SEMI);

				  for (var idf : ((ArrayDeclarationContext)_localctx).listIDF.getTokens(IDF)) { 
				        IDF_HashTable.table.updateSizeTypeValue(idf.getText(), ((ArrayDeclarationContext)_localctx).declarationKeyword.mul ,(((ArrayDeclarationContext)_localctx).TYPE!=null?((ArrayDeclarationContext)_localctx).TYPE.getText():null),(((ArrayDeclarationContext)_localctx).INT!=null?((ArrayDeclarationContext)_localctx).INT.getText():null),idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
				  }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((ArrayDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(158);
				((ArrayDeclarationContext)_localctx).listIDF = listIDF();
				setState(159);
				match(TWOPOINT);
				setState(160);
				match(LBRACKET);
				setState(161);
				((ArrayDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(162);
				match(SEMI);
				setState(163);
				((ArrayDeclarationContext)_localctx).INT = match(INT);
				setState(164);
				match(RBRACKET);
				setState(165);
				match(ASSIGN);
				setState(166);
				match(LBRACE);
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					listValue();
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANVALUE) | (1L << IDF) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << NOT) | (1L << LPAR))) != 0) );
				setState(172);
				match(RBRACE);
				setState(173);
				match(SEMI);

				  for (var idf : ((ArrayDeclarationContext)_localctx).listIDF.getTokens(IDF)) { 
				        IDF_HashTable.table.updateSizeTypeValue(idf.getText(), ((ArrayDeclarationContext)_localctx).declarationKeyword.mul ,(((ArrayDeclarationContext)_localctx).TYPE!=null?((ArrayDeclarationContext)_localctx).TYPE.getText():null),(((ArrayDeclarationContext)_localctx).INT!=null?((ArrayDeclarationContext)_localctx).INT.getText():null),this.types,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
				  }

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				((ArrayDeclarationContext)_localctx).declarationKeyword = declarationKeyword();
				setState(177);
				((ArrayDeclarationContext)_localctx).listIDF = listIDF();
				setState(178);
				match(TWOPOINT);
				setState(179);
				match(LBRACKET);
				setState(180);
				((ArrayDeclarationContext)_localctx).TYPE = match(TYPE);
				setState(181);
				match(SEMI);
				setState(182);
				((ArrayDeclarationContext)_localctx).INT = match(INT);
				setState(183);
				match(RBRACKET);
				setState(184);
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
		enterRule(_localctx, 14, RULE_affectArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ASSIGN);
			setState(190);
			match(LBRACE);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANVALUE) | (1L << IDF) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << NOT) | (1L << LPAR))) != 0)) {
				{
				{
				setState(191);
				listValue();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 16, RULE_declarationKeyword);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(DEFINE);
				setState(200);
				match(CONST);
				((DeclarationKeywordContext)_localctx).mul =  "Constant";
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
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
		enterRule(_localctx, 18, RULE_listValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((ListValueContext)_localctx).v1 = value();
			ErrorToken type_1 = ((ListValueContext)_localctx).v1.type; type_1.exp = (((ListValueContext)_localctx).v1!=null?_input.getText(((ListValueContext)_localctx).v1.start,((ListValueContext)_localctx).v1.stop):null); this.types.add(type_1); 
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(208);
				match(COM);
				setState(209);
				((ListValueContext)_localctx).v = value();
				 ErrorToken type_2 = ((ListValueContext)_localctx).v.type; type_2.exp = (((ListValueContext)_localctx).v!=null?_input.getText(((ListValueContext)_localctx).v.start,((ListValueContext)_localctx).v.stop):null); this.types.add(type_2);
				}
				}
				setState(216);
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
		public ErrorToken type;
		public VarContext var;
		public NumberContext number;
		public Token BOOLEANVALUE;
		public Token CHAR;
		public Token STRING;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_value);
		this.boolList.clear(); this.compareList.clear(); this.concatList.clear(); this.arithmeticList.clear();
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((ValueContext)_localctx).var = var();
				((ValueContext)_localctx).type =  ((ValueContext)_localctx).var.type;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((ValueContext)_localctx).number = number();
				((ValueContext)_localctx).type =  ((ValueContext)_localctx).number.type;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				((ValueContext)_localctx).BOOLEANVALUE = match(BOOLEANVALUE);
				((ValueContext)_localctx).type =  new ErrorToken((((ValueContext)_localctx).BOOLEANVALUE!=null?((ValueContext)_localctx).BOOLEANVALUE.getText():null),"BOOL",(((ValueContext)_localctx).BOOLEANVALUE!=null?((ValueContext)_localctx).BOOLEANVALUE.getLine():0),(((ValueContext)_localctx).BOOLEANVALUE!=null?((ValueContext)_localctx).BOOLEANVALUE.getCharPositionInLine():0));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				((ValueContext)_localctx).CHAR = match(CHAR);
				((ValueContext)_localctx).type =  new ErrorToken((((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getText():null),"CHAR",(((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getLine():0),(((ValueContext)_localctx).CHAR!=null?((ValueContext)_localctx).CHAR.getCharPositionInLine():0)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).type =  new ErrorToken((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null),"STRING",(((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getLine():0),(((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getCharPositionInLine():0));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				condition(0);
				((ValueContext)_localctx).type =  IDF_HashTable.table.conditionType(this.boolList,this.compareList);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				arithmeticExpression(0);
				((ValueContext)_localctx).type = IDF_HashTable.table.getType(this.arithmeticList,0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				concatInst();
				((ValueContext)_localctx).type = IDF_HashTable.table.getType(this.concatList,1);
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
		enterRule(_localctx, 22, RULE_mainCode);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(BEGIN);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(241);
					match(COMMENT);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(LBRACE);
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(248);
					inst();
					}
					}
					setState(251); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(253);
				match(RBRACE);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(254);
					match(COMMENT);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(END);
				setState(261);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(BEGIN);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(264);
					match(COMMENT);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(LBRACE);
				setState(271);
				match(RBRACE);
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
				match(END);
				setState(279);
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
		enterRule(_localctx, 24, RULE_inst);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				output();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				input();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				affectInst();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(COMMENT);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				doWhileInst();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				whileInst();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				ifInst();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
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
		enterRule(_localctx, 26, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(INPUT);
			setState(293);
			match(LPAR);
			setState(294);
			listIDF();
			setState(295);
			match(RPAR);
			setState(296);
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
		enterRule(_localctx, 28, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(OUTPUT);
			setState(299);
			match(LPAR);
			setState(300);
			content();
			setState(301);
			match(RPAR);
			setState(302);
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
		enterRule(_localctx, 30, RULE_content);
		int _la;
		try {
			int _alt;
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(304);
						_la = _input.LA(1);
						if ( !(_la==IDF || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						match(COM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(308); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(310);
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
				setState(311);
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
		public VarContext var;
		public ValueContext value;
		public Token IDF;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode AFFECT() { return getToken(ExprParser.AFFECT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ExprParser.SEMI, 0); }
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public TerminalNode LBRACE() { return getToken(ExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ExprParser.RBRACE, 0); }
		public List<ListValueContext> listValue() {
			return getRuleContexts(ListValueContext.class);
		}
		public ListValueContext listValue(int i) {
			return getRuleContext(ListValueContext.class,i);
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
		enterRule(_localctx, 32, RULE_affectInst);
		 this.types.clear(); 
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				((AffectInstContext)_localctx).var = var();
				setState(315);
				match(AFFECT);
				setState(316);
				((AffectInstContext)_localctx).value = value();
				setState(317);
				match(SEMI);
				 
				  this.types.add(((AffectInstContext)_localctx).value.type);
				  var idf =  ((AffectInstContext)_localctx).var.getTokens(IDF).get(0);
				  IDF_HashTable.table.affectValue(idf.getText(), (((AffectInstContext)_localctx).value!=null?_input.getText(((AffectInstContext)_localctx).value.start,((AffectInstContext)_localctx).value.stop):null),((AffectInstContext)_localctx).var.type,this.types, idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				((AffectInstContext)_localctx).IDF = match(IDF);
				setState(321);
				match(AFFECT);
				setState(322);
				match(LBRACE);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANVALUE) | (1L << IDF) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << NOT) | (1L << LPAR))) != 0)) {
					{
					{
					setState(323);
					listValue();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329);
				match(RBRACE);
				setState(330);
				match(SEMI);

				  IDF_HashTable.table.affectArray((((AffectInstContext)_localctx).IDF!=null?((AffectInstContext)_localctx).IDF.getText():null),this.types, (((AffectInstContext)_localctx).IDF!=null?((AffectInstContext)_localctx).IDF.getLine():0),(((AffectInstContext)_localctx).IDF!=null?((AffectInstContext)_localctx).IDF.getCharPositionInLine():0));


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
		public Token STRING;
		public Token CHAR;
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
		enterRule(_localctx, 34, RULE_concatInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(334);
				((ConcatInstContext)_localctx).STRING = match(STRING);
				this.concatList.add(new ErrorToken((((ConcatInstContext)_localctx).STRING!=null?((ConcatInstContext)_localctx).STRING.getText():null),"STRING",(((ConcatInstContext)_localctx).STRING!=null?((ConcatInstContext)_localctx).STRING.getLine():0),(((ConcatInstContext)_localctx).STRING!=null?((ConcatInstContext)_localctx).STRING.getCharPositionInLine():0)));
				}
				break;
			case CHAR:
				{
				setState(336);
				((ConcatInstContext)_localctx).CHAR = match(CHAR);
				this.concatList.add(new ErrorToken((((ConcatInstContext)_localctx).CHAR!=null?((ConcatInstContext)_localctx).CHAR.getText():null),"STRING",(((ConcatInstContext)_localctx).CHAR!=null?((ConcatInstContext)_localctx).CHAR.getLine():0),(((ConcatInstContext)_localctx).CHAR!=null?((ConcatInstContext)_localctx).CHAR.getCharPositionInLine():0)));
				}
				break;
			case IDF:
				{
				setState(338);
				((ConcatInstContext)_localctx).var = var();
				this.concatList.add(((ConcatInstContext)_localctx).var.type);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(353); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(343);
				match(CONCAT);
				{
				setState(351);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDF:
					{
					setState(344);
					((ConcatInstContext)_localctx).var = var();
					this.concatList.add(((ConcatInstContext)_localctx).var.type);
					}
					break;
				case STRING:
					{
					setState(347);
					((ConcatInstContext)_localctx).STRING = match(STRING);
					this.concatList.add(new ErrorToken((((ConcatInstContext)_localctx).STRING!=null?((ConcatInstContext)_localctx).STRING.getText():null),"STRING",(((ConcatInstContext)_localctx).STRING!=null?((ConcatInstContext)_localctx).STRING.getLine():0),(((ConcatInstContext)_localctx).STRING!=null?((ConcatInstContext)_localctx).STRING.getCharPositionInLine():0)));
					}
					break;
				case CHAR:
					{
					setState(349);
					((ConcatInstContext)_localctx).CHAR = match(CHAR);
					this.concatList.add(new ErrorToken((((ConcatInstContext)_localctx).CHAR!=null?((ConcatInstContext)_localctx).CHAR.getText():null),"STRING",(((ConcatInstContext)_localctx).CHAR!=null?((ConcatInstContext)_localctx).CHAR.getLine():0),(((ConcatInstContext)_localctx).CHAR!=null?((ConcatInstContext)_localctx).CHAR.getCharPositionInLine():0)));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				}
				setState(355); 
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
		public ErrorToken type;
		public OperatorContext operator;
		public Token op;
		public ArithmeticExpressionContext ari;
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
			case INT:
			case FLOAT:
				{
				setState(358);
				((ArithmeticExpressionContext)_localctx).operator = operator();
				this.arithmeticList.add(((ArithmeticExpressionContext)_localctx).operator.type);
				}
				break;
			case LPAR:
				{
				setState(361);
				match(LPAR);
				setState(362);
				arithmeticExpression(0);
				setState(363);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(367);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(368);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(369);
						((ArithmeticExpressionContext)_localctx).ari = arithmeticExpression(5);
						if((((ArithmeticExpressionContext)_localctx).op!=null?((ArithmeticExpressionContext)_localctx).op.getType():0) == DIV){ ((ArithmeticExpressionContext)_localctx).type =  validateIDF.isDividingByZero(this.arithmeticList,(((ArithmeticExpressionContext)_localctx).ari!=null?_input.getText(((ArithmeticExpressionContext)_localctx).ari.start,((ArithmeticExpressionContext)_localctx).ari.stop):null), (((ArithmeticExpressionContext)_localctx).ari!=null?(((ArithmeticExpressionContext)_localctx).ari.start):null).getLine(), (((ArithmeticExpressionContext)_localctx).ari!=null?(((ArithmeticExpressionContext)_localctx).ari.start):null).getCharPositionInLine());}
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(372);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(373);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(374);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(379);
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
		public ErrorToken type;
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
		enterRule(_localctx, 38, RULE_operator);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				((OperatorContext)_localctx).number = number();
				((OperatorContext)_localctx).type =  ((OperatorContext)_localctx).number.type;
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
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
		public ErrorToken type;
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
		enterRule(_localctx, 40, RULE_var);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				((VarContext)_localctx).IDF = match(IDF);
				((VarContext)_localctx).type =  IDF_HashTable.table.getNormalTypeExpression((((VarContext)_localctx).IDF!=null?((VarContext)_localctx).IDF.getText():null),(((VarContext)_localctx).IDF!=null?((VarContext)_localctx).IDF.getLine():0),(((VarContext)_localctx).IDF!=null?((VarContext)_localctx).IDF.getCharPositionInLine():0)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				((VarContext)_localctx).IDF = match(IDF);
				setState(391);
				match(LBRACKET);
				setState(392);
				((VarContext)_localctx).INT = match(INT);
				setState(393);
				match(RBRACKET);
				((VarContext)_localctx).type =  IDF_HashTable.table.getArrayTypeExpression((((VarContext)_localctx).IDF!=null?((VarContext)_localctx).IDF.getText():null),(((VarContext)_localctx).INT!=null?((VarContext)_localctx).INT.getText():null),(((VarContext)_localctx).IDF!=null?((VarContext)_localctx).IDF.getLine():0),(((VarContext)_localctx).IDF!=null?((VarContext)_localctx).IDF.getCharPositionInLine():0));
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
		enterRule(_localctx, 42, RULE_forInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(FOR);
			setState(398);
			match(IDF);
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				{
				setState(399);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(400);
				arithmeticExpression(0);
				}
				break;
			case PLUS:
			case SUB:
				{
				setState(401);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(402);
				arithmeticExpression(0);
				}
				break;
			case FROM:
				break;
			default:
				break;
			}
			setState(405);
			match(FROM);
			setState(406);
			arithmeticExpression(0);
			setState(407);
			match(TO);
			setState(408);
			arithmeticExpression(0);
			setState(409);
			match(STEP);
			setState(410);
			arithmeticExpression(0);
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
		enterRule(_localctx, 44, RULE_doWhileInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(DO);
			setState(420);
			match(LBRACE);
			setState(422); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(421);
				inst();
				}
				}
				setState(424); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(426);
			match(RBRACE);
			setState(427);
			match(WHILE);
			setState(428);
			match(LPAR);
			setState(429);
			condition(0);
			setState(430);
			match(RPAR);
			setState(431);
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
		enterRule(_localctx, 46, RULE_whileInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(WHILE);
			setState(434);
			match(LPAR);
			setState(435);
			condition(0);
			setState(436);
			match(RPAR);
			setState(437);
			match(DO);
			setState(438);
			match(LBRACE);
			setState(440); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(439);
				inst();
				}
				}
				setState(442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(444);
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
		enterRule(_localctx, 48, RULE_ifInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(IF);
			setState(447);
			match(LPAR);
			setState(448);
			condition(0);
			setState(449);
			match(RPAR);
			setState(450);
			match(THEN);
			setState(451);
			match(LBRACE);
			setState(453); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(452);
				inst();
				}
				}
				setState(455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(457);
			match(RBRACE);
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(458);
				elseIfInst();
				}
				break;
			}
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(461);
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
		enterRule(_localctx, 50, RULE_elseIfInst);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(464);
					match(COMMENT);
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
				match(ELSIF);
				setState(471);
				match(LPAR);
				setState(472);
				condition(0);
				setState(473);
				match(RPAR);
				setState(474);
				match(THEN);
				setState(475);
				match(LBRACE);
				setState(477); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(476);
					inst();
					}
					}
					setState(479); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(481);
				match(RBRACE);
				setState(482);
				elseIfInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(484);
					match(COMMENT);
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490);
				match(ELSIF);
				setState(491);
				match(LPAR);
				setState(492);
				condition(0);
				setState(493);
				match(RPAR);
				setState(494);
				match(THEN);
				setState(495);
				match(LBRACE);
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(496);
					inst();
					}
					}
					setState(499); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(501);
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
		enterRule(_localctx, 52, RULE_elseInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(505);
				match(COMMENT);
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
			match(ELSE);
			setState(512);
			match(LBRACE);
			setState(514); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(513);
				inst();
				}
				}
				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(518);
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
		enterRule(_localctx, 54, RULE_switchInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(SWITCH);
			setState(521);
			match(LPAR);
			setState(522);
			match(IDF);
			setState(523);
			match(RPAR);
			setState(524);
			match(LBRACE);
			setState(525);
			caseInst();
			setState(526);
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
		enterRule(_localctx, 56, RULE_caseInst);
		int _la;
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				match(CASE);
				setState(529);
				number();
				setState(530);
				match(TWOPOINT);
				setState(532); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(531);
					inst();
					}
					}
					setState(534); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(536);
				match(BREAK);
				setState(537);
				match(SEMI);
				setState(538);
				defaultInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(CASE);
				setState(541);
				number();
				setState(542);
				match(TWOPOINT);
				setState(544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(543);
					inst();
					}
					}
					setState(546); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
				setState(548);
				match(BREAK);
				setState(549);
				match(SEMI);
				setState(550);
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
		enterRule(_localctx, 58, RULE_defaultInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(DEFAULT);
			setState(555);
			match(TWOPOINT);
			setState(557); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(556);
				inst();
				}
				}
				setState(559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << OUTPUT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << DO) | (1L << IDF) | (1L << COMMENT))) != 0) );
			setState(561);
			match(BREAK);
			setState(562);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(565);
				match(LPAR);
				setState(566);
				condition(0);
				setState(567);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(569);
				match(NOT);
				setState(570);
				condition(6);
				}
				break;
			case 3:
				{
				setState(571);
				partCondition();
				}
				break;
			case 4:
				{
				setState(572);
				((ConditionContext)_localctx).var = var();
				this.boolList.add(((ConditionContext)_localctx).var.type);
				}
				break;
			case 5:
				{
				setState(575);
				match(BOOLEANVALUE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(584);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(578);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(579);
						match(AND);
						setState(580);
						condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(581);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(582);
						match(OR);
						setState(583);
						condition(5);
						}
						break;
					}
					} 
				}
				setState(588);
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
		public VarContext var;
		public ArithmeticExpressionContext arithmeticExpression;
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
		enterRule(_localctx, 62, RULE_partCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			((PartConditionContext)_localctx).var = var();
			setState(590);
			comparaisonOperator();
			setState(591);
			((PartConditionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
			this.compareList.add(((PartConditionContext)_localctx).var.type); if(((PartConditionContext)_localctx).arithmeticExpression.type!=null){this.compareList.add(((PartConditionContext)_localctx).arithmeticExpression.type);} 
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
		enterRule(_localctx, 64, RULE_comparaisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
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
		case 18:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 30:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0257\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\2\7\2O\n\2\f\2\16"+
		"\2R\13\2\3\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\7\2]\n\2\f\2\16\2`\13"+
		"\2\3\2\3\2\3\3\3\3\6\3f\n\3\r\3\16\3g\3\3\5\3k\n\3\3\4\3\4\3\4\5\4p\n"+
		"\4\3\5\3\5\3\5\7\5u\n\5\f\5\16\5x\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\7\3\7\3\7\3\7\5\7\u0090"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00ab\n\b\r\b\16\b\u00ac\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00be\n\b\3"+
		"\t\3\t\3\t\7\t\u00c3\n\t\f\t\16\t\u00c6\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00cf\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d7\n\13\f\13\16"+
		"\13\u00da\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f1\n\f\3\r\3\r\7\r\u00f5\n\r\f\r"+
		"\16\r\u00f8\13\r\3\r\3\r\6\r\u00fc\n\r\r\r\16\r\u00fd\3\r\3\r\7\r\u0102"+
		"\n\r\f\r\16\r\u0105\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u010c\n\r\f\r\16\r\u010f"+
		"\13\r\3\r\3\r\3\r\7\r\u0114\n\r\f\r\16\r\u0117\13\r\3\r\3\r\5\r\u011b"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0125\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\6\21\u0135"+
		"\n\21\r\21\16\21\u0136\3\21\3\21\5\21\u013b\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u0147\n\22\f\22\16\22\u014a\13\22\3"+
		"\22\3\22\3\22\5\22\u014f\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0158\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0162\n\23\6"+
		"\23\u0164\n\23\r\23\16\23\u0165\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0170\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u017a\n"+
		"\24\f\24\16\24\u017d\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0185\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u018e\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0196\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\6\27\u01a0\n\27\r\27\16\27\u01a1\3\27\3\27\3\30\3\30\3\30\6\30\u01a9"+
		"\n\30\r\30\16\30\u01aa\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\6\31\u01bb\n\31\r\31\16\31\u01bc\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u01c8\n\32\r\32\16\32\u01c9\3\32\3"+
		"\32\5\32\u01ce\n\32\3\32\5\32\u01d1\n\32\3\33\7\33\u01d4\n\33\f\33\16"+
		"\33\u01d7\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u01e0\n\33\r\33"+
		"\16\33\u01e1\3\33\3\33\3\33\3\33\7\33\u01e8\n\33\f\33\16\33\u01eb\13\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u01f4\n\33\r\33\16\33\u01f5\3"+
		"\33\3\33\5\33\u01fa\n\33\3\34\7\34\u01fd\n\34\f\34\16\34\u0200\13\34\3"+
		"\34\3\34\3\34\6\34\u0205\n\34\r\34\16\34\u0206\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\6\36\u0217\n\36\r\36\16"+
		"\36\u0218\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u0223\n\36\r\36"+
		"\16\36\u0224\3\36\3\36\3\36\3\36\5\36\u022b\n\36\3\37\3\37\3\37\6\37\u0230"+
		"\n\37\r\37\16\37\u0231\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u0243\n \3 \3 \3 \3 \3 \3 \7 \u024b\n \f \16 \u024e\13 \3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\2\4&>#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@B\2\6\4\2\36\36!!\3\2\60\61\3\2./\3\2&+\2\u0281"+
		"\2G\3\2\2\2\4j\3\2\2\2\6o\3\2\2\2\bq\3\2\2\2\n\u0089\3\2\2\2\f\u008f\3"+
		"\2\2\2\16\u00bd\3\2\2\2\20\u00bf\3\2\2\2\22\u00ce\3\2\2\2\24\u00d0\3\2"+
		"\2\2\26\u00f0\3\2\2\2\30\u011a\3\2\2\2\32\u0124\3\2\2\2\34\u0126\3\2\2"+
		"\2\36\u012c\3\2\2\2 \u013a\3\2\2\2\"\u014e\3\2\2\2$\u0157\3\2\2\2&\u016f"+
		"\3\2\2\2(\u0184\3\2\2\2*\u018d\3\2\2\2,\u018f\3\2\2\2.\u01a5\3\2\2\2\60"+
		"\u01b3\3\2\2\2\62\u01c0\3\2\2\2\64\u01f9\3\2\2\2\66\u01fe\3\2\2\28\u020a"+
		"\3\2\2\2:\u022a\3\2\2\2<\u022c\3\2\2\2>\u0242\3\2\2\2@\u024f\3\2\2\2B"+
		"\u0254\3\2\2\2DF\7:\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2"+
		"\2\2IG\3\2\2\2JK\7\7\2\2KL\7\36\2\2LP\7\63\2\2MO\7:\2\2NM\3\2\2\2OR\3"+
		"\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2SW\5\4\3\2TV\7:\2\2UT\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z^\5\30\r\2[]"+
		"\7:\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2"+
		"ab\7\2\2\3b\3\3\2\2\2ce\7\b\2\2df\5\6\4\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2hk\3\2\2\2ik\7\b\2\2jc\3\2\2\2ji\3\2\2\2k\5\3\2\2\2lp\5\n"+
		"\6\2mp\5\16\b\2np\7:\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\7\3\2\2\2qv\7"+
		"\36\2\2rs\7\62\2\2su\7\36\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"w\t\3\2\2\2xv\3\2\2\2yz\5\22\n\2z{\5\b\5\2{|\79\2\2|}\7\6\2\2}~\78\2\2"+
		"~\177\5\26\f\2\177\u0080\7\63\2\2\u0080\u0081\b\6\1\2\u0081\u008a\3\2"+
		"\2\2\u0082\u0083\5\22\n\2\u0083\u0084\5\b\5\2\u0084\u0085\79\2\2\u0085"+
		"\u0086\7\6\2\2\u0086\u0087\7\63\2\2\u0087\u0088\b\6\1\2\u0088\u008a\3"+
		"\2\2\2\u0089y\3\2\2\2\u0089\u0082\3\2\2\2\u008a\13\3\2\2\2\u008b\u008c"+
		"\7\37\2\2\u008c\u0090\b\7\1\2\u008d\u008e\7 \2\2\u008e\u0090\b\7\1\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090\r\3\2\2\2\u0091\u0092\5\22\n"+
		"\2\u0092\u0093\5\b\5\2\u0093\u0094\79\2\2\u0094\u0095\7\64\2\2\u0095\u0096"+
		"\7\6\2\2\u0096\u0097\7\63\2\2\u0097\u0098\7\37\2\2\u0098\u0099\7\65\2"+
		"\2\u0099\u009a\78\2\2\u009a\u009b\7,\2\2\u009b\u009c\7-\2\2\u009c\u009d"+
		"\7\63\2\2\u009d\u009e\b\b\1\2\u009e\u00be\3\2\2\2\u009f\u00a0\5\22\n\2"+
		"\u00a0\u00a1\5\b\5\2\u00a1\u00a2\79\2\2\u00a2\u00a3\7\64\2\2\u00a3\u00a4"+
		"\7\6\2\2\u00a4\u00a5\7\63\2\2\u00a5\u00a6\7\37\2\2\u00a6\u00a7\7\65\2"+
		"\2\u00a7\u00a8\78\2\2\u00a8\u00aa\7,\2\2\u00a9\u00ab\5\24\13\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\7-\2\2\u00af\u00b0\7\63\2\2\u00b0\u00b1\b\b"+
		"\1\2\u00b1\u00be\3\2\2\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\5\b\5\2\u00b4"+
		"\u00b5\79\2\2\u00b5\u00b6\7\64\2\2\u00b6\u00b7\7\6\2\2\u00b7\u00b8\7\63"+
		"\2\2\u00b8\u00b9\7\37\2\2\u00b9\u00ba\7\65\2\2\u00ba\u00bb\7\63\2\2\u00bb"+
		"\u00bc\b\b\1\2\u00bc\u00be\3\2\2\2\u00bd\u0091\3\2\2\2\u00bd\u009f\3\2"+
		"\2\2\u00bd\u00b2\3\2\2\2\u00be\17\3\2\2\2\u00bf\u00c0\78\2\2\u00c0\u00c4"+
		"\7,\2\2\u00c1\u00c3\5\24\13\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8\21\3\2\2\2\u00c9\u00ca\7\34\2\2\u00ca"+
		"\u00cb\7\35\2\2\u00cb\u00cf\b\n\1\2\u00cc\u00cd\7\33\2\2\u00cd\u00cf\b"+
		"\n\1\2\u00ce\u00c9\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\23\3\2\2\2\u00d0"+
		"\u00d1\5\26\f\2\u00d1\u00d8\b\13\1\2\u00d2\u00d3\7\62\2\2\u00d3\u00d4"+
		"\5\26\f\2\u00d4\u00d5\b\13\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00d2\3\2\2\2"+
		"\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\25"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\5*\26\2\u00dc\u00dd\b\f\1\2\u00dd"+
		"\u00f1\3\2\2\2\u00de\u00df\5\f\7\2\u00df\u00e0\b\f\1\2\u00e0\u00f1\3\2"+
		"\2\2\u00e1\u00e2\7\3\2\2\u00e2\u00f1\b\f\1\2\u00e3\u00e4\7\"\2\2\u00e4"+
		"\u00f1\b\f\1\2\u00e5\u00e6\7!\2\2\u00e6\u00f1\b\f\1\2\u00e7\u00e8\5> "+
		"\2\u00e8\u00e9\b\f\1\2\u00e9\u00f1\3\2\2\2\u00ea\u00eb\5&\24\2\u00eb\u00ec"+
		"\b\f\1\2\u00ec\u00f1\3\2\2\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\b\f\1\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00db\3\2\2\2\u00f0\u00de\3\2\2\2\u00f0\u00e1\3\2"+
		"\2\2\u00f0\u00e3\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0"+
		"\u00ea\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f6\7\t\2"+
		"\2\u00f3\u00f5\7:\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fb\7,\2\2\u00fa\u00fc\5\32\16\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0103\7-\2\2\u0100\u0102\7:\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0107\7\n\2\2\u0107\u0108\7\63\2\2\u0108\u011b\3\2\2\2"+
		"\u0109\u010d\7\t\2\2\u010a\u010c\7:\2\2\u010b\u010a\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7,\2\2\u0111\u0115\7-\2\2\u0112\u0114\7:\2"+
		"\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\n\2\2\u0119"+
		"\u011b\7\63\2\2\u011a\u00f2\3\2\2\2\u011a\u0109\3\2\2\2\u011b\31\3\2\2"+
		"\2\u011c\u0125\5\36\20\2\u011d\u0125\5\34\17\2\u011e\u0125\5\"\22\2\u011f"+
		"\u0125\7:\2\2\u0120\u0125\5.\30\2\u0121\u0125\5\60\31\2\u0122\u0125\5"+
		"\62\32\2\u0123\u0125\58\35\2\u0124\u011c\3\2\2\2\u0124\u011d\3\2\2\2\u0124"+
		"\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\33\3\2\2\2\u0126\u0127"+
		"\7\4\2\2\u0127\u0128\7\66\2\2\u0128\u0129\5\b\5\2\u0129\u012a\7\67\2\2"+
		"\u012a\u012b\7\63\2\2\u012b\35\3\2\2\2\u012c\u012d\7\5\2\2\u012d\u012e"+
		"\7\66\2\2\u012e\u012f\5 \21\2\u012f\u0130\7\67\2\2\u0130\u0131\7\63\2"+
		"\2\u0131\37\3\2\2\2\u0132\u0133\t\2\2\2\u0133\u0135\7\62\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013b\t\2\2\2\u0139\u013b\t\2\2\2\u013a\u0134\3\2"+
		"\2\2\u013a\u0139\3\2\2\2\u013b!\3\2\2\2\u013c\u013d\5*\26\2\u013d\u013e"+
		"\7$\2\2\u013e\u013f\5\26\f\2\u013f\u0140\7\63\2\2\u0140\u0141\b\22\1\2"+
		"\u0141\u014f\3\2\2\2\u0142\u0143\7\36\2\2\u0143\u0144\7$\2\2\u0144\u0148"+
		"\7,\2\2\u0145\u0147\5\24\13\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2"+
		"\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014c\7-\2\2\u014c\u014d\7\63\2\2\u014d\u014f\b\22\1\2"+
		"\u014e\u013c\3\2\2\2\u014e\u0142\3\2\2\2\u014f#\3\2\2\2\u0150\u0151\7"+
		"!\2\2\u0151\u0158\b\23\1\2\u0152\u0153\7\"\2\2\u0153\u0158\b\23\1\2\u0154"+
		"\u0155\5*\26\2\u0155\u0156\b\23\1\2\u0156\u0158\3\2\2\2\u0157\u0150\3"+
		"\2\2\2\u0157\u0152\3\2\2\2\u0157\u0154\3\2\2\2\u0158\u0163\3\2\2\2\u0159"+
		"\u0161\7#\2\2\u015a\u015b\5*\26\2\u015b\u015c\b\23\1\2\u015c\u0162\3\2"+
		"\2\2\u015d\u015e\7!\2\2\u015e\u0162\b\23\1\2\u015f\u0160\7\"\2\2\u0160"+
		"\u0162\b\23\1\2\u0161\u015a\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015f\3"+
		"\2\2\2\u0162\u0164\3\2\2\2\u0163\u0159\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166%\3\2\2\2\u0167\u0168\b\24\1\2"+
		"\u0168\u0169\5(\25\2\u0169\u016a\b\24\1\2\u016a\u0170\3\2\2\2\u016b\u016c"+
		"\7\66\2\2\u016c\u016d\5&\24\2\u016d\u016e\7\67\2\2\u016e\u0170\3\2\2\2"+
		"\u016f\u0167\3\2\2\2\u016f\u016b\3\2\2\2\u0170\u017b\3\2\2\2\u0171\u0172"+
		"\f\6\2\2\u0172\u0173\t\3\2\2\u0173\u0174\5&\24\7\u0174\u0175\b\24\1\2"+
		"\u0175\u017a\3\2\2\2\u0176\u0177\f\5\2\2\u0177\u0178\t\4\2\2\u0178\u017a"+
		"\5&\24\6\u0179\u0171\3\2\2\2\u0179\u0176\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\'\3\2\2\2\u017d\u017b\3\2\2\2"+
		"\u017e\u017f\5\f\7\2\u017f\u0180\b\25\1\2\u0180\u0185\3\2\2\2\u0181\u0182"+
		"\5*\26\2\u0182\u0183\b\25\1\2\u0183\u0185\3\2\2\2\u0184\u017e\3\2\2\2"+
		"\u0184\u0181\3\2\2\2\u0185)\3\2\2\2\u0186\u0187\7\36\2\2\u0187\u018e\b"+
		"\26\1\2\u0188\u0189\7\36\2\2\u0189\u018a\7\64\2\2\u018a\u018b\7\37\2\2"+
		"\u018b\u018c\7\65\2\2\u018c\u018e\b\26\1\2\u018d\u0186\3\2\2\2\u018d\u0188"+
		"\3\2\2\2\u018e+\3\2\2\2\u018f\u0190\7\25\2\2\u0190\u0195\7\36\2\2\u0191"+
		"\u0192\t\3\2\2\u0192\u0196\5&\24\2\u0193\u0194\t\4\2\2\u0194\u0196\5&"+
		"\24\2\u0195\u0191\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\7\26\2\2\u0198\u0199\5&\24\2\u0199\u019a\7"+
		"\27\2\2\u019a\u019b\5&\24\2\u019b\u019c\7\30\2\2\u019c\u019d\5&\24\2\u019d"+
		"\u019f\7,\2\2\u019e\u01a0\5\32\16\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\7-\2\2\u01a4-\3\2\2\2\u01a5\u01a6\7\24\2\2\u01a6\u01a8\7,\2\2\u01a7"+
		"\u01a9\5\32\16\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3"+
		"\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7-\2\2\u01ad"+
		"\u01ae\7\23\2\2\u01ae\u01af\7\66\2\2\u01af\u01b0\5> \2\u01b0\u01b1\7\67"+
		"\2\2\u01b1\u01b2\7\63\2\2\u01b2/\3\2\2\2\u01b3\u01b4\7\23\2\2\u01b4\u01b5"+
		"\7\66\2\2\u01b5\u01b6\5> \2\u01b6\u01b7\7\67\2\2\u01b7\u01b8\7\24\2\2"+
		"\u01b8\u01ba\7,\2\2\u01b9\u01bb\5\32\16\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\7-\2\2\u01bf\61\3\2\2\2\u01c0\u01c1\7\13\2\2\u01c1\u01c2\7\66\2"+
		"\2\u01c2\u01c3\5> \2\u01c3\u01c4\7\67\2\2\u01c4\u01c5\7\16\2\2\u01c5\u01c7"+
		"\7,\2\2\u01c6\u01c8\5\32\16\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2"+
		"\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd"+
		"\7-\2\2\u01cc\u01ce\5\64\33\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2"+
		"\u01ce\u01d0\3\2\2\2\u01cf\u01d1\5\66\34\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\63\3\2\2\2\u01d2\u01d4\7:\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7\r\2\2\u01d9\u01da\7\66\2\2\u01da"+
		"\u01db\5> \2\u01db\u01dc\7\67\2\2\u01dc\u01dd\7\16\2\2\u01dd\u01df\7,"+
		"\2\2\u01de\u01e0\5\32\16\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7-"+
		"\2\2\u01e4\u01e5\5\64\33\2\u01e5\u01fa\3\2\2\2\u01e6\u01e8\7:\2\2\u01e7"+
		"\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7\r\2\2\u01ed"+
		"\u01ee\7\66\2\2\u01ee\u01ef\5> \2\u01ef\u01f0\7\67\2\2\u01f0\u01f1\7\16"+
		"\2\2\u01f1\u01f3\7,\2\2\u01f2\u01f4\5\32\16\2\u01f3\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2"+
		"\2\2\u01f7\u01f8\7-\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01d5\3\2\2\2\u01f9"+
		"\u01e9\3\2\2\2\u01fa\65\3\2\2\2\u01fb\u01fd\7:\2\2\u01fc\u01fb\3\2\2\2"+
		"\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201"+
		"\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7\f\2\2\u0202\u0204\7,\2\2\u0203"+
		"\u0205\5\32\16\2\u0204\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0204\3"+
		"\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7-\2\2\u0209"+
		"\67\3\2\2\2\u020a\u020b\7\17\2\2\u020b\u020c\7\66\2\2\u020c\u020d\7\36"+
		"\2\2\u020d\u020e\7\67\2\2\u020e\u020f\7,\2\2\u020f\u0210\5:\36\2\u0210"+
		"\u0211\7-\2\2\u02119\3\2\2\2\u0212\u0213\7\20\2\2\u0213\u0214\5\f\7\2"+
		"\u0214\u0216\79\2\2\u0215\u0217\5\32\16\2\u0216\u0215\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\7\21\2\2\u021b\u021c\7\63\2\2\u021c\u021d\5<\37\2\u021d\u022b\3"+
		"\2\2\2\u021e\u021f\7\20\2\2\u021f\u0220\5\f\7\2\u0220\u0222\79\2\2\u0221"+
		"\u0223\5\32\16\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3"+
		"\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\7\21\2\2\u0227"+
		"\u0228\7\63\2\2\u0228\u0229\5:\36\2\u0229\u022b\3\2\2\2\u022a\u0212\3"+
		"\2\2\2\u022a\u021e\3\2\2\2\u022b;\3\2\2\2\u022c\u022d\7\22\2\2\u022d\u022f"+
		"\79\2\2\u022e\u0230\5\32\16\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2"+
		"\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234"+
		"\7\21\2\2\u0234\u0235\7\63\2\2\u0235=\3\2\2\2\u0236\u0237\b \1\2\u0237"+
		"\u0238\7\66\2\2\u0238\u0239\5> \2\u0239\u023a\7\67\2\2\u023a\u0243\3\2"+
		"\2\2\u023b\u023c\7%\2\2\u023c\u0243\5> \b\u023d\u0243\5@!\2\u023e\u023f"+
		"\5*\26\2\u023f\u0240\b \1\2\u0240\u0243\3\2\2\2\u0241\u0243\7\3\2\2\u0242"+
		"\u0236\3\2\2\2\u0242\u023b\3\2\2\2\u0242\u023d\3\2\2\2\u0242\u023e\3\2"+
		"\2\2\u0242\u0241\3\2\2\2\u0243\u024c\3\2\2\2\u0244\u0245\f\7\2\2\u0245"+
		"\u0246\7\31\2\2\u0246\u024b\5> \b\u0247\u0248\f\6\2\2\u0248\u0249\7\32"+
		"\2\2\u0249\u024b\5> \7\u024a\u0244\3\2\2\2\u024a\u0247\3\2\2\2\u024b\u024e"+
		"\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d?\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024f\u0250\5*\26\2\u0250\u0251\5B\"\2\u0251\u0252\5&\24"+
		"\2\u0252\u0253\b!\1\2\u0253A\3\2\2\2\u0254\u0255\t\5\2\2\u0255C\3\2\2"+
		"\2:GPW^gjov\u0089\u008f\u00ac\u00bd\u00c4\u00ce\u00d8\u00f0\u00f6\u00fd"+
		"\u0103\u010d\u0115\u011a\u0124\u0136\u013a\u0148\u014e\u0157\u0161\u0165"+
		"\u016f\u0179\u017b\u0184\u018d\u0195\u01a1\u01aa\u01bc\u01c9\u01cd\u01d0"+
		"\u01d5\u01e1\u01e9\u01f5\u01f9\u01fe\u0206\u0218\u0224\u022a\u0231\u0242"+
		"\u024a\u024c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}