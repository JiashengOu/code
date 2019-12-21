package cn.lastwhisper.rabbitmq.fanout;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @author Administrator
 */
public class MessageConsumer2 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("MessageConsumer2");
        System.out.println("接收到消息：" + new String(message.getBody()));
    }
}