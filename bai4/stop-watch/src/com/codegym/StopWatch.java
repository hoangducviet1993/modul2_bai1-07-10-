package com.codegym;

import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class StopWatch {
    int  startTime;
    int  endTime;

    public StopWatch() {
        this.startTime = 0;
        this.endTime = 0;
    }

    public void start() {
        this.startTime = (int) ZonedDateTime.now().toInstant().toEpochMilli();
    }

    public void stop() {
        this.endTime =  (int) ZonedDateTime.now().toInstant().toEpochMilli();
    }


    public int getElapsedTime() {
        return this.endTime-this.startTime;
    }
}

