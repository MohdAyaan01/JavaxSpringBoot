package Generics;

public class Box<T> {// the t is placeholder, You can write anything in the form of single letter such as abcdefgh , remember only Single letter will used
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
