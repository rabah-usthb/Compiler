package application.FrontEnd;

//2d table

import java.util.Map;


import javax.security.auth.kerberos.KeyTab;

import org.antlr.v4.parse.ANTLRParser.id_return;

import application.antlr.SymboleTable.Constant_Attributs;
import application.antlr.SymboleTable.Constant_Hashtable;
import application.antlr.SymboleTable.IDF_Attributs;
import application.antlr.SymboleTable.IDF_HashTable;
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
	VBox conBox;
	@FXML
	VBox keyBox;
	@FXML
	VBox idfBox;
	
	
	public void setIDFTable() {
		
		
        TableView<IDFEntry> idfTable  = new TableView<TableController.IDFEntry>();
		
		TableColumn<IDFEntry, String> valueColumn = new TableColumn<TableController.IDFEntry, String>("Value");
		valueColumn.setCellValueFactory(new PropertyValueFactory<IDFEntry, String>("value"));
			
		TableColumn<IDFEntry, String> nameColumn = new TableColumn<TableController.IDFEntry, String>("Name");
		nameColumn.setCellValueFactory(new PropertyValueFactory<IDFEntry, String>("name"));
		
		TableColumn<IDFEntry, String> sizeColumn = new TableColumn<TableController.IDFEntry, String>("Size");
		sizeColumn.setCellValueFactory(new PropertyValueFactory<IDFEntry, String>("size"));
		
		TableColumn<IDFEntry, String> typeColumn = new TableColumn<TableController.IDFEntry, String>("Data Type");
		typeColumn.setCellValueFactory(new PropertyValueFactory<IDFEntry, String>("type"));
		
		TableColumn<IDFEntry, String> mulColumn = new TableColumn<TableController.IDFEntry, String>("Multability");
		mulColumn.setCellValueFactory(new PropertyValueFactory<IDFEntry, String>("mul"));
		
		TableColumn<IDFEntry, String> errorColumn = new TableColumn<TableController.IDFEntry, String>("Error");
		errorColumn.setCellValueFactory(new PropertyValueFactory<IDFEntry, String>("error"));
		
		
		idfTable.getColumns().add(nameColumn);
		idfTable.getColumns().add(mulColumn);
		idfTable.getColumns().add(typeColumn);
		idfTable.getColumns().add(sizeColumn);
		idfTable.getColumns().add(valueColumn);
		idfTable.getColumns().add(errorColumn);
		
		
		 for (Map.Entry<String, IDF_Attributs> entry : IDF_HashTable.table.IDF_Map.entrySet()) {
			 IDF_Attributs data = entry.getValue();
			 
			 System.out.println("NAME DATA "+entry.getKey()+" VALUEEE "+data.value.toString());
			 
			 idfTable.getItems().add(new IDFEntry(entry.getKey(), data.mutalability.toString(),data.dataType.toString(),data.size.toString(),data.value.toString(),data.error.toString()));
	     }

		 idfTable.setPrefHeight(Region.USE_COMPUTED_SIZE);
		 idfTable.setPrefWidth(Region.USE_COMPUTED_SIZE);
		 idfTable.setMaxHeight(Region.USE_COMPUTED_SIZE);
		 idfTable.setMaxWidth(Region.USE_COMPUTED_SIZE);
		
		idfTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_FLEX_LAST_COLUMN);
		idfTable.setEditable(false);
		idfTable.setFocusTraversable(false);
		
		idfBox.getChildren().add(idfTable);
		idfBox.setVgrow(idfTable, Priority.ALWAYS);
	}
	
	
	
	public void setConstantTable() {
        TableView<ConstEntry> conTable  = new TableView<TableController.ConstEntry>();
		
		TableColumn<ConstEntry, String> valueColumn = new TableColumn<TableController.ConstEntry, String>("Value");
		valueColumn.setCellValueFactory(new PropertyValueFactory<ConstEntry, String>("value"));
		
		TableColumn<ConstEntry, String> typeColumn = new TableColumn<TableController.ConstEntry, String>("Data Type");
		typeColumn.setCellValueFactory(new PropertyValueFactory<ConstEntry, String>("type"));
		
		TableColumn<ConstEntry, String> rangeColumn = new TableColumn<TableController.ConstEntry, String>("Range");
		rangeColumn.setCellValueFactory(new PropertyValueFactory<ConstEntry, String>("range"));
		
		TableColumn<ConstEntry, String> errorColumn = new TableColumn<TableController.ConstEntry, String>("Error");
		errorColumn.setCellValueFactory(new PropertyValueFactory<ConstEntry, String>("error"));
		
		conTable.getColumns().add(valueColumn);
		conTable.getColumns().add(typeColumn);
		conTable.getColumns().add(rangeColumn);
		conTable.getColumns().add(errorColumn);
		
		 for (Map.Entry<String, Constant_Attributs> entry : Constant_Hashtable.ConstantTable.ConstantHashMap.entrySet()) {
	         Constant_Attributs data = entry.getValue();
			 conTable.getItems().add(new ConstEntry(entry.getKey(), data.dataType,data.range,data.error));
	     }

		 conTable.setPrefHeight(Region.USE_COMPUTED_SIZE);
		 conTable.setPrefWidth(Region.USE_COMPUTED_SIZE);
		 conTable.setMaxHeight(Region.USE_COMPUTED_SIZE);
		 conTable.setMaxWidth(Region.USE_COMPUTED_SIZE);
		
		conTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_FLEX_LAST_COLUMN);
		conTable.setEditable(false);
		conTable.setFocusTraversable(false);
		
		conBox.getChildren().add(conTable);
		conBox.setVgrow(conTable, Priority.ALWAYS);
	}
	
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
		setConstantTable();
		setIDFTable();
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

	
	public static class IDFEntry {
		public final String name;
        public final String value;
        public final String type;
        public final String mul;
        public final String size;
        public final String error;

        public IDFEntry(String name, String mul,String type, String size, String value, String error) {
            this.name = name;
        	this.value = value;
            this.type = type;
            this.error = error;
            this.mul = mul;
            this.size = size;
        }
        
        public String getName() {
        	return this.name;
        }
        
        public String getMul() {
        	return this.mul;
        }
        
        
        public String getSize() {
        	return this.size;
        }
        
        public String getError() {
        	return this.error;
        }
        
        public String getValue() {
        	return this.value;
        }
        
        public String getType() {
        	return this.type;
        }

        
}

	

	public static class ConstEntry {
        public final String value;
        public final String type;
        public final String range;
        public final String error;

        public ConstEntry(String value, String type, String range, String error) {
            this.value = value;
            this.type = type;
            this.error = error;
            this.range = range;
        }
        
        public String getRange() {
        	return this.range;
        }
        
        public String getError() {
        	return this.error;
        }
        
        public String getValue() {
        	return this.value;
        }
        
        public String getType() {
        	return this.type;
        }

        
}

}
