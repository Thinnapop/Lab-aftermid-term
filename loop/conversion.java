package loop;
import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int col = 1;
        int count = 1;

        System.out.println("Enter the Inches : ");
        int numInch = scanner.nextInt();

        System.out.println("Inches\t\tCentimeter");
        while (col <= numInch) {
            double converted = count * 2.54;
            System.out.println(count+"\t\t"+converted);
            col++;
            count++;
            count++;
        }
        scanner.close();
    }
}
