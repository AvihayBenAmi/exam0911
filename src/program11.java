import java.util.Scanner;

public class program11 {
    public static void main(String[] args){
        int Number;
        int Digits=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        Number= scanner.nextInt();
        while(Number>0){
            Number/=10;
            Digits++;
        }
        System.out.println("The Number of digits is "+Digits);
    }
}
