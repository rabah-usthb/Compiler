package application.antlr.SymboleTable;

import java.util.HashMap;

import application.antlr.validate.validateConstant;

public class Constant_Hashtable {
 
	public HashMap<String, Constant_Attributs> ConstantHashMap = new HashMap<String, Constant_Attributs>();
	public static final Constant_Hashtable ConstantTable = new Constant_Hashtable();
	
	public void insertTable(String value, String type, int line , int column) {
	 // System.out.println("Constant "+value);
		if(!this.ConstantHashMap.containsKey(value)) {
			
			  value = validateConstant.getNumberValue(value, type);
			
		  if(validateConstant.validateConst(value, type)) {
			  
			  this.ConstantHashMap.put(value, new Constant_Attributs(validateConstant.getRange(type), type));
		  }
		  else {
			  this.ConstantHashMap.put(value, new Constant_Attributs(validateConstant.getRange(type), type,validateConstant.getError(value, type, line, column)));
		  }
			
		}
	}

}
