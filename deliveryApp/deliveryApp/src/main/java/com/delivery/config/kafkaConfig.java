package com.delivery.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaConfig {

        @Bean
        public NewTopic topic() {
            return TopicBuilder
                    .name(AppConstant.Location_update_topic)
                    // .partitions(3)    // Optional: specify if needed
                    // .replicas(1)      // Optional: specify if needed
                    .build();
        }
}
