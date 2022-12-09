package arrayTest;

import java.util.Scanner;

public class ArrayOperationTest02 {
    //  输入一个数字，判断数组中是否包含该数字，如果包含，输出下标，不包含则输出 -1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  给定一个数组
        int arr [] = {234, 454, 345, 44, 78, 65};

        //  接收一个数字
        System.out.println("请输入一个数字：");
        int num = input.nextInt();

        int index = -1;     //  定义下标
        for (int i = 0; i < arr.length; i ++){
            if(num == arr[i]){
                index = i;  //  将下标记住
                break;
            }
        }

        System.out.println("查到该数字在数组中的下标为：" + index);
    }
}
