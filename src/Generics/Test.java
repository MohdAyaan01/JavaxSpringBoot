 package Generics;

import java.util.*;

//public class Test {
//    public static void main(String[] args){
//
////        ArrayList<String> list  = new ArrayList<>();//Hold all datatypes such as string , int, double with help of arraylist
////        list.add("Hello");
////        list.add("World");
////        String s = list.get(0);
////        String s1 = list.get(1);
////        System.out.println(s);
////        System.out.println(s1);
////        String str =(String) list.get(0);
////        String integer =(String) list.get(1);
//
//        //Box
//        //Generic type
////        Box<Integer> box = new Box<>();
////        box.setValue(1);
////        int i = box.getValue();
////        System.out.println(i);
//
////        Pair<String,Integer> pair = new Pair<>("Age",30);
////        System.out.println(pair.getKey());
////        System.out.println(pair.getValue());
//
//        Box<Integer> box = new Box<>();
//    }
//}

//public class Test {
//    public static void main(String[] args){
//
//        Pair<String,Integer> pair = new Pair<>("Age",30);
//        System.out.println(pair.getKey());
//        System.out.println(pair.getValue());
//    }
//}
 //Generics Method
// public class Test {
//    public static void main(String[] args) {
//        Test test = new Test();
//        Integer[] intArr = {1, 2, 3, 4};
//        String[] StrArr = {"Hello", "World"};
//        test.PrintArray(intArr);
//        test.PrintArray(StrArr);
//        Display(12);
//        Display(12.3);
//    }
//
//    public <T> void PrintArray(T[] Array) {
//        //method Body
//        for (T element : Array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//
//    }
//
//    //Method Overloading
//    public static <T> void Display(T element) {
//        System.out.println("Generics Display: " + element);
//    }
//
//    public static void Display(Integer element) {
//        System.out.println("Integer Display: " + element);
//    }
//}

 //Enum Example
//    enum Operations{
//        ADD,SUBTRACT,MULTIPLY,DIVIDE;
//        public<T extends Number> double apply(T a, T b){
//            switch (this){
//                case ADD :
//                    return a.doubleValue() + b.doubleValue();
//                case  SUBTRACT:
//                    return a.doubleValue() - b.doubleValue();
//                case MULTIPLY:
//                    return a.doubleValue() * b.doubleValue();
//                case DIVIDE:
//                    return a.doubleValue() / b.doubleValue();
//                default:
//                    throw new AssertionError("Unknow Operations"+this);
//            }
//        }
//}
// public class Test {
//     public static void main(String[] args){
//        double res1 =  Operations.ADD.apply(10,20);
//         System.out.println(res1);
//     }
//}

 //WildCards in generics
// public class Test {
//     public static void main(String[] args){
//         ArrayList<?> list = new ArrayList<String>();
//
//     }
//     public <T> T getFirst(ArrayList<T> list){
//         return list.get(0);
//     }
//     public <T> T getsFirst(ArrayList<T> source, ArrayList<T> Destinations){
//         for (T item:source){
//             Destinations.add(item);
//         }
//     }
//}
 //Boundations
//
// public class Test {
//     public static void main(String[] args){
//     List<? super Number> numbers = Arrays.asList(1,2,3);
//     numbers.add(12);
//     numbers.add(null);
//     }
//     //Upper Bound
//     public static double sum(List<? extends Number> numbers){
//         double sum = 0;
//         for(Number o : numbers){
//             sum += o.doubleValue();
//         }
//         return sum;
//     }
//     //Lower Bound
//     public static void PrintNumbers(List<? super Integer> list){
//         for(Object obj : list){
//             System.out.println(obj);
//         }
//     }
//}
 //Type Erasure During Compilations
// public class Test {
//     public static void main(String[] args){
//         Box Stringbox = new Box();
//         Stringbox.setValue("Hello");
//         String value =(String) Stringbox.getValue();
//     }
//}

    //Type Erasure
    /*
    public class Test {
        public static void main(String[] args){
            NumberBox intBox = new NumberBox();
            intBox.setNumber(10);
            Integer value =(Integer) intBox.getNumber();
        }
}
 class NumberBox{
     private Number number;
     public void setNumber(Number number){
         this.number = number;
     }
     public Number getNumber(){
         return number;
     }
}*/

 //Generics Exceptions
// public class GenericExceptions <T> extends Exception{
//     private T value;
//
//     public GenericExceptions(T value){
//         this.value = value;
//     }
//     public T getValue(){
//         return value;
//     }
//}
public class Test{
public static void main(String[] args){
    try{
        throw new MyException(123);
    }catch (MyException e){
        System.out.println("Caught Exception: " + e.getMessage());
    }
    try{
        throw new MyException("String");
    }catch (MyException e){
        System.out.println("Caught Exception: " + e.getMessage());
    }
}
}
 class MyException extends Exception{
     public <T> MyException(T value){
         super("Exception Related To Value: " + value.toString() + "Of Type: " + value.getClass().getName());
     }
}