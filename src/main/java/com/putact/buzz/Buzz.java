package com.putact.buzz;

public class Buzz {

    public  String getBuzzString(int number){

        String result = "";
        int three =3;
        if (isaBoolean(number, three)){
            result+="buzz";
        }
        int five = 5;
        if (isaBoolean(number, five)){
            result +="feed";
        }
        if (result.isEmpty()){
           result=""+number;
        }


        return result;
    }

    private boolean isaBoolean(int number, int i) {
        return number % i == 0;
    }
}
