package edu.ntudp.fit.kazakov.lab2;

import java.util.Scanner;

public class MatrixOperations {
    private static final int MIN_RANDOM_VALUE = -100;
    private static final int MAX_RANDOM_VALUE = 100;
    private static final int MAX_MATRIX_RANGE = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the matrix width: ");
        int width = scanner.nextInt();
        System.out.print("Enter the matrix height: ");
        int height = scanner.nextInt();
        if (width > MAX_MATRIX_RANGE || height > MAX_MATRIX_RANGE) {
            System.out.println("Matrix dimensions cannot exceed " + MAX_MATRIX_RANGE + " by " + MAX_MATRIX_RANGE);
            return;
        }
        System.out.println("""
                Choose the method to create the matrix of integers:
                1. Manual input method;
                2. Automatic generation method; (randomly)
                Your choice:
                """);

        int[][] matrix = new int[width][height];
        int userChoice = scanner.nextInt();
        if (userChoice == 1) {
            fillMatrixManually(matrix, scanner);
        } else if (userChoice == 2) {
            fillMatrixRandomly(matrix);
        } else {
            System.out.println("Error, invalid option");
        }
        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("Minimum element: " + findMinElement(matrix));
        System.out.println("Maximum element: " + findMaxElement(matrix));
        System.out.println("Arithmetic average: " + findAverageElement(matrix, width, height));
        scanner.close();
    }

    private static int findMinElement(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    private static int findMaxElement(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    private static void fillMatrixManually(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Element[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void fillMatrixRandomly(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE + 1) + MIN_RANDOM_VALUE);
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static double findAverageElement(int[][] matrix, int width, int height) {
        int sum = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                sum += matrix[i][j];
            }
        }
        return (double) sum / (width * height);
    }
}
