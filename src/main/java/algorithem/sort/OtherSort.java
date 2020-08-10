package algorithem.sort;

public class OtherSort {

    public static void main(String args[]) {

        int[] noSortedNumbers = {2, 5, 3, 0, 2, 3, 0, 3};

        int[] tt = countingSort(noSortedNumbers);

        for (int i = 1; i < 8; i++) {
            System.out.println(tt[i]);

        }
    }

    // public static  void
    public static int[] countingSort(int[] a) {

        int max = a[0];
        int len = a.length;
        for (int i = 1; i < len; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int c[] = new int[max + 1];

        for (int i = 0; i < len; i++) {
            c[a[i]]++;
        }

        for (int i = 1; i < max + 1; i++) {
            c[i] = c[i] + c[i - 1];
        }

        int[] result = new int[len];
        for (int i = len - 1; i > 0; i--) {

            int temp = c[a[i]] - 1;
            result[temp] = a[i];
            c[a[i]]--;

        }
        return result;
    }

    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int result = 0;
        nums[0] = start;
        result = nums[0];

        for (int i = 1; i < n; i++) {
            nums[i] = start + i * 2;
            result = result ^ nums[i];
        }

        return result;

    }


}
