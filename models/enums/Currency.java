package models.enums;

/*
Explanation:
- We need to define a currency enum.
- currencies in out app are some constants that we need to define them in our code once and use them in our code.
- each currency has some data, put them here and use some methods to work with currencies so simply.
 */

import java.util.regex.Matcher;

public enum Currency implements Command{
    GTC(10),
    QTR(2),
    SUD(5);

    private final int value;

    Currency(int value) {
        this.value = value;
    }

    Currency() {
        this.value = this.ordinal();
    }

    public int getValue() {
        return value;
    }

    @Override
    public Matcher getMatcher(String input) {
        return null;
    }
}

