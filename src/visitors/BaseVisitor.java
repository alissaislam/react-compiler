package visitors;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import antlr.ReactParserVisitor;
import ast.Models.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Type;

public class BaseVisitor implements ReactParserVisitor {


    @Override
    public Start visitStart(ReactParser.StartContext ctx) {
        Start start = new Start();
        start.setNode_type("Start");
        if (ctx.statment()!=null){
            for (int i=0;i<ctx.statment().size();i++){
                start.getStatement_list().add((Statement) visitStatment(ctx.statment(i)));
            }
        }
        return start;
    }

    @Override
    public Statement visitStatment(ReactParser.StatmentContext ctx) {
        Statement statement = new Statement();
        statement.setNode_type("Statement");
        if (ctx.statmentElement()!=null)
            statement.setStatementElement((StatementElement) visit(ctx.statmentElement()));
        return statement;
    }

    @Override
    public VariableDeclarationList visitLabelvarDecList(ReactParser.LabelvarDecListContext ctx) {
        if (ctx.variableDeclarationList()!=null)
            return ((VariableDeclarationList) visitVariableDeclarationList(ctx.variableDeclarationList()));
        else
            return null;
    }

    @Override
    public If visitLabelif(ReactParser.LabelifContext ctx) {
        if (ctx.if_()!=null)
            return ((If) visitIf(ctx.if_()));
        else
            return null;
    }

    @Override
    public For visitLabelforElement(ReactParser.LabelforElementContext ctx) {
        if (ctx.forElement()!=null)
            return ((For) visitForElement(ctx.forElement()));
        else
            return null;
    }

    @Override
    public Function visitLabelFunction(ReactParser.LabelFunctionContext ctx) {
        if (ctx.function()!=null)
            return ((Function) visitFunction(ctx.function()));
        else
            return null;
    }

    @Override
    public Comment visitLabelComments(ReactParser.LabelCommentsContext ctx) {
        if (ctx.comments()!=null)
            return ((Comment) visitComments(ctx.comments()));
        else
            return null;
    }

    @Override
    public While visitLabelWhile(ReactParser.LabelWhileContext ctx) {
        if (ctx.while_()!=null)
            return ((While) visitWhile(ctx.while_()));
        else
            return null;
    }

    @Override
    public DoWhile visitLabelDoWhile(ReactParser.LabelDoWhileContext ctx) {
        if (ctx.do_while()!=null)
            return ((DoWhile) visitDo_while(ctx.do_while()));
        else
            return null;
    }

    @Override
    public CallFunction visitLabelCallFunction(ReactParser.LabelCallFunctionContext ctx) {
        if (ctx.callfunction()!=null)
            return ((CallFunction) visitCallfunction(ctx.callfunction()));
        else
            return null;
    }

    @Override
    public Switch visitLabelSwitch(ReactParser.LabelSwitchContext ctx) {
        if (ctx.switch_()!=null)
            return ((Switch) visitSwitch(ctx.switch_()));
        else
            return null;
    }

    @Override
    public Block visitLabelBlock(ReactParser.LabelBlockContext ctx) {
        if (ctx.block()!=null)
            return ((Block) visitBlock(ctx.block()));
        else
            return null;
    }

    @Override
    public Break visitLabelBreak(ReactParser.LabelBreakContext ctx) {
        if (ctx.break_()!=null)
            return ((Break) visitBreak(ctx.break_()));
        else
            return null;    }

    @Override
    public TryCatch visitLabelTryCatch(ReactParser.LabelTryCatchContext ctx) {
        if (ctx.tryCatch()!=null)
            return ((TryCatch) visitTryCatch(ctx.tryCatch()));
        else
            return null;
    }

    @Override
    public Import visitLabelImport(ReactParser.LabelImportContext ctx) {
        if (ctx.importt()!=null)
            return ((Import) visitImportt(ctx.importt()));
        else
            return null;
    }

    @Override
    public IfShort visitLabelIfShort(ReactParser.LabelIfShortContext ctx) {
        if (ctx.ifShort()!=null)
            return ((IfShort) visitIfShort(ctx.ifShort()));
        else
            return null;
    }

    @Override
    public Sequence visitLabelSequence(ReactParser.LabelSequenceContext ctx) {
        if (ctx.suquence()!=null)
            return ((Sequence) visitSuquence(ctx.suquence()));
        else
            return null;
    }

    @Override
    public Export visitLabelExport(ReactParser.LabelExportContext ctx) {
        if (ctx.export()!=null)
            return ((Export) visitExport(ctx.export()));
        else
            return null;
    }

    @Override
    public JsxElement visitLabelJsxElement(ReactParser.LabelJsxElementContext ctx) {
        if (ctx.jsxElement()!=null)
            return ((JsxElement) visitJsxElement(ctx.jsxElement()));
        else
            return null;
    }

    @Override
    public Expression visitLabelExpression(ReactParser.LabelExpressionContext ctx) {
        if (ctx.expression()!=null)
            return ((Expression) visit(ctx.expression()));
        else
            return null;
    }

    @Override
    public ArrowFunction visitLabelArrowFunction(ReactParser.LabelArrowFunctionContext ctx) {
        if (ctx.arrowFunction()!=null)
            return ((ArrowFunction) visitArrowFunction(ctx.arrowFunction()));
        else
            return null;
    }

    @Override
    public If visitIf(ReactParser.IfContext ctx) {
        If ifElement = new If();
        ifElement.setNode_type("If");
        if (ctx.conditions()!=null){
            ifElement.setCondition((Condition) visitConditions(ctx.conditions()));
        }
        if (ctx.block()!=null){
            ifElement.setBlock((Block) visitBlock(ctx.block()));
        }
        if (ctx.statment()!=null){
            ifElement.setStatement((Statement) visitStatment(ctx.statment()));
        }
        for (int i=0;i<ctx.else_if().size();i++){
            ifElement.getElseIfList().add((Else_if) visitElse_if(ctx.else_if(i)));
        }
        if (ctx.else_()!=null){
            ifElement.setElseElement((Else) visitElse(ctx.else_()));
        }
        return ifElement;
    }

    @Override
    public For visitForElement(ReactParser.ForElementContext ctx) {
        For forElement = new For();
        forElement.setNode_type("For");
        if (ctx.forLoopParts()!=null)
            forElement.setForLoopParts((ForLoopParts) visitForLoopParts(ctx.forLoopParts()));
        if (ctx.block()!=null)
            forElement.setBlock((Block) visitBlock(ctx.block()));
        if (ctx.statment()!=null)
            forElement.setStatement((Statement) visitStatment(ctx.statment()));
        return forElement;
    }

    @Override
    public Function visitFunction(ReactParser.FunctionContext ctx) {
        Function function = new Function();
        function.setNode_type("Function");
        if (ctx.id()!=null){
            function.setId( (Id) visitId(ctx.id()));
        }
        if (ctx.arguments()!=null){
            function.setArguments((Arguments) visitArguments(ctx.arguments()));
        }
        for (int i=0;i<ctx.statment().size();i++)
            function.getStatements().add((Statement) visitStatment(ctx.statment(i)));
        for (int i=0;i<ctx.returnstatment().size();i++)
            function.getReturnstatments().add((Returnstatment) visitReturnstatment(ctx.returnstatment(i)));

        return function;
    }

    @Override
    public Comment visitComments(ReactParser.CommentsContext ctx) {
        Comment comment = new Comment();
        comment.setNode_type("Comments");
        if (ctx.SINGLE_LINE_COMMENT()!=null){
            comment.setSingleLineComment(ctx.SINGLE_LINE_COMMENT().toString());
        }
        if (ctx.MULTI_LINE_COMMENT()!=null){
            comment.setMultiLineComment(ctx.MULTI_LINE_COMMENT().toString());
        }
        return comment;

    }

    @Override
    public While visitWhile(ReactParser.WhileContext ctx) {
        While whileElement = new While();
        whileElement.setNode_type("For");
        if (ctx.conditions()!=null)
            whileElement.setCondition((Condition) visitConditions(ctx.conditions()));
        if (ctx.block()!=null)
            whileElement.setBlock((Block) visitBlock(ctx.block()));
        if (ctx.statment()!=null)
            whileElement.setStatement((Statement) visitStatment(ctx.statment()));
        return whileElement;
    }

    @Override
    public DoWhile visitDo_while(ReactParser.Do_whileContext ctx) {
        DoWhile doWhile = new DoWhile();
        doWhile.setNode_type("For");
        if (ctx.conditions()!=null)
            doWhile.setCondition((Condition) visitConditions(ctx.conditions()));
        if (ctx.block()!=null)
            doWhile.setBlock((Block) visitBlock(ctx.block()));
        if (ctx.statment()!=null)
            doWhile.setStatement((Statement) visitStatment(ctx.statment()));
        return doWhile;
    }

    @Override
    public CallFunction visitCallfunction(ReactParser.CallfunctionContext ctx) {
        CallFunction callFunction = new CallFunction();
        callFunction.setNode_type("Callfunction");
        for (int i=0;i<ctx.simpleCallfunction().size();i++)
            callFunction.getSimpleCallfunctions().add((SimpleCallfunction) visitSimpleCallfunction(ctx.simpleCallfunction(i)));
        for (int i=0;i<ctx.callIdentifier().size();i++)
            callFunction.getCallIdentifiers().add((CallIdentifier) visitCallIdentifier(ctx.callIdentifier(i)));

        return callFunction;
    }

    @Override
    public Switch visitSwitch(ReactParser.SwitchContext ctx) {
        Switch switchElement = new Switch();
        switchElement.setNode_type("Switch");
        for (int i=0;i<ctx.expression().size();i++)
            switchElement.getExpressions().add((Expression) visit(ctx.expression(i)));
        for (int i=0;i<ctx.block().size();i++)
            switchElement.getBlocks().add((Block) visitBlock(ctx.block(i)));
        for (int i=0;i<ctx.statment().size();i++)
            switchElement.getStatements().add((Statement) visitStatment(ctx.statment(i)));
        return switchElement;
    }

    @Override
    public TryCatch visitTryCatch(ReactParser.TryCatchContext ctx) {
        TryCatch tryCatch = new TryCatch();
        tryCatch.setNode_type("Trycatch");
        for (int i=0;i<ctx.block().size();i++)
            tryCatch.getBlocks().add((Block) visitBlock(ctx.block(i)));
        for (int i=0;i<ctx.id().size();i++)
            tryCatch.getIds().add((Id) visitId(ctx.id(i)));
        return tryCatch;
    }

    @Override
    public Import visitImportt(ReactParser.ImporttContext ctx) {
        Import importElement = new Import();
        importElement.setNode_type("Import");
        for (int i=0 ; i<ctx.id().size();i++){
            importElement.getIds().add( (Id) visitId(ctx.id(i)));
        }
        if (ctx.String()!=null)
            importElement.setString(ctx.String().toString());
        return importElement;
    }

    @Override
    public IfShort visitIfShort(ReactParser.IfShortContext ctx) {
        IfShort ifShort = new IfShort();
        ifShort.setNode_type("Ifshort");
        if (ctx.callIdentifier()!=null)
            ifShort.setCallIdentifier((CallIdentifier) visitCallIdentifier(ctx.callIdentifier()));
        if (ctx.operation()!=null)
            ifShort.setOperation((Operation) visitOperation(ctx.operation()));
        if (ctx.expression()!=null)
            ifShort.setExpression((Expression) visit(ctx.expression()));
        for (int i =0;i<ctx.statment().size();i++)
            ifShort.getStatements().add((Statement) visitStatment(ctx.statment(i)));
        for (int i =0;i<ctx.jsxElement().size();i++)
            ifShort.getJsxElements().add((JsxElement) visitJsxElement(ctx.jsxElement(i)));
        return ifShort;
    }

    @Override
    public Object visitJsxElement(ReactParser.JsxElementContext ctx) {
        JsxElement jsxElement = new JsxElement();
        jsxElement.setNode_type("Jsxelement");
        if (ctx.jsxElementNonSelfClosing()!=null)
            jsxElement.setJsxElementNonSelfClosing((JsxElementNonSelfClosing) visitJsxElementNonSelfClosing(ctx.jsxElementNonSelfClosing()));
        if (ctx.jsxElementSelfClosing()!=null)
            jsxElement.setJsxElementSelfClosing((JsxElementSelfClosing) visitJsxElementSelfClosing(ctx.jsxElementSelfClosing()));
        return jsxElement;
    }

    @Override
    public Object visitJsxElementNonSelfClosing(ReactParser.JsxElementNonSelfClosingContext ctx) {
        JsxElementNonSelfClosing jsxElementNonSelfClosing = new JsxElementNonSelfClosing();
        jsxElementNonSelfClosing.setNode_type("Jsxelementnonselfclosing");
        for (int i=0;i<ctx.id().size();i++)
            jsxElementNonSelfClosing.getIds().add((Id) visitId(ctx.id(i)));
        for (int i=0;i<ctx.StringIn().size();i++)
            jsxElementNonSelfClosing.getStrings().add(ctx.StringIn(i).toString());
        for (int i=0;i<ctx.ifShort().size();i++)
            jsxElementNonSelfClosing.getIfShorts().add((IfShort) visitIfShort(ctx.ifShort(i)));
        for (int i=0;i<ctx.LETTERR().size();i++)
            jsxElementNonSelfClosing.getLetterrs().add(ctx.LETTERR(i).toString());
        for (int i=0;i<ctx.jsxElementIn().size();i++)
            jsxElementNonSelfClosing.getJsxElementIns().add((JsxElementIn) visitJsxElementIn(ctx.jsxElementIn(i)));
        for (int i=0;i<ctx.blockOfarguments().size();i++)
            jsxElementNonSelfClosing.getBlockOfarguments().add((BlockOfarguments) visitBlockOfarguments(ctx.blockOfarguments(i)));
        return jsxElementNonSelfClosing;
    }

    @Override
    public Object visitJsxElementSelfClosing(ReactParser.JsxElementSelfClosingContext ctx) {
        JsxElementSelfClosing jsxElementSelfClosing = new JsxElementSelfClosing();
        jsxElementSelfClosing.setNode_type("Jsxelementselfclosing");
        if (ctx.jsx_tag()!=null)
            jsxElementSelfClosing.setJsxTag(ctx.jsx_tag().toString());
        for (int i=0;i<ctx.id().size();i++)
            jsxElementSelfClosing.getIds().add((Id) visitId(ctx.id(i)));
        for (int i=0;i<ctx.blockIn().size();i++)
            jsxElementSelfClosing.getBlocks().add((BlockIn) visitBlockIn(ctx.blockIn(i)));
        for (int i=0;i<ctx.StringIn().size();i++)
            jsxElementSelfClosing.getStringsIns().add(ctx.StringIn(i).toString());
        return jsxElementSelfClosing;

    }

    @Override
    public Object visitJsxElementIn(ReactParser.JsxElementInContext ctx) {
        JsxElementIn jsxElementIn = new JsxElementIn();
        jsxElementIn.setNode_type("Jsxelementin");
        for (int i=0;i<ctx.id().size();i++)
            jsxElementIn.getIds().add((Id) visitId(ctx.id(i)));
        for (int i=0;i<ctx.blockIn().size();i++)
            jsxElementIn.getBlocks().add((BlockIn) visitBlockIn(ctx.blockIn(i)));
        for (int i=0;i<ctx.StringIn().size();i++)
            jsxElementIn.getStringsIns().add(ctx.StringIn(i).toString());
        for (int i=0;i<ctx.Id().size();i++)
            jsxElementIn.getIds().add((Id) ctx.Id(i));
        for (int i=0;i<ctx.jsxElementIn().size();i++)
            jsxElementIn.getJsxElementIns().add((JsxElementIn) visitJsxElementIn(ctx.jsxElementIn(i)));
        for (int i=0;i<ctx.LETTERR().size();i++)
            jsxElementIn.getLetterrs().add(ctx.LETTERR(i).toString());
        for (int i=0;i<ctx.blockOfarguments().size();i++)
            jsxElementIn.getBlockOfarguments().add((BlockOfarguments) visitBlockOfarguments(ctx.blockOfarguments(i)));
        return jsxElementIn;

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
    public Object visitJsxArrFunction(ReactParser.JsxArrFunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxCallFunction(ReactParser.JsxCallFunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxArg(ReactParser.JsxArgContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxCallId(ReactParser.JsxCallIdContext ctx) {
        return null;
    }

    @Override
    public Object visitJsxExp(ReactParser.JsxExpContext ctx) {
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
