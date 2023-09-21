import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        int fac = 1;
        if(a == 0 ){
            System.out.println("Your answer is : 1");
        }
        for(int i = a; i>=1; i--){
                fac = fac * i;
        }
        System.out.println("Your answer is "+ fac);
        sc.close();
    }
}
