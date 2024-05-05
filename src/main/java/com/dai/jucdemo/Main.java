package com.dai.jucdemo;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->
        {
            int count = 0;
            while (count++ < 100) {
                System.out.println("before sleep" +Thread.currentThread().isInterrupted());
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
                }
                System.out.println("after sleep" +Thread.currentThread().isInterrupted());
            }
        }, "t1");
        t1.start();
        Thread.sleep(100);
        t1.interrupt();
        t1.join();

    }
}