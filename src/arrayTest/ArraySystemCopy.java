package arrayTest;

import java.util.Arrays;

public class ArraySystemCopy {
    //  数组合并
    //  可以使用系统自带方法来复制数组中的内容
    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 4, 5, 6};   //  数组1
        int [] arr2 = {7, 8, 9, 10, 11, 12};    //  数组2

        //  创建新数组的长度为数组1和数组2长度之和
        int [] newArray = new int[arr1.length + arr2.length];

/*
   //  将数组1的元素复制到新数组中
    int length1 = arr1.length;
    for (int i = 0; i < length1; i ++) {
        newArray[i] = arr1[i];
    }

    //  将数组2的元素复制到新数组中
    for (int i = 0; i < arr2.length; i ++) {
        newArray[arr1.length + i] = arr2[i];
    }

    */

        System.arraycopy(arr1, 0, newArray, 0, arr1.length);
        System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);
        System.out.println(Arrays.toString(newArray));
    }
}
