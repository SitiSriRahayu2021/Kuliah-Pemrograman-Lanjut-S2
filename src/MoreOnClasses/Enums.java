package MoreOnClasses;

public enum Enums {
    RED, BLUE, GREEN;
}
class PrintColor {
    public static void main(String[ ] args) {
        Enums color = Enums.RED;
        switch(color) {
            case BLUE:
                System.out.println("1");
                break;
            case GREEN:
                System.out.println("2");
                break;
            default:
                System.out.println("0");
                break;
        }
    }
}