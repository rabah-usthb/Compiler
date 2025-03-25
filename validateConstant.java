public class validateConstant {
  
	public static final float min32Bits  = -Float.MAX_VALUE; 
	public static final float max32Bits  = Float.MAX_VALUE; 
	public static final int minInt= -32768; 
	public static final int maxInt = 32767;
	
	public static String getNumberValue(String value,String type) {
		String default_value = value;
		value = value.replace("(", "").replace(")", "");
		
		switch(type) {
		 
		 case "int" :
			 return value;
		
		 case "float":
			 double floaty = Double.parseDouble(value);
			 return String.valueOf(floaty);
		
		 default:
			 return default_value;
		
		}
		
		
		
	}
	
	public static String getRange(String type) {
		switch(type) {
		 case "int":
			 return "[ "+validateConstant.minInt+" , "+validateConstant.maxInt+" ]";
		 
		 case "float":
			 return "[ "+String.format("%.2E", validateConstant.min32Bits)+" , "+String.format("%.2E", validateConstant.max32Bits)+" ]";
		
		 case "char":
			 return "One Character";
		
		 case "string":
			 return "100 Characters";
		}
		
		return "";
	}
	
	
	public static String getError(String value ,String type, int line , int column) {
		switch(type) {
		 case "int":
			 return "Error: Int Constant "+ value + " exceeds maximum value range of [ "+validateConstant.minInt+" , "+validateConstant.maxInt+" ] At line "+line+" Column "+column;
		 
		 case "float":
			 return "Error: Float Constant "+ value + " exceeds maximum value range of [ "+String.format("%.2E", validateConstant.min32Bits)+" , "+String.format("%.2E", validateConstant.max32Bits)+" ] At line "+line+" Column "+column;
		
		 case "char":
			 return "Error: Char Constant "+ value + " more than one character  At line "+line+" Column "+column;
		
		 case "string":
			 return "Error: String Constant "+ value + " more than 100 characters  At line "+line+" Column "+column;
		}
		
		return "";
	}
	
	
	public static boolean validateConst(String value , String type) {
		switch(type) {
		 case "int":
			return validateIntToken(value);
		  
		 case "float":
			 return validateFloatToken(value);
		  
		 case "char":
			 return validateChar(value);
		    
		 case "string":
			 return validateString(value);
		
		}
		return false;
		
	}
	
	
	public static boolean validateChar(String token) {
		if(token.length() > 3) {
			return false;
		} 
		else {
			return true;
		}
	}
	
	
	
	public static boolean validateString(String token) {
		if(token.length() > 102) {
			return false;
		} 
		else {
			return true;
		}
	}
	
	
	public static boolean validateFloatToken(String token) {
		    double value = 0;  	  
		    
		    try {
		    value = Double.parseDouble(token.replace("(", "").replace(")", ""));
		    }
		    catch(NumberFormatException e) {
		    	return false;
		    }
		    
		    if(value<min32Bits|| value >max32Bits ) {
		    	return false;
		   }
		  else {
			  return true;
		  }
		
	   }
	
	
	  public static boolean validateIntToken(String token) {
		    long value = 0;  	  
		    
		    try {
		    value = Long.parseLong(token.replace("(", "").replace(")", ""));
		    }
		    catch(NumberFormatException e) {
		    	return false;
		    }
		    
		    if(value<minInt|| value >maxInt ) {
		    	return false;
		   }
		  else {
			  return true;
		  }
		
	   }
	  
	  
	
}
