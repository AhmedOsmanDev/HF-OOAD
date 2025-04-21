public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Style style, int numStrings, Wood backWood,
            Wood topWood) {
        super(builder, model, type, numStrings, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!super.equals(obj))
            return false;

        if (obj instanceof MandolinSpec) {
            MandolinSpec mandolinSpec = (MandolinSpec) obj;

            if (style == mandolinSpec.style)
                return true;
        }

        return false;
    }
}
