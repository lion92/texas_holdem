import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TirageDeCarteTest {

    private Couleur initialContexte() {
        Couleur couleur = new Couleur();
        return couleur;

    }

    @Test
    void should_return_all_cards_from_clubs() {
        String listClubs = initialContexte().getClubs(new JeuDeCarte()).toString().replaceAll("\\[|]| ,", "").trim();
        assertAll("Jeu de carte pour clubs",
                () -> assertEquals("2C 3C 4C 5C 6C 7C 8C 9C TC JC QC KC AC", listClubs)
        );
    }

    @Test
    void should_return_all_cards_from_spades() {
        String listClubs = initialContexte().getSpades(new JeuDeCarte()).toString().replaceAll("\\[|]| ,", "").trim();
        assertAll("Jeu de carte pour clubs",
                () -> assertEquals("2S 3S 4S 5S 6S 7S 8S 9S TS JS QS KS AS", listClubs)
        );
    }

    @Test
    void should_return_all_cards_from_diamonds() {
        String listClubs = initialContexte().getDiamonds().toString().replaceAll("\\[|]| ,", "").trim();
        assertAll("Jeu de carte pour clubs",
                () -> assertEquals("2D 3D 4D 5D 6D 7D 8D 9D TD JD QD KD AD", listClubs)
        );
    }

    @Test
    void should_return_all_cards_from_hearts() {
        String listClubs = initialContexte().getHearts().toString().replaceAll("\\[|]| ,", "").trim();
        assertAll("Jeu de carte pour clubs",
                () -> assertEquals("2H 3H 4H 5H 6H 7H 8H 9H TH JH QH KH AH", listClubs)
        );
    }

    @Test
    void should_return_all_cards() {
        String listCard = new JeuDeCarte().getCards().toString().replaceAll("\\[|]| ,", "").trim();
        assertAll("Jeu de carte pour clubs",
                () -> assertEquals("2C 3C 4C 5C 6C 7C 8C 9C TC JC QC KC AC 2S 3S 4S 5S 6S 7S 8S 9S TS JS QS KS AS 2D 3D 4D 5D 6D 7D 8D 9D TD JD QD KD AD 2H 3H 4H 5H 6H 7H 8H 9H TH JH QH KH AH", listCard)
        );
    }

    @Test
    void should_return_a_set_of_shuffle_card() {
        List<Card> cardsShuffle = new JeuDeCarte().shuffle();
        assertAll("Jeu de carte",
                () -> assertTrue(cardsShuffle.containsAll(new JeuDeCarte().getCards()))
        );
    }

    @Test
    void should_get_the_first_hand_of_black_hands() {
        List<Card> cardsForWhite = new JeuDeCarte().getWhiteHand();
        List<Card> cardsForBlack = new JeuDeCarte().getBlackHand();
        assertAll("Jeu de carte de black should contain five cards from the set of shuffle cards",
                () -> assertTrue(cardsForBlack.size() == 5),
                () -> assertTrue(new JeuDeCarte().getCards().containsAll(cardsForBlack)),
                () -> assertFalse(cardsForBlack.containsAll(cardsForWhite))
        );
    }

    @Test
    void should_get_the_first_hand_of_white() {
        List<Card> cardsForWhite = new JeuDeCarte().getWhiteHand();
        List<Card> cardsForBlack = new JeuDeCarte().getBlackHand();
        assertAll("Jeu de carte de black should contain five cards from the set of shuffle cards",
                () -> assertTrue(cardsForWhite.size() == 5),
                () -> assertTrue(new JeuDeCarte().getCards().containsAll(cardsForWhite)),
                () -> assertFalse(cardsForWhite.containsAll(cardsForBlack))

        );
    }

    @Test
    void should_show_the_black_hand() {
        List<Card> blackHand = new JeuDeCarte().getBlackHand();
        assertEquals(0,new JeuDeCarte().getBlackHand().toString().split(" ").length, 10);
    }

    @Test
    void should_say_if_a_hand_has_a_pair(){
        List<Card> cards=new ArrayList<>();
        cards.add(new Card(ValeurName.DEUX.getDenomination(), CouleurName.SPADES.getDenomination()));
        cards.add(new Card(ValeurName.DEUX.getDenomination(), CouleurName.HEART.getDenomination()));
        cards.add(new Card(ValeurName.SIX.getDenomination(), CouleurName.CLUMBS.getDenomination()));
        cards.add(new Card(ValeurName.SEPT.getDenomination(), CouleurName.CLUMBS.getDenomination()));
        cards.add(new Card(ValeurName.HUIT.getDenomination(), CouleurName.CLUMBS.getDenomination()));



        assertTrue(new JeuDeCarte().isPair(cards));
    }


}
