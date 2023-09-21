import java.util.*;

public class quadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("The quadratic equstion of ax^2 + bx + c = 0 ");
        System.out.println("Enter the value of a :");
        double a = s.nextDouble();
        System.out.println("Enter the value of b :");
        double b = s.nextDouble();
        System.out.println("Enter the value of c :");
        double c = s.nextDouble();
        System.out.println("The quadratic equstion are two answer :");
        double first = -c;
        double second = (-b)/a;
        System.out.println("The first answer is : "+ first + " or "+ " The second answer is :"+ second);
        s.close();
    }
}
