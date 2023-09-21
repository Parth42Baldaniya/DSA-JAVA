import java.util.*;

public class nsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many first n number you want to sum :");
        int a = s.nextInt();
        int sum = 0;
        for(int i=0; i<a; i++){
            sum = sum+i;
        }
        System.out.println("The sum is :"+ sum);
        s.close();
    }
}
