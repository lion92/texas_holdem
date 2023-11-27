import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Couleur {
    public List<Carte> getClubs(JeuDeCarte jeuDeCarte) {
        return getAllSameColorCards(CouleurName.CLUMBS.getDenomination());
    }

    public List<Carte> getSpades(JeuDeCarte jeuDeCarte) {
        return getAllSameColorCards(CouleurName.SPADES.getDenomination());
    }

    public List<Carte> getDiamonds() {
        return getAllSameColorCards(CouleurName.DIAMOND.getDenomination());
    }

    public List<Carte> getHearts() {
        return getAllSameColorCards(CouleurName.HEART.getDenomination());
    }

    private List<Carte> getAllSameColorCards(String couleur) {
        ArrayList<Carte> cardClubs = new ArrayList<>();
        EnumSet.allOf(ValeurName.class)
                .forEach((valeurName ->
                        cardClubs.add(new Carte(valeurName.getDenomination(), couleur))));
        return cardClubs;
    }
}
