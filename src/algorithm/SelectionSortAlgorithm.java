package algorithm;

public class SelectionSortAlgorithm {
    public static void process1(){
        int N = 1000;
        int a = 0;
        for(int i = 0; i < N; i++) {
            a = 2 + 5 ;
            System.out.println("a = " + a);
            a = 4 * 7 ;
            System.out.println("a = " + a);
            a = 6 * 8 ;
            System.out.println("a = " + a);
        }
        System.out.println("a = " + a);
    }

    public static void process2() {
        int N = 1000 ;
        int a = 0 ;
        for(int i = 0; i < N; i ++) {
            a = 3 | 6;
            System.out.println("a = " + a);
            a = 3 & 4;
            System.out.println("a = " + a);
            a = 4 ^ 698;
            System.out.println("a = " + a);
        }
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        // sorting the random order data array by increasing sequence: 1,2,3,......,n-2,n-1,n.
        // or by decreasing order like: n,n-1,n-2,......3,2,1
        // And estimate the big O(N) complexity of the algorithm.
        int x = 1000,y = 15 ;
        process1();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        process2();
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
