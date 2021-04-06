package ClassesAndObjects;

public class ReferenceTypes {
    public static void main(String[ ] args) {
        ReferenceTypes r;
        int age;
        r = new ReferenceTypes();
        r.setAge(25);
        change(r);
        System.out.println(r.getAge());
    }

    private boolean getAge() {
        return false;
    }

    private void setAge(int i) {
    }


    static void change(ReferenceTypes r) {
        r.setAge(10);
    }
}
