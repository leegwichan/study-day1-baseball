package baseball.number;

public class Number {

    private static final char MIN_CHAR = '9';
    private static final char MAX_CHAR = '9';

    private final char number;

    public Number(char number) {
        validateNumberInRange(number);
        this.number = number;
    }

    private void validateNumberInRange(char number) {
        if (number < MIN_CHAR || number > MAX_CHAR) {
            throw new IllegalArgumentException();
        }
    }

    public char getNumber() {
        return number;
    }

    public boolean isEqual(Number number) {
        return this.number == number.getNumber();
    }
}
