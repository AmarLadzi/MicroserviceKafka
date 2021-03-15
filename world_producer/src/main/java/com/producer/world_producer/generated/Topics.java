package com.producer.world_producer.generated;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.*;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class Topics {

    @Bean
    public NewTopic NewsTopic() {
        return TopicBuilder.name("NewsTopic")
                .partitions(1)
                .replicas(1)
                .build();
    }

//    @Bean
//    public NewTopic Sports() {
//         return TopicBuilder.name("Sports")
//                .partitions(1)
//                .replicas(1)
//                .build();
//    }
//
//    @Bean
//    public NewTopic BestNews() {
//        return TopicBuilder.name("BestNews")
//                .partitions(2)
//                .replicas(1)
//                .build();
//    }
//
//    @Bean
//    public NewTopic Economy() {
//        return TopicBuilder.name("Economy")
//                .partitions(2)
//                .replicas(1)
//                .build();
//    }


//    @Bean
//    public NewTopic topic3() {
//        return TopicBuilder.name("thing3")
//                .assignReplicas(0, Arrays.asList(0, 1))
//                .assignReplicas(1, Arrays.asList(1, 2))
//                .assignReplicas(2, Arrays.asList(2, 0))
//                .config(TopicConfig.COMPRESSION_TYPE_CONFIG, "zstd")
//                .build();
//    }
}
