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

public class CquestionTF {

    @FXML private Text text3;
    @FXML private Text questionN;
    @FXML private Text question;
    @FXML ToggleGroup answer;
    @FXML private RadioButton choose1;
    @FXML private RadioButton choose2;

 
    @FXML private Button btnNext;

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
        
        question.setText( quiz.tF[0].getQuestion() );
        choose1.setText( quiz.tF[0].getC1() );
        choose2.setText( quiz.tF[0].getC2() );


        questionN.setText(Integer.toString( c ) );

            

    }

    
    
    @FXML protected void btnNextTF(ActionEvent event) throws Exception {
        
        
    RadioButton selectedRadioButton = (RadioButton) answer.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    
    
        
    if (i<4){
        


        
        question.setText( quiz.tF[i].getQuestion() );
        choose1.setText( quiz.tF[i].getC1() );
        choose2.setText( quiz.tF[i].getC2() );
            
        String x = quiz.tF[i-1].getAnswerS();
        Quiz.setStudentResult( Quiz.getStudentResult() + quiz.tF[i-1].checker(toogleGroupValue) );
        selectedRadioButton.setSelected(false);
    }

    else {

        if(event.getSource()==btnNext)
        {
            
        String x = quiz.tF[i-1].getAnswerS();
        Quiz.setStudentResult( Quiz.getStudentResult() + quiz.tF[i-1].checker(toogleGroupValue) );            
         
         System.out.println("The tf result is " + Quiz.getStudentResult() );
         Quiz.setR ( Quiz.getR()+1 );
         appStage=(Stage)btnNext.getScene().getWindow();
         root=FXMLLoader.load(getClass().getResource("ShortAQuestions.fxml"));
         Scene scene=new Scene(root);
         appStage.setScene(scene);
         appStage.show();
                }
        }

        i++;
        Quiz.setR ( Quiz.getR()+1 );
        questionN.setText(Integer.toString( Quiz.getR()+1 ));
       
    }

}
