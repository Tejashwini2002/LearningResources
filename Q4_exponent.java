
import java.util.Scanner;


class Power{
    int base;
    int exponent;
    Power(int base, int exponent){
        this.base = base;
        this.exponent = exponent;
    }
    int computePower(){
        int result =1 ;
        for(int i=1;i<=exponent;i++){
            result = result*base;
        }
        return result;
    }
}

public class Q4_exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,n;
        System.out.println("Enter base: ");
        a = sc.nextInt();
        System.out.println("Enter exponent: ");
        n = sc.nextInt();
         Power obj = new  Power(a,n);
         System.out.println("The value of a to the power n is :"+ obj.computePower());
       
    }
}