package hw5;
import java.util.Scanner;
public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // team №1
        System.out.print("Enter the name of the first team: ");
        String teamName1 = scanner.nextLine();

        // Entering the number of frags for 5 players of the first team
        int[] fragsTeam1 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the number of frags for the player " + (i + 1) + ": ");
            fragsTeam1[i] = scanner.nextInt();
        }

        // team №2
        System.out.print("Enter the name of the second team: ");
        scanner.nextLine(); // Clearing the buffer after entering a number
        String teamName2 = scanner.nextLine();

        // Entering the number of frags for 5 players of the second team
        int[] fragsTeam2 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the number of frags for the player " + (i + 1) + ": ");
            fragsTeam2[i] = scanner.nextInt();
        }
//    Calculation of arithmetic mean points for each team + comparison of results
        double averageTeam1 = calculateAverage(fragsTeam1);
        double averageTeam2 = calculateAverage(fragsTeam2);
        String winnerGame = (averageTeam1 > averageTeam2) ? teamName1 : teamName2;   // use ternary operator
        System.out.println("The winning team is " + winnerGame + ", which scored " + ((winnerGame.equals(teamName1)) ? averageTeam1 : averageTeam2) + " points");
    }

    // A method for calculating the arithmetic mean
    private static double calculateAverage(int[] fragsTeam1) {
        int sum = 0;
        // We go through all the elements of the array and add them to the sum
        for (int value : fragsTeam1) {
            sum += value;
        }
        //  arithmetic mean, dividing the sum by the number of elements
        return (double) sum / fragsTeam1.length;
    }
}
