package com.rabbitmq.spring;

import com.RabbitMqConfig;
import com.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by yangliu on 23/04/2017.
 */
@Component
public class Receiver {

    @RabbitListener(queues = RabbitMqConfig.QUEUE_NAME)
    public void receiveMessage(User user) {
        System.out.println("Receive message: " + user.toString());
    }

}
