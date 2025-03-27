
public class validateIDF {

	public static final int maxSize = 14;
	
	public static String getMissmatchError (String token , int line , int column) {
		return "Error: Missmatch Type "+ token + " redefined at line "+ line +" Column "+column;
	}
	
	public static String getRedefinedError (String token , int line , int column) {
		return "Error: Identifier "+ token + " redefined at line "+ line +" Column "+column;
	}

	public static String getSizeError (String token , int line , int column) {
		return "Error: Identifier "+ token + " exceeds maximum length of " + maxSize + " At line "+ line +" Column "+column;
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
