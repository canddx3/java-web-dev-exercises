package studios.quizzes;

public class LinearScale extends Question {
    private final int scaleBegin;
    private final int scaleEnd;
    private final int answer;

    public LinearScale(String question, int answer, int scaleBegin, int scaleEnd) {
        super(question);
        this.scaleBegin = scaleBegin;
        this.scaleEnd = scaleEnd;
        this.answer = answer;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder(this.getQuestion() + "\n");
        for (int i = 0; i < scaleEnd - scaleBegin; i++) {
            char letter = (char)(97+i);
            output.append("\t").append(letter).append(") ").append(scaleBegin + i).append("\n");
        }
        return output + "Choose one answer: ";
    }

    @Override
    public double gradeAnswer(String answerString) {
        int index = answerString.charAt(0) - 97;
        if(index + scaleBegin == answer) {
            return 1;
        } else {
            return 0;
        }
    }

}