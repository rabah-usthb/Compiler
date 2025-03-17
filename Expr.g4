grammar Expr;

@header {
  import java.util.HashMap;
  import java.util.Map;
}


@lexer::members{
 
public void printToken(String token , String type, int line , int column) {
    System.out.println("Matched "+type+": "+token+" at line " + line + ", column " + column);
 }

  public void validateIntToken(String token , int min ,int max, int line , int column){
  
    int value = Integer.parseInt(token);
    if(value<min || value >max) {
    System.err.println("Error: Int Constant "+ token + " exceeds maximum value range of [" +min+"," +max+"] At line "+ line+" Column "+column);
    //System.exit(1);
   }
  else {
    printToken(token,"Int Constant",line,column);
  }
 }

 public void validateIDFToken(String token , int maxLength , int line , int column){
    column = column - token.length() + 1;
    if(token.length()>14){
      System.err.println("Error: Identifier "+ token + " exceeds maximum length of " + maxLength + " At line "+ line+" Column "+column);
      IDF_HashTable.table.updateError(token,"Identifier exceeds maximum length of " + maxLength);
      //System.exit(1);
    }
    else {
      printToken(token,"Identifier",line,column);
      IDF_HashTable.table.insert(token);
    }
 }

}



//Fragements
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
fragment ALPHANUMERICAL: LETTER | DIGIT;
fragment INLINECOMMENT: '<!-' ~[\n]* '-!>'; 
fragment MULTILINECOMMENT: '{--' .*? '--}';
fragment ARITHMETICOPERATOR: [+/*\-];

//Tokens
INPUT: 'input';
OUTPUT: 'output';
TYPE: 'Int' | 'Float' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
MAIN: 'MainPrgm' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
VAR: 'Var' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
BEGIN: 'BeginPg' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
END: 'EndPg' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
IF: 'if' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
ELSE: 'else' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
ELSIF: 'elsif';
THEN: 'then' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
SWITCH: 'switch';
CASE: 'case';
BREAK: 'break';
DEFAULT: 'default';
WHILE: 'while' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
DO: 'do' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
FOR: 'for' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
FROM: 'from' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
TO: 'to' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
STEP: 'step' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
AND: 'AND' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
OR: 'OR' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
LET: 'let' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
DEFINE: '@Define' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};
CONST: 'const' {printToken(getText(),"Keyword",getLine(),getCharPositionInLine());};

IDF: LETTER+ (ALPHANUMERICAL+('_'ALPHANUMERICAL+)*)* {validateIDFToken(getText(), 14,getLine(), getCharPositionInLine());};


INT: DIGIT+ {validateIntToken(getText(), -32768,32767,getLine(), getCharPositionInLine());}; 
FLOAT: DIGIT+'.'DIGIT+ | '.'DIGIT+ | DIGIT+'.' {printToken(getText(),"Float Constant",getLine(),getCharPositionInLine());};
STRING: '"'~["\n]*'"' {printToken(getText(),"String Constant",getLine(),getCharPositionInLine());};
AFFECT: ':=';
NOT: '!';
COMPARAISONOPERATOR:  '<'|'>'|'>='|'<='|'=='|'!=';
Separators: '('|')'|'='|';'|'{'|'}'|'['|']'|':'|','|ARITHMETICOPERATOR|COMPARAISONOPERATOR {printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
COMMENT: MULTILINECOMMENT|INLINECOMMENT {printToken(getText(),"Comment",getLine(),getCharPositionInLine());};
WS : [ \t\r\n]+ -> skip;
ERROR_TOKEN: . {System.err.println("Error: Unknown Token "+ getText() + " At line "+ getLine()+" Column "+getCharPositionInLine());System.exit(1);};


//Production Rules
prog:	  COMMENT* MAIN IDF ';' COMMENT*  varBlock COMMENT*  mainCode  COMMENT* EOF {IDF_HashTable.table.printTable();};
varBlock: VAR declaration+  | VAR ;
declaration:  normalDeclaration  |  arrayDeclaration | COMMENT;
listIDF: IDF(','IDF)*;
normalDeclaration:  declarationKeyword listIDF ':' TYPE '=' affectValue ';'
{
    for (String idf : $listIDF.text.split(",")) { 
        IDF_HashTable.table.updateTypeValue(idf.trim(), $TYPE.text,$affectValue.text,$affectValue.type);
    }
}
 | declarationKeyword listIDF ':' TYPE ';' 
{
    for (String idf : $listIDF.text.split(",")) { 
        IDF_HashTable.table.updateType(idf.trim(), $TYPE.text);
    }
};
sign  : '+' | '-';
affectValue returns [String type] :   number {$type = $number.type;} ;
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
partCondition: IDF COMPARAISONOPERATOR arithmeticExpression;
logicalOperator: AND | OR | NOT; 
