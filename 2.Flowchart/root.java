import java.util.*;

public class root {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double a,b,c,D,r1,r2,p1,x1,x2;
        System.out.println("The quadratic equstion is Ax^2+Bx+C ");
        System.out.println("Enter the number is A : ");
        a = s.nextDouble();
        System.out.println("Enter the number is B : ");
        b = s.nextDouble();
        System.out.println("Enter the number is c : ");
        c = s.nextDouble();
        D = (b*b)-(4*a*c);
        System.out.println("The root D is "+ D);
        if(D>0){
            r1 = (-b + Math.sqrt(D)/(2*a));
            r2 = (-b - Math.sqrt(D)/(2*a));
            System.out.println("The Root is first : "+ r1 + "and second : "+ r2);
        }
        else if(D==0){
            p1 = (-b)/(2*a);
            System.out.println("The Root is :"+ p1);
        }
        else{
            x1 = (-b)/(2*a);
            x2 = (Math.sqrt(-D))/(2*a);
            System.out.println("The Root is first : "+ x1 + "and second : "+ x2);
        }
        s.close();
    }
}
