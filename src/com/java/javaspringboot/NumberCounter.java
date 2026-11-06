package com.java.javaspringboot;

public class NumberCounter extends Thread{
    @Override
    public void run() {
        int Count = 0;
        for(int i=1; i<=500000000; i++){
            if(i%10==7){
                Count++;
            };
        }
        System.out.println("Count Of Numbers Ending In 7 :" + Count);
    }
}
