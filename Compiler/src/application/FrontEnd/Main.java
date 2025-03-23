package application.FrontEnd;
import javafx.application.Application;
import javafx.scene.image.Image;

import javafx.scene.control.*;
import java.awt.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
        	
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/ressource/code.fxml"));
            String css_code = this.getClass().getResource("/application/ressource/code.css").toExternalForm();
            String css_tab = this.getClass().getResource("/application/ressource/tab.css").toExternalForm();
            Parent root = loader.load();
            // Set the FXML content to the scene
            Scene scene = new Scene(root);
            scene.getStylesheets().add(css_code);
            scene.getStylesheets().add(css_tab);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
