/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Rectangle;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

/**
 *
 * @author russo.salvatore
 */
public class visualizzacontatti {
   private GridPane gridpane;
   private listacontatti lc;
   private StackPane sp;
//   Rectangle r;

    public visualizzacontatti() {
        Label nome = new Label();
         StackPane sp=new StackPane();
          Rectangle[] r=new Rectangle[lc.dimensione()];
        lc=new listacontatti();
        lc.leggi();
        for (int i = 0; i < lc.dimensione(); i++) {
            r[i]=new Rectangle(30,80);
             nome.setText(lc.getNome(i)+lc.getCognome(i));
              sp.getChildren().addAll(r,nome);
            gridpane.addRow(i,sp);
        }
    }
         
}
