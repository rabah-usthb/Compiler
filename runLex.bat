call antlr4 Expr.g4
call Compile *.java
call grun Expr tokens -tokens %1