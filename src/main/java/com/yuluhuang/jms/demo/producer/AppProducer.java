/**
 * @Title
 * @Project demo
 * @Package com.yuluhuang.jms.demo
 * @Description
 * @author ylh
 * @date 2018-10-27 18:13
 * @version
 */
package com.yuluhuang.jms.demo.producer;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

/**
 * @author ylh
 * @Description
 * @date 2018-10-27 18:13
 */
public class AppProducer {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i = 0; i < 100; i++) {
            service.sendMessage("test" + i);
        }
        context.close();
    }
}
