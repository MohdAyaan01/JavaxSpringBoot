package Generics;
//Bounded Type Parameter
//public class Box<T extends Number> {// the t is placeholder, You can write anything in the form of single letter such as abcdefgh , remember only Single letter will used
//    private T value;
//
//    public T getValue() {
//        return value;
//    }
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//}

//
//public class Box<T extends Number>{
//    private T value;
//    public Box(T input){
//        this.value = value;
//    }
//    public T getValue(){
//        return value;
//    }
//    public void setValue(T value){
//        this.value = value;
//    }
//}
public class Box<T extends Number>{
    private T value;

    public T getValue()
    {
        return value;

    }
    public void setValue(T value)
    {
        this.value = value;

    }
}