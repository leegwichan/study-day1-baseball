package baseball.answer;

import baseball.dto.ResultDto;
import baseball.number.Number;
import java.util.List;
import java.util.stream.IntStream;

public class AnswerComparator {

    private static final int COUNT_OF_DIGIT = 3;

    public static ResultDto compareNumbers(List<Number> question, List<Number> answer) {
        int strike = countStrike(question, answer);
        int ball = countBall(question, answer);
        boolean isDone = strike == COUNT_OF_DIGIT;

        return new ResultDto(strike, ball, isDone);
    }

    private static int countStrike(List<Number> question, List<Number> answer) {
        return (int) IntStream.range(0, question.size())
                .filter(index -> question.get(index).isEqual(answer.get(index)))
                .count();
    }

    private static int countBall(List<Number> question, List<Number> answer) {
        return (int) IntStream.range(0, question.size())
                .filter(index -> isMatchedNumberWhenNotEqualIndex(question, answer.get(index), index))
                .count();
    }

    private static boolean isMatchedNumberWhenNotEqualIndex(List<Number> question, Number targetNumber, int notTargetIndex) {
        return (int) IntStream.range(0, question.size())
                .filter(index -> index != notTargetIndex)
                .filter(index -> question.get(index).isEqual(targetNumber))
                .count() > 0;
    }
}
