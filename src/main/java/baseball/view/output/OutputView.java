package baseball.view.output;

public class OutputView extends OutputViewText{

    public void printStartGame() {
        print(START_GAME);
    }

    private void print(String string) {
        System.out.println(string);
    }
}
