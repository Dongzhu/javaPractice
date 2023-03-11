package threadTest;

import java.util.concurrent.TimeUnit;

public class WhatIsThread {
    private static class Thread01 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i ++) {
                try{
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread01");
            }
        }
    }

    public static void main(String[] args) {
        new Thread01().run();       //  按顺序执行
        //new Thread01().start();   //  抢占式执行
        for (int i = 0; i < 100; i ++) {
            try{
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("main");
        }
    }
}
