package azul.moteurdejeu;

import azul.joueur.Joueur;

import java.util.ArrayList;

public class Azul {
    private ArrayList<Joueur> listeJoueurs;

    public void ajouterJoueur(Joueur j) {
        this.listeJoueurs.add(j);
    }
}
