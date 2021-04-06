package ExceptionsListsThreadsFiles;

public class Threads extends Thread {
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Threads object = new Threads();
        object.start();
    }

}
