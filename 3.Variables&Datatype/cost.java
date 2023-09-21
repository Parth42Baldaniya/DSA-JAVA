import java.util.*;

public class cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pencil price :");
        float a = sc.nextFloat();
        System.out.println("Enter the pen price :");
        float b = sc.nextFloat();
        System.out.println("Enter the eraser price :");
        float c = sc.nextFloat();
        float total = a+b+c;
        System.out.println("The total cost of : "+ total);
        sc.close();
    }
}
