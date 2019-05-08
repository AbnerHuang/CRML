// Generated from /home/hsiao/Code/NML/cron/CRON.g4 by ANTLR 4.7.2
package com.antlr.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CRONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TopologyGroup=11, Topology=12, Name=13, Nodes=14, Node=15, IP=16, 
		Platform=17, Firewall=18, User=19, LinkGroup=20, Link=21, Bidirectional=22, 
		Source=23, Sink=24, Rate=25, Mbit=26, ID=27, LETTER=28, NUM=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "TopologyGroup", "Topology", "Name", "Nodes", "Node", "IP", "Platform", 
			"Firewall", "User", "LinkGroup", "Link", "Bidirectional", "Source", "Sink", 
			"Rate", "Mbit", "ID", "LETTER", "NUM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'.'", "'\"'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TopologyGroup", 
			"Topology", "Name", "Nodes", "Node", "IP", "Platform", "Firewall", "User", 
			"LinkGroup", "Link", "Bidirectional", "Source", "Sink", "Rate", "Mbit", 
			"ID", "LETTER", "NUM", "WS"
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


	public CRONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CRON.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u00d2\n\34\f\34\16"+
		"\34\u00d5\13\34\3\35\3\35\3\36\3\36\3\36\7\36\u00dc\n\36\f\36\16\36\u00df"+
		"\13\36\5\36\u00e1\n\36\3\37\6\37\u00e4\n\37\r\37\16\37\u00e5\3\37\3\37"+
		"\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= \3\2\33\4\2VVvv\4\2QQqq\4\2RRrr\4\2NNnn\4\2IIii\4\2[[{{\4\2TTtt"+
		"\4\2WWww\4\2PPpp\4\2CCcc\4\2OOoo\4\2GGgg\4\2FFff\4\2UUuu\4\2KKkk\4\2H"+
		"Hhh\4\2YYyy\4\2MMmm\4\2DDdd\4\2EEee\4\2\62;aa\4\2C\\c|\3\2\63;\3\2\62"+
		";\5\2\13\f\17\17\"\"\2\u00ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C"+
		"\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23"+
		"O\3\2\2\2\25T\3\2\2\2\27Z\3\2\2\2\31h\3\2\2\2\33q\3\2\2\2\35v\3\2\2\2"+
		"\37|\3\2\2\2!\u0081\3\2\2\2#\u0084\3\2\2\2%\u008d\3\2\2\2\'\u0096\3\2"+
		"\2\2)\u009b\3\2\2\2+\u00a5\3\2\2\2-\u00aa\3\2\2\2/\u00b8\3\2\2\2\61\u00bf"+
		"\3\2\2\2\63\u00c4\3\2\2\2\65\u00c9\3\2\2\2\67\u00ce\3\2\2\29\u00d6\3\2"+
		"\2\2;\u00e0\3\2\2\2=\u00e3\3\2\2\2?@\7}\2\2@\4\3\2\2\2AB\7.\2\2B\6\3\2"+
		"\2\2CD\7\177\2\2D\b\3\2\2\2EF\7<\2\2F\n\3\2\2\2GH\7]\2\2H\f\3\2\2\2IJ"+
		"\7_\2\2J\16\3\2\2\2KL\7\60\2\2L\20\3\2\2\2MN\7$\2\2N\22\3\2\2\2OP\7v\2"+
		"\2PQ\7t\2\2QR\7w\2\2RS\7g\2\2S\24\3\2\2\2TU\7h\2\2UV\7c\2\2VW\7n\2\2W"+
		"X\7u\2\2XY\7g\2\2Y\26\3\2\2\2Z[\t\2\2\2[\\\t\3\2\2\\]\t\4\2\2]^\t\3\2"+
		"\2^_\t\5\2\2_`\t\3\2\2`a\t\6\2\2ab\t\7\2\2bc\t\6\2\2cd\t\b\2\2de\t\3\2"+
		"\2ef\t\t\2\2fg\t\4\2\2g\30\3\2\2\2hi\t\2\2\2ij\t\3\2\2jk\t\4\2\2kl\t\3"+
		"\2\2lm\t\5\2\2mn\t\3\2\2no\t\6\2\2op\t\7\2\2p\32\3\2\2\2qr\t\n\2\2rs\t"+
		"\13\2\2st\t\f\2\2tu\t\r\2\2u\34\3\2\2\2vw\t\n\2\2wx\t\3\2\2xy\t\16\2\2"+
		"yz\t\r\2\2z{\t\17\2\2{\36\3\2\2\2|}\t\n\2\2}~\t\3\2\2~\177\t\16\2\2\177"+
		"\u0080\t\r\2\2\u0080 \3\2\2\2\u0081\u0082\t\20\2\2\u0082\u0083\t\4\2\2"+
		"\u0083\"\3\2\2\2\u0084\u0085\t\4\2\2\u0085\u0086\t\5\2\2\u0086\u0087\t"+
		"\13\2\2\u0087\u0088\t\2\2\2\u0088\u0089\t\21\2\2\u0089\u008a\t\3\2\2\u008a"+
		"\u008b\t\b\2\2\u008b\u008c\t\f\2\2\u008c$\3\2\2\2\u008d\u008e\t\21\2\2"+
		"\u008e\u008f\t\20\2\2\u008f\u0090\t\b\2\2\u0090\u0091\t\r\2\2\u0091\u0092"+
		"\t\22\2\2\u0092\u0093\t\13\2\2\u0093\u0094\t\5\2\2\u0094\u0095\t\5\2\2"+
		"\u0095&\3\2\2\2\u0096\u0097\t\t\2\2\u0097\u0098\t\17\2\2\u0098\u0099\t"+
		"\r\2\2\u0099\u009a\t\b\2\2\u009a(\3\2\2\2\u009b\u009c\t\5\2\2\u009c\u009d"+
		"\t\20\2\2\u009d\u009e\t\n\2\2\u009e\u009f\t\23\2\2\u009f\u00a0\t\6\2\2"+
		"\u00a0\u00a1\t\b\2\2\u00a1\u00a2\t\3\2\2\u00a2\u00a3\t\t\2\2\u00a3\u00a4"+
		"\t\4\2\2\u00a4*\3\2\2\2\u00a5\u00a6\t\5\2\2\u00a6\u00a7\t\20\2\2\u00a7"+
		"\u00a8\t\n\2\2\u00a8\u00a9\t\23\2\2\u00a9,\3\2\2\2\u00aa\u00ab\t\24\2"+
		"\2\u00ab\u00ac\t\20\2\2\u00ac\u00ad\t\16\2\2\u00ad\u00ae\t\20\2\2\u00ae"+
		"\u00af\t\b\2\2\u00af\u00b0\t\r\2\2\u00b0\u00b1\t\25\2\2\u00b1\u00b2\t"+
		"\2\2\2\u00b2\u00b3\t\20\2\2\u00b3\u00b4\t\3\2\2\u00b4\u00b5\t\n\2\2\u00b5"+
		"\u00b6\t\13\2\2\u00b6\u00b7\t\5\2\2\u00b7.\3\2\2\2\u00b8\u00b9\t\17\2"+
		"\2\u00b9\u00ba\t\3\2\2\u00ba\u00bb\t\t\2\2\u00bb\u00bc\t\b\2\2\u00bc\u00bd"+
		"\t\25\2\2\u00bd\u00be\t\r\2\2\u00be\60\3\2\2\2\u00bf\u00c0\t\17\2\2\u00c0"+
		"\u00c1\t\20\2\2\u00c1\u00c2\t\n\2\2\u00c2\u00c3\t\23\2\2\u00c3\62\3\2"+
		"\2\2\u00c4\u00c5\t\b\2\2\u00c5\u00c6\t\13\2\2\u00c6\u00c7\t\2\2\2\u00c7"+
		"\u00c8\t\r\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\t\f\2\2\u00ca\u00cb\t\24\2"+
		"\2\u00cb\u00cc\t\20\2\2\u00cc\u00cd\t\2\2\2\u00cd\66\3\2\2\2\u00ce\u00d3"+
		"\59\35\2\u00cf\u00d2\59\35\2\u00d0\u00d2\t\26\2\2\u00d1\u00cf\3\2\2\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d48\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\t\27\2\2\u00d7"+
		":\3\2\2\2\u00d8\u00e1\7\62\2\2\u00d9\u00dd\t\30\2\2\u00da\u00dc\t\31\2"+
		"\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0"+
		"\u00d9\3\2\2\2\u00e1<\3\2\2\2\u00e2\u00e4\t\32\2\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\b\37\2\2\u00e8>\3\2\2\2\b\2\u00d1\u00d3\u00dd\u00e0"+
		"\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}