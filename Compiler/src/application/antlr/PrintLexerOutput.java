package application.antlr;

import java.util.List;

import org.antlr.v4.runtime.Token;

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
			 validateIDFToken(text, x, y);
			}
			else if (isComment(type)) {
				printToken(text,"Comment",x,y);
			}
			else if (isSeparator(type)) {
				printToken(text,"Separator",x,y);
			}
			else if(isConst(type)) {
				if(type.equals("int")) {
				validateIntToken(text, x, y);	
				}
				else {
				printToken(text,type.toLowerCase()+"Constant",x,y);
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
	
	  public void validateIntToken(String token , int line , int column){
		    long value = 0;  	  
		    
		    try {
		    value = Long.parseLong(token);
		    }
		    catch(NumberFormatException e) {
		    	output.append("Error: Int Constant "+ token + " exceeds maximum value range of [-32768 , 32767 ] At line "+ line+" Column "+column+"\n");
		    	this.nb++;
		    }
		    
		    if(value<-32768|| value >32767 ) {
		    	output.append("Error: Int Constant "+ token + " exceeds maximum value range of [-32768 , 32767 ] At line "+ line+" Column "+column+"\n");
		    	this.nb++;
		    	//System.exit(1);
		   }
		  else {
		    printToken(token,"Int Constant",line,column);
		  }
		 }
	
	
	public void validateIDFToken(String token  , int line , int column){
	   
	    if(token.length()>14){
	      output.append("Error: Identifier "+ token + " exceeds maximum length of " + 14 + " At line "+ line+" Column "+column+"\n");
	      this.nb++;
	      //IDF_HashTable.table.updateError(token,"Identifier exceeds maximum length of " + maxLength);
	      //System.exit(1);
	    }
	    else {
	      printToken(token,"Identifier",line,column);
	    //IDF_HashTable.table.insert(token);
	    }
	 }
	
}
