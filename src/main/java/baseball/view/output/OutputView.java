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
        StringBuilder stringBuilder = new StringBuilder();

        addBall(stringBuilder, result);
        addStrike(stringBuilder, result);
        addIfNothing(stringBuilder);

        print(stringBuilder.toString().trim());
    }

    private void addBall(StringBuilder stringBuilder, ResultDto result) {
        if (result.getBall() > 0) {
            stringBuilder.append(result.getBall() + BALL);
        }
    }

    private void addStrike(StringBuilder stringBuilder, ResultDto result) {
        if (result.getStrike() > 0) {
            stringBuilder.append(result.getStrike() + STRIKE);
        }
    }

    private void addIfNothing(StringBuilder stringBuilder) {
        if (stringBuilder.length() == 0) {
            stringBuilder.append(NOTHING);
        }
    }

    private void print(String string) {
        System.out.println(string);
    }
}
