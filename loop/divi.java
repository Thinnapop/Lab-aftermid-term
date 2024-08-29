package loop;
import java.util.Scanner;

public class divi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int i = scanner.nextInt();
        int row = 1;
        int count = 1;

        while (count < i+1) {
            if (row > 10) {
                System.out.println();
                row = 1;
            }
            if (count % 5 == 0 ^ count % 7 == 0) {
                System.out.printf("%4d", count++);
                row++;
            }
            else {
                count ++;
            }
        }  scanner.close();   
    }
}
