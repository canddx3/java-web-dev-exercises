package exercises.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private final int studentId;
    private final int numberOfCredits;
    private final float gpa;

    //  construct a new student with given fields
    public Student(String name, int studentId, int numberOfCredits, float gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String greetPerson() {
        return "Hi" + this.name.charAt(0) + " " +this.studentId;
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
}