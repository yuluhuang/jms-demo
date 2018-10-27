/**
 * @Title
 * @Project demo
 * @Package com.yuluhuang.jms.demo.consumer
 * @Description
 * @author ylh
 * @date 2018-10-27 18:30
 * @version
 */
package com.yuluhuang.jms.demo.consumer;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 *
 * @Description
 * @author ylh
 * @date 2018-10-27 18:30
 */
public class AppConsumer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

    }

}
