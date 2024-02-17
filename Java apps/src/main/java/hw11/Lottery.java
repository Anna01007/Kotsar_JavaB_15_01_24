package hw11;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int arraySize = 7;

        int[] organizerNumbers = new int[arraySize];
        int[] playerNumbers = new int[arraySize];

        fillArrayRandom(organizerNumbers);
        fillArrayRandom(playerNumbers);

        System.out.println("Organizer array: " + Arrays.toString(organizerNumbers));
        System.out.println("Player array:      " + Arrays.toString(playerNumbers));

        Arrays.sort(organizerNumbers);
        Arrays.sort(playerNumbers);

        System.out.println("\nSorted organizer array: " + Arrays.toString(organizerNumbers));
        System.out.println("Sorted player array:      " + Arrays.toString(playerNumbers));

        int matchingCount = countNumbers(organizerNumbers, playerNumbers); // Finding the number of matches

        System.out.println("\nNumber of matches: " + matchingCount);
    }

    private static void fillArrayRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    // the number of matches between the two arrays
    private static int countNumbers(int[] array1, int[] array2) {
        int matchingCount = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                matchingCount++;
            }
        }
        return matchingCount;
    }
}
