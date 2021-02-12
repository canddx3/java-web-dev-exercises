package studios.quizzes;

public class TrueFalse extends Question{
    private final Boolean answer;

    public TrueFalse(String question, Boolean answer ) {
        super(question);
        this.answer = answer;
    }

    @Override
    public String toString() {
        return this.getQuestion() + "\n\ta) true\n\tb) false\n";
    }

    @Override
    public double gradeAnswer(String answerString) {
        if(answer && answerString.equals("a") || !answer && answerString.equals("b")) {
            return 1;
        } else {
            return 0;
        }
    }
}
