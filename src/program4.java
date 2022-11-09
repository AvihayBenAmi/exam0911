import java.util.Scanner;

public class program4 {
    public static void main(String[] args){
        int Number;
        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("Enter positive Number");
            Number = scanner.nextInt();
        }
            while(Number<0);
            System.out.println("The Number is "+ Number);


    }
}
