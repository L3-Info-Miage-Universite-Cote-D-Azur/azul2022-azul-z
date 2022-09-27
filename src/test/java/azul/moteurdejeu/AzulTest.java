package azul.moteurdejeu;

import azul.joueur.Joueur;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AzulTest {

    Azul partie;

    @Mock
    Joueur j1, j2, j3;

    @BeforeEach
    void setUp() {
        partie = new Azul();
    }

    @Test
    void jouerSansJoueur() {
        assertThrows(PasAssezDeJoueurException.class, () -> partie.jouer());
    }

    @Test
    void jouerAvec3Joueurs() {
        partie.ajouterJoueur(j1);
        partie.ajouterJoueur(j2);
        partie.ajouterJoueur(j3);
        assertDoesNotThrow(() -> partie.jouer());
    }
}