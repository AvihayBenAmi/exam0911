import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        int num;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Number");
            num = scanner.nextInt();
        } while (num < 0);
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial is " + factorial);
    }
}
