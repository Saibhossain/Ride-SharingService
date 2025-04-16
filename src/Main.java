public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------------- Test Case 1 -----------------\n");

        Location loc1 = new Location("Downtown");
        Location loc2 = new Location("Airport");

        // Create User and Driver
        User user1 = new User("Sahid", 1);
        Driver driver1 = new Driver("Sakib", 101, "Sedan", true); // Available

        // Register User and Driver
        User.registerUser(user1);
        Driver.registerDriver(driver1);

        // RideSharingService instance
        RideSharingService service = new RideSharingService();

        // Request Ride
        Ride ride1 = service.requestRide(user1, loc1, loc2);

        // Accept Ride
        service.acceptRide(driver1, ride1);

        // Complete Ride
        service.completeRide(driver1, ride1);

        System.out.println("\n----------------- Test Case 2 -----------------\n");

        // Create User and Drivers
        User user2 = new User("Hossain", 2);
        Driver driver2 = new Driver("Sakib", 101, "Sedan", false); // Unavailable
        Driver driver3 = new Driver("Alisha", 102, "SUV", true); // Available

        // Register User and Drivers
        User.registerUser(user2);
        Driver.registerDriver(driver2);
        Driver.registerDriver(driver3);

        // Request Ride
        Ride ride2 = service.requestRide(user2, loc1, loc2);

        // Try to accept Ride with unavailable driver
        service.acceptRide(driver2, ride2);

        // Accept Ride with available driver
        service.acceptRide(driver3, ride2);

        // Complete Ride
        service.completeRide(driver3, ride2);

        // Attempt to complete again
        service.completeRide(driver3, ride2);

        System.out.println("\n----------------- Test Case 2 -----------------\n");
    }
}