package studios.quizzes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultiChoice extends Question {

    private final String answer;
    private final ArrayList<String> options;

    public MultiChoice(String question, String answer, String[] nonAnswers) {
        super(question);
        this.answer = answer;
        ArrayList<String> nonAnswers1 = new ArrayList<>(Arrays.asList(nonAnswers));
        this.options = new ArrayList<>(nonAnswers1);
        this.options.add(this.answer);
        Collections.shuffle(this.options);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(this.getQuestion() + "\n");
        for (int i = 0; i < options.size(); i++) {
            char letter = (char)(97+i);
            output.append("\t").append(letter).append(") ").append(options.get(i)).append("\n");
        }
        return output + "Choose one answer: ";
    }

    @Override
    public double gradeAnswer(String answerString) {
        int index = answerString.charAt(0) - 97;
        if(answer.equals(options.get(index))) {
            return 1;
        } else {
            return 0;
        }
    }
}
