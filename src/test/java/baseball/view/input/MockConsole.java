package baseball.view.input;

import static org.mockito.Mockito.mockStatic;

import camp.nextstep.edu.missionutils.Console;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockedStatic;

public abstract class MockConsole {

    private MockedStatic<Console> mockConsole;

    @BeforeEach
    void mockClass() {
        mockConsole = mockStatic(Console.class);
    }

    @AfterEach
    void closeMockedClass() {
        mockConsole.close();
    }
}
