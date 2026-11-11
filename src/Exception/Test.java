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
}