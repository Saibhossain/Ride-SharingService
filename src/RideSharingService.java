public class RideSharingService {
    public Ride requestRide(User user, Location from, Location to) {
        if (from == null || to == null) {
            System.out.println("Invalid locations for ride.");
            return null;
        }
        Ride ride = new Ride(from, to);
        System.out.println("Ride Requested:\nRide ID: " + ride.getRideId() + ", From: " + from.getName() + ", To: " + to.getName());
        return ride;
    }

    public void acceptRide(Driver driver, Ride ride) {
        if (!driver.isAvailable()) {
            System.out.println("Driver is not available.");
        } else {
            driver.setAvailable(false);
            System.out.println("Ride Accepted");
        }
    }

    public void completeRide(Driver driver, Ride ride) {
        if (ride.isCompleted()) {
            System.out.println("Ride is already completed!");
        } else {
            ride.completeRide();
            driver.setAvailable(true);
            System.out.println("Ride completed for " + ride.getRideId());
        }
    }
}
