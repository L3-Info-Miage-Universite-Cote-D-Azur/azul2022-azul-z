package azul.moteurdejeu;

import azul.joueur.Joueur;

import java.util.ArrayList;

public class Azul {
    private ArrayList<Joueur> listeJoueurs = new ArrayList<>();

    public void ajouterJoueur(Joueur j) {
        this.listeJoueurs.add(j);
    }

    /**
     * remet le jeu à l'état initial
     */
    public void initialisation() {
    }

    /**
     * dérouler d'une partie
     */
    public void jouer() {
    }
}
