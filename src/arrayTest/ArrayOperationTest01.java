package arrayTest;

import java.util.Random;

public class ArrayOperationTest01 {
    //  给定一个数组的长度为10，赋值100以内的随机数，打印所有的数字以及其平均数
    public static void main(String[] args) {
        //  定义数组，长度为10
        int [] arr = new int[10];

        //  定义和变量并赋初始值
        int sum = 0;
        //  赋值并求和
        Random random = new Random();
        for (int i =0 ; i < arr.length; i ++ ){
            arr[i] = random.nextInt(100);
            sum += arr[i];  //  求和
        }

        //  打印输出
        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
        //  打印平均数
        double avg = (double) sum / arr.length;
        System.out.println("平均数为：" + avg);
    }
}
