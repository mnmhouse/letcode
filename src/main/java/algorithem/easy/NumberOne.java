package algorithem.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOne {

    public static void main(String args[]) {
     int []number={1,2,5,7};
     int target =9;
     int []result= twoSum(number,9);
        for (int item: result ) {
            System.out.println(item);

        }
    }
    public static  int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> numberMaper = new HashMap<>(nums.length);
        int len = nums.length;
         int value  ;
        for (int i = 0;i<len;i++ ){

            value = target- nums[i];

            if(numberMaper.containsKey(value)&& numberMaper.get(value)!=i){

                return new int[]{i,numberMaper.get(value)};
            }
            numberMaper.put(nums[i],i);

        }



        return null;
    }



}
