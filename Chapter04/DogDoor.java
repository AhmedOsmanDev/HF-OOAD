import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private List allowedBarks;

    public DogDoor() {
        this.open = false;
        allowedBarks = new LinkedList();
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void addAllowedBark(Bark allowedBark) {
        allowedBarks.add(allowedBark);
    }

    public List getAllowedBarks() {
        return allowedBarks;
    }
}
