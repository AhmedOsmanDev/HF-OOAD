public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof InstrumentSpec) {
            InstrumentSpec instrumentSpec = (InstrumentSpec) obj;

            if (builder != instrumentSpec.builder)
                return false;
            if (model != null && !model.equals(instrumentSpec.model))
                return false;
            if (type != instrumentSpec.type)
                return false;
            if (backWood != instrumentSpec.backWood)
                return false;
            if (topWood != instrumentSpec.topWood)
                return false;

            return true;
        }

        return false;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}
