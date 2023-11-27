public enum CouleurName {
    SPADES("S"), HEART("H"), DIAMOND("D"), CLUMBS("C");

    private final String denomination;

    CouleurName(String denomination) {

        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }
}
