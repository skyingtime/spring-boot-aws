package com.rabbitmq.spring;

import com.RabbitMqConfig;
import com.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangliu on 23/04/2017.
 */
@Service
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        User user = new User("username", "password");
        System.out.println("Sender: " + user);
        this.rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.ROUTING_KEY, user);
    }
}
