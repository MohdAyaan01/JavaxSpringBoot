package Exception;

/*
public class Test {
    //RunTime Error Example -> In Java 30 cant be divide by zero ,
    //Program will crash during runtime errors
    public static void main(String[] args) {
        int[] Numerators = {10,200,30,40};
        int[] Denominators = {1,2,0,4};
        for(int i=0; i<10; i++){
            try {
                System.out.println(divide(Numerators[i], Denominators[i]));
            }catch(Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Good Job :)");
    }
//    public static int divide(int a, int b){
//        try{
//            return a/b;
//        }catch(ArithmeticException e){
//            System.out.println(e);
//            return -1;
//        }
//    }
        public static int Divide ( int a, int b){
            try {
                Student student = null;
                student.setId(123);
                System.out.println(student.getId());
                return a / b;
            } catch (NullPointerException e) {
                System.out.println("Null Pointer Exception :()");
                return -1;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception :( ");
                return -1;
            }catch (Exception e) {
                System.out.println(e);
                return -1;
            }
        }
    }
}
*/
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
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//
//public class Test {
//    public static void main(String[] args)throws FileNotFoundException {//throws FileNotFoundException
//        /*try{
//            FileReader fileReader = new FileReader("a.txt");
//        }catch (Exception e){
//        }*/
//        Method2();
//        System.out.println("Hello");
//    }
//    public static void Method2()throws FileNotFoundException{
//        Method1();
//    }
//    public static void Method1() throws FileNotFoundException {
//        try {
//            FileReader fileReader = new FileReader("a.txt");
//        }catch (FileNotFoundException e){
//            System.out.println("File Not Found");
//            throw new FileNotFoundException();
//        }
//    }
//}

public class Test {
    public static void main(String[] args){

    }
    public static void Method1(){

    }
}