package monPackage;
import java.util.ArrayList;

public class Joueurs {

    private String nom;
    private ArrayList<Carte> paquet; 
    private int score; 
    
   
    public Joueurs(String nom) {
        this.nom = nom;
        this.paquet = new ArrayList<>();
        this.score = 0;
    }


    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public ArrayList<Carte> getPaquet() {
        return paquet;
    }


    public void ajouterCarte(Carte carte) {
        paquet.add(carte);
    }

  
    public Carte tirerCarte() {
        if (paquet.size() > 0) {
            return paquet.remove(0);
        } else {
            return null;
        }
    }

  // le score 
    public void ajouterPoint() {
        this.score++;
    }

    //ToString 
  
    public String toString() {
        return nom + " a un score de " + score;
    }
}
