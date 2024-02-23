/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granprixgruppo5;

/**
 *
 * @author Utente
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Scrittore implements Runnable{

    String nomeFile;
    String messaggio;
    
    public Scrittore(String nomeFile, String messaggio){
        this.nomeFile = nomeFile;
        this.messaggio = messaggio;
    }
    
    @Override
    public void run() {
        scrivi();
    }

    public void scrivi(){
        BufferedWriter br = null;
        
        try {
            br = new BufferedWriter(
                    new FileWriter(nomeFile, true));
            
            br.write(messaggio);
            br.write("\n\r");
            
            br.flush();
        } catch (IOException ex) {
            Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (br!=null)
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
 
        //FileWriter fw;
        /*try {
            fw = new FileWriter(nomeFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.write(messaggio);
            pw.write("\n\r");
            
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            System.out.println("Errore nella scrittura in append della stringa");
        } 
        */        
        }
}