import java.util.Scanner;

public class patterns {
    public void pattern(int rows) {
        for (int i = rows; i >= 1 ; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print("ABCDE ");
            }
            System.out.println("  ");
        }
    }

    public static void main(String args[]) {
        patterns obj = new patterns();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To See Pattern");
        int input = sc.nextInt();
        obj.pattern(input);

    }
}