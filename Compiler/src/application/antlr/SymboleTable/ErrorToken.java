package application.antlr.SymboleTable;

import java.util.Comparator;

public class ErrorToken {
 public String name;
 public int col;
 public int line;
 public String size;
 public String type = "";
 public String exp;
 
 public ErrorToken (String name, String type , int line , int col,String size) {
	 this.size = size;
	 this.col = col;
	 this.line = line;
	 this.name  = name;
	 this.type = type;
 }
 
 
 public ErrorToken (String name, String type , int line , int col) {
	 this.col = col;
	 this.line = line;
	 this.name  = name;
	 this.type = type;
 }
 

 
 
 public ErrorToken (String name,int line , int col) {
	 this.col = col;
	 this.line = line;
	 this.name= name;
 }
 
 
}
