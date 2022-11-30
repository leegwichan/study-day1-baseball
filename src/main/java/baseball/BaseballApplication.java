package baseball;

import baseball.constant.Retry;
import baseball.dto.ResultDto;
import baseball.game.BaseballGame;
import baseball.view.input.InputView;
import baseball.view.output.OutputView;

public class BaseballApplication {

    private final InputView inputView;
    private final OutputView outputView;
    private BaseballGame baseballGame;

    BaseballApplication() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        outputView.printStartGame();

        do {
            startGame();
        } while (inputView.readRetry() == Retry.RESTART);
    }

    private void startGame() {
        baseballGame = new BaseballGame();

        ResultDto result;
        do {
            int number = inputView.readNumbers();
            result = baseballGame.compare(number);
            outputView.printResult(result);
        } while (!result.isDone());
        outputView.printGameClear();
    }
}
