package myjastip.app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
public class AuthView {

    private final MyJastipWindow appWindow;
    private Scene loginScene;
    private Scene registerScene;

    public AuthView(MyJastipWindow appWindow) {
        this.appWindow = appWindow;
        createLoginScene();
        createRegisterScene();
    }

    private void createLoginScene() {
        VBox layout = new VBox(15);
        layout.setPadding(new Insets(30));
        layout.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("Login");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        TextField usernameInput = new TextField();
        usernameInput.setPromptText("Username");

        PasswordField passwordInput = new PasswordField();
        passwordInput.setPromptText("Password");

        Button loginButton = new Button("Masuk");
        loginButton.setMaxWidth(Double.MAX_VALUE);
        loginButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");

        Hyperlink registerLink = new Hyperlink("Belum punya akun? Daftar");

        registerLink.setOnAction(e -> appWindow.showRegisterScene());

//        loginButton.setOnAction(e -> {
//            }
//        });

        layout.getChildren().addAll(titleLabel, usernameInput, passwordInput, loginButton, registerLink);
        loginScene = new Scene(layout, 600, 400);
    }

    private void createRegisterScene() {
        VBox layout = new VBox(15);
        layout.setPadding(new Insets(30));
        layout.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("Register");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        TextField usernameInput = new TextField();
        usernameInput.setPromptText("Username Baru");

        PasswordField passwordInput = new PasswordField();
        passwordInput.setPromptText("Password");

        Button registerButton = new Button("Daftar Akun");
        registerButton.setMaxWidth(Double.MAX_VALUE);
        registerButton.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white;");

        Hyperlink loginLink = new Hyperlink("Sudah punya akun? Login");

        loginLink.setOnAction(e -> appWindow.showLoginScene());
        registerButton.setOnAction(e -> appWindow.showLoginScene());

        layout.getChildren().addAll(titleLabel, usernameInput, passwordInput, registerButton, loginLink);
        registerScene = new Scene(layout, 600, 400);
    }

    public Scene getLoginScene() {
        return loginScene;
    }

    public Scene getRegisterScene() {
        return registerScene;
    }
}
