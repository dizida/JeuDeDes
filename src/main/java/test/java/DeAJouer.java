package test.java;

import java.util.Random;

public class DeAJouer {
    
     // Attributs de la classe
     private static int nombreDesCrees;
     private int nombreFaces;
     private int valeur;
 
     // Constructeur
     public DeAJouer(int nombreFaces, int valeur) {
         this.nombreFaces = 6;
         this.valeur = 1;
         nombreDesCrees++;
     }

     public static int getNombreDesCrees() {
        return nombreDesCrees;
    }

    public int getNombreFaces() {
        return nombreFaces;
    }

    public int getValeur() {
        return valeur;
    }

    public void LancerLeDe(){

        Random rand = new Random();
        //Saisi un nombre aléatoire entre 0+1 et le nombres de face=6
        this.valeur = (int)(Math.random() * this.nombreFaces) + 1;
    }

    public void afficherValeur(){

        System.out.println(" faces, valeur actuelle : " + this.valeur);

    }

}
