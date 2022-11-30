package baseball.answer;

import baseball.dto.ResultDto;
import baseball.number.AutoNumber;
import baseball.number.Number;
import java.util.ArrayList;
import java.util.List;

public class Answer {

    private final int COUNT_OF_DIGIT = 3;

    private final List<Number> answer = new ArrayList<>();

    public Answer() {
        createAnswer();
    }

    private void createAnswer() {
        while (answer.size() < COUNT_OF_DIGIT) {
            Number newNumber = new AutoNumber();
            if (!isAlreadyInAnswer(newNumber)) {
                answer.add(newNumber);
            }
        }
    }

    private boolean isAlreadyInAnswer(Number number) {
        for (Number answerNumber : answer) {
            if (number.isEqual(answerNumber)) {
                return true;
            }
        }
        return false;
    }

    public ResultDto compareNumbers(List<Number> question) {
        return AnswerComparator.compareNumbers(question, answer);
    }
}
