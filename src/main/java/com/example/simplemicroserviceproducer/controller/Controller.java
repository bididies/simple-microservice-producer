package com.example.simplemicroserviceproducer.controller;

import com.example.simplemicroserviceproducer.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class Controller {

    private final KafkaProducer kafkaProducer;

    public static final String SUCCESS = "success";

    @PostMapping("kafka/send")
    public String send(@RequestBody String message) {
        kafkaProducer.sendMessage(message);

        return SUCCESS;
    }
}
