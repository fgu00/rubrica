/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;

/**
 *
 * @author russo.salvatore
 */
public class gestioneGridPane {
 private GridPane gridpane;
private Label id,nome,cognome, via,citta;

    public gestioneGridPane() {
        gridpane = new GridPane();
        id = new Label();
        nome = new Label();
        cognome = new Label();
        via = new Label();
        citta = new Label();
        
        gridpane.addRow(0, new Label("Dati contatto"));
        gridpane.addRow(1, new Label("ID:  "), id);
        gridpane.addRow(2, new Label("NOME:  "), nome);
        gridpane.addRow(3, new Label("COGNOME:  "), cognome);
        gridpane.addRow(4, new Label("VIA:  "), via);
        gridpane.addRow(5, new Label("CITTA:  "), citta);
        gridpane.setVgap(20);
    }
    public void risetGrindpane(TableView<contatti>listacontatti){
       id.setText(String.valueOf(listacontatti.getSelectionModel()));  
    }
    
    
    
    public GridPane getGridPane(){  
        return gridpane;
    }
    public void setGrindpane(String a){
        String[]lista=a.split(":");
        id.setText(lista[0]);
        nome.setText(lista[1]);
        cognome.setText(lista[2]);
        via.setText(lista[3]);
        citta.setText(lista[4]);
    }
}
   

