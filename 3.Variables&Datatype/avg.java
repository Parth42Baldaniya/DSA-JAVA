import java.util.*;

public class avg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c)/3;
        System.out.println("The average of these 3 number :"+ avg);
        sc.close();
    }
}