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
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'username: ");
        String username = scanner.nextLine();
        System.out.println("Inserisci la password: ");
        String password = scanner.nextLine().toUpperCase();
        
        Cifratore cifratore = new Cifratore("BRUCO");
        String passwordCifrata = cifratore.cifra(password);
        
        Scrittore scrittore = new Scrittore("fileDatiGiocatori.csv", username + ";" + passwordCifrata);
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();
        try {
            threadScrittore.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(GranPrixGruppo5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
