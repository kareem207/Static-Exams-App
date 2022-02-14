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


public class CquestionMCQ

{
    @FXML private Text questionN;
    @FXML private Text question;
    @FXML ToggleGroup answer;
    @FXML private RadioButton choose1;
    @FXML private RadioButton choose2;
    @FXML private RadioButton choose3;
    @FXML private RadioButton choose4;
    
    @FXML private Button btnNext;

    public Stage window;
    public Parent root;
    Stage appStage;

    int  i=1 ;

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
        
        question.setText( quiz.msq[0].getQuestion() );
        choose1.setText( quiz.msq[0].getC1() );
        choose2.setText( quiz.msq[0].getC2() );
        choose3.setText( quiz.msq[0].getC3() );
        choose4.setText( quiz.msq[0].getC4() );

        questionN.setText(Integer.toString(i));
    }
    

    
    
    // Function for MCQ Questions //
    
    @FXML protected void btnNextMCQ(ActionEvent event) throws Exception {
          
        RadioButton selectedRadioButton = (RadioButton) answer.getSelectedToggle();
        String toogleGroupValue = selectedRadioButton.getText();
    
    
        
        if (i<4){


            question.setText( quiz.msq[i].getQuestion() );
            choose1.setText( quiz.msq[i].getC1() );
            choose2.setText( quiz.msq[i].getC2() );
            choose3.setText( quiz.msq[i].getC3() );
            choose4.setText( quiz.msq[i].getC4() );

            String x = quiz.msq[i-1].getAnswerS();
            Quiz.setStudentResult( Quiz.getStudentResult() + quiz.msq[i-1].checker(toogleGroupValue) );
            selectedRadioButton.setSelected(false);
        }
        


        else {
            
            if(event.getSource()==btnNext)
            {
                
            String x = quiz.msq[i-1].getAnswerS();
            Quiz.setStudentResult( Quiz.getStudentResult() + quiz.msq[i-1].checker(toogleGroupValue) );
            
            Quiz.setR(i);
            appStage=(Stage)btnNext.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("trueOrFalseQuestions.fxml"));
            Scene scene=new Scene(root);
            appStage.setScene(scene);
            appStage.show();
    
    
            }
    
    
        }
    
            questionN.setText(Integer.toString(i+1));
            i++;
           
        }





}
