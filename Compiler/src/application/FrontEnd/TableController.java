package application.FrontEnd;

import java.util.Map;

import javax.security.auth.kerberos.KeyTab;

import application.antlr.SymboleTable.Keywords_Attributs;
import application.antlr.SymboleTable.Keywords_Hashtable;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class TableController {

	@FXML
	AnchorPane KeyPane;
	@FXML
	VBox keyBox;
	
	public void setKeywordTable() {
		TableView<KeywordEntry> keyTable  = new TableView<TableController.KeywordEntry>();
		
		TableColumn<KeywordEntry, String> nameColumn = new TableColumn<TableController.KeywordEntry, String>("Name");
		nameColumn.setCellValueFactory(new PropertyValueFactory<KeywordEntry, String>("name"));
		
		TableColumn<KeywordEntry, String> typeColumn = new TableColumn<TableController.KeywordEntry, String>("Type");
		typeColumn.setCellValueFactory(new PropertyValueFactory<KeywordEntry, String>("type"));
		
		keyTable.getColumns().add(nameColumn);
		keyTable.getColumns().add(typeColumn);
		
		 for (Map.Entry<String, Keywords_Attributs> entry : Keywords_Hashtable.KeywordsTable.KeywordsHashMap.entrySet()) {
	         keyTable.getItems().add(new KeywordEntry(entry.getKey(), entry.getValue().type));
	     }

		 keyTable.setPrefHeight(Region.USE_COMPUTED_SIZE);
		 keyTable.setPrefWidth(Region.USE_COMPUTED_SIZE);
		 keyTable.setMaxHeight(Region.USE_COMPUTED_SIZE);
		 keyTable.setMaxWidth(Region.USE_COMPUTED_SIZE);
		
		keyTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_FLEX_LAST_COLUMN);
		keyTable.setEditable(false);
		keyTable.setFocusTraversable(false);
		
		keyBox.getChildren().add(keyTable);
		keyBox.setVgrow(keyTable, Priority.ALWAYS);
	

	}
	
	@FXML
	public void initialize() {
		System.out.println("heee");
		System.out.println(Keywords_Hashtable.KeywordsTable.KeywordsHashMap.size());
		setKeywordTable();
	}

	public static class KeywordEntry {
        public final String name;
        public final String type;

        public KeywordEntry(String name, String type) {
            this.name = name;
            this.type = type;
        }
        
        public String getName() {
        	return this.name;
        }
        
        public String getType() {
        	return this.type;
        }

        
}

}
