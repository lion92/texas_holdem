import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public class JeuDeCarte {

    public final List<Card> getCards() {
        List<Card> cartes = new ArrayList<>();
        EnumSet.allOf(CouleurName.class)
                .forEach((couleurName ->
                        EnumSet.allOf(ValeurName.class)
                                .forEach(
                                        valeurName -> cartes
                                                .add(new Card(valeurName.getDenomination(), couleurName.getDenomination())))));

        return cartes;
    }

    public final List<Card> shuffle() {
        List<Card> cards = getCards();
        Collections.shuffle(cards);
        return cards;
    }

    public final List<Card> getBlackHand() {
        List<Card> blackHands = new ArrayList<>();
        List<Card> shuffle = shuffle();
        for (int numberCard = 0; numberCard < 5; numberCard++) {
            blackHands.add(shuffle.get(numberCard));
        }
        return blackHands;
    }

    public final List<Card> getWhiteHand() {
        List<Card> whiteHands = new ArrayList<>();
        List<Card> shuffle = shuffle();
        shuffle.removeAll(getBlackHand());
        whiteHands.removeAll(getBlackHand());
        for (int numberCard = 0; numberCard < 5; numberCard++) {
            whiteHands.add(shuffle.get(numberCard));
        }
        return whiteHands;
    }

    public boolean isPairFor(List<Card> cards, String valeur) {
        return isCardPresentFor(cards, valeur, 2);
    }

    public boolean isBrelanFor(List<Card> cards, String valeur) {
        return isCardPresentFor(cards, valeur, 3);
    }

    public boolean isCarreFor(List<Card> cards, String valeur) {
        return isCardPresentFor(cards, valeur, 4);
    }

    public boolean isCoulorFor(List<Card> cards, String couleur) {
        return isCardPresentCouleurFor(cards, couleur, 5);
    }

    private boolean isCardPresentCouleurFor(List<Card> cards, String couleur, int frequency) {
        boolean isCouleur = false;
        int numberIncrementForPair = 0;
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i).couleur().equals(couleur));
            if (cards.get(i).couleur().equals(couleur)) {
                numberIncrementForPair++;
            }
        }
        if (numberIncrementForPair == frequency) {
            isCouleur = true;
        }
        return isCouleur;
    }

    private boolean isCardPresentFor(List<Card> cards, String valeur, int frequency) {
        boolean isBrelan = false;
        int numberIncrementForPair = 0;
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i).valeur().equals(ValeurName.DEUX.getDenomination()));
            if (cards.get(i).valeur().equals(valeur)) {
                numberIncrementForPair++;
            }
        }
        if (numberIncrementForPair == frequency) {
            isBrelan = true;
        }
        return isBrelan;
    }
}
