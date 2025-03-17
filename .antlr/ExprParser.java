// Generated from c:/Users/Administrator/Desktop/CompilerJava/Expr.g4 by ANTLR 4.13.1

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INPUT=15, OUTPUT=16, 
		TYPE=17, MAIN=18, VAR=19, BEGIN=20, END=21, IF=22, ELSE=23, ELSIF=24, 
		THEN=25, SWITCH=26, CASE=27, BREAK=28, DEFAULT=29, WHILE=30, DO=31, FOR=32, 
		FROM=33, TO=34, STEP=35, AND=36, OR=37, LET=38, DEFINE=39, CONST=40, IDF=41, 
		INT=42, FLOAT=43, STRING=44, AFFECT=45, NOT=46, COMPARAISONOPERATOR=47, 
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
			null, "';'", "','", "':'", "'+'", "'-'", "'='", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'*'", "'/'", "'input'", "'output'", null, "'MainPrgm'", 
			"'Var'", "'BeginPg'", "'EndPg'", "'if'", "'else'", "'elsif'", "'then'", 
			"'switch'", "'case'", "'break'", "'default'", "'while'", "'do'", "'for'", 
			"'from'", "'to'", "'step'", "'AND'", "'OR'", "'let'", "'@Define'", "'const'", 
			null, null, null, null, "':='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INPUT", "OUTPUT", "TYPE", "MAIN", "VAR", "BEGIN", 
			"END", "IF", "ELSE", "ELSIF", "THEN", "SWITCH", "CASE", "BREAK", "DEFAULT", 
			"WHILE", "DO", "FOR", "FROM", "TO", "STEP", "AND", "OR", "LET", "DEFINE", 
			"CONST", "IDF", "INT", "FLOAT", "STRING", "AFFECT", "NOT", "COMPARAISONOPERATOR", 
			"Separators", "COMMENT", "WS", "ERROR_TOKEN"
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


	  public class IDF_Attributs {
	    String dataType;
	    String value;

	    public IDF_Attributs(String type , String value){
	      this.value = value;
	      this.dataType = type;
	    }

	    @Override
	    public String toString () {
	      return "Type : "+this.dataType+" Value : "+this.value;
	    }
	  }

	 public class IDF_HashTable {
	  HashMap<String,IDF_Attributs> IDF_Map = new HashMap<String,IDF_Attributs>();
	  
	  public void insert(String IDF_Name, IDF_Attributs attributs) {
	    this.IDF_Map.put(IDF_Name,attributs);
	  }

	  public void insert(String IDF_Name) {
	    this.IDF_Map.put(IDF_Name,null);
	  }

	  public void printTable() {
	    for (Map.Entry<String, IDF_> entry : this.IDF_Map.entrySet()) {
	    System.out.println(entry.getKey() + " -> " + entry.getValue());
	    }
	  }

	 }

	 IDF_HashTable symboleTable = new IDF_HashTable();

	public void printToken(String token , String type, int line , int column) {
	    //column = column - token.length() + 1;
	    System.out.println("Matched "+type+": "+token+" at line " + line + ", column " + column);
	 }

	  public void validateIntToken(String token , int min ,int max, int line , int column){
	    //int column_1 = column - token.length() + 1;
	    int value = Integer.parseInt(token);
	  if(value<min || value >max){
	 System.err.println("Error: Int Constant "+ token + " exceeds maximum value range of [" +min+"," +max+"] At line "+ line+" Column "+column);
	            System.exit(1);
	  }
	  else {
	    printToken(token,"Int Constant",line,column);
	    insert(token);
	  }
	 }

	 public void validateIDFToken(String token , int maxLength , int line , int column){
	    column = column - token.length() + 1;
	  if(token.length()>14){
	 System.err.println("Error: Identifier "+ token + " exceeds maximum length of " + maxLength + " At line "+ line+" Column "+column);
	            System.exit(1);
	  }
	  else {
	    printToken(token,"Identifier",line,column);
	  }
	 }


	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
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
			printTable();
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListIDFContext extends ParserRuleContext {
		public List<TerminalNode> IDF() { return getTokens(ExprParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(ExprParser.IDF, i);
		}
		public ListIDFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listIDF; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalDeclarationContext extends ParserRuleContext {
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
				setState(122);
				declarationKeyword();
				setState(123);
				listIDF();
				setState(124);
				match(T__2);
				setState(125);
				match(TYPE);
				setState(126);
				affectValue();
				setState(127);
				match(T__0);
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
				match(T__2);
				setState(132);
				match(TYPE);
				setState(133);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AffectValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AffectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectValue; }
	}

	public final AffectValueContext affectValue() throws RecognitionException {
		AffectValueContext _localctx = new AffectValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_affectValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__5);
			setState(140);
			number();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__6);
				setState(143);
				sign();
				setState(144);
				match(INT);
				setState(145);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__6);
				setState(148);
				sign();
				setState(149);
				match(FLOAT);
				setState(150);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(FLOAT);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayDeclaration);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				declarationKeyword();
				setState(157);
				listIDF();
				setState(158);
				match(T__2);
				setState(159);
				match(T__8);
				setState(160);
				match(TYPE);
				setState(161);
				match(T__0);
				setState(162);
				match(INT);
				setState(163);
				match(T__9);
				setState(164);
				affectArray();
				setState(165);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				declarationKeyword();
				setState(168);
				listIDF();
				setState(169);
				match(T__2);
				setState(170);
				match(T__8);
				setState(171);
				match(TYPE);
				setState(172);
				match(T__0);
				setState(173);
				match(INT);
				setState(174);
				match(T__9);
				setState(175);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AffectArrayContext extends ParserRuleContext {
		public ListNumberContext listNumber() {
			return getRuleContext(ListNumberContext.class,0);
		}
		public AffectArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectArray; }
	}

	public final AffectArrayContext affectArray() throws RecognitionException {
		AffectArrayContext _localctx = new AffectArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_affectArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__5);
			setState(180);
			match(T__10);
			setState(181);
			listNumber();
			setState(182);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationKeywordContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(ExprParser.DEFINE, 0); }
		public TerminalNode CONST() { return getToken(ExprParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ExprParser.LET, 0); }
		public DeclarationKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationKeyword; }
	}

	public final DeclarationKeywordContext declarationKeyword() throws RecognitionException {
		DeclarationKeywordContext _localctx = new DeclarationKeywordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationKeyword);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(DEFINE);
				setState(185);
				match(CONST);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final ListNumberContext listNumber() throws RecognitionException {
		ListNumberContext _localctx = new ListNumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			number();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(190);
				match(T__1);
				setState(191);
				number();
				}
				}
				setState(196);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainCodeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ExprParser.BEGIN, 0); }
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
	}

	public final MainCodeContext mainCode() throws RecognitionException {
		MainCodeContext _localctx = new MainCodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mainCode);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(BEGIN);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(198);
					match(COMMENT);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(T__10);
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(205);
					inst();
					}
					}
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
				setState(210);
				match(T__11);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(211);
					match(COMMENT);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(END);
				setState(218);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(BEGIN);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(221);
					match(COMMENT);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(T__10);
				setState(228);
				match(T__11);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(229);
					match(COMMENT);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(END);
				setState(236);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inst);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				output();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				input();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				affectInst();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(COMMENT);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				forInst();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				doWhileInst();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				whileInst();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				ifInst();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 9);
				{
				setState(247);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(ExprParser.INPUT, 0); }
		public ListIDFContext listIDF() {
			return getRuleContext(ListIDFContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(INPUT);
			setState(251);
			match(T__6);
			setState(252);
			listIDF();
			setState(253);
			match(T__7);
			setState(254);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(ExprParser.OUTPUT, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(OUTPUT);
			setState(257);
			match(T__6);
			setState(258);
			content();
			setState(259);
			match(T__7);
			setState(260);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_content);
		int _la;
		try {
			int _alt;
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(262);
						_la = _input.LA(1);
						if ( !(_la==IDF || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						match(T__1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(266); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(268);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final AffectInstContext affectInst() throws RecognitionException {
		AffectInstContext _localctx = new AffectInstContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_affectInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			var();
			setState(273);
			match(AFFECT);
			setState(274);
			arithmeticExpression(0);
			setState(275);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(278);
				match(T__6);
				setState(279);
				arithmeticExpression(0);
				setState(280);
				match(T__7);
				}
				break;
			case 2:
				{
				setState(282);
				operator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
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
					setState(285);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(286);
					operation();
					setState(287);
					arithmeticExpression(4);
					}
					} 
				}
				setState(293);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operator);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				number();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(IDF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(IDF);
				setState(300);
				match(T__8);
				setState(301);
				match(INT);
				setState(302);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 24624L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final ForInstContext forInst() throws RecognitionException {
		ForInstContext _localctx = new ForInstContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(FOR);
			setState(308);
			match(IDF);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24624L) != 0)) {
				{
				setState(309);
				operation();
				setState(310);
				arithmeticExpression(0);
				}
			}

			setState(314);
			match(FROM);
			setState(315);
			arithmeticExpression(0);
			setState(316);
			match(TO);
			setState(317);
			arithmeticExpression(0);
			setState(318);
			match(STEP);
			setState(319);
			arithmeticExpression(0);
			setState(320);
			match(T__10);
			setState(322); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(321);
				inst();
				}
				}
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
			setState(326);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileInstContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ExprParser.DO, 0); }
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
	}

	public final DoWhileInstContext doWhileInst() throws RecognitionException {
		DoWhileInstContext _localctx = new DoWhileInstContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_doWhileInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(DO);
			setState(329);
			match(T__10);
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				inst();
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
			setState(335);
			match(T__11);
			setState(336);
			match(WHILE);
			setState(337);
			match(T__6);
			setState(338);
			condition(0);
			setState(339);
			match(T__7);
			setState(340);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileInstContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO() { return getToken(ExprParser.DO, 0); }
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
	}

	public final WhileInstContext whileInst() throws RecognitionException {
		WhileInstContext _localctx = new WhileInstContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(WHILE);
			setState(343);
			match(T__6);
			setState(344);
			condition(0);
			setState(345);
			match(T__7);
			setState(346);
			match(DO);
			setState(347);
			match(T__10);
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				inst();
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
			setState(353);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfInstContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ExprParser.THEN, 0); }
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
	}

	public final IfInstContext ifInst() throws RecognitionException {
		IfInstContext _localctx = new IfInstContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(IF);
			setState(356);
			match(T__6);
			setState(357);
			condition(0);
			setState(358);
			match(T__7);
			setState(359);
			match(THEN);
			setState(360);
			match(T__10);
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(361);
				inst();
				}
				}
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
			setState(366);
			match(T__11);
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(367);
				elseIfInst();
				}
				break;
			}
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(370);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfInstContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(ExprParser.ELSIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ExprParser.THEN, 0); }
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
	}

	public final ElseIfInstContext elseIfInst() throws RecognitionException {
		ElseIfInstContext _localctx = new ElseIfInstContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elseIfInst);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(373);
					match(COMMENT);
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379);
				match(ELSIF);
				setState(380);
				match(T__6);
				setState(381);
				condition(0);
				setState(382);
				match(T__7);
				setState(383);
				match(THEN);
				setState(384);
				match(T__10);
				setState(386); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(385);
					inst();
					}
					}
					setState(388); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
				setState(390);
				match(T__11);
				setState(391);
				elseIfInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(393);
					match(COMMENT);
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				match(ELSIF);
				setState(400);
				match(T__6);
				setState(401);
				condition(0);
				setState(402);
				match(T__7);
				setState(403);
				match(THEN);
				setState(404);
				match(T__10);
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(405);
					inst();
					}
					}
					setState(408); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
				setState(410);
				match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseInstContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ExprParser.ELSE, 0); }
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
	}

	public final ElseInstContext elseInst() throws RecognitionException {
		ElseInstContext _localctx = new ElseInstContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elseInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(414);
				match(COMMENT);
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			match(ELSE);
			setState(421);
			match(T__10);
			setState(423); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(422);
				inst();
				}
				}
				setState(425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
			setState(427);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchInstContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(ExprParser.SWITCH, 0); }
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public CaseInstContext caseInst() {
			return getRuleContext(CaseInstContext.class,0);
		}
		public SwitchInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchInst; }
	}

	public final SwitchInstContext switchInst() throws RecognitionException {
		SwitchInstContext _localctx = new SwitchInstContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(SWITCH);
			setState(430);
			match(T__6);
			setState(431);
			match(IDF);
			setState(432);
			match(T__7);
			setState(433);
			match(T__10);
			setState(434);
			caseInst();
			setState(435);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final CaseInstContext caseInst() throws RecognitionException {
		CaseInstContext _localctx = new CaseInstContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseInst);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(CASE);
				setState(438);
				number();
				setState(439);
				match(T__2);
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(440);
					inst();
					}
					}
					setState(443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
				setState(445);
				match(BREAK);
				setState(446);
				match(T__0);
				setState(447);
				defaultInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(CASE);
				setState(450);
				number();
				setState(451);
				match(T__2);
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
				setState(457);
				match(BREAK);
				setState(458);
				match(T__0);
				setState(459);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final DefaultInstContext defaultInst() throws RecognitionException {
		DefaultInstContext _localctx = new DefaultInstContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defaultInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(DEFAULT);
			setState(464);
			match(T__2);
			setState(466); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(465);
				inst();
				}
				}
				setState(468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 565156564271104L) != 0) );
			setState(470);
			match(BREAK);
			setState(471);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(474);
				match(T__6);
				setState(475);
				condition(0);
				setState(476);
				match(T__7);
				}
				break;
			case NOT:
				{
				setState(478);
				match(NOT);
				setState(479);
				match(T__6);
				setState(480);
				condition(0);
				setState(481);
				match(T__7);
				}
				break;
			case IDF:
				{
				setState(483);
				partCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(492);
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
					setState(486);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(487);
					logicalOperator();
					setState(488);
					condition(3);
					}
					} 
				}
				setState(494);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final PartConditionContext partCondition() throws RecognitionException {
		PartConditionContext _localctx = new PartConditionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_partCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(IDF);
			setState(496);
			match(COMPARAISONOPERATOR);
			setState(497);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70574902607872L) != 0)) ) {
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
		"\u0004\u00013\u01f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0005"+
		"\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000V\b\u0000\n\u0000\f\u0000Y\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000`\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001g\b"+
		"\u0001\u000b\u0001\f\u0001h\u0001\u0001\u0003\u0001l\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003v\b\u0003\n\u0003\f\u0003y\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0088\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u009b\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00b2\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00bc\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c1"+
		"\b\u000b\n\u000b\f\u000b\u00c4\t\u000b\u0001\f\u0001\f\u0005\f\u00c8\b"+
		"\f\n\f\f\f\u00cb\t\f\u0001\f\u0001\f\u0004\f\u00cf\b\f\u000b\f\f\f\u00d0"+
		"\u0001\f\u0001\f\u0005\f\u00d5\b\f\n\f\f\f\u00d8\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00df\b\f\n\f\f\f\u00e2\t\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00e7\b\f\n\f\f\f\u00ea\t\f\u0001\f\u0001\f\u0003\f\u00ee"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00f9\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010\u0109\b\u0010\u000b"+
		"\u0010\f\u0010\u010a\u0001\u0010\u0001\u0010\u0003\u0010\u010f\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u011c\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0122\b\u0012\n\u0012\f\u0012\u0125\t\u0012\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0129\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0130\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0139\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0004\u0016\u0143\b\u0016\u000b\u0016\f\u0016\u0144"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017"+
		"\u014c\b\u0017\u000b\u0017\f\u0017\u014d\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004"+
		"\u0018\u015e\b\u0018\u000b\u0018\f\u0018\u015f\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0004\u0019\u016b\b\u0019\u000b\u0019\f\u0019\u016c\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0171\b\u0019\u0001\u0019\u0003\u0019\u0174"+
		"\b\u0019\u0001\u001a\u0005\u001a\u0177\b\u001a\n\u001a\f\u001a\u017a\t"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0004\u001a\u0183\b\u001a\u000b\u001a\f\u001a\u0184"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u018b\b\u001a"+
		"\n\u001a\f\u001a\u018e\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u0197\b\u001a\u000b"+
		"\u001a\f\u001a\u0198\u0001\u001a\u0001\u001a\u0003\u001a\u019d\b\u001a"+
		"\u0001\u001b\u0005\u001b\u01a0\b\u001b\n\u001b\f\u001b\u01a3\t\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u01a8\b\u001b\u000b\u001b\f"+
		"\u001b\u01a9\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u01ba\b\u001d\u000b\u001d"+
		"\f\u001d\u01bb\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u01c6\b\u001d\u000b\u001d"+
		"\f\u001d\u01c7\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u01ce\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u01d3\b"+
		"\u001e\u000b\u001e\f\u001e\u01d4\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e5"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01eb"+
		"\b\u001f\n\u001f\f\u001f\u01ee\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0000\u0002$>\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0004"+
		"\u0001\u0000\u0004\u0005\u0002\u0000)),,\u0002\u0000\u0004\u0005\r\u000e"+
		"\u0002\u0000$%..\u020c\u0000G\u0001\u0000\u0000\u0000\u0002k\u0001\u0000"+
		"\u0000\u0000\u0004p\u0001\u0000\u0000\u0000\u0006r\u0001\u0000\u0000\u0000"+
		"\b\u0087\u0001\u0000\u0000\u0000\n\u0089\u0001\u0000\u0000\u0000\f\u008b"+
		"\u0001\u0000\u0000\u0000\u000e\u009a\u0001\u0000\u0000\u0000\u0010\u00b1"+
		"\u0001\u0000\u0000\u0000\u0012\u00b3\u0001\u0000\u0000\u0000\u0014\u00bb"+
		"\u0001\u0000\u0000\u0000\u0016\u00bd\u0001\u0000\u0000\u0000\u0018\u00ed"+
		"\u0001\u0000\u0000\u0000\u001a\u00f8\u0001\u0000\u0000\u0000\u001c\u00fa"+
		"\u0001\u0000\u0000\u0000\u001e\u0100\u0001\u0000\u0000\u0000 \u010e\u0001"+
		"\u0000\u0000\u0000\"\u0110\u0001\u0000\u0000\u0000$\u011b\u0001\u0000"+
		"\u0000\u0000&\u0128\u0001\u0000\u0000\u0000(\u012f\u0001\u0000\u0000\u0000"+
		"*\u0131\u0001\u0000\u0000\u0000,\u0133\u0001\u0000\u0000\u0000.\u0148"+
		"\u0001\u0000\u0000\u00000\u0156\u0001\u0000\u0000\u00002\u0163\u0001\u0000"+
		"\u0000\u00004\u019c\u0001\u0000\u0000\u00006\u01a1\u0001\u0000\u0000\u0000"+
		"8\u01ad\u0001\u0000\u0000\u0000:\u01cd\u0001\u0000\u0000\u0000<\u01cf"+
		"\u0001\u0000\u0000\u0000>\u01e4\u0001\u0000\u0000\u0000@\u01ef\u0001\u0000"+
		"\u0000\u0000B\u01f3\u0001\u0000\u0000\u0000DF\u00051\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0012\u0000\u0000KL\u0005)\u0000\u0000LP\u0005\u0001\u0000"+
		"\u0000MO\u00051\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000SW\u0003\u0002\u0001\u0000TV\u0005"+
		"1\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000Z^\u0003\u0018\f\u0000[]\u00051\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ab\u0005\u0000\u0000\u0001bc\u0006\u0000\uffff\uffff\u0000"+
		"c\u0001\u0001\u0000\u0000\u0000df\u0005\u0013\u0000\u0000eg\u0003\u0004"+
		"\u0002\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000"+
		"jl\u0005\u0013\u0000\u0000kd\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000l\u0003\u0001\u0000\u0000\u0000mq\u0003\b\u0004\u0000nq\u0003\u0010"+
		"\b\u0000oq\u00051\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000q\u0005\u0001\u0000\u0000\u0000"+
		"rw\u0005)\u0000\u0000st\u0005\u0002\u0000\u0000tv\u0005)\u0000\u0000u"+
		"s\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u0007\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z{\u0003\u0014\n\u0000{|\u0003\u0006\u0003\u0000|}\u0005"+
		"\u0003\u0000\u0000}~\u0005\u0011\u0000\u0000~\u007f\u0003\f\u0006\u0000"+
		"\u007f\u0080\u0005\u0001\u0000\u0000\u0080\u0088\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0003\u0014\n\u0000\u0082\u0083\u0003\u0006\u0003\u0000\u0083"+
		"\u0084\u0005\u0003\u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000\u0085"+
		"\u0086\u0005\u0001\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087"+
		"z\u0001\u0000\u0000\u0000\u0087\u0081\u0001\u0000\u0000\u0000\u0088\t"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0000\u0000\u0000\u008a\u000b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0006\u0000\u0000\u008c\u008d"+
		"\u0003\u000e\u0007\u0000\u008d\r\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u0007\u0000\u0000\u008f\u0090\u0003\n\u0005\u0000\u0090\u0091\u0005*"+
		"\u0000\u0000\u0091\u0092\u0005\b\u0000\u0000\u0092\u009b\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u0007\u0000\u0000\u0094\u0095\u0003\n\u0005\u0000"+
		"\u0095\u0096\u0005+\u0000\u0000\u0096\u0097\u0005\b\u0000\u0000\u0097"+
		"\u009b\u0001\u0000\u0000\u0000\u0098\u009b\u0005*\u0000\u0000\u0099\u009b"+
		"\u0005+\u0000\u0000\u009a\u008e\u0001\u0000\u0000\u0000\u009a\u0093\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u009d\u0003"+
		"\u0014\n\u0000\u009d\u009e\u0003\u0006\u0003\u0000\u009e\u009f\u0005\u0003"+
		"\u0000\u0000\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a1\u0005\u0011\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0001\u0000\u0000\u00a2\u00a3\u0005*\u0000\u0000"+
		"\u00a3\u00a4\u0005\n\u0000\u0000\u00a4\u00a5\u0003\u0012\t\u0000\u00a5"+
		"\u00a6\u0005\u0001\u0000\u0000\u00a6\u00b2\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0003\u0014\n\u0000\u00a8\u00a9\u0003\u0006\u0003\u0000\u00a9\u00aa"+
		"\u0005\u0003\u0000\u0000\u00aa\u00ab\u0005\t\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0011\u0000\u0000\u00ac\u00ad\u0005\u0001\u0000\u0000\u00ad\u00ae\u0005"+
		"*\u0000\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af\u00b0\u0005\u0001"+
		"\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u009c\u0001\u0000"+
		"\u0000\u0000\u00b1\u00a7\u0001\u0000\u0000\u0000\u00b2\u0011\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0006\u0000\u0000\u00b4\u00b5\u0005\u000b"+
		"\u0000\u0000\u00b5\u00b6\u0003\u0016\u000b\u0000\u00b6\u00b7\u0005\f\u0000"+
		"\u0000\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\'\u0000\u0000"+
		"\u00b9\u00bc\u0005(\u0000\u0000\u00ba\u00bc\u0005&\u0000\u0000\u00bb\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u0015"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c2\u0003\u000e\u0007\u0000\u00be\u00bf"+
		"\u0005\u0002\u0000\u0000\u00bf\u00c1\u0003\u000e\u0007\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u0017"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c9"+
		"\u0005\u0014\u0000\u0000\u00c6\u00c8\u00051\u0000\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005"+
		"\u000b\u0000\u0000\u00cd\u00cf\u0003\u001a\r\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d6\u0005\f\u0000\u0000\u00d3\u00d5\u00051\u0000"+
		"\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005\u0015\u0000\u0000\u00da\u00db\u0005\u0001\u0000"+
		"\u0000\u00db\u00ee\u0001\u0000\u0000\u0000\u00dc\u00e0\u0005\u0014\u0000"+
		"\u0000\u00dd\u00df\u00051\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u000b\u0000\u0000"+
		"\u00e4\u00e8\u0005\f\u0000\u0000\u00e5\u00e7\u00051\u0000\u0000\u00e6"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005\u0015\u0000\u0000\u00ec\u00ee\u0005\u0001\u0000\u0000\u00ed"+
		"\u00c5\u0001\u0000\u0000\u0000\u00ed\u00dc\u0001\u0000\u0000\u0000\u00ee"+
		"\u0019\u0001\u0000\u0000\u0000\u00ef\u00f9\u0003\u001e\u000f\u0000\u00f0"+
		"\u00f9\u0003\u001c\u000e\u0000\u00f1\u00f9\u0003\"\u0011\u0000\u00f2\u00f9"+
		"\u00051\u0000\u0000\u00f3\u00f9\u0003,\u0016\u0000\u00f4\u00f9\u0003."+
		"\u0017\u0000\u00f5\u00f9\u00030\u0018\u0000\u00f6\u00f9\u00032\u0019\u0000"+
		"\u00f7\u00f9\u00038\u001c\u0000\u00f8\u00ef\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f8\u00f1\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u001b\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u000f\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0007\u0000\u0000\u00fc\u00fd\u0003\u0006\u0003\u0000\u00fd"+
		"\u00fe\u0005\b\u0000\u0000\u00fe\u00ff\u0005\u0001\u0000\u0000\u00ff\u001d"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0010\u0000\u0000\u0101\u0102"+
		"\u0005\u0007\u0000\u0000\u0102\u0103\u0003 \u0010\u0000\u0103\u0104\u0005"+
		"\b\u0000\u0000\u0104\u0105\u0005\u0001\u0000\u0000\u0105\u001f\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0007\u0001\u0000\u0000\u0107\u0109\u0005\u0002"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010f\u0007\u0001"+
		"\u0000\u0000\u010d\u010f\u0007\u0001\u0000\u0000\u010e\u0108\u0001\u0000"+
		"\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f!\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0003(\u0014\u0000\u0111\u0112\u0005-\u0000\u0000\u0112"+
		"\u0113\u0003$\u0012\u0000\u0113\u0114\u0005\u0001\u0000\u0000\u0114#\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0006\u0012\uffff\uffff\u0000\u0116\u0117"+
		"\u0005\u0007\u0000\u0000\u0117\u0118\u0003$\u0012\u0000\u0118\u0119\u0005"+
		"\b\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u011c\u0003&"+
		"\u0013\u0000\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u0123\u0001\u0000\u0000\u0000\u011d\u011e\n\u0003\u0000"+
		"\u0000\u011e\u011f\u0003*\u0015\u0000\u011f\u0120\u0003$\u0012\u0004\u0120"+
		"\u0122\u0001\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0122"+
		"\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0001\u0000\u0000\u0000\u0124%\u0001\u0000\u0000\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0003\u000e\u0007\u0000\u0127\u0129"+
		"\u0003(\u0014\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001"+
		"\u0000\u0000\u0000\u0129\'\u0001\u0000\u0000\u0000\u012a\u0130\u0005)"+
		"\u0000\u0000\u012b\u012c\u0005)\u0000\u0000\u012c\u012d\u0005\t\u0000"+
		"\u0000\u012d\u012e\u0005*\u0000\u0000\u012e\u0130\u0005\n\u0000\u0000"+
		"\u012f\u012a\u0001\u0000\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000"+
		"\u0130)\u0001\u0000\u0000\u0000\u0131\u0132\u0007\u0002\u0000\u0000\u0132"+
		"+\u0001\u0000\u0000\u0000\u0133\u0134\u0005 \u0000\u0000\u0134\u0138\u0005"+
		")\u0000\u0000\u0135\u0136\u0003*\u0015\u0000\u0136\u0137\u0003$\u0012"+
		"\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0135\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0005!\u0000\u0000\u013b\u013c\u0003$\u0012\u0000\u013c"+
		"\u013d\u0005\"\u0000\u0000\u013d\u013e\u0003$\u0012\u0000\u013e\u013f"+
		"\u0005#\u0000\u0000\u013f\u0140\u0003$\u0012\u0000\u0140\u0142\u0005\u000b"+
		"\u0000\u0000\u0141\u0143\u0003\u001a\r\u0000\u0142\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0005\f\u0000\u0000\u0147-\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0005\u001f\u0000\u0000\u0149\u014b\u0005\u000b\u0000\u0000"+
		"\u014a\u014c\u0003\u001a\r\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005\f\u0000\u0000\u0150\u0151\u0005\u001e\u0000\u0000\u0151\u0152"+
		"\u0005\u0007\u0000\u0000\u0152\u0153\u0003>\u001f\u0000\u0153\u0154\u0005"+
		"\b\u0000\u0000\u0154\u0155\u0005\u0001\u0000\u0000\u0155/\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0005\u001e\u0000\u0000\u0157\u0158\u0005\u0007"+
		"\u0000\u0000\u0158\u0159\u0003>\u001f\u0000\u0159\u015a\u0005\b\u0000"+
		"\u0000\u015a\u015b\u0005\u001f\u0000\u0000\u015b\u015d\u0005\u000b\u0000"+
		"\u0000\u015c\u015e\u0003\u001a\r\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0005\f\u0000\u0000\u01621\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0005\u0016\u0000\u0000\u0164\u0165\u0005\u0007\u0000\u0000\u0165"+
		"\u0166\u0003>\u001f\u0000\u0166\u0167\u0005\b\u0000\u0000\u0167\u0168"+
		"\u0005\u0019\u0000\u0000\u0168\u016a\u0005\u000b\u0000\u0000\u0169\u016b"+
		"\u0003\u001a\r\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0170\u0005"+
		"\f\u0000\u0000\u016f\u0171\u00034\u001a\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000"+
		"\u0000\u0000\u0172\u0174\u00036\u001b\u0000\u0173\u0172\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u01743\u0001\u0000\u0000\u0000"+
		"\u0175\u0177\u00051\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177"+
		"\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a"+
		"\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0018\u0000\u0000\u017c"+
		"\u017d\u0005\u0007\u0000\u0000\u017d\u017e\u0003>\u001f\u0000\u017e\u017f"+
		"\u0005\b\u0000\u0000\u017f\u0180\u0005\u0019\u0000\u0000\u0180\u0182\u0005"+
		"\u000b\u0000\u0000\u0181\u0183\u0003\u001a\r\u0000\u0182\u0181\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0005\f\u0000\u0000\u0187\u0188\u00034\u001a"+
		"\u0000\u0188\u019d\u0001\u0000\u0000\u0000\u0189\u018b\u00051\u0000\u0000"+
		"\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000"+
		"\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0005\u0018\u0000\u0000\u0190\u0191\u0005\u0007\u0000\u0000"+
		"\u0191\u0192\u0003>\u001f\u0000\u0192\u0193\u0005\b\u0000\u0000\u0193"+
		"\u0194\u0005\u0019\u0000\u0000\u0194\u0196\u0005\u000b\u0000\u0000\u0195"+
		"\u0197\u0003\u001a\r\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0005\f\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u0178\u0001"+
		"\u0000\u0000\u0000\u019c\u018c\u0001\u0000\u0000\u0000\u019d5\u0001\u0000"+
		"\u0000\u0000\u019e\u01a0\u00051\u0000\u0000\u019f\u019e\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u0017\u0000"+
		"\u0000\u01a5\u01a7\u0005\u000b\u0000\u0000\u01a6\u01a8\u0003\u001a\r\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\f\u0000\u0000\u01ac"+
		"7\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u001a\u0000\u0000\u01ae\u01af"+
		"\u0005\u0007\u0000\u0000\u01af\u01b0\u0005)\u0000\u0000\u01b0\u01b1\u0005"+
		"\b\u0000\u0000\u01b1\u01b2\u0005\u000b\u0000\u0000\u01b2\u01b3\u0003:"+
		"\u001d\u0000\u01b3\u01b4\u0005\f\u0000\u0000\u01b49\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0005\u001b\u0000\u0000\u01b6\u01b7\u0003\u000e\u0007"+
		"\u0000\u01b7\u01b9\u0005\u0003\u0000\u0000\u01b8\u01ba\u0003\u001a\r\u0000"+
		"\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\u001c\u0000\u0000"+
		"\u01be\u01bf\u0005\u0001\u0000\u0000\u01bf\u01c0\u0003<\u001e\u0000\u01c0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005\u001b\u0000\u0000\u01c2"+
		"\u01c3\u0003\u000e\u0007\u0000\u01c3\u01c5\u0005\u0003\u0000\u0000\u01c4"+
		"\u01c6\u0003\u001a\r\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0005\u001c\u0000\u0000\u01ca\u01cb\u0005\u0001\u0000\u0000\u01cb\u01cc"+
		"\u0003:\u001d\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01b5\u0001"+
		"\u0000\u0000\u0000\u01cd\u01c1\u0001\u0000\u0000\u0000\u01ce;\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0005\u001d\u0000\u0000\u01d0\u01d2\u0005\u0003"+
		"\u0000\u0000\u01d1\u01d3\u0003\u001a\r\u0000\u01d2\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0005\u001c\u0000\u0000\u01d7\u01d8\u0005\u0001\u0000"+
		"\u0000\u01d8=\u0001\u0000\u0000\u0000\u01d9\u01da\u0006\u001f\uffff\uffff"+
		"\u0000\u01da\u01db\u0005\u0007\u0000\u0000\u01db\u01dc\u0003>\u001f\u0000"+
		"\u01dc\u01dd\u0005\b\u0000\u0000\u01dd\u01e5\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0005.\u0000\u0000\u01df\u01e0\u0005\u0007\u0000\u0000\u01e0\u01e1"+
		"\u0003>\u001f\u0000\u01e1\u01e2\u0005\b\u0000\u0000\u01e2\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e5\u0003@ \u0000\u01e4\u01d9\u0001\u0000\u0000"+
		"\u0000\u01e4\u01de\u0001\u0000\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e5\u01ec\u0001\u0000\u0000\u0000\u01e6\u01e7\n\u0002\u0000\u0000"+
		"\u01e7\u01e8\u0003B!\u0000\u01e8\u01e9\u0003>\u001f\u0003\u01e9\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ea\u01e6\u0001\u0000\u0000\u0000\u01eb\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ed?\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0005)\u0000\u0000\u01f0\u01f1\u0005/\u0000"+
		"\u0000\u01f1\u01f2\u0003$\u0012\u0000\u01f2A\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0007\u0003\u0000\u0000\u01f4C\u0001\u0000\u0000\u0000.GPW^hkp"+
		"w\u0087\u009a\u00b1\u00bb\u00c2\u00c9\u00d0\u00d6\u00e0\u00e8\u00ed\u00f8"+
		"\u010a\u010e\u011b\u0123\u0128\u012f\u0138\u0144\u014d\u015f\u016c\u0170"+
		"\u0173\u0178\u0184\u018c\u0198\u019c\u01a1\u01a9\u01bb\u01c7\u01cd\u01d4"+
		"\u01e4\u01ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}