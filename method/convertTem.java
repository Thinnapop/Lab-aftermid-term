package method;

import java.util.Scanner;

public class convertTem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userResponse;
        do {
            System.out.println("Enter the current scale C(Celsius) F(fahrenheit) : ");
            char currentScale = Character.toUpperCase(input.next().charAt(0));

            System.out.println("Enter the target scale C(Celsius) F(fahrenheit) : ");
            char targetScale = Character.toUpperCase(input.next().charAt(0));

            System.out.println("Enter the temperature : ");
            double temperature = input.nextDouble();

            if (currentScale == targetScale || targetScale == currentScale) {
                System.out.println("Scale can't be the same!! ");
            }
            else{
            String result = convertedTemp(currentScale, targetScale, temperature);
            System.out.println(result);
        }

        System.out.println("Do you want to perform another conversion? (yes/no): ");
        userResponse = input.next().trim().toLowerCase();

    }
    while (userResponse.equals("yes"));
        System.out.println("Program terminated");
        

    }

    public static String convertedTemp(char currentScale, char targetScale, double temperature) {
        double converted;
        if (currentScale == 'C' && targetScale == 'F') {
            converted = ((9 * temperature) / 5) + 32;
            return "the convertion of " + temperature + " is : " + converted;
        }
         else if (currentScale == 'F' && targetScale == 'C') {
            converted = ((temperature - 32) * 5 / 9);
            return "the convertion of " + temperature + " is : " + converted;
        }
         else {
            return "unexpect error";
        }
    }
}
