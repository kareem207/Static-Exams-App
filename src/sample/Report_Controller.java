package sample;

import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Report_Controller {

 String  name,
         grade,
         phonenumber;

static int  pl2result=dataCenter.getFirstgrade();

 int total_results= Quiz.getStudentResult();


    public Report_Controller() {
        Database database = Database.getInstance();
        name = database.getLoggedOnStudent().getFirstName() +" "+ database.getLoggedOnStudent().getLastName();
        phonenumber=database.getLoggedOnStudent().getPhoneNumber();
    }

 @FXML
  Button button,Result_Button;

 @FXML
 Label Pl2_result,Name_lbl,Cong_lbl,Grade_lbl,Cs_result,IT_result,phone_lbl,total_result;

 public String grade_calculator(int total_results, String grade) {
     if (total_results >=25)
     {
         grade="A";
         Cong_lbl.setText("Congratulations on your welldeserved success, you got A grade.");
     }
     else if (total_results>=22 && total_results<25 )
     {
         grade="B";
         Cong_lbl.setText("Congratulations on your welldeserved success, you got B grade.");
     }
     else if (total_results>=19 && total_results<22 )
     {
         grade="C";
         Cong_lbl.setText("Congratulations on your welldeserved success, you got C grade.");
     }
     else if (total_results>=15 && total_results<19 )
     {
         grade="D";
         Cong_lbl.setText("Congratulations on your welldeserved success, you got D grade.");
     }
     else
     {
         grade="F";
         Cong_lbl.setText("There is no failure except in no longer trying, you got F grade.");
     }
     return grade;
 }
 public void handle_Button(){
    Name_lbl.setText(name);
    phone_lbl.setText(phonenumber);
    Pl2_result.setText( "the Pl result is "+ pl2result +" out of 10");
    Cs_result.setText("the Cs result is "+ dataCenter.getSecondgrade() +" out of 10");
    IT_result.setText("the It result is "+ (Quiz.getStudentResult() - (dataCenter.getSecondgrade() + pl2result)) +" out of 10");
    total_result.setText("total is "+total_results+" out of 30");
    grade=grade_calculator(total_results, grade);
    Grade_lbl.setText(grade);
 }
 public void change_page()throws Exception{
     Parent root = FXMLLoader.load(getClass().getResource("GUI_mainPage.fxml"));
     Stage window =(Stage) button.getScene().getWindow();
     window.setTitle("Login Form");
     window.setScene(new Scene(root, 658, 400));
     }
 }








