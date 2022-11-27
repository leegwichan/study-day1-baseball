package baseball.dto;

public class ResultDto {

    private int strike;
    private int ball;
    private boolean isDone;

    public ResultDto(int strike, int ball, boolean isDone) {
        this.strike = strike;
        this.ball = ball;
        this.isDone = isDone;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public boolean isDone() {
        return isDone;
    }
}
