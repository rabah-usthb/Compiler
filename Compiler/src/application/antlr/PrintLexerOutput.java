package application.antlr;

import java.util.List;

import org.antlr.v4.runtime.Token;

import application.antlr.validate.validateConstant;
import application.antlr.validate.validateIDF;

public class PrintLexerOutput {
	
	List<? extends Token> listToken;
	ExprLexer Lexer;
	public StringBuilder output = new StringBuilder();
	public int nb = 0;
	
	public PrintLexerOutput(ExprLexer Lexer) {
		this.listToken = Lexer.getAllTokens();
		this.Lexer = Lexer;
	}
	
	public void printAllToken() {
		String text;
		String type;
		int x;
		int y;
		
		for (Token token : listToken) {
			text = token.getText();
			type = getTypeName(token);
			x = token.getLine();
			y = token.getCharPositionInLine();
			
			if(isKeyword(type)) {
				printToken(text,"Keyword", x, y);
			}
			else if (isIDF(type)) {
				if (validateIDF.validateIDFToken(text)) {
					 printToken(text,"Identifier",x,y);
				}
				else {
				  output.append("Error: Identifier "+ text + " exceeds maximum length of " + 14 + " At line "+ x+" Column "+y+"\n");
				  this.nb++;
				}
			
			}
			else if (isComment(type)) {
				printToken(text,"Comment",x,y);
			}
			else if (isSeparator(type)) {
				printToken(text,"Separator",x,y);
			}
			else if(isConst(type)) {
			  if(validateConstant.validateConst(text, type)) {
				  printToken(text,type+" Constant",x,y);
			  }
				  else { 
			    	 output.append(validateConstant.getError(text, type, x, y)+"\n");
						this.nb++;
			    }
			  
				
			}
			else if(isUndefined(type)) {
				output.append("Undefined Token "+text+" at line " + x + ", column " + y+"\n");
				 this.nb++;
			}
			
		}
	}
	
	
	public boolean isConst(String type) {
		return type.equals("int")||type.equals("float")||type.equals("string")||type.equals("char");
	}
	
	public boolean isIDF(String type) {
		return type.equals("idf");
	}
	
	public boolean isUndefined(String type) {
		return type.equals("error_token");
	}
	
	public boolean isComment(String type) {
		return type.equals("comment");
	}
	
	public boolean isKeyword(String type) {
		return type.equals("input")||type.equals("output")||type.equals("type")||
			   type.equals("main")||type.equals("var")||type.equals("begin")||
			   type.equals("end")||type.equals("if")||type.equals("else")||
			   type.equals("elsif")||type.equals("then")||type.equals("switch")||
			   type.equals("case")||type.equals("break")||type.equals("default")||
			   type.equals("while")||type.equals("do")||type.equals("for")||
			   type.equals("from")||type.equals("to")||type.equals("step")||
			   type.equals("and")||type.equals("or")||type.equals("let")||
			   type.equals("define")||type.equals("const");
	}
	
	public boolean isSeparator(String type) {
		return type.equals("affect")||type.equals("not")||type.equals("greater")||
			   type.equals("lesser")||type.equals("geq")||type.equals("leq")||
			   type.equals("eq")||type.equals("neq")||type.equals("lbrace")||
			   type.equals("rbrace")||type.equals("plus")||type.equals("sub")||
			   type.equals("mul")||type.equals("div")||type.equals("com")||
			   type.equals("semi")||type.equals("lbracket")||type.equals("rbracket")||
			   type.equals("lpar")||type.equals("rpar")||type.equals("assign")||
			   type.equals("twopoint");
	}
	
	
	
	public String getTypeName(Token token) {
		return this.Lexer.getVocabulary().getSymbolicName(token.getType()).toLowerCase();
	}
	
	public void printToken(String token , String type, int line , int column) {
	    output.append("Matched "+type+": "+token+" at line " + line + ", column " + column+"\n");
	 }
	
	
	
}
