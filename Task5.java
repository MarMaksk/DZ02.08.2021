package com.company;

import java.io.IOException;
import java.util.*;

public class Task5 {
    public static void main(String[] args) throws IOException {
        Map<Runner, Status> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Status stat = Status.send;
            Runner run = new Runner();
            try {
                run.halt();
            } catch (RuntimeException ex) {
                System.out.println("halt");
                stat = Status.capture;
            } finally {
                map.put(run, stat);
            }
        }
    }
}

class Runner {
    private static final Random rnd = new Random();

    public void halt() throws IOException {
        if (rnd.nextBoolean()) {
            throw new RuntimeException();
        } else {
            throw new IOException();
        }
    }
}

enum Status {
    capture, send;
}