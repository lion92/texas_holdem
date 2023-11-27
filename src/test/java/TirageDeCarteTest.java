import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TirageDeCarteTest {

    private Couleur initialContexte(){
        Couleur couleur = new Couleur();
        return couleur;

    }

    @Test
    void should_return_all_card_from_clubs() {
        String listClubs = initialContexte().getClubs(new JeuDeCarte()).toString().replaceAll("\\[|]| ,", "").trim();
        assertAll("Jeu de carte pour clubs",
                () -> assertEquals("2C 3C 4C 5C 6C 7C 8C 9C TC JC QC KC AC", listClubs)
        );
    }

    @Test
    void should_return_all_card_from_spades() {
        String listClubs = initialContexte().getSpades(new JeuDeCarte()).toString().replaceAll("\\[|]| ,", "").trim();
        assertAll("Jeu de carte pour clubs",
                () -> assertEquals("2S 3S 4S 5S 6S 7S 8S 9S TS JS QS KS AS", listClubs)
        );
    }

    @Test
    void should_return_all_card_from_diamonds() {
        String listClubs = initialContexte().getDiamonds().toString().replaceAll("\\[|]| ,", "").trim();
        assertAll("Jeu de carte pour clubs",
                () -> assertEquals("2D 3D 4D 5D 6D 7D 8D 9D TD JD QD KD AD", listClubs)
        );
    }

    @Test
    void should_return_all_card_from_hearts() {
        String listClubs = initialContexte().getHearts().toString().replaceAll("\\[|]| ,", "").trim();
        assertAll("Jeu de carte pour clubs",
                () -> assertEquals("2H 3H 4H 5H 6H 7H 8H 9H TH JH QH KH AH", listClubs)
        );
    }
}
