package algorithm;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void selectionSort(int [] arr ) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i ++) { // i ~ N-1
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j ++) {     // i ~ N-1 上找最小值的下标
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i ,minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // for test
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
      /*  SelectionSort selectionSort = new SelectionSort();
        int arr[] = {3,5,7,4,8,2,9,1,6};*/
        int a = 10;
        int b = 99;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.print(a);
        System.out.print(b);

/*        String s1 = "Hello";
        String s2 = "World";
        s1 = s1 ^ s2;
        List list1 =
        */
    }
}
