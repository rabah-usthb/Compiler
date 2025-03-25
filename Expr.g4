grammar Expr;

@header {
  import java.util.HashMap;
  import java.util.Map;
}



//Fragements
fragment SIGN: '-' | '+';
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
fragment ALPHANUMERICAL: LETTER | DIGIT;
fragment INLINECOMMENT: '<!-' ~[\n]* '-!>'; 
fragment MULTILINECOMMENT: '{--' .*? '--}';
fragment INTEGER: DIGIT+;
fragment FLOATED: DIGIT+'.'DIGIT+ | '.'DIGIT+ | DIGIT+'.';

//Tokens
BOOLEANVALUE: 'True'   {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Boolean Value");} | 'False'    {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Boolean Value");}; 
INPUT: 'input'   {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Read Function");}; 
OUTPUT: 'output' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Print Function");};
TYPE: 'Int'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");}| 
      'Float'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");}|
       'Bool' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");} | 
       'String'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");} | 
       'Char'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");};
MAIN: 'MainPrgm'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainProgram Header");};
VAR: 'Var'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Variable Block Delimiter");};
BEGIN: 'BeginPg'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainCode Delimiter");};
END: 'EndPg' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainCode Delimiter");};
IF: 'if' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"If Keyword");};
ELSE: 'else' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Else Keyword");};
ELSIF: 'elsif'{Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Else If Keyword");};
THEN: 'then' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Then Keyword");};
SWITCH: 'switch'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Switch Keyword");};
CASE: 'case'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Case Delimiter");};
BREAK: 'break' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Case Delimiter");};
DEFAULT: 'default' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Default Case Delimiter");};
WHILE: 'while' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");};
DO: 'do' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");};
FOR: 'for' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");};
FROM: 'from' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"From Keyword");};
TO: 'to' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"To Keyword");};
STEP: 'step' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Step Keyword");};
AND: 'AND' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Logical AND");};
OR: 'OR' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Logical OR");};
LET: 'let'  {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Variable Declarator");};
DEFINE: '@define' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Constant Declarator");};
CONST: 'Const' {Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Constant Declarator");};

IDF: LETTER+ (ALPHANUMERICAL+('_'ALPHANUMERICAL+)*)*;

INT: INTEGER  {Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());}|
    '('SIGN INTEGER')' {Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());}; 
FLOAT: FLOATED  {Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());} |
       '('SIGN FLOAT')' {Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());};
STRING: '"'~["\n]*'"' {Constant_Hashtable.ConstantTable.insertTable(getText(),"string",getLine(),getCharPositionInLine());};
CHAR: '\''~['\n]*'\'' {Constant_Hashtable.ConstantTable.insertTable(getText(),"char",getLine(),getCharPositionInLine());};

AFFECT: ':=';
NOT: '!';
GREATER: '>';
LESSER: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';
LBRACE: '{';
RBRACE: '}';
PLUS: '+';
SUB: '-';
MUL: '*';
DIV: '/';
COM: ',';
SEMI: ';';
LBRACKET: '[';
RBRACKET: ']';
LPAR: '(';
RPAR: ')';
ASSIGN: '=';
TWOPOINT: ':';

COMMENT: MULTILINECOMMENT|INLINECOMMENT;
WS : [ \t\r\n]+ -> skip;
ERROR_TOKEN: .;


//Production Rules
prog:	  COMMENT* MAIN IDF ';' COMMENT*  varBlock COMMENT*  mainCode  COMMENT* EOF;
varBlock: VAR declaration+ | VAR;
declaration:  normalDeclaration  | arrayDeclaration | COMMENT;
listIDF: IDF(','IDF)*;
normalDeclaration:  declarationKeyword listIDF ':' TYPE '=' value ';' | declarationKeyword listIDF ':' TYPE ';'; 
affectValue returns [String type] :   number {$type = $number.type;} | STRING {$type = "STRING";} | CHAR {$type = "CHAR";} ; 
number returns [String type] : INT { $type = "INT"; } |  FLOAT  { $type = "FLOAT"; }   ;
arrayDeclaration: declarationKeyword listIDF ':' '[' TYPE ';' INT ']' affectArray ';' | declarationKeyword listIDF ':' '[' TYPE ';' INT ']' ';' ;
affectArray:  '=' '{' listValue* '}';
declarationKeyword : DEFINE CONST | LET;
listValue : value (',' value)*;
value: number| BOOLEANVALUE | CHAR | STRING | var | condition | arithmeticExpression | concatInst;
mainCode: BEGIN  COMMENT* '{' inst+ '}' COMMENT* END ';'| BEGIN  COMMENT* '{' '}' COMMENT* END ';';
inst: output | input | affectInst |COMMENT| doWhileInst |whileInst | ifInst | switchInst;
input:  INPUT '('  listIDF ')' ';';
output: OUTPUT '(' content ')' ';';
content: ((STRING|IDF) ',')+ (STRING|IDF) |(STRING|IDF);
affectInst: var AFFECT arithmeticExpression ';'| var AFFECT concatInst ';' | var AFFECT '{' listValue* '}' ';' | var AFFECT condition ';';
concatInst: STRING (PLUS STRING)+  | CHAR (PLUS CHAR)+;
arithmeticExpression: arithmeticExpression (MUL | DIV) arithmeticExpression  | arithmeticExpression (PLUS| SUB) arithmeticExpression |  operator |'(' arithmeticExpression ')' ;
operator: number | var; 
var: IDF| IDF '[' INT ']';
forInst: FOR IDF((MUL | DIV) arithmeticExpression  | (PLUS| SUB) arithmeticExpression)? FROM arithmeticExpression TO arithmeticExpression STEP arithmeticExpression '{' inst+ '}';
doWhileInst: DO '{' inst+ '}' WHILE '(' condition ')' ';';
whileInst:  WHILE '(' condition ')' DO '{' inst+ '}';
ifInst: IF LPAR condition RPAR THEN '{' inst+ '}' elseIfInst? elseInst?;
elseIfInst: COMMENT* ELSIF '(' condition ')' THEN '{' inst+ '}' elseIfInst | COMMENT* ELSIF '(' condition ')' THEN '{' inst+ '}' ;
elseInst: COMMENT* ELSE '{' inst+ '}' ;
switchInst: SWITCH '(' IDF ')' '{' caseInst '}';
caseInst: CASE number ':' inst+ BREAK ';' defaultInst | CASE number ':' inst+ BREAK ';' caseInst;
defaultInst: DEFAULT ':' inst+ BREAK ';';
condition:   LPAR condition RPAR| NOT condition | condition AND condition| condition OR condition| partCondition| IDF | BOOLEANVALUE ;
partCondition: var comparaisonOperator arithmeticExpression;
comparaisonOperator: EQ|NEQ|GREATER|LESSER|GEQ|LEQ;
