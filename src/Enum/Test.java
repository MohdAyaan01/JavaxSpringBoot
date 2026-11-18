package Enum;
//public class Test {
//    public enum Months{
//        JANUARY
//    }
//    public static void main(String[] args){
//        System.out.println(Day.SUNDAY);
//        System.out.println(Day.THURSDAY);
//        Day monday = Day.MONDAY;
//        int ordinal = monday.ordinal();
//        System.out.println(ordinal);
//        System.out.println(monday.name());
//        Day enumday = Day.valueOf("MONDAY");
//        System.out.println(enumday);
//        Day[] values = Day.values();
//        for(Day i : values){
//            System.out.println(i);
//        }
//        Day monday = Day.MONDAY;
//        System.out.println(monday.getLower());
//        System.out.println(monday.getHindi());
//        Day day = Day.MONDAY;
//        String res = switch (day){
//            case MONDAY -> "M";
//                //Dont need of break in java new switch case
//            case SUNDAY -> "S";
//            default -> "Weeknd";
//        };
//        System.out.println(res);
//        System.out.println(Months.JANUARY);
//    }
//}

/*
public class Test {
    public enum MONTHS{
        JANUARY;
    }
    public static void main(String[] args){
//        Day monday = Day.MONDAY;
//        monday.name();//"MONDAY";
//        monday.ordinal();//1(Position Starts from 0)
//        Day.valueOf("MONDAY");//String->enum (error if no match)
//        Day.values();//array of all 7 constant
//        for(Day d : Day.values()) System.out.println(d);//loop overall

        //Let's Try With Switch Case
       // Day monday = Day.MONDAY;
       // System.out.println(monday.getLower());
       // System.out.println(monday.getHindi());
        Day day = Day.MONDAY;
        String res = switch (day){
            case MONDAY -> "M";
                //Don't need of break in java new switch case/
                case SUNDAY -> "S";
            default -> "Weeknd";
        };
        System.out.println(res);
        System.out.println(MONTHS.JANUARY);
    }
} */

public class Test {
    public static void main(String[] args){
       Day day = Day.MONDAY;
        String res = switch (day){
           case MONDAY -> "M";
           case SUNDAY -> "S";
           case TUESDAY -> "Y";
           case WEDNESDAY -> "W";
           case THURSDAY -> "T";
           case FRIDAY -> "F";
           case SATURDAY -> "SA";
        };
        System.out.println(res);
    }
}