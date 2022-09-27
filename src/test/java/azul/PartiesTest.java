package azul;

import azul.joueur.Joueur;
import azul.moteurdejeu.Azul;
import azul.vue.AfficherMessage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.inOrder;

@ExtendWith(MockitoExtension.class)
class PartiesTest {
    @Mock
    AfficherMessage vue;

    @Mock
    Azul p;

    @Mock
    Joueur j1, j2, j3;

    Parties parties;

    @BeforeEach
    void setUp(){
        parties = new Parties(vue, p, j1, j2, j3);
    }

    @Test
    void lancer() {
        InOrder ordre = inOrder(p);
        int nbParties = 5;
        parties.lancer(nbParties);
        for(int i = 0; i < nbParties; i++){
            ordre.verify(p).initialisation();
            ordre.verify(p).jouer();
        }

        nbParties = 500;
        parties.lancer(nbParties);
        for(int i = 0; i < nbParties; i++){
            ordre.verify(p).initialisation();
            ordre.verify(p).jouer();
        }
    }
}