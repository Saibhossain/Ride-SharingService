import java.util.HashMap;

public class User {
    private String name;
    private int id;
    private static HashMap<Integer, User> users = new HashMap<>();

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void registerUser(User user) {
        if (users.containsKey(user.id)) {
            System.out.println("User ID already exists.");
        } else {
            users.put(user.id, user);
            System.out.println("User registered:\nName: " + user.name + ", ID: " + user.id);
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

