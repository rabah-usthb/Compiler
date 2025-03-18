package application;


import java.util.ArrayList;
import java.util.Collections;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import javafx.fxml.FXML;
import javafx.scene.control.ContextMenu;
import javafx.scene.layout.AnchorPane;

public class InitIDE {

@FXML
private AnchorPane codePane;

@FXML
void initialize() {
	System.out.println("jjd");
	 CodeArea codeArea = new CodeArea();
	 codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
	 codePane.getChildren().add(codeArea);
	 codePane.setTopAnchor(codeArea, 0.0);
	 codePane.setBottomAnchor(codeArea, 0.0);
	 codePane.setLeftAnchor(codeArea, 0.0);
	 codePane.setRightAnchor(codeArea, 0.0);

	// Set up real-time highlighting
	 codeArea.textProperty().addListener((obs, oldText, newText) -> {
		  ExprLexer lexer = new ExprLexer(CharStreams.fromString(newText));
		  Token token = lexer.nextToken();
		  ArrayList<String> list=  new ArrayList<>();
		  
		  while (token.getType() != Token.EOF) {
			  System.out.println("Token Type: " + token.getType());
			  System.out.println("Symbolic Name: " + lexer.getVocabulary().getSymbolicName(token.getType()));
			 String tokenName = (lexer.getVocabulary().getSymbolicName(token.getType()).toLowerCase());
			 System.out.println(list+" "+token.getStartIndex()+" "+token.getStopIndex());
			 codeArea.setStyle(token.getStartIndex(), token.getStopIndex() + 1,Collections.singleton(tokenName));
			 token = lexer.nextToken();
		  }
	 });

}
	
}
