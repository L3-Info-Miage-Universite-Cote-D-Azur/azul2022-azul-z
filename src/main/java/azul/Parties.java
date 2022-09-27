package azul;

import azul.joueur.Joueur;
import azul.moteurdejeu.Azul;
import azul.moteurdejeu.PasAssezDeJoueurException;
import azul.vue.AfficherMessage;

public class Parties {

    private final AfficherMessage vue;
    Azul partie;

    public Parties(AfficherMessage vue) {
       this(vue, new Azul(), new Joueur("j1"), new Joueur("j2"), new Joueur("j3"));
    }


    public Parties(AfficherMessage vue, Azul partie, Joueur j1, Joueur j2, Joueur j3) {
        this.vue = vue;
        this.vue.affiche("Parties", "création/affectation de la partie");
        this.partie = partie;

        this.vue.affiche("Parties", "ajout des joueurs à la partie");
        this.partie.ajouterJoueur(j1);
        this.partie.ajouterJoueur(j2);
        this.partie.ajouterJoueur(j3);
    }


    public void lancer(int nbParties) throws PasAssezDeJoueurException {
        for(int i = 0; i < nbParties; i++) {
            partie.initialisation();
            partie.jouer();
        }
    }

    public static final void main(String [] args) throws PasAssezDeJoueurException {
        AfficherMessage vue = new AfficherMessage();
        vue.affiche("Système", "création du lancuer de parties, d'Azul et des joueurs");
        Parties toutesLesParties = new Parties(vue, new Azul(), new Joueur("j1"), new Joueur("j2"), new Joueur("j3"));
        vue.affiche("Système", "lancement de 500 parties");
        toutesLesParties.lancer(500);
    }

}
