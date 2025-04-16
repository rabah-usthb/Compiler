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
	
	public static String getDefaultArray(String type , String size) {
		size = size.replace("(", "").replace(")", "");
		int len = Integer.parseInt(size);
		
		return "{"+ (getDefault(type)+" , ").repeat(len-1)+getDefault(type)+" }";
		
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
			if(!token.dataType.isEmpty()) {
			typeSet.add(token.dataType);
			System.out.println("Data Type "+token.dataType);
			}
			
		}
		
		if(typeSet.size()==1) {
			return true;
		}
		else {
			return false;
		}
		
	
	}
	
	
	public static boolean isAffectSmaller(String size_1 , String size_2) {
		 int size_2Value;
		 int size_1Value; 
		 
		 System.out.println("SIZE_1 "+size_1+" SIZE_2 "+size_2);
		 
		 size_1Value = Integer.parseInt(size_1);
		 size_2Value = Integer.parseInt(size_2); 
		 
		 return size_1Value<size_2Value;
			  
	}
	
	
	public static boolean isOutOfBound(String size , String index ) {
	
		 int indexValue;
		 int sizeValue;
		  
		  try {
			  sizeValue = Integer.parseInt(size);
			  indexValue = Integer.parseInt(index); 
			  
			  if(indexValue<0 || indexValue>sizeValue -1 ) {
				  return true;
			  }
			  
		  }
		  catch (NumberFormatException e) {
			  return true;
		  }
		  return false;
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
	
	public static String getArrayAffect(String token,int line, int col) {
		return "Error : Trying To Affect Non Array Value To Array Variable "+token+" At Line "+line+" Column "+col;
	}
	
	public static String getGreaterArray(String token,String vect,int line, int col) {
		return "Error : Trying To Affect Array "+vect+" Of Greater Size To Array "+token+" At Line "+line+" Column "+col;
	}
	
	public static String getNotArrayAffect(String token,int line, int col) {
		return "Error : Trying To Affect Array To Non Array Variable "+token+" At Line "+line+" Column "+col;
	}
	
	public static String getManyElementError(String token,int line, int col) {
		return "Error : To Many Element Affected To  "+token+" At Line "+line+" Column "+col;
	}
	
	public static String getSizeDefError(String token , String exp , int line , int col) {
		return "Error : Using Array "+token+" With Size Not Properly Defined In "+exp+" At Line "+line+" Column "+col;
	}
	
	public static String getIndexingError(String token , String index,String exp, int line ,int column) {
		return "Error: Trying To Index Non Array Variable "+token+"["+index+"] in expression "+ exp +" At Line "+ line +" Column "+column;
	}
	
	public static String getIndexingError(String token , String index, int line ,int column) {
		return "Error: Trying To Index Non Array Variable "+token+"["+index+"]"+" At Line "+ line +" Column "+column;
	}
	
	
	public static String getBoundError(String index,String token, int line , int column) {
		return "Error: Trying To Index "+index+" Array "+token+" Out Of Bound At Line "+ line +" Column "+column;
	}
	
	public static String getBoundError(String index,String token, String exp,int line , int column) {
		return "Error: Trying To Index "+index+" Array "+token+" Out Of Bound in "+exp+" At Line "+ line +" Column "+column;
	}
	
	
	public static String getArrayError(String token,String exp, int line , int column) {
		return "Error: Trying To Use Array "+token+" in expression "+exp+" At Line "+ line +" Column "+column;
	}
	
	public static String getNotArrayError(String token, int line , int column) {
		return "Error: Trying To Index On Non Array Variable"+token+" At Line "+ line +" Column "+column;
	}
	
	public static String getConstantError(String token, int line , int column) {
		return "Error: Trying To Affect A Second Value To A Constant Variable "+token+" At Line "+ line +" Column "+column;
	}
	
	public static String getUndefinedError(String token, int line , int column) {
		return "Error: Trying To Affect Value To Undefined Variable "+token+" At Line "+ line +" Column "+column;
	}
	
	public static String getUndefinedError(String exp , String token, int line , int column) {
		return "Error: Expression "+ exp + " Uses Undefined Variable "+token+" At Line "+ line +" Column "+column;
	}
	
	public static String getValueError (String value , String token,int line , int column) {
		return "Error: Expression "+ value + " Not Properly Defined For The Token "+token+" At Line "+ line +" Column "+column;
	}
	
	public static String getNotSameTypeError (String token , int line , int column) {
		return "Error: Array "+ token + " has element of different type  at Line "+ line +" Column "+column;
	}
	
	public static String getsizeError (String token , int line , int column) {
		return "Error: Trying To Affect Value To Array "+ token + " with undefined size at line "+ line +" Column "+column;
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

	public static String getIDFLenError (String token , int line , int column) {
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
