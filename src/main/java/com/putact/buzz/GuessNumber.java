package com.putact.buzz;

public class GuessNumber {
    private int guessNumber;

    public GuessNumber(int guessNumber) {

        this.guessNumber = guessNumber;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    @Override
    public String toString() {

        if (isDivedeBy(3) && guessNumber%5==0){
            return "buzzfeed";
        }

       if (isDivedeBy(3)){
            return "buzz";
        }

        if (guessNumber%5==0){
            return "feed";
        }
       return String.valueOf(guessNumber);
    }

    private boolean isDivedeBy(int i) {
        return guessNumber%i==0;
    }

}
