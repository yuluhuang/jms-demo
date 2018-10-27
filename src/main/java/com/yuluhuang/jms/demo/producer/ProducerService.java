/**
 * @Title
 * @Project demo
 * @Package com.yuluhuang.jms.demo.producer
 * @Description
 * @author ylh
 * @date 2018-10-27 18:12
 * @version
 */
package com.yuluhuang.jms.demo.producer;


/**
 * @author ylh
 * @Description
 * @date 2018-10-27 18:12
 */
public interface ProducerService {
    void sendMessage(final String message);
}
