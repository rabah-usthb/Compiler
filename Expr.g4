grammar Expr;

@header {
  import java.util.HashMap;
  import java.util.Map;
}



//Fragements
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
fragment ALPHANUMERICAL: LETTER | DIGIT;
fragment INLINECOMMENT: '<!-' ~[\n]* '-!>'; 
fragment MULTILINECOMMENT: '{--' .*? '--}';


//Tokens
INPUT: 'input'; 
OUTPUT: 'output' ;
TYPE: 'Int' | 'Float'| 'Bool' | 'String' | 'Char' ;
MAIN: 'MainPrgm' ;
VAR: 'Var' ;
BEGIN: 'BeginPg' ;
END: 'EndPg' ;
IF: 'if' ;
ELSE: 'else' ;
ELSIF: 'elsif' ;
THEN: 'then' ;
SWITCH: 'switch' ;
CASE: 'case' ;
BREAK: 'break' ;
DEFAULT: 'default' ;
WHILE: 'while' ;
DO: 'do' ;
FOR: 'for' ;
FROM: 'from' ;
TO: 'to' ;
STEP: 'step' ;
AND: 'AND' ;
OR: 'OR' ;
LET: 'let' ;
DEFINE: '@define';
CONST: 'Const';

IDF: LETTER+ (ALPHANUMERICAL+('_'ALPHANUMERICAL+)*)*;

INT: DIGIT+; 
FLOAT: DIGIT+'.'DIGIT+ | '.'DIGIT+ | DIGIT+'.' ;
STRING: '"'~["\n]*'"';
CHAR: '\''~['\n]?'\'';

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
varBlock: VAR declaration+  | VAR ;
declaration:  normalDeclaration  |  arrayDeclaration | COMMENT;
listIDF: IDF(','IDF)*;
normalDeclaration:  declarationKeyword listIDF ':' TYPE '=' affectValue ';' | declarationKeyword listIDF ':' TYPE ';'; 
sign  : '+' | '-';
affectValue returns [String type] :   number {$type = $number.type;} | STRING {$type = "STRING";} | CHAR {$type = "CHAR";} ; 
number returns [String type] : '(' sign INT ')'{ $type = "INT"; } | '(' sign FLOAT ')' { $type = "FLOAT"; } | INT { $type = "INT"; }  | FLOAT { $type = "FLOAT"; }  ;
arrayDeclaration: declarationKeyword listIDF ':' '[' TYPE ';' INT ']' affectArray ';' | declarationKeyword listIDF ':' '[' TYPE ';' INT ']' ';' ;
affectArray:  '=' '{' listNumber '}';
declarationKeyword : DEFINE CONST | LET;
listNumber : number (',' number)*;
mainCode: BEGIN  COMMENT* '{' inst+ '}' COMMENT* END ';' | BEGIN  COMMENT* '{' '}' COMMENT* END ';';
inst: output | input | affectInst |COMMENT | forInst | doWhileInst |whileInst | ifInst | switchInst;
input: INPUT '('  listIDF ')' ';';
output: OUTPUT '(' content ')' ';' ;
content: ((STRING|IDF) ',')+ (STRING|IDF) |(STRING|IDF);
affectInst: var AFFECT arithmeticExpression ';';
arithmeticExpression: arithmeticExpression operation arithmeticExpression  | '(' arithmeticExpression ')' | operator;
operator: number | var;
var: IDF| IDF '[' INT ']';
operation: '+' | '-' | '*' | '/';
forInst: FOR IDF(operation arithmeticExpression)? FROM arithmeticExpression TO arithmeticExpression STEP arithmeticExpression '{' inst+ '}';
doWhileInst: DO '{' inst+ '}' WHILE '(' condition ')' ';';
whileInst:  WHILE '(' condition ')' DO '{' inst+ '}';
ifInst: IF '(' condition ')' THEN '{' inst+ '}' elseIfInst? elseInst?;
elseIfInst: COMMENT* ELSIF '(' condition ')' THEN '{' inst+ '}' elseIfInst | COMMENT* ELSIF '(' condition ')' THEN '{' inst+ '}' ;
elseInst: COMMENT* ELSE '{' inst+ '}' ;
switchInst: SWITCH '(' IDF ')' '{' caseInst '}';
caseInst: CASE number ':' inst+ BREAK ';' defaultInst | CASE number ':' inst+ BREAK ';' caseInst;
defaultInst: DEFAULT ':' inst+ BREAK ';' ;
condition: '(' condition ')' | '!' '(' condition ')' | condition logicalOperator condition | partCondition;
partCondition: IDF comparaisonOperator arithmeticExpression;
comparaisonOperator: EQ|NEQ|GREATER|LESSER|GEQ|LEQ;
logicalOperator: AND | OR | NOT; 
