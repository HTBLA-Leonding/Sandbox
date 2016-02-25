/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandboxgittest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * This is awesome!
 * @author Matthias
 */
public class SandboxGItTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label l = new Label(".");
        Button btn = new Button();
        btn.setText("This is a Button");
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                l.setText("IT IS WORKING");
            }
        });
        
        BorderPane root = new BorderPane();
        root.setTop(btn);
        root.setCenter(l);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Epic Big Program");
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
