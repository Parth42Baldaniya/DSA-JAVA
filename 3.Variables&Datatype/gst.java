import java.util.*;

public class gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pencil = 8;
        int pen = 10;
        int eraser = 5;
        System.out.println("Enter the how many pencil buy :");
        float a = sc.nextFloat();
        System.out.println("Enter the how many pen buy :");
        float b = sc.nextFloat();
        System.out.println("Enter the how many eraser buy :");
        float c = sc.nextFloat();
        float Total = (a*pencil) + (b*pen) + (c*eraser);
        System.out.println("The Total cost is :"+ Total);
        float GST = Total*18/100;
        System.out.println("The GST is :"+ GST);
        float Bill = Total + GST;
        System.out.println("YOur Total Cost inclued GST bill is :"+ Bill);
        sc.close();
    }
}
