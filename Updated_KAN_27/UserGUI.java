import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UserGUI extends Application {

    private Scene registrationScene;
    private Scene loginScene;
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("User Registration");

        // Registration Scene
        GridPane registrationGrid = new GridPane();
        registrationGrid.setPadding(new Insets(20, 20, 20, 20));
        registrationGrid.setVgap(10);
        registrationGrid.setHgap(10);

        Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 0);
        TextField usernameField = new TextField();
        GridPane.setConstraints(usernameField, 1, 0);

        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);
        PasswordField passwordField = new PasswordField();
        GridPane.setConstraints(passwordField, 1, 1);

        Label emailLabel = new Label("Email:");
        GridPane.setConstraints(emailLabel, 0, 2);
        TextField emailField = new TextField();
        GridPane.setConstraints(emailField, 1, 2);

        Button registerButton = new Button("Register");
        GridPane.setConstraints(registerButton, 0, 3);

        Button switchToLoginButton = new Button("Login");
        GridPane.setConstraints(switchToLoginButton, 1, 3);

        registrationGrid.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField,
                emailLabel, emailField, registerButton, switchToLoginButton);

        registrationScene = new Scene(registrationGrid, 300, 200);

        // Login Scene
        GridPane loginGrid = new GridPane();
        loginGrid.setPadding(new Insets(20, 20, 20, 20));
        loginGrid.setVgap(10);
        loginGrid.setHgap(10);

        Label loginUsernameLabel = new Label("Username:");
        GridPane.setConstraints(loginUsernameLabel, 0, 0);
        TextField loginUsernameField = new TextField();
        GridPane.setConstraints(loginUsernameField, 1, 0);

        Label loginPasswordLabel = new Label("Password:");
        GridPane.setConstraints(loginPasswordLabel, 0, 1);
        PasswordField loginPasswordField = new PasswordField();
        GridPane.setConstraints(loginPasswordField, 1, 1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 0, 2);

        Button switchToRegisterButton = new Button("Register");
        GridPane.setConstraints(switchToRegisterButton, 1, 2);

        loginGrid.getChildren().addAll(loginUsernameLabel, loginUsernameField, loginPasswordLabel, loginPasswordField,
                loginButton, switchToRegisterButton);

        loginScene = new Scene(loginGrid, 300, 150);

        // Set the initial scene to registration
        primaryStage.setScene(registrationScene);

        // Switch to login scene button action
        switchToLoginButton.setOnAction(event -> primaryStage.setScene(loginScene));

        // Switch to registration scene button action
        switchToRegisterButton.setOnAction(event -> primaryStage.setScene(registrationScene));

        // Register button action
        // Register button action
    registerButton.setOnAction(event -> {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String email = emailField.getText();

        // Validation
        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Error", "Username and password are required.");
        } else {
            // Call register method of UserService to register the user
            UserService userService = new UserService();
            userService.register(username, password, email);
            showAlert("Registration", "User registered successfully!");
            primaryStage.setScene(loginScene); // Switch to login scene after successful registration
        }
    });


        // Login button action
        loginButton.setOnAction(event -> {
            String username = loginUsernameField.getText();
            String password = loginPasswordField.getText();
            // Login logic here (for simplicity, just show a message)
            showAlert("Login", "Logged in successfully as " + username);
        });

        primaryStage.show();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
