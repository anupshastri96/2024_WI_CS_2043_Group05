import java.util.HashMap;
import java.util.Map;


public class UserService{
    private Map<String, User> users;

    public UserService(){
        this.users = new HashMap<>();
    }

    public void register(String username, String password){
        if(!users.containsKey(username)){
            users.put(username, new User(username, password));
            System.out.println("User registered successfully");
        }
        else{
            System.out.println("Username already exists");
        }
    }

    public User login(String username, String password){
        if (users.containsKey(username)){
            User user = users.get(username);

            if (user.getPassword().equals(password)){
                System.out.println("Login successful");
                return user;
            }
        }

        System.out.println("Invalid username or password");
        return null;
    }

    public void updateSettings(User user, String key, String value){
        user.updateSettings(key, value);
        System.out.println("Updated sucessfully");
    }
}