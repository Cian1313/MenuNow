/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxprojectis2209;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author 117381516
 */
public class JavaFXProjectIS2209 extends Application {

    @Override
    public void start(Stage primaryStage) {

        //define our controls and some of their properities
        Button btnBreakfast = new Button();
        btnBreakfast.setText("Breakfast menu");

        Button btnDinner = new Button();
        btnDinner.setText("Dinner Menu");

        btnBreakfast.setOnAction((ActionEvent event) -> {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Breakfast.fxml"));
                /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
                 */
                Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                Stage stage = new Stage();
                stage.setTitle("Breakfast");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }

        });
        btnDinner.setOnAction((ActionEvent event) -> {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Dinner.fxml"));
                /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
                 */
                Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                Stage stage = new Stage();
                stage.setTitle("Dinner");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }

        });

        //use a VBOX pane and add our controls to its list of children
        VBox root = new VBox();
        root.getChildren().add(btnBreakfast);
        root.getChildren().add(btnDinner);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Welcome to the menu!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
