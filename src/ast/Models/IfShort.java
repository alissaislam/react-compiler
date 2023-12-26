package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class IfShort extends Node{
    List<CallIdentifier> callIdentifierList = new ArrayList<> ();
    Operation operation;
    Expression expression;
    Statement statement;
    JsxElement jsxElement;

}
