package baseball.number;

import camp.nextstep.edu.missionutils.Randoms;

public class AutoNumber extends Number{

    AutoNumber() {
        super(Randoms.pickNumberInRange(MIN_NUMBER, MAX_CHAR));
    }
}
