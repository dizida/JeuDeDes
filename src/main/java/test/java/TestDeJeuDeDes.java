package test.java;

import java.util.Scanner;

public class TestDeJeuDeDes {

private Joueur joueur_1;
private Joueur joueur_2;


    public TestDeJeuDeDes( Joueur joueur_1,  Joueur joueur_2) {
        this.joueur_1= joueur_1;
        this.joueur_2 = joueur_2;
    }
    
    public void LancerPartie(){

        joueur_1.lancer();
        joueur_2.lancer();

        System.out.println("Score du joueur 1 (" + joueur_1.getNom() + " " + joueur_1.getPrenom() + ") : " + joueur_1.score());
        System.out.println("Score du joueur 2 (" + joueur_2.getNom() + " " + joueur_2.getPrenom() + ") : " + joueur_2.score());

        if(joueur_1.score()>joueur_2.score()){
            System.out.println("Le vainqueur est le joureur 1");
        }else if(joueur_1.score()<joueur_2.score()){
            System.out.println("Le vainqueur est le joureur 2");
        }else{
            System.out.println("Egalité");
        }


    }

    public void JouerAuCraps(){

        joueur_1.lancer();
        joueur_2.lancer();

        System.out.println("Score du joueur 1 (" + joueur_1.getNom() + " " + joueur_1.getPrenom() + ") : " + joueur_1.score());
        System.out.println("Score du joueur 2 (" + joueur_2.getNom() + " " + joueur_2.getPrenom() + ") : " + joueur_2.score());

        if(joueur_1.score()>joueur_2.score()){
            System.out.println("Le vainqueur est le joureur 1");
        }else if(joueur_1.score()<joueur_2.score()){
            System.out.println("Le vainqueur est le joureur 2");
        }else{
            System.out.println("Egalité");
        }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Demander les informations pour le joueur 1
        System.out.println("Entrez le nom du joueur 1 : ");
        String nomJoueur1 = scanner.next();

        System.out.println("Entrez le prénom du joueur 1 : ");
        String prenomJoueur1 = scanner.next();

        System.out.println("Entrez le nombre de dés pour le joueur 1 : ");
        int nombreDesJoueur1 = scanner.nextInt();

        System.out.println("Entrez le nombre de faces des dés pour le joueur 1 : ");
        int facesDesJoueur1 = scanner.nextInt();

        Joueur joueur1 = new Joueur(nomJoueur1, prenomJoueur1, nombreDesJoueur1, facesDesJoueur1);

        // Demander les informations pour le joueur 2
        System.out.println("Entrez le nom du joueur 2 : ");
        String nomJoueur2 = scanner.next();

        System.out.println("Entrez le prénom du joueur 2 : ");
        String prenomJoueur2 = scanner.next();

        System.out.println("Entrez le nombre de dés pour le joueur 2 : ");
        int nombreDesJoueur2 = scanner.nextInt();

        System.out.println("Entrez le nombre de faces des dés pour le joueur 2 : ");
        int facesDesJoueur2 = scanner.nextInt();

        Joueur joueur2 = new Joueur(nomJoueur2, prenomJoueur2, nombreDesJoueur2, facesDesJoueur2);

        TestDeJeuDeDes partie = new TestDeJeuDeDes(joueur1, joueur2);

        // Jouer la partie
        partie.LancerPartie();

        scanner.close();
    }
}
