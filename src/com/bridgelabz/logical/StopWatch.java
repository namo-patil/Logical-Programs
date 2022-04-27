package com.bridgelabz.logical;

import java.util.Scanner;

public class StopWatch {
    static long startTimer = 0;
    static long stopTimer = 0;
    static long elapsed;

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press '1' to Start Timer: ");
        scanner.nextInt();
        stopWatch.start();
        System.out.println();
        System.out.println("Press '0' to Stop Timer: ");
        scanner.nextInt();
        stopWatch.stop();
        //to calculate elapsed time
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Total Time Elapsed(in millisecond) is: " + elapsedTime);
        System.out.println("Converting millisecond to seconds: " + (elapsedTime / 1000) + " sec");
    }

    //to start timer
    public void start() {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " + startTimer);
    }

    // to stop timer
    public void stop() {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop Time is: " + stopTimer);
    }

    //to get elapsed time between start and stop
    public long getElapsedTime() {
        elapsed = stopTimer - startTimer;
        return elapsed;
    }
}

