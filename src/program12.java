import java.util.Scanner;

public class program12 {
    public static void main(String[] args){
        int Number;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter A Number between 1-10");
            Number=scanner.nextInt();
        }
        while(Number<1||Number>10);{
            for(int i=0;i<=100;i++){
                System.out.println();
                for(int j=1;j<=10;j++){
                    System.out.print(Number*j+" ");
                }
            }
        }

    }
}
