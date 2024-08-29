package loop;

public class number {
    public static void main(String[] args) {

        int i = 1;
        int col = 1;
        int row = 1;

        while (row <= 10) {
            while (col <= 10) {
                System.out.printf("%4d", i++);
                col++;
            }
            System.out.println();
            row++;
            col = 1;
        }
    }
}