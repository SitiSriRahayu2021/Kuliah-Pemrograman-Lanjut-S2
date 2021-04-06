package ClassesAndObjects;

public class Static {
    public static int pCount;
    public static void main(String[ ] args) {
        Static.pCount = 1;
        Static.pCount++;
        System.out.println(Static.pCount);
    }
}

