package com.producer.world_producer.component;

import com.producer.world_producer.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.kafka.core.*;
import org.springframework.scheduling.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public static final String TOPIC = "NewsTopic";
    public static String urgentMessage = "######### ERUPTION VOLCANIQUE #########";
    public static int tempoID = 0;

    @Scheduled(fixedRate = 1000)
    public void plusishMessage() {
        this.kafkaTemplate.send(TOPIC, tempoID + "=>" + new Article().toString());
        tempoID += 1;
    }

    @Scheduled(fixedRate = 5000)
    public void sendPriorityMessage() {
        kafkaTemplate.send(TOPIC, tempoID + "=>" + urgentMessage);
        tempoID += 1;
    }
}
