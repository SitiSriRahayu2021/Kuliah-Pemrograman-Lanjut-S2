package ExceptionsListsThreadsFiles;
import java.util.Formatter;
public class WritingToFiles {
    public static void main(String[] args) {
        try {
            Formatter f = new Formatter("a.txt");
            f.format("%s", "Hi ");
            f.format("%s", "there");
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
