package Generics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){

//        ArrayList<String> list  = new ArrayList<>();//Hold all datatypes such as string , int, double with help of arraylist
//        list.add("Hello");
//        list.add("World");
//        String s = list.get(0);
//        String s1 = list.get(1);
//        System.out.println(s);
//        System.out.println(s1);
//        String str =(String) list.get(0);
//        String integer =(String) list.get(1);

        //Box
        //Generic type
//        Box<Integer> box = new Box<>();
//        box.setValue(1);
//        int i = box.getValue();
//        System.out.println(i);

        Pair<String,Integer> pair = new Pair<>("Age",30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
