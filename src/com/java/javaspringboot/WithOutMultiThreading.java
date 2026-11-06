package com.java.javaspringboot;

import java.util.concurrent.Callable;

public class WithOutMultiThreading {
    public static void main(String[] args){
        long StartTime = System.currentTimeMillis();
        long sum = 0;
        for(int i=1; i<=1000000000; i++){
            sum +=i;
        }
        System.out.println("Sum :" +sum);
        int Count = 0;
        for(int i=1; i<=500000000; i++){
            if(i%10==7){
                Count++;
                };
            }
        System.out.println("Count Of Numbers Ending In 7 :" + Count);
        System.out.println("Time Taken: " + (System.currentTimeMillis() - StartTime) + "ms");
        }
}
