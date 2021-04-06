package ExceptionsListsThreadsFiles;

public class Module6Quiz3 implements Runnable{
    public void run() {
        System.out.println("B");
    }
}
class A extends Thread {
    public void run() {
        System.out.println("A");
        Thread t = new Thread(new Module6Quiz3());
        t.start();
    }
    public static void main(String[ ] args) {
        A object = new A();
        object.start();
    }
}
