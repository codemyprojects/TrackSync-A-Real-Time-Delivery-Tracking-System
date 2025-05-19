package com.enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstant.location_update, groupId = AppConstant.groupId)
    public void updatedLocation(String value) {
        System.out.println(value);

    }
}
