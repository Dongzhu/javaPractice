package arrayTest;

public class ArrayElementVisit {
    //  赋值和取值
    public static void main(String[] args){

        int [] arr1 = new int[5];

        //  赋值
        arr1[0] = 11;
        arr1[1] = 22;
        arr1[2] = 33;
        arr1[3] = 44;
        arr1[4] = 55;

        //  取值
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
    //    System.out.println(arr1[5]);    // 下标越界



        //  给定取值（下标）范围批量查询取值
        System.out.println("数组arr1的全部元素如下：");
        for(int i = 0; i < arr1.length; i ++){
            System.out.println(arr1[i]);
        }
    }
}


/**
 *
 * 3.2 下标越界问题
 *      当访问的下标超出范围，如上面的代码，如果使用了arr1[5], 就会出现异常，该异常为：
 *      java.lang.ArrayIndexOutOfBoundsException
 *
 * 3.3  数组的遍历
 *      使用循环来兑数组所有的元素进行访问。
 *      注意：数组使用length来表示长度。
 *
 * */