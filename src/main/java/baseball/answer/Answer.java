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
        while (answer.size() >= COUNT_OF_DIGIT) {
            Number newNumber = new AutoNumber();
            if (!isAlreadyIn(newNumber)) {
                answer.add(newNumber);
                System.out.println(answer.size());
            }
        }
    }

    private boolean isAlreadyIn(Number number) {
        if (answer.isEmpty()) {
            return false;
        }

        return answer.stream()
                .filter(answerNumber -> answerNumber.isEqual(number))
                .count() != 0;
    }

    public ResultDto compareNumbers(List<Number> question) {
        return AnswerComparator.compareNumbers(question, answer);
    }
}
