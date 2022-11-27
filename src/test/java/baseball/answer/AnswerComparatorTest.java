package baseball.answer;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.dto.ResultDto;
import baseball.number.ManualNumber;
import baseball.number.Number;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnswerComparatorTest {

    @ParameterizedTest(name = "Case {index}")
    @ArgumentsSource(AnswerComparatorTestData.class)
    void makeBridgeTest(List<Integer> questionData, List<Integer> answerData, ResultDto expected) {
        List<Number> question = createAnswers(questionData);
        List<Number> answer =  createAnswers(answerData);

        ResultDto result = AnswerComparator.compareNumbers(question, answer);

        assertThat(result.getStrike()).isEqualTo(expected.getStrike());
        assertThat(result.getBall()).isEqualTo(expected.getBall());
        assertThat(result.isDone()).isEqualTo(expected.isDone());
    }

    static class AnswerComparatorTestData implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of(List.of(4,1,3), List.of(4,1,3), new ResultDto(3,0,true)),
                    Arguments.of(List.of(4,1,3), List.of(3,1,4), new ResultDto(1,2,false)),
                    Arguments.of(List.of(4,1,3), List.of(1,8,9), new ResultDto(0,1,false))
            );
        }
    }

    List<Number> createAnswers(List<Integer> data) {
        return data.stream()
                .map(integer -> new ManualNumber(integer))
                .collect(Collectors.toList());
    }
}
