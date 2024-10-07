package monPackage;
import java.util.ArrayList;
import java.util.Collections;

public class Batailles {

    public static void main(String[] args) {

        // Etape 1 : 
    	
    	
        ArrayList<Carte> jeuDeCartes = new ArrayList<>();
        for (String couleur : Carte.COULEURS) {
            for (int i = 0; i < Carte.VALEURS.length; i++) {
                jeuDeCartes.add(new Carte(couleur, i));
            }
        }


// -------------------------------------------------------------------------------------------------

        // Etape 2 :

        
        Collections.shuffle(jeuDeCartes);


// -------------------------------------------------------------------------------------------------
        // Étape 3 : 
        Joueurs joueur1 = new Joueurs("Aboubacar le Joueur 1 :");
        Joueurs joueur2 = new Joueurs("Damiss le Joueur 2 :");



// -------------------------------------------------------------------------------------------------

        // Étape 4 :
        
        for (int i = 0; i < jeuDeCartes.size(); i++) {
            if (i % 2 == 0) {
                joueur1.ajouterCarte(jeuDeCartes.get(i));
            } else {
                joueur2.ajouterCarte(jeuDeCartes.get(i));
            }
        }


// -------------------------------------------------------------------------------------------------

        // Étape 5 : 
        
        while (!joueur1.getPaquet().isEmpty() && !joueur2.getPaquet().isEmpty()) {
            Carte carteJ1 = joueur1.tirerCarte();
            Carte carteJ2 = joueur2.tirerCarte();

            System.out.println(joueur1.getNom() + " joue " + carteJ1);
            System.out.println(joueur2.getNom() + " joue " + carteJ2);

            // Comparaison des cartes 
            if (carteJ1.compare(carteJ2) > 0) {
                joueur1.ajouterPoint();
                System.out.println(joueur1.getNom() + "bravo pour ce plie ");
            } else if (carteJ1.compare(carteJ2) < 0) {
                joueur2.ajouterPoint();
                System.out.println(joueur2.getNom() + "bravo pour ce plie ");
            } else {
                System.out.println("Egalité !");
            }

            // le score 
            System.out.println(joueur1);
            System.out.println(joueur2);
            System.out.println("-|-|-|-|-|-|-|-|-|-|--||---|-|-|-|-|-|-|-|||||");
        }


// -------------------------------------------------------------------------------------------------

        // Étape 6 :
        if (joueur1.getScore() > joueur2.getScore()) {
            System.out.println("C'est une victoire de " + joueur1.getNom());
        } else if (joueur1.getScore() < joueur2.getScore()) {
            System.out.println("C'est une victoire de " +joueur2.getNom());
        } else {
            System.out.println("C'est un match nul  !");
        }
    }
}
