public enum CouleurName {
    CLUMBS("C"),
    SPADES("S"),
    DIAMOND("D"),
    HEART("H"),
    ;

    private final String denomination;

    CouleurName(String denomination) {

        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }
}
