import java.util.*;

public class incometax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income :");
        int a = sc.nextInt();
        if(250000 >= a){
            System.out.println("Not Tax");
        }
        else if(250000 < a && a < 1000000){
            System.out.println("your Tax is :" + a*2/100);
        }
        else if(1000000 <a && a < 5000000){
            System.out.println("your Tax is :"+ a*4/100);
        }
        else{
            System.out.println("your Tax is :"+ a*8/100);
        }
        sc.close();
    }
}