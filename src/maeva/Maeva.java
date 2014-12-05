/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maeva;

/**
 *
 * @author UTILISATEUR
 */
public class Maeva {
    static int i = 0;
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("Hello world");
        System.out.println("sout tabulation");
        Lapin lap = new Lapin("rabbit", 2);
        while(i<=10){
            lap.crier();
            i = i + 1;
        }
        // TODO code application logic here
    }
    
}
