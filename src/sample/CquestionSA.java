package sample;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.*;

public class CquestionSA
{
    @FXML private Text questionN;
    @FXML private Text question;
    @FXML private TextField input;
    @FXML private Button btnNext;
    @FXML private Text text3;

    
    public Stage window;
    public Parent root;
    Stage appStage;

    int  i=1 ;
    int c = Quiz.getR() + 1;

    
    String subjectName = subjectController.getSubjectName();

    dataCenter exam = new dataCenter();
    Quiz quiz = new Quiz();




    public void initialize() {
        
            switch ( subjectController.getSubjectName() ) {

            case "CS":
            quiz = exam.CS();
            break;

            case "IT":
            quiz = exam.IT();
            break;

            case "PL2":
            quiz = exam.PL2();
            break;


        }

        question.setText( quiz.ShortA[0].getQuestion() );
        String x = quiz.ShortA[0].getAnswerS();

        questionN.setText(Integer.toString( c ));
    }

    
    
    // Function for short answer Questions //

    @FXML protected void btnNextShortA(ActionEvent event) throws Exception {


        
        switch ( subjectController.getSubjectName() ) {

            case "CS":
            quiz = exam.CS();
            break;

            case "IT":
            quiz = exam.IT();
            break;

            case "PL2":
            quiz = exam.PL2();
            break;


        }



       
        
        String myInput =   input.getText();
        quiz.ShortA[i-1].setC1(myInput);
        
        if (i<2){
            question.setText( quiz.ShortA[i].getQuestion() );
            quiz.ShortA[i].setC1( myInput );
            String x = quiz.ShortA[i-1].getAnswerS();
            
            Quiz.setStudentResult( Quiz.getStudentResult() + quiz.ShortA[i-1].checker( quiz.ShortA[i-1].getC1() ) );
            input.clear();
        }

        else {
            
            if(event.getSource()==btnNext){
                
             Quiz.setStudentResult( Quiz.getStudentResult() + quiz.ShortA[i-1].checker( quiz.ShortA[i-1].getC1() ) );                                     
             
             System.out.println("The result of this exam is " + Quiz.getStudentResult());
             i=1;
             Quiz.setR(0);
             appStage=(Stage)btnNext.getScene().getWindow();
             root=FXMLLoader.load(getClass().getResource("Result_of_recent_exam.fxml"));
             Scene scene=new Scene(root);
             appStage.setScene(scene);
             appStage.show();
            }
        }

        i++;
        Quiz.setR ( Quiz.getR()+1 );
        questionN.setText(Integer.toString( Quiz.getR() ));
       
    }




}
