import java.util.*;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = sc.nextInt();
        boolean a = year%4 == 0;
        boolean b = year%100 ==0 && year/400==0 ;
        boolean c = year%100 !=0;
        if(a || (b && c)){
            System.out.println("leap year");
        }
        else{
            System.out.println("Not leap year");
        }
        sc.close();
    }
}


