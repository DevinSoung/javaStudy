/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2020 All Rights Reserved.
 */
package test04;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 *
 * @author: wenhua
 * @since: 2020-08-01 15:46
 *
 **/
public class SpringTest {

    public static void main(String[] args) {
        SpringTest springTest = new SpringTest();
        String reflectionToString = ToStringBuilder.reflectionToString(springTest);
        System.out.println(reflectionToString);
    }


}