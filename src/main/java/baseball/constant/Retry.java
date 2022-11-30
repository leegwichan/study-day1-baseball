package baseball.constant;

import java.util.Arrays;

public enum Retry {

    RESTART("1"),
    QUIT("2");

    private final String format;

    Retry(String format) {
        this.format = format;
    }

    public static Retry getRetry(String format) {
        for (Retry retry : Retry.values()) {
            if (retry.format.equals(format)) {
                return retry;
            }
        }
        throw new IllegalArgumentException("[ERROR] ");
    }

    public String getFormat() {
        return format;
    }
}
