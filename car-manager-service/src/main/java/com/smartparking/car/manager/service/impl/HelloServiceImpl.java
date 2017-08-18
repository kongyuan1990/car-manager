/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.smartparking.car.manager.service.impl
 *
 *    Filename:    HelloServiceImpl.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     Digital Telemedia Co.,Ltd
 *
 *    @author:     FeicusSmith
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年8月9日 下午7:13:00
 *
 *    Revision:
 *
 *    2017年8月9日 下午7:13:00
 *        - first revision
 *
 *****************************************************************/
package com.smartparking.car.manager.service.impl;

import org.springframework.stereotype.Service;

import com.smartparking.car.manager.service.HelloService;

/**
 * @ClassName HelloServiceImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author FeicusSmith
 * @Date 2017年8月9日 下午7:13:00
 * @version 1.0.0
 */
@Service
public class HelloServiceImpl implements HelloService {

    /* (非 Javadoc)
     * Description:
     * @see com.smartparking.car.manager.service.HelloService#toSayHello()
     */
    @Override
    public String toSayHello() {
        String string="Hello World";
        return string;
    }

}
