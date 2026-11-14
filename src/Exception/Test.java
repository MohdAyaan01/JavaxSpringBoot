package Exception;


//public class Test {
//    //RunTime Error Example -> In Java 30 cant be divide by zero ,
//    //Program will crash during runtime errors
//    public static void main(String[] args) {
//        int[] Numerators = {10,200,30,40};
//        int[] Denominators = {1,2,0,4};
//        for(int i=0; i<10; i++){
//            try {
//                System.out.println(divide(Numerators[i], Denominators[i]));
//            }catch(Exception e) {
//                System.out.println(e);
//            }
//        }
//        System.out.println("Good Job :)");
//    }
//

//    public static int Divide(int a, int b){
//        try {
//            return a/b;
//        }catch (ArithmeticException e){
//            System.out.println(e);
//            return -1;
//        }
//    }


    //    public static int divide(int a, int b){
//        try{
//            return a/b;
//        }catch(ArithmeticException e){
//            System.out.println(e);
//            return -1;
//        }
//    }

//        public static int Divide ( int a, int b){
//            try {
//                Student student = null;
//                student.setId(123);
//                System.out.println(student.getId());
//                return a / b;
//            } catch (NullPointerException e) {
//                System.out.println("Null Pointer Exception :()");
//                return -1;
//            } catch (ArithmeticException e) {
//                System.out.println("Arithmetic Exception :( ");
//                return -1;
//            }catch (Exception e) {
//                System.out.println(e);
//                return -1;
//            }
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
public class Test {
    public static void main(String[] args){
    int[] n = {10,200,30,40};
    int[] d = {1,2,0,4};
    for(int i=0; i<10; i++){
        try {
            System.out.println(Divide(n[i],d[i]));
        }catch (Exception e){
            System.out.println(e);
        }
    }
        System.out.println("Good Job?.....");
    }
    public static int Divide(int a, int b){
        try {
            return a/b;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception:(");
            return -1;
        }
    }
}*/
/*
public class Test {
    public static void main(String[] args) {
     try{
         Level1();
     }catch (Exception e) {
         System.out.println(e);
     }
    }
    public static void Level3() {
        int[] Array = new int[5];
        Array[5] = 10;
    }
    public static void Level2() {
        Level3();
    }
    public static void Level1() {
        Level2();
    }
}*/
//
//public class Test {
//    public static void main(String[] args){
//        try {
//            Level1();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//    public static void Level3(){
//        int[] Array = new int[5];
//        Array[5] = 10;
//    }
//    public static void Level2(){
//        Level3();
//    }
//    public static void Level1(){
//        Level2();
//    }
//}
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//
//public class Test {
//    public static void main(String[] args){
//        try{
//            Method2();
//        }catch (FileNotFoundException e){
//            System.out.println("Handled In Main: " + e.getMessage());
//        }
//        System.out.println("Hello");
//    }
//    public static void Method2()throws FileNotFoundException{
//        Method1();
//    }
//    public static void Method1() throws FileNotFoundException {
//        try (FileReader fileReader = new FileReader("a.txt")){
//        }catch (FileNotFoundException e){
//            System.out.println("File Not Found");
//            throw e;
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args){
//        System.out.println(Divide(1,0));
//    }
//    public static int Divide(int a, int b){
//        try{
//            return a/b;
//        }catch (Exception e){
//            System.out.println(e);
//            return -1;
//        }finally {
//            System.out.println("Bye");
//        }
//    }
//}
//public class Test {
//    public static void main(String[] args){
//        System.out.println(Divide(1,0));
//    }
//    public static int Divide(int a, int b){
//        try {
//            return a/b;
//        }catch (Exception e){
//            System.out.println(e);
//            return -1;
//        }finally {
//            System.out.println("Bye");
//        }
//    }
//}
//
//import java.io.BufferedReader;
//import java.io.FileReader;
////Try With Resources
//public class Test {
//    public static void main(String[] args){
//        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"));){
//            String line;
//            while ((line = reader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("IOException Caught: " + e.getMessage());
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args){
//        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))){
//            String line;
//            while ((line = reader.readLine()) != null){
//                System.out.println(line);
//            }
//        }catch (IOException e){
//            System.out.println("IOException Caught: " + e.getMessage());
//        }
//    }
//}
    //Custom Exceptions with bank Aoccunt and inSufficient
//public class Test {
//    public static void main(String[] args){
//        BankAccount bankAccount = new BankAccount(10);
//        try {
//            bankAccount.WithDraw(11);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
public class Test {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount(11);
        try{
            bankAccount.withDraw(12);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
/*
public class Test {
    public static void main(String[] args) {
        int[] Numerators = {10, 200, 30, 40};
        int[] Denominators = {1, 2, 0, 4};
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(Divide(Numerators[i], Denominators[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Good Job");
    }
public static int Divide(int a, int b) {
    try {
        Student student = null;
        student.setId(123);
        System.out.println(student.getId());
        return a / b;
    } catch (NullPointerException e) {
        System.out.println("NullPointerException : ()");
        return -1;
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException : ()");
        return -1;
    } catch (Exception e) {
        System.out.println(e);
        return -1;
    }
}
}

 */