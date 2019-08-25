package com.putact.buzz;

public class BuzzFeed {
    public static void main(String []args){
        Buzz buzz =new Buzz();
        for (int i = 1;i<=100; i++){
            System.out.println(buzz.getBuzzString(i));
        }
    }
}
