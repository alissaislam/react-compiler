package ast.Models;

public class StateElement extends Node{
    If ifElement = new If();
    For forelement = new For();
    Function functionElement = new Function();
    Comment comment = new Comment();
    While whileElement = new While();
    DoWhile doWhileElement = new DoWhile();
    CallFunction callFunction = new CallFunction();
    Switch switchElement = new Switch();
    Block block = new Block();
    Break breakElement = new Break();
    TryCatch tryCatch = new TryCatch();
    Import importElement = new Import();
    IfShort ifShort = new IfShort();
    Sequence sequence = new Sequence();
    Export exportElement = new Export();
    JsxElement jsxElement = new JsxElement();
//    Expression expression = new Expression();

    public If getIfElement() {
        return ifElement;
    }

    public void setIfElement(If ifElement) {
        this.ifElement = ifElement;
    }

    public For getForelement() {
        return forelement;
    }

    public void setForelement(For forelement) {
        this.forelement = forelement;
    }

    public Function getFunctionElement() {
        return functionElement;
    }

    public void setFunctionElement(Function functionElement) {
        this.functionElement = functionElement;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public While getWhileElement() {
        return whileElement;
    }

    public void setWhileElement(While whileElement) {
        this.whileElement = whileElement;
    }

    public DoWhile getDoWhileElement() {
        return doWhileElement;
    }

    public void setDoWhileElement(DoWhile doWhileElement) {
        this.doWhileElement = doWhileElement;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public Switch getSwitchElement() {
        return switchElement;
    }

    public void setSwitchElement(Switch switchElement) {
        this.switchElement = switchElement;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Break getBreakElement() {
        return breakElement;
    }

    public void setBreakElement(Break breakElement) {
        this.breakElement = breakElement;
    }

    public TryCatch getTryCatch() {
        return tryCatch;
    }

    public void setTryCatch(TryCatch tryCatch) {
        this.tryCatch = tryCatch;
    }

    public Import getImportElement() {
        return importElement;
    }

    public void setImportElement(Import importElement) {
        this.importElement = importElement;
    }

    public IfShort getIfShort() {
        return ifShort;
    }

    public void setIfShort(IfShort ifShort) {
        this.ifShort = ifShort;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public Export getExportElement() {
        return exportElement;
    }

    public void setExportElement(Export exportElement) {
        this.exportElement = exportElement;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

//    public Expression getExpression() {
//        return expression;
//    }
//
//    public void setExpression(Expression expression) {
//        this.expression = expression;
//    }
}
