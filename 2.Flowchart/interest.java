import java.util.*;

public class interest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the initial principal balance : P :");
        int P = s.nextInt();
        System.out.println("Enter the annual interst rate : r :");
        double r = s.nextDouble();
        System.out.println("Enter the time(year) : t :");
        double t = s.nextDouble();
        double A = P * (1 + (r * t));
        System.out.println("The Final Amount is : A : "+ A);
        s.close();
    }
}
