import java.util.Scanner;
public class program7 {
    public static void main(String[] args){
      //let the user enter integer, while his enter 0, if he //enter a positive number ill add it to
        // the sum of the positive, else ill add it to the negative
        int number;
        int positiveSum = 0;
        int negativeSum = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Please enter a number");
            number = scanner.nextInt();
            if(number>0){
                positiveSum+=number;
            }else
                negativeSum+=number;

        }
        while(number != 0);
        System.out.println("Your negative sum is "+negativeSum+" Your positive sum is "+positiveSum);
    }
}
