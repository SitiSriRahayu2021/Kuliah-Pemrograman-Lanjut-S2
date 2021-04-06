package MoreOnClasses;

public class ComparingObject {
    private int x;
    public static void main(String[ ] args) {
        ComparingObject a = new ComparingObject();
        a.x = 5;
        ComparingObject b = new ComparingObject();
        b.x = 5;
        System.out.println(a == b);
    }
}
