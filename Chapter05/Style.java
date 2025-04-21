public enum Style {

    A, F;

    @Override
    public String toString() {
        switch (this) {
            case A:
                return "A";
            default:
                return "F";
        }
    }
}
