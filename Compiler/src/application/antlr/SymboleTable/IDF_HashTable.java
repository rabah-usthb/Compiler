package application.antlr.SymboleTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import application.antlr.validate.validateIDF;

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
		  return "Not Define";
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
	  er.size = index;
	  
	  if(att.dataType.toString().equalsIgnoreCase("Not Define")) {
		  er.type = "Not Define";
	  }
	  else {
		  if(!att.size.toString().equalsIgnoreCase("Not Array")) {
			  
			  if(size.equals("Not Defined")) {
				  er.type = "Not Defined";
			  }
			  
			  else {
				  
				  int indexValue;
				  int sizeValue;
				  
				  try {
					  sizeValue = Integer.parseInt(size);
					  indexValue = Integer.parseInt(size); 
					  
					  if(indexValue<0 || indexValue>sizeValue -1 ) {
						  er.type = "Out Of Bound";
					  }
					  
				  }
				  catch (NumberFormatException e) {
					  er.type = "Out Of Bound";
				  }
			  
				 er.type = att.dataType.toString().split("\n")[0];
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
				  this.IDF_Map.put(name,new IDF_Attributs(new StringBuilder(validateIDF.getSizeError(name, line, column))));
			  }
		  }
		  
  }
  
  public void updateSizeTypeValue (String name , String mutalability, String typeDeclaration ,String size , int line , int column) {
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  
	  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
		 att.dataType.setLength(0);
		 att.mutalability.setLength(0);
		 att.size.setLength(0);
		 att.value.setLength(0);
		 att.size.append(size.replace("(", "").replace(")", ""));
		 att.dataType.append(typeDeclaration);
		 att.mutalability.append(mutalability);
		 
		 if(!validateIDF.isSizeCorrect(size)) {
			 if(att.error.toString().equalsIgnoreCase("No Error")) {
				 att.error.setLength(0);
			 }
			 att.error.append(validateIDF.getSizeError(name, line, column));
			 att.value.append("Undefined Size {}");
		 }
		 
		 else {
		 att.value.append(validateIDF.getInitArray(size, typeDeclaration));
		 }
	     this.IDF_Map.put(name,att);
		  
	  }
	  
	  else {
		  att.error.append(validateIDF.getRedefinedError(name, line, column));
		  att.mutalability.append("\n Redefined "+mutalability);
		  att.dataType.append("\n Redefined "+typeDeclaration);
		  att.size.append("\n Redefined "+size.replace("(", "").replace(")", ""));
		  
		  if(att.value.toString().equalsIgnoreCase("Not Defined")) {
			  att.value.setLength(0);
			  att.value.append("Redefined {}");
		  }
		  
		  else {
			  att.value.append("\n Redefined {}");
		  }
		  
		  this.IDF_Map.put(name, att);
	  }
  }
  
  public void updateSizeTypeValue(String name , String mutalability, String typeDeclaration ,String size, ArrayList<ErrorToken> types , int line , int column) {
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  
	  ArrayList<String> initValue = new ArrayList<>();
	  
	  for(ErrorToken token : types) {
		  initValue.add(token.exp);
	  }
	  
	  
	  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
		 att.dataType.setLength(0);
		 att.mutalability.setLength(0);
		 att.size.setLength(0);
		 att.value.setLength(0);
		 att.size.append(size.replace("(", "").replace(")", ""));
		 att.dataType.append(typeDeclaration);
		 att.mutalability.append(mutalability);
		 
		 if(!validateIDF.isSizeCorrect(size)) {
			 if(att.error.toString().equalsIgnoreCase("No Error")) {
				 att.error.setLength(0);
			 }
			 System.out.println(initValue);
			 att.error.append(validateIDF.getsizeError(name, size, line, column));
			 att.value.append("Undefined Size "+validateIDF.getSameArray(initValue));
		 }
		 
		 else if(!validateIDF.isSameType(types)) {
			 if(att.error.toString().equalsIgnoreCase("No Error")) {
				 att.error.setLength(0);
			 }
			 att.error.append(validateIDF.getNotSameTypeError(name, line, column));
			 att.value.append("Not Same Type "+validateIDF.getSameArray(initValue));
		 }
		 
		 else if(!typeDeclaration.equalsIgnoreCase(types.getFirst().type)) {
			 if(att.error.toString().equalsIgnoreCase("No Error")) {
				 att.error.setLength(0);
			 }
			 att.error.append(validateIDF.getMissmatchError(name, line, column));
			 att.value.append("MissMatch Type "+validateIDF.getSameArray(initValue));
		 }
		 
		 else if(!validateIDF.isRespectingSize(size, initValue)) {
			 if(att.error.toString().equalsIgnoreCase("No Error")) {
				 att.error.setLength(0);
			 }
			 att.error.append(validateIDF.getMissmatchError(name, line, column));
			 att.value.append("#Element OutOfBound "+validateIDF.getArray(size,initValue,typeDeclaration));
		 }
		 else {
		 ErrorToken token  = getType(types);
		 if(token == null) {att.value.append(validateIDF.getArray(size,initValue,typeDeclaration));}
		 else {
			 
		 }
		 }
	     this.IDF_Map.put(name,att);
		  
	  }
	  
	  else {
		  att.error.append(validateIDF.getRedefinedError(name, line, column));
		  att.mutalability.append("\n#Redefined "+mutalability);
		  att.dataType.append("\n#Redefined "+typeDeclaration);
		  att.size.append("\n#Redefined "+size.replace("(", "").replace(")", ""));
		  
		  if(att.value.toString().equalsIgnoreCase("Not Defined")) {
			  att.value.setLength(0);
			  att.value.append("#Redefined "+validateIDF.getSameArray(initValue));
		  }
		  
		  else {
			  att.value.append("\n#Redefined "+validateIDF.getSameArray(initValue));
		  }
		  
		  this.IDF_Map.put(name, att);
	  }
  }
  
  
  
  public void updateSizeType(String name , String mutalability, String typeDeclaration ,String size , int line , int column) {
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  
	  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
		 att.dataType.setLength(0);
		 att.mutalability.setLength(0);
		 att.size.setLength(0);
		 att.size.append(size.replace("(", "").replace(")", ""));
		 att.dataType.append(typeDeclaration);
		 att.mutalability.append(mutalability);
		 
		 if(!validateIDF.isSizeCorrect(size)) {
			 if(att.error.toString().equalsIgnoreCase("No Error")) {
				 att.error.setLength(0);
			 }
			 att.error.append(validateIDF.getSizeError(name, line, column));
		 }
		 
	     this.IDF_Map.put(name,att);
		  
	  }
	  
	  else {
		  att.error.append(validateIDF.getRedefinedError(name, line, column));
		  att.mutalability.append("\n Redefined "+mutalability);
		  att.dataType.append("\n Redefined "+typeDeclaration);
		  att.size.append("\n Redefined "+size.replace("(", "").replace(")", ""));
		  this.IDF_Map.put(name, att);
	  }
  }
  
  
  public void updateType(String name , String mutalability,String typeDeclaration, int line , int column) {
	 System.out.println("Type "+name);
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  
	  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
		 att.dataType.setLength(0);
		 att.mutalability.setLength(0);
		 att.dataType.append(typeDeclaration);
		 att.mutalability.append(mutalability);
		  
			  this.IDF_Map.put(name,att);
		  
	  }
	  
	  else {
		  att.error.append(validateIDF.getRedefinedError(name, line, column));
		  att.mutalability.append("\n# Redefined "+mutalability);
		  att.dataType.append("\n# Redefined "+typeDeclaration);
		  this.IDF_Map.put(name, att);
	  }
  }
  
public void updateTypeValue(String name , String mutalability,String typeDeclaration, String initValue, ArrayList<ErrorToken> types, int line , int column) {
	 	  ErrorToken typeValue = getType(types);
	      System.out.println("init "+initValue+" typeDec "+typeDeclaration+" typeVal "+typeValue);
		  IDF_Attributs att =  this.IDF_Map.get(name);
		  
		  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
			 att.dataType.setLength(0);
			 att.mutalability.setLength(0);
			 att.value.setLength(0);
			 att.dataType.append(typeDeclaration);
			 att.mutalability.append(mutalability);
			 
			 if(typeValue.type.equalsIgnoreCase("Not Defined")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append(validateIDF.getUndefinedError(initValue, name,line, column));   
	               }
	               
	               else {
	            	   att.error.append("\n"+validateIDF.getUndefinedError(initValue,name, line, column));   
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 else if(typeValue.type.equalsIgnoreCase("Array")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append("# Error Array In Expression"); 
	               }
	               
	               else {
	            	   att.error.append("\n# Error Array In Expression");   
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 
			 else if(typeValue.type.equalsIgnoreCase("Not Array")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append("# Trying To Index Non Array"); 
	               }
	               
	               else {
	            	   att.error.append("\n# Trying To Index Non Array"); 
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Out Of Bound")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append(validateIDF.getBoundError(typeValue.size, typeValue.name, typeValue.line, typeValue.col)); 
	               }
	               
	               else {
	            	   att.error.append("\n# Index Out Of Bound"); 
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 
			 else if(typeValue.type.equalsIgnoreCase("EXP")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append(validateIDF.getValueError(initValue, typeValue.name, line, column)); 
	               }
	               
	               else {
	            	   att.error.append("\n"+validateIDF.getValueError(initValue, typeValue.name, line, column)); 
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 
			 
			 else if(typeValue.type.equalsIgnoreCase("Div By 0")) {
				 if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append("#"+validateIDF.getDivError(initValue,typeValue.line, typeValue.col));   
	               }
	               
	               else {
	            	   att.error.append("\n#"+validateIDF.getDivError(initValue,line, column));   
	               }
	               
	               att.value.append("#DIV PER 0 "+initValue);  
			 }
			 
			 else if(!att.dataType.toString().equalsIgnoreCase(typeValue.type)) {
				 System.out.println(att.dataType.toString()+" jj "+typeValue.type);
               if(att.error.toString().equalsIgnoreCase("No Error")) {
            	   att.error.setLength(0);
            	   att.error.append(validateIDF.getMissmatchError(name, line, column));   
               }
               
               else {
            	   att.error.append("\n#"+validateIDF.getMissmatchError(name, line, column));   
               }
               
               att.value.append("#MissMatch "+initValue);  
			 }
			 
			 else {
				 att.value.append(initValue);
			 }
			 
			 this.IDF_Map.put(name,att);
			  
		  }
		  
		  else {
			  
			  if(att.error.toString().equalsIgnoreCase("No Error")) {
				  att.error.setLength(0);
				  att.error.append(validateIDF.getRedefinedError(name, line, column));
			  }
			  
			  att.error.append("\n"+validateIDF.getRedefinedError(name, line, column));
			  att.mutalability.append("\n"+mutalability);
			  att.dataType.append("\n"+typeDeclaration);
			  
			  if(att.value.toString().equals("Not Defined")) {
				  att.value.setLength(0);
				  att.value.append("#Redefined "+initValue);
			  }
			  
			  att.value.append("\n#Redefined "+initValue);
			  
			  this.IDF_Map.put(name, att);
		  }
		  
}
  
  public void printTable() {
      System.out.println("Table: Size = " + this.IDF_Map.size());
    for (Map.Entry<String, IDF_Attributs> entry : this.IDF_Map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }

 }
