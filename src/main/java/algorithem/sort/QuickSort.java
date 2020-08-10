package algorithem.sort;

public class QuickSort {

    public static void main(String args[]) {
        int[] noSortedNumbers = {5, 4, 2, 7, 9, 11, 54, 22};
        quickSorted(noSortedNumbers, 8);
        for (int i = 0; i < 8; i++) {
            System.out.println(noSortedNumbers[i]);
        }
    }

    public static void quickSorted(int[] nums, int n) {
        quickSorted(nums, 0, n - 1);
    }

    public static void quickSorted(int[] nums, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(nums, p, r);
          quickSorted(nums, p, q-1);
          quickSorted(nums, q + 1, r);
    }

    public static int partition(int[] nums, int p, int r) {

        int pivot = nums[r];
        int i = p;

        for (int j = p; j < r; j++) {

            if (nums[j] < pivot) {

                int tmp =nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
            }
        }

        int tmp =nums[r];
        nums[r]=nums[i];
        nums[i]=tmp;

        return i;
    }



}
