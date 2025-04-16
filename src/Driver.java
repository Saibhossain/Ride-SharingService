import java.util.HashMap;

public class Driver {
    private String name;
    private int id;
    private String vehicleType;
    private boolean available;
    private static HashMap<Integer, Driver> drivers = new HashMap<>();

    public Driver(String name, int id, String vehicleType, boolean available) {
        this.name = name;
        this.id = id;
        this.vehicleType = vehicleType;
        this.available = available;
    }

    public static void registerDriver(Driver driver) {
        if (drivers.containsKey(driver.id)) {
            System.out.println("Driver ID already exists.");
        } else {
            drivers.put(driver.id, driver);
            System.out.println("Driver registered:\nName: " + driver.name + ", ID: " + driver.id);
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }
}
