package visitors;

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
        StRow stRow = new StRow();
        stRow.setType(start.getNode_type());
        stRow.setValue(start.getNode_name());
        return start;
    }

    @Override
    public Statement visitStatment(ReactParser.StatmentContext ctx) {
        Statement statement = new Statement();
        statement.setNode_type("Statement");
        statement.setNode_name("");
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
        BlockIn blockIn = new BlockIn();
        blockIn.setNode_type("Blockin");
        for (int i =0;i<ctx.jsxArguments().size();i++)
            blockIn.getJsxArgumentsList().add((JsxArguments) visitJsxArguments(ctx.jsxArguments(i)));
        return blockIn;

    }

    @Override
    public Object visitJsxArguments(ReactParser.JsxArgumentsContext ctx) {
        JsxArguments jsxArguments = new JsxArguments();;
        jsxArguments.setNode_type("Jsxarguments");
        for (int i =0;i<ctx.jsxParameters().size();i++)
            jsxArguments.getJsxParametersList().add((JsxParameters) visit(ctx.jsxParameters(i)));
        return jsxArguments;
    }

    @Override
    public Object visitJsxArrFunction(ReactParser.JsxArrFunctionContext ctx) {
        if(ctx.jsxArrowFunction()!=null)
            return ((JsxArrowFunction) visitJsxArrowFunction(ctx.jsxArrowFunction()));
        else
            return null;
    }

    @Override
    public Object visitJsxCallFunction(ReactParser.JsxCallFunctionContext ctx) {
        if(ctx.jsxCallfunction()!=null)
            return ((JsxCallfunction) visitJsxCallfunction(ctx.jsxCallfunction()));
        else
            return null;
    }

    @Override
    public Object visitJsxArg(ReactParser.JsxArgContext ctx) {
        if(ctx.jsxArgument()!=null)
            return ((JsxArgument) visitJsxArgument(ctx.jsxArgument()));
        else
            return null;
    }

    @Override
    public Object visitJsxCallId(ReactParser.JsxCallIdContext ctx) {
        if(ctx.jsxCallIdentifier()!=null)
            return ((JsxCallIdentifier) visitJsxCallIdentifier(ctx.jsxCallIdentifier()));
        else
            return null;
    }

    @Override
    public Object visitJsxExp(ReactParser.JsxExpContext ctx) {
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
