import MathOperations.FloorOperation;
import MathOperations.CeilOperation;
import MathOperations.RoundOperation;

public class MathOperationProgramme {
    public static void main(String[] args) {
        double num1 = 8.75;
        double num2 = -3.14;
        double num3 = 5.5;

        System.out.println("Original number: " + num1);
        System.out.println("Floor : " + FloorOperation.floorValue(num1));
        System.out.println("Ceil  : " + CeilOperation.ceilValue(num1));
        System.out.println("Round : " + RoundOperation.roundValue(num1));

        System.out.println("\nOriginal number: " + num2);
        System.out.println("Floor : " + FloorOperation.floorValue(num2));
        System.out.println("Ceil  : " + CeilOperation.ceilValue(num2));
        System.out.println("Round : " + RoundOperation.roundValue(num2));

        System.out.println("\nOriginal number: " + num3);
        System.out.println("Floor : " + FloorOperation.floorValue(num3));
        System.out.println("Ceil  : " + CeilOperation.ceilValue(num3));
        System.out.println("Round : " + RoundOperation.roundValue(num3));
    }
}
