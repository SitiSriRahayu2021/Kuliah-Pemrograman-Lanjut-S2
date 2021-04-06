package MoreOnClasses;

public class Inheritance {
    public void makeSound() {
        System.out.println("Hi");
    }
}
class Dog extends Inheritance {

}
class A {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
