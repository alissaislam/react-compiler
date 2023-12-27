// Generated from D:/react-compiler/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ReactParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ReactParser.StartContext ctx);
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
	 * Enter a parse tree produced by the {@code labelvarDecList}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelvarDecList(ReactParser.LabelvarDecListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelvarDecList}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelvarDecList(ReactParser.LabelvarDecListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelif}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelif(ReactParser.LabelifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelif}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelif(ReactParser.LabelifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelforElement}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelforElement(ReactParser.LabelforElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelforElement}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelforElement(ReactParser.LabelforElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelFunction}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelFunction(ReactParser.LabelFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelFunction}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelFunction(ReactParser.LabelFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelComments}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelComments(ReactParser.LabelCommentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelComments}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelComments(ReactParser.LabelCommentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelWhile}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelWhile(ReactParser.LabelWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelWhile}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelWhile(ReactParser.LabelWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelDoWhile}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelDoWhile(ReactParser.LabelDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelDoWhile}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelDoWhile(ReactParser.LabelDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelCallFunction}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelCallFunction(ReactParser.LabelCallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelCallFunction}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelCallFunction(ReactParser.LabelCallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelSwitch}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelSwitch(ReactParser.LabelSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelSwitch}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelSwitch(ReactParser.LabelSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelBlock}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelBlock(ReactParser.LabelBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelBlock}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelBlock(ReactParser.LabelBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelBreak}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelBreak(ReactParser.LabelBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelBreak}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelBreak(ReactParser.LabelBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelTryCatch}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelTryCatch(ReactParser.LabelTryCatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelTryCatch}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelTryCatch(ReactParser.LabelTryCatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelImport}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelImport(ReactParser.LabelImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelImport}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelImport(ReactParser.LabelImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelIfShort}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelIfShort(ReactParser.LabelIfShortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelIfShort}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelIfShort(ReactParser.LabelIfShortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelSequence}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelSequence(ReactParser.LabelSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelSequence}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelSequence(ReactParser.LabelSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelExport}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelExport(ReactParser.LabelExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelExport}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelExport(ReactParser.LabelExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelJsxElement}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelJsxElement(ReactParser.LabelJsxElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelJsxElement}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelJsxElement(ReactParser.LabelJsxElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelExpression}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelExpression(ReactParser.LabelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelExpression}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelExpression(ReactParser.LabelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelArrowFunction}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelArrowFunction(ReactParser.LabelArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelArrowFunction}
	 * labeled alternative in {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelArrowFunction(ReactParser.LabelArrowFunctionContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#switch}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(ReactParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#switch}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(ReactParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(ReactParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(ReactParser.TryCatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importt}.
	 * @param ctx the parse tree
	 */
	void enterImportt(ReactParser.ImporttContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importt}.
	 * @param ctx the parse tree
	 */
	void exitImportt(ReactParser.ImporttContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ifShort}.
	 * @param ctx the parse tree
	 */
	void enterIfShort(ReactParser.IfShortContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ifShort}.
	 * @param ctx the parse tree
	 */
	void exitIfShort(ReactParser.IfShortContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElementNonSelfClosing}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementNonSelfClosing(ReactParser.JsxElementNonSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElementNonSelfClosing}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementNonSelfClosing(ReactParser.JsxElementNonSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElementSelfClosing}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementSelfClosing(ReactParser.JsxElementSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElementSelfClosing}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementSelfClosing(ReactParser.JsxElementSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElementIn}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementIn(ReactParser.JsxElementInContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElementIn}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementIn(ReactParser.JsxElementInContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#blockIn}.
	 * @param ctx the parse tree
	 */
	void enterBlockIn(ReactParser.BlockInContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#blockIn}.
	 * @param ctx the parse tree
	 */
	void exitBlockIn(ReactParser.BlockInContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxArguments}.
	 * @param ctx the parse tree
	 */
	void enterJsxArguments(ReactParser.JsxArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxArguments}.
	 * @param ctx the parse tree
	 */
	void exitJsxArguments(ReactParser.JsxArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxArrFunction}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void enterJsxArrFunction(ReactParser.JsxArrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxArrFunction}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void exitJsxArrFunction(ReactParser.JsxArrFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxCallFunction}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void enterJsxCallFunction(ReactParser.JsxCallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxCallFunction}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void exitJsxCallFunction(ReactParser.JsxCallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxArg}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void enterJsxArg(ReactParser.JsxArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxArg}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void exitJsxArg(ReactParser.JsxArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxCallId}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void enterJsxCallId(ReactParser.JsxCallIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxCallId}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void exitJsxCallId(ReactParser.JsxCallIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxExp}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void enterJsxExp(ReactParser.JsxExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxExp}
	 * labeled alternative in {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void exitJsxExp(ReactParser.JsxExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxArrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsxArrowFunction(ReactParser.JsxArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxArrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsxArrowFunction(ReactParser.JsxArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxCallfunction}.
	 * @param ctx the parse tree
	 */
	void enterJsxCallfunction(ReactParser.JsxCallfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxCallfunction}.
	 * @param ctx the parse tree
	 */
	void exitJsxCallfunction(ReactParser.JsxCallfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxSimpleCallfunction}.
	 * @param ctx the parse tree
	 */
	void enterJsxSimpleCallfunction(ReactParser.JsxSimpleCallfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxSimpleCallfunction}.
	 * @param ctx the parse tree
	 */
	void exitJsxSimpleCallfunction(ReactParser.JsxSimpleCallfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxArgument}.
	 * @param ctx the parse tree
	 */
	void enterJsxArgument(ReactParser.JsxArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxArgument}.
	 * @param ctx the parse tree
	 */
	void exitJsxArgument(ReactParser.JsxArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxNormalExpression}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsxNormalExpression(ReactParser.JsxNormalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxNormalExpression}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsxNormalExpression(ReactParser.JsxNormalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxId}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsxId(ReactParser.JsxIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxId}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsxId(ReactParser.JsxIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxString}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsxString(ReactParser.JsxStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxString}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsxString(ReactParser.JsxStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxBool}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsxBool(ReactParser.JsxBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxBool}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsxBool(ReactParser.JsxBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxNumber}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsxNumber(ReactParser.JsxNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxNumber}
	 * labeled alternative in {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsxNumber(ReactParser.JsxNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxCallIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterJsxCallIdentifier(ReactParser.JsxCallIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxCallIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitJsxCallIdentifier(ReactParser.JsxCallIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxBlock}.
	 * @param ctx the parse tree
	 */
	void enterJsxBlock(ReactParser.JsxBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxBlock}.
	 * @param ctx the parse tree
	 */
	void exitJsxBlock(ReactParser.JsxBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ReactParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ReactParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#blockOfarguments}.
	 * @param ctx the parse tree
	 */
	void enterBlockOfarguments(ReactParser.BlockOfargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#blockOfarguments}.
	 * @param ctx the parse tree
	 */
	void exitBlockOfarguments(ReactParser.BlockOfargumentsContext ctx);
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
	 * Enter a parse tree produced by the {@code label_ArrowFunction}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterLabel_ArrowFunction(ReactParser.Label_ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_ArrowFunction}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitLabel_ArrowFunction(ReactParser.Label_ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_CallIdentifier}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterLabel_CallIdentifier(ReactParser.Label_CallIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_CallIdentifier}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitLabel_CallIdentifier(ReactParser.Label_CallIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lable_Argument}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterLable_Argument(ReactParser.Lable_ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lable_Argument}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitLable_Argument(ReactParser.Lable_ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_Callfunction}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterLabel_Callfunction(ReactParser.Label_CallfunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_Callfunction}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitLabel_Callfunction(ReactParser.Label_CallfunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_Expression}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterLabel_Expression(ReactParser.Label_ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_Expression}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitLabel_Expression(ReactParser.Label_ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_NullLiteral}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterLabel_NullLiteral(ReactParser.Label_NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_NullLiteral}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitLabel_NullLiteral(ReactParser.Label_NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_BlockOfarguments}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterLabel_BlockOfarguments(ReactParser.Label_BlockOfargumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_BlockOfarguments}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitLabel_BlockOfarguments(ReactParser.Label_BlockOfargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#callIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCallIdentifier(ReactParser.CallIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#callIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCallIdentifier(ReactParser.CallIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shortExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShortExpression(ReactParser.ShortExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shortExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShortExpression(ReactParser.ShortExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_dataExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabel_dataExpression(ReactParser.Label_dataExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_dataExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabel_dataExpression(ReactParser.Label_dataExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_normalExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabel_normalExpression(ReactParser.Label_normalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_normalExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabel_normalExpression(ReactParser.Label_normalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(ReactParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(ReactParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_Array}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterLabel_Array(ReactParser.Label_ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_Array}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitLabel_Array(ReactParser.Label_ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_Number}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterLabel_Number(ReactParser.Label_NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_Number}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitLabel_Number(ReactParser.Label_NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_String}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterLabel_String(ReactParser.Label_StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_String}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitLabel_String(ReactParser.Label_StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_Id}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterLabel_Id(ReactParser.Label_IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_Id}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitLabel_Id(ReactParser.Label_IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_Map}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterLabel_Map(ReactParser.Label_MapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_Map}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitLabel_Map(ReactParser.Label_MapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label_Bool}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterLabel_Bool(ReactParser.Label_BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label_Bool}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitLabel_Bool(ReactParser.Label_BoolContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ReactParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ReactParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#mapElementList}.
	 * @param ctx the parse tree
	 */
	void enterMapElementList(ReactParser.MapElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#mapElementList}.
	 * @param ctx the parse tree
	 */
	void exitMapElementList(ReactParser.MapElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void enterMapElement(ReactParser.MapElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void exitMapElement(ReactParser.MapElementContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#kind}.
	 * @param ctx the parse tree
	 */
	void enterKind(ReactParser.KindContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#kind}.
	 * @param ctx the parse tree
	 */
	void exitKind(ReactParser.KindContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ReactParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ReactParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ReactParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#openParen}.
	 * @param ctx the parse tree
	 */
	void enterOpenParen(ReactParser.OpenParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#openParen}.
	 * @param ctx the parse tree
	 */
	void exitOpenParen(ReactParser.OpenParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#closeParen}.
	 * @param ctx the parse tree
	 */
	void enterCloseParen(ReactParser.CloseParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#closeParen}.
	 * @param ctx the parse tree
	 */
	void exitCloseParen(ReactParser.CloseParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ReactParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ReactParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#closeBrace}.
	 * @param ctx the parse tree
	 */
	void enterCloseBrace(ReactParser.CloseBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#closeBrace}.
	 * @param ctx the parse tree
	 */
	void exitCloseBrace(ReactParser.CloseBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 */
	void enterOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 */
	void exitOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsx_tag}.
	 * @param ctx the parse tree
	 */
	void enterJsx_tag(ReactParser.Jsx_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsx_tag}.
	 * @param ctx the parse tree
	 */
	void exitJsx_tag(ReactParser.Jsx_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(ReactParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(ReactParser.BreakContext ctx);
}