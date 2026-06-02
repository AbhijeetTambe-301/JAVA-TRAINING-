import java.util.*;

public class SUM OF ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }

        System.out.println("Sum = " + sum);
    }
}