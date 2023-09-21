import java.util.*;

public class fever {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the temperature : ");
        float a = sc.nextFloat();
        if(a>100.00){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You have a not fever");
        }
        sc.close();
    }
}
