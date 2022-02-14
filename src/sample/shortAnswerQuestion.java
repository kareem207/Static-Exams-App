package sample;

public class shortAnswerQuestion
{
    String question;
    String answerS;
    
    public shortAnswerQuestion (){
    }
    
    public shortAnswerQuestion(String question , String answerS){
        this.answerS = answerS;
        this.question = question ; 
    }
    
    public int checker(String answer){
    if ( answer.equalsIgnoreCase(answerS) ) {
    	return 1;
    }

    else return 0;
    }







    /**GET Method Propertie question*/
    public String getQuestion(){
        return this.question;
    }//end method getQuestion



    /**SET Method Propertie question*/
    public void setQuestion(String question){
        this.question = question;
    }//end method setQuestion
 

    /**GET Method Propertie Sanswer*/
    public String getAnswerS(){
        return this.answerS;
    }//end method getSanswer


    /**SET Method Propertie Sanswer*/
    public void setAnswerS(String answerS){
        this.answerS = answerS;
    }//end method setSanswer


}
