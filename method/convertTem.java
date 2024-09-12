package method;

import java.util.Scanner;

public class convertTem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current scale c(Celsius) / f(fahrenheit) : ");
        char currentScale = Character.toUpperCase(scanner.next().charAt(0));

        System.out.println("Enter the target Scale c(Celsius) / f(fahrenheit) : ");
        char targetScale = Character.toUpperCase(scanner.next().charAt(0));

        System.out.println("Enter the temperature : ");
        double temperature = scanner.nextDouble();

        String result = formula(currentScale, targetScale, temperature);
        System.out.println(result);

    }

    public static String formula(char a, char b, double temperature) {
        double converted;

        if (a == 'C') {
            converted = (temperature - 32) * 5 / 9;
            return temperature + " C is " + converted + " F";
        }
         else if (a == 'F') {
            converted = ((9 * temperature) / 5) + 32;
            return temperature + " F is " + converted + " C";
        }
        
         else {
            return "invalid scale please enter C or F";
        }

    }
}
