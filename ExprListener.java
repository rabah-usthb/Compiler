// Generated from Expr.g4 by ANTLR 4.7.2

  import java.util.HashMap;
  import java.util.Map;

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
	 * Enter a parse tree produced by {@link ExprParser#listValue}.
	 * @param ctx the parse tree
	 */
	void enterListValue(ExprParser.ListValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#listValue}.
	 * @param ctx the parse tree
	 */
	void exitListValue(ExprParser.ListValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ExprParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ExprParser.ValueContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#concatInst}.
	 * @param ctx the parse tree
	 */
	void enterConcatInst(ExprParser.ConcatInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#concatInst}.
	 * @param ctx the parse tree
	 */
	void exitConcatInst(ExprParser.ConcatInstContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#forInst}.
	 * @param ctx the parse tree
	 */
	void enterForInst(ExprParser.ForInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#forInst}.
	 * @param ctx the parse tree
	 */
	void exitForInst(ExprParser.ForInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#doWhileInst}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileInst(ExprParser.DoWhileInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#doWhileInst}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileInst(ExprParser.DoWhileInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whileInst}.
	 * @param ctx the parse tree
	 */
	void enterWhileInst(ExprParser.WhileInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whileInst}.
	 * @param ctx the parse tree
	 */
	void exitWhileInst(ExprParser.WhileInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifInst}.
	 * @param ctx the parse tree
	 */
	void enterIfInst(ExprParser.IfInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifInst}.
	 * @param ctx the parse tree
	 */
	void exitIfInst(ExprParser.IfInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elseIfInst}.
	 * @param ctx the parse tree
	 */
	void enterElseIfInst(ExprParser.ElseIfInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elseIfInst}.
	 * @param ctx the parse tree
	 */
	void exitElseIfInst(ExprParser.ElseIfInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elseInst}.
	 * @param ctx the parse tree
	 */
	void enterElseInst(ExprParser.ElseInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elseInst}.
	 * @param ctx the parse tree
	 */
	void exitElseInst(ExprParser.ElseInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#switchInst}.
	 * @param ctx the parse tree
	 */
	void enterSwitchInst(ExprParser.SwitchInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#switchInst}.
	 * @param ctx the parse tree
	 */
	void exitSwitchInst(ExprParser.SwitchInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#caseInst}.
	 * @param ctx the parse tree
	 */
	void enterCaseInst(ExprParser.CaseInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#caseInst}.
	 * @param ctx the parse tree
	 */
	void exitCaseInst(ExprParser.CaseInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#defaultInst}.
	 * @param ctx the parse tree
	 */
	void enterDefaultInst(ExprParser.DefaultInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#defaultInst}.
	 * @param ctx the parse tree
	 */
	void exitDefaultInst(ExprParser.DefaultInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ExprParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ExprParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#partCondition}.
	 * @param ctx the parse tree
	 */
	void enterPartCondition(ExprParser.PartConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#partCondition}.
	 * @param ctx the parse tree
	 */
	void exitPartCondition(ExprParser.PartConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#comparaisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparaisonOperator(ExprParser.ComparaisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#comparaisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparaisonOperator(ExprParser.ComparaisonOperatorContext ctx);
}