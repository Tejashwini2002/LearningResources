import java.util.Scanner;
public class AccentureQ2 {
public static int area_of_shadow(int radius){
    double area = 3.14*radius*radius;
    System.out.println("Area in double: "+area);
    return (int)Math.round(area);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("Area of the shadow: "+area_of_shadow(radius));
    }
}
/*
Enter radius of the circle: 
5
Area in double: 78.5
Area of the shadow: 79
*/
/*
Enter radius of the circle: 
3
Area in double: 28.259999999999998
Area of the shadow: 28
*/
/*
Enter radius of the circle: 
65
Area in double: 13266.5
Area of the shadow: 13267
*/