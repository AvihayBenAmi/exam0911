import java.util.Scanner;

public class program3 {
    public static void main(String [] args){
        int n;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N Number");
        n=scanner.nextInt();
        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("The sum of prime numbers until n is "+sum);
    }
}
