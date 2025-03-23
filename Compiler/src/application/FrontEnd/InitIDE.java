package application.FrontEnd;


import java.util.ArrayList;
import java.util.Collections;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import application.antlr.ExprLexer;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class InitIDE {

CodeSnippet snippet;
ListView<String> suggestionList;

@FXML
private AnchorPane codePane;
@FXML
private Tab add;

@FXML
void initialize() {
	Image image = new Image("/application/ressource/add.png");
	
	 
	snippet = new CodeSnippet();
	
	suggestionList = new ListView<>();
	suggestionList.getItems().addAll(snippet.snippetsMap.keySet());
      
	
	System.out.println("jjd");
	 CodeArea codeArea = new CodeArea();
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
	  System.out.println("Text "+Text);
	  ExprLexer lexer = new ExprLexer(CharStreams.fromString(Text));
	  Token token = lexer.nextToken();
	  ArrayList<String> list=  new ArrayList<>();
	  
	  while (token.getType() != Token.EOF) {
		  int tokenType = token.getType();
		  System.out.println("Token Type: " + tokenType);
		 
		  try {
			System.out.println("Symbolic Name: " + lexer.getVocabulary().getSymbolicName(tokenType));
			String tokenName = (lexer.getVocabulary().getSymbolicName(token.getType()).toLowerCase());
			System.out.println(list+" "+token.getStartIndex()+" "+token.getStopIndex());
			codeArea.setStyle(token.getStartIndex(), token.getStopIndex() + 1,Collections.singleton(tokenName));
			
		  } catch (NullPointerException e) {
			System.out.println("nothing");
		  }
		 
		 token = lexer.nextToken();
	  }
}

}
