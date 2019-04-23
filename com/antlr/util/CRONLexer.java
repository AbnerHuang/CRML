// Generated from /home/hsiao/Code/NML/cron/CRON.g4 by ANTLR 4.7.2
package com.antlr.util;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TopologyGroup=8, 
		Topology=9, Name=10, Nodes=11, Node=12, IP=13, Platform=14, LinkGroup=15, 
		Link=16, Bidirectional=17, Source=18, Sink=19, Rate=20, Mbit=21, NUM=22, 
		TEXT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "TopologyGroup", 
			"Topology", "Name", "Nodes", "Node", "IP", "Platform", "LinkGroup", "Link", 
			"Bidirectional", "Source", "Sink", "Rate", "Mbit", "NUM", "TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "TopologyGroup", "Topology", 
			"Name", "Nodes", "Node", "IP", "Platform", "LinkGroup", "Link", "Bidirectional", 
			"Source", "Sink", "Rate", "Mbit", "NUM", "TEXT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27"+
		"\u00ab\n\27\f\27\16\27\u00ae\13\27\5\27\u00b0\n\27\3\30\6\30\u00b3\n\30"+
		"\r\30\16\30\u00b4\3\31\6\31\u00b8\n\31\r\31\16\31\u00b9\3\31\3\31\2\2"+
		"\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\31\4\2VVvv\4\2QQ"+
		"qq\4\2RRrr\4\2NNnn\4\2IIii\4\2[[{{\4\2TTtt\4\2WWww\4\2PPpp\4\2CCcc\4\2"+
		"OOoo\4\2GGgg\4\2FFff\4\2UUuu\4\2KKkk\4\2HHhh\4\2MMmm\4\2DDdd\4\2EEee\3"+
		"\2\63;\3\2\62;\r\2\f\f\17\17\"\"$$..\60\60\62<]]__}}\177\177\5\2\13\f"+
		"\17\17\"\"\2\u00c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2"+
		"\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23O\3\2\2\2"+
		"\25X\3\2\2\2\27]\3\2\2\2\31c\3\2\2\2\33h\3\2\2\2\35k\3\2\2\2\37t\3\2\2"+
		"\2!~\3\2\2\2#\u0083\3\2\2\2%\u0091\3\2\2\2\'\u0098\3\2\2\2)\u009d\3\2"+
		"\2\2+\u00a2\3\2\2\2-\u00af\3\2\2\2/\u00b2\3\2\2\2\61\u00b7\3\2\2\2\63"+
		"\64\7}\2\2\64\4\3\2\2\2\65\66\7.\2\2\66\6\3\2\2\2\678\7\177\2\28\b\3\2"+
		"\2\29:\7<\2\2:\n\3\2\2\2;<\7]\2\2<\f\3\2\2\2=>\7_\2\2>\16\3\2\2\2?@\7"+
		"\60\2\2@\20\3\2\2\2AB\t\2\2\2BC\t\3\2\2CD\t\4\2\2DE\t\3\2\2EF\t\5\2\2"+
		"FG\t\3\2\2GH\t\6\2\2HI\t\7\2\2IJ\t\6\2\2JK\t\b\2\2KL\t\3\2\2LM\t\t\2\2"+
		"MN\t\4\2\2N\22\3\2\2\2OP\t\2\2\2PQ\t\3\2\2QR\t\4\2\2RS\t\3\2\2ST\t\5\2"+
		"\2TU\t\3\2\2UV\t\6\2\2VW\t\7\2\2W\24\3\2\2\2XY\t\n\2\2YZ\t\13\2\2Z[\t"+
		"\f\2\2[\\\t\r\2\2\\\26\3\2\2\2]^\t\n\2\2^_\t\3\2\2_`\t\16\2\2`a\t\r\2"+
		"\2ab\t\17\2\2b\30\3\2\2\2cd\t\n\2\2de\t\3\2\2ef\t\16\2\2fg\t\r\2\2g\32"+
		"\3\2\2\2hi\t\20\2\2ij\t\4\2\2j\34\3\2\2\2kl\t\4\2\2lm\t\5\2\2mn\t\13\2"+
		"\2no\t\2\2\2op\t\21\2\2pq\t\3\2\2qr\t\b\2\2rs\t\f\2\2s\36\3\2\2\2tu\t"+
		"\5\2\2uv\t\20\2\2vw\t\n\2\2wx\t\22\2\2xy\t\6\2\2yz\t\b\2\2z{\t\3\2\2{"+
		"|\t\t\2\2|}\t\4\2\2} \3\2\2\2~\177\t\5\2\2\177\u0080\t\20\2\2\u0080\u0081"+
		"\t\n\2\2\u0081\u0082\t\22\2\2\u0082\"\3\2\2\2\u0083\u0084\t\23\2\2\u0084"+
		"\u0085\t\20\2\2\u0085\u0086\t\16\2\2\u0086\u0087\t\20\2\2\u0087\u0088"+
		"\t\b\2\2\u0088\u0089\t\r\2\2\u0089\u008a\t\24\2\2\u008a\u008b\t\2\2\2"+
		"\u008b\u008c\t\20\2\2\u008c\u008d\t\3\2\2\u008d\u008e\t\n\2\2\u008e\u008f"+
		"\t\13\2\2\u008f\u0090\t\5\2\2\u0090$\3\2\2\2\u0091\u0092\t\17\2\2\u0092"+
		"\u0093\t\3\2\2\u0093\u0094\t\t\2\2\u0094\u0095\t\b\2\2\u0095\u0096\t\24"+
		"\2\2\u0096\u0097\t\r\2\2\u0097&\3\2\2\2\u0098\u0099\t\17\2\2\u0099\u009a"+
		"\t\20\2\2\u009a\u009b\t\n\2\2\u009b\u009c\t\22\2\2\u009c(\3\2\2\2\u009d"+
		"\u009e\t\b\2\2\u009e\u009f\t\13\2\2\u009f\u00a0\t\2\2\2\u00a0\u00a1\t"+
		"\r\2\2\u00a1*\3\2\2\2\u00a2\u00a3\t\f\2\2\u00a3\u00a4\t\23\2\2\u00a4\u00a5"+
		"\t\20\2\2\u00a5\u00a6\t\2\2\2\u00a6,\3\2\2\2\u00a7\u00b0\7\62\2\2\u00a8"+
		"\u00ac\t\25\2\2\u00a9\u00ab\t\26\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00a8\3\2\2\2\u00b0.\3\2\2\2"+
		"\u00b1\u00b3\n\27\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\60\3\2\2\2\u00b6\u00b8\t\30\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\31\2\2\u00bc\62\3\2\2\2\7\2\u00ac"+
		"\u00af\u00b4\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}