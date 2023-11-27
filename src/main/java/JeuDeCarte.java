import java.util.ArrayList;
import java.util.List;

public class JeuDeCarte {

    public List<Carte> getClubs() {
        return getAllSameColorCards("C");
    }

    public List<Carte> getSpades() {
        return getAllSameColorCards("S");
    }

    private ArrayList<Carte> getAllSameColorCards(final String couleur) {
        ArrayList<Carte> cardClubs = new ArrayList<>();
        for (int numberCard = 2; numberCard < 10; numberCard++) {
            cardClubs.add(new Carte("" + numberCard, couleur));
        }
        cardClubs.add(new Carte("T", couleur));
        cardClubs.add(new Carte("J", couleur));
        cardClubs.add(new Carte("Q", couleur));
        cardClubs.add(new Carte("K", couleur));
        cardClubs.add(new Carte("A", couleur));
        return cardClubs;
    }

    public List<Carte> getDiamonds() {
        return getAllSameColorCards("D");
    }

    public List<Carte> getHearts() {
        return getAllSameColorCards("H");
    }
}
