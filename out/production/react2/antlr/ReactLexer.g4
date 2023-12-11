lexer grammar ReactLexer;

DoubleQuote :'"';
SingleQuote :'\'';
Semicolon : ';';

//Identifier: [a-zA-Z_][a-zA-Z0-9_]*;


Break      : 'break';
Do         : 'do';
Instanceof : 'instanceof';
Typeof     : 'typeof';
Case       : 'case';
Else       : 'else';
New        : 'new';
Var        : 'var';
Catch      : 'catch';
Finally    : 'finally';
Return     : 'return';
Void       : 'void';
Continue   : 'continue';
For        : 'for';
Switch     : 'switch';
While      : 'while';
Debugger   : 'debugger';
Function_  : 'function';
This       : 'this';
With       : 'with';
Default    : 'default';
If         : 'if';
Throw      : 'throw';
Delete     : 'delete';
In         : 'in';
Try        : 'try';
As         : 'as';
From       : 'from';

/// Future Reserved Words

Class   : 'class';
Enum    : 'enum';
Extends : 'extends';
Super   : 'super';
Const   : 'const';
Export  : 'export';
Import  : 'import';

Async : 'async';
Await : 'await';

OpenBracket                : '[';
CloseBracket               : ']';
OpenParen                  : '(';
CloseParen                 : ')';
OpenBrace                  : '{';
CloseBrace                 : '}';
SemiColon                  : ';';
Comma                      : ',';
Assign                     : '=';
QuestionMark               : '?';
Colon                      : ':';
Ellipsis                   : '...';
Dot                        : '.';
PlusPlus                   : '++';
MinusMinus                 : '--';
Plus                       : '+';
Minus                      : '-';
BitNot                     : '~';
Not                        : '!';
Multiply                   : '*';
Divide                     : '/';
Modulus                    : '%';
Power                      : '**';
NullCoalesce               : '??';
Hashtag                    : '#';
RightShiftArithmetic       : '>>';
LeftShiftArithmetic        : '<<';
RightShiftLogical          : '>>>';
LessThan                   : '<';
MoreThan                   : '>';
LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals_                    : '==';
NotEquals                  : '!=';
IdentityEquals             : '===';
IdentityNotEquals          : '!==';
BitAnd                     : '&';
BitXOr                     : '^';
BitOr                      : '|';
And                        : '&&';
Or                         : '||';
MultiplyAssign             : '*=';
DivideAssign               : '/=';
ModulusAssign              : '%=';
PlusAssign                 : '+=';
MinusAssign                : '-=';
LeftShiftArithmeticAssign  : '<<=';
RightShiftArithmeticAssign : '>>=';
RightShiftLogicalAssign    : '>>>=';
BitAndAssign               : '&=';
BitXorAssign               : '^=';
BitOrAssign                : '|=';
PowerAssign                : '**=';
ARROW                      : '=>';

/// Null Literals

NullLiteral: 'null';

/// Boolean Literals

BooleanLiteral: 'true' | 'false';

/// The following tokens are also considered to be FutureReservedWords
/// when parsing strict mode

Implements   : 'implements';
Let    : 'let'       ;
Private      : 'private'   ;
Public       : 'public'    ;
Interface    : 'interface' ;
Package      : 'package'   ;
Protected    : 'protected' ;
Static       : 'static'    ;
Yield        : 'yield'     ;

//ws
WS: [\t]+ ->channel(HIDDEN);
NEWLINE: [\n\r' ']+ ->skip;

//comment
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT : '/*'. *? '*/'  -> skip ;

NUMBER : DIGIT+ ( '.' DIGIT+ )?;
//string
String : StringDQ | StringSQ ;
StringDQ : '"' StringContentDQ*? '"' ;


//Id
IDENTIFIER : IDENTIFIER_START IDENTIFIER_PART* ;

fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment DIGIT : '0' .. '9' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}';
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}'  ;
fragment IDENTIFIER_NO_DOLLAR : (LETTER | '_') IDENTIFIER_PART_NO_DOLLAR* ;
fragment IDENTIFIER_PART_NO_DOLLAR : LETTER | '_' | DIGIT ;
fragment IDENTIFIER_START : LETTER | '_' | '$' ;
fragment IDENTIFIER_PART : IDENTIFIER_START | DIGIT ;
fragment LETTER : 'a' .. 'z' | 'A' .. 'Z' ;