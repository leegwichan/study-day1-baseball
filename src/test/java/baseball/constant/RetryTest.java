package baseball.constant;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RetryTest {

    @ParameterizedTest(name = "readRetry NormalCase : {0}")
    @CsvSource(value = {"1,RESTART", "2,QUIT"})
    void getRetryNormalTest(String format, Retry retry) {
        assertThat(Retry.getRetry(format)).isEqualTo(retry);
    }

    @ParameterizedTest(name = "readRetry AbnormalCase : {0}")
    @CsvSource(value = {"4", "s"})
    void getRetryAbnormalTest(String format) {
        assertThrows(IllegalArgumentException.class,
                () -> Retry.getRetry(format));
    }
}
