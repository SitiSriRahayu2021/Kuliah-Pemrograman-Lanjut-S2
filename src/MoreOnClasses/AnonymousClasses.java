package MoreOnClasses;

public class AnonymousClasses {
    public void start() {
    }
    public static void main(String[] args) {
        AnonymousClasses m = new AnonymousClasses() {
            @Override
            public void start() {
                System.out.println("Hi");
            }
        };
        m.start();
    }
}
    

