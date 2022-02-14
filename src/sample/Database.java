package sample;

public class Database {

    private static Database database;
    private final Students students;
    private Student loggedOnStudent;

    public Student getLoggedOnStudent() {
        return loggedOnStudent;
    }

    public void setLoggedOnStudent(Student loggedOnStudent) {
        this.loggedOnStudent = loggedOnStudent;
    }


    public Students getStudents() {
        return students;
    }

    private Database(){
        students = new Students();
    }

    public static Database getInstance() {
        if(database == null) {
            database = new Database();
        }
        return database;
    }
}
