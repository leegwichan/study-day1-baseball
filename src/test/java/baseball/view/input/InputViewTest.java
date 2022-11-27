package baseball.view.input;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import camp.nextstep.edu.missionutils.Console;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class InputViewTest extends MockConsole{

    @ParameterizedTest(name = "readNumbersTest Case : {0}")
    @CsvSource(value = {"123", "456"})
    void readNumbersNormalTest(String data) {
        when(Console.readLine()).thenReturn(data);

        try {
            new InputView().readNumbers();
        } catch (IllegalArgumentException e) {
            fail();
        }
    }

    @ParameterizedTest(name = "readNumbersTest Case : {0}")
    @CsvSource(value = {"123T", "sas"})
    void readNumbersAbnormalTest(String data) {
        when(Console.readLine()).thenReturn(data);

        try {
            new InputView().readNumbers();
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @ParameterizedTest(name = "readRetryTest Case : {0}")
    @CsvSource(value = {"1", "2"})
    void readRetryNormalTest(String data) {
        when(Console.readLine()).thenReturn(data);

        try {
            new InputView().readRetry();
        } catch (IllegalArgumentException e) {
            fail();
        }
    }

    @ParameterizedTest(name = "readRetryTest Case : {0}")
    @CsvSource(value = {"4", "s"})
    void readRetryAbnormalTest(String data) {
        when(Console.readLine()).thenReturn(data);

        try {
            new InputView().readRetry();
            fail();
        } catch (IllegalArgumentException e) {
        }
    }
}
