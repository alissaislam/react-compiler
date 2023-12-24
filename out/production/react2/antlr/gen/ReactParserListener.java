// Generated from D:/ReactCompiler/react-compiler/out/production/react2/antlr/ReactParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(ReactParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(ReactParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#forElement}.
	 * @param ctx the parse tree
	 */
	void enterForElement(ReactParser.ForElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#forElement}.
	 * @param ctx the parse tree
	 */
	void exitForElement(ReactParser.ForElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#forLoopParts}.
	 * @param ctx the parse tree
	 */
	void enterForLoopParts(ReactParser.ForLoopPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#forLoopParts}.
	 * @param ctx the parse tree
	 */
	void exitForLoopParts(ReactParser.ForLoopPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(ReactParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(ReactParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ReactParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ReactParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#suquence}.
	 * @param ctx the parse tree
	 */
	void enterSuquence(ReactParser.SuquenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#suquence}.
	 * @param ctx the parse tree
	 */
	void exitSuquence(ReactParser.SuquenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(ReactParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(ReactParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(ReactParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(ReactParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(ReactParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(ReactParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(ReactParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(ReactParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ReactParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#returnstatment}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatment(ReactParser.ReturnstatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#returnstatment}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatment(ReactParser.ReturnstatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(ReactParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(ReactParser.CommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ReactParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ReactParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(ReactParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(ReactParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#callfunction}.
	 * @param ctx the parse tree
	 */
	void enterCallfunction(ReactParser.CallfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#callfunction}.
	 * @param ctx the parse tree
	 */
	void exitCallfunction(ReactParser.CallfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#simpleCallfunction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCallfunction(ReactParser.SimpleCallfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#simpleCallfunction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCallfunction(ReactParser.SimpleCallfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ReactParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ReactParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ReactParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ReactParser.OperationContext ctx);
}