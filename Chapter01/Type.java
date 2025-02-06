public enum Type {

    ACCUSTIC, ELECTRIC;

    public String toString() {
        switch (this) {
            case ACCUSTIC:
                return "acoustic";
            default:
                return "electric";
        }
    }
}
