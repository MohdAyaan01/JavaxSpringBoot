package Enum;

import java.util.SplittableRandom;

public enum Day {


    SUNDAY("SUNDAY","somrar"),
    MONDAY("MONDAY","somrar"),
    TUESDAY("TUESDAY","somrar"),
    WEDNESDAY("WEDNESDAY","somrar"),
    THURSDAY("THURSDAY","somrar"),
    FRIDAY("FRIDAY","somrar"),
    SATURDAY("SATURDAY","somrar");


    private Day(String lower, String hindi) {
        System.out.println("OurConstructor called");
        this.lower = lower;
        this.hindi = hindi;

     }


    public String getLower() {
        return lower;
    }
    public String getHindi() {
        return hindi;
    }
    private String lower;
    private String hindi;
    public void Display(){
        System.out.println( "Today is" + this.name());
    }
}
