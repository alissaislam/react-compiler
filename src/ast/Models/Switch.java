package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Switch extends Node{
    List<Expressions> expressions = new ArrayList<>();
    List<Block> blocks = new ArrayList<>();
    List<Statement> statements = new ArrayList<>();

    public List<Expressions> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expressions> expressions) {
        this.expressions = expressions;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
}
