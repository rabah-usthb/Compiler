import java.util.HashMap;
import java.util.Map;

public class IDF_HashTable {
  public HashMap<String,IDF_Attributs> IDF_Map = new HashMap<String,IDF_Attributs>();
  public static final IDF_HashTable table = new IDF_HashTable();
  
  
  public String getType(String[] typeList) {
	  for(String type : typeList) {
		  if(type.equals("Float")) {
			  return type;
		  }
	  }
	  
	  return "INT";
  }
  
  public String getType(String name) {
	  return this.IDF_Map.get(name).toString().split("\n")[0];
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
  
  
  public void updateType(String name , String mutalability,String typeDeclaration, int line , int column) {
	
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
		  att.mutalability.append("\n"+mutalability);
		  att.dataType.append("\n"+typeDeclaration);
		  this.IDF_Map.put(name, att);
	  }
  }
  
public void updateTypeValue(String name , String mutalability,String typeDeclaration, String initValue, String typeValue, int line , int column) {
	 
		  IDF_Attributs att =  this.IDF_Map.get(name);
		  
		  if(att.dataType.toString().equals("Not Defined") && att.mutalability.toString().equals("Not Defined")) {
			 att.dataType.setLength(0);
			 att.mutalability.setLength(0);
			 att.value.setLength(0);
			 att.dataType.append(typeDeclaration);
			 att.mutalability.append(mutalability);
			 att.value.append(initValue);
			  
			 this.IDF_Map.put(name,att);
			  
		  }
		  
		  else {
			  att.error.append(validateIDF.getRedefinedError(name, line, column));
			  att.mutalability.append("\n"+mutalability);
			  att.dataType.append("\n"+typeDeclaration);
			  
			  if(att.value.toString().equals("Not Defined")) {
				  att.value.setLength(0);
			  }
			  
			  att.value.append(initValue);
			  
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
