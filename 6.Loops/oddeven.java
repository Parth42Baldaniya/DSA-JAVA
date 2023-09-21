import java.util.*;

public class oddeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;
        int num ;
        int choice;
        do{
            System.out.println("enter the number");
            num = sc.nextInt();
            if(num%2==0){
                evensum += num;
            }
            else{
                oddsum += num;
            }

            System.out.println("can you add more number so enter the 1 number");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("The sum is even number :"+ evensum);
        System.out.println("The sum is odd number :"+ oddsum);
        sc.close();
    }
}
