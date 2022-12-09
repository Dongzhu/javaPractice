package arrayTest;

public class ArrayExpansion02 {
    //  向数组中添加元素
    public static void main(String[] args) {
        int [] arr = {99, 88, 77, 66, 55, 44, 33};

        arr = add(arr, 35);

        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }

    public static int[] add(int[] arr, int num){
        //  创建一个新数组
        int [] newArray = new int[arr.length + 1];
        //  将原数组中的内容复制到新数组中
        for(int i = 0; i < arr.length; i ++){
            newArray[i] = arr[i];
        }
        //  将要添加的元素添加到新数组的最后
        newArray[arr.length] = num;
        return newArray;
    }
}
