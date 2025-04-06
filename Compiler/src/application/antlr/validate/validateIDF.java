package application.antlr.validate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import application.antlr.SymboleTable.ErrorToken;

public class validateIDF {

	
	public static final String intFloatDefault = "0";
	public static final String boolDefault = "False";
	public static final String charDefault = "''";
	public static final String stringDefault = "\"\"";
	public static final int maxSize = 14;
	
	
	
	
	public static ErrorToken isDividingByZero(ArrayList<ErrorToken> arithmeticList,String operator,int line, int col) {
		operator = operator.replace("(", "").replace(")", "");
		if(operator.equals("0") || operator.equals("-0") || operator.equals("+0")) {
			arithmeticList.add(new ErrorToken(operator, "DIV BY 0", line, col));
			return new ErrorToken(operator, "DIV BY 0", line, col);
		}
		return null;
	}
	
	public static String getSameArray(ArrayList<String> listValue) {
		System.out.println(listValue.toString());
		String array;
		
		array = "{";
		
		System.out.println(array);
		
		for(int i = 0 ; i <listValue.size() - 1 ; i++) {
	      array = array + listValue.get(i) +",";
	  	  System.out.println(array);
		}
		
		array = array+listValue.get(listValue.size()-1) + "}";
		System.out.println(array);
		
		return array;
	}
	
	public static String getArray(String len , ArrayList<String> listValue , String type) {
		int size = Integer.parseInt(len.replace("(", "").replace(")", ""));
		
		String array;
		
		array = "{";
		
		if(size<listValue.size()) {
		
			for(int i = 0 ; i <size - 1 ; i++) {
			      array = array + listValue.get(i) +",";
			}
			
			array =  array + listValue.get(size-1) + "} ";
			
			for(int i = size ; i<listValue.size()-1;i++) {
				 array = array + listValue.get(i) +",";
			}
			
			array = array +listValue.get(listValue.size()-1);
			
			return array;
		}
		
		else {
			for(int i = 0 ; i<listValue.size()-1;i++) {
				 array = array + listValue.get(i) +",";
			}
			
			array = array +listValue.get(listValue.size()-1);
			
			if(listValue.size()<size) {
				array = array + ",";
				for(int i = listValue.size() ; i<size-1;i++) {
					 array = array + getDefault(type) +",";
				}
				
				array = array + getDefault(type);
			}
			
			array = array + "}";
			return array;
			
		}
		
	}
	
	public static String getDefault(String type) {
		if(type.equalsIgnoreCase("int") ||type.equalsIgnoreCase("float")) {
			return intFloatDefault;
		}
		else if(type.equalsIgnoreCase("bool")) {
			return boolDefault;
		}
		else if(type.equalsIgnoreCase("char")) {
			return charDefault;
		}
		else if(type.equalsIgnoreCase("string")) {
			return stringDefault;
		}
		return "";
	}
	
	public static String getInitArray(String len , String type) {
		int size = Integer.parseInt(len.replace("(", "").replace(")", ""));
         return "{"+(getDefault(type)+",").repeat(size-1)+getDefault(type)+"}";
	}
	
	public static boolean isRespectingSize(String size , ArrayList<String> valueList) {
		
		size = size.replace("(", "").replace(")", "");
		int len = Integer.parseInt(size);
		
		if(valueList.size()>len) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public static boolean isSameType(ArrayList<ErrorToken> types) {
		
		HashSet<String> typeSet = new LinkedHashSet<>();
		
		for(ErrorToken token : types) {
			typeSet.add(token.type);
		}
		
		if(typeSet.size()==1) {
			return true;
		}
		else {
			return false;
		}
		
	
	}
	
	
	public static boolean isSizeCorrect(String size) {
		size = size.replace("(", "").replace(")", "");
		long value;
		
		try {
	     	value =	Long.parseLong(size);
		}
		catch (NumberFormatException e) {
			return false;
		}
		
		if(value<1 || value>validateConstant.maxInt) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public static String getError(String exp , String token, String IDF , int line_idf, int col_idf ,String size ,String type, int line , int col) {
	
		
		switch(type) {
			case "Not Defined":
				return getUndefinedError(exp, token, line, col);
			case "Not Array":
				return getNotArrayError(token, line, col);
			case "Array":
				return getArrayError(token,line,col);
			case "Out Of Bound":
				return getBoundError(size, token, line, col);
			case "DIV BY 0":
				return getDivError(exp, line, col);
			case "EXP":
				return getValueError(type, token, line, col);
			case "Missmatch":
				return getMissmatchError(IDF, line_idf, col_idf);
			default:
				return "";
		}
		
	}
	
	public static String getBoundError(String size,String token, int line , int column) {
		return "Error: Trying To Index "+size+" Array "+token+" Out Of Bound At"+ line +" Column "+column;
	}
	
	
	public static String getArrayError(String token, int line , int column) {
		return "Error: Trying To Use Array Variable"+token+" At"+ line +" Column "+column;
	}
	
	public static String getNotArrayError(String token, int line , int column) {
		return "Error: Trying To Index On Non Array Variable"+token+" At"+ line +" Column "+column;
	}
	
	
	public static String getUndefinedError(String exp , String token, int line , int column) {
		return "Error: Expression "+ exp + " Uses Undefined Variable "+token+" At"+ line +" Column "+column;
	}
	
	public static String getValueError (String value , String token,int line , int column) {
		return "Error: Expression "+ value + " Not Properly Defined For The Token "+token+" At"+ line +" Column "+column;
	}
	
	public static String getNotSameTypeError (String token , int line , int column) {
		return "Error: Array "+ token + " has element of different type  at line "+ line +" Column "+column;
	}
	
	public static String getsizeError (String token, String size , int line , int column) {
		return "Error: Array "+ token + " has size "+size+" out of bound [ 1 ,"+validateConstant.maxInt+"] at line "+ line +" Column "+column;
	}
	
	public static String getMissmatchError (String token , int line , int column) {
		return "Error: Missmatch Type "+ token + " at line "+ line +" Column "+column;
	}
	
	public static String getRedefinedError (String token , int line , int column) {
		return "Error: Identifier "+ token + " redefined at line "+ line +" Column "+column;
	}

	public static String getSizeError (String token , int line , int column) {
		return "Error: Identifier "+ token + " exceeds maximum length of " + maxSize + " At line "+ line +" Column "+column;
	}
	
	public static String getDivError (String exp,int line , int column) {
		return "Error: Expression "+exp+ " dividing by 0 At line "+ line +" Column "+column;
	}
	
	public static boolean validateIDFToken(String token){
	   
	    if(token.length()>validateIDF.maxSize){
	       return false;
	    }
	    else {
	      return true;
	    }
	 }
}
