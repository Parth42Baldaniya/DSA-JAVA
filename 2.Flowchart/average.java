import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("First exam score :");
        int a = s.nextInt();
        System.out.println("Second exam score :");
        int b = s.nextInt();
        System.out.println("Third exam score :");
        int c = s.nextInt();
        System.out.println("Four exam score :");
        int d = s.nextInt();
        System.out.println("Fift exam score :");
        int e = s.nextInt();
        int avg = (a+b+c+d+e)/5;
        System.out.println("The Five exam score average is : "+ avg);
        s.close();
    }
}
