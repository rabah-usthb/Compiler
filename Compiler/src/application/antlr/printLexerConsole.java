package application.antlr;


import application.antlr.validate.validateConstant;
import application.antlr.validate.validateIDF;

public class printLexerConsole {

	
	public StringBuilder output = new StringBuilder();
	public int nb = 0;
	public static printLexerConsole console = new printLexerConsole();
	

	
	public void printConstant(String token, String type,int line , int column) {
		  if(validateConstant.validateConst(token, type)) {
			  printToken(token,type+" Constant",line,column);
		  }
			  else { 
				  printConstantError(token, type, line, column);
		    }
	}
	
	


	public void printIDF(String token, int line , int column) {
		
		if (validateIDF.validateIDFToken(token)) {
			 printToken(token,"Identifier",line,column);
		}
		else {
		printIDFError(token, line, column);
		}
	}
	
	public void printConstantError(String token ,String type, int line , int column) {
		 output.append(validateConstant.getError(token, type, line, column)+"\n"); 
		 this.nb++;
		}
	
	public void printIDFError(String token , int line , int column) {
	  output.append("Error: Identifier "+ token + " exceeds maximum length of " + 14 + " At line "+ line +" Column "+column+"\n");
      ++nb;
	}
	
	public void printUndefined(String token , String type, int line , int column) {
		output.append("Undefined Token "+token+" at line " + line + ", column " + column+"\n");
		++nb;
	}

	
	
	public void printToken(String token , String type, int line , int column) {
	   output.append("Matched "+type+" : "+token+" at line " + line + ", column " + column+"\n");
	}
	

}
