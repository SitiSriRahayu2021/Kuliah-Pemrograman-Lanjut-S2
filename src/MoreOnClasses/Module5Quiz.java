package MoreOnClasses;

public class Module5Quiz {
    public void print() {
        System.out.println("a");
    }
    private void print(String str) {
        System.out.println("b");
    }
    private void print(int x) {
        System.out.println("c");
    }
    public static void main(String[ ] args) {
        Module5Quiz object = new Module5Quiz();
        object.print(12);
    }
}


