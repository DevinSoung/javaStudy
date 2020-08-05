/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2020 All Rights Reserved.
 */
package test03;

import java.util.concurrent.CountDownLatch;

/**
 *
 *  等待归零在执行
 * @author: wenhua
 * @since: 2020-08-01 11:33
 *
 **/
public class CountDownLatchTest {

    public static void main(String[] args) {
        Thread[] threads = new Thread[100];
        CountDownLatch countDownLatch = new CountDownLatch(threads.length);
        for (int i=0;i<threads.length;i++) {
            threads[i]=new Thread(()->{
                int result=0;
                for (int j=0;j<10000;j++){
                    result+=j;
                    countDownLatch.countDown();
                }
            });
        }
        for (Thread thread:threads) {
            thread.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("latch end");
    }

}