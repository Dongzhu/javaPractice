package variableOperation;

public class siftOperation {

    public static void print(int num){
        for(int i = 31 ; i >= 0; i--){
            System.out.print( (num & (1<<i))== 0 ? "0" : "1" );
        }
        System.out.println();
    }

    public static void main(String[] args){
        // 32位
        //逐位取反，最后加 1
        //int num = 3;
        //int num = 84686656;
        //int num = Integer.MAX_VALUE;
        //int num = Integer.MIN_VALUE;
        //print(num);

        //int b = 123456456;
        //int c = ~b; //~取反
        //print(b);
        //print(c);
        //print(c+1);
        //print(-5);

/*
// 位逻辑运算
        int a = Integer.MIN_VALUE;   //0归属于非负区
        int b = Integer.MAX_VALUE;

        System.out.println(a);
        System.out.println(b);
        System.out.println("============================");
        print(a);
        print(b);
        System.out.println("=============================");
        print(a | b);
        print(a & b);
        print(a ^ b);  //异或

        System.out.println("**********************************");
        int c = 1231455;
        int d = 5643456;
        print(c);
        print(d);
        print(c | d);
        print(c & d);
        print(c ^ d);
        System.out.println("=================================");
*/


/*        // 右移运算
        int a = Integer.MIN_VALUE;
        print(a);
        print(a >> 1);  //带符号右移
        print(a >>> 1); //不带符号右移*/

/*
        int c = 5;
        //int d = -c;
        int d = (~c+1);  //d也可以定义成 对c取反加1
        int e = (-c+1);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
*/

        int m = Integer.MIN_VALUE;
        int n = ~m + 1;
        int k = -m;
        System.out.println(m);
        System.out.println(n);  //由结果可知：系统最小值取反加1，结果仍是它自己。
        print(m);
        print(n);
        print(k);

  /*      print(-1);
        System.out.println("==============================");

        int test = 1;
        print(test);
        print(test<<1);
        print(test<<2);
        print(test<<3);
        print(test<<4);
        print(test<<5);
        print(test<<6);
        print(test<<7);
        print(test<<8);

        System.out.println("========================");
        test = 321232;
        print(test);
        print(test<<1);
        print(test<<2);
        print(test<<3);
        print(test<<4);
        print(test<<5);
        print(test<<6);
        print(test<<7);
        print(test<<8);*/
    }
}

/**
 * 为何位运算要引入对负数“取反加1”的计算机制
 * ---> 这是因为通过对负数 “取反加1” 可以让正数、负数、0 共用同一套逻辑就可得出正确结果
 *
 *
 *
 * */