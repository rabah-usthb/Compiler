package application.antlr.SymboleTable;

import java.beans.Expression;
import java.util.HashMap;

import application.antlr.ExprParser;
import application.antlr.validate.validateIDF;

public class Expr_HashTable {

	String name;
	public HashMap <String,Expr_Attributs> Expr_Map = new HashMap<>();
	public static Expr_HashTable table = new Expr_HashTable();  
	
	void appendError(Expr_Attributs error , String Message ) {
		 if(error.error.toString().equalsIgnoreCase("No Error")) {
			  error.error.setLength(0);
			  error.error.append(Message);
		  }
		  else {
		  error.error.append("\n"+Message);
		  }
	}
	
	
	public void updateErrorInsert(String exp, ErrorToken typeValue,int line , int col){
	
		if(!this.Expr_Map.containsKey(exp)) {
			Expr_Attributs error = new Expr_Attributs();	
			
			 if(typeValue.type.equalsIgnoreCase("Not Defined")) {
				appendError(error, validateIDF.getUndefinedError(exp, typeValue.name,typeValue.line, typeValue.col));
			  }
		
		 else if (typeValue.type.equalsIgnoreCase("size")) {
			 appendError(error, validateIDF.getSizeDefError(typeValue.name,exp,typeValue.line,typeValue.col));
			 
		}
		 
		 
		 else if(typeValue.type.equalsIgnoreCase("Array")) {
			 
				appendError(error, validateIDF.getArrayError(typeValue.name, exp,typeValue.line, typeValue.col));
				
		 }
		 
		 else if(typeValue.type.equalsIgnoreCase("Not Array")) {
				appendError(error, validateIDF.getIndexingError(typeValue.name,typeValue.index, exp,typeValue.line, typeValue.col));
			
		 }
		 
		 
		 else if(typeValue.type.equalsIgnoreCase("Out Of Bound")) {
				
				appendError(error, validateIDF.getBoundError(typeValue.index,typeValue.name,exp,typeValue.line, typeValue.col));
				
		 }
		 
		 else if(typeValue.type.equalsIgnoreCase("EXP")) {
			 
				appendError(error, validateIDF.getValueError(exp,typeValue.name,typeValue.line, typeValue.col));
		 }
		 
		 
		 else if(typeValue.type.equalsIgnoreCase("Div By 0")) {
			 
			appendError(error, validateIDF.getDivError(exp,typeValue.line, typeValue.col));
			 
		
		 }
	
			
			this.Expr_Map.put(exp, error);
			
			
		}
}
	
}
