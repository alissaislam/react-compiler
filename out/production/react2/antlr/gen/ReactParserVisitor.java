// Generated from D:/ReactCompiler/react-compiler/out/production/react2/antlr/ReactParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(ReactParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#forElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForElement(ReactParser.ForElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#forLoopParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopParts(ReactParser.ForLoopPartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(ReactParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ReactParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#suquence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuquence(ReactParser.SuquenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(ReactParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ReactParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(ReactParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(ReactParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnstatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatment(ReactParser.ReturnstatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#comments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComments(ReactParser.CommentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ReactParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(ReactParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#callfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunction(ReactParser.CallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#simpleCallfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCallfunction(ReactParser.SimpleCallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ReactParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ReactParser.OperationContext ctx);
}