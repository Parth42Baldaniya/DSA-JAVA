import java.util.*;;

public class greatest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first Number :");
        int a = s.nextInt();
        System.out.println("Enter the second Number :");
        int b = s.nextInt();
        if(a>b){
            System.out.println("The greatest number is :"+ a);
        }
        else{
            System.out.println("The greatest number is :"+ b);
        }
        s.close();
    }
}
