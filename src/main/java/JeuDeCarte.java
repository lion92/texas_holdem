import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class JeuDeCarte {

    public List<Carte> getCards() {
        List<Carte> cartes = new ArrayList<>();
        EnumSet.allOf(CouleurName.class)
                .forEach((couleurName ->
                        EnumSet.allOf(ValeurName.class)
                                .forEach(
                                        valeurName -> cartes
                                                .add(new Carte(valeurName.getDenomination(), couleurName.getDenomination())))));

        return cartes;
    }


}
