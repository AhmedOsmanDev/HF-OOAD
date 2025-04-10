public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Bark) {
            Bark bark = (Bark) obj;
            return sound.equalsIgnoreCase(bark.sound);
        }
        return false;
    }
}
