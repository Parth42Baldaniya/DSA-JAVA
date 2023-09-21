import java.util.*;

public class max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a  = s.nextInt();
        System.out.println("Enter second number :");
        int b  = s.nextInt();
        System.out.println("Enter third number :");
        int c  = s.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("The max number is "+ a);
            }
            else{
                System.out.println("The max number is "+ c);
            }
        }
        if(b>a){
            if(b>c){
                System.out.println("The max number is "+ b);
            }
            else{
                System.out.println("The max number is "+ c);
            }
        }
        s.close();
    }
}
