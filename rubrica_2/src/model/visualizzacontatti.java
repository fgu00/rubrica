/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

/**
 *
 * @author russo.salvatore
 */
public class visualizzacontatti {
   private GridPane gridpane;
   private listacontatti lc;
   private StackPane sp;
   private Rectangle[]r;
   private int pos=0;
   
    public visualizzacontatti() {
        Label nome = new Label();
        sp=new StackPane();
        lc=new listacontatti();
        lc.leggi();
         gridpane=new GridPane();
        r=new Rectangle[lc.dimensione()];
        for (int i = 0; i < lc.dimensione(); i++) {
            r[i]=new Rectangle(80,80);
            r[i].setFill(Color.WHITE);
             nome.setText(lc.getNome(i)+" "+lc.getCognome(i));
              sp.getChildren().addAll(r[i],nome);
              System.out.println(nome);
               gridpane.addRow(i,sp);
                System.out.println(nome);
        }
    }
    public String getContatti(int a){
       return lc.getTUTTO(a);  
    }
     public GridPane getGridPane(){
        return gridpane;
    }
     public void pos1(){
         pos=pos+1;
         r[pos-1].setFill(Color.RED);
     }
     public int getpos(){
       return pos; 
     }
     public int getContatti(){
       return lc.dimensione(); 
     }
    }
         

