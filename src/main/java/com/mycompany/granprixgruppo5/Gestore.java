/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granprixgruppo5;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


/**
 *
 * @author Studenti
 */
public class Gestore {
    String username;
    String password;
    String fileInput = "input.csv";
    
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci l'username: ");
        username = scanner.nextLine();
        
        System.out.println("Inserisci la password: ");
        password = scanner.nextLine();
        
        scanner.close();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileInput))) {
            writer.write("username-password");
        } catch (IOException e) {
            System.out.println("Errore di scrittura");
        }
    }
    
}


