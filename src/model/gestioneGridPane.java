/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.prism.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;

/**
 *
 * @author miele.riccardo
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
    
    
    
    
    public GridPane getGridPane(){
        
        return gridpane;
    }
}
