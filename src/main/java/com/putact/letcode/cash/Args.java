package com.putact.letcode.cash;

import java.util.HashMap;
import java.util.Map;

public class Args {

    private static  Map<String,String> argsMap= new HashMap<String, String>(10);

    public static void main(String args[]){

        for (String item:args
             ) {
            System.out.println(item);

        }

    }

    public static String parser(String[] s) {

        for (int i =0;i<s.length;i++) {
            if (s[i].startsWith("-")){
                if (++i<s.length){
                   argsMap.put(s[i],s[i++]);
                }
            }
        }

        return "";
    }
}
