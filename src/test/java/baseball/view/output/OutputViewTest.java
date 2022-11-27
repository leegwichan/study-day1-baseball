package baseball.view.output;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.dto.ResultDto;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import java.util.stream.Stream;

public class OutputViewTest extends PrintTestTool{

    @ParameterizedTest(name = "Case {index}")
    @ArgumentsSource(XXXXXXXXTestData.class)
    void makeBridgeTest(ResultDto data, String expected) {
        new OutputView().printResult(data);

        assertThat(output()).contains(expected);
    }

    static class XXXXXXXXTestData implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of(new ResultDto(2,1,false), "1볼 2스트라이크"),
                    Arguments.of(new ResultDto(3,0,true), "3스트라이크"),
                    Arguments.of(new ResultDto(0,1,false), "1볼"),
                    Arguments.of(new ResultDto(0,0,false), "낫싱")
            );
        }
    }
}
