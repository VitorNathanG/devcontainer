package com.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.time.Instant;

public class App {

    public static void main(String[] args) throws InterruptedException, IOException {
        File file = new File("logs/teste.log");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.setOut(new PrintStream(file));
        while (true) {
            final long sleepTime = Math.round(Math.random() * 2000);
            Thread.sleep(sleepTime);
            System.out.println("{\"message\": \"Hello World! Slept by: " + sleepTime + "\", \"timestamp\": "
                    + Instant.now().toEpochMilli() + "}");
        }
    }
}
