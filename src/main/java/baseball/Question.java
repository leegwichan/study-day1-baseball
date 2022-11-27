package baseball;

import baseball.number.ManualNumber;
import baseball.number.Number;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question {

    private final int COUNT_OF_DIGIT = 3;

    private List<Number> question;

    Question(int number) {
        validateNumber(number);
    }

    private void validateNumber(int number) {
        if (!isCountOfDigitCorrect(number) || !isNotOverlapped(number)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isCountOfDigitCorrect(int number) {
        return (int) Math.log10(number) != COUNT_OF_DIGIT - 1;
    }

    private boolean isNotOverlapped(int number) {
        return Arrays.asList(String.valueOf(number).toCharArray())
                .stream().distinct().count() != COUNT_OF_DIGIT;
    }
}
