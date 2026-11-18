package Generics;

import java.util.Optional;

//
//interface PrintAble{
//    void Print();
//    void print();
//    long LongValue();
//    float FloatValue();
//    double DoubleValue();
//}
//class MyNumber extends Number implements PrintAble{
//    private final int value;
//    public MyNumber(int value){
//        this.value = value;
//    }
//    @Override
//    public void Print() {
//    }
//    @Override
//    public void print(){
//        System.out.println("MyNumber: " + value);
//    }
//    @Override
//    public int intValue(){
//        return value;
//    }
//    @Override
//    public long LongValue(){
//    return value; }
//    @Override
//    public float FloatValue(){
//        return value;
//    }
//    @Override
//    public double DoubleValue(){
//        return value;
//    }
//}
//class Boxx<T extends Number & PrintAble>{
//    private T item;
//
//    public Boxx(T item){
//        this.item = item;
//    }
//    public void display(){
//        item.Print();
//    }
//    public T getItem(){
//        return item;
//    }
//}
//public class Testt {
//    public static void main(String[] args) {
//        MyNumber myno = new MyNumber(12);
//        Boxx<MyNumber> box = new Boxx<>(myno);
//        box.display();
//    }
//}
//interface PrintAble{
//    void print();
//}
//class MyNumber extends Number implements PrintAble {
//    private final int value;
//
//    public MyNumber(int value) {
//        this.value = value;
//    }
//
//    @Override
//    public void print() {
//        System.out.println("My Number :" + value);
//    }
//
//    @Override
//    public int intValue() {
//        return value;
//    }
//
//    @Override
//    public long longValue() {
//        return value;
//    }
//
//    @Override
//    public float floatValue() {
//        return value;
//    }
//
//    @Override
//    public double doubleValue() {
//        return value;
//    }
//}
//    class Boxx<T extends Number & PrintAble> {
//        private T item;
//
//        public Boxx(T item) {
//            this.item = item;
//        }
//        public void display() {
//            item.print();
//        }
//        public T getItem() {
//            return item;
//        }
//    }
//        public class Testt {
//            public static void main(String[] args) {
//                MyNumber myno = new MyNumber(12);
//                Boxx<MyNumber> box = new Boxx<>(myno);
//                box.display();
//            }
//        }