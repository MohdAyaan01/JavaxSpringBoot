package CF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args){
      //  ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        System.out.println(list.get(1));
//        System.out.println(list.size());
//        for(int i=0; i<list.size();i ++){
//            System.out.println(list.get(i));
//        }
//        for(int x:list){
//            System.out.println(x);
//        }
//        System.out.println(list.contains(2));//True
//        System.out.println(list.contains(3));//False
//         list.remove(1);
//         list.add(1,50);
//         for(int x:list){
//            System.out.println(x);
//            }
//        list.set(1,50);
//        System.out.println(list);
//       ArrayList<Integer> list = new ArrayList<>(1);
//        list.add(1);
//        list.add(2);
//        List <String> list = new ArrayList<>();
//        System.out.println(list.getClass().getName());
//
//        List<String> list1 = Arrays.asList("Monday","Tuesday");
//        System.out.println(list.getClass().getName());
//        list1.set(1,"Wed");
//        System.out.println(list.get(1));
//        String[] Array = {"Apple","Banana","Cherry"};
//        List<String> list2 =  Arrays.asList(Array);
//        System.out.println(list2.getClass().getName());
//        List<String> List4 = new ArrayList<>(list2);
//        List4.add("Mango");
//        System.out.println(List4);
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(0,0);
//        System.out.println(list);
//        List<Integer> list1 = List.of(4,5,6,7,8,9);
//        list.addAll(list1);
//        System.out.println(list);

//        list.remove(Integer.valueOf(1));
//        System.out.println(list);

//        Object[] array =list.toArray();
//        list.toArray(new Integer[0]);

        list.sort(null);
        System.out.println(list);
    }
}
