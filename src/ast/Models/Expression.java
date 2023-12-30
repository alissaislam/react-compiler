package ast.Models;

import java.util.ArrayList;
import java.util.List;

public  class Expression  extends Parameters{
  List<Expression> expressionList = new ArrayList<>();
  String operator;
  CallIdentifier callIdentifier;
  Data data;

 public List<Expression> getExpressionList() {
  return expressionList;
 }

 public void setExpressionList(List<Expression> expressionList) {
  this.expressionList = expressionList;
 }

 public String getOperator() {
  return operator;
 }

 public void setOperator(String operator) {
  this.operator = operator;
 }

 @Override
 public CallIdentifier getCallIdentifier() {
  return callIdentifier;
 }

 @Override
 public void setCallIdentifier(CallIdentifier callIdentifier) {
  this.callIdentifier = callIdentifier;
 }

 public Data getData() {
  return data;
 }

 public void setData(Data data) {
  this.data = data;
 }
}
