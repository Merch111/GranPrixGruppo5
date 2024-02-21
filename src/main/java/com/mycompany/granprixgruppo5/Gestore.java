/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granprixgruppo5;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Studenti
 */
public class Gestore {
    String username;
    String password;
    int nGiocatori = 0;
    
    String fileGiocatori = "giocatori.csv";
    
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quanti giocatori gareggiano?: ");
        nGiocatori = scanner.nextInt();
        
        for(int i = 0; i < nGiocatori; i++) {
            
        System.out.println("Inserisci l'username: ");
        username = scanner.nextLine();
        
        System.out.println("Inserisci la password: ");
        password = scanner.nextLine().toUpperCase();
        
        scanner.close();
        } 
    }
    
}


