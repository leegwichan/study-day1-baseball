package baseball.number;

public class Number {

    private final char number;

    public Number(char minChar, char maxChar, char number) {
        validateNumberInRange(minChar, maxChar, number);
        this.number = number;
    }

    private void validateNumberInRange(char minChar, char maxChar, char number) {
        if (number < minChar || number > maxChar) {
            throw new IllegalArgumentException();
        }
    }

    public char getNumber() {
        return number;
    }
}
