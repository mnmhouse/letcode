package com.putact.buzz;

import static java.lang.String.valueOf;

public class GameNumber {
    private int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;

    }

    @Override
    public String toString() {

        return valueOf(rawNumber);
    }
}
