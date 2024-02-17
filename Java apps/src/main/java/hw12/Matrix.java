package hw12;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for M: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of rows for N: ");
        int columns = scanner.nextInt();

        // Matrix M x N
        int[][] originalMatrix = new int[rows][columns];

        System.out.println("Enter the matrix elements M x N:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("elements [" + (i + 1) + "][" + (j + 1) + "]: ");
                originalMatrix[i][j] = scanner.nextInt();
            }
        }

        // transpose matrix
        int[][] transposedMatrix = transposeMatrix(originalMatrix);

        System.out.println("\nOriginal matrix M x N:");
        printMatrix(originalMatrix);

        System.out.println("\nTranspose matrix N x M:");
        printMatrix(transposedMatrix);

        scanner.close();
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
