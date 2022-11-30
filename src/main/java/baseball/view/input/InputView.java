package baseball.view.input;

import baseball.constant.Retry;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public Retry readRetry() {
        String input = Console.readLine();

        if (!Retry.isFormatCorrect(input)) {
            throw new IllegalArgumentException();
        }
        return Retry.getRetry(input);
    }

    public int readNumbers() {
        try {
            return tryReadNumbers();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    private int tryReadNumbers() {
        String input = Console.readLine();
        return Integer.parseInt(input);
    }
}
