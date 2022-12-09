package arrayTest;

public class ArrayCreate_01 {
    public static void main(String[] args) {
        //  类型是int的数组，表示在该数组存储的数据类型是整型
        //  5表示数组的长度，意味着能够存储5个int类型的数据
        int [] array1 = new int[5];

        //  存储7个double类型的数据的一块连续空间
        double [] array2 = new double[7];

        //  存储8个String 类型的数据的一块连续存储空间
        String [] array3 = new String[8];

        System.out.println("数组array1的长度为：" + array1.length + ", 数组类型为：" + array1.toString());
        System.out.println("数组array2的长度为：" + array2.length + ", 数组类型为：" + array2.toString());
        System.out.println("数组array3的长度为：" + array3.length + ", 数组类型为：" + array3.toString());

    }
}

/**
 *
 *TIPs:
 *  1.创建数组时，指定类型和长度；
 *  2.数组的组成：
 *      数组是一块连续的空间，数组名相当于数组的首地址，当访问数据元素时，通过数组名+下标的形式访问，例如：
 *      arr[0]表示数组名为arr, 0表示下标，代表第一个元素。
 *      如果数组有5个元素，下标为0~4
 * */


/**
 *
 *
 *目录
 *
 * 数组
 *
 * 一、概念
 *
 * 二、数组的创建和组成
 *
 * 2.1 数组的创建
 *
 * 2.2 数组的组成
 *
 * 三、数组的访问
 *
 * 3.1 直接访问
 *
 * 3.2 下标越界问题
 *
 * 3.3 数组的遍历
 *
 * 3.4 数组的默认值
 *
 * 3.5 数组的常见创建方式
 *
 * 四、数组的扩容
 *
 * 4.1 扩容的步骤
 *
 * 4.2 System.arrayCopy复制数组
 *
 * 4.3 使用Arrays.copyOf复制数组
 *
 * 五、引用传递和值传递
 *
 * 六、可变长参数
 *
 * 七、数组的排序
 *
 * 7.1 冒泡排序
 *
 * 7.2 选择排序
 *
 * 7.3 插入排序
 *
 * 7.4 JDK排序
 *
 * 八、二维数组
 *
 * 数组
 * 一、概念
 * 当需要存储多个相同类型的变量时，如果定义多个变量，比较麻烦，而且不方便统一操作。
 *
 * 此时应该使用数组。
 *
 * 数组是在内存中定义一块连续的空间，存储相同类型的数据。
 *
 * 连续空间
 *
 * 长度在创建时就固定
 *
 * 存储相同类型数据
 *
 * 注意：数组是引用数据类型。
 *
 * 二、数组的创建和组成
 * 2.1 数组的创建
 * 创建数组时，指定类型和长度。
 *
 * public class Test1 {
 *     public static void main(String[] args) {
 *         // 类型是int数组，表示在该数组存储的数据是int类型
 *         // 5表示数组的长度，意味着能存储5个int类型的数据
 *         int [] arr1 = new int[5];
 *
 *         // 存储7个double类型的数据的一块连续空间
 *         double [] arr2 = new double[7];
 *
 *         // 存储8个String类型的数据的一块连续空间
 *         String [] arr3 = new String[8];
 *     }
 * }
 * 2.2 数组的组成
 * 数组是一块连续的空间，数组名相当于数组的首地址，当访问数据元素时，通过数组名+下标的形式访问。例如：arr[0]表示数组名为arr，0表示下标，代表第一个元素。
 *
 * 如果数组有5个元素，下标为0~4，
 *
 *
 * */