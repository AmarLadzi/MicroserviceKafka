package com.producer.world_producer;

//import com.github.javafaker.service.*;
import com.producer.world_producer.component.*;
import com.producer.world_producer.generated.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.*;

import java.util.*;

@SpringBootApplication
@EnableScheduling
public class WorldProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorldProducerApplication.class, args);
    }

}
