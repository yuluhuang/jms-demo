/**
 * @Title
 * @Project demo
 * @Package com.yuluhuang.jms.demo.consumer
 * @Description
 * @author ylh
 * @date 2018-10-27 17:59
 * @version
 */
package com.yuluhuang.jms.demo.consumer;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @Description
 * @author ylh
 * @date 2018-10-27 17:59
 */
public class ConsumerMessageListener implements MessageListener {
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
    }
}
