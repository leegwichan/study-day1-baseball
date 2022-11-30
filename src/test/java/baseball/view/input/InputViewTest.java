package baseball.view.input;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import camp.nextstep.edu.missionutils.Console;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class InputViewTest extends MockConsole{

    @ParameterizedTest(name = "readNumbersTest Case : {0}")
    @CsvSource(value = {"123", "456"})
    void readNumbersNormalTest(String data) {
        when(Console.readLine()).thenReturn(data);

        assertDoesNotThrow(() -> new InputView().readNumbers());
    }

    @ParameterizedTest(name = "readNumbersTest Case : {0}")
    @CsvSource(value = {"123T", "sas"})
    void readNumbersAbnormalTest(String data) {
        when(Console.readLine()).thenReturn(data);

        assertThrows(IllegalArgumentException.class,
                () -> new InputView().readNumbers());
    }

    @ParameterizedTest(name = "readRetryTest Case : {0}")
    @CsvSource(value = {"1", "2"})
    void readRetryNormalTest(String data) {
        when(Console.readLine()).thenReturn(data);

        assertDoesNotThrow(() -> new InputView().readRetry());
    }

    @ParameterizedTest(name = "readRetryTest Case : {0}")
    @CsvSource(value = {"4", "s"})
    void readRetryAbnormalTest(String data) {
        when(Console.readLine()).thenReturn(data);

        assertThrows(IllegalArgumentException.class,
                () -> new InputView().readRetry());
    }
}
