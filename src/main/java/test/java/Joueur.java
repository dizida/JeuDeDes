package test.java;

public class Joueur {
    
    private String nom;
    private String prenom;
    private DeAJouer[] tableauDes;

    public Joueur(String nom, String prenom, int nombreDes, int facesDes) {
        this.nom = nom;
        this.prenom = prenom;
        this.tableauDes = new DeAJouer[nombreDes];
    
        for(int i=0; i<tableauDes.length; i++){
            this.tableauDes[i]=new DeAJouer(facesDes, 1);
        }
    }

    public void lancer() {
        //For each chaque valeur du tableau est parcouru et prend la valeur du dé de mon tableau
        for (DeAJouer desEnCours : tableauDes) {
            desEnCours.LancerLeDe();
        }
    }

    // Méthode pour calculer le score du joueur (somme de toutes les valeurs des dés)
    public int score() {
        int total = 0;
        for (DeAJouer desEnCours : tableauDes) {
            total += desEnCours.getValeur();
        }
        return total;
    }

    public int min() {
        int minValue = 1000;
        for (DeAJouer desEnCours : tableauDes) {
            int valeurDe = desEnCours.getValeur();
            if (valeurDe < minValue) {
                minValue = valeurDe;
            }
        }
        return minValue;
    }

    // Méthode pour obtenir la valeur maximale parmi les dés lancés
    public int max() {
        int maxValue = 0;
        //For each
        for (DeAJouer desEnCours : tableauDes) {
            int valeurDe = desEnCours.getValeur();
            if (valeurDe > maxValue) {
                maxValue = valeurDe;
            }
        }
        return maxValue;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public DeAJouer[] getTableauDes() {
        return tableauDes;
    }
}
