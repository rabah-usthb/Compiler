package application.antlr.SymboleTable;

import java.util.ArrayList;
import java.util.Comparator;

public class ErrorToken {
 public String name;
 public int col;
 public int line;
 public String size;
 public String dataType="";
 public String type = "";
 public String exp;
 
 public ErrorToken (String name, String type , int line , int col,String size) {
	 this.size = size;
	 this.col = col;
	 this.line = line;
	 this.name  = name;
	 this.type =  type;
	 if(IDF_HashTable.table.IDF_Map.get(name) !=null) {
		 this.dataType = IDF_HashTable.table.IDF_Map.get(name).dataType.toString().split("\n")[0];
		 }
 }
 
 
 public ErrorToken (String name, String type , int line , int col) {
	 this.col = col;
	 this.line = line;
	 this.name  = name;
	 if(IDF_HashTable.table.IDF_Map.get(name) !=null) {
	 this.dataType = IDF_HashTable.table.IDF_Map.get(name).dataType.toString().split("\n")[0];
	 }
	 this.type =type;
 }
 

 
 
 public ErrorToken (String name,int line , int col) {
	 this.col = col;
	 this.line = line;
	 this.name= name;
 }
 
 public static void printCollection(ArrayList<ErrorToken> list) {
	 for(ErrorToken token : list) {
		 System.out.println(token);
	 }
 }
	 
@Override
public String toString() {
	return "\nname "+this.name+" type "+this.type;
}
 
 
}
