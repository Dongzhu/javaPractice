package arrayTest;

public class ReverseOrder {
    //  使数组元素反序
    public static void main(String[] args) {
        //  定义整型数组arr和字符型数组arr2，以供测试用
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        char [] arr2 ={'a','b','c','d','e','f','g','h'};

        reverse(arr);   //调用逆序方法
        printArray(arr); //调用遍历方法

        reverse(arr2);
        printArray(arr2);
    }

    public static void reverse(int[] array) {
        //  利用循环，实现数组遍历，遍历过程中，最远端换位
        //  for的第一项，定义2个变量，最后，两个变量++ --
        for( int min = 0, max = array.length - 1; min < max ; min ++, max --) {
            //  对数组中的元素，进行位置交换
            //  min索引和max索引的元素交换
            //  定义变量，保存min索引
            int temp = array[min];
            //  max索引上的元素，赋值给min索引
            array[min] = array[max];
            //  临时变量，保存的数据，赋值到max索引上
            array[max]  = temp;
        }
    }

    //  定义方法，实现数组的遍历
    public static void printArray(int[] array) {
        //  输出一半中括号[，不要换行打印
        System.out.print("[");
        //  数组元素的遍历
        for (int i = 0; i < array.length; i ++) {
            //  判断遍历到的元素，是不是数组的最后一个元素
            if(i == array.length - 1){
                //  输出数组的元素和 ]
                System.out.print(array[i] + "]");
            } else {
                //  不是数组的最后一个元素，就输出数组元素和逗号
                System.out.print(array[i] + ",");
            }
        }
    }

    //  定义字符型数组调用的方法
    //  反序的方法
    public static void reverse(char[] array) {
        //  利用循环，实现数组遍历，遍历过程中，最远端换位
        //  for的第一项，定义2个变量，最后，两个变量++ --
        for( int min = 0, max = array.length - 1; min < max ; min ++, max --) {
            //  对数组中的元素，进行位置交换
            //  min索引和max索引的元素交换
            //  定义变量，保存min索引
            char temp = array[min];
            //  max索引上的元素，赋值给min索引
            array[min] = array[max];
            //  临时变量，保存的数据，赋值到max索引上
            array[max]  = temp;
        }
    }

    //  定义方法，实现数组的遍历
    public static void printArray(char[] array) {
        //  输出一半中括号[，不要换行打印
        System.out.print("[");
        //  数组元素的遍历
        for (int i = 0; i < array.length; i ++) {
            //  判断遍历到的元素，是不是数组的最后一个元素
            if(i == array.length - 1){
                //  输出数组的元素和 ]
                System.out.print(array[i] + "]");
            } else {
                //  不是数组的最后一个元素，就输出数组元素和逗号
                System.out.print(array[i] + ",");
            }
        }
    }
}


