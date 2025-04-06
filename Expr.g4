grammar Expr;

@header {
  import java.util.HashMap;
  import java.util.Map;
}


@members {
   public static final ArrayList<ErrorToken> types  = new ArrayList<>();
   public static final ArrayList<ErrorToken> arithmeticList  = new ArrayList<>();
   public static final ArrayList<ErrorToken> concatList  = new ArrayList<>();
   public static final ArrayList<ErrorToken> boolList  = new ArrayList<>();
   public static final ArrayList<ErrorToken> compareList  = new ArrayList<>();
   public static final ArrayList<String> valueList  = new ArrayList<>();
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

IDF: LETTER+ (ALPHANUMERICAL+('_'ALPHANUMERICAL+)*)* {IDF_HashTable.table.insertFirst(getText(),getLine(),getCharPositionInLine());};

INT: '('SIGN INTEGER')'  {Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());}|
     INTEGER {Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());}; 
FLOAT: '('SIGN FLOATED')'  {Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());} |
       FLOATED {Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());};
STRING: '"'~["\n]*'"' {Constant_Hashtable.ConstantTable.insertTable(getText(),"string",getLine(),getCharPositionInLine());};
CHAR: '\''~['\n]*'\'' {Constant_Hashtable.ConstantTable.insertTable(getText(),"char",getLine(),getCharPositionInLine());};

CONCAT: '.';
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
normalDeclaration @init {types.clear();} :  declarationKeyword listIDF ':' TYPE '=' value ';' 
{
    for (var idf : $listIDF.ctx.getTokens(IDF)) { 
        IDF_HashTable.table.updateTypeValue(idf.getText(), $declarationKeyword.mul ,$TYPE.text,$value.text,$value.type.type,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
    }
}
     | declarationKeyword listIDF ':' TYPE ';'
     
       {
        for (var idf : $listIDF.ctx.getTokens(IDF)) { 
        IDF_HashTable.table.updateType(idf.getText(), $declarationKeyword.mul ,$TYPE.text,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
    }
       }
     ; 

number returns [ErrorToken type] : INT { $type = new ErrorToken($INT.text,"INT",$INT.line,$INT.pos,0); } |  FLOAT  { $type = new ErrorToken($FLOAT.text,"FLOAT",$FLOAT.line,$FLOAT.pos,0); }   ;
arrayDeclaration: declarationKeyword listIDF ':' '[' TYPE ';' INT ']' '=' '{' '}' ';' 
{
  for (var idf : $listIDF.ctx.getTokens(IDF)) { 
        IDF_HashTable.table.updateSizeTypeValue(idf.getText(), $declarationKeyword.mul ,$TYPE.text,$INT.text,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
  }
}
| declarationKeyword listIDF ':' '[' TYPE ';' INT ']' '=' '{' listValue+ '}' ';' 
{
  for (var idf : $listIDF.ctx.getTokens(IDF)) { 
        IDF_HashTable.table.updateSizeTypeValue(idf.getText(), $declarationKeyword.mul ,$TYPE.text,$INT.text,this.types,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
  }
}
|
declarationKeyword listIDF ':' '[' TYPE ';' INT ']' ';' 
{
  for (var idf : $listIDF.ctx.getTokens(IDF)) { 
        IDF_HashTable.table.updateSizeType(idf.getText(), $declarationKeyword.mul ,$TYPE.text,$INT.text,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
  }
}
;
affectArray:  '=' '{' listValue* '}';
declarationKeyword returns [String mul]: DEFINE CONST{$mul = "Constant";} | LET {$mul = "Variable";};
listValue: v1=value {ErrorToken type = $v1.type; type.exp = $v1.text; this.types.add(type); }  (',' v=value { ErrorToken type = $v.type; type.exp = $v.text; this.types.add(type);})*;
value returns [ErrorToken type] @init {this.boolList.clear(); this.compareList.clear(); this.concatList.clear(); this.arithmeticList.clear();} : number {$type = $number.type;}| BOOLEANVALUE {$type = new ErrorToken($BOOLEANVALUE.text,"BOOL",$BOOLEANVALUE.line,$BOOLEANVALUE.pos,0);} | CHAR {$type = new ErrorToken($CHAR.text,"CHAR",$CHAR.line,$CHAR.pos,0); } | STRING {$type = new ErrorToken($STRING.text,"STRING",$STRING.line,$STRING.pos,0);}  | condition {$type = IDF_HashTable.table.conditionType(this.boolList,this.compareList);}| arithmeticExpression {$type=IDF_HashTable.table.getType(this.arithmeticList,0);} | concatInst {$type=IDF_HashTable.table.getType(this.concatList,1);};
mainCode: BEGIN  COMMENT* '{' inst+ '}' COMMENT* END ';'| BEGIN  COMMENT* '{' '}' COMMENT* END ';';
inst: output | input | affectInst |COMMENT| doWhileInst |whileInst | ifInst | switchInst;
input:  INPUT '('  listIDF ')' ';';
output: OUTPUT '(' content ')' ';';
content: ((STRING|IDF) ',')+ (STRING|IDF) |(STRING|IDF);

affectInst: var AFFECT arithmeticExpression ';'| var AFFECT concatInst ';' | var AFFECT '{' listValue* '}' ';' | var AFFECT condition ';';
concatInst: (STRING  {this.sconcatList.add(new ErrorToken($STRING.text,"STRING",$STRING.line,$STRING.pos,0););} |CHAR {this.concatList.add(new ErrorToken($CHAR.text,"STRING",$CHAR.line,$CHAR.pos,0););} |var {this.concatList.add($var.type);}) ( '.' ((var {this.concatList.add($var.type);}|STRING {this.concatList.add(new ErrorToken($STRING.text,"STRING",$STRING.line,$STRING.pos,0););}|CHAR{this.concatList.add(new ErrorToken($CHAR.text,"STRING",$CHAR.line,$CHAR.pos,0););})))+   ;
arithmeticExpression : arithmeticExpression op=(MUL | DIV) ari=arithmeticExpression  {if($op.type == DIV){validateIDF.isDividingByZero(this.arithmeticList,$ari.text, $ari.start.getLine(), $ari.start.getCharPositionInLine());}} | arithmeticExpression (PLUS| SUB) arithmeticExpression |  operator {this.arithmeticList.add($operator.type);} |'(' arithmeticExpression ')' ;
operator returns [ErrorToken type]: number {$type = $number.type;} | var {$type = $var.type;}; 
var returns [ErrroToken type]: IDF {$type = IDF_HashTable.table.getNormalTypeExpression($IDF.text,$IDF.line,$IDF.pos); }| IDF '[' INT ']'  {$type = IDF_HashTable.table.getArrayTypeExpression($IDF.text,$INT.text,$IDF.line,$IDF.pos);};
forInst: FOR IDF((MUL | DIV) arithmeticExpression  | (PLUS| SUB) arithmeticExpression)? FROM arithmeticExpression TO arithmeticExpression STEP arithmeticExpression '{' inst+ '}';
doWhileInst: DO '{' inst+ '}' WHILE '(' condition ')' ';';
whileInst:  WHILE '(' condition ')' DO '{' inst+ '}';
ifInst: IF LPAR condition RPAR THEN '{' inst+ '}' elseIfInst? elseInst?;
elseIfInst: COMMENT* ELSIF '(' condition ')' THEN '{' inst+ '}' elseIfInst | COMMENT* ELSIF '(' condition ')' THEN '{' inst+ '}' ;
elseInst: COMMENT* ELSE '{' inst+ '}' ;
switchInst: SWITCH '(' IDF ')' '{' caseInst '}';
caseInst: CASE number ':' inst+ BREAK ';' defaultInst | CASE number ':' inst+ BREAK ';' caseInst;
defaultInst: DEFAULT ':' inst+ BREAK ';';
condition:   LPAR condition RPAR| NOT condition | condition AND condition| condition OR condition| partCondition| var {this.boolList.add($var.type)} | BOOLEANVALUE ;
partCondition : var comparaisonOperator arithmeticExpression {this.compareList.add($var.type); };
comparaisonOperator: EQ|NEQ|GREATER|LESSER|GEQ|LEQ;
