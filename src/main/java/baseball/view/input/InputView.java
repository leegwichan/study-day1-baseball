package baseball.view.input;

import baseball.constant.Retry;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String NUMBER_REQUEST = "숫자를 입력해주세요 : ";
    private static final String RETRY_REQUEST_FORMAT = "게임을 새로 시작하려면 %s, 종료하려면 %s를 입력하세요.\n";

    public Retry readRetry() {
        print(String.format(RETRY_REQUEST_FORMAT, Retry.RESTART.getFormat(), Retry.QUIT.getFormat()));
        String input = Console.readLine();
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
        print(NUMBER_REQUEST);
        String input = Console.readLine();
        return Integer.parseInt(input);
    }

    private void print(String string) {
        System.out.print(string);
    }
}
