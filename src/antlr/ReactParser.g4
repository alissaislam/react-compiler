parser grammar ReactParser;

options{tokenVocab=ReactLexer;}
///////////////////// ahmad part
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
                                        | jsxElement
                                        | expression
                                        ;
    if : If OpenParen  conditions CloseParen  ( block | statment ) else_if* else? ;
    forElement :  For OpenParen forLoopParts CloseParen ( block | statment );
    function :Function_? IDENTIFIER OpenParen arguments? CloseParen OpenBrace   (statment|returnstatment )*  CloseBrace;
    comments : SINGLE_LINE_COMMENT |MULTI_LINE_COMMENT;
    while : While  OpenParen conditions CloseParen ( block | statment ) ;
    do_while : Do ( block | statment )  While OpenParen conditions CloseParen;
    callfunction :
               (
               (
                simpleCallfunction
               |callIdentifier
               )
               (
               (Dot|DotModeCall)(simpleCallfunction|callIdentifier)
               )*?
               ) simpleCallfunction?;
    switch: Switch OpenParen expression CloseParen OpenBrace  ( Case expression Colon ( block | (statment)*))* ( Default Colon (block | (statment )*))?  CloseBrace ;

    tryCatch: Try block (Catch OpenParen IDENTIFIER CloseParen block)* (Finally block)?;
    importt: Import ((OpenBrace IDENTIFIER (Comma IDENTIFIER)* CloseBrace| IDENTIFIER ))? From? String ;

    ifShort: callIdentifier (operation expression)? (QuestionMark|QuestionMarkModeCall) (openParen statment closeParen|openParen jsxElement closeParen | statment | jsxElement ) (Colon|ColonModeCall) (openParen statment closeParen|openParen jsxElement closeParen | statment | jsxElement );

    jsxElement:jsxElementNonSelfClosing|jsxElementSelfClosing;
    jsxElementNonSelfClosing: (JSX_TAG|JSX_TAGModeCall) (IDENTIFIERIn ( AssignIn (blockIn|StringIn))?)* MoreThanIn ( OpenBraceInIn ifShort CloseBraceCall |LETTERR| jsxElementIn |blockOfarguments)*? CLOSE_TAGIn  (MoreThan|MoreThanModeCall) ;
    jsxElementSelfClosing:jsx_tag (IDENTIFIERIn ( AssignIn (blockIn|StringIn))?)* Self_CLOSE_TAG;

    jsxElementIn:  ((JSX_TAGIn|JSX_TAGInIn) (IDENTIFIERIn ( AssignIn (blockIn|StringIn))?)* MoreThanIn (  OpenBraceInIn Id((Dot|DotModeCall) Id)*? CloseBraceCall  |jsxElementIn | LETTERR |blockOfarguments )*?  CLOSE_TAGIn  MoreThanInIn |jsxElementSelfClosing );
    blockIn:OpenBraceIn (jsxArguments )* CloseBraceIn;
    jsxArguments:jsxParameters(CommaIn jsxParameters)*;
    jsxParameters:jsxArrowFunction | jsxCallfunction | jsxArgument | jsxCallIdentifier | jsxExpression ;
    ////// islam part
    jsxArrowFunction:(OpenParenIn jsxArguments? CloseParenIn | jsxArgument ) ARROWIn (jsxExpression? | OpenBraceIn jsxExpression* CloseBraceIn );
    jsxCallfunction :(IDENTIFIERIn ( DotIn IDENTIFIERIn | DotIn jsxSimpleCallfunction)+ | jsxSimpleCallfunction) ;
    jsxSimpleCallfunction : IDENTIFIERIn OpenParenIn jsxArguments? CloseParenIn ;
    jsxArgument : (IDENTIFIERIn (AssignIn (jsxExpression|jsxArrowFunction))?);
    jsxExpression:   OpenParenIn jsxExpression (MultiplyIn | DivideIn) jsxExpression CloseParenIn
                   | OpenParenIn jsxExpression( PlusIn | MinusIn) jsxExpression CloseParenIn
                   | jsxExpression (MultiplyIn | DivideIn) jsxExpression
                   | jsxExpression( PlusIn | MinusIn) jsxExpression
                   | NUMBERIn
                   | StringIn
                   | BooleanLiteralIn
                   | IDENTIFIERIn
                   ;
    jsxCallIdentifier: IDENTIFIERIn (DotIn IDENTIFIERIn)*;
    jsxBlock:((openParen (jsxElement) closeParen)|jsxElement) (SemiColon|SemiColonModeCall)* (IgSemiColon|IgSemiColonModeCall) *;





    block:OpenBrace (statment )* CloseBrace;

    else_if : Else If OpenParen conditions CloseParen  ( block | statment ) ;
    else :  Else ( block | statment) ;
    forLoopParts : (kind? variableDeclaration SemiColon conditions SemiColon  variableDeclaration | IDENTIFIER IDENTIFIER Colon callIdentifier ) ;
    conditions : data operation  data #comparison
                   | BooleanLiteral #boolean
                   | Not* IDENTIFIER #conditionsWithId
                 //  | jsxElementNonSelfClosing
                   ;
    arguments : parameters((Comma|CommaModeCall) parameters)*;

    blockOfarguments :OpenBrace arguments CloseBrace;
    variableDeclaration : kind? (IDENTIFIER|array) (( Assign (expression | callfunction | callIdentifier | arrowFunction) )? )  ;
    variableDeclarationList : variableDeclaration ( Comma variableDeclaration )* ;

    arrowFunction:(openParen arguments? closeParen | id )(ARROW|ARROWModeCall)
                  (
                  expression?
                  | openBrace statment* returnstatment? closeBrace
                  | jsxElement
                  | returnstatment
                  )
                  ;
    returnstatment : Return (expression|jsxBlock)? ;
    simpleCallfunction : id openParen arguments? closeParen ;
    //simpleCallfunctionModeCall : id openParen (callIdentifier|arrowFunction)? closeParen ;

    argument : (callIdentifier (assign (expression|arrowFunction))?);
    ////////////////rana part
    parameters :
                 arrowFunction  #vArrowFunction
               | callIdentifier  #vCallIdentifier
               | argument #vArgument
               | callfunction #vCallfunction
               | expression #vExpression
               | NullLiteral #vNullLiteral
               | NullLiteralModeCall #vNullLiteral
               | blockOfarguments  #vBlockOfarguments
               ;


    callIdentifier: id ((Dot|DotModeCall) id)*;
    expression:  openParen expression ((Multiply|MultiplyModeCall) | (Divide|DivideModeCall)) expression closeParen #normalExpression
               | openParen expression( (Plus|PlusModeCall) | (Minus|MinusModeCall)) expression closeParen #normalExpression
               | expression ((Multiply|MultiplyModeCall) | (Divide|DivideModeCall)) expression #normalExpression
               | expression( (Plus|PlusModeCall) | (Minus|MinusModeCall)) expression #normalExpression
               | callIdentifier (PlusPlus|MinusMinus) #shortExpression
               | data #dataExpression
               ;
               export:Export Default callIdentifier SemiColon* IgSemiColon *;

    data :
          array #vArray
        | (NUMBER|NUMBERModeCall) #vNumber
        | (String|StringModeCall) #vString
        | id # vId
        | map #vMap
        |(BooleanLiteral|BooleanLiteralModeCall) #vBool
        ;

         array : OpenBracket suquence? CloseBracket  ;
    map :OpenBrace (mapElementList)* CloseBrace ;
    mapElementList: mapElement (Comma mapElement)*;
    mapElement:IDENTIFIER Colon ( callfunction | callIdentifier | expression );



    suquence : data(Comma data )* ;
    kind:    Const
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
                   
                   id:IDENTIFIER|Id;
                   openParen:OpenParen|OpenParenModeCall;
                   closeParen:CloseParen|CloseParenModeCall;
                   assign:Assign|AssignModeCall;
                   closeBrace:CloseBrace|CloseBraceModeCall;
                   openBrace:OpenBrace|OpenBraceModeCall;
                   jsx_tag:JSX_TAGIn|JSX_TAGInIn|JSX_TAG;
                   
    break:Break;
