import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int a = s.nextInt();
        System.out.println("Enter the Second number :");
        int b = s.nextInt();
        int sum = a+b;
        System.out.println("The Sum is : "+ sum);
        s.close();
    }
}
