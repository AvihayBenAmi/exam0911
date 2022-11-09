import java.util.Scanner;
public class program8 {
    public static void main(String[] args){
        int num;
        boolean isPrime=true;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number");
        num=scanner.nextInt();
        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
            if(isPrime==false) {
                System.out.println("is not primary number");
            }
                else{
                    System.out.println("is a primary number");

            }
        }
    }
