package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.sql.SQLOutput;
import javafx.scene.control.*;

public class Result_of_recent_exam_controller {

    static int first_exam = Quiz.getStudentResult();
    static int counter = 1;

    @FXML
    Label namecourse,grade;
    @FXML
    Button backtomain,takeAnotherExam;

    public void initialize() {

        switch (subjectController.getSubjectName()) {

            case "CS":
                namecourse.setText("Computer Science");

                break;

            case "IT":
                namecourse.setText("Internet Technology");
                break;

            case "PL2":
                namecourse.setText("Programming Language 2");
                break;


        }
        switch (counter) {


            case 1:
                grade.setText(String.valueOf(first_exam));
                dataCenter.setFirstgrade(first_exam);
                counter++;
                break;

            case 2:
                grade.setText(String.valueOf(Quiz.getStudentResult() - first_exam));
                dataCenter.setSecondgrade(Quiz.getStudentResult() - first_exam);
                counter++;
                break;

            case 3:
                grade.setText(String.valueOf(Quiz.getStudentResult() - (dataCenter.getSecondgrade() + first_exam)));
                break;


        }


    }

    public void tomain() throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("GUI_mainPage.fxml"));
        Stage window =(Stage) backtomain.getScene().getWindow();
        window.setTitle("MainPage");
        window.setScene(new Scene(root, 658, 400));
    }

    public void tosubject() throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("subject.fxml"));
        Stage window =(Stage) takeAnotherExam.getScene().getWindow();
        window.setTitle("Subject");
        window.setScene(new Scene(root, 600, 500));
    }
}
