package application.FrontEnd;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import application.antlr.ExprLexer;
import application.antlr.ExprParser;
import application.antlr.PrintLexerOutput;
import application.antlr.PrintParserOutput;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;




public class InitIDE {
	
	
CodeSnippet snippet;
ListView<String> suggestionList;

static CodeArea codeArea = new CodeArea();

@FXML
private AnchorPane codePane;
@FXML
private Tab add;
@FXML
private TextFlow console;

@FXML
Button lexer;

private void setSectionTitle(String text) {
	Text title = new Text(text+"\n\n");
	title.getStyleClass().add("section");
	console.getChildren().add(title);
}


private void setLexicalOutput(ExprLexer lexer) {
	
	setSectionTitle("Lexical Analysis: ");
	lexer.removeErrorListeners();
    
	PrintLexerOutput printer = new PrintLexerOutput(lexer);
    printer.printAllToken();
    String[] lines = printer.output.toString().split("\n");
    
    LinkedList<Text> textList = new LinkedList<>();
    
    for(String line : lines) {
  	
  	  Text text = new Text(line+"\n");
  	  if(line.startsWith("Error")||line.startsWith("Undefined")) {
  		  System.out.println(line);
  		  text.getStyleClass().add("error-text");    
  	 }
  	  else {
  		  text.getStyleClass().add("normal-text");  
  	  }
  	  textList.add(text);
    }
    
    Text text = new Text();
    if(printer.nb == 0) {
  	  text.setText("Lexical Analysis Successfull 0 Error Found");
  	  text.getStyleClass().add("suc-text"); 
    }
    else {
  	  text.setText("Lexical Analysis Not Successfull "+printer.nb+" Error Found");
  	  text.getStyleClass().add("fail-text"); 
    }
    
    textList.add(text);
    
    console.getChildren().addAll(textList);
}

private void setParserOutput (PrintParserOutput listener){
	 setSectionTitle("\nSyntatic Analysis: ");
	 
	 String[] listLines = listener.output.toString().split("\n");
	     
	     LinkedList<Text> textList = new LinkedList<>();
	     
	     for (String line : listLines) {
	    	 System.out.println(line);
	    	 Text text = new Text(line+"\n");
	    	 text.getStyleClass().add("error-text");
	    	 textList.add(text);
	     }
	     
	     Text conslusion = new Text();
	     if(listener.nb == 0) {
	      conslusion.setText("Syntatic Analysis Successfull 0 Error Found");
	      conslusion.getStyleClass().add("suc-text"); 
	     }
	     else {
	      conslusion.setText("Syntatic Analysis Not Successfull "+listener.nb+" Error Found");
	      conslusion.getStyleClass().add("fail-text"); 
	     }
	     
	     textList.add(conslusion);
	     
	     console.getChildren().addAll(textList);

	
}






public void Parser(ActionEvent e) {
	 
	 console.getChildren().clear();
	 String input = codeArea.getText();
	 
	 ExprLexer lexer_1 = new ExprLexer(CharStreams.fromString(input));
	 setLexicalOutput(lexer_1);
     
	 ExprLexer lexer = new ExprLexer(CharStreams.fromString(input));
	 lexer.removeErrorListeners();
	 
	 CommonTokenStream tokens = new CommonTokenStream(lexer);
	 tokens.fill();
	 
     ExprParser parser = new  ExprParser(tokens);
     parser.removeErrorListeners();
     
      PrintParserOutput listener = new PrintParserOutput();
      parser.addErrorListener(listener);
     
     ParseTree tree = parser.prog();
  
     TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
     viewer.open(); 
     
     setParserOutput(listener);    
 
}


public void Lexer(ActionEvent e) {
	
	 
	  console.getChildren().clear();
	  String input = codeArea.getText();
	  
	 
	  
      ExprLexer lexer = new ExprLexer(CharStreams.fromString(input));
      
      setLexicalOutput(lexer);
      
}

@FXML
void initialize() { 
	

	snippet = new CodeSnippet();
	
	suggestionList = new ListView<>();
	suggestionList.getItems().addAll(snippet.snippetsMap.keySet());
      
	
	System.out.println("jjd");
	 codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
	 codePane.getChildren().add(codeArea);
	 codePane.setTopAnchor(codeArea, 0.0);
	 codePane.setBottomAnchor(codeArea, 0.0);
	 codePane.setLeftAnchor(codeArea, 0.0);
	 codePane.setRightAnchor(codeArea, 0.0);

	// codePane.getChildren().add(suggestionList);
	 
	// Set up real-time highlighting
	 codeArea.textProperty().addListener((obs, oldText, newText) -> {
		SetSyntaxHighlight(codeArea, newText);
	 });

	 
}

void SetSyntaxHighlight(CodeArea codeArea , String Text) {
	  
	 //System.out.println("Text "+Text);
	  ExprLexer lexer = new ExprLexer(CharStreams.fromString(Text));
	  lexer.removeErrorListeners();
	  Token token = lexer.nextToken();
	
	  while (token.getType() != Token.EOF) {
		  int tokenType = token.getType();
//		  System.out.println("Token Type: " + tokenType+" value "+token.getText());
		 
		  try {
	//		System.out.println("Symbolic Name: " + lexer.getVocabulary().getSymbolicName(tokenType));
			String tokenName = (lexer.getVocabulary().getSymbolicName(tokenType).toLowerCase());
	//		System.out.println(" "+token.getStartIndex()+" "+token.getStopIndex());
			codeArea.setStyle(token.getStartIndex(), token.getStopIndex() + 1,Collections.singleton(tokenName));
			
		  } catch (NullPointerException e) {
			System.out.println("nothing");
		  }
		 
		 token = lexer.nextToken();
	  }
}

}
