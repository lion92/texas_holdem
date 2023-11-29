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

    public boolean isPair(List<Card> cards) {
        boolean pairtwo=false;
        int numberIncrementForPairTwo=0;
        for(int i=0;i<cards.size();i++){
            System.out.println(cards.get(i).valeur().equals(ValeurName.DEUX.getDenomination()));
            if(cards.get(i).valeur().equals(ValeurName.DEUX.getDenomination())){
                numberIncrementForPairTwo++;
            }
        }
        if(numberIncrementForPairTwo==2){
            pairtwo=true;
        }
        return pairtwo;
    }
}
