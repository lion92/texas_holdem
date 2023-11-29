import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Couleur {
    public List<Card> getClubs(JeuDeCarte jeuDeCarte) {
        return getAllSameColorCards(CouleurName.CLUMBS.getDenomination());
    }

    public List<Card> getSpades(JeuDeCarte jeuDeCarte) {
        return getAllSameColorCards(CouleurName.SPADES.getDenomination());
    }

    public List<Card> getDiamonds() {
        return getAllSameColorCards(CouleurName.DIAMOND.getDenomination());
    }

    public List<Card> getHearts() {
        return getAllSameColorCards(CouleurName.HEART.getDenomination());
    }

    private List<Card> getAllSameColorCards(String couleur) {
        ArrayList<Card> cards = new ArrayList<>();
        EnumSet.allOf(ValeurName.class)
                .forEach((valeurName ->
                        cards.add(new Card(valeurName.getDenomination(), couleur))));
        return cards;
    }
}
