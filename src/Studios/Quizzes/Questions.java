package Studios.Quizzes;

import java.util.ArrayList;

public abstract class Questions {
    private String question;
    private String type;
    private int score;
    private ArrayList<String> correctAnswers;

    public Questions ( String question, String type, int score, ArrayList<String> correctAnswers ) {
        this.question = question;
        this.type = type;
        this.score = score;
        this.correctAnswers = correctAnswers;
    }

    public void printQuestionText() {
        System.out.println(this.question);
    }

    public void printAnswerChoices() {
        for(String answer: this.correctAnswers) {
            System.out.println(answer);
        }
    }

    public void printQuestion() {

    }

}
