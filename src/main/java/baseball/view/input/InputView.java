package baseball.view.input;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String RESTART = "1";
    private static final String QUIT = "2";

    public String readRetry() {
        String input = Console.readLine();

        if (!input.equals(RESTART) && !input.equals(QUIT)) {
            throw new IllegalArgumentException();
        }
        return input;
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
