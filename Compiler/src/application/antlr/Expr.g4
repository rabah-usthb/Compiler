grammar Expr;

@lexer::header {
  package application.antlr;
  import application.antlr.SymboleTable.IDF_HashTable;
  import application.antlr.SymboleTable.Constant_Hashtable;
  import application.antlr.SymboleTable.Keywords_Hashtable;
}

@parser::header {
  package application.antlr;
  import application.antlr.SymboleTable.ErrorToken;
  import application.antlr.SymboleTable.IDF_HashTable;
  import application.antlr.validate.validateIDF;
  import application.antlr.SymboleTable.Expr_HashTable;
  import java.util.List;
  import java.util.ArrayList;
}


@parser::members {
   public static final ArrayList<ErrorToken> types  = new ArrayList<>();
   public static final ArrayList<ErrorToken> arithmeticList  = new ArrayList<>();
   public static final ArrayList<ErrorToken> concatList  = new ArrayList<>();
   public static final ArrayList<ErrorToken> boolList  = new ArrayList<>();
   public static final ArrayList<ErrorToken> compareList  = new ArrayList<>();
}

@lexer::members {
    {
     printLexerConsole.console.nb = 0;
     printLexerConsole.console.output.setLength(0);
    }
}

//Fragements
fragment SIGN: '-' | '+';
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
fragment ALPHANUMERICAL: LETTER | DIGIT;
fragment INTEGER: DIGIT+;
fragment FLOATED: DIGIT+'.'DIGIT+ | '.'DIGIT+ | DIGIT+'.';
fragment INLINECOMMENT: '<!-' ~[\n]*? '-!>'; 
fragment MULTILINECOMMENT: '{--' .*? '--}';


//Tokens


BOOLEANVALUE: ('True'| 'False')   { printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine());  Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Boolean Value");}; 
INPUT: 'input'   { printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine());  Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Read Function");}; 
OUTPUT: 'output' { printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Print Function");};
TYPE: ('Int'  |'Float'  |'Bool'  | 'String'   | 'Char')  { printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Data Type");};
MAIN: 'MainPrgm'  { printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainProgram Header");};
VAR: 'Var'  { printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Variable Block Delimiter");};
BEGIN: 'BeginPg'  { printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainCode Delimiter");};
END: 'EndPg' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"MainCode Delimiter");};
IF: 'if' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"If Keyword");};
ELSE: 'else' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Else Keyword");};
ELSIF: 'elsif'{printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Else If Keyword");};
THEN: 'then' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Then Keyword");};
SWITCH: 'switch'  {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Switch Keyword");};
CASE: 'case'  {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Case Delimiter");};
BREAK: 'break' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Case Delimiter");};
DEFAULT: 'default' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Default Case Delimiter");};
WHILE: 'while' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");};
DO: 'do' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");};
FOR: 'for' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Loop Keyword");};
FROM: 'from' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"From Keyword");};
TO: 'to' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"To Keyword");};
STEP: 'step' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Step Keyword");};
AND: 'AND' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Logical AND");};
OR: 'OR' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Logical OR");};
LET: 'let'  {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Variable Declarator");};
DEFINE: '@define' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Constant Declarator");};
CONST: 'Const' {printLexerConsole.console.printToken(getText(),"Keyword",getLine(),getCharPositionInLine()); Keywords_Hashtable.KeywordsTable.insertTable(getText(),"Constant Declarator");};

IDF: LETTER+ (ALPHANUMERICAL*('_'ALPHANUMERICAL+)*)? { printLexerConsole.console.printIDF(getText(),getLine(),getCharPositionInLine()); IDF_HashTable.table.insertFirst(getText(),getLine(),getCharPositionInLine());};

INT: ('('SIGN INTEGER')'  | INTEGER) {printLexerConsole.console.printConstant(getText(),"int",getLine(),getCharPositionInLine()); Constant_Hashtable.ConstantTable.insertTable(getText(),"int",getLine(),getCharPositionInLine());}; 
FLOAT: ('('SIGN FLOATED')' | FLOATED)  {printLexerConsole.console.printConstant(getText(),"float",getLine(),getCharPositionInLine()); Constant_Hashtable.ConstantTable.insertTable(getText(),"float",getLine(),getCharPositionInLine());};
STRING: '"'~["\n]*'"' {printLexerConsole.console.printConstant(getText(),"string",getLine(),getCharPositionInLine()); Constant_Hashtable.ConstantTable.insertTable(getText(),"string",getLine(),getCharPositionInLine());};
CHAR: '\''~['\n]*'\'' {printLexerConsole.console.printConstant(getText(),"char",getLine(),getCharPositionInLine()); Constant_Hashtable.ConstantTable.insertTable(getText(),"char",getLine(),getCharPositionInLine());};

CONCAT: '.' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
AFFECT: ':='{printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
NOT: '!'{printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
GREATER: '>'{printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
LESSER: '<'{printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
GEQ: '>='{printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
LEQ: '<='{printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
EQ: '=='{printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
NEQ: '!='{printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
LBRACE: '{' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
RBRACE: '}' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
PLUS: '+' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
SUB: '-' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
MUL: '*' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
DIV: '/' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
COM: ',' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
SEMI: ';' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
LBRACKET: '[' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
RBRACKET: ']' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
LPAR: '(' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
RPAR: ')' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
ASSIGN: '=' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};
TWOPOINT: ':' {printLexerConsole.console.printToken(getText(),"Separator",getLine(),getCharPositionInLine());};

COMMENT: (MULTILINECOMMENT|INLINECOMMENT) {printLexerConsole.console.printToken(getText(),"Comment",getLine(),getCharPositionInLine());} ->channel(HIDDEN) ;
WS : [ \t\r\n]+ -> skip;

ERROR_TOKEN: .;


//Production Rules
prog:	    MAIN IDF ';'    varBlock    mainCode    EOF;
varBlock: VAR declaration+ | VAR;
declaration:  normalDeclaration  | arrayDeclaration;
listIDF: IDF(','IDF)*;
normalDeclaration @init {types.clear();} :  declarationKeyword listIDF ':' TYPE '=' value ';' 
{
this.types.add($value.type);
    for (var idf : $listIDF.ctx.getTokens(IDF)) { 
        IDF_HashTable.table.updateTypeValue(idf.getText(), $declarationKeyword.mul ,$TYPE.text,$value.text,types,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
    }
}
     | declarationKeyword listIDF ':' TYPE ';'
     
       {
        for (var idf : $listIDF.ctx.getTokens(IDF)) { 
        IDF_HashTable.table.updateType(idf.getText(), $declarationKeyword.mul ,$TYPE.text,idf.getSymbol().getLine(),idf.getSymbol().getCharPositionInLine());
    }
       }
     ; 

number returns [ErrorToken type] : INT { $type = new ErrorToken($INT.text,"INT","INT",$INT.line,$INT.pos); } |  FLOAT  { $type = new ErrorToken($FLOAT.text,"FLOAT","FLOAT",$FLOAT.line,$FLOAT.pos); }   ;
arrayDeclaration @init{types.clear();}: declarationKeyword listIDF ':' '[' TYPE ';' INT ']' '=' '{' '}' ';' 
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
listValue: v1=value {ErrorToken type_1 = $v1.type; type_1.exp = $v1.text; this.types.add(type_1); }  (',' v=value { ErrorToken type_2 = $v.type; type_2.exp = $v.text; this.types.add(type_2);})*;
value returns [ErrorToken type] @init {this.boolList.clear(); this.compareList.clear(); this.concatList.clear(); this.arithmeticList.clear();} : var {$type= $var.type;} |number {$type = $number.type;}|  BOOLEANVALUE {$type = new ErrorToken($BOOLEANVALUE.text,"BOOL","BOOL",$BOOLEANVALUE.line,$BOOLEANVALUE.pos);} | CHAR {$type = new ErrorToken($CHAR.text,"CHAR","CHAR",$CHAR.line,$CHAR.pos); } | STRING {$type = new ErrorToken($STRING.text,"STRING","STRING",$STRING.line,$STRING.pos);}  | condition {$type = IDF_HashTable.table.conditionType(this.boolList,this.compareList);}| arithmeticExpression {$type=IDF_HashTable.table.getType(this.arithmeticList,0);} | concatInst {$type=IDF_HashTable.table.getType(this.concatList,1);};
mainCode: BEGIN    '{' inst+ '}'   END ';'| BEGIN    '{' '}'   END ';';
inst @init{ this.types.clear();} : output | input | affectInst | doWhileInst |whileInst | ifInst | switchInst|forInst;
input:  INPUT '('  listIDF ')' ';';
output: OUTPUT '(' content ')' ';';
content: ((STRING|IDF) ',')+ (STRING|IDF) |(STRING|IDF);

affectInst @init{ this.types.clear(); } : var_1 = var AFFECT var_2= var ';' 
{ 
  IDF_HashTable.table.affectMONO($var_2.text,$var_1.type, $var_2.type,$var_1.start.getLine(),$var_1.start.getCharPositionInLine());
}
| var AFFECT value ';'
{
 	IDF_HashTable.table.affectEXP($value.text,$var.type, $value.type,$var.start.getLine(),$var.start.getCharPositionInLine());
	
}

| IDF AFFECT '{' listValue+ '}' ';' {
  IDF_HashTable.table.affectArray($IDF.text,IDF_HashTable.table.getNormalTypeExpression($IDF.text,$IDF.line,$IDF.pos),this.types, $IDF.line,$IDF.pos);
}

| IDF AFFECT '{''}' ';' {
  IDF_HashTable.table.affectEmptyArray($IDF.text,IDF_HashTable.table.getNormalTypeExpression($IDF.text,$IDF.line,$IDF.pos), $IDF.line,$IDF.pos);
};


concatInst: (STRING  {this.concatList.add(new ErrorToken($STRING.text,"STRING",$STRING.line,$STRING.pos));} |CHAR {this.concatList.add(new ErrorToken($CHAR.text,"STRING",$CHAR.line,$CHAR.pos));} |var {this.concatList.add($var.type);}) ( '.' ((var {this.concatList.add($var.type);}|STRING {this.concatList.add(new ErrorToken($STRING.text,"STRING",$STRING.line,$STRING.pos));}|CHAR{this.concatList.add(new ErrorToken($CHAR.text,"STRING",$CHAR.line,$CHAR.pos));})))+   ;
arithmeticExpression : arithmeticExpression op=(MUL | DIV) ari=arithmeticExpression  {if($op.type == DIV){ this.arithmeticList.add(validateIDF.isDividingByZero(this.arithmeticList,$ari.text, $ari.start.getLine(), $ari.start.getCharPositionInLine()));}} | arithmeticExpression (PLUS| SUB) arithmeticExpression |  operator {this.arithmeticList.add($operator.type);} |'(' arithmeticExpression ')';
operator returns [ErrorToken type]: number {$type = $number.type;} | var {$type = $var.type;}; 
var returns [ErrorToken type]: IDF {$type = IDF_HashTable.table.getNormalTypeExpression($IDF.text,$IDF.line,$IDF.pos); }| IDF '[' INT ']'  {$type = IDF_HashTable.table.getArrayTypeExpression($IDF.text,$INT.text,$IDF.line,$IDF.pos);};
forInst: FOR IDF FROM val=INT {{IDF_HashTable.table.updateIndexMulTypeValue(IDF_HashTable.table.getNormalTypeExpression($IDF.text,$IDF.line,$IDF.pos),$val.text,$IDF.line,$IDF.pos);}} TO INT STEP INT '{' inst* '}' ;
doWhileInst @init{this.boolList.clear(); this.compareList.clear(); this.arithmeticList.clear();}: {	System.out.println("STATE "+this.arithmeticList+ " "+this.boolList+ " "+this.compareList);} DO '{' inst* {this.boolList.clear(); this.compareList.clear(); this.arithmeticList.clear();} '}' WHILE '(' condition ')' {	System.out.println("STATE AFTER "+$condition.text+" "+this.arithmeticList+ " "+this.boolList+ " "+this.compareList);} ';' {Expr_HashTable.table.updateErrorInsert($condition.text,IDF_HashTable.table.conditionType(this.boolList,this.compareList),$condition.start.getLine(),$condition.start.getCharPositionInLine());};
whileInst @init{this.boolList.clear(); this.compareList.clear(); this.arithmeticList.clear();}:  WHILE '(' condition ')' {Expr_HashTable.table.updateErrorInsert($condition.text,IDF_HashTable.table.conditionType(this.boolList,this.compareList),$condition.start.getLine(),$condition.start.getCharPositionInLine());} DO '{' inst* '}' ; 
ifInst @init{this.boolList.clear(); this.compareList.clear(); this.arithmeticList.clear();}: IF LPAR condition {Expr_HashTable.table.updateErrorInsert($condition.text,IDF_HashTable.table.conditionType(this.boolList,this.compareList),$condition.start.getLine(),$condition.start.getCharPositionInLine());} RPAR THEN '{' inst* '}' elseIfInst? elseInst?;
elseIfInst @init{this.boolList.clear(); this.compareList.clear(); this.arithmeticList.clear();}:   ELSIF '(' condition ')' {Expr_HashTable.table.updateErrorInsert($condition.text,IDF_HashTable.table.conditionType(this.boolList,this.compareList),$condition.start.getLine(),$condition.start.getCharPositionInLine());} THEN '{' inst* '}' elseIfInst 
|  ELSIF '(' condition ')' {Expr_HashTable.table.updateErrorInsert($condition.text,IDF_HashTable.table.conditionType(this.boolList,this.compareList),$condition.start.getLine(),$condition.start.getCharPositionInLine());} THEN '{' inst* '}';
elseInst:   ELSE '{' inst* '}' ;
switchInst: SWITCH '(' IDF ')' '{' caseInst '}';
caseValue: number|BOOLEANVALUE|CHAR|STRING;
caseInst: CASE caseValue ':' inst* BREAK ';' defaultInst | CASE caseValue ':' inst+ BREAK ';' caseInst;
defaultInst: DEFAULT ':' inst* BREAK ';';
condition:   LPAR condition RPAR| NOT condition | condition AND condition| condition OR condition| partCondition| var {this.boolList.add($var.type);} | BOOLEANVALUE ;
partCondition : {System.out.println("Before COND"+this.arithmeticList);} ari_1=arithmeticExpression  comparaisonOperator  ari_2=arithmeticExpression {System.out.println("COND "+this.arithmeticList+" "+$ari_1.text+" "+$ari_2.text); this.compareList.addAll(this.arithmeticList);};
comparaisonOperator: EQ|NEQ|GREATER|LESSER|GEQ|LEQ;
