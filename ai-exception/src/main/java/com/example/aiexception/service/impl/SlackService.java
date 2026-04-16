package com.example.aiexception.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class SlackService {

    @Value("${slack.webhook-url}")
    private String webhookUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public void sendMessage(String message) {
       restTemplate.postForObject(webhookUrl, Map.of("text", message), String.class);
    }
}
