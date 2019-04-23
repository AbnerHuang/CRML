// Generated from /home/hsiao/Code/NML/cron/CRON.g4 by ANTLR 4.7.2
package com.antlr.util;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CRONParser}.
 */
public interface CRONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CRONParser#cron}.
	 * @param ctx the parse tree
	 */
	void enterCron(CRONParser.CronContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRONParser#cron}.
	 * @param ctx the parse tree
	 */
	void exitCron(CRONParser.CronContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRONParser#topologygroup}.
	 * @param ctx the parse tree
	 */
	void enterTopologygroup(CRONParser.TopologygroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRONParser#topologygroup}.
	 * @param ctx the parse tree
	 */
	void exitTopologygroup(CRONParser.TopologygroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRONParser#topology}.
	 * @param ctx the parse tree
	 */
	void enterTopology(CRONParser.TopologyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRONParser#topology}.
	 * @param ctx the parse tree
	 */
	void exitTopology(CRONParser.TopologyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code topologyname}
	 * labeled alternative in {@link CRONParser#topologycontent}.
	 * @param ctx the parse tree
	 */
	void enterTopologyname(CRONParser.TopologynameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code topologyname}
	 * labeled alternative in {@link CRONParser#topologycontent}.
	 * @param ctx the parse tree
	 */
	void exitTopologyname(CRONParser.TopologynameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code topologynode}
	 * labeled alternative in {@link CRONParser#topologycontent}.
	 * @param ctx the parse tree
	 */
	void enterTopologynode(CRONParser.TopologynodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code topologynode}
	 * labeled alternative in {@link CRONParser#topologycontent}.
	 * @param ctx the parse tree
	 */
	void exitTopologynode(CRONParser.TopologynodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code topologynodearray}
	 * labeled alternative in {@link CRONParser#topologycontent}.
	 * @param ctx the parse tree
	 */
	void enterTopologynodearray(CRONParser.TopologynodearrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code topologynodearray}
	 * labeled alternative in {@link CRONParser#topologycontent}.
	 * @param ctx the parse tree
	 */
	void exitTopologynodearray(CRONParser.TopologynodearrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRONParser#nodes}.
	 * @param ctx the parse tree
	 */
	void enterNodes(CRONParser.NodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRONParser#nodes}.
	 * @param ctx the parse tree
	 */
	void exitNodes(CRONParser.NodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRONParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(CRONParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRONParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(CRONParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ipv4ad}
	 * labeled alternative in {@link CRONParser#nodecontent}.
	 * @param ctx the parse tree
	 */
	void enterIpv4ad(CRONParser.Ipv4adContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ipv4ad}
	 * labeled alternative in {@link CRONParser#nodecontent}.
	 * @param ctx the parse tree
	 */
	void exitIpv4ad(CRONParser.Ipv4adContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodeproperty}
	 * labeled alternative in {@link CRONParser#nodecontent}.
	 * @param ctx the parse tree
	 */
	void enterNodeproperty(CRONParser.NodepropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nodeproperty}
	 * labeled alternative in {@link CRONParser#nodecontent}.
	 * @param ctx the parse tree
	 */
	void exitNodeproperty(CRONParser.NodepropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRONParser#ipv4addr}.
	 * @param ctx the parse tree
	 */
	void enterIpv4addr(CRONParser.Ipv4addrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRONParser#ipv4addr}.
	 * @param ctx the parse tree
	 */
	void exitIpv4addr(CRONParser.Ipv4addrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRONParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CRONParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRONParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CRONParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRONParser#linkgroup}.
	 * @param ctx the parse tree
	 */
	void enterLinkgroup(CRONParser.LinkgroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRONParser#linkgroup}.
	 * @param ctx the parse tree
	 */
	void exitLinkgroup(CRONParser.LinkgroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CRONParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(CRONParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CRONParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(CRONParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bidirectional}
	 * labeled alternative in {@link CRONParser#linkcontent}.
	 * @param ctx the parse tree
	 */
	void enterBidirectional(CRONParser.BidirectionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bidirectional}
	 * labeled alternative in {@link CRONParser#linkcontent}.
	 * @param ctx the parse tree
	 */
	void exitBidirectional(CRONParser.BidirectionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sourcesink}
	 * labeled alternative in {@link CRONParser#linkcontent}.
	 * @param ctx the parse tree
	 */
	void enterSourcesink(CRONParser.SourcesinkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sourcesink}
	 * labeled alternative in {@link CRONParser#linkcontent}.
	 * @param ctx the parse tree
	 */
	void exitSourcesink(CRONParser.SourcesinkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rate}
	 * labeled alternative in {@link CRONParser#linkcontent}.
	 * @param ctx the parse tree
	 */
	void enterRate(CRONParser.RateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rate}
	 * labeled alternative in {@link CRONParser#linkcontent}.
	 * @param ctx the parse tree
	 */
	void exitRate(CRONParser.RateContext ctx);
}