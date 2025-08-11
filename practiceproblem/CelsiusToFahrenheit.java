import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking temperature in Celsius as input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Converting to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Displaying result
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

        sc.close();
    }
}
