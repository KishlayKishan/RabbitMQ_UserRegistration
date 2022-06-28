/*package com.bridgelabz.userregistration.consumer;


import com.bridgelabz.userregistration.config.MQConfig;
import com.bridgelabz.userregistration.dto.ResponseDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(ResponseDTO message) {
        System.out.println(message);
    }
}

 */
