package MoreOnClasses;

import java.util.Scanner;
abstract class Shapes {
    int width;
    abstract void area();
}
//your code goes here
class Square extends Shapes {
    public Square(int w) {
        width = w;
    }
    public void area() {
        width *= width;
        System.out.println(width);
    }
}
class Circle extends Shapes {
    public Circle (int w) {
        width = w;
    }
    public void area() {
        double areaCircle = Math.PI * width * width;
        System.out.println(areaCircle);
    }
}
class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
