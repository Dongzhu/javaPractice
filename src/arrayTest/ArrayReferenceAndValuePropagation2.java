package arrayTest;

import java.util.Arrays;

public class ArrayReferenceAndValuePropagation2 {
    //  演示方法中创建数组
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        arr = m1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int [] m1(int [] arr1) {
        arr1 = new int[8];
        for (int i = 0; i < arr1.length; i ++) {
            arr1[i] = i + 1;
        }
        return arr1;
    }
}
