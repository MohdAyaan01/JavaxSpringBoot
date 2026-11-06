package com.java.javaspringboot;

public class WithMultiThreading {
    public static void main(String[] args) throws InterruptedException {
        long StartTime = System.currentTimeMillis();
        NumberCounter thread1 = new NumberCounter();
        SumCalculator sumCalculator = new SumCalculator();
        Thread thread2 = new Thread(sumCalculator);


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Time Taken: " +(System.currentTimeMillis()-StartTime) + "ms");
    }
}
