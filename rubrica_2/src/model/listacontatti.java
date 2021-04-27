/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author russo.salvatore
 */
public class listacontatti {
    private ArrayList<contatti> a;
    private BufferedReader leggi;
    public listacontatti(){
        a=new ArrayList();
        File f=new File("C:\\Users\\russo.salvatore\\Documents\\NetBeansProjects\\rubrica\\rubrica_2\\src\\dati\\dati"); 
        try {
            FileReader fr=new FileReader(f);
            leggi=new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(listacontatti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void leggi(){
        try {
            String linea=leggi.readLine();
            System.out.println(linea);
            boolean ciclo=true;
            while(ciclo==true){
                String[]dati=linea.split(":");
                String id=dati[0];
                System.out.println(id+" lll");
                String nome=dati[1];
                String cognome=dati[2];
                String via=dati[3];
                String citta=dati[4];
                contatti c=new contatti(id,nome,cognome,via,citta);
                a.add(c);
                linea=leggi.readLine();
                if(linea==null){
                    ciclo=false;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(listacontatti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int dimensione(){
        return a.size();   
    }
    public String getNome(int i){
        return a.get(i).getNome(); 
    }
    public String getCognome(int i){
        return a.get(i).getCognome();   
    }
    public String getId(int i){
        return a.get(i).getId();   
    }
    public String getVia(int i){
        return a.get(i).getVia();   
    }
    public String getCitta(int i){
        return a.get(i).getCitta();   
    }
    public String getTUTTO(int i){
        return a.get(i).toString();
    }
}
