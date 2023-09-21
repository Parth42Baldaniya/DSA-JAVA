import java.util.*;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square :");
        int a = sc.nextInt();
        int area = a*a;
        System.out.println("The are of square is : "+ area);
        sc.close();
    }
}
