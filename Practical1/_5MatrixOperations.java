import java.util.*;

public class _4MatrixOperations {

    // Matrix Addition
    public static void matrixAddition(int[][] A1, int[][] A2) {
        int rows = A1.length;
        int cols = A1[0].length;
        int[][] result = new int[rows][cols];

        System.out.println("The Addition of Matrix1 and Matrix2 is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A1[i][j] + A2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrix Multiplication
    public static void matrixMultiplication(int[][] A1, int[][] A2) {
        int rows = A1.length;
        int cols = A2[0].length;
        int common = A1[0].length;
        int[][] result = new int[rows][cols];

        System.out.println("The Multiplication of Matrix1 and Matrix2 is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < common; k++) {
                    result[i][j] += A1[i][k] * A2[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrix Transpose
    public static void matrixTranspose(int[][] A1) {
        int rows = A1.length;
        int cols = A1[0].length;
        int[][] result = new int[cols][rows];

        System.out.println("The Transpose of the Matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A1[i][j];
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to input a matrix from the user
    public static int[][] inputMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for the matrices:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        System.out.println("Enter elements of Matrix1:");
        int[][] matrix1 = inputMatrix(sc, rows, cols);
        
        System.out.println("Enter elements of Matrix2:");
        int[][] matrix2 = inputMatrix(sc, rows, cols);
        
        System.out.println("Select the Choice for Operations:");
        System.out.println("1 for Multiplication");
        System.out.println("2 for Addition");
        System.out.println("3 for Transpose of Matrix1");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                matrixMultiplication(matrix1, matrix2);
                break;
            case 2:
                matrixAddition(matrix1, matrix2);
                break;
            case 3:
                matrixTranspose(matrix1);
                break;
            default:
                System.out.println("Invalid Choice entered");
                break;
        }
        sc.close();
    }
}
