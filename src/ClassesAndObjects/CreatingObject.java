package ClassesAndObjects;

public class CreatingObject {
    public void test() {
        System.out.println("Hi");
    }
}
class B {
    public static void main(String[] args) {
        CreatingObject obj = new CreatingObject();
        obj.test();
    }
}
