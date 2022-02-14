package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField signusername, signpassword;
    @FXML
    Button mainpage,enter_account;
    @FXML
    Text wronglogin;

    public void sendtomain() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI_Login And Registration Form.fxml"));
        Stage window =(Stage) mainpage.getScene().getWindow();
        window.setTitle("Login and register form");
        window.setScene(new Scene(root,658,400));
    }
    public void sendtoaccount() throws Exception{
        Database database = Database.getInstance();
        Student student = database.getStudents().getStudent(signusername.getText(), signpassword.getText());
        if(student == null) {
            wronglogin.setText("username or password invalid");

        } else {
            database.setLoggedOnStudent(student);
            Parent root = FXMLLoader.load(getClass().getResource("GUI_mainPage.fxml"));
            Stage window = (Stage) enter_account.getScene().getWindow();
            window.setTitle("MainPage_Exmas_Reports form");
            window.setScene(new Scene(root, 658, 400));
        }
    }
}
