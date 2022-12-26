package arrayTest;

/**
 *  基本数据类型在传递时是值传递
 *  引用数据类型在传递时是引用传递
 *
 * */

public class ArrayReferenceAndValuePropagation {
    //  引用传递
    public static void main(String[] args) {
        //  基本数据类型值传递
        int n = 5;
        int m = n;
        m = 8;
        System.out.println(n);

        //  引用数据类型引用（地址）传递
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = arr1;
        arr1[2] = 10;
        System.out.println(arr2[2]);

        //  在方法参数时也是值传递
        int i = 3;
        m1(i);
        System.out.println(i);

        //  方法参数传递时，若果是数组，是引用传递
        int [] arr3 = {1, 2, 3, 4, 5};
        m2(arr3);
        System.out.println(arr3[1]);
    }

    public static void m2(int [] arr) {
        arr[1] = 10;
    }

    public static void m1(int m) {
        m = 8;
    }
}


