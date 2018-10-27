/**
 * @Title
 * @Project demo
 * @Package com.yuluhuang.jms.demo.producer
 * @Description
 * @author ylh
 * @date 2018-10-27 17:56
 * @version
 */
package com.yuluhuang.jms.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;


/**
 * @author ylh
 * @Description
 * @date 2018-10-27 17:56
 */
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    JmsTemplate jmsTemplate;

    @Resource(name = "topicDestination")
    Destination destination;

    @Override
    public void sendMessage(final String message) {
        jmsTemplate.send(destination, new MessageCreator() {
            // 创建一个消息
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                System.out.println("发送消息" + textMessage.getText());
                return textMessage;
            }
        });
    }
}
