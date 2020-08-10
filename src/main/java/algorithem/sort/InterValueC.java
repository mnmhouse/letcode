package algorithem.sort;

// 冒泡 选择 插入

import java.util.Arrays;
import java.util.HashSet;

/*
*排序算法的执行效率
 */
public class InterValueC {
    public static void main(String args[]) {

    }


    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> setA = new HashSet<>(nums1.length);

        for (Integer  item: nums1){
            setA.add(item);
        }
        HashSet<Integer> setB = new HashSet<>(nums2.length);
        for (Integer  item: nums2){
            setB.add(item);
        }

        if (nums1.length<nums2.length){
           return intersection(nums1,nums2);
        }else {
            return intersection(nums2,nums1);

        }


    }
    public int[] intersection(HashSet<Integer> nums1, HashSet<Integer> nnums2) {


        int[] output = new int[nums1.size()];
        int index=0;
        for (Integer item :nums1){
            if(nnums2.contains(item)){
                output[index++]=item;
            }
        }


         return Arrays.copyOf(output,index);
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