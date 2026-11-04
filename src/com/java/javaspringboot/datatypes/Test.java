package com.java.javaspringboot.datatypes;

public class Test {
    public static void main(String[] args) {
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
        Car car = new Car("Green");
        car.SetSpeed(-12);
        car.SetSpeed(12);
    }
}
