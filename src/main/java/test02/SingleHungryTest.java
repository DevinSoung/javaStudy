/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2020 All Rights Reserved.
 */
package test02;

/**
 *
 * 饿汉式单例
 * @author: wenhua
 * @since: 2020-08-01 11:37
 *
 **/
public class SingleHungryTest {

    private static final SingleHungryTest singleHungryTest =new SingleHungryTest();

    private SingleHungryTest() {
    }

    public static SingleHungryTest getInstance(){
        return singleHungryTest;
    }
}