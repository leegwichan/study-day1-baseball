package baseball.constant;

import java.util.Arrays;

public enum Retry {

    RESTART("1"),
    QUIT("2");

    private final String format;

    Retry(String format) {
        this.format = format;
    }

    public static boolean isFormatCorrect(String format) {
        return Arrays.stream(Retry.values())
                .map(retry -> retry.format.equals(format))
                .reduce(false, Boolean::logicalOr);
    }

    public static Retry getRetry(String format) {
        for (Retry retry : Retry.values()) {
            if (retry.format.equals(format)) {
                return retry;
            }
        }
        return null;
    }
}
