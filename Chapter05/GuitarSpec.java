public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        super(builder, model, type, numStrings, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!super.equals(obj))
            return false;

        if (obj instanceof GuitarSpec) {
            GuitarSpec guitarSpec = (GuitarSpec) obj;

            if (numStrings == guitarSpec.numStrings)
                return true;
        }

        return false;
    }
}
