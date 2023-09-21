import java.util.*;

public class Navg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number :");
        int b = 0;
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            b = b+i;
        }
        System.out.println(b);
        sc.close();
    }
}
