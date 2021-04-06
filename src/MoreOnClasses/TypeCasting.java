package MoreOnClasses;

public class TypeCasting {
    public void print() {
        System.out.println("A");
    }
}
class N extends TypeCasting {
    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        TypeCasting object = new N();
        N b = (N) object;
        b.print();

    }
}