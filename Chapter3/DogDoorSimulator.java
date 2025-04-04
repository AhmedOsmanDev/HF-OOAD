public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);

        System.out.println("\nFido barks to go outside...");
        recognizer.recognize("Woof");

        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }

        System.out.println("\n...but he's stuck outside!");
        System.out.println("\nFido starts barking...");
        recognizer.recognize("Woof");

        System.out.println("\nFido's back inside...");
    }
}
