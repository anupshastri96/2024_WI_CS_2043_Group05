import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users;
    private static final String FILE_PATH = "D:\\CS2043\\Team5-Project\\MEALMATE\\src\\users.csv";

    public UserService() {
        this.users = new HashMap<>();
        loadUsersFromFile();
    }

    private void loadUsersFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                String username = userData[0];
                String password = userData[1];
                users.put(username, new User(username, password));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void register(String username, String password, String email) {
        if (!users.containsKey(username)) {
            users.put(username, new User(username, password, email));
            saveUsersToFile();
            System.out.println("User registered successfully");
        } else {
            System.out.println("Username already exists");
        }
    }
    
    private void saveUsersToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (User user : users.values()) {
                bw.write(user.getUsername() + "," + user.getPassword() + "," + user.getEmail());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public User login(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (user.getPassword().equals(password)) {
                System.out.println("Login successful");
                return user;
            }
        }
        System.out.println("Invalid username or password");
        return null;
    }

    public void updateSettings(User user, String key, String value) {
        user.updateSettings(key, value);
        saveUsersToFile();
        System.out.println("Updated successfully");
    }
}
