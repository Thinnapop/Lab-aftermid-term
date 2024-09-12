package method;
import java.util.Scanner;

public class sdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get temperature from user
        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        // Get conversion choice from user
        System.out.print("Enter the current scale (C for Celsius, F for Fahrenheit): ");
        char currentScale = Character.toUpperCase(scanner.next().charAt(0)); // Convert to uppercase

        System.out.print("Enter the target scale (C for Celsius, F for Fahrenheit): ");
        char targetScale = Character.toUpperCase(scanner.next().charAt(0)); // Convert to uppercase

        // Perform conversion
        String result = formula(currentScale, targetScale, temp);
        System.out.println(result);
    }

    // Method to handle conversion logic
    public static String formula(char a, char b, double temperature) {
        double convertedTemp;

        // Celsius to Fahrenheit
        if (a == 'C' && b == 'F') {
            convertedTemp = (temperature * 9/5) + 32;
            return temperature + "°C is " + convertedTemp + "°F.";
        }

        // Fahrenheit to Celsius
        else if (a == 'F' && b == 'C') {
            convertedTemp = (temperature - 32) * 5/9;
            return temperature + "°F is " + convertedTemp + "°C.";
        }

        // If scales are the same, no conversion needed
        else if (a == b) {
            return "No conversion needed, both scales are the same.";
        }

        // Invalid input
        else {
            return "Invalid input. Please enter 'C' or 'F'.";
        }
    }    
}
