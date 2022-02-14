 
package sample;
public class msqQuestion extends shortAnswerQuestion
{
    String c1;
    String c2;
    String c3;
    String c4;
    
    
    public msqQuestion(){
        super();
    }
    
    //Constructor for MSQ //
    public msqQuestion( String question , String c1 , String c2 , String c3 ,
    String c4 , String answerS){
    	super(question,answerS);
    	this.c1 = c1;
    	this.c2 = c2;
    	this.c3 = c3;
    	this.c4 = c4;
    }
    
    //Constructor for Ture and False //
    public msqQuestion( String question , String c1 , String c2 , String answerS){
    	super(question,answerS);
    	this.c1 = c1;
    	this.c2 = c2;
    }
    
    
    public msqQuestion( String question , String c1 , String answerS){
    	super(question,answerS);
    	this.c1 = c1;
    }


    

    /**GET Method Propertie c1*/
    public String getC1(){
        return this.c1;
    }//end method getC1

    /**SET Method Propertie c1*/
    public void setC1(String c1){
        this.c1 = c1;
    }//end method setC1

    /**GET Method Propertie c2*/
    public String getC2(){
        return this.c2;
    }//end method getC2

    /**SET Method Propertie c2*/
    public void setC2(String c2){
        this.c2 = c2;
    }//end method setC2

    /**GET Method Propertie c3*/
    public String getC3(){
        return this.c3;
    }//end method getC3

    /**SET Method Propertie c3*/
    public void setC3(String c3){
        this.c3 = c3;
    }//end method setC3

    /**GET Method Propertie c4*/
    public String getC4(){
        return this.c4;
    }//end method getC4

    /**SET Method Propertie c4*/
    public void setC4(String c4){
        this.c4 = c4;
    }//end method setC4


}
