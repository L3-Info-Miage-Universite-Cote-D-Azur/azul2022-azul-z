package azul;

import azul.joueur.Joueur;
import azul.moteurdejeu.Azul;

public class Parties {

    public Parties() {
        Azul partie = new Azul();
        Joueur j1 = new Joueur("j1");
        Joueur j2 = new Joueur("j2");
        Joueur j3 = new Joueur("j3");

        partie.ajouterJoueur(j1);
        partie.ajouterJoueur(j2);
        partie.ajouterJoueur(j3);

    }

    public static final void main(String [] args) {
        Parties toutesLesParties = new Parties();
    }
}
