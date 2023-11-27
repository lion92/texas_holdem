public enum ValeurName {
    DEUX("2"),
    TROIS("3"),
    QUATRE("4"),
    CINQ("5"),
    SIX("6"),
    SEPT("7"),
    HUIT("8"),
    NEUF("9"),
    DIX("T"),
    VALLET("J"),
    DAME("Q"),
    KING("K"),
    AS("A");

    private final String denomination;

    ValeurName(String denomination) {

        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }
}
