package org.example;

import java.time.LocalTime;

public class Horloge {
    public static void main(String[] args) {
        while (true) {
            LocalTime now = LocalTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            System.out.printf("%02d:%02d:%02d\n", hour, minute, second);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}