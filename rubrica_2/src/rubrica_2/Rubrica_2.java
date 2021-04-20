/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.gestioneGridPane;
import model.listacontatti;

/**
 *
 * @author russo.salvatore
 */
public class Rubrica_2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     SplitPane splitpane = new SplitPane();
//        
//        HBox hId =new HBox(new Label("ID: "), new Label());
//        HBox hnome =new HBox(new Label("NOME: "), new Label());
//        HBox hcognome =new HBox(new Label("COGNOME: "), new Label());
//        HBox hvia =new HBox(new Label("VIA: "), new Label());
//        HBox hcitta =new HBox(new Label("CITTA: "), new Label());
//        VBox vboxD = new VBox();
//        vboxD.getChildren().addAll(hnome, hcognome, hvia, hcitta);
//        vboxD.setSpacing(20);
//        
        gestioneGridPane gg = new gestioneGridPane();
        VBox vboxS = new VBox(new Label("SINISTRA"));
        splitpane.getItems().addAll(vboxS,gg.getGridPane());
        Scene scene = new Scene(splitpane, 500, 350);
        primaryStage.setTitle(" Rubrica 1 ");
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
