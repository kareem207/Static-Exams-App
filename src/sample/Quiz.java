
package sample;
public class Quiz
{
          msqQuestion msq[] = new msqQuestion[4];
          msqQuestion tF[] = new msqQuestion[4];
          msqQuestion ShortA[] = new msqQuestion[3];
          static int studentResult ;
          static int r;
          

    public static int getR(){
        return r;
    }//end method getR




    public static void setR(int rr){
        r = rr;
    }//end method setR


    //For Omar Hanafy//
    //This is a counuter for the right answers that the student collect //
    public static int getStudentResult(){
        return studentResult;
    }//end method getStudentResult

    //For Omar Hanafy//
    //This is a counuter for the right answers that the student collect //
    public static void setStudentResult(int studentR){
        studentResult = studentR;
    }//end method setStudentResult


}
