import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter X Number");
        x=scanner.nextInt();
        System.out.println("Enter Y Number");
        y=scanner.nextInt();
        for(int i=x; i<=y; i++){
            System.out.println(i +" ");
        }
    }
}
