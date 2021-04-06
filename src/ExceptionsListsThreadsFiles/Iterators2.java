package ExceptionsListsThreadsFiles;

import java.util.Iterator;
import java.util.LinkedList;
public class Iterators2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
