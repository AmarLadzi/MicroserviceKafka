package com.consumer.world_consumer.component;

import org.springframework.kafka.annotation.*;
import org.springframework.kafka.support.*;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.*;

@Component
public class KafkaListenerConsumer {

    @KafkaListener(topics = "NewsTopic")
    void listener(String data) {
        System.out.println(data);
    }

//    @KafkaListener(topics = "reflectoring-1, reflectoring-2", groupId = "reflectoring-group-2")
//    void commonListenerForMultipleTopics(String message) {
//        System.out.println(message);
//    }
//
    //consumer qui va lire toutes les donnée la partition zéro du topic NewsTopic
//    @KafkaListener(
//            groupId = "myGroup",
//            topicPartitions = @TopicPartition( topic = "NewsTopic",
//            partitionOffsets = {@PartitionOffset(partition = "0", initialOffset = "0"),}))
//   public void listenToPartitionOneWithOffset(
//            @Payload String message,
//            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
//            @Header(KafkaHeaders.OFFSET) int offset) {
//
//        System.out.println("Voici L'article ====> "+message);
//        System.out.println("Voici son offset ====> "+offset);
//
//    }
//    @KafkaListener(groupId = "myGroup", topicPartitions = @TopicPartition( topic = "NewsTopic", partitionOffsets = { @PartitionOffset(partition = "1", initialOffset = "0") }))
//   public void listenToPartitionTwoWithOffset(
//            @Payload String message,
//            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
//            @Header(KafkaHeaders.OFFSET) int offset) {
//
//        System.out.println(message+"/"+partition+"/"+ offset);
//    }


//
//    //répondre après avoir consumer
//    @KafkaListener(topics = "reflectoring-others")
//    @SendTo("reflectoring-1")
//    String listenAndReply(String message) {
//        System.out.println(message);
//        return "This is a reply sent after receiving message";
//    }
}
