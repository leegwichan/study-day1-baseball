package baseball.view.output;

import baseball.dto.ResultDto;

public class OutputView extends OutputViewText{

    public void printStartGame() {
        print(START_GAME);
    }

    public void printGameClear() {
        print(GAME_CLEAR);
    }

    public void printResult(ResultDto result) {
        if (result.getStrike() > 0) {
            printIncludeStrike(result);
            return;
        }
        printExcludeStrike(result);
    }

    private void printIncludeStrike(ResultDto result) {
        if (result.getBall() > 0) {
            print(String.format(BALL_STRIKE_FORMAT, result.getBall(), result.getStrike()));
            return;
        }
        print(result.getStrike() + STRIKE);
    }

    private void printExcludeStrike(ResultDto result) {
        if (result.getBall() > 0) {
            print(result.getBall() + BALL);
            return;
        }
        print(NOTHING);
    }

    private void print(String string) {
        System.out.println(string);
    }
}
