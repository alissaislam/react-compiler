parser grammar ReactParser;

options{tokenVocab=ReactLexer;}
    start: statment*  EOF;
    statment :      statmentElement SemiColon* IgSemiColon *;
    statmentElement:  variableDeclarationList
                                        | if
                                        | forElement
                                        | function
                                        | comments
                                        | while
                                        | do_while
                                        | callfunction
                                        | switch
                                        | block
                                        | break
                                        | tryCatch
                                        | importt
                                        | ifShort
                                        | suquence
                                        | export
                                        ;
    if : If OpenParen  conditions CloseParen  ( block | statment ) else_if* else? ;
    forElement :  For OpenParen forLoopParts CloseParen ( block | statment );
    function :Function_? IDENTIFIER OpenParen arguments? CloseParen OpenBrace   (statment|returnstatment )* (Return jsxBlock)? CloseBrace;
    comments : SINGLE_LINE_COMMENT |MULTI_LINE_COMMENT;
    while : While  OpenParen conditions CloseParen ( block | statment ) ;
    do_while : Do ( block | statment )  While OpenParen conditions CloseParen;
    callfunction :(IDENTIFIER|Id) (  (Dot|DotModeCall) ((IDENTIFIER|Id) (OpenParen|OpenParenModeCall) (callIdentifier|arrowFunction)? (CloseParen|CloseParenModeCall)))* | (simpleCallfunction|(IDENTIFIER|Id) (OpenParen|OpenParenModeCall) (callIdentifier|arrowFunction)? (CloseParen|CloseParenModeCall)) ;
    switch: Switch OpenParen expression CloseParen OpenBrace  ( Case expression Colon ( block | (statment)*))* ( Default Colon (block | (statment )*))?  CloseBrace ;

    tryCatch: Try block (Catch OpenParen IDENTIFIER CloseParen block)* (Finally block)?;
    importt: Import ((OpenBrace IDENTIFIER (Comma IDENTIFIER)* CloseBrace| IDENTIFIER ))? From? String ;

    ifShort: callIdentifier (operation expression)? (QuestionMark|QuestionMarkModeCall) ((OpenParen|OpenParenModeCall) statment (CloseParen|CloseParenModeCall)|(OpenParen|OpenParenModeCall) jsxElement (CloseParen|CloseParenModeCall) | statment | jsxElement ) (Colon|ColonModeCall) ((OpenParen|OpenParenModeCall) statment (CloseParen|CloseParenModeCall)|(OpenParen|OpenParenModeCall) jsxElement (CloseParen|CloseParenModeCall) | statment | jsxElement );

    jsxElement:jsxElementNonSelfClosing|jsxElementSelfClosing;
    jsxElementNonSelfClosing: (JSX_TAG|JSX_TAGModeCall) (IDENTIFIERIn ( AssignIn (blockIn|StringIn))?)* MoreThanIn ( OpenBraceInIn ifShort CloseBraceCall |LETTERR| jsxElementIn |blockOfarguments)*? CLOSE_TAGIn  (MoreThan|MoreThanModeCall) ;
    jsxElementSelfClosing:(JSX_TAGIn|JSX_TAGInIn) (IDENTIFIERIn ( AssignIn (blockIn|StringIn))?)* Self_CLOSE_TAG;

    jsxElementIn:  ((JSX_TAGIn|JSX_TAGInIn) (IDENTIFIERIn ( AssignIn (blockIn|StringIn))?)* MoreThanIn (  OpenBraceInIn Id((Dot|DotModeCall) Id)*? CloseBraceCall  |jsxElementIn | LETTERR |blockOfarguments )*?  CLOSE_TAGIn  MoreThanInIn |jsxElementSelfClosing );
    blockIn:OpenBraceIn (jsxArguments )* CloseBraceIn;
    jsxArguments:jsxArgumentOrArrowOrCallfunction(CommaIn jsxArgumentOrArrowOrCallfunction)*;
    jsxArgumentOrArrowOrCallfunction:jsxArrowFunction | jsxCallfunction | jsxArgument | jsxCallIdentifier | jsxExpression ;
    jsxArrowFunction:(OpenParenIn jsxArguments? CloseParenIn | jsxArgument ) ARROWIn (jsxExpression? | OpenBraceIn jsxExpression* CloseBraceIn );
    jsxCallfunction :(IDENTIFIERIn ( DotIn IDENTIFIERIn | DotIn jsxSimpleCallfunction)+ | jsxSimpleCallfunction) ;
    jsxSimpleCallfunction : IDENTIFIERIn OpenParenIn jsxArguments? CloseParenIn ;
    jsxArgument : (IDENTIFIERIn (AssignIn (jsxExpression|jsxArrowFunction))?);
    jsxExpression:  OpenParenIn jsxExpression (MultiplyIn | DivideIn) jsxExpression CloseParenIn
                   | OpenParenIn jsxExpression( PlusIn | MinusIn) jsxExpression CloseParenIn
                   | jsxExpression (MultiplyIn | DivideIn) jsxExpression
                   | jsxExpression( PlusIn | MinusIn) jsxExpression
                   | NUMBERIn
                   | StringIn
                   | BooleanLiteralIn
                   | IDENTIFIERIn
                   ;
    jsxCallIdentifier: IDENTIFIERIn (DotIn IDENTIFIERIn)*;
    jsxBlock:(((OpenParen|OpenParenModeCall) (jsxElement) (CloseParen|CloseParenModeCall))|jsxElement) (SemiColon|SemiColonModeCall)* (IgSemiColon|IgSemiColonModeCall) *;





    block:OpenBrace (statment )* CloseBrace;

    else_if : Else If OpenParen conditions CloseParen  ( block | statment ) ;
    else :  Else ( block | statment) ;
    forLoopParts : type? variableDeclaration SemiColon conditions SemiColon  variableDeclaration ;
    conditions : data operation  data
                   | BooleanLiteral
                   | Not* IDENTIFIER
                   | jsxElementNonSelfClosing
                   ;
    arguments : argumentOrArrowOrCallfunction((Comma|CommaModeCall) argumentOrArrowOrCallfunction)*;

    blockOfarguments :OpenBrace arguments CloseBrace;
    variableDeclaration : type? (IDENTIFIER|array) (( Assign (expression | callfunction | callIdentifier | arrowFunction) )?|PlusPlus|MinusMinus )  ;
    variableDeclarationList : variableDeclaration ( Comma variableDeclaration )* ;

    arrowFunction:((OpenParen|OpenParenModeCall) arguments? (CloseParen|CloseParenModeCall) | (IDENTIFIER|Id) ) (ARROW|ARROWModeCall) (expression? | (OpenBrace|OpenBraceModeCall) statment* ((Return|ReturnModeCall) jsxBlock)? (CloseBrace|CloseBraceModeCall)|jsxElement | (Return|ReturnModeCall) jsxBlock );
    returnstatment : Return expression? ;
    simpleCallfunction : (IDENTIFIER|Id) (OpenParen|OpenParenModeCall) arguments? (CloseParen|CloseParenModeCall) ;
    simpleCallfunctionModeCall : (IDENTIFIER|Id) (OpenParen|OpenParenModeCall) (callIdentifier|arrowFunction)? (CloseParen|CloseParenModeCall) ;

    argument : (callIdentifier ((Assign|AssignModeCall) (expression|arrowFunction))?);
    argumentOrArrowOrCallfunction :  arrowFunction | callfunction | argument | callIdentifier | expression |NullLiteral|NullLiteralModeCall |blockOfarguments;
    callIdentifier: (IDENTIFIER|Id) ((Dot|DotModeCall) (IDENTIFIER|Id))*;
    expression:  (OpenParen|OpenParenModeCall) expression ((Multiply|MultiplyModeCall) | (Divide|DivideModeCall)) expression (CloseParen|CloseParenModeCall) #multiplyexpression
               | (OpenParen|OpenParenModeCall) expression( (Plus|PlusModeCall) | (Minus|MinusModeCall)) expression (CloseParen|CloseParenModeCall) #divideexpression
               | expression ((Multiply|MultiplyModeCall) | (Divide|DivideModeCall)) expression #multiplyexpression
               | expression( (Plus|PlusModeCall) | (Minus|MinusModeCall)) expression #divideexpression
               | data #dataExpression
               ;
               export:Export Default callIdentifier SemiColon* IgSemiColon *;

    data :
          array
        | (NUMBER|NUMBERModeCall)
        | (String|StringModeCall)
        | (IDENTIFIER|Id)
        | map
        |(BooleanLiteral|BooleanLiteralModeCall)
        ;
    map :OpenBrace (mapElementList)* CloseBrace;
    mapElementList: mapElement (Comma mapElement)*;
    mapElement:IDENTIFIER Colon ( callfunction | callIdentifier | expression );


    array : OpenBracket suquence? CloseBracket;
    suquence : data(Comma data )* ;
    type:    Const
           | Let
           | Var;
    operation :
                     LessThan
                   | LessThanModeCall
                   | MoreThan
                   | MoreThanModeCall
                   | (Equals_|Equals_ModeCall)
                   | GreaterThanEquals
                   | GreaterThanEqualsModeCall
                   | LessThanEqualsModeCall
                   | LessThanEquals
                   | NotEquals
                   | NotEqualsModeCall
                   | IdentityEquals
                   | IdentityEqualsModeCall
                   | IdentityNotEquals
                   | IdentityNotEqualsModeCall
                   ;
    break:Break;
