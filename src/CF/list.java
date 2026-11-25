package CF;

import javax.swing.*;
import java.util.*;

//class StringLengthComparator implements Comparator<String>{
//    @Override
//    public int compare(String s1, String s2){
//        return s1.length() - s2.length();
//    }
//}
//class MyComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o1-o2;
//    }
//}

//public class list {
  //  public static void main(String[] args){
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
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(1);
//        list.add(3);
//        list.sort((a,b)-> b-a);
//        System.out.println(list);
       // list.add(0,0);
//        System.out.println(list);
//        List<Integer> list1 = List.of(4,5,6,7,8,9);
//        list.addAll(list1);
//        System.out.println(list);

//        list.remove(Integer.valueOf(1));
//        System.out.println(list);

//        Object[] array =list.toArray();
//        list.toArray(new Integer[0]);

//        list.sort(new MyComparator());
//        System.out.println(list);
        //List<String> Words = Arrays.asList("Banana","Apple","Date");
        //Words.sort(new StringLengthComparator());
//        Words.sort((a,b)-> b.length() - a.length());
//        System.out.println(Words);
  //  }
//}

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String GetName() {
        return name;
    }

    public double GetGpa() {
        return gpa;
    }
}
    public class list {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Alice", 3.6));
            students.add(new Student("Ali", 3.2));
            students.add(new Student("ce", 3.4));
            students.add(new Student("e", 3.8));
            Comparator<Student> comparator = Comparator.comparing(Student::GetGpa).reversed().thenComparing(Student::GetName);
            students.sort(comparator);
            students.sort((a, b) ->{
                if(b.GetGpa() - a.GetGpa() > 0){
                    return 1;
                }else if(b.GetGpa() - a.GetGpa() < 0){
                    return -1;
                }else{

                    return a.GetName().compareTo(b.GetName());
                }
            });
            for (Student s : students) {
                System.out.println(s.GetName() + " " + s.GetGpa());
            }
            Collections.sort(students,comparator);
        }
    }
