package baseball.number;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberTest {

    @ParameterizedTest(name = "Case : {0}")
    @CsvSource(value = {"4","1","8","9"})
    void createNumberNormalTest(int number) {
        try {
            new ManualNumber(number);
        } catch (IllegalArgumentException e) {
            fail();
        }
    }

    @ParameterizedTest(name = "Case : {0}")
    @CsvSource(value = {"0","15","99"})
    void createNumberAbnormalTest(int number) {
        try {
            new ManualNumber(number);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @ParameterizedTest(name = "isEqualTest Case : {0}, {1}")
    @CsvSource(value = {"3:3:true", "3:6:false"}, delimiter = ':')
    void isEqualTest(int firstNumber, int secondNumber, boolean expected) {
        ManualNumber object1 = new ManualNumber(firstNumber);
        ManualNumber object2 = new ManualNumber(secondNumber);

        assertThat(object1.isEqual(object2)).isEqualTo(expected);
    }
}
