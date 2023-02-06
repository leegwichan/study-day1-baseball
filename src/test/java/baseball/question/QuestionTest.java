package baseball.question;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class QuestionTest {

    @ParameterizedTest(name = "Case : {0}")
    @CsvSource(value = {"413","178","894","916"})
    void createQuestionNormalTest(int number) {
        try {
            new Question(number);
        } catch (IllegalArgumentException e) {
            fail();
        }
    }

    @ParameterizedTest(name = "Case : {0}")
    @CsvSource(value = {"015","778","92"})
    void createQuestionAbnormalTest(int number) {
        try {
            new Question(number);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }
}
