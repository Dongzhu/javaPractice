package algorithm;

public class GetMax {
    public static int getMax(int[] arr) {
        return process(arr, 0, arr.length -1);
    }

    // arr[L..R]范围上求最大值
    public static int process(int[] arr, int L, int R) {
        if (L == R) { // arr[L..R]范围上只有一个数，直接返回，base case
            return arr[L];
        }

        for(int i = L; i <= R; i++) {
            System.out.println(arr[i]);
        }

        int mid = L + ((R - L) >> 1); //中点
        int leftMax = process(arr, L,  mid);
        int rightMax = process(arr, mid + 1, R);
        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args ){
/*        int [] array = {99, 21, 13,55,66,12,88,6};
        GetMax getMax = new GetMax();
        array.process();
        */

    }
}

// 利用master公式如何求解时间复杂度呢？
/**
 *
 * T(N) = a*T(N/b) + O(N^d)
 *
 * */
