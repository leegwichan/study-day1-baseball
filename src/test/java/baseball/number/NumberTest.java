package baseball.number;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberTest {

    @ParameterizedTest(name = "Case : {0}")
    @CsvSource(value = {"4","1","8","9"})
    void createNumberNormalTest(char number) {
        try {
            new Number('1', '9', number);
        } catch (IllegalArgumentException e) {
            fail();
        }
    }

    @ParameterizedTest(name = "Case : {0}")
    @CsvSource(value = {"0","p","각"})
    void createNumberAbnormalTest(char number) {
        try {
            new Number('1', '9', number);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }
}
