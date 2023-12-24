// Generated from C:/Users/Islam/Downloads/react2/src/antlr/ReactParser.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void enterStatmentElement(ReactParser.StatmentElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 */
	void exitStatmentElement(ReactParser.StatmentElementContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void enterJsxParameters(ReactParser.JsxParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 */
	void exitJsxParameters(ReactParser.JsxParametersContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsxExpression(ReactParser.JsxExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsxExpression(ReactParser.JsxExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ReactParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ReactParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(ReactParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(ReactParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionsWithId}
	 * labeled alternative in {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditionsWithId(ReactParser.ConditionsWithIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionsWithId}
	 * labeled alternative in {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditionsWithId(ReactParser.ConditionsWithIdContext ctx);
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
	 * Enter a parse tree produced by the {@code vArrowFunction}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterVArrowFunction(ReactParser.VArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vArrowFunction}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitVArrowFunction(ReactParser.VArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vCallIdentifier}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterVCallIdentifier(ReactParser.VCallIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vCallIdentifier}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitVCallIdentifier(ReactParser.VCallIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vArgument}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterVArgument(ReactParser.VArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vArgument}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitVArgument(ReactParser.VArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vCallfunction}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterVCallfunction(ReactParser.VCallfunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vCallfunction}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitVCallfunction(ReactParser.VCallfunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vExpression}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterVExpression(ReactParser.VExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vExpression}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitVExpression(ReactParser.VExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vNullLiteral}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterVNullLiteral(ReactParser.VNullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vNullLiteral}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitVNullLiteral(ReactParser.VNullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vBlockOfarguments}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterVBlockOfarguments(ReactParser.VBlockOfargumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vBlockOfarguments}
	 * labeled alternative in {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitVBlockOfarguments(ReactParser.VBlockOfargumentsContext ctx);
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
	 * Enter a parse tree produced by the {@code normalExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNormalExpression(ReactParser.NormalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNormalExpression(ReactParser.NormalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDataExpression(ReactParser.DataExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDataExpression(ReactParser.DataExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code vArray}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterVArray(ReactParser.VArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vArray}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitVArray(ReactParser.VArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vNumber}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterVNumber(ReactParser.VNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vNumber}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitVNumber(ReactParser.VNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vString}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterVString(ReactParser.VStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vString}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitVString(ReactParser.VStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vId}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterVId(ReactParser.VIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vId}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitVId(ReactParser.VIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vMap}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterVMap(ReactParser.VMapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vMap}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitVMap(ReactParser.VMapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vBool}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void enterVBool(ReactParser.VBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vBool}
	 * labeled alternative in {@link ReactParser#data}.
	 * @param ctx the parse tree
	 */
	void exitVBool(ReactParser.VBoolContext ctx);
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