package sample;

public class Student {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String userName;
    private String password;
    private String phoneNumber;
    int []arr=new int[3];

    public Student(String firstName, String lastName, String emailAddress, String userName, String password, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
    }

    public void setPassword(String Password){
        this.password =Password;
    }

    public void setFirstName( String firstName ){
        this.firstName=firstName;
    }

    public void setLastName ( String lastName){
        this.lastName=lastName;
    }
    public void setUserName ( String userName ){
        this.userName=userName;
    }


    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber=phoneNumber;
    }



}