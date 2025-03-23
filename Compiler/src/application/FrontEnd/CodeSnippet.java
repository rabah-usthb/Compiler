package application.FrontEnd;

import java.util.HashMap;

import javafx.scene.control.ListView;

public class CodeSnippet {
HashMap<String,String> snippetsMap= new HashMap<>();


 CodeSnippet(){
 	populateMap();
 }
 
 void populateMap() {
	 snippetsMap.put("for","for (i = 0 , i < size , i++)\n{\n}");
	 snippetsMap.put("Multi-Comment","{-- \n Multi Line Comment  \n --}");

 }

}
