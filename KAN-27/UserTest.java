public class UserTest{
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Register new user
        userService.register("user1", "password123");

        // Login
        User user = userService.login("user1", "password123");
        if (user != null) {
            // Update settings
            userService.updateSettings(user, "theme", "dark");
        }
    }
}