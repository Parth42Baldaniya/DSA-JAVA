import java.util.*;

public class area{
    public static void main(String[] args) {
        System.out.println("Enter the circle redias : ");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        double area;
        area = 3.14*r*r;
        System.out.println("The area of circle is :"+ area);
        s.close();
    }
}

