package com.java.javaspringboot;

public class MyThread extends Thread{
    private Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for(int i=1; i<=1000; i++){
            counter.Increment();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.GetCount());
    }
}
class Counter{
    private int Count = 0;
    public synchronized void Increment(){
        Count++;
    }

    public int GetCount(){
        return Count;
    }
}
