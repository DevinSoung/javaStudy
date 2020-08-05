/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2020 All Rights Reserved.
 */
package test03;


import java.util.concurrent.Exchanger;

/**
 *
 *  两线程之间交换数据
 * @author: wenhua
 * @since: 2020-08-01 11:33
 *
 **/
public class ExchangerTest {

   static Exchanger<String> exchanger = new Exchanger();

    public static void main(String[] args) {
        new Thread(()->{
            String s="S1";
            try {
                s=exchanger.exchange(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---"+s);

        },"T1").start();


        new Thread(()->{
            String s="S2";
            try {
                s=exchanger.exchange(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---"+s);

        },"T2").start();
    }

}