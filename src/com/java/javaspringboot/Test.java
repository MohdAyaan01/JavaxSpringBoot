package com.java.javaspringboot;

public class Test {
    public static void main(String[] args){
        /*try {
            int Result = 10/5;
            System.out.println("Result :" + Result);
        }catch(ArithmeticException e){
            System.out.println("Cannot Divide By Zero");
        }finally {
            System.out.println("Execution Finished");
        }*/

        //Recursion
        //System.out.println(Factorial(5));

        //Sum of n natural numbers
        //5+4+3+2+1

        System.out.println(SumofNnaturalNumbers(5));
        }

    /*public static int Factorial(int n){
        if(n==1){
            return 1;
        }
        return n * Factorial(n-1);

    }*/
    public static int SumofNnaturalNumbers(int n){
        if(n==1){
            return 1;
        }
        return n+SumofNnaturalNumbers(n-1);
    }

}



