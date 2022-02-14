package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.xml.crypto.Data;
import java.io.IOException;

public class RegistrationController {
    @FXML
    TextField firstName_ID, lastName_ID, email_ID, userName_ID, phoneNumber_ID, password_ID, confirmPassword_ID;
    @FXML
    Text textID;
    @FXML
    Button Submit,Reset;

    public void toSubmit() throws IOException {
        String password = password_ID.getText();
        String confirmPassword=confirmPassword_ID.getText();

        if(password.equals(confirmPassword) && password.length()>=8 ){
            Student student = new Student(firstName_ID.getText(),
                    lastName_ID.getText(),
                    email_ID.getText(),
                    userName_ID.getText(),
                    password,
                    phoneNumber_ID.getText());

            Database database = Database.getInstance();
            database.getStudents().addStudent(student);
            Parent root = FXMLLoader.load(getClass().getResource("GUI_Login And Registration Form.fxml"));
            Stage window = (Stage) Submit.getScene().getWindow();
            window.setTitle("Login and Registration");
            window.setScene(new Scene(root,665,550));
        }

        else{

            textID.setText("your password doesn't match your confirmed password or it is less than 8 characters");

        }

    }

    public void toReset () throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("GUI_registration.fxml"));
        Stage window = (Stage) Reset.getScene().getWindow();
        window.setTitle("Registration Form");
        window.setScene(new Scene(root,665,550));

    }
}
