import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        for(int i=1; i<=a; i++){
            System.out.print(" "+i+" ");
            if(i%2==0){
                evensum = evensum + i;
            }
            else{
                oddsum = oddsum + i;
            }
        }
        System.out.println("\neven number sum :" + evensum);
        System.out.println("odd number sum :" + oddsum);
        sc.close();
    }
}
