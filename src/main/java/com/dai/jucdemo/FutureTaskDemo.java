package com.dai.jucdemo;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Slf4j
public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task3 = new FutureTask<>(() -> {
//            log.debug("hello");
            return 100;
        });

        new Thread(task3, "t3").start();
        Integer result = task3.get();
//        log.debug("结果是：{}", result);
    }

}
