package application.antlr;

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
		INPUT=1, OUTPUT=2, TYPE=3, MAIN=4, VAR=5, BEGIN=6, END=7, IF=8, ELSE=9, 
		ELSIF=10, THEN=11, SWITCH=12, CASE=13, BREAK=14, DEFAULT=15, WHILE=16, 
		DO=17, FOR=18, FROM=19, TO=20, STEP=21, AND=22, OR=23, LET=24, DEFINE=25, 
		CONST=26, IDF=27, INT=28, FLOAT=29, STRING=30, CHAR=31, AFFECT=32, NOT=33, 
		GREATER=34, LESSER=35, GEQ=36, LEQ=37, EQ=38, NEQ=39, LBRACE=40, RBRACE=41, 
		PLUS=42, SUB=43, MUL=44, DIV=45, COM=46, SEMI=47, LBRACKET=48, RBRACKET=49, 
		LPAR=50, RPAR=51, ASSIGN=52, TWOPOINT=53, COMMENT=54, WS=55, ERROR_TOKEN=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "DIGIT", "ALPHANUMERICAL", "INLINECOMMENT", "MULTILINECOMMENT", 
			"INPUT", "OUTPUT", "TYPE", "MAIN", "VAR", "BEGIN", "END", "IF", "ELSE", 
			"ELSIF", "THEN", "SWITCH", "CASE", "BREAK", "DEFAULT", "WHILE", "DO", 
			"FOR", "FROM", "TO", "STEP", "AND", "OR", "LET", "DEFINE", "CONST", "IDF", 
			"INT", "FLOAT", "STRING", "CHAR", "AFFECT", "NOT", "GREATER", "LESSER", 
			"GEQ", "LEQ", "EQ", "NEQ", "LBRACE", "RBRACE", "PLUS", "SUB", "MUL", 
			"DIV", "COM", "SEMI", "LBRACKET", "RBRACKET", "LPAR", "RPAR", "ASSIGN", 
			"TWOPOINT", "COMMENT", "WS", "ERROR_TOKEN"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\5\4\u0084\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u008b"+
		"\n\5\f\5\16\5\u008e\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u0099"+
		"\n\6\f\6\16\6\u009c\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c5\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\6!\u0143\n!\r!\16!\u0144\3!\6!\u0148\n!\r!\16!\u0149\3!\3!\6!"+
		"\u014e\n!\r!\16!\u014f\7!\u0152\n!\f!\16!\u0155\13!\7!\u0157\n!\f!\16"+
		"!\u015a\13!\3\"\6\"\u015d\n\"\r\"\16\"\u015e\3#\6#\u0162\n#\r#\16#\u0163"+
		"\3#\3#\6#\u0168\n#\r#\16#\u0169\3#\3#\6#\u016e\n#\r#\16#\u016f\3#\6#\u0173"+
		"\n#\r#\16#\u0174\3#\3#\5#\u0179\n#\3$\3$\7$\u017d\n$\f$\16$\u0180\13$"+
		"\3$\3$\3%\3%\5%\u0186\n%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;"+
		"\3;\3<\3<\5<\u01bd\n<\3=\6=\u01c0\n=\r=\16=\u01c1\3=\3=\3>\3>\3\u009a"+
		"\2?\3\2\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13"+
		"\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32"+
		"=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k\62m\63"+
		"o\64q\65s\66u\67w8y9{:\3\2\b\4\2C\\c|\3\2\62;\3\2\f\f\4\2\f\f$$\4\2\f"+
		"\f))\5\2\13\f\17\17\"\"\2\u01d8\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177\3"+
		"\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u0093\3\2\2\2\r\u00a1\3\2\2"+
		"\2\17\u00a7\3\2\2\2\21\u00c4\3\2\2\2\23\u00c6\3\2\2\2\25\u00cf\3\2\2\2"+
		"\27\u00d3\3\2\2\2\31\u00db\3\2\2\2\33\u00e1\3\2\2\2\35\u00e4\3\2\2\2\37"+
		"\u00e9\3\2\2\2!\u00ef\3\2\2\2#\u00f4\3\2\2\2%\u00fb\3\2\2\2\'\u0100\3"+
		"\2\2\2)\u0106\3\2\2\2+\u010e\3\2\2\2-\u0114\3\2\2\2/\u0117\3\2\2\2\61"+
		"\u011b\3\2\2\2\63\u0120\3\2\2\2\65\u0123\3\2\2\2\67\u0128\3\2\2\29\u012c"+
		"\3\2\2\2;\u012f\3\2\2\2=\u0133\3\2\2\2?\u013b\3\2\2\2A\u0142\3\2\2\2C"+
		"\u015c\3\2\2\2E\u0178\3\2\2\2G\u017a\3\2\2\2I\u0183\3\2\2\2K\u0189\3\2"+
		"\2\2M\u018c\3\2\2\2O\u018e\3\2\2\2Q\u0190\3\2\2\2S\u0192\3\2\2\2U\u0195"+
		"\3\2\2\2W\u0198\3\2\2\2Y\u019b\3\2\2\2[\u019e\3\2\2\2]\u01a0\3\2\2\2_"+
		"\u01a2\3\2\2\2a\u01a4\3\2\2\2c\u01a6\3\2\2\2e\u01a8\3\2\2\2g\u01aa\3\2"+
		"\2\2i\u01ac\3\2\2\2k\u01ae\3\2\2\2m\u01b0\3\2\2\2o\u01b2\3\2\2\2q\u01b4"+
		"\3\2\2\2s\u01b6\3\2\2\2u\u01b8\3\2\2\2w\u01bc\3\2\2\2y\u01bf\3\2\2\2{"+
		"\u01c5\3\2\2\2}~\t\2\2\2~\4\3\2\2\2\177\u0080\t\3\2\2\u0080\6\3\2\2\2"+
		"\u0081\u0084\5\3\2\2\u0082\u0084\5\5\3\2\u0083\u0081\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\b\3\2\2\2\u0085\u0086\7>\2\2\u0086\u0087\7#\2\2\u0087\u0088"+
		"\7/\2\2\u0088\u008c\3\2\2\2\u0089\u008b\n\4\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7/\2\2\u0090\u0091\7#\2\2\u0091\u0092"+
		"\7@\2\2\u0092\n\3\2\2\2\u0093\u0094\7}\2\2\u0094\u0095\7/\2\2\u0095\u0096"+
		"\7/\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7/\2\2\u009e\u009f\7/\2\2\u009f\u00a0"+
		"\7\177\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7r\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7v\2\2\u00a6\16\3\2\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7r\2\2"+
		"\u00ab\u00ac\7w\2\2\u00ac\u00ad\7v\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7"+
		"K\2\2\u00af\u00b0\7p\2\2\u00b0\u00c5\7v\2\2\u00b1\u00b2\7H\2\2\u00b2\u00b3"+
		"\7n\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7c\2\2\u00b5\u00c5\7v\2\2\u00b6"+
		"\u00b7\7D\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7q\2\2\u00b9\u00c5\7n\2\2"+
		"\u00ba\u00bb\7U\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c5\7i\2\2\u00c0\u00c1\7E\2\2\u00c1"+
		"\u00c2\7j\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c5\7t\2\2\u00c4\u00ae\3\2\2"+
		"\2\u00c4\u00b1\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00c0"+
		"\3\2\2\2\u00c5\22\3\2\2\2\u00c6\u00c7\7O\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7R\2\2\u00cb\u00cc\7t\2\2"+
		"\u00cc\u00cd\7i\2\2\u00cd\u00ce\7o\2\2\u00ce\24\3\2\2\2\u00cf\u00d0\7"+
		"X\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7t\2\2\u00d2\26\3\2\2\2\u00d3\u00d4"+
		"\7D\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\7k\2\2\u00d7"+
		"\u00d8\7p\2\2\u00d8\u00d9\7R\2\2\u00d9\u00da\7i\2\2\u00da\30\3\2\2\2\u00db"+
		"\u00dc\7G\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7R\2\2"+
		"\u00df\u00e0\7i\2\2\u00e0\32\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7"+
		"h\2\2\u00e3\34\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7"+
		"\7u\2\2\u00e7\u00e8\7g\2\2\u00e8\36\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7n\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7h\2\2\u00ee"+
		" \3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7p\2\2\u00f3\"\3\2\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7y\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7j\2\2"+
		"\u00fa$\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7u\2"+
		"\2\u00fe\u00ff\7g\2\2\u00ff&\3\2\2\2\u0100\u0101\7d\2\2\u0101\u0102\7"+
		"t\2\2\u0102\u0103\7g\2\2\u0103\u0104\7c\2\2\u0104\u0105\7m\2\2\u0105("+
		"\3\2\2\2\u0106\u0107\7f\2\2\u0107\u0108\7g\2\2\u0108\u0109\7h\2\2\u0109"+
		"\u010a\7c\2\2\u010a\u010b\7w\2\2\u010b\u010c\7n\2\2\u010c\u010d\7v\2\2"+
		"\u010d*\3\2\2\2\u010e\u010f\7y\2\2\u010f\u0110\7j\2\2\u0110\u0111\7k\2"+
		"\2\u0111\u0112\7n\2\2\u0112\u0113\7g\2\2\u0113,\3\2\2\2\u0114\u0115\7"+
		"f\2\2\u0115\u0116\7q\2\2\u0116.\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119"+
		"\7q\2\2\u0119\u011a\7t\2\2\u011a\60\3\2\2\2\u011b\u011c\7h\2\2\u011c\u011d"+
		"\7t\2\2\u011d\u011e\7q\2\2\u011e\u011f\7o\2\2\u011f\62\3\2\2\2\u0120\u0121"+
		"\7v\2\2\u0121\u0122\7q\2\2\u0122\64\3\2\2\2\u0123\u0124\7u\2\2\u0124\u0125"+
		"\7v\2\2\u0125\u0126\7g\2\2\u0126\u0127\7r\2\2\u0127\66\3\2\2\2\u0128\u0129"+
		"\7C\2\2\u0129\u012a\7P\2\2\u012a\u012b\7F\2\2\u012b8\3\2\2\2\u012c\u012d"+
		"\7Q\2\2\u012d\u012e\7T\2\2\u012e:\3\2\2\2\u012f\u0130\7n\2\2\u0130\u0131"+
		"\7g\2\2\u0131\u0132\7v\2\2\u0132<\3\2\2\2\u0133\u0134\7B\2\2\u0134\u0135"+
		"\7f\2\2\u0135\u0136\7g\2\2\u0136\u0137\7h\2\2\u0137\u0138\7k\2\2\u0138"+
		"\u0139\7p\2\2\u0139\u013a\7g\2\2\u013a>\3\2\2\2\u013b\u013c\7E\2\2\u013c"+
		"\u013d\7q\2\2\u013d\u013e\7p\2\2\u013e\u013f\7u\2\2\u013f\u0140\7v\2\2"+
		"\u0140@\3\2\2\2\u0141\u0143\5\3\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3"+
		"\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0158\3\2\2\2\u0146"+
		"\u0148\5\7\4\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u0153\3\2\2\2\u014b\u014d\7a\2\2\u014c"+
		"\u014e\5\7\4\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014b\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0156\u0147\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159B\3\2\2\2\u015a\u0158\3\2\2\2"+
		"\u015b\u015d\5\5\3\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015fD\3\2\2\2\u0160\u0162\5\5\3\2\u0161"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7\60\2\2\u0166\u0168\5\5\3\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u0179\3\2\2\2\u016b\u016d\7\60\2\2\u016c\u016e\5\5\3\2\u016d"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0179\3\2\2\2\u0171\u0173\5\5\3\2\u0172\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0177\7\60\2\2\u0177\u0179\3\2\2\2\u0178\u0161\3\2\2\2\u0178"+
		"\u016b\3\2\2\2\u0178\u0172\3\2\2\2\u0179F\3\2\2\2\u017a\u017e\7$\2\2\u017b"+
		"\u017d\n\5\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0182\7$\2\2\u0182H\3\2\2\2\u0183\u0185\7)\2\2\u0184\u0186\n\6\2\2\u0185"+
		"\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7)"+
		"\2\2\u0188J\3\2\2\2\u0189\u018a\7<\2\2\u018a\u018b\7?\2\2\u018bL\3\2\2"+
		"\2\u018c\u018d\7#\2\2\u018dN\3\2\2\2\u018e\u018f\7@\2\2\u018fP\3\2\2\2"+
		"\u0190\u0191\7>\2\2\u0191R\3\2\2\2\u0192\u0193\7@\2\2\u0193\u0194\7?\2"+
		"\2\u0194T\3\2\2\2\u0195\u0196\7>\2\2\u0196\u0197\7?\2\2\u0197V\3\2\2\2"+
		"\u0198\u0199\7?\2\2\u0199\u019a\7?\2\2\u019aX\3\2\2\2\u019b\u019c\7#\2"+
		"\2\u019c\u019d\7?\2\2\u019dZ\3\2\2\2\u019e\u019f\7}\2\2\u019f\\\3\2\2"+
		"\2\u01a0\u01a1\7\177\2\2\u01a1^\3\2\2\2\u01a2\u01a3\7-\2\2\u01a3`\3\2"+
		"\2\2\u01a4\u01a5\7/\2\2\u01a5b\3\2\2\2\u01a6\u01a7\7,\2\2\u01a7d\3\2\2"+
		"\2\u01a8\u01a9\7\61\2\2\u01a9f\3\2\2\2\u01aa\u01ab\7.\2\2\u01abh\3\2\2"+
		"\2\u01ac\u01ad\7=\2\2\u01adj\3\2\2\2\u01ae\u01af\7]\2\2\u01afl\3\2\2\2"+
		"\u01b0\u01b1\7_\2\2\u01b1n\3\2\2\2\u01b2\u01b3\7*\2\2\u01b3p\3\2\2\2\u01b4"+
		"\u01b5\7+\2\2\u01b5r\3\2\2\2\u01b6\u01b7\7?\2\2\u01b7t\3\2\2\2\u01b8\u01b9"+
		"\7<\2\2\u01b9v\3\2\2\2\u01ba\u01bd\5\13\6\2\u01bb\u01bd\5\t\5\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bdx\3\2\2\2\u01be\u01c0\t\7\2\2"+
		"\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\b=\2\2\u01c4z\3\2\2\2\u01c5\u01c6"+
		"\13\2\2\2\u01c6|\3\2\2\2\26\2\u0083\u008c\u009a\u00c4\u0144\u0149\u014f"+
		"\u0153\u0158\u015e\u0163\u0169\u016f\u0174\u0178\u017e\u0185\u01bc\u01c1"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}