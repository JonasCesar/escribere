/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author jonas
 */
public class MostrarVideoController implements Initializable {
    @FXML
    private MediaView mediaView;
    private MediaPlayer player;

    VogaisController vogais = new VogaisController();
    
    //private String VIDEO_URL = getClass().getResource("/video/B.mp4").toString();
    
    //private String VIDEO_URL = "";
    
    /*public MostrarVideoController(String v){
        VIDEO_URL = v;
    }*/
    


    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //loadVideo(VIDEO_URL);
        //botar o arquivo de vídeo diretamente na função
        loadVideo();
    }    
    
    
    /*public void loadVideo(String video){
        
        Media media = new Media(video);
        player = new MediaPlayer(media);
        //mediaView = new MediaView(player);
        
        mediaView.setMediaPlayer(player);
        
        //mediaView.setLayoutX(400);
        //mediaView.setLayoutY(400);
        
        
        player.play();   
        
        System.out.println("executou");
        
    }*/
    
    public void loadVideo(){
        String video = vogais.videoApresentacao;//pegando o endereço do vídeo da classe VOGAIS
        Media media = new Media(video);
        player = new MediaPlayer(media);
        //mediaView = new MediaView(player);
        
        mediaView.setMediaPlayer(player);
        
        //mediaView.setLayoutX(400);
        //mediaView.setLayoutY(400);
        
        
        player.play();   
        
        System.out.println("executou");
        
    }

    @FXML
    private void replay(ActionEvent event) {
        String video = vogais.videoApresentacao;
        Media media = new Media(video);
        player = new MediaPlayer(media);
        mediaView.setMediaPlayer(player);
        player.play();
    }
    
}
    
    
