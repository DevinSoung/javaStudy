/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2020 All Rights Reserved.
 */
package test03;


import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 *
 *  阶段操作
 * @author: wenhua
 * @since: 2020-08-01 11:33
 *
 **/
public class PhaserTest {


    static Random r=new Random();
    static Phaser phaser = new Phaser();

    static void milliSleep(int milli){
        try {
            TimeUnit.MILLISECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        phaser.arriveAndAwaitAdvance();
        phaser.arriveAndDeregister();
    }

}