import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        // Calculating power using Math.pow()
        double result = Math.pow(base, exponent);

        // Displaying result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        sc.close();
    }
}
