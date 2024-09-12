package method;
import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the x1 : ");
        double x1 = input.nextDouble();

        System.out.println("Enter the x2 : ");
        double x2 = input.nextDouble();

        System.out.println("Enter the y1 : ");
        double y1 = input.nextDouble();

        System.out.println("Enter the y2 : ");
        double y2 = input.nextDouble();

        String result = distance(x1, y1, x2, y2);
        System.out.println(result);
    }
    public static String distance(double x1,double y1,double x2, double y2) {
        double calculated;
        calculated = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y2-y1, 2));
        return "The distance between two point is : "+ calculated;
    }
}
