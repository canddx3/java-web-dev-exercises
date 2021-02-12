package studios.quizzes;

public abstract class Question {

    private final String question;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public abstract double gradeAnswer(String answer);
}
