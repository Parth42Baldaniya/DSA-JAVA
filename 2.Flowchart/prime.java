import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = s.nextInt();
        int flage = 0;
        if(a==1){
            System.out.println("Not Prime");
        }
        else if(a==2){
            System.out.println("Prime");
        }
        else{
            for(int i=2; i<a; i++){
                if(a%i==0){
                    flage = flage+1;
                }
            }
            if(flage>0){
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Prime");
            }
        }
        s.close();
    }
}