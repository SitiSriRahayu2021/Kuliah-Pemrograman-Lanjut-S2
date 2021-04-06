package BasicConcepts;

import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        //your code goes here
        int sum = days * 24 * 60 * 60;

        System.out.println(sum);

    }
}
