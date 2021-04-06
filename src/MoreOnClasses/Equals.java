package MoreOnClasses;

public class Equals {
    private int x;
    public boolean equals(Object o) {
        return((Equals)o).x == this.x;
    }

    public static void main(String[] args) {
        Equals a = new Equals();
        a.x = 9;
        Equals b = new Equals();
        b.x = 5;
        System.out.println(a.equals(b));
    }
}
