package hw7;

public class ShuttleNumbers {
    public static void main(String[] args) {
        printLuckyShuttleNumbers(100);
    }

    private static void printLuckyShuttleNumbers(int totalShuttles) {
        for (int numbershuttle = 1; numbershuttle <= totalShuttles; numbershuttle++) {
            String numberAsString = String.valueOf(numbershuttle);
            if (!(numberAsString.contains("4") || numberAsString.contains("9"))) {
                System.out.println("space shuttle № " + numbershuttle);
            }
        }
    }
}
