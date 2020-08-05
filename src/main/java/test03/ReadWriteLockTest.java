/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2020 All Rights Reserved.
 */
package test03;


import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * 读写锁
 * @author: wenhua
 * @since: 2020-08-01 11:33
 *
 **/
public class ReadWriteLockTest {



    private static int value;


    static ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    static Lock readLock=readWriteLock.readLock();
    static Lock writeLock=readWriteLock.writeLock();

    public static void read(Lock lock){
        try{
            lock.lock();
            Thread.sleep(1000);
            System.out.println("read over--"+value);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public static void write(Lock lock,int v){
        try{
            lock.lock();
            Thread.sleep(1000);
            value=v;
            System.out.println("write over--"+value);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Runnable readR = () -> read(readLock);
        Runnable writeR = () -> write(writeLock,new Random().nextInt());
        for (int i=0;i<2;i++){
            new Thread(writeR).start();
        }
        for (int i=0;i<18;i++){
            new Thread(readR).start();
        }
    }

}