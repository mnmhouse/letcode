package com.putact.buzz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static HashSet<String> allStrings = null;

    public static void main(String args[]) {
        // 2019-02-10 data[4]="-",data[7]="-",data.length=10
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            System.out.print(getResult(str));
        }

    }


    public static int getResult(String str) {
        allStrings = new HashSet<>();

        choiceDiffrentStr(0, str.toCharArray());

        return allStrings.size();
    }

    public static void choiceDiffrentStr(int begin, char[] chas) {
        if (begin == (chas.length - 1)) {
            allStrings.add(String.valueOf(chas));
        } else {
            for (int j = begin; j < chas.length; j++) {// from 0 to end

                swap(begin,j,chas);
                choiceDiffrentStr(begin+1,chas);
                swap(begin,j,chas);
            }
        }
    }


    public static void swap(int i, int j, char[] chas) {
        char tmp = chas[i];
        chas[i] = chas[j];
        chas[j] = tmp;

    }
}


