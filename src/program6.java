import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
        int num;
        int pow;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        num = scanner.nextInt();
        System.out.println("Enter pow Number");
        pow = scanner.nextInt();
        int sum=1;
        for (int i = 1; i <= pow; i++) {
            sum = sum * num;
        }
        System.out.println(sum);
    }
}
