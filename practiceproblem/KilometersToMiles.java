import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Conversion to miles
        double miles = kilometers * 0.621371;

        // Displaying result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles");

        sc.close();
    }
}
