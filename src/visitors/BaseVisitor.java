package visitors;


import SymbolTable.SymbolTable;
import SymbolTable.StRow;
import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import antlr.ReactParserVisitor;
import ast.Models.*;
import ast.Models.Number;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;





public class BaseVisitor extends ReactParserBaseVisitor {
    SymbolTable symbolTable = new SymbolTable();

    @Override
    public Start visitStart(ReactParser.StartContext ctx) {
        Start start = new Start();
        System.out.println("HIIIIIIIIII");
        start.setNode_type("Start");
        start.setNode_name("Start");
        if (ctx.statment()!=null){
            for (int i=0;i<ctx.statment().size();i++){
                start.getStatement_list().add((Statement) visitStatment(ctx.statment(i)));
            }
        }
        //start.setChild (start.getStatement_list ());
        StRow stRow = new StRow ();
        stRow.setType(start.getNode_type());
        stRow.setValue(start.getNode_name());
        symbolTable.getRows().add(stRow);
        return start;
    }


    @Override
    public Statement visitStatment(ReactParser.StatmentContext ctx) {
        Statement statement = new Statement();
        statement.setNode_type("Statement");
        statement.setNode_name("Statement");
        if (ctx.statmentElement()!=null)
            statement.setStatementElement((StatementElement) visit(ctx.statmentElement()));
        StRow stRow = new StRow();
        stRow.setType(statement.getNode_type());
        stRow.setValue(statement.getNode_name());
        symbolTable.getRows().add(stRow);
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
        if (ctx.else_()!=null) {
            ifElement.setElseElement((Else) visitElse(ctx.else_()));
        }
        StRow row = new StRow();
        row.setType(ifElement.getNode_type());
        row.setValue(ifElement.getNode_type());
        symbolTable.getRows().add(row);
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
        StRow row = new StRow();
        row.setType(forElement.getNode_type());
        row.setValue(forElement.getNode_type());
        symbolTable.getRows().add(row);
        return forElement;
    }

    @Override
    public Function visitFunction(ReactParser.FunctionContext ctx) {
        Function function = new Function();
        function.setNode_type("Function");
        if (ctx.id()!=null){
            function.setId( (Id) visitId(ctx.id()));
            function.setNode_name(ctx.id().getText());
        }
        if (ctx.arguments()!=null){
            function.setArguments((Arguments) visitArguments(ctx.arguments()));
        }
        for (int i=0;i<ctx.statment().size();i++)
            function.getStatements().add((Statement) visitStatment(ctx.statment(i)));
        for (int i=0;i<ctx.returnstatment().size();i++)
            function.getReturnstatments().add((Returnstatment) visitReturnstatment(ctx.returnstatment(i)));

        StRow row = new StRow();
        row.setType(function.getNode_type());
        row.setValue(function.getNode_name());
        symbolTable.getRows().add(row);
        return function;
    }

    @Override
    public Comment visitComments(ReactParser.CommentsContext ctx) {
        Comment comment = new Comment();
        comment.setNode_type("Comments");
        if (ctx.SINGLE_LINE_COMMENT()!=null){
            comment.setSingleLineComment(ctx.SINGLE_LINE_COMMENT().toString());
            comment.setNode_name(ctx.SINGLE_LINE_COMMENT().toString());
        }
        if (ctx.MULTI_LINE_COMMENT()!=null){
            comment.setMultiLineComment(ctx.MULTI_LINE_COMMENT().toString());
        }
        StRow row = new StRow();
        row.setType(comment.getNode_type());
        row.setValue(comment.getNode_name());
        symbolTable.getRows().add(row);
        return comment;

    }

    @Override
    public While visitWhile(ReactParser.WhileContext ctx) {
        While whileElement = new While();
        whileElement.setNode_type("While");
        if (ctx.conditions()!=null)
            whileElement.setCondition((Condition) visitConditions(ctx.conditions()));
        if (ctx.block()!=null)
            whileElement.setBlock((Block) visitBlock(ctx.block()));
        if (ctx.statment()!=null)
            whileElement.setStatement((Statement) visitStatment(ctx.statment()));
        StRow row = new StRow();
        row.setType(whileElement.getNode_type());
        row.setValue(whileElement.getNode_type());
        symbolTable.getRows().add(row);
        return whileElement;
    }

    @Override
    public DoWhile visitDo_while(ReactParser.Do_whileContext ctx) {
        DoWhile doWhile = new DoWhile();
        doWhile.setNode_type("DoWhile");
        if (ctx.conditions()!=null)
            doWhile.setCondition((Condition) visitConditions(ctx.conditions()));
        if (ctx.block()!=null)
            doWhile.setBlock((Block) visitBlock(ctx.block()));
        if (ctx.statment()!=null)
            doWhile.setStatement((Statement) visitStatment(ctx.statment()));
        StRow row = new StRow();
        row.setType(doWhile.getNode_type());
        row.setValue(doWhile.getNode_type());
        symbolTable.getRows().add(row);
        return doWhile;
    }

    @Override
    public CallFunction visitCallfunction(ReactParser.CallfunctionContext ctx) {
        CallFunction callFunction = new CallFunction();
        callFunction.setNode_type("CallFunction");
        for (int i=0;i<ctx.simpleCallfunction().size();i++)
            callFunction.getSimpleCallfunctions().add((SimpleCallfunction) visitSimpleCallfunction(ctx.simpleCallfunction(i)));
        for (int i=0;i<ctx.callIdentifier().size();i++)
            callFunction.getCallIdentifiers().add((CallIdentifier) visitCallIdentifier(ctx.callIdentifier(i)));
        StRow row = new StRow();
        row.setType(callFunction.getNode_type());
        row.setValue(callFunction.getNode_type());
        symbolTable.getRows().add(row);
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
        StRow row = new StRow();
        row.setType(switchElement.getNode_type());
        row.setValue(switchElement.getNode_type());
        symbolTable.getRows().add(row);
        return switchElement;
    }

    @Override
    public TryCatch visitTryCatch(ReactParser.TryCatchContext ctx) {
        TryCatch tryCatch = new TryCatch();
        tryCatch.setNode_type("TryCatch");
        for (int i=0;i<ctx.block().size();i++)
            tryCatch.getBlocks().add((Block) visitBlock(ctx.block(i)));
        for (int i=0;i<ctx.id().size();i++)
            tryCatch.getIds().add((Id) visitId(ctx.id(i)));
        StRow row = new StRow();
        row.setType(tryCatch.getNode_type());
        row.setValue(tryCatch.getNode_type());
        symbolTable.getRows().add(row);
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
        StRow row = new StRow();
        row.setType(importElement.getNode_type());
        row.setValue(importElement.getNode_type());
        symbolTable.getRows().add(row);
        return importElement;
    }

    @Override
    public IfShort visitIfShort(ReactParser.IfShortContext ctx) {
        IfShort ifShort = new IfShort();
        ifShort.setNode_type("IfShort");
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
        StRow row = new StRow();
        row.setType(ifShort.getNode_type());
        row.setValue(ifShort.getNode_type());
        symbolTable.getRows().add(row);
        return ifShort;
    }

    @Override
    public JsxElement visitJsxElement(ReactParser.JsxElementContext ctx) {
        JsxElement jsxElement = new JsxElement();
        jsxElement.setNode_type("JsxElement");
        if (ctx.jsxElementNonSelfClosing()!=null)
            jsxElement.setJsxElementNonSelfClosing((JsxElementNonSelfClosing) visitJsxElementNonSelfClosing(ctx.jsxElementNonSelfClosing()));
        if (ctx.jsxElementSelfClosing()!=null)
            jsxElement.setJsxElementSelfClosing((JsxElementSelfClosing) visitJsxElementSelfClosing(ctx.jsxElementSelfClosing()));
        StRow row = new StRow();
        row.setType(jsxElement.getNode_type());
        row.setValue(jsxElement.getNode_type());
        symbolTable.getRows().add(row);
        return jsxElement;
    }

    @Override
    public JsxElementNonSelfClosing visitJsxElementNonSelfClosing(ReactParser.JsxElementNonSelfClosingContext ctx) {
        JsxElementNonSelfClosing jsxElementNonSelfClosing = new JsxElementNonSelfClosing();
        jsxElementNonSelfClosing.setNode_type("JsxElementNonSelfClosing");
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
        StRow row = new StRow();
        row.setType(jsxElementNonSelfClosing.getNode_type());
        row.setValue(jsxElementNonSelfClosing.getNode_type());
        symbolTable.getRows().add(row);
        return jsxElementNonSelfClosing;
    }

    @Override
    public JsxElementSelfClosing visitJsxElementSelfClosing(ReactParser.JsxElementSelfClosingContext ctx) {
        JsxElementSelfClosing jsxElementSelfClosing = new JsxElementSelfClosing();
        jsxElementSelfClosing.setNode_type("JsxElementSelfClosing");
        if (ctx.jsx_tag()!=null)
            jsxElementSelfClosing.setJsxTag(ctx.jsx_tag().toString());
        for (int i=0;i<ctx.id().size();i++)
            jsxElementSelfClosing.getIds().add((Id) visitId(ctx.id(i)));
        for (int i=0;i<ctx.blockIn().size();i++)
            jsxElementSelfClosing.getBlocks().add((BlockIn) visitBlockIn(ctx.blockIn(i)));
        for (int i=0;i<ctx.StringIn().size();i++)
            jsxElementSelfClosing.getStringsIns().add(ctx.StringIn(i).toString());
        StRow row = new StRow();
        row.setType(jsxElementSelfClosing.getNode_type());
        row.setValue(jsxElementSelfClosing.getNode_type());
        symbolTable.getRows().add(row);
        return jsxElementSelfClosing;

    }

    @Override
    public JsxElementIn visitJsxElementIn(ReactParser.JsxElementInContext ctx) {
        JsxElementIn jsxElementIn = new JsxElementIn();
        jsxElementIn.setNode_type("JsxElementIn");
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
        StRow row = new StRow();
        row.setType(jsxElementIn.getNode_type());
        row.setValue(jsxElementIn.getNode_type());
        symbolTable.getRows().add(row);
        return jsxElementIn;

    }

    @Override
    public BlockIn visitBlockIn(ReactParser.BlockInContext ctx) {
        BlockIn blockIn = new BlockIn();
        blockIn.setNode_type("BlockIn");
        for (int i =0;i<ctx.jsxArguments().size();i++)
            blockIn.getJsxArgumentsList().add((JsxArguments) visitJsxArguments(ctx.jsxArguments(i)));
        StRow row = new StRow();
        row.setType(blockIn.getNode_type());
        row.setValue(blockIn.getNode_type());
        symbolTable.getRows().add(row);
        return blockIn;

    }

    @Override
    public JsxArguments visitJsxArguments(ReactParser.JsxArgumentsContext ctx) {
        JsxArguments jsxArguments = new JsxArguments();;
        jsxArguments.setNode_type("JsxArguments");
        for (int i =0;i<ctx.jsxParameters().size();i++)
            jsxArguments.getJsxParametersList().add((JsxParameters) visit(ctx.jsxParameters(i)));
        StRow row = new StRow();
        row.setType(jsxArguments.getNode_type());
        row.setValue(jsxArguments   .getNode_type());
        symbolTable.getRows().add(row);
        return jsxArguments;
    }

    @Override
    public JsxArrowFunction visitJsxArrFunction(ReactParser.JsxArrFunctionContext ctx) {
        if(ctx.jsxArrowFunction()!=null)
            return ((JsxArrowFunction) visitJsxArrowFunction(ctx.jsxArrowFunction()));
        else
            return null;
    }

    @Override
    public JsxCallfunction visitLabelJsxCallFunction(ReactParser.LabelJsxCallFunctionContext ctx) {
        if(ctx.jsxCallfunction()!=null)
            return ((JsxCallfunction) visitJsxCallfunction(ctx.jsxCallfunction()));
        else
            return null;
    }

    @Override
    public JsxArgument visitJsxArg(ReactParser.JsxArgContext ctx) {
        if(ctx.jsxArgument()!=null)
            return ((JsxArgument) visitJsxArgument(ctx.jsxArgument()));
        else
            return null;
    }

    @Override
    public JsxCallIdentifier visitJsxCallId(ReactParser.JsxCallIdContext ctx) {
        if(ctx.jsxCallIdentifier()!=null)
            return ((JsxCallIdentifier) visitJsxCallIdentifier(ctx.jsxCallIdentifier()));
        else
            return null;
    }

    @Override
    public JsxExpression visitJsxExp(ReactParser.JsxExpContext ctx) {
        if(ctx.jsxExpression()!=null)
            return ((JsxExpression) visit(ctx.jsxExpression()));
        else
            return null;
    }

    @Override
    public JsxArrowFunction visitJsxArrowFunction(ReactParser.JsxArrowFunctionContext ctx) {
        JsxArrowFunction jsxArrowFunction =new JsxArrowFunction ();
        jsxArrowFunction.setNode_type ("JsxArrowFunction");

        if(ctx.jsxArguments () != null){
            jsxArrowFunction.setJsxArguments ((JsxArguments) visitJsxArguments (ctx.jsxArguments ()));
            jsxArrowFunction.getChild ().add (jsxArrowFunction.getJsxArguments ());
        }

        if (ctx.jsxArgument () != null){
            jsxArrowFunction.setJsxArgument ((JsxArgument) visitJsxArgument (ctx.jsxArgument ()));
            jsxArrowFunction.getChild ().add (jsxArrowFunction.getJsxArgument ());
        }

        for ( int i =0 ;i<ctx.jsxExpression ().size ();i++){
            jsxArrowFunction.getJsxExpressionList ().add ((JsxExpression) visit (ctx.jsxExpression ().get (i)));
            jsxArrowFunction.getChild ().add (jsxArrowFunction.getJsxExpressionList ().get (i));
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
            jsxCallfunction.getChild ().add (jsxCallfunction.getJsxSimpleCallfunctionList ().get (i));
        }
        for ( int i =0 ;i<ctx.id ().size ();i++){
            jsxCallfunction.getIdList ().add ((Id) visitId (ctx.id ().get (i)));
            jsxCallfunction.getChild ().add (jsxCallfunction.getIdList ().get (i));
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
            jsxSimpleCallfunction.getChild ().add (jsxSimpleCallfunction.getId ());
        }
        if (ctx.jsxArguments () !=null){
          jsxSimpleCallfunction.setJsxArguments ((JsxArguments) visitJsxArguments (ctx.jsxArguments ()));
          jsxSimpleCallfunction.getChild ().add (jsxSimpleCallfunction.getJsxArguments ());
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
            jsxArgument.getChild ().add (jsxArgument.getId ());
        }

        if (ctx.jsxExpression () !=null){
            jsxArgument.setJsxExpression ((JsxExpression) visit (ctx.jsxExpression ()));
            jsxArgument.getChild ().add (jsxArgument.getJsxExpression ());
        }

        if (ctx.jsxArrowFunction () !=null){
            jsxArgument.setJsxArrowFunction ((JsxArrowFunction) visitJsxArrowFunction (ctx.jsxArrowFunction ()));
            jsxArgument.getChild ().add (jsxArgument.getJsxArrowFunction ());
        }

        return jsxArgument;
    }
    @Override
    public JsxExpression visitJsxExpression(ReactParser.JsxExpressionContext ctx){
        JsxExpression jsxExpression = new JsxExpression ();
        jsxExpression.setNode_type ("JsxExpression");
        if (ctx.MultiplyIn () !=null){
            Stringg stringg = new Stringg();
            stringg.setNode_type("Operation");
            stringg.setString (ctx.MultiplyIn ().toString ());
            stringg.setNode_name (ctx.MultiplyIn ().toString ());
            jsxExpression.setOperation (ctx.MultiplyIn ().toString ());
            jsxExpression.getChild ().add (stringg);
        }
        if (ctx.DivideIn () !=null){
            jsxExpression.setOperation (ctx.DivideIn ().toString ());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Operation");
            stringg.setString (ctx.DivideIn ().toString ());
            stringg.setNode_name (ctx.DivideIn ().toString ());
            jsxExpression.getChild ().add (stringg);
        }
        if (ctx.PlusIn () !=null){
            jsxExpression.setOperation (ctx.PlusIn ().toString ());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Operation");
            stringg.setString (ctx.PlusIn ().toString ());
            stringg.setNode_name (ctx.PlusIn ().toString ());
            jsxExpression.getChild ().add (stringg);
        }
        if (ctx.MinusIn () !=null){
            jsxExpression.setOperation (ctx.MinusIn ().toString ());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Operation");
            stringg.setString (ctx.MinusIn ().toString ());
            stringg.setNode_name (ctx.MinusIn ().toString ());
            jsxExpression.getChild ().add (stringg);
        }
        if (ctx.NUMBERIn () !=null){
            Number number = new Number();
            number.setNode_type("Number");
            if (ctx.NUMBERIn () != null) {
                number.setValue(Integer.parseInt(ctx.NUMBERIn ().getText()));
                number.setNode_name(ctx.NUMBERIn ().getText());
                jsxExpression.getChild ().add (jsxExpression.getNumber ());
            }
        }
        if (ctx.StringIn () !=null){
            Stringg stringg = new Stringg();
            stringg.setNode_type("string");
            if (ctx.StringIn () != null) {
                stringg.setString( ctx.StringIn ().getText());
                stringg.setNode_name(ctx.StringIn ().getText());
                jsxExpression.getChild ().add (jsxExpression.getString ());
            }
        }
        if (ctx.BooleanLiteralIn () !=null){
            Bool bool = new Bool();
            bool.setNode_type("Boolean");
            if (ctx.BooleanLiteralIn () != null) {
                bool.setBool(ctx.BooleanLiteralIn ().getText());
                bool.setNode_name(ctx.BooleanLiteralIn ().getText());
                jsxExpression.getChild ().add (jsxExpression.getBool ());
            }
        }
        if (ctx.id () !=null){
            jsxExpression.setId ((Id) visitId (ctx.id ()));
            jsxExpression.getChild ().add (jsxExpression.getId ());
        }
        for ( int i =0 ;i<ctx.jsxExpression ().size ();i++){
            jsxExpression.getJsxExpressionList ().add ((JsxExpression) visitJsxExpression (ctx.jsxExpression ().get (i)));
            jsxExpression.getChild ().add (jsxExpression.getJsxExpressionList ().get (i));
        }
        return jsxExpression;

    }

    @Override
    public JsxCallIdentifier visitJsxCallIdentifier(ReactParser.JsxCallIdentifierContext ctx) {
        JsxCallIdentifier  jsxCallIdentifier = new JsxCallIdentifier ();
        jsxCallIdentifier.setNode_type ("JsxCallIdentifier");
        for ( int i =0 ;i<ctx.id ().size ();i++){
            jsxCallIdentifier.getIdList ().add ((Id)visitId (ctx.id ().get (i)) );
            jsxCallIdentifier.getChild ().add (jsxCallIdentifier.getIdList ().get (i));
        }
        return jsxCallIdentifier;
    }

    @Override
    public JsxBlock visitJsxBlock(ReactParser.JsxBlockContext ctx) {
        JsxBlock jsxBlock =new JsxBlock ();
        jsxBlock.setNode_type ("Block");
        if (ctx.jsxElement () !=null){
            jsxBlock.setJsxElement ((JsxElement) visitJsxElement (ctx.jsxElement ()));
            jsxBlock.getChild ().add (jsxBlock.getJsxElement ());
        }
        return jsxBlock;
    }

    @Override
    public Block visitBlock(ReactParser.BlockContext ctx) {
        Block block = new Block ();
        block.setNode_type ("Block");
        for ( int i =0 ;i<ctx.statment ().size ();i++){
            block.getStatementList ().add ((Statement) visitStatment (ctx.statment ().get (i)));
            block.getChild ().add (block.getStatementList ().get (i));
        }
        return block;
    }

    @Override
    public Else_if visitElse_if(ReactParser.Else_ifContext ctx) {
        Else_if else_if = new Else_if ();
        else_if.setNode_type ("Else_if");
        if (ctx.conditions () !=null){
            else_if.setCondition ((Condition) visitConditions (ctx.conditions ()));
            else_if.getChild ().add (else_if.getCondition ());
        }
        if (ctx.block () !=null){
            else_if.setBlock ((Block) visitBlock (ctx.block ()));
            else_if.getChild ().add (else_if.getBlock ());
        }
        if (ctx.statment () !=null){
            else_if.setStatement ((Statement) visitStatment (ctx.statment ()));
            else_if.getChild ().add (else_if.getStatement ());
        }
        return else_if;
    }

    @Override
    public Else visitElse(ReactParser.ElseContext ctx) {
        Else elsee = new Else ();
        elsee.setNode_type ("Else");
        if (ctx.block () !=null){
            elsee.setBlock ((Block) visitBlock (ctx.block ()));
            elsee.getChild ().add (elsee.getBlock ());
        }
        if (ctx.statment () !=null){
            elsee.setStatement ((Statement) visitStatment (ctx.statment ()));
            elsee.getChild ().add (elsee.getStatement ());
        }
        return elsee;
    }

    @Override
    public ForLoopParts visitForLoopParts(ReactParser.ForLoopPartsContext ctx) {
        ForLoopParts forLoopParts = new ForLoopParts ();
        forLoopParts.setNode_type ("ForLoopParts");
        if (ctx.kind () !=null){
            forLoopParts.setKind ((Kind) visitKind (ctx.kind ()));
            forLoopParts.getChild ().add (forLoopParts.getKind ());
        }
        if (ctx.conditions () !=null){
            forLoopParts.setCondition ((Condition) visitConditions (ctx.conditions ()));
            forLoopParts.getChild ().add (forLoopParts.getCondition ());
        }
        if (ctx.callIdentifier () !=null){
            forLoopParts.setCallIdentifier ((CallIdentifier) visitCallIdentifier (ctx.callIdentifier ()));
            forLoopParts.getChild ().add (forLoopParts.getCallIdentifier ());
        }
        for ( int i =0 ;i<ctx.variableDeclaration ().size ();i++){
            forLoopParts.getVariableDeclarationList ().add ((VariableDeclaration) visitVariableDeclaration (ctx.variableDeclaration ().get (i)));
            forLoopParts.getChild ().add (forLoopParts.getVariableDeclarationList ().get (i));
        }
        for ( int i =0 ;i<ctx.id ().size ();i++){
            forLoopParts.getIdList ().add ((Id) visitId (ctx.id ().get (i)));
            forLoopParts.getChild ().add (forLoopParts.getIdList ().get (i));
        }
        return forLoopParts;
    }

    @Override
    public Condition visitConditions(ReactParser.ConditionsContext ctx) {
        Condition condition = new Condition ();
        condition.setNode_type ("Conditions");
        for ( int i =0 ;i<ctx.data ().size ();i++){
            condition.getDataList ().add ((Data) visit (ctx.data ().get (i)));
            condition.getChild ().add (condition.getDataList ().get (i));
        }
        for ( int i =0 ;i<ctx.Not ().size ();i++){
            Stringg stringg = new Stringg ();
            stringg.setString (condition.getNotList ().get (i));
            stringg.setNode_name ("!");
            stringg.setNode_type ("Not");
            condition.getNotList ().add (ctx.Not ().toString ());
            condition.getChild ().add (stringg);
        }
        if (ctx.operation () !=null){
            condition.setOperation ((Operation) visitOperation (ctx.operation ()));
            condition.getChild ().add (condition.getOperation ());
        }
        if (ctx.BooleanLiteral () !=null){
            Bool bool = new Bool ();
            bool.setBool (condition.getBool ());
            bool.setNode_name (condition.getBool ());
            bool.setNode_type ("Bool");
            condition.setBool (ctx.BooleanLiteral ().toString ());
            condition.getChild ().add (bool);
        }
        if (ctx.id () !=null){
            condition.setId ((Id) visitId (ctx.id ()));
            condition.getChild ().add (condition.getId ());
        }
        return condition;
    }

    @Override
    public Arguments visitArguments(ReactParser.ArgumentsContext ctx) {
        Arguments arguments = new Arguments ();
        arguments.setNode_type ("Arguments");

        for ( int i =0 ;i< ctx.parameters ().size ();i++){
            arguments.getParametersList ().add ((Parameters) visit (ctx.parameters ().get (i)));
            arguments.getChild ().add (arguments.getParametersList ().get (i));
        }
        return arguments;
    }

    @Override
    public BlockOfarguments visitBlockOfarguments(ReactParser.BlockOfargumentsContext ctx) {
        BlockOfarguments blockOfarguments = new BlockOfarguments ();
        blockOfarguments.setNode_type ("BlockOfarguments");
        if (ctx.arguments () !=null){
            blockOfarguments.setArguments ((Arguments) visitArguments (ctx.arguments ()));
            blockOfarguments.getChild ().add (blockOfarguments.getArguments ());
        }
        return blockOfarguments;
    }

    @Override
    public Object visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration ();
        variableDeclaration.setNode_type ("VariableDeclaration");
        if (ctx.kind () !=null){
            variableDeclaration.setKind ((Kind) visitKind (ctx.kind ()));
            variableDeclaration.getChild ().add (variableDeclaration.getKind ());
        }
        if (ctx.id () !=null){
            variableDeclaration.setId ((Id) visitId (ctx.id ()));
            variableDeclaration.getChild ().add (variableDeclaration.getId ());
        }
        if (ctx.array () !=null){
            variableDeclaration.setArray ((Array) visitArray (ctx.array ()));
            variableDeclaration.getChild ().add (variableDeclaration.getArray ());
        }
        if (ctx.expression () !=null){
            variableDeclaration.setExpression ((Expression) visit (ctx.expression ()));
            variableDeclaration.getChild ().add (variableDeclaration.getExpression ());
        }
        if (ctx.callfunction () !=null){
            variableDeclaration.setCallFunction ((CallFunction) visitCallfunction (ctx.callfunction ()));
            variableDeclaration.getChild ().add (variableDeclaration.getCallFunction ());
        }
        if (ctx.callIdentifier () !=null){
            variableDeclaration.setCallIdentifier ((CallIdentifier) visitCallIdentifier (ctx.callIdentifier ()));
            variableDeclaration.getChild ().add (variableDeclaration.getCallIdentifier ());
        }
        if (ctx.arrowFunction () !=null){
            variableDeclaration.setArrowFunction ((ArrowFunction) visitArrowFunction (ctx.arrowFunction ()));
            variableDeclaration.getChild ().add (variableDeclaration.getArrowFunction ());
        }
        return variableDeclaration;
    }

    @Override
    public VariableDeclarationList visitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx) {
        VariableDeclarationList variableDeclarationList =new VariableDeclarationList ();
        variableDeclarationList.setNode_type ("VariableDeclarationList");

        for ( int i =0 ;i<ctx.variableDeclaration ().size ();i++){
            variableDeclarationList.getVariableDeclarationList ().add ((VariableDeclaration) visitVariableDeclaration (ctx.variableDeclaration ().get (i)));
            variableDeclarationList.getChild ().add (variableDeclarationList.getVariableDeclarationList ().get (i));
        }
        return variableDeclarationList;
    }

    @Override
    public ArrowFunction visitArrowFunction(ReactParser.ArrowFunctionContext ctx) {
        ArrowFunction arrowFunction =new ArrowFunction ();
        arrowFunction.setNode_type ("ArrowFunction");
        if (ctx.Async () !=null){
            Stringg stringg = new Stringg ();
            stringg.setString (arrowFunction.getAsync ());
            stringg.setNode_name ("async");
            stringg.setNode_type ("async");
            arrowFunction.setAsync (ctx.Async ().toString ());
            arrowFunction.getChild ().add (stringg);
        }
        if (ctx.arguments () !=null){
            arrowFunction.setArguments ((Arguments) visitArguments (ctx.arguments ()));
            arrowFunction.getChild ().add (arrowFunction.getArguments ());
        }
        if (ctx.id () !=null){
            arrowFunction.setId ((Id) visitId (ctx.id ()));
            arrowFunction.getChild ().add (arrowFunction.getId ());
        }
        if (ctx.expression () !=null){
            arrowFunction.setExperssion ((Expression) visit (ctx.expression ()));
            arrowFunction.getChild ().add (arrowFunction.getExperssion ());
        }
        for ( int i =0 ;i<ctx.statment ().size ();i++){
            arrowFunction.getStatementList ().add ((Statement) visitStatment (ctx.statment ().get (i)));
            arrowFunction.getChild ().add (arrowFunction.getStatementList ().get (i));
        }
        if (ctx.returnstatment () !=null){
            arrowFunction.setReturnstatment ((Returnstatment) visitReturnstatment (ctx.returnstatment ()));
            arrowFunction.getChild ().add (arrowFunction.getReturnstatment ());
        }
        if (ctx.jsxElement () !=null){
            arrowFunction.setJsxElement ((JsxElement) visitJsxElement (ctx.jsxElement ()));
            arrowFunction.getChild ().add (arrowFunction.getJsxElement ());
        }
        return arrowFunction;
    }

    @Override
    public Returnstatment visitReturnstatment(ReactParser.ReturnstatmentContext ctx) {
        Returnstatment returnstatment =new Returnstatment ();
        returnstatment.setNode_type ("Returnstatment");

        if (ctx.jsxBlock () !=null){
            returnstatment.setJsxBlock ((JsxBlock) visitJsxBlock (ctx.jsxBlock ()));
            returnstatment.getChild ().add (returnstatment.getJsxBlock ());
        }
        if (ctx.expression () !=null){
            returnstatment.setExperssion ((Expression) visit (ctx.expression ()));
            returnstatment.getChild ().add (returnstatment.getExperssion ());
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
            SimpleCallfunction.getChild ().add (SimpleCallfunction.getId ());
        }
        if (ctx.arguments () !=null){
            SimpleCallfunction.setArguments ((Arguments) visitArguments (ctx.arguments ()));
            SimpleCallfunction.getChild ().add (SimpleCallfunction.getArguments ());
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
            argument.getChild ().add (argument.getCallIdentifier ());
        }
        if (ctx.expression () !=null){
            argument.setExperssion ((Expression) visit (ctx.expression ()));
            argument.getChild ().add (argument.getExperssion ());
        }
        if (ctx.arrowFunction () !=null){
            argument.setArrowFunction ((ArrowFunction) visitArrowFunction (ctx.arrowFunction ()));
            argument.getChild ().add (argument.getArrowFunction ());

        }
        return argument;
    }

//    @Override
//    public ArrowFunction visitLabel_ArrowFunction(ReactParser.Label_ArrowFunctionContext ctx) {
//
//        return (ArrowFunction) visitArrowFunction(ctx.arrowFunction()) ;
//    }
//
//    @Override
//    public CallIdentifier visitLabel_CallIdentifier(ReactParser.Label_CallIdentifierContext ctx) {
//        return (visitCallIdentifier(ctx.callIdentifier()));
//    }
//
//    @Override
//    public Argument visitLable_Argument(ReactParser.Lable_ArgumentContext ctx) { ArrowFunction arrowFunction = new ArrowFunction();
//        return ((Argument)visitArgument(ctx.argument()));
//
//    }
//
//    @Override
//    public CallFunction visitLabel_Callfunction(ReactParser.Label_CallfunctionContext ctx) {
//        return ((CallFunction)visitCallfunction(ctx.callfunction()));
//    }
//
//    @Override
//    public Expression visitLabel_Expression(ReactParser.Label_ExpressionContext ctx) {
//        return ((Expression) visit(ctx.expression()));
//
//    }
//
//    @Override
//    public NullLiteral visitLabel_NullLiteral(ReactParser.Label_NullLiteralContext ctx) {
//        NullLiteral nullLiteral =new NullLiteral();
//        nullLiteral.setNode_type("NullLiteral");
//        if (ctx.NullLiteral() != null) {
//            nullLiteral.setN(ctx.NullLiteral().getText());
//        }
//        if (ctx.NullLiteralModeCall() != null) {
//            nullLiteral.setN(ctx.NullLiteralModeCall().getText());
//        }
//        return nullLiteral;
//        }
//
//
//
//    @Override
//    public BlockOfarguments visitLabel_BlockOfarguments(ReactParser.Label_BlockOfargumentsContext ctx) {
//        return ((BlockOfarguments)visitBlockOfarguments(ctx.blockOfarguments()));    }

    @Override
    public CallIdentifier visitCallIdentifier(ReactParser.CallIdentifierContext ctx) {
        CallIdentifier callIdentifier = new CallIdentifier();
        callIdentifier.setNode_type("callIdentifier");
        for (int i = 0; i < ctx.id().size(); i++) {
            callIdentifier.getIds().add((Id) ( visitId(ctx.id().get(i))));
        }
        return callIdentifier;
    }

    @Override
    public Parameters visitParameters(ReactParser.ParametersContext ctx){
        return null;
    }

    @Override
    public Expression visitExpression(ReactParser.ExpressionContext ctx){
        return null;
    }


//    @Override
//    public Label_shortExpressions visitShortExpression(ReactParser.ShortExpressionContext ctx) {
//        Label_shortExpressions label_shortExpressions =new Label_shortExpressions();
//        label_shortExpressions.setNode_type("label_shortExpressions");
//        label_shortExpressions.setCallIdentifier((CallIdentifier)( visitCallIdentifier (ctx.callIdentifier())));
//        if(ctx.PlusPlus() !=null){
//            label_shortExpressions.setOperation(ctx.PlusPlus().getText());
//        }
//        else if(ctx.MinusMinus() !=null){
//            label_shortExpressions.setOperation(ctx.MinusMinus().getText());
//        }
//        return label_shortExpressions;
//    }
//
//    @Override
//    public Data visitLabel_dataExpression(ReactParser.Label_dataExpressionContext ctx) {
//            return ((Data) visit (ctx.data()));
//    }
//
//    @Override
//    public Label_normalExpressions visitLabel_normalExpression(ReactParser.Label_normalExpressionContext ctx) {
//        Label_normalExpressions label_normalExpressions =new Label_normalExpressions();
//        label_normalExpressions.setNode_type("Label_normalExpressions");
//         for(int i=0 ; i<ctx.expression().size(); i++){
//                label_normalExpressions.getExpressions().add((Expression) visit (ctx.expression(i)));
//            }
//            if(ctx.Multiply() !=null){
//                label_normalExpressions.setOperation(ctx.Multiply().getText());
//            }
//           else if(ctx.MinusModeCall() !=null){
//            label_normalExpressions.setOperation(ctx.MinusModeCall().getText());
//        }
//        return label_normalExpressions;
//    }

    @Override
    public Export visitExport(ReactParser.ExportContext ctx) {
        Export export = new Export();
        export.setNode_type("Expert");
        if (ctx.Export() != null) {
            export.setEap(ctx.Export().getText());
        }
        if (ctx.Default() != null) {
            export.setDef(ctx.Default().getText());
        }
        if (ctx.callIdentifier() != null) {
            visitCallIdentifier(ctx.callIdentifier());

        }
        return export;
    }

    @Override
    public Array visitLabel_Array(ReactParser.Label_ArrayContext ctx) {
        return (Array) visitArray(ctx.array());
    }

    @Override
    public Number visitLabel_Number(ReactParser.Label_NumberContext ctx) {
        Number number = new Number();
        number.setNode_type("Number");
        if (ctx.NUMBER() != null) {
            number.setValue(Integer.parseInt(ctx.NUMBER().getText()));
            number.setNode_name(ctx.NUMBER().getText());

        }
        else if (ctx.NUMBERModeCall() != null) {
            number.setValue(Integer.parseInt(ctx.NUMBERModeCall().getText()));
            number.setNode_name(ctx.NUMBERModeCall().getText());
        }
        return number;
    }

    @Override
    public Stringg visitLabel_String(ReactParser.Label_StringContext ctx) {
        Stringg stringg = new Stringg();
        stringg.setNode_type("string");
        if (ctx.String() != null) {
            stringg.setString( ctx.String().getText());
            stringg.setNode_name(ctx.String().getText());

        }
        else if (ctx.StringModeCall() != null) {
            stringg.setString( ctx.StringModeCall().getText());
            stringg.setNode_name(ctx.StringModeCall().getText());
        }
        return stringg;
    }

    @Override
    public Id visitLabel_Id(ReactParser.Label_IdContext ctx) {
        return (Id) visitId(ctx.id());
    }

    @Override
    public Map visitLabel_Map(ReactParser.Label_MapContext ctx) {
        return (Map) visitMap(ctx.map());
    }

    @Override
    public Bool visitLabel_Bool(ReactParser.Label_BoolContext ctx) {
        Bool bool = new Bool();
        bool.setNode_type("Boolean");
        if (ctx.BooleanLiteral() != null) {
            bool.setBool(ctx.BooleanLiteral().getText());
            bool.setNode_name(ctx.BooleanLiteral().getText());

        }
        else if (ctx.BooleanLiteralModeCall() != null) {
            bool.setBool( ctx.BooleanLiteralModeCall().getText());
            bool.setNode_name(ctx.BooleanLiteralModeCall().getText());
        }
        return bool;
    }

    @Override
    public Array visitArray(ReactParser.ArrayContext ctx) {
        Array array = new Array();
        if(ctx.suquence()!= null){
            array.setSequence((Sequence)( visitSuquence(ctx.suquence())));
        }
        return array;
    }

    @Override
    public Map visitMap(ReactParser.MapContext ctx) {
        Map map = new Map();
        map.setNode_type("map");
        for(int i=0 ; i<ctx.mapElementList().size(); i++){
            map.getMapElementLists().add((MapElementList) ( visitMapElementList(ctx.mapElementList(i))));
        }
        return map;
    }

    @Override
    public MapElementList visitMapElementList(ReactParser.MapElementListContext ctx) {
        MapElementList mapElementList = new MapElementList();
        mapElementList.setNode_type("MapElementList");
        for(int i=0 ; i<ctx.mapElement().size(); i++){
            mapElementList.getMapElement().add((MapElement) ( visitMapElement(ctx.mapElement(i))));
        }
        return  mapElementList;
    }

    @Override
    public MapElement visitMapElement(ReactParser.MapElementContext ctx) {
        MapElement mapElement = new MapElement();
        mapElement.setNode_type("mapElement");
        if(ctx.IDENTIFIER() != null){
            mapElement.setIdentifier(ctx.IDENTIFIER().getText());
        }
        if(ctx.callfunction() != null){
            mapElement.setCallFunction((CallFunction) visitCallfunction(ctx.callfunction()));
        }
        else if(ctx.callIdentifier() != null){
            mapElement.setCallIdentifier((CallIdentifier) visitCallIdentifier(ctx.callIdentifier()));
        }
        else if( ctx.expression() != null){
            mapElement.setExpressions((Expression) visit (ctx.expression()));
        }
        return mapElement;
    }

    @Override
    public Sequence visitSuquence(ReactParser.SuquenceContext ctx) {
        Sequence sequence = new Sequence();
        sequence.setNode_type("Sequence");
        for(int i=0; i<ctx.data().size(); i++){
            sequence.getListData().add((Data)visit (ctx.data(i)));
        }
        return sequence;
    }

    @Override
    public Kind visitKind(ReactParser.KindContext ctx) {
        Kind kind = new Kind();
        kind.setNode_type("Kind");
        if (ctx.Const() != null) {
            kind.setType(ctx.Const().getText());
        }
        else if (ctx.Let() != null) {
            kind.setType(ctx.Let().getText());
        }
        else if (ctx.Var() != null) {
            kind.setType(ctx.Var().getText());
        }
        return kind;

    }

    @Override
    public Operation visitOperation(ReactParser.OperationContext ctx) {
        Operation operation = new Operation();
        operation.setNode_type("operation");
        if (ctx.LessThan() != null) {
            operation.setOperation(ctx.LessThan().getText());
        }
        else if (ctx.LessThanModeCall() != null) {
            operation.setOperation(ctx.LessThanModeCall().getText());
        }
        else if (ctx.MoreThan() != null) {
            operation.setOperation(ctx.MoreThan().getText());
        }
        else if (ctx.MoreThanModeCall() != null) {
            operation.setOperation(ctx.MoreThanModeCall().getText());
        }
        else if (ctx.Equals_() != null) {
            operation.setOperation(ctx.Equals_().getText());
        }
        else if (ctx.Equals_ModeCall() != null) {
            operation.setOperation(ctx.Equals_ModeCall().getText());
        }
        else if (ctx.GreaterThanEquals() != null) {
            operation.setOperation(ctx.GreaterThanEquals().getText());
        }
        else if (ctx.GreaterThanEqualsModeCall() != null) {
            operation.setOperation(ctx.GreaterThanEqualsModeCall().getText());
        }
        else if (ctx.LessThanEquals() != null) {
            operation.setOperation(ctx.LessThanEquals().getText());
        }
        else if (ctx.LessThanEqualsModeCall() != null) {
            operation.setOperation(ctx.LessThanEqualsModeCall().getText());
        }
        else if (ctx.NotEquals() != null) {
            operation.setOperation(ctx.NotEquals().getText());
        }
        else if (ctx.NotEqualsModeCall() != null) {
            operation.setOperation(ctx.NotEqualsModeCall().getText());
        }
        else if (ctx.IdentityEquals() != null) {
            operation.setOperation(ctx.IdentityEquals().getText());
        }
        else if (ctx.IdentityEqualsModeCall() != null) {
            operation.setOperation(ctx.IdentityEqualsModeCall().getText());
        }
        else if (ctx.IdentityNotEquals() != null) {
            operation.setOperation(ctx.IdentityNotEquals().getText());
        }
        else if (ctx.IdentityNotEqualsModeCall() != null) {
            operation.setOperation(ctx.IdentityNotEqualsModeCall().getText());
        }
        return operation;
    }

    @Override
    public Object visitId(ReactParser.IdContext ctx) {
        Id id = new Id();
        id.setNode_type("id");
        id.setNode_name(ctx.IDENTIFIER().getText());
        if (ctx.IDENTIFIER() != null) {
            id.setId(ctx.IDENTIFIER().getText());
        }
        else if (ctx.Id() != null) {
            id.setId(ctx.Id().getText());
        }
        return id;
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

//    @Override
//    public Object visit(ParseTree parseTree) {
//        return null;
//    }

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
