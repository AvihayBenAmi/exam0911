import java.util.Scanner;

public class program10 {
    public static void main(String[] args){
        int Number;
        int HighNum=0;
        int temp=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A number");
        Number=scanner.nextInt();
        while(Number>0){
            HighNum=Number%10;
            Number=Number/10;
            if(HighNum>temp) {
                temp=HighNum;
            }
        }
        System.out.println("The Highest Number is "+temp);
    }
}
