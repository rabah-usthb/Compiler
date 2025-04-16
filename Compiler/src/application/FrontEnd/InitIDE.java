package application.FrontEnd;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import org.fxmisc.richtext.model.StyleSpansBuilder;

import application.antlr.ExprLexer;
import application.antlr.ExprParser;
import application.antlr.PrintLexerOutput;
import application.antlr.PrintParserOutput;
import application.antlr.SymboleTable.Constant_Hashtable;
import application.antlr.SymboleTable.IDF_HashTable;
import application.antlr.SymboleTable.Keywords_Hashtable;
import application.antlr.validate.validateConstant;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;




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
	 
	 for(Token tok : tokens.getTokens()) {
		 System.out.println("token " +tok.getText()+ " "+tok.getChannel());
	 }
	 
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

public void Semantic(ActionEvent e) {
	 
	 console.getChildren().clear();
	 String input = codeArea.getText();
	 
	 Keywords_Hashtable.KeywordsTable.KeywordsHashMap.clear();
	 Constant_Hashtable.ConstantTable.ConstantHashMap.clear();
	 IDF_HashTable.table.IDF_Map.clear();
	 
	 ExprLexer lexer_1 = new ExprLexer(CharStreams.fromString(input));
	// lexer_1.removeErrorListeners();
	 
	 CommonTokenStream tokens = new CommonTokenStream(lexer_1);
	 tokens.fill();
	 
	 ExprParser parser = new  ExprParser(tokens);
  /*   parser.removeErrorListeners();
     
      PrintParserOutput listener = new PrintParserOutput();
      parser.addErrorListener(listener);

      setParserOutput(listener);
    */  
      ParseTree tree = parser.prog();
      
	 FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/ressource/Table.fxml"));
     Parent root = null;
		try {
			root = fxmlLoader.load();
		} catch (IOException exception) {
	
			exception.printStackTrace();
		}
  
     Scene scene = new Scene(root);
     String css_tab = this.getClass().getResource("/application/ressource/tab.css").toExternalForm();
     String css_table = this.getClass().getResource("/application/ressource/table.css").toExternalForm();
     scene.getStylesheets().add(css_table);
     scene.getStylesheets().add(css_tab);
     Stage stage = new Stage();
     stage.setScene(scene);
     stage.show();
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
	 
	 codeArea.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
		    if (event.isControlDown() && event.getCode() == KeyCode.V) {
		        // This will run on Ctrl+V regardless of whether text actually changes
		       
		            SetSyntaxHighlight(codeArea, codeArea.getText());
		        
		    }
		});
	 
}

void SetSyntaxHighlight(CodeArea codeArea , String Text) {
	 
	StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();
	 //System.out.println("Text "+Text);
	  ExprLexer lexer = new ExprLexer(CharStreams.fromString(Text));
	  lexer.removeErrorListeners();
	  Token token = lexer.nextToken();
	  int lastTokenEnd = 0;
	
	  while (token.getType() != Token.EOF) {
	       int tokenStart = token.getStartIndex();
	       int tokenEnd = token.getStopIndex() + 1;
	        
	        // Add unstyled span between the last token and this token
	        spansBuilder.add(Collections.emptyList(), tokenStart - lastTokenEnd);
	        
	        // Get the token name (e.g., "keyword", "string") as the style class
	        String tokenName = lexer.getVocabulary().getSymbolicName(token.getType()).toLowerCase();
	        spansBuilder.add(Collections.singleton(tokenName), tokenEnd - tokenStart);
	        
	        token = lexer.nextToken();
	        lastTokenEnd = tokenEnd;
	    }
	    
	    
	    // Add unstyled span for any remaining text after the last token
	    spansBuilder.add(Collections.emptyList(), Text.length() - lastTokenEnd);
	    
	    // Apply all spans in one go
	    codeArea.setStyleSpans(0, spansBuilder.create());
	}
}


