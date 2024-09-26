package array;
import java.util.Scanner;

public class arrmethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the items: ");
         int num = input.nextInt();
         int[] numbers = new int[num];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < num; i++) {
            numbers[i] = input.nextInt();
        } 
        printArr(numbers);
        findMax(numbers);
        findMin(numbers);
       



    }
    public static void findMax(int[] numbers) {
        int max = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[max]) {
                max = i;
                
            }
           
        }
         System.out.println("The maximum number is : "+ numbers[max]);
    }
    public static void findMin(int[] numbers) {
        int min = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[min]) {
                min = numbers[min];
            }
            
        }
        System.out.println("The minimum number is : "+ numbers[min]);
    }
    public static void printArr(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            System.out.printf("%4s",numbers[i]);
        }
        System.out.println();
    }
}

