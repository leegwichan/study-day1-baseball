package baseball.number;

public abstract class Number {

    protected static final int MIN_NUMBER = 1;
    protected static final int MAX_NUMBER = 9;

    private final int number;

    Number(int number) {
        validateNumberInRange(number);
        this.number = number;
    }

    private void validateNumberInRange(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    public int getNumber() {
        return number;
    }

    public boolean isEqual(Number number) {
        return this.number == number.getNumber();
    }
}
