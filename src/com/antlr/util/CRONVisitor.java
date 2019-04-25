// Generated from /home/hsiao/Code/NML/cron/CRON.g4 by ANTLR 4.7.2
package com.antlr.util;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CRONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CRONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CRONParser#cron}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCron(CRONParser.CronContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRONParser#topologygroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopologygroup(CRONParser.TopologygroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRONParser#topology}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopology(CRONParser.TopologyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code topologyname}
	 * labeled alternative in {@link CRONParser#topologycontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopologyname(CRONParser.TopologynameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code topologynode}
	 * labeled alternative in {@link CRONParser#topologycontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopologynode(CRONParser.TopologynodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code topologynodearray}
	 * labeled alternative in {@link CRONParser#topologycontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopologynodearray(CRONParser.TopologynodearrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRONParser#nodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodes(CRONParser.NodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRONParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(CRONParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ipv4ad}
	 * labeled alternative in {@link CRONParser#nodecontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4ad(CRONParser.Ipv4adContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodeproperty}
	 * labeled alternative in {@link CRONParser#nodecontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeproperty(CRONParser.NodepropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRONParser#ipv4addr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4addr(CRONParser.Ipv4addrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRONParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(CRONParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRONParser#linkgroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkgroup(CRONParser.LinkgroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRONParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(CRONParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bidirectional}
	 * labeled alternative in {@link CRONParser#linkcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBidirectional(CRONParser.BidirectionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sourcesink}
	 * labeled alternative in {@link CRONParser#linkcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourcesink(CRONParser.SourcesinkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rate}
	 * labeled alternative in {@link CRONParser#linkcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRate(CRONParser.RateContext ctx);
}