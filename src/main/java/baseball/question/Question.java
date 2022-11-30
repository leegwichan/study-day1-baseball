package baseball.question;

import baseball.number.ManualNumber;
import baseball.number.Number;
import java.util.ArrayList;
import java.util.List;

public class Question {

    private final int COUNT_OF_DIGIT = 3;

    private List<Number> question;

    public Question(int number) {
        validateNumber(number);
        initializeNumber(number);
    }

    private void validateNumber(int number) {
        if (!isCountOfDigitCorrect(number) || !isNotOverlapped(number)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isCountOfDigitCorrect(int number) {
        return String.valueOf(number).chars().count() == COUNT_OF_DIGIT;
    }

    private boolean isNotOverlapped(int number) {
        return String.valueOf(number).chars()
                        .distinct().count() == COUNT_OF_DIGIT;
    }

    private void initializeNumber(int number) {
        question = new ArrayList<>();
        while (number > 0) {
            int lastNumber = number % 10;
            question.add(0, new ManualNumber(lastNumber));
            number = number / 10;
        }
    }

    public List<Number> getNumbers() {
        return question;
    }
}
