package com.java.javaspringboot.datatypes;

public class Test {
    public static void main(String[] args) {

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
        /*System.out.println("Widening Conversion Implicit");
        System.out.println("------");
        byte byteValue = 10;//1 bytes // cup
        short shortValue = byteValue;//2 bytes //glass
        int intValue = shortValue;//4 bytes //jug
        long longValue = intValue;//8 bytes //bucket
        float FloatValue = longValue;//4 bytes
        double doubleValue = FloatValue;//8 bytes
        System.out.println("int:" + intValue);
        System.out.println("long:" + longValue);
        System.out.println("float" + FloatValue);
        System.out.println("double" + doubleValue);
        System.out.println();*/

        //Narrowing Conversion Its Opposite of widening
        /*
        System.out.println("Narrowing Conversion");
        System.out.println("----------");
        double doubleValue2 = 123.456;
        float FloatValue2 = (float) doubleValue2; //Narrowing Conversion From Double To Float
        long LongValue2 = (long) FloatValue2;//Narrowing Conversion From Float To Long
        int IntValue2 = (int) LongValue2;// Narrowing Conversion From Long To Int
        System.out.println("Double" + doubleValue2);
        System.out.println("Float" + FloatValue2);
        System.out.println("Long" + LongValue2);
        System.out.println("Int" + IntValue2);
        System.out.println();
         */
        //JVM --> Heap Memory(String Pool)
        //Test test = new Test();
        //Test test2 = new Test();
        /*int a = 1;//It Will Store In Stack
        String str1 = "Hello";//Its Store In Heap(String pool)
        String Str2 = "Hello";
        String Str3 = new String("Hello");
        System.out.println(str1 == Str2);//True (Same Refrence In Pool)
        System.out.println(str1 == Str3);//False (Different Objects)
        System.out.println(str1.equals(Str3));//True(Same Content)*/

        /*String a = "hello";
        //a = a.toUpperCase();//ReInitialize
        String b = a.toUpperCase();
        System.out.println(a);
        System.out.println(b);*/
        /*
        String Text = "Hello World";
        System.out.println(Text.length());
        System.out.println(Text.charAt(0));
        System.out.println(Text.substring(0,4));
        System.out.println(Text.contains("World"));
        System.out.println(Text.replace("World","Java"));*/

    }
}
