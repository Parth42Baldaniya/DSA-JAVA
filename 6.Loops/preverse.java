public class preverse {
    public static void main(String[] args) {
        int reverse = 0;
        int a = 10988;
        int b;
        while(a != 0){
           b =  a % 10 ;
           reverse = reverse * 10 + b;
           a = a / 10 ;
        }
        System.out.println("The reverse number is :"+reverse);
    }
}

