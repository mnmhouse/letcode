package algorithem.sort;

public class MergeSort {

    public static void main(String args[]) {

        int[] noSortedNumbers = {5, 4, 2, 7, 9, 11, 54, 22};

        mergeSorted(noSortedNumbers,8);
        for (int i = 0;i<8;i++){
            System.out.println(noSortedNumbers[i]);
        }
    }

    public static void mergeSorted(int[] nums, int n) {
        mergeSorted(nums, 0, n - 1);
    }

    public static void mergeSorted(int[] nums, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = p+(r-p)/2;
        mergeSorted(nums, p, q);
        mergeSorted(nums, q + 1, r);
        mergeNumber(nums,p,q,r);
    }

    public static void mergeNumber(int[] nums, int p, int q, int r) {

       int i = p;
       int j = q+1;
       int k = 0;// 初始化变量i, j, k

       int []temp= new int[r-p+1]; // 申请一个大小跟a[p...r]一样的临时数组


        while (i<=q&&j<=r){

           if(nums[i]<=nums[j]){
               temp[k++]= nums[i++];
           }else {
               temp[k++]= nums[j++];
           }
       }

        // 判断哪个子数组中有剩余的数据
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组tmp
        while (start <= end) {
            temp[k++] = nums[start++];
        }


        // 将tmp中的数组拷贝回a[p...r]
        for (i = 0; i <= r-p; ++i) {
            nums[p+i] = temp[i];
        }
    }
}
