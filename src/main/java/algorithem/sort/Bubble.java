package algorithem.sort;

import java.util.Scanner;
// 冒泡 选择 插入

/*
*排序算法的执行效率
 */
public class Bubble {
    public static void main(String args[]) {

        int[] noSortedNumbers = {5, 4, 2, 7, 9};
        int[] arr = gennerateArray(10000, 10000);
        int[] a = arr.clone();
        int[] b = arr.clone();

        insertedSorted(a, 10000);
        bobleSorted(b, 10000);

    }


    public static int[] gennerateArray(int len, int max) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * max);
        }
        return arr;
    }

    public static void bobleSorted(int[] noSortedNumbers, int n) {
        long startTime = System.currentTimeMillis();
        ;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (noSortedNumbers[j] > noSortedNumbers[j + 1]) {
                    int temp = noSortedNumbers[j];
                    noSortedNumbers[j] = noSortedNumbers[j + 1];
                    noSortedNumbers[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(noSortedNumbers[i]);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("use ");

        System.out.println("use time is :" + (endTime - startTime));
    }

    static void insertedSorted(int[] noSortedNumbers, int n) {

        long startTime = System.currentTimeMillis();
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; i++) {
            int value = noSortedNumbers[i];
            int j = i - 1;
            for (; j >= 0; j--) {

                if (noSortedNumbers[j] > value) {
                    noSortedNumbers[j + 1] = noSortedNumbers[j];
                } else {
                    break;
                }

            }

            noSortedNumbers[j + 1] = value;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(noSortedNumbers[i]);
        }
        System.out.println("t");

        long endTime = System.currentTimeMillis();
        System.out.println("use time is :" + (endTime - startTime));
    }
}