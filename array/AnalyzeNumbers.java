package array;
import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int num = input.nextInt();
        double[] numbers = new double[num];


        System.out.println("Enter the numbers: ");
        for (int i = 0; i < num; i++) {
            numbers[i] = input.nextDouble();

        }

        int count = 0;
        double max = numbers[0];
        double min = numbers[0];
        
         for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
         }  
         for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
         }
        
        System.out.println("Maximum is " + max);
        System.out.println("Min is " + min);
    }
} 
