package Enum;

public class Test {
    public enum Months{
        JANUARY
    }
    public static void main(String[] args){
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

        Day day = Day.MONDAY;

        String res = switch (day){
            case MONDAY -> "M";
                //Dont need of break in java new switch case
            case SUNDAY -> "S";
            default -> "Weeknd";
        };
        System.out.println(res);
        System.out.println(Months.JANUARY);
    }
}
