import java.util.Scanner;
class Swapper{
     int x,y;
     Swapper(int a,int b){
        x = a;
        y = b;
     }

     public int getX() {
        
         return x;
     }
     public int getY() {
         return y;
     }
     void swap(){
       int temp;
        temp = x;
         x = y;
         y = temp;
     }
}
public class Q1_SwapperDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a");
        a= sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();

        
        Swapper obj = new Swapper(a,b);
        System.out.println("The value of a is : " + obj.getX() );
        System.out.println("The value of b is : " + obj.getY() );
        obj.swap();
        System.out.println("After swapping: ");
        System.out.println("The value of a is : " + obj.getX() );
        System.out.println("The value of b is : " + obj.getY() );
        System.out.println(a+" "+b);
    }
}

