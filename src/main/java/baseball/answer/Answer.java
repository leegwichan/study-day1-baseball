package baseball.answer;

import baseball.number.AutoNumber;
import baseball.number.Number;
import java.util.List;

public class Answer {

    private final int COUNT_OF_DIGIT = 3;

    private List<Number> answer;

    public Answer() {
        createAnswer();
    }

    private void createAnswer() {
        while (answer.size() >= COUNT_OF_DIGIT) {
            Number newNumber = new AutoNumber();
            if (isAlreadyIn(newNumber)) {
                answer.add(newNumber);
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

    
}
