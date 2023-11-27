import java.util.Objects;

public class Carte {
    private final String valeur;
    private final String couleur;

    public Carte(String valeur, String couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
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
