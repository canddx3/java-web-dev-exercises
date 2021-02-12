package studios.quizzes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Checkbox extends Question {

    private final ArrayList<String> answers;
    private final ArrayList<String> options;

    public Checkbox ( String question, String[] answers, String[] nonAnswers) {
        super(question);
        this.answers = new ArrayList<>(Arrays.asList(answers));
        ArrayList<String> nonAnswers1 = new ArrayList<>(Arrays.asList(nonAnswers));
        this.options = new ArrayList<>(this.answers);
        this.options.addAll(nonAnswers1);
        Collections.shuffle(this.options);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(this.getQuestion() + "\n");
        for (int i = 0; i < options.size(); i++) {
            char letter = (char)(97+i);
            output.append("\t").append(letter).append(") ").append(options.get(i)).append("\n");
        }
        return output + "Choose one or more answers: ";
    }

    @Override
    public double gradeAnswer(String answersString) {
        double score = 0;
        ArrayList<String> answerArr = new ArrayList<>(Arrays.asList(answersString.split("")));
        for (String answerChar: answerArr) {
            int charCode = answerChar.charAt(0);
            if(charCode<97 || charCode >= options.size()+97) continue;
            int index = charCode - 97;
            String answer = options.get(index);
            if(this.answers.contains(answer)) {
                score++;
            } else {
                score--;
            }
        }
        if(score < 1) {
            return 0;
        } else {
            return score / this.answers.size();
        }

    }
}
