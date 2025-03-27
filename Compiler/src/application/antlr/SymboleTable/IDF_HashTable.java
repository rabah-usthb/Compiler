package application.antlr.SymboleTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import application.antlr.validate.validateIDF;

public class IDF_HashTable {
  public HashMap<String,IDF_Attributs> IDF_Map = new HashMap<String,IDF_Attributs>();
  public static final IDF_HashTable table = new IDF_HashTable();
  
  
  public String conditionType(LinkedHashSet<String> boolSet,LinkedHashSet<String> expSet) {
	  String boolType = getType(boolSet, 2);
	  String expType = getType(expSet, 0);
	  
	  if(!expType.equalsIgnoreCase("int") && !expType.equalsIgnoreCase("float")) {
		  return expType;
	  }
	  
	  else  {
		  return boolType;
	  }
	  
	  
  }
  
  
  public String boolType(LinkedHashSet<String> typeSet) {
	  String cur= "bool";
	  
	  for(String type : typeSet) {
		  if(!type.equalsIgnoreCase("bool")) {
			  cur = "MissMatch";
			  return cur;
		  }
		
	  }
	  return cur; 
  }
  
  public String AriType(LinkedHashSet<String> typeSet) {
	  String cur= "int";
	  
	  for(String type : typeSet) {
		  if(type.equalsIgnoreCase("float")) {
			  cur = type;
		  }
		  else if(!type.equalsIgnoreCase("int")) {
			  cur = "MissMatch";
			  return cur;
		  }
		
	  }
	  return cur;
  }
  
  public String conType(LinkedHashSet<String> typeSet) {
	  String cur= "STRING";
	  
	  for(String type : typeSet) {
		   if(!type.equalsIgnoreCase("String")) {
			  cur = "MissMatch";
			  return cur;
		  }
		
	  }
	  return cur;
  }
  
  public String getType(LinkedHashSet<String> typeSet, int Case) {
	  
	  System.out.println(typeSet);
	  if(typeSet.contains("Not Defined")) {
		  typeSet.clear();
		  return "Not Defined";
	  }
	  else if(typeSet.contains("Not Array")) {
		  typeSet.clear();
		  return "Not Array";
	  }
	  else if(typeSet.contains("Array")) {
		  typeSet.clear();
		  return "Array";
	  }
	  else if(typeSet.contains("Out Of Bound")) {
		  typeSet.clear();
		  return "Out Of Bound";
	  }
	  else {
		  switch(Case) {
		  case 0 :
			  return AriType(typeSet);
		  case 1:
			  return conType(typeSet);
		  case 2:
			  return boolType(typeSet);
		  default:
			  return "";
		  }
		 
		  
	  }
	  
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
  
  public String getArrayTypeExpression(String name, String index) {
	  
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  String size = getSizeArray(name).replace("(", "").replace(")", "");
	  index = index.replace("(", "").replace(")", "");
	  
	  
	  if(att.dataType.toString().equalsIgnoreCase("Not Define")) {
		  return "Not Define";
	  }
	  else {
		  if(!att.size.toString().equalsIgnoreCase("Not Array")) {
			  
			  if(size.equals("Not Defined")) {
				  return "Not Defined";
			  }
			  
			  else {
				  
				  int indexValue;
				  int sizeValue;
				  
				  try {
					  sizeValue = Integer.parseInt(size);
					  indexValue = Integer.parseInt(size); 
					  
					  if(indexValue<0 || indexValue>sizeValue -1 ) {
						  return "Out Of Bound";
					  }
					  
				  }
				  catch (NumberFormatException e) {
					  return "Out Of Bound";
				  }
			  
			  return att.dataType.toString().split("\n")[0];
			  }
		  }
		  
		  else {
			  return "Not Array";
		  }
	  }
	  
	
  }
  
  
  public String getNormalTypeExpression(String name) {
	  IDF_Attributs att =  this.IDF_Map.get(name);
	  
	  if(att.dataType.toString().equalsIgnoreCase("Not Define")) {
		  return "Not Define";
	  }
	  else {
		  if(att.size.toString().equalsIgnoreCase("Not Array")) {
			  return att.dataType.toString().split("\n")[0];
		  }
		  
		  else {
			  return "Array";
		  }
	  }
	  
	
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
  
  public void updateSizeTypeValue(String name , String mutalability, String typeDeclaration ,String size, ArrayList<String> initValue , LinkedHashSet<String> type , int line , int column) {
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
			 System.out.println(initValue);
			 att.error.append(validateIDF.getsizeError(name, size, line, column));
			 att.value.append("Undefined Size "+validateIDF.getSameArray(initValue));
		 }
		 
		 else if(!validateIDF.isSameType(type)) {
			 if(att.error.toString().equalsIgnoreCase("No Error")) {
				 att.error.setLength(0);
			 }
			 att.error.append(validateIDF.getNotSameTypeError(name, line, column));
			 att.value.append("Not Same Type "+validateIDF.getSameArray(initValue));
		 }
		 
		 else if(!typeDeclaration.equalsIgnoreCase(type.getFirst())) {
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
			 att.value.append("Element OutOfBound "+validateIDF.getArray(size,initValue,typeDeclaration));
		 }
		 else {
		 
		 att.value.append(validateIDF.getArray(size,initValue,typeDeclaration));
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
			  att.value.append("Redefined "+validateIDF.getSameArray(initValue));
		  }
		  
		  else {
			  att.value.append("\n Redefined "+validateIDF.getSameArray(initValue));
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
  
public void updateTypeValue(String name , String mutalability,String typeDeclaration, String initValue, String typeValue, int line , int column) {
	 	  System.out.println("init "+initValue+" typeDec "+typeDeclaration+" typeVal "+typeValue);
		  IDF_Attributs att =  this.IDF_Map.get(name);
		  
		  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
			 att.dataType.setLength(0);
			 att.mutalability.setLength(0);
			 att.value.setLength(0);
			 att.dataType.append(typeDeclaration);
			 att.mutalability.append(mutalability);
			 
			 if(typeValue.equalsIgnoreCase("Not Defined")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append(validateIDF.getValueError(initValue, line, column));   
	               }
	               
	               else {
	            	   att.error.append("\n"+validateIDF.getValueError(initValue, line, column));   
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 else if(typeValue.equalsIgnoreCase("Array")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append("# Error Array In Expression"); 
	               }
	               
	               else {
	            	   att.error.append("\n# Error Array In Expression");   
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 
			 else if(typeValue.equalsIgnoreCase("Not Array")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append("# Trying To Index Non Array"); 
	               }
	               
	               else {
	            	   att.error.append("\n# Trying To Index Non Array"); 
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 
			 
			 else if(typeValue.equalsIgnoreCase("Out Of Bound")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append("# Index Out Of Bound"); 
	               }
	               
	               else {
	            	   att.error.append("\n# Index Out Of Bound"); 
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 
			 else if(typeValue.equalsIgnoreCase("Missmatch")) {
				  if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append("# Expression Not Properly Defined"); 
	               }
	               
	               else {
	            	   att.error.append("\n# Expression Not Properly Defined"); 
	               }
	               
	               att.value.append("#Not Defined "+initValue);  
			 }
			 
			 
			 else if(validateIDF.isDividingByZero(initValue)) {
				 if(att.error.toString().equalsIgnoreCase("No Error")) {
	            	   att.error.setLength(0);
	            	   att.error.append("#"+validateIDF.getDivError(initValue,line, column));   
	               }
	               
	               else {
	            	   att.error.append("\n#"+validateIDF.getDivError(initValue,line, column));   
	               }
	               
	               att.value.append("#DIV PER 0 "+initValue);  
			 }
			 
			 else if(!att.dataType.toString().equalsIgnoreCase(typeValue)) {
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
