package com.putact.buzz;

public class BuzzFeedV3 {
    public static String of(int i) {

        if (i%3==0&& i%5==0){
            return "BuzzFeed";
        }
        if (i%3==0){
            return "Buzz";
        }
        if (i%5==0){
            return "Feed";
        }
        return String.valueOf(i);
    }
}
