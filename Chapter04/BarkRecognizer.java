import java.util.List;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    // public void recognize(Bark bark) {
    //     System.out.println("    BarkRecognizer: Heard a '" + bark + "'");
    //     List allowedBarks = door.getAllowedBarks();
    //     for (Bark allowedBark : allowedBarks) {
    //         if (allowedBark.equals(bark)) {
    //             door.open();
    //         }
    //     }
    // }
}
