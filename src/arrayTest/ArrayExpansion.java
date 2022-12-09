package arrayTest;

import java.util.Arrays;

public class ArrayExpansion {
    //  数组扩容
    public static void main(String[] args) {
        int [] arr = {78, 89, 45, 56, 12, 32, 25};

        //  创建一个新的数组
        int [] arr1 = new int[arr.length + 1];

        //  将原数组中的元素放入到新数组中
        for (int i = 0; i < arr.length; i ++){
            arr1[i] = arr[i];
        }

        //  添加新元素
        arr1[arr.length] = 999;

        //  输出新数组
        System.out.println(Arrays.toString(arr1));
    }

}
