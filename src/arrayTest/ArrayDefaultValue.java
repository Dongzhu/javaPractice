package arrayTest;

public class ArrayDefaultValue {
    //
    /**
     * 当数组创建后，如果没有给元素赋值，会使用默认值，不同类型的数组默认值不一样。
     *      整数类型，默认值都是0；
     *      小数类型，默认值是0.0；
     *      布尔类型，默认值是false
     *      字符类型，默认值为0
     *      其他类型，默认值为null
     *      null是java中的关键字，表示没有分配空间，空值。
     * */

    public static void main(String[] args) {
        //  局部变量要先赋值才能取值
    //    int n;
    //    System.out.println(n);    //  报错——变量未被初始化（java: variable n might not have been initialized）

        int [] arr = new int[5];

        //  数组元素没有赋值时，是使用的默认值
        //
        System.out.println("================ Default value of Int type array ===================");

        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        System.out.println("================ Default value of Double type array ===================");
        double [] arr1 = new double[6];
        for(int i = 0; i < arr1.length; i ++){
            System.out.println(arr1[i]);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        System.out.println("================ Default value of Boolean type array ===================");
        boolean [] arr2 = new boolean[7];
        for(int i = 0; i < arr2.length; i ++){
            System.out.println(arr2[i]);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        System.out.println("================ Default value of String type array ===================");
        String [] arr3 = new String[8];
        for(int i = 0; i < arr3.length; i ++){
            System.out.println(arr3[i]);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");


    }

}
