package CF;

import javax.xml.stream.util.StreamReaderDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class list2 {
    public static void main(String[] args){
        //ArrayList<Integer> list = new ArrayList<>();
        //list.add(1);
        //list.add(2);
        //System.out.println(list);
        //System.out.println(list.get(1));
        //System.out.println(list.size());
        //for(int i=0; i<list.size(); i++){
        //  System.out.println(list.get(i));
        //}
        //for( int x : list){
        //  System.out.println(x);
        //}
        //System.out.println(list.contains(1));
        //System.out.println(list.contains(2));
        //list.remove(1);
        //list.add(1,50);
        //for(int x : list){
        //    System.out.println(x);
        //}
        //list.set(1,50);
        //System.out.println(list);

//        List<String> list = new ArrayList<>();
//        System.out.println(list.getClass().getName());
//
//        List<String> list1 = Arrays.asList("Monday","Tuesday","Wednesday");
//        System.out.println(list1.getClass().getName());
//        list1.set(2,"Wed");
//        System.out.println(list1.get(2));
//        String[] Array = {"Apple","Banana","Cherry"};
//        List<String> list2 = new ArrayList<>();
//        System.out.println(list2.getClass().getName());
//        List<String> list3 = new ArrayList<>(list2);
//        list3.add("Mango");
//        System.out.println(list3);
//     List<Integer> list4 = new ArrayList<>();
//        list4.add(01);
//        list4.add(03);
//        list4.add(02);
//        list4.add(04);
//        list4.sort((a,b)->a-b);
//        System.out.println(list4);
//
//        List<Integer> list = List.of(4,5,6,7,8,9);
//        list4.addAll(list);
//        System.out.println(list);
//
//        list4.remove(Integer.valueOf(1));
//        System.out.println(list4);
//
////
////
//        ArrayList<Integer> list = new ArrayList<>();
//        Object[] array =list.toArray();
//        list.toArray(new Integer[0]);
//
//        list.sort(new MyComparator());
//        System.out.println(list);
//        List<String> Words = Arrays.asList("Banana","Apple","Date");
//        Words.sort(new StringLengthComparator());
//        Words.sort((a,b)-> b.length() - a.length());
//        System.out.println(Words);
        List<String> words = Arrays.asList("Banana","Apple","Date");
        words.sort((a,b)->b.length() - a.length());
        System.out.println(words);
    }
}



class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    }
}
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
class Student{
    private String Name;
    private double Gpa;
    public Student(String Name, double Gpa){
        this.Name = Name;
        this.Gpa = Gpa;
    }
    public String GetName(){
        return Name;
    }
    public double GetGpa(){
        return Gpa;
    }
}

public class list2{
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice",3.5));
        students.add(new Student("Ali",3.8));
        students.add(new Student("ce",3.7));
        students.add(new Student("Ae",3.6));
        Comparator<Student> comparator =Comparator.comparing(Student::GetGpa).reversed().thenComparing(Student::GetName);
        students.sort(comparator);
        for(Student s: students){
            System.out.println(s);
        }
    }
}