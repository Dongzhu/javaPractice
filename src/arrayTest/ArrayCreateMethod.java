package arrayTest;

public class ArrayCreateMethod {
    //  数组的创建方式
    public static void main(String[] args) {
        //  1.先声明，后分配空间
        int arr1 [];
        int [] arr2;
        arr1 = new int[5];
        arr2 = new int[4];

        //  2.声明同时分配空间
        int [] arr3 = new int[3];

        //  3.声明并赋值，注意：会自动推断数组的长度，不允许写入长度
        int [] arr4 = new int[] {10, 20, 30, 40, 50};

        //  4.声明并赋值，简化版
        int [] arr5 = {77, 88, 99, 44, 55};

        //  如果要使用先声明，后分配空间的同时赋值
        int [] arr6;
        arr6 = new int[]{123, 456, 789, 147, 258, 369};

        //  不能简写
        int [] arr7;
        //  arr7 = {1, 2, 3, 4, 5, 6}; //报错

        System.out.println("================ Default value of Int type array ===================");

        for(int i = 0; i < arr6.length; i ++){
            System.out.println(arr6[i]);
        }
        System.out.println("==================================================================");
    }
}
