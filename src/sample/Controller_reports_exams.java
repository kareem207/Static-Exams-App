package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller_reports_exams {

    @FXML
    Button Reports, Exams,logout;

    public void toReports() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI_Report.fxml"));
        Stage window = (Stage) Reports.getScene().getWindow();
        window.setTitle("Reports Form");
        window.setScene(new Scene(root, 600, 515));
    }

    public void toExams() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Subject.fxml"));
        Stage window = (Stage) Exams.getScene().getWindow();
        window.setTitle("Exams Form");
        window.setScene(new Scene(root, 600, 500));
    }
    public void tologout() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI_login form.fxml"));
        Stage window = (Stage) Exams.getScene().getWindow();
        window.setTitle("Login Form");
        window.setScene(new Scene(root, 845, 440));
                subjectController.lockA= 0;
                subjectController.lockB = 0;
                subjectController.lockC = 0;
    }

}