package method;

public class example {
    public static void main(String[] args) {
        int i = 9;
        int j = 7;
        int k = max(i, j);
        System.out.println("the maximum between " + i +" and "+ j +" are "+k);
    }
    public static int max(int num1, int num2 ) {
        int result;

        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;
    }
}