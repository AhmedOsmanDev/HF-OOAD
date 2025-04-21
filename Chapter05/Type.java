public enum Type {

    ACCUSTIC, ELECTRIC;

    @Override
    public String toString() {
        switch (this) {
            case ACCUSTIC:
                return "acoustic";
            default:
                return "electric";
        }
    }
}
