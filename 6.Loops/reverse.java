import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int reverse = 0;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        while(a != 0){
           b =  a % 10 ;
           reverse = reverse * 10 + b;
           a = a / 10 ;
        }
        System.out.println("The reverse number is :"+reverse);
        sc.close();
    }
}
