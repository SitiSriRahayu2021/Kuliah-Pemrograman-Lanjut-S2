package ExceptionsListsThreadsFiles;

public class Threads2 implements Runnable {
    public void run() {
        System.out.println("Bye");
    }
}
class App {
    public static void main(String[] args) {
        Thread ob = new Thread(new Threads2());
        ob.start();
    }
}
