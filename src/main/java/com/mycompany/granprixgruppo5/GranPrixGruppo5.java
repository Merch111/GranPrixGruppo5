 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.granprixgruppo5;

/**
 *
 * @author Studenti
 */

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GranPrixGruppo5 {

    public static void main(String[] args) {
        int nGiocatori = 0;
        Gestore g1 = new Gestore();
        GiudiceDiGara giud1 = new GiudiceDiGara();
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.println("Quanti giocatori gareggiano?: ");
        nGiocatori = scanner.nextInt();
        
        
        Giocatore[] partecipanti = new Giocatore[nGiocatori];
        
        for(int i = 0; i < nGiocatori; i++) {
            String username = g1.inputUsername();
            String password = g1.inputPassword();
            partecipanti[i] = new Giocatore(username, password);  
            g1.scriviEcifra(partecipanti[i]);
            partecipanti[i].velocita = partecipanti[i].impostaVelocita(nGiocatori);            
        }
        
        giud1.comunicaInizio();
        for(int i = 0; i < nGiocatori; i++) {
            partecipanti[i].start();
            try {
                partecipanti[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(GranPrixGruppo5.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        giud1.comunicaFine();
        giud1.pubblicaClassifica();
       
 }
}
