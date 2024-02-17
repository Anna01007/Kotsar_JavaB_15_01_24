package hw8;

import java.util.Scanner;

public class ApplicationOfCycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial value A: ");
        int a = scanner.nextInt();

        System.out.print("Enter the final value B: ");
        int b = scanner.nextInt();

        System.out.println("Result for loop while: " + countUseWhile(a, b));
        System.out.println("Result for loop do-while: " + countUseDoWhile(a, b));
        System.out.println("Result for loop for: " + countUseFor(a, b));

        scanner.close();
    }

    static int countUseWhile(int a, int b) {
        int count = 0;
        int current = a;

        while (current <= b) {
            if (isDivisibleBySum(current)) {
                count++;
            }
            current++;
        }

        return count;
    }

    static int countUseDoWhile(int a, int b) {
        int count = 0;
        int current = a;

        do {
            if (isDivisibleBySum(current)) {
                count++;
            }
            current++;
        } while (current <= b);

        return count;
    }

    static int countUseFor(int a, int b) {
        int count = 0;

        for (int current = a; current <= b; current++) {
            if (isDivisibleBySum(current)) {
                count++;
            }
        }

        return count;
    }

    static boolean isDivisibleBySum(int number) {
        int sumOfDigits = calculateSumOfDigits(number);
        return number % sumOfDigits == 0;
    }

    static int calculateSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}