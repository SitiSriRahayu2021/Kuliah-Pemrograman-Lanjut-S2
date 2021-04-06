package MoreOnClasses;

abstract class AbstractClasses {
    public int age;
    public abstract int printAge();
}
class S extends AbstractClasses {
    public int printAge() {
        return age;
    }
}
