package MoreOnClasses;

public class OverridingDanOverloading {
    public void doSomething() {
        System.out.println("A");
    }
    public void doSomething(String str) {
        System.out.println(str);
    }
}
class B {
    public static void main(String[] args) {
        OverridingDanOverloading object = new OverridingDanOverloading();
        object.doSomething("B");
    }
}
