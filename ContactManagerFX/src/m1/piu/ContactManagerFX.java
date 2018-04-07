/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


/**
 *
 * @author sy
 */
public class ContactManagerFX extends Application {
    
    
    public static  Parent n;
    @Override
    public void start(Stage stage) throws Exception {
        ContactManagerFX.n = FXMLLoader.load(getClass().getResource("FXMLMainPanel.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMainFrame.fxml"));
        
        //n = ele;
        Scene scene = new Scene(root);
        stage.setOnCloseRequest((WindowEvent e) -> {
            Platform.exit();
            System.exit(0);
        });
        stage.setScene(scene);
        stage.show();
        
        //stage.setScene(scene);
        //stage.initStyle(StageStyle.UTILITY);
        //stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}
