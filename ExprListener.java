// Generated from Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void enterVarBlock(ExprParser.VarBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void exitVarBlock(ExprParser.VarBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#listIDF}.
	 * @param ctx the parse tree
	 */
	void enterListIDF(ExprParser.ListIDFContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#listIDF}.
	 * @param ctx the parse tree
	 */
	void exitListIDF(ExprParser.ListIDFContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#normalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalDeclaration(ExprParser.NormalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#normalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalDeclaration(ExprParser.NormalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(ExprParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(ExprParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#affectValue}.
	 * @param ctx the parse tree
	 */
	void enterAffectValue(ExprParser.AffectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#affectValue}.
	 * @param ctx the parse tree
	 */
	void exitAffectValue(ExprParser.AffectValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExprParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExprParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(ExprParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(ExprParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#affectArray}.
	 * @param ctx the parse tree
	 */
	void enterAffectArray(ExprParser.AffectArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#affectArray}.
	 * @param ctx the parse tree
	 */
	void exitAffectArray(ExprParser.AffectArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declarationKeyword}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationKeyword(ExprParser.DeclarationKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declarationKeyword}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationKeyword(ExprParser.DeclarationKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#listNumber}.
	 * @param ctx the parse tree
	 */
	void enterListNumber(ExprParser.ListNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#listNumber}.
	 * @param ctx the parse tree
	 */
	void exitListNumber(ExprParser.ListNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#mainCode}.
	 * @param ctx the parse tree
	 */
	void enterMainCode(ExprParser.MainCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#mainCode}.
	 * @param ctx the parse tree
	 */
	void exitMainCode(ExprParser.MainCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(ExprParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(ExprParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(ExprParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(ExprParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(ExprParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(ExprParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ExprParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ExprParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#affectInst}.
	 * @param ctx the parse tree
	 */
	void enterAffectInst(ExprParser.AffectInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#affectInst}.
	 * @param ctx the parse tree
	 */
	void exitAffectInst(ExprParser.AffectInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(ExprParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(ExprParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ExprParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ExprParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExprParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExprParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ExprParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ExprParser.OperationContext ctx);
}