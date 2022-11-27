package baseball.view.input;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readRetry() {
        return null;
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
