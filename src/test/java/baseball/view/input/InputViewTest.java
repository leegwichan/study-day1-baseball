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
    void readNumbersAbormalTest(String data) {
        when(Console.readLine()).thenReturn(data);

        try {
            new InputView().readNumbers();
            fail();
        } catch (IllegalArgumentException e) {
        }
    }
}
