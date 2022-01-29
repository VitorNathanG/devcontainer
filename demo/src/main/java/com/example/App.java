package com.example;

import java.io.IOException;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static void main(String[] args) throws InterruptedException, IOException {
        Logger logger = LoggerFactory.getLogger(App.class);
                        
        while (true) {
            final long sleepTime = Math.round(Math.random() * 2000);
            Thread.sleep(sleepTime);
            logger.info("{\"message\": \"Hello World! Slept by: " + sleepTime + "\", \"timestamp\": "
                    + Instant.now().toEpochMilli() + "}");
        }
    }
}
