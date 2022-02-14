package sample;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.util.ResourceBundle;

 
public class subjectController {
    @FXML private Text text2;
    @FXML private Button btnC1;
    @FXML private Button btnC2;
    @FXML private Button btnC3;
    @FXML Button main;

    static String subjectName;
    public static int lockA = 0,lockB = 0,lockC = 0;
     Stage appStage;
     Parent root;
     
     
     
     
     
     public static void setSubjectName(String subjectN){
        subjectName = subjectN ;
    }

    public static String getSubjectName(){
        return subjectName;
    }


    
    @FXML protected void btnC1(ActionEvent event) throws Exception  {

         if (lockA ==0){
         lockA++;
         setSubjectName(btnC1.getText() ) ;
         appStage=(Stage)btnC1.getScene().getWindow();
         root=FXMLLoader.load(getClass().getResource("msqQuestions.fxml"));
         Scene scene=new Scene(root);
         appStage.setScene(scene);
         appStage.show();    
         }
         else{
            text2.setText("Sorry you already entered this exam");
         }
    }
    @FXML protected void btnC2(ActionEvent event) throws Exception {
        
             if (lockB ==0){
             lockB++;
             setSubjectName(btnC2.getText() ) ;
             appStage=(Stage)btnC1.getScene().getWindow();
             root=FXMLLoader.load(getClass().getResource("msqQuestions.fxml"));
             Scene scene=new Scene(root);
             appStage.setScene(scene);
             appStage.show(); 
            }
         else{
            text2.setText("Sorry you already entered this exam");
         }            
        }
    @FXML protected void btnC3(ActionEvent event) throws Exception  {

             if (lockC ==0){
             lockC++;        
             setSubjectName(btnC3.getText() ) ;       
             appStage=(Stage)btnC1.getScene().getWindow();
             root=FXMLLoader.load(getClass().getResource("msqQuestions.fxml"));
             Scene scene=new Scene(root);
             appStage.setScene(scene);
             appStage.show();              
            }
            
            else{
            text2.setText("Sorry you already entered this exam");
            }            
        }
    public void tomain() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI_mainPage.fxml"));
        Stage window =(Stage) main.getScene().getWindow();
        window.setTitle("Main Page");
        window.setScene(new Scene(root,600,400));
    }
}
