import java.util.Scanner;

public class program13 {
    public static void main(String[] args)
    {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                System.out.print(j*i+"\t");
            }
            System.out.println();
        }
    }
}
