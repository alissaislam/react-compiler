package visitors;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import antlr.ReactParserVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BaseVisitor implements ReactParserVisitor {


    @Override
    public Object visitStart(ReactParser.StartContext ctx) {
        return null;
    }

    @Override
    public Object visitStatment(ReactParser.StatmentContext ctx) {
        return null;
    }

    @Override
    public Object visitStatmentElement(ReactParser.StatmentElementContext ctx) {
        return null;
    }

    @Override
    public Object visitIf(ReactParser.IfContext ctx) {
        return null;
    }

    @Override
    public Object visitForElement(ReactParser.ForElementContext ctx) {
        return null;
    }

    @Override
    public Object visitFunction(ReactParser.FunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitComments(ReactParser.CommentsContext ctx) {
        return null;
    }

    @Override
    public Object visitWhile(ReactParser.WhileContext ctx) {
        return null;
    }

    @Override
    public Object visitDo_while(ReactParser.Do_whileContext ctx) {
        return null;
    }

    @Override
    public Object visitCallfunction(ReactParser.CallfunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitSwitch(ReactParser.SwitchContext ctx) {
        return null;
    }

    @Override
    public Object visitTryCatch(ReactParser.TryCatchContext ctx) {
        return null;
    }

    @Override
    public Object visitImportt(ReactParser.ImporttContext ctx) {
        return null;
    }

    @Override
    public Object visitIfShort(ReactParser.IfShortContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxElement(ReactParser.JsxElementContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxElementNonSelfClosing(ReactParser.JsxElementNonSelfClosingContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxElementSelfClosing(ReactParser.JsxElementSelfClosingContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxElementIn(ReactParser.JsxElementInContext ctx) {
        return null;
    }

    @Override
    public Object visitBlockIn(ReactParser.BlockInContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxArguments(ReactParser.JsxArgumentsContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxParameters(ReactParser.JsxParametersContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxArrowFunction(ReactParser.JsxArrowFunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxCallfunction(ReactParser.JsxCallfunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxSimpleCallfunction(ReactParser.JsxSimpleCallfunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxArgument(ReactParser.JsxArgumentContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxNormalExpression(ReactParser.JsxNormalExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxId(ReactParser.JsxIdContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxString(ReactParser.JsxStringContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxBool(ReactParser.JsxBoolContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxNumber(ReactParser.JsxNumberContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxCallIdentifier(ReactParser.JsxCallIdentifierContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxBlock(ReactParser.JsxBlockContext ctx) {
        return null;
    }

    @Override
    public Object visitBlock(ReactParser.BlockContext ctx) {
        return null;
    }

    @Override
    public Object visitElse_if(ReactParser.Else_ifContext ctx) {
        return null;
    }

    @Override
    public Object visitElse(ReactParser.ElseContext ctx) {
        return null;
    }

    @Override
    public Object visitForLoopParts(ReactParser.ForLoopPartsContext ctx) {
        return null;
    }

    @Override
    public Object visitConditions(ReactParser.ConditionsContext ctx) {
        return null;
    }

    @Override
    public Object visitArguments(ReactParser.ArgumentsContext ctx) {
        return null;
    }

    @Override
    public Object visitBlockOfarguments(ReactParser.BlockOfargumentsContext ctx) {
        return null;
    }

    @Override
    public Object visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx) {
        return null;
    }

    @Override
    public Object visitArrowFunction(ReactParser.ArrowFunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitReturnstatment(ReactParser.ReturnstatmentContext ctx) {
        return null;
    }

    @Override
    public Object visitSimpleCallfunction(ReactParser.SimpleCallfunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitArgument(ReactParser.ArgumentContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_ArrowFunction(ReactParser.Label_ArrowFunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_CallIdentifier(ReactParser.Label_CallIdentifierContext ctx) {
        return null;
    }

    @Override
    public Object visitLable_Argument(ReactParser.Lable_ArgumentContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_Callfunction(ReactParser.Label_CallfunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_Expression(ReactParser.Label_ExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_NullLiteral(ReactParser.Label_NullLiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_BlockOfarguments(ReactParser.Label_BlockOfargumentsContext ctx) {
        return null;
    }

    @Override
    public Object visitCallIdentifier(ReactParser.CallIdentifierContext ctx) {
        return null;
    }

    @Override
    public Object visitShortExpression(ReactParser.ShortExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_dataExpression(ReactParser.Label_dataExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_normalExpression(ReactParser.Label_normalExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitExport(ReactParser.ExportContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_Array(ReactParser.Label_ArrayContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_Number(ReactParser.Label_NumberContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_String(ReactParser.Label_StringContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_Id(ReactParser.Label_IdContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_Map(ReactParser.Label_MapContext ctx) {
        return null;
    }

    @Override
    public Object visitLabel_Bool(ReactParser.Label_BoolContext ctx) {
        return null;
    }

    @Override
    public Object visitArray(ReactParser.ArrayContext ctx) {
        return null;
    }

    @Override
    public Object visitMap(ReactParser.MapContext ctx) {
        return null;
    }

    @Override
    public Object visitMapElementList(ReactParser.MapElementListContext ctx) {
        return null;
    }

    @Override
    public Object visitMapElement(ReactParser.MapElementContext ctx) {
        return null;
    }

    @Override
    public Object visitSuquence(ReactParser.SuquenceContext ctx) {
        return null;
    }

    @Override
    public Object visitKind(ReactParser.KindContext ctx) {
        return null;
    }

    @Override
    public Object visitOperation(ReactParser.OperationContext ctx) {
        return null;
    }

    @Override
    public Object visitId(ReactParser.IdContext ctx) {
        return null;
    }

    @Override
    public Object visitOpenParen(ReactParser.OpenParenContext ctx) {
        return null;
    }

    @Override
    public Object visitCloseParen(ReactParser.CloseParenContext ctx) {
        return null;
    }

    @Override
    public Object visitAssign(ReactParser.AssignContext ctx) {
        return null;
    }

    @Override
    public Object visitCloseBrace(ReactParser.CloseBraceContext ctx) {
        return null;
    }

    @Override
    public Object visitOpenBrace(ReactParser.OpenBraceContext ctx) {
        return null;
    }

    @Override
    public Object visitJsx_tag(ReactParser.Jsx_tagContext ctx) {
        return null;
    }

    @Override
    public Object visitBreak(ReactParser.BreakContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
