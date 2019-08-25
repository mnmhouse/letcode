package com.putact.letcode;


import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Example 1:
 * Input: 3
 * Output: "III"
 * <p>
 * <p>
 * Example 2:
 * Input: 4
 * Output: "IV"
 * <p>
 * Example 3:
 * Input: 9
 * Output: "IX"
 * <p>
 * Example 4:
 * Input: 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * <p>
 * Example 5:
 * Input: 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */


public class RoomToInteger {
    Map<Integer, String> room = new HashMap<Integer, String>(8);

    public RoomToInteger() {
        room.put(1, "I");
        room.put(5, "V");
        room.put(10, "X");
        room.put(50, "L");
        room.put(100, "C");
        room.put(500, "D");
        room.put(1000, "M");
    }

    public String intToRoman(int num) {

        StringBuffer result = new StringBuffer();
        if (num > 3999 || num < 1) {
            return result.append("the number is bigger than 10000").toString();
        }

        if (num >= 1000) {
            int re=num/1000;
            for (int i=1;i<=re;i++){
                result.append(room.get(1000));
            }
            num %= 1000;
        }

        if (num >= 100) {
            int re = num / 100;
            if (re <= 3) {
               for (int i=1;i<=re;i++){
                  result.append(room.get(100));
               }
            } else if (re == 4) {
                result.append(room.get(100));
                result.append(room.get(500));
            } else if (  re>=5 &&re <= 8) {
                result.append(room.get(500));

                for (int i=1;i<=re-5;i++){
                    result.append(room.get(100));
                }

            } else if (re == 9) {
                result.append(room.get(100));
                result.append(room.get(1000));
            }
            num %= 100;
        }

        if (num >= 10) {
            int re = num / 10;
            if (re <= 3) {
                for (int i=1;i<=re;i++){
                    result.append(room.get(10));
                }
            } else if (re == 4) {
                result.append(room.get(10));
                result.append(room.get(50));
            } else if (re <= 8) {
                result.append(room.get(50));
                for (int i=1;i<=re-5;i++){
                    result.append(room.get(10));
                }
            } else if (re == 9) {
                result.append(room.get(10));
                result.append(room.get(100));
            }
            num %= 10;
        }
        if (num >= 1) {
            if (num <= 3) {
                for (int i=1;i<=num;i++){
                    result.append(room.get(1));
                }
            } else if (num == 4) {
                result.append(room.get(1));
                result.append(room.get(5));
            } else if (num <= 8) {
                result.append(room.get(5));
                for (int i=1;i<=num-5;i++){
                    result.append(room.get(1));
                }
            } else if (num == 9) {
                result.append(room.get(1));
                result.append(room.get(10));
            }

        }


        return result.toString();
    }

    public static void main(String args[]){
        System.out.println(new RoomToInteger().intToRoman(1002));
    }
}
