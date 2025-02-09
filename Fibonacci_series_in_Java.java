
import java.util.Scanner;

public class Fibonacci_series_in_Java {

   
    public static void result(int n) {
        int n1 = 0;
        int n2 = 1;
        System.out.print("Fibonacci Series: " + n1 + ", " + n2);
        for (int i = 0; i < n-2; i++) {

            int result1 = n1 + n2;
            System.out.print(", " + result1);

            n1 = n2;
            n2 = result1;

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the first N fibbonaci ");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();

        if (num < 2) {
            System.out.println("Enter the number greater than or equal to 2");

        } else {
            result(num);
        }

    }
}
