package com.delivery.service;

import com.delivery.config.AppConstant;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    private Logger logger = LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location) {
//        this.kafkaTemplate.send(AppConstant.Location_update_topic, location);
//        this.logger.info("Message Produce Updated successful");


            this.kafkaTemplate.send(AppConstant.Location_update_topic, location);

            return false;
    }
}
