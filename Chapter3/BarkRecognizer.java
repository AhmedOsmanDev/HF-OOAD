public class BarkRecognizer {
    private Remote remote;

    public BarkRecognizer(Remote remote) {
        this.remote = remote;
    }

    public void recognize(String bark) {
        System.out.println("    BarkRecognizer: Heard a '" + bark + "'");
        remote.pressButton();
    }
}
