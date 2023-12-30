package com.company;

import antlr.ReactLexer;
import antlr.ReactParser;
import ast.Models.Node;
import ast.Models.Start;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.BaseVisitor;

import java.util.LinkedList;
import java.util.Queue;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        try {
            String source  = "src/test/test.txt";
            CharStream cs = fromFileName(source);
            ReactLexer lexer = new ReactLexer(cs);
            CommonTokenStream token =  new CommonTokenStream((TokenSource) lexer);
            ReactParser parser = new ReactParser(token);
            ParseTree tree = parser.start();
            Start  doc = (Start) new BaseVisitor().visit(tree);
            print (doc);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void print(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<> ();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();

            System.out.println(tempNode);

            for (Node child : tempNode.getChild()) {
                queue.add(child);
            }
        }
    }
}
