package ConditionalsAndLoops;

import java.util.Scanner;
public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for(int month = 1; month < 4; month++) {
            amount -= (amount *10)/100;
        }
        System.out.println(amount);
    }
}


