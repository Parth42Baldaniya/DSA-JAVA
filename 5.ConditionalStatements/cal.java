import java.util.*;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a :");
        float a = sc.nextFloat();
        System.out.println("Enter value b :");
        float b = sc.nextFloat();
        System.out.println("Enter the oprator :");
        char opr = sc.next().charAt(0);

        switch(opr){
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default  : System.out.println("Worng Oprator");
        }
        sc.close();
    }
}
