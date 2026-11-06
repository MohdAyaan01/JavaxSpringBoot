package com.java.javaspringboot.datatypes;

//public class Test {
  //  public static void main(String[] args) {
        /*
        System.out.println("Byte Range");
        System.out.println("----------");
        byte A = 127;
        System.out.println("Example Byte Values: " + A);
        System.out.println("Minimum Byte Values: " + Byte.MIN_VALUE);
        System.out.println("Maximum Byte Values: " + Byte.MAX_VALUE);
        System.out.println();
        //Short
        System.out.println("Short Range");
        System.out.println("----------");
        short B = 2;
        System.out.println("Example Short Values: " + B);
        System.out.println("Minimum Short Values: " + Short.MIN_VALUE);
        System.out.println("Maximum Short Values: " + Short.MAX_VALUE);
        System.out.println();
        //Integer
        System.out.println("Integer Range");
        System.out.println("----------");
        int C = 3;
        System.out.println("Example Integer Values: " + C);
        System.out.println("Minimum Integer Values: " + Integer.MIN_VALUE);
        System.out.println("Maximum Integer Values: " + Integer.MAX_VALUE);
        System.out.println();
        //Long
        System.out.println("Long Range");
        System.out.println("----------");
        long D = 922337204;
        System.out.println("Example Long Values: " + D);
        System.out.println("Minimum Long Values: " + Long.MIN_VALUE);
        System.out.println("Maximum Long Values: " + Long.MAX_VALUE);
        System.out.println();
        //Float
        float e = 123.456789f;//7 Significant Digits
        System.out.println("Float Examples:");
        System.out.println("---------------");
        System.out.println("Original Float Values: " + e);
        System.out.println("Smallest Positive Number :" + Float.MIN_VALUE);
        System.out.println("Largest Positive Number :" + Float.MAX_VALUE);
        System.out.println("Largest Negative Number -:" + Float.MAX_VALUE);
        System.out.println("Smallest Negative Number -:" + Float.MIN_VALUE);
        System.out.println();
        //Double
        double f = 123.456789012345678;//15 Significant Digits
        System.out.println("Double Examples:");
        System.out.println("---------------");
        System.out.println("Original Double Values: " + f);
        System.out.println("Smallest Positive Number :" + Double.MIN_VALUE);
        System.out.println("Largest Positive Number :" + Double.MAX_VALUE);
        System.out.println("Largest Negative Number -:" + Double.MAX_VALUE);
        System.out.println("Smallest Negative Number -:" + Double.MIN_VALUE);
        System.out.println();
        //Character
        System.out.println("Character Ranges");
        System.out.println("----------------");
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        //Widening Conversion
        System.out.println("Widening Conversion");
        System.out.println("-------------------");
        byte ByteValues = 10;//1 Bytes
        short ShortValues = ByteValues;//2 Bytes
        int IntValues = ShortValues;//4 Bytes
        long LongValues = IntValues;//8 Bytes;
        float FloatValues = LongValues;//4 Bytes
        double DoubleValues = FloatValues;//8 Bytes
        System.out.println("Int" + IntValues);
        System.out.println("Long" + LongValues);
        System.out.println("Float" + FloatValues);
        System.out.println("Double" + DoubleValues);
        System.out.println();
        //Narrowing Conversion in this condition is overflowing
        System.out.println("Narrowing Conversion :");
        System.out.println("----------------------");
        double DoubleValues2 = 123.456;
        float FloatValues2 = (float) DoubleValues2; // Narrowing Conversion From Double To Float
        long LongValues2 = (long) FloatValues2; // Narrowing Conversion From Float To Long
        int IntValues2 = (int) LongValues2; // Narrowing Conversion From Long To Int
        System.out.println("Double: " + DoubleValues2);
        System.out.println("Float : " + FloatValues2);
        System.out.println("Long  : " + LongValues2);
        System.out.println("Int   : " + IntValues2);
        System.out.println();
        //String Pool vs Heap
        String Str1 = "Hello";
        String Str2 = "Hello";
        String Str3 = new String("Hello");
        System.out.println(Str1 == Str2); //(True Same Reference To Pool)
        System.out.println(Str1 == Str3); //False (Different Object)
        System.out.println(Str1.equals(Str3)); //True Same Content
        //String Immutability
        String name = "John";
        name.toUpperCase();
        name = name.toUpperCase();
        System.out.println(name);
        //Common String Operations
        String Text = "Hello World";
        System.out.println(Text.length());//11
        System.out.println(Text.charAt(0));//H
        System.out.println(Text.substring(0,5));//Hello
        System.out.println(Text.contains("World"));//True
        String NewText = Text.replace("World","Java");
        //Arithmatic And Bitwise Operators
        int aa = 5+3;//8
        int bb = 5-3;//2
        int cc = 5*3;//15
        float dd = 10/3;//3
        double ee = 10.0/3.0;//Result is 3.333...
        int ff = 10%3;//Result is 1
        System.out.println(dd);
        aa +=5;
        bb -=4;
        cc *=4;
        dd /=2;
        ff %=1;
        System.out.println(aa);

        //Increment And Decrement;
        int z = 1;
        System.out.println(z++ + --z);

        //Bitwise;
        int aaa = 12;
        int bbb = 33;
        int ccc = aaa+bbb;
        System.out.println(ccc);
        //Binary
        int ddd = 2;
        System.out.println(Integer.toBinaryString(ddd));
        int aaaa = 5;
        int bbbb = 3;
        //AND Operators
        System.out.println("AND Operations");
        System.out.println("5 & 3 = " + (aaaa&bbbb));
        System.out.println("Binary: "+Integer.toBinaryString(aaaa & bbbb));

        //nOR Operators
        System.out.println("OR Operations");
        System.out.println("5 | 3 = " + (aaaa|bbbb));
        System.out.println("Binary: "+Integer.toBinaryString(aaaa | bbbb));

        //XOR Operators
        System.out.println("XOR Operations");
        System.out.println("5 ^ 3 = " + (aaaa^bbbb));
        System.out.println("Binary: "+Integer.toBinaryString(aaaa ^ bbbb));

        //NOT Operators
        System.out.println("NOT Operations");
        System.out.println("~5 = " + (~aaaa));
        System.out.println("Binary: "+Integer.toBinaryString((~aaaa)));

        //Left Shift
        System.out.println("AND Operations");
        System.out.println("5 << 1 = " + (aaaa<<1));
        System.out.println("Binary: "+Integer.toBinaryString(aaaa << 1));

        //Logical Operators
        System.out.println(1 != 2 && 1 < 2);
        //True && True
        //And
        boolean isSunny = true;
        boolean isWarm = true;
        boolean isGoodBeach = isSunny && isWarm;
        System.out.println("Is it a good Beach? " + isGoodBeach);

        //OR
        boolean isRaining = false;
        boolean isSnowing = true;
        boolean isBadWeather = isRaining || isSnowing;
        System.out.println("is The Weather Bad" + isBadWeather);

        //NOT Operators
        boolean Not = false;
        System.out.println(!Not);

        //Conditional Statement
        boolean isSunnny = true;
        boolean isWarmm = true;

        if(isSunnny && isWarmm){
            System.out.println("Beach Day");
        }else {
            System.out.println("Stay At Home");
        }
        //Switch
        int day = 3;
        String DayName;
        switch (day){
            case 1 :
                DayName = "Monday";
                break;
            case 2 :
                DayName = "Tuesday";
                break;
            case 3 :
                DayName = "Wendesday";
                break;

            case 4 :
                DayName = "Thursday";
                break;

            case 5 :
                DayName = "Friday";
                break;

            case 6 :
                DayName = "Satday";
                break;

            case 7 :
                DayName = "Sunday";
                break;
            default:
               DayName= "Invalid Data";
        }
        System.out.println(DayName);
        //Turnary
        //result = (condition) ? valuesIfTrue : valuesIfFalse;
        int turnary = 1;
        boolean isEven = turnary%2 == 0? true : false;
        //Loops
        //while
        /*
        int i=0;
        while (i <=100){
            System.out.println("hllo");
            i++;
        }*/
        /*for(int i=0; i<=100; i++){
            System.out.println("Hello");
        }*/
        /*
        int i=1;
        while (i<=100){
            System.out.println("Hello");
        }
        do {
            System.out.println("Hello");
            i++;
        } while (i<=100);
        */
        //Arrays
        //Same Type
        //Fixed Size
        /*
        int[] a = new int[5];
        a[4] = 55;
        System.out.println(a);
        for(int i=0; i<=5; i++){
            System.out.println(a[i]);
        }
        for(int i:a){
            System.out.println(i);
        }*/
        //OOPS
        //Car car = new Car("Green");
        //car.SetSpeed(-12);
        //car.SetSpeed(12);
        //SmartPhone smartPhone = new SmartPhone();
        //smartPhone.Capture();
        //smartPhone.TurnOn()
        //Dog dog = new Dog();
        //dog.SayHello();
        //dog.sleep();
  //  }
//}

//Inheritance - Multi Inheritance Not Supported In Java
/*
class Camera{
    void Capture(){
        System.out.println("Photo Clicking....");
    }
    void TurnOn(){
        System.out.println("Turning On....");
    }
}
class MusicPlayer{
    void PlayMusic(){
        System.out.println("Music Playing....");
    }
}
class Phone{
    void Call(String Number){
        System.out.println("Calling...." + Number);
    }
    void TurnOn(){
        System.out.println("Turning On....");
    }
}
class SmartPhone extends Camera{

}*/
/*
abstract class Animal{
    String color;
    boolean hasSuper;
    public Animal(){
        hasSuper = false;
    }
    abstract void SayHello();
    abstract void SayBye();

    void sleep(){
        System.out.println("zzz...");
    }
}
class Dog extends Animal{
    @Override
    void SayHello() {
        System.out.println("Woof...");

    }

    @Override
    void SayBye() {
        System.out.println("Woof...");
    }
}

interface Mobile{
    static final int NumberOfBatteries=1;
    void MakeCall();
}

interface MusicPlayer{
    void Music();
}
class SmartPhone implements Mobile,MusicPlayer{

    @Override
    public void MakeCall() {
        System.out.println("Making Call....");
    }

    @Override
    public void Music() {
        System.out.println("Listening Music....");
    }
}*/

//Method OverLoading
/*
class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class Test{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3));
        System.out.println(calc.add(1,2,3));
    }
}*/
//Method Overloading With Different Parameters
/*
class Printer{
    void Print(String s){
        System.out.println("String: " +s);
    }
    void Print(int num){
        System.out.println("Integer: " +num);
    }
    void Print(double d){
        System.out.println("Double: " +d);
    }
}
public class Test{
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.Print("Hello World!...");
        printer.Print(123);
        printer.Print(3.14);
    }
}
*/

//Different Orders Of Parameter
/*
class Display{
    void Print(String s, int num){
        System.out.println("String: " +s+ ", Integer:" + num);
    }
    void Print(int num, String s){
        System.out.println("Integer: " + num + ", String:" + s);
    }
}
public class Test{
    public static void main(String[] args){
       Display display = new Display();
       display.Print("Java",1);
       display.Print(2, "JavaScript");
    }
}*/
//RunTime Polymorphism
/*
class Animal{
    void Sound(){
        System.out.println("Animal Makes A Sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Woof Woof...");
    }
}
class Cat extends Animal{
    void Sound(){
        System.out.println("Meow Meow");
    }
}
public class Test {
    public static void main(String[] args){
        Animal animal = new Dog();
        Animal animal1 = new Cat();
        animal.Sound();
        animal1.Sound();
    }
}*/
/*
public class Test {
    public static void main(String[] args){
       Animal animal = new Dog();
       Animal animal1 = new Cat();
       animal.SayHello();
       animal1.SayBye();
       animal.sleep();
       animal1.sleep();
    }
}
abstract class Animal{
    public abstract void SayHello();
    public abstract void SayBye();
    public void sleep(){
        System.out.println("zzzzzzzz....");
    }
}
class Dog extends Animal{

    @Override
    public void SayHello() {
        System.out.println("Wooof");
    }

    @Override
    public void SayBye() {
        System.out.println("Woofff");
    }
}
class Cat extends Animal{

    @Override
    public void SayHello() {
        System.out.println("Meowwww");
    }

    @Override
    public void SayBye() {
        System.out.println("Meowow");
    }
}*/
/*
interface Payment{
    void Play(int amount);
}
class UPIPayment implements Payment{
    @Override
    public void Play(int amount){
        System.out.println("Paid" + amount + "Using UPI");
    }
}
class CardPayment implements Payment{
    @Override
    public void Play(int amount) {
        System.out.println("Paid" + amount + "Using Card");
    }
}
public class Test {
    public static void main(String[] args){
        Payment P1 = new UPIPayment();
        P1.Play(500);
        Payment P2 = new CardPayment();
        P2.Play(1000);
    }
}*/
//How Does This Work
//1-Payment Interface declares the pay() method
//2-Payment p1= new UPIPayment() creates a UPI Payment object referenced through interface
//3-Java calls the correct implementation at runtime this called runtime polymorphism

public class Test {
    int Speed;
    private String Color;

    public Test(String Color){
        this.Color = Color;
    }
    public void TestSpeed(int speed){
        if(speed < 0){
            System.out.println("Not Possible");
        }else{
            this.Speed = speed;
            System.out.println("Driving At " + speed + "!");
        }
    }
}