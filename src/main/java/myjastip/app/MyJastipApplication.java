package myjastip.app;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyJastipApplication extends Application {
//        Scene onBoardingScene = new Scene(onBoarding(), 600, 400);
//        Scene registerScene;
//        Scene loginScene = new Scene(loginVBox(), 600, 400);


    private Button registerButton() {
        Button registerButton = new Button("Register");
        registerButton.setOnAction(event -> {
            Stage currentStage = (Stage) registerButton.getScene().getWindow();
            currentStage.setScene(new Scene(loginVBox(), 600, 400));
        });
        return registerButton;
    }

    private Button loginButton() {
        Button loginButton = new Button("Login");
        loginButton.setOnAction(event -> {
            Stage currentStage = (Stage) loginButton.getScene().getWindow();
            currentStage.setScene(new Scene(loginVBox(), 600, 400));
        });
        return loginButton;
    }

    private VBox registerVBox() {
        VBox vbox = new VBox(8);

        Text registerText = new Text("Register");

        TextField emailTextField = new TextField();
        TextField passwordTextField = new TextField();

        Text loginText = new Text("Sudah punya akun? klik Login");

        vbox.getChildren().addAll(registerText, emailTextField, passwordTextField, new Button("Register"), loginText, loginButton());

        return vbox;
    }


    private VBox loginVBox() {
        VBox vbox = new VBox(8);

        Text loginText = new Text("Login");

        TextField emailTextField = new TextField();
        TextField passwordTextField = new TextField();

        Text registerText = new Text("Belum punya akun? klik Register");

        vbox.getChildren().addAll(loginText, emailTextField, passwordTextField, new Button("Login"), registerText, registerButton());

        return vbox;
    }



    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("myJastip");
//        Scene onBoardingScene = new Scene(onBoarding(), 600, 400);
//        Scene registerScene = new Scene(registerVBox(), 600, 400);
//        Scene loginScene = new Scene(loginVBox(), 600, 400);
        stage.setScene(new Scene(registerVBox(), 600, 400));

//        var registerBtn = stage.getScene().getRoot()

        stage.show();
    }
}
