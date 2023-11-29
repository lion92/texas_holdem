import java.util.Objects;

public record Card(String valeur, String couleur) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card carte = (Card) o;
        return Objects.equals(valeur, carte.valeur) && Objects.equals(couleur, carte.couleur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valeur, couleur);
    }

    @Override
    public String toString() {
        return
                valeur + couleur + " ";

    }
}
