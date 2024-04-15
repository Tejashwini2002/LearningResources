
import java.util.Scanner;
interface polygon{
    double area();

}
class Square implements polygon{
    public double area(){
        System.out.println("Enter the values of x:");
        Scanner sc = new Scanner(System.in);
        double x= sc.nextDouble();
        double a = x*x;
    return a;
    }
}
class Rectangle implements polygon{
    public double area(){
        System.out.println("Enter the values of x and y:");
        Scanner sc = new Scanner(System.in);
        double x= sc.nextDouble();
        double y= sc.nextDouble();
        
        double a = x*y;
    return a;
    }
}
public class Q6_interface {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println("The area of Square is :"+ s.area( ));
       
        Rectangle r = new Rectangle();
        System.out.println("The area of Rectangle is :"+ r.area( ));
       
     
    }
}