/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jonas
 */
public class VogaisController implements Initializable {
    
    @FXML
    private TabPane tabPaneVogais;
    //String video2 = getClass().getResource("/video/B.mp4").toString();
    public static String video2 = "";
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    //A FUNÇÃO PRA PEGAR O NOME É ESSA
    /*@FXML
    private void exibirVideo(ActionEvent event){
        String opcao = ((Button) event.getSource()).getText();
        System.out.println("opção escolhida foi: " + opcao);
    }*/
    
    
    @FXML
    private void exibirVideo(ActionEvent event) {
        
        try {
            
            video2 = getClass().getResource("/video/B.mp4").toString();
            
            System.out.println("MOSTRA O VIDEO PORRA");
            Parent janelaVideo = FXMLLoader.load(getClass().getResource("/gui/MostrarVideo.fxml"));      
            Stage stage = new Stage();
            Scene scene = new Scene(janelaVideo);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("exibir Video");
            
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
