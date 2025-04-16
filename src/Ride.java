public class Ride {
    private static int counter = 1;
    private String rideId;
    private Location from;
    private Location to;
    private boolean completed;

    public Ride(Location from, Location to) {
        this.rideId = "R" + counter++;
        this.from = from;
        this.to = to;
        this.completed = false;
    }

    public String getRideId() {
        return rideId;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeRide() {
        this.completed = true;
    }
}
