package com.putact.buzz;

public class BuzzFeed {
    public static void main(String []args){
        Buzz buzz =new Buzz();
        for (int i = 1;i<=100; i++){
            System.out.println(buzz.getBuzzString(i));
        }
    }

    public static String getResult(int i) {

        if (i%3==0 && i%5==0){
            return "buzzfeed";
        }

        if (i%3==0){
            return "buzz";
        }

        if (i%5==0){
            return "feed";
        }

        return ""+i;
    }
}
