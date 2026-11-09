package com.java.javaspringboot;
import java.util.*;
public class CF {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayList = new ArrayList<>();
        ArrayList.add(1);
        ArrayList.add(11);
        ArrayList.add(12);
        ArrayList<Integer> ArrayList2 = new ArrayList<>();
        ArrayList2.add(1);
        ArrayList2.add(11);
        ArrayList2.add(12);
        ArrayList.addAll(ArrayList2);
        System.out.println(ArrayList);
        /*List<Integer> list = List.of(1,2,3,4);
        //Hash --> Same Inp --> Same Output
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.contains(2);
        System.out.println(set);
        System.out.println(set);*/
        //List<Integer> list = List.of(1,2,3,4);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.contains(2);
        System.out.println(set);
        //Map<Integer,String> map = new HashMap<>();
        //map.put(1,"Ayaan");
        //map.put(2,"Akdowd");
        //map.put(3,"Chitlrash");
        //System.out.println(map.get(2));
        //List -> Arraylist & LinkedList
        //Set -> Hashset & LinkedHashset
        //Map -> HashMap & LinkedHashMap
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Mohd");
        map.put(2,"Ayaan");
        map.put(3,"Siddiqui");
        System.out.println(map.get(2));
    }
}
