package com.example.orderhanddle.service;

import com.alibaba.fastjson.JSONObject;
import com.example.orderhanddle.entity.Good;
import com.example.orderhanddle.entity.User;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class produce {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    public void pro(String msg) throws Exception {
        byte[] gb = msg.getBytes();
        Message message = new Message("myTopic", gb);
        rocketMQTemplate.asyncSend("myTopic", MessageBuilder.withPayload(msg).build(), new SendCallback() {
            public void onSuccess(SendResult sendResult) {
                System.out.println("发送成功");
            }

            public void onException(Throwable throwable) {
                System.out.println("发送失败");
            }
        });
    }
}
