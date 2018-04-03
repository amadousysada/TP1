/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author gaby
 */
public class FXMLMainFrameController implements Initializable {
@FXML
private BorderPane MainPanel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         
    try {
       SplitPane  pane = FXMLLoader.load(getClass().getResource("FXMLMainPanel.fxml"));
       MainPanel.getChildren().setAll(pane);
    } catch (IOException ex) {
        Logger.getLogger(FXMLMainFrameController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
       
    }    
    
}
