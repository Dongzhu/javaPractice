package arrayTest;

import java.util.Arrays;

public class ArraysCopyOf {
    //  使用copyof数组合并
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6};
        int [] arr2 = {7, 8, 9, 10, 11, 12};

        int [] newArray = join(arr1, arr2);
        System.out.println(Arrays.toString(newArray));

        //  下面测试一下arr2在前能否对接上
        int [] newArray2 = join(arr2, arr1);
        System.out.println(Arrays.toString(newArray2));
    }

    public static int [] join(int [] arr1, int [] arr2) {
        // 完全复制数组arr1并创建一个指定长度的新数组
        int [] newArray = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);
        return newArray;
    }
}

/**
 * Arrays类是系统提供的多个操作数组的方法的封装
 *
 * */