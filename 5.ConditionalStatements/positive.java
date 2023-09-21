import java.util.*;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("Negative number");
        }
        sc.close();
    }
}
