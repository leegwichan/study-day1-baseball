package baseball.view.output;

public class OutputView extends OutputViewText{

    public void printStartGame() {
        print(START_GAME);
    }

    public void printGameClear() {
        print(GAME_CLEAR);
    }

    private void print(String string) {
        System.out.println(string);
    }
}
