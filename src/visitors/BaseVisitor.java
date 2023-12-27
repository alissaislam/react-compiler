package visitors;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import antlr.ReactParserVisitor;
import ast.Models.*;
import ast.Models.Number;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;

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
    public JsxArrowFunction visitJsxArrowFunction(ReactParser.JsxArrowFunctionContext ctx) {
        JsxArrowFunction jsxArrowFunction =new JsxArrowFunction ();
        jsxArrowFunction.setNode_type ("JsxArrowFunction");

        if(ctx.jsxArguments () != null){
            jsxArrowFunction.setJsxArguments ((JsxArguments) visitJsxArguments (ctx.jsxArguments ()));
        }

        if (ctx.jsxArgument () != null){
            jsxArrowFunction.setJsxArgument ((JsxArgument) visitJsxArgument (ctx.jsxArgument ()));
        }

        for ( int i =0 ;i<ctx.jsxExpression ().size ();i++){
            jsxArrowFunction.getJsxExpressionList ().add ((JsxExpression) visit (ctx.jsxExpression ().get (i)));
        }

        return jsxArrowFunction;
    }

    @Override
    public JsxCallfunction visitJsxCallfunction(ReactParser.JsxCallfunctionContext ctx) {
        JsxCallfunction jsxCallfunction =new JsxCallfunction ();
        jsxCallfunction.setNode_type ("JsxCallfunction");
        //jsxCallfunction.setNode_name (ctx.jsxSimpleCallfunction (ctx.jsxSimpleCallfunction ().size ()-1).IDENTIFIERIn ().toString ());

        for ( int i =0 ;i<ctx.jsxSimpleCallfunction ().size ();i++){
            jsxCallfunction.getJsxSimpleCallfunctionList ().add ((JsxSimpleCallfunction) visitJsxSimpleCallfunction (ctx.jsxSimpleCallfunction ().get (i)));
        }
        for ( int i =0 ;i<ctx.id ().size ();i++){
            jsxCallfunction.getIdList ().add ((Id) visitId (ctx.id ().get (i)));
        }

        return jsxCallfunction;
    }


    @Override
    public JsxSimpleCallfunction visitJsxSimpleCallfunction(ReactParser.JsxSimpleCallfunctionContext ctx) {

        JsxSimpleCallfunction jsxSimpleCallfunction = new JsxSimpleCallfunction ();
        jsxSimpleCallfunction.setNode_type ("JsxSimpleCallfunction");
        jsxSimpleCallfunction.setNode_name (ctx.id ().toString ());
        if (ctx.id () !=null){
            jsxSimpleCallfunction.setId ((Id) visitId (ctx.id ()));
        }
        if (ctx.jsxArguments () !=null){
          jsxSimpleCallfunction.setJsxArguments ((JsxArguments) visitJsxArguments (ctx.jsxArguments ()));
        }

        return jsxSimpleCallfunction;
    }

    @Override
    public JsxArgument visitJsxArgument(ReactParser.JsxArgumentContext ctx) {
        JsxArgument jsxArgument =new JsxArgument ();
        jsxArgument.setNode_name (ctx.id ().toString ());
        jsxArgument.setNode_type ("JsxArgument");

        if (ctx.id () !=null){
            jsxArgument.setId ((Id) visitId (ctx.id ()));
        }

        if (ctx.jsxExpression () !=null){
            jsxArgument.setJsxExpression ((JsxExpression) visit (ctx.jsxExpression ()));
        }

        if (ctx.jsxArrowFunction () !=null){
            jsxArgument.setJsxArrowFunction ((JsxArrowFunction) visitJsxArrowFunction (ctx.jsxArrowFunction ()));
        }

        return jsxArgument;
    }

    @Override
    public JsxNormalExpression visitJsxNormalExpression(ReactParser.JsxNormalExpressionContext ctx) {
        JsxNormalExpression jsxNormalExpression =new JsxNormalExpression ();
        jsxNormalExpression.setNode_type ("JsxNormalExpression");
        if (ctx.MultiplyIn () !=null){
            jsxNormalExpression.setOperation (ctx.MultiplyIn ().toString ());
        }
        else if (ctx.DivideIn () !=null){
            jsxNormalExpression.setOperation (ctx.DivideIn ().toString ());
        }
        else if (ctx.PlusIn () !=null){
            jsxNormalExpression.setOperation (ctx.PlusIn ().toString ());
        }
        else if (ctx.MinusIn () !=null){
            jsxNormalExpression.setOperation (ctx.MinusIn ().toString ());
        }
        return null;
    }

    @Override
    public JsxExpression visitJsxId(ReactParser.JsxIdContext ctx) {
        return(JsxExpression) visitId (ctx.id ());
    }

    @Override
    public Stringg visitJsxString(ReactParser.JsxStringContext ctx) {

        Stringg stringg =new Stringg ();
        stringg.setNode_type ("String");
        stringg.setString (ctx.StringIn ().toString ());
        return stringg ;
    }

    @Override
    public Bool visitJsxBool(ReactParser.JsxBoolContext ctx) {
        Bool bool =new Bool ();
        bool.setNode_type ("Bool");
        bool.setBool (ctx.BooleanLiteralIn ().toString ());
        return bool;
    }

    @Override
    public Number visitJsxNumber(ReactParser.JsxNumberContext ctx) {
        Number number = new Number ();
        number.setNode_type ("Number");
        number.setValue (Integer.parseInt (ctx.NUMBERIn ().toString ()));
        return number;
    }

    @Override
    public JsxCallIdentifier visitJsxCallIdentifier(ReactParser.JsxCallIdentifierContext ctx) {
        JsxCallIdentifier  jsxCallIdentifier = new JsxCallIdentifier ();
        jsxCallIdentifier.setNode_type ("JsxCallIdentifier");
        for ( int i =0 ;i<ctx.id ().size ();i++){
            jsxCallIdentifier.getIdList ().add ((Id)visitId (ctx.id ().get (i)) );
        }
        return jsxCallIdentifier;
    }

    @Override
    public JsxBlock visitJsxBlock(ReactParser.JsxBlockContext ctx) {
        JsxBlock jsxBlock =new JsxBlock ();
        jsxBlock.setNode_type ("Block");
        if (ctx.jsxElement () !=null){
            jsxBlock.setJsxElement ((JsxElement) visitJsxElement (ctx.jsxElement ()));
        }
        return jsxBlock;
    }

    @Override
    public Block visitBlock(ReactParser.BlockContext ctx) {
        Block block = new Block ();
        block.setNode_type ("Block");
        for ( int i =0 ;i<ctx.statment ().size ();i++){
            block.getStatementList ().add ((Statement) visitStatment (ctx.statment ().get (i)));
        }
        return block;
    }

    @Override
    public Else_if visitElse_if(ReactParser.Else_ifContext ctx) {
        Else_if else_if = new Else_if ();
        else_if.setNode_type ("Else_if");
        if (ctx.conditions () !=null){
            else_if.setCondition ((Condition) visitConditions (ctx.conditions ()));
        }
        if (ctx.block () !=null){
            else_if.setBlock ((Block) visitBlock (ctx.block ()));
        }
        if (ctx.statment () !=null){
            else_if.setStatement ((Statement) visitStatment (ctx.statment ()));
        }
        return else_if;
    }

    @Override
    public Else visitElse(ReactParser.ElseContext ctx) {
        Else elsee = new Else ();
        elsee.setNode_type ("Else");
        if (ctx.block () !=null){
            elsee.setBlock ((Block) visitBlock (ctx.block ()));
        }
        if (ctx.statment () !=null){
            elsee.setStatement ((Statement) visitStatment (ctx.statment ()));
        }
        return elsee;
    }

    @Override
    public ForLoopParts visitForLoopParts(ReactParser.ForLoopPartsContext ctx) {
        ForLoopParts forLoopParts = new ForLoopParts ();
        forLoopParts.setNode_type ("ForLoopParts");
        if (ctx.kind () !=null){
            forLoopParts.setKind ((Kind) visitKind (ctx.kind ()));
        }
        if (ctx.conditions () !=null){
            forLoopParts.setCondition ((Condition) visitConditions (ctx.conditions ()));
        }
        if (ctx.callIdentifier () !=null){
            forLoopParts.setCallIdentifier ((CallIdentifier) visitCallIdentifier (ctx.callIdentifier ()));
        }
        for ( int i =0 ;i<ctx.variableDeclaration ().size ();i++){
            forLoopParts.getVariableDeclarationList ().add ((VariableDeclaration) visitVariableDeclaration (ctx.variableDeclaration ().get (i)));
        }
        for ( int i =0 ;i<ctx.id ().size ();i++){
            forLoopParts.getIdList ().add ((Id) visitId (ctx.id ().get (i)));
        }
        return forLoopParts;
    }

    @Override
    public Condition visitConditions(ReactParser.ConditionsContext ctx) {
        Condition condition = new Condition ();
        condition.setNode_type ("Conditions");
        for ( int i =0 ;i<ctx.data ().size ();i++){
            condition.getDataList ().add ((Data) visit (ctx.data ().get (i)));
        }
        for ( int i =0 ;i<ctx.Not ().size ();i++){
            condition.getNotList ().add (ctx.Not ().toString ());
        }
        if (ctx.operation () !=null){
            condition.setOperation ((Operation) visitOperation (ctx.operation ()));
        }
        if (ctx.BooleanLiteral () !=null){
            condition.setBool (ctx.BooleanLiteral ().toString ());
        }
        if (ctx.id () !=null){
            condition.setId ((Id) visitId (ctx.id ()));
        }
        return condition;
    }

    @Override
    public Arguments visitArguments(ReactParser.ArgumentsContext ctx) {
        Arguments arguments = new Arguments ();
        arguments.setNode_type ("Arguments");

        for ( int i =0 ;i< ctx.parameters ().size ();i++){
            arguments.getParametersList ().add ((Parameters) visit (ctx.parameters ().get (i)));
        }
        return arguments;
    }

    @Override
    public BlockOfarguments visitBlockOfarguments(ReactParser.BlockOfargumentsContext ctx) {
        BlockOfarguments blockOfarguments = new BlockOfarguments ();
        blockOfarguments.setNode_type ("BlockOfarguments");
        if (ctx.arguments () !=null){
            blockOfarguments.setArguments ((Arguments) visitArguments (ctx.arguments ()));
        }
        return blockOfarguments;
    }

    @Override
    public Object visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration ();
        variableDeclaration.setNode_type ("VariableDeclaration");
        if (ctx.kind () !=null){
            variableDeclaration.setKind ((Kind) visitKind (ctx.kind ()));
        }
        if (ctx.id () !=null){
            variableDeclaration.setId ((Id) visitId (ctx.id ()));
        }
        if (ctx.expression () !=null){
            variableDeclaration.setExpression ((Expression) visit (ctx.expression ()));
        }
        if (ctx.callfunction () !=null){
            variableDeclaration.setCallFunction ((CallFunction) visitCallfunction (ctx.callfunction ()));
        }
        if (ctx.callIdentifier () !=null){
            variableDeclaration.setCallIdentifier ((CallIdentifier) visitCallIdentifier (ctx.callIdentifier ()));
        }
        if (ctx.arrowFunction () !=null){
            variableDeclaration.setArrowFunction ((ArrowFunction) visitArrowFunction (ctx.arrowFunction ()));
        }
        return variableDeclaration;
    }

    @Override
    public VariableDeclarationList visitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx) {
        VariableDeclarationList variableDeclarationList =new VariableDeclarationList ();
        variableDeclarationList.setNode_type ("VariableDeclarationList");

        for ( int i =0 ;i<ctx.variableDeclaration ().size ();i++){
            variableDeclarationList.getVariableDeclarationList ().add ((VariableDeclaration) visitVariableDeclaration (ctx.variableDeclaration ().get (i)));
        }
        return variableDeclarationList;
    }

    @Override
    public ArrowFunction visitArrowFunction(ReactParser.ArrowFunctionContext ctx) {
        ArrowFunction arrowFunction =new ArrowFunction ();
        arrowFunction.setNode_type ("ArrowFunction");
        if (ctx.Async () !=null){
            arrowFunction.setAsync (ctx.Async ().toString ());
        }
        if (ctx.arguments () !=null){
            arrowFunction.setArguments ((Arguments) visitArguments (ctx.arguments ()));
        }
        if (ctx.id () !=null){
            arrowFunction.setId ((Id) visitId (ctx.id ()));
        }
        if (ctx.expression () !=null){
            arrowFunction.setExperssion ((Expression) visit (ctx.expression ()));
        }
        for ( int i =0 ;i<ctx.statment ().size ();i++){
            arrowFunction.getStatementList ().add ((Statement) visitStatment (ctx.statment ().get (i)));
        }
        if (ctx.returnstatment () !=null){
            arrowFunction.setReturnstatment ((Returnstatment) visitReturnstatment (ctx.returnstatment ()));
        }
        if (ctx.jsxElement () !=null){
            arrowFunction.setJsxElement ((JsxElement) visitJsxElement (ctx.jsxElement ()));
        }
        return arrowFunction;
    }

    @Override
    public Returnstatment visitReturnstatment(ReactParser.ReturnstatmentContext ctx) {
        Returnstatment returnstatment =new Returnstatment ();
        returnstatment.setNode_type ("Returnstatment");

        if (ctx.jsxBlock () !=null){
            returnstatment.setJsxBlock ((JsxBlock) visitJsxBlock (ctx.jsxBlock ()));
        }
        if (ctx.expression () !=null){
            returnstatment.setExperssion ((Expression) visit (ctx.expression ()));
        }
        return returnstatment;
    }

    @Override
    public SimpleCallfunction visitSimpleCallfunction(ReactParser.SimpleCallfunctionContext ctx) {

        SimpleCallfunction SimpleCallfunction = new SimpleCallfunction ();
        SimpleCallfunction.setNode_type ("SimpleCallfunction");
        SimpleCallfunction.setNode_name (ctx.id ().toString ());
        if (ctx.id () !=null){
            SimpleCallfunction.setId ((Id) visitId (ctx.id ()));
        }
        if (ctx.arguments () !=null){
            SimpleCallfunction.setArguments ((Arguments) visitArguments (ctx.arguments ()));
        }

        return SimpleCallfunction;
    }

    @Override
    public Argument visitArgument(ReactParser.ArgumentContext ctx) {
        Argument argument = new Argument ();
        argument.setNode_type ("Argument");
      //  argument.setNode_name ();

        if (ctx.callIdentifier () !=null){
            argument.setCallIdentifier ((CallIdentifier) visitCallIdentifier (ctx.callIdentifier ()));
        }
        if (ctx.expression () !=null){
            argument.setExperssion ((Expression) visit (ctx.expression ()));
        }
        if (ctx.arrowFunction () !=null){
            argument.setArrowFunction ((ArrowFunction) visitArrowFunction (ctx.arrowFunction ()));
        }
        return argument;
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
