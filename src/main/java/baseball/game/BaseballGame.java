package baseball.game;

import baseball.answer.Answer;
import baseball.dto.ResultDto;
import baseball.question.Question;

public class BaseballGame {

    private final Answer answer;

    BaseballGame() {
        this.answer = new Answer();
    }

    public ResultDto compare(int number) {
        Question question = new Question(number);
        return answer.compareNumbers(question.getNumbers());
    }
}
