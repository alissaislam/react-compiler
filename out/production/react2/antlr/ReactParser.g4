parser grammar ReactParser;

options{tokenVocab=ReactLexer;}

statment :        variableDeclarationList
                | if
                | forElement
                | function
                | comments
                | while
                | do_while
                | callfunction ;

forElement :  FOR_ OpenParen forLoopParts CloseParen  OpenBrace   statment* CloseBrace     ;

variableDeclaration : type? IDENTIFIER ( Assign expression )? Semicolon?  ;
variableDeclarationList : variableDeclaration ( COMMA variableDeclaration )* ;

expression: expression (Multiply | Divide) expression
           |expression( Plus | Minus) expression
           | NUMBER
           | String
           | BooleanLiteral
           | IDENTIFIER
           ;

forLoopParts : type variableDeclaration SemiColon conditions SemiColon  variableDeclaration ;
data :
    array
    | NUMBER
    | String
    | IDENTIFIER
    ;
    array: OPEN_B suquence? CLOSE_B;
    suquence :   data(SemiColon data )* ;
    conditions : data operation  data
               | BooleanLiteral
               | IDENTIFIER
               ;

    if : If OpenParen  conditions CloseParen  OpenBrace? statment* CloseBrace? else_if* else? ;
    else_if : Else If OpenParen conditions CloseParen  OpenBrace  ? statment* CloseBrace    ? ;
    else :  Else OpenBrace  ? statment* CloseBrace    ? ;
    function :Function_? IDENTIFIER OpenParen arguments? CloseParen OpenBrace   statment* returnstatment* CloseBrace;
    argument : IDENTIFIER (Assign (expression|arrowFunction))?;
    arguments : argument(Comma argument)*;
    arrowFunction:OpenParen arguments CloseParen Assign MoreThan (expression? | OpenBrace statment* CloseBrace );
    returnstatment : Return expression? SemiColon;
    comments : SINGLE_LINE_COMMENT |STI_LINE_COMMENT;
    while : While  OpenParen conditions CloseParen OpenBrace statment* CloseBrace;
    do_while : Do OpenBrace statment* CloseBrace WHILE OpenParen conditions CloseParen SemiColon?;
    callfunction :IDENTIFIER ( Dot (IDENTIFIER |simpleCallfunction) )* OpenParen arguments? CloseParen SemiColon?;
    simpleCallfunction : IDENTIFIER OpenParen arguments? CloseParen ;

        type:   Const
               | Let
               | Var;

        operation : LessThan
                       | MoreThan
                       | Equals_
                       | GreaterThanEquals
                       | LessThanEquals
                       | NotEquals
                       | IdentityEquals
                       | IdentityNotEquals
                       ;
