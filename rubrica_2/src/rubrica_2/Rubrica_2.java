/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica_2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.contatti;
import model.gestioneGridPane;
import model.listacontatti;
import model.visualizzacontatti;

/**
 *
 * @author russo.salvatore
 */

public class Rubrica_2 extends Application {
    private final ObservableList<contatti>lista=FXCollections.observableArrayList();
    private int pos;
    
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
        visualizzacontatti vc=new visualizzacontatti();
        Button a=new Button("-->");
        a.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              if(pos<vc.dimensione()){
                  pos++;
                  gg.setGrindpane(vc.getContatto(pos-1));
              } 
            }});
         Button b=new Button("<--");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              if(pos!=0){
                  pos--;
                  gg.setGrindpane(vc.getContatto(pos));
              } 
            }});
        HBox nc=new HBox();
        nc.getChildren().addAll(b,a);
        SplitPane splitpane2 = new SplitPane();
        splitpane2.getItems().addAll(vc.getTv(),nc);
        splitpane.getItems().addAll(splitpane2,gg.getGridPane());
        Scene scene = new Scene(splitpane, 900, 350);
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
