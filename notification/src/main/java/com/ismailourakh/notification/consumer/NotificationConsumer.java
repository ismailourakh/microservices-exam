package com.ismailourakh.notification.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = "commande-topic", groupId = "notification-group")
    public void consumeCommandeMessage(String message) {
        System.out.println("Notification reçue : " + message);
    }
}
