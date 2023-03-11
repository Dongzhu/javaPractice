package threadTest;

public class HowToCreateThread {
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello, MyThread");
        }

        static class MyRun implements Runnable {
            @Override
            public void run() {
                System.out.println("Hello MyRun");
            }
        }

        public static void main(String[] args) {
            new MyThread().start();
            new Thread(new MyRun()).start();
            new Thread(()->{
                System.out.println("Hello Lambda!");
            }).start();
            //System.out.println();
        }
     }
}


/**
 *     启动（创建）线程的三种方式：
 *     1、从Thread继承；
 *     2、实现Runnable接口；
 *     3、通过线程池来启动新线程：Executors.newCachedThreadPool()
 *
 *
 * */