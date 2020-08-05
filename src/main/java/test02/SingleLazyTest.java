/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2020 All Rights Reserved.
 */
package test02;

/**
 *
 * 懒汉式单例
 * @author: wenhua
 * @since: 2020-08-01 11:37
 *
 **/
public class SingleLazyTest {

    private static volatile SingleLazyTest singleLazyTest;


    private SingleLazyTest() {
    }



    public static SingleLazyTest getInstance(){
        if (null==singleLazyTest){
            synchronized (SingleLazyTest.class){
                if (null==singleLazyTest){
                    singleLazyTest=new SingleLazyTest();
                }
            }
        }
        return singleLazyTest;
    }
}