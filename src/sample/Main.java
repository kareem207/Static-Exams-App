package sample;
import java.net.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;

public class Main extends Application {

    
    public Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI_Login And Registration Form.fxml"));
        primaryStage.setTitle("Login and Registration");
        primaryStage.setScene(new Scene(root, 658, 400));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    
    }
}


