// Generated from /home/hsiao/Code/NML/cron/CRON.g4 by ANTLR 4.7.2
package com.antlr.util;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CRONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TopologyGroup=8, 
		Topology=9, Name=10, Nodes=11, Node=12, IP=13, Platform=14, LinkGroup=15, 
		Link=16, Bidirectional=17, Source=18, Sink=19, Rate=20, Mbit=21, NUM=22, 
		TEXT=23, WS=24;
	public static final int
		RULE_cron = 0, RULE_topologygroup = 1, RULE_topology = 2, RULE_topologycontent = 3, 
		RULE_nodes = 4, RULE_node = 5, RULE_nodecontent = 6, RULE_ipv4addr = 7, 
		RULE_property = 8, RULE_linkgroup = 9, RULE_link = 10, RULE_linkcontent = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"cron", "topologygroup", "topology", "topologycontent", "nodes", "node", 
			"nodecontent", "ipv4addr", "property", "linkgroup", "link", "linkcontent"
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

	@Override
	public String getGrammarFileName() { return "CRON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CRONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CronContext extends ParserRuleContext {
		public List<TopologygroupContext> topologygroup() {
			return getRuleContexts(TopologygroupContext.class);
		}
		public TopologygroupContext topologygroup(int i) {
			return getRuleContext(TopologygroupContext.class,i);
		}
		public List<LinkgroupContext> linkgroup() {
			return getRuleContexts(LinkgroupContext.class);
		}
		public LinkgroupContext linkgroup(int i) {
			return getRuleContext(LinkgroupContext.class,i);
		}
		public CronContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cron; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterCron(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitCron(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitCron(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CronContext cron() throws RecognitionException {
		CronContext _localctx = new CronContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cron);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				topologygroup();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TopologyGroup );
			setState(30);
			match(T__1);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				linkgroup();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LinkGroup );
			setState(36);
			match(T__2);
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

	public static class TopologygroupContext extends ParserRuleContext {
		public TerminalNode TopologyGroup() { return getToken(CRONParser.TopologyGroup, 0); }
		public List<TopologyContext> topology() {
			return getRuleContexts(TopologyContext.class);
		}
		public TopologyContext topology(int i) {
			return getRuleContext(TopologyContext.class,i);
		}
		public TopologygroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topologygroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterTopologygroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitTopologygroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitTopologygroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopologygroupContext topologygroup() throws RecognitionException {
		TopologygroupContext _localctx = new TopologygroupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topologygroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(TopologyGroup);
			setState(39);
			match(T__3);
			setState(40);
			match(T__0);
			setState(41);
			topology();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(42);
				match(T__1);
				setState(43);
				topology();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__2);
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

	public static class TopologyContext extends ParserRuleContext {
		public TerminalNode Topology() { return getToken(CRONParser.Topology, 0); }
		public List<TopologycontentContext> topologycontent() {
			return getRuleContexts(TopologycontentContext.class);
		}
		public TopologycontentContext topologycontent(int i) {
			return getRuleContext(TopologycontentContext.class,i);
		}
		public TopologyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topology; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterTopology(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitTopology(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitTopology(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopologyContext topology() throws RecognitionException {
		TopologyContext _localctx = new TopologyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topology);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(Topology);
			setState(52);
			match(T__3);
			setState(53);
			match(T__0);
			setState(54);
			topologycontent();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(55);
				match(T__1);
				setState(56);
				topologycontent();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__2);
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

	public static class TopologycontentContext extends ParserRuleContext {
		public TopologycontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topologycontent; }
	 
		public TopologycontentContext() { }
		public void copyFrom(TopologycontentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TopologynameContext extends TopologycontentContext {
		public TerminalNode Name() { return getToken(CRONParser.Name, 0); }
		public TerminalNode TEXT() { return getToken(CRONParser.TEXT, 0); }
		public TopologynameContext(TopologycontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterTopologyname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitTopologyname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitTopologyname(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TopologynodeContext extends TopologycontentContext {
		public TerminalNode Nodes() { return getToken(CRONParser.Nodes, 0); }
		public NodesContext nodes() {
			return getRuleContext(NodesContext.class,0);
		}
		public TopologynodeContext(TopologycontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterTopologynode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitTopologynode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitTopologynode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TopologynodearrayContext extends TopologycontentContext {
		public TerminalNode Nodes() { return getToken(CRONParser.Nodes, 0); }
		public TerminalNode NUM() { return getToken(CRONParser.NUM, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TopologynodearrayContext(TopologycontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterTopologynodearray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitTopologynodearray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitTopologynodearray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopologycontentContext topologycontent() throws RecognitionException {
		TopologycontentContext _localctx = new TopologycontentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topologycontent);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new TopologynameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(Name);
				setState(65);
				match(T__3);
				setState(66);
				match(TEXT);
				}
				break;
			case 2:
				_localctx = new TopologynodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(Nodes);
				setState(68);
				match(T__3);
				setState(69);
				nodes();
				}
				break;
			case 3:
				_localctx = new TopologynodearrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(Nodes);
				setState(71);
				match(T__4);
				setState(72);
				match(NUM);
				setState(73);
				match(T__5);
				setState(74);
				match(T__3);
				setState(75);
				match(T__0);
				setState(76);
				property();
				setState(77);
				match(T__2);
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

	public static class NodesContext extends ParserRuleContext {
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public NodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodesContext nodes() throws RecognitionException {
		NodesContext _localctx = new NodesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			node();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(83);
				match(T__1);
				setState(84);
				node();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__2);
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

	public static class NodeContext extends ParserRuleContext {
		public TerminalNode Node() { return getToken(CRONParser.Node, 0); }
		public List<NodecontentContext> nodecontent() {
			return getRuleContexts(NodecontentContext.class);
		}
		public NodecontentContext nodecontent(int i) {
			return getRuleContext(NodecontentContext.class,i);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Node);
			setState(93);
			match(T__3);
			setState(94);
			match(T__0);
			setState(95);
			nodecontent();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(96);
				match(T__1);
				setState(97);
				nodecontent();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__2);
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

	public static class NodecontentContext extends ParserRuleContext {
		public NodecontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodecontent; }
	 
		public NodecontentContext() { }
		public void copyFrom(NodecontentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ipv4adContext extends NodecontentContext {
		public TerminalNode IP() { return getToken(CRONParser.IP, 0); }
		public Ipv4addrContext ipv4addr() {
			return getRuleContext(Ipv4addrContext.class,0);
		}
		public Ipv4adContext(NodecontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterIpv4ad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitIpv4ad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitIpv4ad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NodepropertyContext extends NodecontentContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public NodepropertyContext(NodecontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterNodeproperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitNodeproperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitNodeproperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodecontentContext nodecontent() throws RecognitionException {
		NodecontentContext _localctx = new NodecontentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nodecontent);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IP:
				_localctx = new Ipv4adContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(IP);
				setState(106);
				match(T__3);
				setState(107);
				ipv4addr();
				}
				break;
			case Platform:
				_localctx = new NodepropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				property();
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

	public static class Ipv4addrContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(CRONParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(CRONParser.NUM, i);
		}
		public Ipv4addrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4addr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterIpv4addr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitIpv4addr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitIpv4addr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4addrContext ipv4addr() throws RecognitionException {
		Ipv4addrContext _localctx = new Ipv4addrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ipv4addr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(NUM);
			setState(112);
			match(T__6);
			setState(113);
			match(NUM);
			setState(114);
			match(T__6);
			setState(115);
			match(NUM);
			setState(116);
			match(T__6);
			setState(117);
			match(NUM);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode Platform() { return getToken(CRONParser.Platform, 0); }
		public TerminalNode TEXT() { return getToken(CRONParser.TEXT, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Platform);
			setState(120);
			match(T__3);
			setState(121);
			match(TEXT);
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

	public static class LinkgroupContext extends ParserRuleContext {
		public TerminalNode LinkGroup() { return getToken(CRONParser.LinkGroup, 0); }
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public LinkgroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkgroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterLinkgroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitLinkgroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitLinkgroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkgroupContext linkgroup() throws RecognitionException {
		LinkgroupContext _localctx = new LinkgroupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_linkgroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LinkGroup);
			setState(124);
			match(T__3);
			setState(125);
			match(T__0);
			setState(126);
			link();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(127);
				match(T__1);
				setState(128);
				link();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__2);
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

	public static class LinkContext extends ParserRuleContext {
		public TerminalNode Link() { return getToken(CRONParser.Link, 0); }
		public List<LinkcontentContext> linkcontent() {
			return getRuleContexts(LinkcontentContext.class);
		}
		public LinkcontentContext linkcontent(int i) {
			return getRuleContext(LinkcontentContext.class,i);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(Link);
			setState(137);
			match(T__3);
			setState(138);
			match(T__0);
			setState(139);
			linkcontent();
			{
			setState(140);
			match(T__1);
			setState(141);
			linkcontent();
			}
			setState(143);
			match(T__2);
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

	public static class LinkcontentContext extends ParserRuleContext {
		public LinkcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkcontent; }
	 
		public LinkcontentContext() { }
		public void copyFrom(LinkcontentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SourcesinkContext extends LinkcontentContext {
		public TerminalNode Source() { return getToken(CRONParser.Source, 0); }
		public List<TerminalNode> TEXT() { return getTokens(CRONParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CRONParser.TEXT, i);
		}
		public TerminalNode Sink() { return getToken(CRONParser.Sink, 0); }
		public SourcesinkContext(LinkcontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterSourcesink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitSourcesink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitSourcesink(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BidirectionalContext extends LinkcontentContext {
		public TerminalNode Bidirectional() { return getToken(CRONParser.Bidirectional, 0); }
		public List<TerminalNode> TEXT() { return getTokens(CRONParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CRONParser.TEXT, i);
		}
		public BidirectionalContext(LinkcontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterBidirectional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitBidirectional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitBidirectional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RateContext extends LinkcontentContext {
		public TerminalNode Rate() { return getToken(CRONParser.Rate, 0); }
		public TerminalNode NUM() { return getToken(CRONParser.NUM, 0); }
		public TerminalNode Mbit() { return getToken(CRONParser.Mbit, 0); }
		public RateContext(LinkcontentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).enterRate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRONListener ) ((CRONListener)listener).exitRate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CRONVisitor ) return ((CRONVisitor<? extends T>)visitor).visitRate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkcontentContext linkcontent() throws RecognitionException {
		LinkcontentContext _localctx = new LinkcontentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_linkcontent);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bidirectional:
				_localctx = new BidirectionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(Bidirectional);
				setState(146);
				match(T__3);
				setState(147);
				match(T__4);
				setState(148);
				match(TEXT);
				setState(149);
				match(T__1);
				setState(150);
				match(TEXT);
				setState(151);
				match(T__5);
				}
				break;
			case Source:
				_localctx = new SourcesinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(Source);
				setState(153);
				match(T__3);
				setState(154);
				match(TEXT);
				setState(155);
				match(T__1);
				setState(156);
				match(Sink);
				setState(157);
				match(T__3);
				setState(158);
				match(TEXT);
				}
				break;
			case Rate:
				_localctx = new RateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(Rate);
				setState(160);
				match(T__3);
				setState(161);
				match(NUM);
				setState(162);
				match(Mbit);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\6\2#\n\2"+
		"\r\2\16\2$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6"+
		"\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7e"+
		"\n\7\f\7\16\7h\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0084"+
		"\n\13\f\13\16\13\u0087\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00a6\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u00a7"+
		"\2\32\3\2\2\2\4(\3\2\2\2\6\65\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\f^\3\2\2\2"+
		"\16o\3\2\2\2\20q\3\2\2\2\22y\3\2\2\2\24}\3\2\2\2\26\u008a\3\2\2\2\30\u00a5"+
		"\3\2\2\2\32\34\7\3\2\2\33\35\5\4\3\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 \"\7\4\2\2!#\5\24\13\2\"!\3\2\2\2#"+
		"$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\5\2\2\'\3\3\2\2\2()\7\n"+
		"\2\2)*\7\6\2\2*+\7\3\2\2+\60\5\6\4\2,-\7\4\2\2-/\5\6\4\2.,\3\2\2\2/\62"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7"+
		"\5\2\2\64\5\3\2\2\2\65\66\7\13\2\2\66\67\7\6\2\2\678\7\3\2\28=\5\b\5\2"+
		"9:\7\4\2\2:<\5\b\5\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2"+
		"?=\3\2\2\2@A\7\5\2\2A\7\3\2\2\2BC\7\f\2\2CD\7\6\2\2DR\7\31\2\2EF\7\r\2"+
		"\2FG\7\6\2\2GR\5\n\6\2HI\7\r\2\2IJ\7\7\2\2JK\7\30\2\2KL\7\b\2\2LM\7\6"+
		"\2\2MN\7\3\2\2NO\5\22\n\2OP\7\5\2\2PR\3\2\2\2QB\3\2\2\2QE\3\2\2\2QH\3"+
		"\2\2\2R\t\3\2\2\2ST\7\3\2\2TY\5\f\7\2UV\7\4\2\2VX\5\f\7\2WU\3\2\2\2X["+
		"\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\5\2\2]\13\3\2\2"+
		"\2^_\7\16\2\2_`\7\6\2\2`a\7\3\2\2af\5\16\b\2bc\7\4\2\2ce\5\16\b\2db\3"+
		"\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\5\2\2j\r"+
		"\3\2\2\2kl\7\17\2\2lm\7\6\2\2mp\5\20\t\2np\5\22\n\2ok\3\2\2\2on\3\2\2"+
		"\2p\17\3\2\2\2qr\7\30\2\2rs\7\t\2\2st\7\30\2\2tu\7\t\2\2uv\7\30\2\2vw"+
		"\7\t\2\2wx\7\30\2\2x\21\3\2\2\2yz\7\20\2\2z{\7\6\2\2{|\7\31\2\2|\23\3"+
		"\2\2\2}~\7\21\2\2~\177\7\6\2\2\177\u0080\7\3\2\2\u0080\u0085\5\26\f\2"+
		"\u0081\u0082\7\4\2\2\u0082\u0084\5\26\f\2\u0083\u0081\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\7\5\2\2\u0089\25\3\2\2\2\u008a\u008b\7\22\2"+
		"\2\u008b\u008c\7\6\2\2\u008c\u008d\7\3\2\2\u008d\u008e\5\30\r\2\u008e"+
		"\u008f\7\4\2\2\u008f\u0090\5\30\r\2\u0090\u0091\3\2\2\2\u0091\u0092\7"+
		"\5\2\2\u0092\27\3\2\2\2\u0093\u0094\7\23\2\2\u0094\u0095\7\6\2\2\u0095"+
		"\u0096\7\7\2\2\u0096\u0097\7\31\2\2\u0097\u0098\7\4\2\2\u0098\u0099\7"+
		"\31\2\2\u0099\u00a6\7\b\2\2\u009a\u009b\7\24\2\2\u009b\u009c\7\6\2\2\u009c"+
		"\u009d\7\31\2\2\u009d\u009e\7\4\2\2\u009e\u009f\7\25\2\2\u009f\u00a0\7"+
		"\6\2\2\u00a0\u00a6\7\31\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\7\6\2\2\u00a3"+
		"\u00a4\7\30\2\2\u00a4\u00a6\7\27\2\2\u00a5\u0093\3\2\2\2\u00a5\u009a\3"+
		"\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\31\3\2\2\2\f\36$\60=QYfo\u0085\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}