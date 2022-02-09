package com.artvasiliuk.qrgenerator.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QueueService {
    private int maxQueueSize = 10; //to move to app.properties
    private final String uri = "http://localhost:8080/queue-status"; //to move to app.properties

    public boolean checkQueue() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String queueSizeStr = restTemplate.getForObject(uri, String.class);
        int queueSize = Integer.parseInt(queueSizeStr);
        return queueSize <= maxQueueSize;
    }
}
