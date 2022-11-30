package baseball.number;

import camp.nextstep.edu.missionutils.Randoms;

public class AutoNumber extends Number {

    public AutoNumber() {
        super(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
    }
}
