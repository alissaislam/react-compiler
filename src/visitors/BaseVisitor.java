package visitors;

import ast.Models.*;
import ast.Models.Number;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import antlr.ReactParser;
import antlr.ReactParserVisitor;



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
    public ArrowFunction visitLabel_ArrowFunction(ReactParser.Label_ArrowFunctionContext ctx) {
        ArrowFunction arrowFunction = new ArrowFunction();
        arrowFunction.setNode_type("label_arrowFunction");
        visitArrowFunction(ctx.arrowFunction());
        return arrowFunction;
    }

    @Override
    public CallIdentifier visitLabel_CallIdentifier(ReactParser.Label_CallIdentifierContext ctx) {
        return (visitCallIdentifier(ctx.callIdentifier()));
    }

    @Override
    public Argument visitLable_Argument(ReactParser.Lable_ArgumentContext ctx) { ArrowFunction arrowFunction = new ArrowFunction();
        return ((Argument)visitArgument(ctx.argument()));

    }

    @Override
    public CallFunction visitLabel_Callfunction(ReactParser.Label_CallfunctionContext ctx) {
        return ((CallFunction)visitCallfunction(ctx.callfunction()));
    }

    @Override
    public Expressions visitLabel_Expression(ReactParser.Label_ExpressionContext ctx) {
        return ((Expressions)visit(ctx.expression()));

    }

    @Override
    public NullLiteral visitLabel_NullLiteral(ReactParser.Label_NullLiteralContext ctx) {
        NullLiteral nullLiteral =new NullLiteral();
        nullLiteral.setNode_type("NullLiteral");
        if (ctx.NullLiteral() != null) {
            nullLiteral.setN(ctx.NullLiteral().getText());
        }
        if (ctx.NullLiteralModeCall() != null) {
            nullLiteral.setN(ctx.NullLiteralModeCall().getText());
        }
        return nullLiteral;
        }



    @Override
    public BlockOfarguments visitLabel_BlockOfarguments(ReactParser.Label_BlockOfargumentsContext ctx) {
        return ((BlockOfarguments)visitBlockOfarguments(ctx.blockOfarguments()));    }

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
    public Label_shortExpressions visitShortExpression(ReactParser.ShortExpressionContext ctx) {
        Label_shortExpressions label_shortExpressions =new Label_shortExpressions();
        label_shortExpressions.setNode_type("label_shortExpressions");
        label_shortExpressions.setCallIdentifier((CallIdentifier)( visitCallIdentifier (ctx.callIdentifier())));
        if(ctx.PlusPlus() !=null){
            label_shortExpressions.setOperation(ctx.PlusPlus().getText());
        }
        else if(ctx.MinusMinus() !=null){
            label_shortExpressions.setOperation(ctx.MinusMinus().getText());
        }
        return label_shortExpressions;
    }

    @Override
    public Data visitLabel_dataExpression(ReactParser.Label_dataExpressionContext ctx) {
        Data data = new Data();
        data.setNode_type("Label_dataExpression");
            return ((Data) visit (ctx.data()));
    }

    @Override
    public Label_normalExpressions visitLabel_normalExpression(ReactParser.Label_normalExpressionContext ctx) {
        Label_normalExpressions label_normalExpressions =new Label_normalExpressions();
        label_normalExpressions.setNode_type("Label_normalExpressions");
         for(int i=0 ; i<ctx.expression().size(); i++){
                label_normalExpressions.getExpressions().add((Expressions) visit (ctx.expression(i)));
            }
            if(ctx.Multiply() !=null){
                label_normalExpressions.setOperation(ctx.Multiply().getText());
            }
           else if(ctx.MinusModeCall() !=null){
            label_normalExpressions.setOperation(ctx.MinusModeCall().getText());
        }
        return label_normalExpressions;
    }

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
            mapElement.setExpressions((Expressions) visit (ctx.expression()));
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
