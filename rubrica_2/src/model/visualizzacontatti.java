/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
   private TableView <contatti>tv;
   private listacontatti lc;
    private final ObservableList<contatti>lista=FXCollections.observableArrayList();
   
    public visualizzacontatti() {
     tv=new  TableView();
     lc=new listacontatti();
     lc.leggi();
     TableColumn<contatti,String>nome=new TableColumn("nome");
     nome.setMinWidth(150);
     nome.setCellValueFactory(new PropertyValueFactory<contatti,String>("nome"));
     TableColumn<contatti,String>cognome=new TableColumn("cognome");
     cognome.setMinWidth(150);
     cognome.setCellValueFactory(new PropertyValueFactory<contatti,String>("cognome"));
        for (int i = 0; i < lc.dimensione(); i++) {
            System.out.println(lc.getId(i));
           lista.add(new contatti(lc.getId(i),lc.getNome(i),lc.getCognome(i),lc.getVia(i),lc.getCitta(i)));
        }
     tv.setItems(lista);
     tv.getColumns().addAll(nome,cognome);  
    System.out.println(nome);
        }

    public TableView<contatti> getTv() {
        return tv;
    }
    public String getContatto(int pos){
       return lc.getTUTTO(pos);   
    }
    public int dimensione(){
       return lc.dimensione();   
    }
    }
    
    
         

