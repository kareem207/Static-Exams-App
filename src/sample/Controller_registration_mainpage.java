package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Controller_registration_mainpage {

    @FXML
    Button login,registration;

    public void sendtologin() throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("GUI_Login form.fxml"));
        Stage window =(Stage) login.getScene().getWindow();
        window.setTitle("Login Form");
        window.setScene(new Scene(root,845,440));
    }

    public void sendtoregister() throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("GUI_Registration.fxml"));
        Stage window =(Stage) registration.getScene().getWindow();
        window.setTitle("Registration Form");
        window.setScene(new Scene(root,665,550));
    }

}
