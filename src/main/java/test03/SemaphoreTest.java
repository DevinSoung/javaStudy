/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2020 All Rights Reserved.
 */
package test03;


import java.util.concurrent.Semaphore;

/**
 *
 *  信号量限流
 * @author: wenhua
 * @since: 2020-08-01 11:33
 *
 **/
public class SemaphoreTest {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1,false);//信号量，默认非公平
        new Thread(()->{
            try {
                semaphore.acquire();
                System.out.println("T1 running");
                Thread.sleep(200);
                System.out.println("T1 running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }

        }).start();

        new Thread(()->{
            try {
                semaphore.acquire();
                System.out.println("T2 running");
                Thread.sleep(200);
                System.out.println("T2 running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }

        }).start();
    }

}