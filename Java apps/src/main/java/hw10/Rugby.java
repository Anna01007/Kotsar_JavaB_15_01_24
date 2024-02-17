package hw10;

import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        int teamSize = 25;
        int[] teamOne = new int[teamSize];
        int[] teamTwo = new int[teamSize];

        fillAges(teamOne);
        fillAges(teamTwo);

        System.out.println("Age of team players 1:");
        printAges(teamOne);

        System.out.println("\nAge of team players 2:");
        printAges(teamTwo);

        double avgAgeTeam1 = calculateAverageAge(teamOne);
        double avgAgeTeam2 = calculateAverageAge(teamTwo);

        System.out.println("\nAverage age of team 1: " + avgAgeTeam1);
        System.out.println("Average age of team 2: " + avgAgeTeam2);
    }

    private static void fillAges(int[] ages) {
        Random random = new Random();
        for (int i = 0; i < ages.length; i++) {
            ages[i] = random.nextInt(23) + 18; // age range from 18 to 40
        }
    }

    private static void printAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    // calculation of average age
    private static double calculateAverageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}