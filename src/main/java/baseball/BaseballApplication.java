package baseball;

import baseball.dto.ResultDto;
import baseball.game.BaseballGame;
import baseball.view.input.InputView;
import baseball.view.output.OutputView;

public class BaseballApplication {

    private static final String RESTART = "1";
    private static final String QUIT = "2";

    private final InputView inputView;
    private final OutputView outputView;
    private BaseballGame baseballGame;

    BaseballApplication() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        outputView.printStartGame();
        while (true) {
            startGame();

            if (inputView.readRetry().equals(QUIT)) {
                break;
            }
        }
    }

    private void startGame() {
        baseballGame = new BaseballGame();

        while (true) {
            int number = inputView.readNumbers();
            ResultDto result = baseballGame.compare(number);

            outputView.printResult(result);
            if (result.isDone()) {
                outputView.printGameClear();
                break;
            }
        }
    }
}
