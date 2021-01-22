package exercises.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private float gpa;

    //  construct a new student with given fields
    public Student(String name, int studentId, int numberOfCredits, float gpa) {
        setName(name);
        setNumberOfCredits(numberOfCredits);
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String greetPerson() {
        return "Hi" + this.name.substring(0,1) + " " +this.studentId;
    }

    //  Getters and Setters
    public String getName () {
        return name;
    }
    public void setName ( String name ) {
        if(name == null || name.isEmpty()) {
            System.out.println("not valid name");
            return;
        }
        this.name = name;
    }

    public int getStudentId () {
        return studentId;
    }
    public void setStudentId ( int studentId ) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits () {
        return numberOfCredits;
    }
    public void setNumberOfCredits ( int numberOfCredits ) {
        this.numberOfCredits = numberOfCredits;
    }

    public float getGpa () {
        return gpa;
    }
    public void setGpa ( double gpa ) {
        this.gpa = (float) gpa;
    }

}