package application.antlr.SymboleTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import application.antlr.validate.validateIDF;

//normal = Array
//Array[index] = value
// append in other function 

public class IDF_HashTable {
  public HashMap<String,IDF_Attributs> IDF_Map = new HashMap<String,IDF_Attributs>();
  public static final IDF_HashTable table = new IDF_HashTable();
  
  
  public ErrorToken getType(ArrayList<ErrorToken> types) {
	  System.out.println("size "+types.size());
	  for(ErrorToken token : types) {
		  System.out.println("typew " +token.type);
	  }
	  
	   String value = "";
	  System.out.println(types);
	  if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("Not Defined"))) {
		  value = "Not Defined";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("Not Array"))) {
		  value = "Not Array";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("Array"))) {
		  value = "Array";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("Out Of Bound"))) {
		  value = "Out Of Bound";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("EXP"))) {
		  value = "EXP";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("DIV BY 0"))) {
		  value = "DIV BY 0";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("bool"))) {
		  value = "bool";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("int"))) {
		  value = "int";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("float"))) {
		  value = "float";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("char"))) {
		  value = "char";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("string"))) {
		  value = "string";
	  }
	  
		
	  final String Value = value;
	  return types.stream().filter(obj -> obj.type.equalsIgnoreCase(Value)).findFirst().orElse(null);
  
  }
  
  
  public ErrorToken conditionType(ArrayList<ErrorToken> boolList,ArrayList<ErrorToken> compareList) {
	  ErrorToken boolType = getType(boolList, 2);
	  ErrorToken expType = getType(compareList, 0);
	  
	 
	  
	  if(!expType.type.equalsIgnoreCase("int") && !expType.type.equalsIgnoreCase("float")) {
		  System.out.println("Comp Output "+expType.type);
		  return expType;
	  }
	  
	  else  {
		  System.out.println("Bool Output "+boolType.type);
		  return boolType;
	  }
	  
	  
  }
  
  
  public ErrorToken boolType(ArrayList<ErrorToken> boolList) {
	 
	  
	  for(ErrorToken token : boolList) {
		  if(!token.type.equalsIgnoreCase("bool")) {
			  token.type = "EXP";
			return token;
		  }
		
	  }
	  ErrorToken firstToken = boolList.get(0);
	  return new ErrorToken(firstToken.name,"BOOL",firstToken.line,firstToken.col);
  }
  
  public ErrorToken AriType(ArrayList<ErrorToken> arithemeticList) {
	
	  String cur= "int";
	  
	  for(ErrorToken token : arithemeticList) {
		  if(cur.equals("int") && token.type.equalsIgnoreCase("float")) {
			  cur = token.type;
		  }
		  else if(!token.type.equalsIgnoreCase("int") && !token.type.equalsIgnoreCase("float")) {
			  
			  if(token.type.equalsIgnoreCase("DIV BY 0")){
				  cur = token.type;
			  }else {
			  
			   token.type = "EXP";
			  return token;
			  }
		  }
		
	  }
	  
	  ErrorToken firstToken = arithemeticList.get(0);
	  
	  return new ErrorToken(firstToken.name,cur,firstToken.line,firstToken.col);
  }
  
  public ErrorToken conType(ArrayList<ErrorToken> concatList) {
	  System.out.println("hiiii");
	  for(ErrorToken token : concatList) {
		  System.out.println("namee " +token.name);
		  System.out.println("typee "+token.type);
	  }
	  for(ErrorToken token : concatList) {
		   if(!token.type.equalsIgnoreCase("String")) {
			  token.type = "EXP";
			  System.out.println("EXP");
			  return token;
		  }
		
	  }
	  
	  ErrorToken firstToken = concatList.get(0);
	  System.out.println("String");
	  return new ErrorToken("STRING",firstToken.line,firstToken.col);
  }
  
  public ErrorToken getType(ArrayList<ErrorToken> types, int Case) {
	   String value;
   
	   System.out.println("GetType Case "+Case);
	   
	   for(ErrorToken token : types) {
			  System.out.println("GetType namee " +token.name);
			  System.out.println("getType typee "+token.type);
		  }
	   
	  if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("Not Defined"))) {
		  value = "Not Defined";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("Not Array"))) {
		  value = "Not Array";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("Array"))) {
		  value = "Array";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("Size"))) {
		  value = "Size";
	  }
	  else if(types.stream().anyMatch(obj -> obj.type.equalsIgnoreCase("Out Of Bound"))) {
		  value = "Out Of Bound";
	  }
	  else {
		  switch(Case) {
		  case 0 :
			  return AriType(types);
		  case 1:
			  return conType(types);
		  case 2:
			  return boolType(types);
		  default:
			  value = "";
		  }
		 
		  
	  }
	  
	  return types.stream().filter(obj -> obj.type.equalsIgnoreCase(value)).findFirst().orElse(null);
  }
  
  public String getSizeArray(String name) {
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  String firstLine =  att.size.toString().split("\n")[0];
	  if(firstLine.startsWith("#")) {
		  return "Size";
	  }
	  else {
		  return firstLine;
	  }
  }
  
  public ErrorToken getArrayTypeExpression(String name, String index, int line , int col) {
	  
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  String size = getSizeArray(name).replace("(", "").replace(")", "");
	  index = index.replace("(", "").replace(")", "");
	  ErrorToken er = new ErrorToken(name, col, line);
	  er.index = index;
	  
	  if(att.dataType.toString().equalsIgnoreCase("Not Define")) {
		  er.type = "Not Define";
	  }
	  else {
		  if(!att.size.toString().equalsIgnoreCase("Not Array")) {
			  
			  if(size.equalsIgnoreCase("Size")) {
				  er.type = "Size";
			  }
			  
			  else {
				  if(validateIDF.isOutOfBound(size, index)) {
					  er.type = "Out Of Bound"; 
				  }
				  else {
					  er.type = att.dataType.toString().split("\n")[0];
				  }
			  }
		  }
		  
		  else {
			  er.type = "Not Array";
		  }
	  }
	  
	return er;
  }
  
  
  
  public ErrorToken getNormalTypeExpression(String name , int line , int col) {
	  System.out.println("Name "+name);
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  ErrorToken er = new ErrorToken(name, col, line);
	  System.out.println("Name_er "+er.name);
	  
	  if(att.dataType.toString().equalsIgnoreCase("Not Define")) {
		   er.type = "Not Define";
	  }
	  else {
		  if(att.size.toString().equalsIgnoreCase("Not Array")) {
			  er.type =  att.dataType.toString().split("\n")[0];
		  }
		  
		  else {
			  er.type =  "Array";
		  }
		 
	  }
	  return er;
	
  }
  
  
  
  
 
  
  public void insertFirst(String name, int line, int column) {
	  if(!this.IDF_Map.containsKey(name)) {
			 if(validateIDF.validateIDFToken(name)) {
			  this.IDF_Map.put(name,new IDF_Attributs());
			  }
			  else {
				  this.IDF_Map.put(name,new IDF_Attributs(new StringBuilder(validateIDF.getIDFLenError(name, line, column))));
			  }
		  }
		  
  }
  
  public void appendDataType (IDF_Attributs att , String type) {
	  if(att.dataType.toString().equalsIgnoreCase("Not Defined")) {
		  att.dataType.setLength(0);
		  att.dataType.append(type);
	  }
	  
	  else {
	  att.dataType.append("\n#Redefined "+type);
	  }
  }
  
  
  public void appendMut (IDF_Attributs att , String mut) {
	  if(att.mutalability.toString().equalsIgnoreCase("Not Defined")) {
		  att.mutalability.setLength(0);
		  att.mutalability.append(mut);
	  }
	  else {
	  att.mutalability.append("\n#Redefined "+mut);
	  }
  }
  
  public void appendValue (IDF_Attributs att , String value) {
	  if(att.value.toString().equalsIgnoreCase("No Value")) {
		  att.value.setLength(0);
		  att.value.append(value);
	  }
	  else {
	  att.value.append("\n"+value);
	  }
  }
  
  public void appendErrorValue (IDF_Attributs att,String Message,String value) {
	  
	  System.out.println("BEGIN INSIDE FUNCTION "+att.value.toString());
	  
	  if(att.value.toString().equalsIgnoreCase("No Value")) {
		  att.value.setLength(0);
		  att.value.append("# "+Message+" "+value);
	  }
	  else {
	  att.value.append("\n# "+Message+" "+value);
	  }
	  
	  System.out.println("END INSIDE FUNCTION "+att.value.toString());
		 
  }
  
  public void appendError (IDF_Attributs att,String Message) {
	  if(att.error.toString().equalsIgnoreCase("No Error")) {
		  att.error.setLength(0);
		  att.error.append(Message);
	  }
	  else {
	  att.error.append("\n"+Message);
	  }
  }
  
  
  public void appendErrorSize(IDF_Attributs att,String message) {
	  if(att.size.toString().equalsIgnoreCase("Not Array")) {
		  att.size.setLength(0);
		  att.size.append("# "+message);
	  }
	  else {
	  att.size.append("\n# "+message);
	  } 
  }
  
  public void appendSize(IDF_Attributs att , String size) {
	  if(att.size.toString().equalsIgnoreCase("Not Array")) {
		  att.size.setLength(0);
		  att.size.append(size);
	  }
	  else {
	  att.size.append("\n#Redefined "+size);
	  }
  }
  
  public void updateSizeTypeValue (String name , String mutalability, String typeDeclaration ,String size , int line , int column) {
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  size  =size.replace("(", "").replace(")", "");
	  
	  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
		 appendDataType(att, typeDeclaration);
		 appendMut(att, mutalability);

		 
		 if(!validateIDF.isSizeCorrect(size)) {
			 
			 appendError(att,validateIDF.getsizeError(name, size,line, column));
			 appendErrorValue(att,"Undefined Size","{}");
		
		 }
		 
		 else {
		 appendSize(att, size);
		 appendValue(att, validateIDF.getInitArray(size, typeDeclaration));
		 }
	     this.IDF_Map.put(name,att);
		  
	  }
	  
	  else {
		  appendError(att, validateIDF.getRedefinedError(name, line, column));
		  appendMut(att, mutalability);
		  appendDataType(att, typeDeclaration);
		  appendSize(att,size); 
		  appendErrorValue(att, "Redefined", "{}");
		  
		  this.IDF_Map.put(name, att);
	  }
  }
  
  
  public void updateSizeTypeValue(String name , String mutalability, String typeDeclaration ,String size, ArrayList<ErrorToken> types , int line , int column) {
	 
	  size = size.replace("(", "").replace(")", "");
	  
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  ErrorToken typeValue = getType(types);
	  
	  ArrayList<String> initValue = new ArrayList<>();
	  
	  for(ErrorToken token : types) {
		  initValue.add(token.exp);
	  }
	  
	 
	  System.out.println(" ol "+initValue);
	  System.out.println(" ol "+typeValue.type.length());
	  System.out.println("Div By 0".length());
	  System.out.println("Equals check: " + typeValue.type.equalsIgnoreCase("Div By 0"));
	  
	  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
		 
		 appendMut(att, mutalability);
		 appendDataType(att, typeDeclaration);
		 
		 
		 if(!validateIDF.isSizeCorrect(size)) {
			 appendErrorSize(att, "Size Not Defined : "+size);
			 appendError(att,validateIDF.getsizeError(name, size, line, column));
			 appendErrorValue(att,"Undefined Size",validateIDF.getSameArray(initValue));
		 }
		 
		 else {
			 appendSize(att,size);
		 
		 
		  if(typeValue.type.equalsIgnoreCase("Not Defined")) {
			  appendError(att,validateIDF.getUndefinedError(typeValue.exp, typeValue.name,typeValue.line, typeValue.col));
              appendErrorValue(att, "Variable "+typeValue.name+" Not Defined in :", validateIDF.getSameArray(initValue));
		 }
		 
		 else if(!validateIDF.isSameType(types)) {
			 appendError(att,validateIDF.getNotSameTypeError(name, line, column));
			 appendErrorValue(att,"Not Same Type", validateIDF.getSameArray(initValue));
		 }
		 
		 else if(!validateIDF.isRespectingSize(size, initValue)) {
			 appendError(att,validateIDF.getManyElementError(name, line, column));
			 appendErrorValue(att,"Element Out Of Bound", validateIDF.getArray(size,initValue,typeDeclaration));
			 }
		
		 else if(typeValue.type.equalsIgnoreCase("Array")) {
				  appendError(att, validateIDF.getArrayError(typeValue.name,typeValue.exp,typeValue.line, typeValue.col));
				  appendErrorValue(att, "Array "+typeValue.name+" in :", validateIDF.getSameArray(initValue));  
			 }
			 
			 else if(typeValue.type.equalsIgnoreCase("Not Array")) {
				 appendError(att, validateIDF.getIndexingError(typeValue.exp,typeValue.index, typeValue.name,typeValue.line, typeValue.col));
				 appendErrorValue(att, "Indexing Non Array Variable "+typeValue.name+" in : ", validateIDF.getSameArray(initValue)); 
		
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Out Of Bound")) {
				 appendError(att, validateIDF.getBoundError(typeValue.index,typeValue.name,typeValue.exp,typeValue.line, typeValue.col));
				 appendErrorValue(att, "Variable Out Of Bound "+typeValue.name+"["+typeValue.index+"] in :", validateIDF.getSameArray(initValue));   
				   
			 }
			 
			 else if(typeValue.type.equalsIgnoreCase("EXP")) {
				 appendError(att, validateIDF.getValueError(typeValue.exp,typeValue.name,typeValue.line, typeValue.col));
				 appendErrorValue(att, "Not Defined Properly for "+typeValue.name +" in :", validateIDF.getSameArray(initValue));   
				  
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Div By 0")) {
				 
				 appendError(att, validateIDF.getDivError(typeValue.exp,typeValue.line, typeValue.col));
				 appendErrorValue(att, "Div By 0 :", validateIDF.getSameArray(initValue));  
				 
			 }
			 
			 else if(!att.dataType.toString().split("\n")[0].equalsIgnoreCase("float") && !typeValue.type.equalsIgnoreCase("int") && !att.dataType.toString().split("\n")[0].equalsIgnoreCase(typeValue.type)) {
				 appendError(att, validateIDF.getMissmatchError(name, line, column));
				 appendErrorValue(att, "MissMatch ", validateIDF.getSameArray(initValue)); 
			 }
			 
			 else {
				 appendValue(att,validateIDF.getArray(size, initValue, typeDeclaration));
			 }
			 
			 
			 this.IDF_Map.put(name,att);
			  
		  }
		  
	  }
	  
	  
	  else {
		  appendError(att, validateIDF.getRedefinedError(name, line, column));
		  appendMut(att, mutalability);
		  appendDataType(att, typeDeclaration);
		  appendSize(att, size);
		  appendErrorValue(att,"Redefined",validateIDF.getSameArray(initValue));
		  
		 
		  
		  this.IDF_Map.put(name, att);
	  }
	 
  }
  
  
  
  public void updateSizeType(String name , String mutalability, String typeDeclaration ,String size , int line , int column) {
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  size = size.replace("(", "").replace(")", "");
	  
	  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
		 appendDataType(att, typeDeclaration);
		 appendMut(att, mutalability);
		 	 
		
		 if(!validateIDF.isSizeCorrect(size)) {
			 appendError(att, validateIDF.getsizeError(name,size, line, column));
			 appendErrorSize(att, "Size Not Defined : "+size);
		 }
		 else {
			 appendSize(att, size);
		 }
		 
	     this.IDF_Map.put(name,att);
		  
	  }
	  
	  else {
		  appendError(att, validateIDF.getRedefinedError(name, line, column));  
		  appendMut(att,mutalability);
		  appendDataType(att, typeDeclaration);
		  appendSize(att, size);
		  this.IDF_Map.put(name, att);
	  }
  }
  
  
  public void updateType(String name , String mutalability,String typeDeclaration, int line , int column) {
	 System.out.println("Type "+name);
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  
	  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
		 appendDataType(att, typeDeclaration);
		 appendMut(att, mutalability);
		  
		 this.IDF_Map.put(name,att);
		  
	  }
	  
	  else {
		  appendError(att, validateIDF.getRedefinedError(name, line, column));
		  appendDataType(att, typeDeclaration);
		  appendMut(att, mutalability);
		  this.IDF_Map.put(name, att);
	  }
  }
  
public void updateTypeValue(String name , String mutalability,String typeDeclaration, String initValue, ArrayList<ErrorToken> types, int line , int column) {
	 	  ErrorToken typeValue = getType(types);
	      System.out.println("init name "+name+"val" +initValue+" typeDec "+typeDeclaration+" typeVal "+typeValue.type);
		  IDF_Attributs att =  this.IDF_Map.get(name);
		  
		  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
			  	appendDataType(att, typeDeclaration);
				appendMut(att, mutalability);
			 
			 if(typeValue.type.equalsIgnoreCase("Not Defined")) {
				 
					appendError(att, validateIDF.getUndefinedError(initValue, typeValue.name,typeValue.line, typeValue.col));
					appendErrorValue(att, "Variable "+typeValue.name+" Not Defined in :", initValue); 
				 
			 }
			 else if(typeValue.type.equalsIgnoreCase("Array")) {
				 appendError(att, validateIDF.getArrayError(initValue, name,typeValue.line, typeValue.col));
				 appendErrorValue(att, "Array "+typeValue.name+" in :", initValue);  
			 }
			 
			 else if(typeValue.type.equalsIgnoreCase("Not Array")) {
					appendError(att, validateIDF.getIndexingError(initValue,typeValue.index, typeValue.name,typeValue.line, typeValue.col));
					appendErrorValue(att, "Indexing Non Array Variable "+typeValue.name+" in : ", initValue); 
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Out Of Bound")) {
				 	appendError(att, validateIDF.getBoundError(typeValue.index,typeValue.name,initValue,typeValue.line, typeValue.col));
					appendErrorValue(att, "Variable Out Of Bound "+typeValue.name+"["+typeValue.index+"] in :", initValue);   
			 }
			 
			 else if(typeValue.type.equalsIgnoreCase("EXP")) {
					appendError(att, validateIDF.getValueError(initValue,typeValue.name,typeValue.line, typeValue.col));
					appendErrorValue(att, "Not Defined Properly for "+typeValue.name +" in :", initValue);   
		 
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Div By 0")) {
				 appendError(att, validateIDF.getDivError(initValue,typeValue.line, typeValue.col));
				 appendErrorValue(att, "Div By 0 :", initValue);  
			 }
			 
			 else if(!att.dataType.toString().split("\n")[0].equalsIgnoreCase("float") && !typeValue.type.equalsIgnoreCase("int") && !att.dataType.toString().split("\n")[0].equalsIgnoreCase(typeValue.type)) {
				System.out.println("Missmatch "+name);
				System.out.println(att.value.toString());
				appendError(att, validateIDF.getMissmatchError(name, line, column));
				appendErrorValue(att, "MissMatch ", initValue); 
               
			 }
			 
			 else {
				 appendValue(att, initValue);
			 }
			 
			 this.IDF_Map.put(name,att);
			  
		  }
		  
		  else {
			  appendError(att, validateIDF.getRedefinedError(name, line, column));
			  appendDataType(att, typeDeclaration);
			  appendMut(att, mutalability);
			  appendErrorValue(att,"Redefined",initValue);
			  
			  this.IDF_Map.put(name, att);
		  }
		  
		  System.out.println("END UPDATE FUNC FOR "+name+" VALUE "+	IDF_Map.get(name).value.toString());
		  
}

public void affectEmptyArray(String name ,ErrorToken IDF_type, int line , int column) {
	
IDF_Attributs att =  this.IDF_Map.get(name);
	
	if(IDF_type.type.equalsIgnoreCase("Not Defined")) {
		
		appendError(att, validateIDF.getUndefinedError(name,line, column));
		appendErrorValue(att, "Variable "+name+" Not Defined :", "{}");
             
	}
	

		else {
		String mul = att.mutalability.toString().split("\n")[0];
		String dataType = att.dataType.toString().split("\n")[0];
		String value = att.value.toString().split("\n")[0];
		String size = att.size.toString().split("\n")[0];
		
		if(size.equalsIgnoreCase("Not Array")) {
				
				appendError(att, validateIDF.getNotArrayAffect(name,line, column));
				System.out.println("Affect EMPTY NON ARRAY ERROR : "+name+" := {}");
				appendErrorValue(att, "Affect Array To Non Array "+name+" :","{}");
				
			}
		
		
		else if(mul.equalsIgnoreCase("Constant") && !value.equalsIgnoreCase("Not Defined")) {
			 
				appendError(att, validateIDF.getConstantError(name,line, column));
				appendErrorValue(att, "Constant "+name+" :", "{}");   
		}
		
		 else {
			appendValue(att,validateIDF.getDefaultArray(dataType, size));
		 }
		 
		 this.IDF_Map.put(name,att);
		  
	  }
	
	 
	}


		public void affectArray(String name ,ErrorToken IDF_type,ArrayList<ErrorToken> types, int line , int column) {
		IDF_Attributs att =  this.IDF_Map.get(name);
		ErrorToken typeValue = getType(types);
		System.out.println("Array "+name+" "+att.size.toString().equalsIgnoreCase("Not Array"));
		System.out.println();
		ArrayList<String> Value = new ArrayList<>();
		
		for(ErrorToken token : types) {
			  Value.add(token.exp);
		}	
	if(IDF_type.type.equalsIgnoreCase("Not Defined")) {
		
		appendError(att, validateIDF.getUndefinedError(name,line, column));
		appendErrorValue(att, "Variable "+name+" Not Defined :", validateIDF.getSameArray(Value));
	         
	}
	
	
	else {
		String mul = att.mutalability.toString().split("\n")[0];
		String dataType = att.dataType.toString().split("\n")[0];
		String value = att.value.toString().split("\n")[0];
		String size = att.size.toString().split("\n")[0];
		
		 if(size.equalsIgnoreCase("Not Array")) {
			
			appendError(att, validateIDF.getNotArrayAffect(name,line, column));
			System.out.println("AFFECT ARRAY NON ARRAY ERROR : "+name+" := "+Value);
			appendErrorValue(att, "Affect Array To Non Array "+name+" :", validateIDF.getSameArray(Value));
			
		}
		 

		
		 else if(mul.equalsIgnoreCase("Constant") && !value.equalsIgnoreCase("Not Defined")) {
			 
			appendError(att, validateIDF.getConstantError(name,line, column));
			appendErrorValue(att, "Constant "+name+" :", validateIDF.getDefaultArray(dataType, size));   
	    }
		 
		 else if(typeValue.type.equalsIgnoreCase("Not Defined")) {
				
				appendError(att, validateIDF.getUndefinedError(typeValue.exp, typeValue.name,typeValue.line, typeValue.col));
				appendErrorValue(att, "Variable "+typeValue.name+" Not Defined in :", validateIDF.getSameArray(Value));    
		  }
		 
		 else if (typeValue.type.equalsIgnoreCase("size")) {
			 appendError(att, validateIDF.getSizeDefError(typeValue.name,typeValue.exp,typeValue.line,typeValue.col));
			 appendErrorSize(att, "Size Not Defined In : "+validateIDF.getSameArray(Value));
		
		}
		
		
		 else if(!validateIDF.isSameType(types)) {
			 
			 appendError(att,validateIDF.getNotSameTypeError(name, line, column));
			 appendErrorValue(att,"Not Same Type", validateIDF.getSameArray(Value));
	
		 }
		 
		 else if(!validateIDF.isRespectingSize(size, Value)) {
			 appendError(att,validateIDF.getManyElementError(name, line, column));
			 appendErrorValue(att,"Element Out Of Bound", validateIDF.getArray(size,Value,dataType));
		 }
		 
		 else if(typeValue.type.equalsIgnoreCase("Array")) {
			    System.out.println("AFFECT ARRAY ARRAY");
				appendError(att, validateIDF.getArrayError(typeValue.name, typeValue.exp,typeValue.line, typeValue.col));
				appendErrorValue(att, "Array "+typeValue.name+" in :", validateIDF.getSameArray(Value));  
			 
		 }
		 
		 else if(typeValue.type.equalsIgnoreCase("Not Array")) {
				appendError(att, validateIDF.getIndexingError(typeValue.name,typeValue.index, typeValue.exp,typeValue.line, typeValue.col));
				appendErrorValue(att, "Indexing Non Array Variable "+typeValue.name+" in : ", validateIDF.getSameArray(Value)); 
		
		 }
		 
		 
		 else if(typeValue.type.equalsIgnoreCase("Out Of Bound")) {
				
				appendError(att, validateIDF.getBoundError(typeValue.index,typeValue.name,typeValue.exp,typeValue.line, typeValue.col));
				appendErrorValue(att, "Variable Out Of Bound "+typeValue.name+"["+typeValue.index+"] in :", validateIDF.getSameArray(Value));   
		     
		 }
		 
		 else if(typeValue.type.equalsIgnoreCase("EXP")) {
			 
				appendError(att, validateIDF.getValueError(typeValue.exp,typeValue.name,typeValue.line, typeValue.col));
				appendErrorValue(att, "Not Defined Properly for "+typeValue.name +" in :", validateIDF.getSameArray(Value));   
		 }
		 
		 
		 else if(typeValue.type.equalsIgnoreCase("Div By 0")) {
			 
			appendError(att, validateIDF.getDivError(typeValue.exp,typeValue.line, typeValue.col));
			appendErrorValue(att, "Div By 0 :",validateIDF.getSameArray(Value));   
		
		 }
		 
		 else if(!dataType.equalsIgnoreCase("float") && !dataType.equalsIgnoreCase("int") && dataType.equalsIgnoreCase(typeValue.type))  {
			 
			appendError(att, validateIDF.getMissmatchError(name, line, column));
			appendErrorValue(att, "MissMatch ", validateIDF.getSameArray(Value));  
			
		 }
		 
		 else {
			appendValue(att, value);
		 }
	
	}
		
				 System.out.println("EEEEEEEEEEEE "+att.error);
				 this.IDF_Map.put(name,att);			  
		  
		
		 
	}
		
		
		public void affectMONO(String Value,ErrorToken IDF_type, ErrorToken typeValue,int line , int column) {
			String name = IDF_type.name;
			String typeIDF = IDF_type.type;
			
			String typeAffect = affectNull(typeValue.type);
			
			String indexIDF = affectNull(IDF_type.index);
			String indexAffect = affectNull(typeValue.index);
			IDF_Attributs att =  this.IDF_Map.get(name);
			
			String sizeIDF = att.size.toString().split("\n")[0].replace("(", "").replace(")", "");
			String sizeAffect = this.IDF_Map.get(typeValue.name).size.toString().split("\n")[0].replace("(", "").replace(")", "");
			
			
			System.out.println("name AFFECT "+name+" VALUE "+att.value.toString());
			System.out.println(
				    "CONDITION " + (indexIDF == null) + 
				    " d " + (indexAffect == null) + 
				    " typeNotSize=" + (typeValue != null && !typeValue.type.equalsIgnoreCase("size")) + 
				    " sizeIDFValid=" + (sizeIDF != null && !sizeIDF.equalsIgnoreCase("Not Array")) + 
				    " sizeAffectValid=" + (sizeAffect != null && !sizeAffect.equalsIgnoreCase("Not Array")));
			if(!sizeIDF.equalsIgnoreCase("Not Array")  && !sizeAffect.equalsIgnoreCase("Not Array")) {
			System.out.println( " isSmaller=" + (validateIDF.isAffectSmaller(sizeIDF, sizeAffect)));
			}
			
			if ( indexIDF!=null ) {
				Value = name+"[ "+ indexIDF + " ] = "+Value ;
			}
			
			
			/*System.out.println("EXP : "+name+" := "+Value);
			System.out.println("IDF TYPE : "+IDF_type.type);
			System.out.println("VALUE TYPE : "+typeValue.type);
			System.out.println(IDF_type.type.equalsIgnoreCase("Array"));
			*/
			
		if(IDF_type.type.equalsIgnoreCase("Not Defined")) {
			
			appendError(att, validateIDF.getUndefinedError(name,line, column));
			appendErrorValue(att, "Variable "+name+" Not Defined :", Value);
		         
		} 
		
		 else if (typeIDF.equalsIgnoreCase("size")) {
			 appendError(att, validateIDF.getsizeError(name,line,column));
			 appendErrorSize(att, "Size Not Defined For "+name+" : "+Value);
		
		}
		 
		 else if(typeIDF.equalsIgnoreCase("Out Of Bound")) {
				
				appendError(att, validateIDF.getBoundError(indexIDF,name,line,column));
				appendErrorValue(att, "Variable Out Of Bound "+name+"["+indexIDF+"] :", Value);   
		     
		 }
		 else if(indexIDF == null && indexAffect == null && !typeValue.type.equalsIgnoreCase("size") && !sizeIDF.equalsIgnoreCase("Not Array") && !sizeAffect.equalsIgnoreCase("Not Array") && validateIDF.isAffectSmaller(sizeIDF, sizeAffect)) {
			 appendError(att, validateIDF.getGreaterArray(name,typeValue.name,line, column));
			 appendErrorValue(att, "Affect Array Of Greater Size To Array  :",Value);
				 
		 }
		
		else  if(indexIDF == null && indexAffect == null && typeIDF.equalsIgnoreCase("Array") && !typeAffect.equalsIgnoreCase(typeIDF)) {
			appendError(att, validateIDF.getArrayAffect(name,line, column));
			appendErrorValue(att, "Affect Non Array To Array "+name+" :",Value);
			
		}
		else  if(indexIDF == null && indexAffect != null && typeIDF.equalsIgnoreCase("Array")) {
			appendError(att, validateIDF.getArrayAffect(name,line, column));
			appendErrorValue(att, "Affect Non Array To Array "+name+" :",Value);
			
		}
		else  if(indexIDF != null && indexAffect == null && typeAffect.equalsIgnoreCase("Array")) {
			appendError(att, validateIDF.getNotArrayAffect(name,line, column));
			appendErrorValue(att, "Affect Array To Non Array "+name+" :",Value);
			
		}
		
		
		
		else {
			String mul = att.mutalability.toString().split("\n")[0];
			String dataType = att.dataType.toString().split("\n")[0];
			String mapValue = att.value.toString().split("\n")[0];
			String size = att.size.toString().split("\n")[0];
			 
			
			  if(mul.equalsIgnoreCase("Constant") && !mapValue.equalsIgnoreCase("Not Defined")) {
				 
				appendError(att, validateIDF.getConstantError(name,line, column));
				appendErrorValue(att, "Constant "+name+" :", validateIDF.getDefaultArray(dataType, size));   
		    }
			 
			 else if(typeValue.type.equalsIgnoreCase("Not Defined")) {
					
					appendError(att, validateIDF.getUndefinedError(Value, typeValue.name,typeValue.line, typeValue.col));
					appendErrorValue(att, "Variable "+typeValue.name+" Not Defined in :", Value);    
			  }
			
			 else if (typeAffect.equalsIgnoreCase("size")) {
				 appendError(att, validateIDF.getsizeError(typeValue.name,typeValue.line,typeValue.col));
				 appendErrorSize(att, "Size Not Defined For "+name+" : "+Value);
			
			}
			 
			 
	
			 
			 else if(typeValue.type.equalsIgnoreCase("Not Array")) {
					appendError(att, validateIDF.getIndexingError(typeValue.name,typeValue.index, Value,typeValue.line, typeValue.col));
					appendErrorValue(att, "Indexing Non Array Variable "+typeValue.name+" in : ", Value); 
			
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Out Of Bound")) {
					
					appendError(att, validateIDF.getBoundError(typeValue.index,typeValue.name,Value,typeValue.line, typeValue.col));
					appendErrorValue(att, "Variable Out Of Bound "+typeValue.name+"["+typeValue.index+"] in :", Value);   
			     
			 }
			 
			 else if(typeValue.type.equalsIgnoreCase("EXP")) {
				 
					appendError(att, validateIDF.getValueError(Value,typeValue.name,typeValue.line, typeValue.col));
					appendErrorValue(att, "Not Defined Properly for "+typeValue.name +" in :", Value);   
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Div By 0")) {
				 
				appendError(att, validateIDF.getDivError(Value,typeValue.line, typeValue.col));
				appendErrorValue(att, "Div By 0 :", Value);   
			
			 }
			 
			 else if(!dataType.equalsIgnoreCase("float") && !dataType.equalsIgnoreCase("int") && dataType.equalsIgnoreCase(typeValue.type))  {
				 
				appendError(att, validateIDF.getMissmatchError(name, line, column));
				appendErrorValue(att, "MissMatch ", Value);  
				
			 }
			 
			 else {
				appendValue(att, Value);
			 }
		
		}
					 
					 System.out.println("END AFFECT "+name+" VALUE "+att.value.toString());

					 System.out.println("EEEEEEEEEEEE "+att.error);
					 this.IDF_Map.put(name,att);			  
			  
			
			 
		}

		public String affectNull(String a) {
			if(a==null) {
				return null;
			}
			
			else {
				return a;
			}
		}
		
		public void affectEXP(String Value,ErrorToken IDF_type, ErrorToken typeValue,int line , int column) {
			String name = IDF_type.name;
			String typeIDF = IDF_type.type;
			String typeAffect = affectNull(typeValue.type);
			
			String indexIDF = affectNull(IDF_type.index);
		//	String indexAffect = affectNull(typeValue.index);
			IDF_Attributs att =  this.IDF_Map.get(name);
			
			if ( indexIDF!=null ) {
				Value = name+"[ "+ indexIDF + " ] = "+Value ;
			}
			
			
			/*System.out.println("EXP : "+name+" := "+Value);
			System.out.println("IDF TYPE : "+IDF_type.type);
			System.out.println("VALUE TYPE : "+typeValue.type);
			System.out.println(IDF_type.type.equalsIgnoreCase("Array"));
			*/
			
		if(IDF_type.type.equalsIgnoreCase("Not Defined")) {
			
			appendError(att, validateIDF.getUndefinedError(name,line, column));
			appendErrorValue(att, "Variable "+name+" Not Defined :", Value);
		         
		} 
		
		 else if (typeAffect.equalsIgnoreCase("size")) {
			 appendError(att, validateIDF.getsizeError(typeValue.name,typeValue.line,typeValue.col));
			 appendErrorSize(att, "Size Not Defined For "+name+" : "+Value);
		
		}
		
		 else if(typeIDF.equalsIgnoreCase("Out Of Bound")) {
				
				appendError(att, validateIDF.getBoundError(indexIDF,name,line,column));
				appendErrorValue(att, "Variable Out Of Bound "+name+"["+indexIDF+"] :", Value);   
		     
		 }
		else  if(indexIDF == null) {
			appendError(att, validateIDF.getArrayAffect(name,line, column));
			appendErrorValue(att, "Affect Non Array To Array "+name+" :",Value);
			
		}
		
		
		
		
		else {
			String mul = att.mutalability.toString().split("\n")[0];
			String dataType = att.dataType.toString().split("\n")[0];
			String mapValue = att.value.toString().split("\n")[0];
			String size = att.size.toString().split("\n")[0];
			
			 if(size.equalsIgnoreCase("Not Array")) {
				 System.out.println("AFFECT VALUE NON ARRAY ERROR : "+name+" := "+Value);
				appendError(att, validateIDF.getNotArrayAffect(name,line, column));
				appendErrorValue(att, "Affect Array To Non Array "+name+" :", Value);
				
			}
			 
			
			 else if(mul.equalsIgnoreCase("Constant") && !mapValue.equalsIgnoreCase("Not Defined")) {
				 
				appendError(att, validateIDF.getConstantError(name,line, column));
				appendErrorValue(att, "Constant "+name+" :", validateIDF.getDefaultArray(dataType, size));   
		    }
			 
			 else if(typeValue.type.equalsIgnoreCase("Not Defined")) {
					
					appendError(att, validateIDF.getUndefinedError(Value, typeValue.name,typeValue.line, typeValue.col));
					appendErrorValue(att, "Variable "+typeValue.name+" Not Defined in :", Value);    
			  }
			
			 else if (typeValue.type.equalsIgnoreCase("size")) {
				 appendError(att, validateIDF.getSizeDefError(typeValue.name,Value,typeValue.line,typeValue.col));
				 appendErrorSize(att, "Size Not Defined In : "+Value);
			
			}
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Array")) {
				 
					appendError(att, validateIDF.getArrayError(typeValue.name, Value,typeValue.line, typeValue.col));
					appendErrorValue(att, "Array "+typeValue.name+" in :", Value);  
				 
			 }
			 
			 else if(typeValue.type.equalsIgnoreCase("Not Array")) {
					appendError(att, validateIDF.getIndexingError(typeValue.name,typeValue.index, Value,typeValue.line, typeValue.col));
					appendErrorValue(att, "Indexing Non Array Variable "+typeValue.name+" in : ", Value); 
			
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Out Of Bound")) {
					
					appendError(att, validateIDF.getBoundError(typeValue.index,typeValue.name,Value,typeValue.line, typeValue.col));
					appendErrorValue(att, "Variable Out Of Bound "+typeValue.name+"["+typeValue.index+"] in :", Value);   
			     
			 }
			 
			 else if(typeValue.type.equalsIgnoreCase("EXP")) {
				 
					appendError(att, validateIDF.getValueError(Value,typeValue.name,typeValue.line, typeValue.col));
					appendErrorValue(att, "Not Defined Properly for "+typeValue.name +" in :", Value);   
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Div By 0")) {
				 
				appendError(att, validateIDF.getDivError(Value,typeValue.line, typeValue.col));
				appendErrorValue(att, "Div By 0 :", Value);   
			
			 }
			 
			 else if(!dataType.equalsIgnoreCase("float") && !dataType.equalsIgnoreCase("int") && dataType.equalsIgnoreCase(typeValue.type))  {
				 
				appendError(att, validateIDF.getMissmatchError(name, line, column));
				appendErrorValue(att, "MissMatch ", Value);  
				
			 }
			 
			 else {
				appendValue(att, Value);
			 }
		
		}
			
					 System.out.println("EEEEEEEEEEEE "+att.error);
					 this.IDF_Map.put(name,att);			  
			  
			
			 
		}




					public void affectValue(String name, String Value ,ErrorToken IDF_type, ErrorToken typeValue,int line , int column) {
					IDF_Attributs att =  this.IDF_Map.get(name);
					
					System.out.println("EXP : "+name+" := "+Value);
					System.out.println("IDF TYPE : "+IDF_type.type);
					System.out.println("VALUE TYPE : "+typeValue.type);
					System.out.println(IDF_type.type.equalsIgnoreCase("Array"));
					
					
				if(IDF_type.type.equalsIgnoreCase("Not Defined")) {
					
					appendError(att, validateIDF.getUndefinedError(name,line, column));
					appendErrorValue(att, "Variable "+name+" Not Defined :", Value);
				         
				} 
				else  if(IDF_type.type.equalsIgnoreCase("Array")) {
					System.out.println("AFFECT VALUE ARRAY ERROR : "+name+" := "+Value);
					appendError(att, validateIDF.getArrayAffect(name,line, column));
					appendErrorValue(att, "Affect Non Array To Array "+name+" :",Value);
					
				}
				
				
				else {
					String mul = att.mutalability.toString().split("\n")[0];
					String dataType = att.dataType.toString().split("\n")[0];
					String value = att.value.toString().split("\n")[0];
					String size = att.size.toString().split("\n")[0];
					
					 if(size.equalsIgnoreCase("Not Array")) {
						 System.out.println("AFFECT VALUE NON ARRAY ERROR : "+name+" := "+Value);
						appendError(att, validateIDF.getNotArrayAffect(name,line, column));
						appendErrorValue(att, "Affect Array To Non Array "+name+" :", Value);
						
					}
					 
					
					 else if(mul.equalsIgnoreCase("Constant") && !value.equalsIgnoreCase("Not Defined")) {
						 
						appendError(att, validateIDF.getConstantError(name,line, column));
						appendErrorValue(att, "Constant "+name+" :", validateIDF.getDefaultArray(dataType, size));   
				    }
					 
					 else if(typeValue.type.equalsIgnoreCase("Not Defined")) {
							
							appendError(att, validateIDF.getUndefinedError(typeValue.exp, typeValue.name,typeValue.line, typeValue.col));
							appendErrorValue(att, "Variable "+typeValue.name+" Not Defined in :", Value);    
					  }
					
					 else if (typeValue.type.equalsIgnoreCase("size")) {
						 appendError(att, validateIDF.getSizeDefError(typeValue.name,Value,typeValue.line,typeValue.col));
						 appendErrorSize(att, "Size Not Defined In : "+Value);
					
					}
					 
					 
					 else if(typeValue.type.equalsIgnoreCase("Array")) {
						 
							appendError(att, validateIDF.getArrayError(typeValue.name, typeValue.exp,typeValue.line, typeValue.col));
							appendErrorValue(att, "Array "+typeValue.name+" in :", Value);  
						 
					 }
					 
					 else if(typeValue.type.equalsIgnoreCase("Not Array")) {
							appendError(att, validateIDF.getIndexingError(typeValue.name,typeValue.index, typeValue.exp,typeValue.line, typeValue.col));
							appendErrorValue(att, "Indexing Non Array Variable "+typeValue.name+" in : ", Value); 
					
					 }
					 
					 
					 else if(typeValue.type.equalsIgnoreCase("Out Of Bound")) {
							
							appendError(att, validateIDF.getBoundError(typeValue.index,typeValue.name,typeValue.exp,typeValue.line, typeValue.col));
							appendErrorValue(att, "Variable Out Of Bound "+typeValue.name+"["+typeValue.index+"] in :", Value);   
					     
					 }
					 
					 else if(typeValue.type.equalsIgnoreCase("EXP")) {
						 
							appendError(att, validateIDF.getValueError(typeValue.exp,typeValue.name,typeValue.line, typeValue.col));
							appendErrorValue(att, "Not Defined Properly for "+typeValue.name +" in :", Value);   
					 }
					 
					 
					 else if(typeValue.type.equalsIgnoreCase("Div By 0")) {
						 
						appendError(att, validateIDF.getDivError(typeValue.exp,typeValue.line, typeValue.col));
						appendErrorValue(att, "Div By 0 :", Value);   
					
					 }
					 
					 else if(!dataType.equalsIgnoreCase("float") && !dataType.equalsIgnoreCase("int") && dataType.equalsIgnoreCase(typeValue.type))  {
						 
						appendError(att, validateIDF.getMissmatchError(name, line, column));
						appendErrorValue(att, "MissMatch ", Value);  
						
					 }
					 
					 else {
						appendValue(att, value);
					 }
				
				}
					
							 System.out.println("EEEEEEEEEEEE "+att.error);
							 this.IDF_Map.put(name,att);			  
					  
					
					 
				}

				
		
	
	

  
  public void printTable() {
      System.out.println("Table: Size = " + this.IDF_Map.size());
    for (Map.Entry<String, IDF_Attributs> entry : this.IDF_Map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }

 }
