import java.util.*;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum + i ;
            i++;
        }
        System.out.println("The sum is :"+ sum);
        sc.close();
    }
}