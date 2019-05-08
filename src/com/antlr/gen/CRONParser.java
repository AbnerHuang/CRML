// Generated from /home/hsiao/Code/NML/cron/CRON.g4 by ANTLR 4.7.2
package com.antlr.gen;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TopologyGroup=11, Topology=12, Name=13, Nodes=14, Node=15, IP=16, 
		Platform=17, Firewall=18, User=19, LinkGroup=20, Link=21, Bidirectional=22, 
		Source=23, Sink=24, Rate=25, Mbit=26, ID=27, LETTER=28, NUM=29, WS=30;
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			topologygroup();
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					match(T__1);
					setState(27);
					topologygroup();
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(33);
			match(T__1);
			setState(34);
			linkgroup();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(35);
				match(T__1);
				setState(36);
				linkgroup();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
			setState(44);
			match(TopologyGroup);
			setState(45);
			match(T__3);
			setState(46);
			match(T__0);
			setState(47);
			topology();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(48);
				match(T__1);
				setState(49);
				topology();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(57);
			match(Topology);
			setState(58);
			match(T__3);
			setState(59);
			match(T__0);
			setState(60);
			topologycontent();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(61);
				match(T__1);
				setState(62);
				topologycontent();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public TerminalNode ID() { return getToken(CRONParser.ID, 0); }
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new TopologynameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(Name);
				setState(71);
				match(T__3);
				setState(72);
				match(ID);
				}
				break;
			case 2:
				_localctx = new TopologynodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(Nodes);
				setState(74);
				match(T__3);
				setState(75);
				nodes();
				}
				break;
			case 3:
				_localctx = new TopologynodearrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(Nodes);
				setState(77);
				match(T__4);
				setState(78);
				match(NUM);
				setState(79);
				match(T__5);
				setState(80);
				match(T__3);
				setState(81);
				match(T__0);
				setState(82);
				property();
				setState(83);
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
			setState(87);
			match(T__0);
			setState(88);
			node();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(89);
				match(T__1);
				setState(90);
				node();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
			setState(98);
			match(Node);
			setState(99);
			match(T__3);
			setState(100);
			match(T__0);
			setState(101);
			nodecontent();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(102);
				match(T__1);
				setState(103);
				nodecontent();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IP:
				_localctx = new Ipv4adContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(IP);
				setState(112);
				match(T__3);
				setState(113);
				ipv4addr();
				}
				break;
			case Platform:
			case Firewall:
			case User:
				_localctx = new NodepropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
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
			setState(117);
			match(NUM);
			setState(118);
			match(T__6);
			setState(119);
			match(NUM);
			setState(120);
			match(T__6);
			setState(121);
			match(NUM);
			setState(122);
			match(T__6);
			setState(123);
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
		public TerminalNode ID() { return getToken(CRONParser.ID, 0); }
		public TerminalNode Firewall() { return getToken(CRONParser.Firewall, 0); }
		public TerminalNode User() { return getToken(CRONParser.User, 0); }
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
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Platform:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(Platform);
				setState(126);
				match(T__3);
				setState(127);
				match(ID);
				}
				break;
			case Firewall:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(Firewall);
				setState(129);
				match(T__3);
				setState(130);
				match(T__7);
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				match(T__7);
				}
				break;
			case User:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(User);
				setState(134);
				match(T__3);
				setState(135);
				match(ID);
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
			setState(138);
			match(LinkGroup);
			setState(139);
			match(T__3);
			setState(140);
			match(T__0);
			setState(141);
			link();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(142);
				match(T__1);
				setState(143);
				link();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
			setState(151);
			match(Link);
			setState(152);
			match(T__3);
			setState(153);
			match(T__0);
			setState(154);
			linkcontent();
			{
			setState(155);
			match(T__1);
			setState(156);
			linkcontent();
			}
			setState(158);
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
		public List<TerminalNode> ID() { return getTokens(CRONParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CRONParser.ID, i);
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
		public List<TerminalNode> ID() { return getTokens(CRONParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CRONParser.ID, i);
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
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bidirectional:
				_localctx = new BidirectionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(Bidirectional);
				setState(161);
				match(T__3);
				setState(162);
				match(T__4);
				setState(163);
				match(ID);
				setState(164);
				match(T__1);
				setState(165);
				match(ID);
				setState(166);
				match(T__5);
				}
				break;
			case Source:
				_localctx = new SourcesinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(Source);
				setState(168);
				match(T__3);
				setState(169);
				match(ID);
				setState(170);
				match(T__1);
				setState(171);
				match(Sink);
				setState(172);
				match(T__3);
				setState(173);
				match(ID);
				}
				break;
			case Rate:
				_localctx = new RateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(Rate);
				setState(175);
				match(T__3);
				setState(176);
				match(NUM);
				setState(177);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3\2"+
		"\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\65"+
		"\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4"+
		"E\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bv"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0093\n\13"+
		"\f\13\16\13\u0096\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00b5\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\13\f"+
		"\2\u00b8\2\32\3\2\2\2\4.\3\2\2\2\6;\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2\fd\3"+
		"\2\2\2\16u\3\2\2\2\20w\3\2\2\2\22\u008a\3\2\2\2\24\u008c\3\2\2\2\26\u0099"+
		"\3\2\2\2\30\u00b4\3\2\2\2\32\33\7\3\2\2\33 \5\4\3\2\34\35\7\4\2\2\35\37"+
		"\5\4\3\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\""+
		" \3\2\2\2#$\7\4\2\2$)\5\24\13\2%&\7\4\2\2&(\5\24\13\2\'%\3\2\2\2(+\3\2"+
		"\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\5\2\2-\3\3\2\2\2./\7"+
		"\r\2\2/\60\7\6\2\2\60\61\7\3\2\2\61\66\5\6\4\2\62\63\7\4\2\2\63\65\5\6"+
		"\4\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\2"+
		"8\66\3\2\2\29:\7\5\2\2:\5\3\2\2\2;<\7\16\2\2<=\7\6\2\2=>\7\3\2\2>C\5\b"+
		"\5\2?@\7\4\2\2@B\5\b\5\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FG\7\5\2\2G\7\3\2\2\2HI\7\17\2\2IJ\7\6\2\2JX\7\35\2\2KL"+
		"\7\20\2\2LM\7\6\2\2MX\5\n\6\2NO\7\20\2\2OP\7\7\2\2PQ\7\37\2\2QR\7\b\2"+
		"\2RS\7\6\2\2ST\7\3\2\2TU\5\22\n\2UV\7\5\2\2VX\3\2\2\2WH\3\2\2\2WK\3\2"+
		"\2\2WN\3\2\2\2X\t\3\2\2\2YZ\7\3\2\2Z_\5\f\7\2[\\\7\4\2\2\\^\5\f\7\2]["+
		"\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\5\2\2c"+
		"\13\3\2\2\2de\7\21\2\2ef\7\6\2\2fg\7\3\2\2gl\5\16\b\2hi\7\4\2\2ik\5\16"+
		"\b\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\5"+
		"\2\2p\r\3\2\2\2qr\7\22\2\2rs\7\6\2\2sv\5\20\t\2tv\5\22\n\2uq\3\2\2\2u"+
		"t\3\2\2\2v\17\3\2\2\2wx\7\37\2\2xy\7\t\2\2yz\7\37\2\2z{\7\t\2\2{|\7\37"+
		"\2\2|}\7\t\2\2}~\7\37\2\2~\21\3\2\2\2\177\u0080\7\23\2\2\u0080\u0081\7"+
		"\6\2\2\u0081\u008b\7\35\2\2\u0082\u0083\7\24\2\2\u0083\u0084\7\6\2\2\u0084"+
		"\u0085\7\n\2\2\u0085\u0086\t\2\2\2\u0086\u008b\7\n\2\2\u0087\u0088\7\25"+
		"\2\2\u0088\u0089\7\6\2\2\u0089\u008b\7\35\2\2\u008a\177\3\2\2\2\u008a"+
		"\u0082\3\2\2\2\u008a\u0087\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d\7\26\2"+
		"\2\u008d\u008e\7\6\2\2\u008e\u008f\7\3\2\2\u008f\u0094\5\26\f\2\u0090"+
		"\u0091\7\4\2\2\u0091\u0093\5\26\f\2\u0092\u0090\3\2\2\2\u0093\u0096\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7\5\2\2\u0098\25\3\2\2\2\u0099\u009a\7\27\2"+
		"\2\u009a\u009b\7\6\2\2\u009b\u009c\7\3\2\2\u009c\u009d\5\30\r\2\u009d"+
		"\u009e\7\4\2\2\u009e\u009f\5\30\r\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7"+
		"\5\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\7\6\2\2\u00a4"+
		"\u00a5\7\7\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\7"+
		"\35\2\2\u00a8\u00b5\7\b\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\7\6\2\2\u00ab"+
		"\u00ac\7\35\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00ae\7\32\2\2\u00ae\u00af\7"+
		"\6\2\2\u00af\u00b5\7\35\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00b2\7\6\2\2\u00b2"+
		"\u00b3\7\37\2\2\u00b3\u00b5\7\34\2\2\u00b4\u00a2\3\2\2\2\u00b4\u00a9\3"+
		"\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\31\3\2\2\2\r )\66CW_lu\u008a\u0094\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}