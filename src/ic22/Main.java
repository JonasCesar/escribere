/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ic22;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author jonas
 */
public class Main extends Application {
    
    @FXML
    private Stage Janela;
    
    @Override
    public void start(Stage janela) throws IOException {
        this.Janela = janela;
        Parent inicio = FXMLLoader.load(getClass().getResource("/gui/Inicio.fxml"));
        Scene cena = new Scene(inicio, 1100, 650);
        janela.setTitle("Dicionário de Fonemas");
        janela.setScene(cena);
        janela.setResizable(false);
        janela.show();
        janela.centerOnScreen();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
