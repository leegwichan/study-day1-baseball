package baseball.number;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberTest {

    @ParameterizedTest(name = "Case : {0}")
    @CsvSource(value = {"4","1","8","9"})
    void createNumberNormalTest(char number) {
        try {
            new Number(number);
        } catch (IllegalArgumentException e) {
            fail();
        }
    }

    @ParameterizedTest(name = "Case : {0}")
    @CsvSource(value = {"0","p","각"})
    void createNumberAbnormalTest(char number) {
        try {
            new Number(number);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @ParameterizedTest(name = "isEqualTest Case : {0}, {1}")
    @CsvSource(value = {"3:3:true", "3:6:false"}, delimiter = ':')
    void isEqualTest(char firstNumber, char secondNumber, boolean expected) {
        Number object1 = new Number(firstNumber);
        Number object2 = new Number(secondNumber);

        assertThat(object1.isEqual(object2)).isEqualTo(expected);
    }
}
