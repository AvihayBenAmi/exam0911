import java.util.Scanner;

public class program9 {
    public static void main(String[] args){
        int Number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        Number=scanner.nextInt();
        System.out.println("the singels Number is "+Number%10);
    }

}
