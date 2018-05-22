/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jonas
 */
public class InicioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    //@FXML
    //mostrar janela de vídeo
    /*private void exibirVideo(ActionEvent event) {
        
        try {
            
            Parent janelaVideo = FXMLLoader.load(getClass().getResource("/gui/MostrarVideo.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(janelaVideo);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("exibir Video");
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }*/
    
}
