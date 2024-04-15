/*
3.3) Write a Java program to represent a Complex number. Include member functions to:
1.	Initialize a complex number to a default value of zero (default constructor)
2.	Initialize a complex number to a user defined value (parameterized constructor)
3.	Add two complex numbers and return the result. (Parameterized method)
4.	Subtract two complex numbers and return the result. (Parameterized method)
5.	Display a complex number. (non-parameterized method)
*/
import java.util.Scanner;
class Complex
{
    int realpart,imgpart;

     void setNumber(int n1, int n2)
     {
            realpart=n1;
            imgpart=n2;
     }
    Complex()
    {
        realpart =0;
        imgpart = 0;
       // System.out.println("The complex number is: " + realpart + " + " +imgpart);
    }

    Complex(int r, int i)
    {
        realpart = r;
        imgpart = i;
        //System.out.println("The complex number is: "+ realpart +" + " +imgpart);
    }

    void Display()
    {
        System.out.println("The complex number is: "+ realpart +" + " +imgpart + "i");
    }
    
    Complex Sumcomplex( Complex o1 , Complex o2 )
    {  
       Complex o3 = new Complex(0,0);
       o3.setNumber((o1.realpart+o2.realpart), (o1.imgpart+o2.imgpart));
       return o3;
    }

    Complex Differencecomplex( Complex o1 , Complex o2 )
    {  
       Complex o3 = new Complex(0,0);
       o3.setNumber((o1.realpart-o2.realpart), (o1.imgpart-o2.imgpart));
       return o3;
    }

}

    public class TW_3c { 
        public static void main(String[] args) {
           
        int x,y,p,q;

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Real part of the complex number1");
        x = sc.nextInt();

        System.out.println("Enter the imaginay part of the complex number1");
        y = sc.nextInt();

        System.out.println("Enter the Real part of the complex number2");
        p = sc.nextInt();

        System.out.println("Enter the imaginay part of the complex number2");
        q= sc.nextInt();


        Complex c1 = new Complex(x,y);
        c1.Display();
        Complex c2 = new Complex(p,q);
        c2.Display();
        Complex c3 = new Complex();
        c3.Display();
        Complex result = new Complex(0,0);

        result =  result.Sumcomplex(c1,c2 );
       System.out.println("The resultant complex number when the two complex numbers are added is:"+result.realpart+" "+"+"+result.imgpart+"i");
       
       result =  result.Differencecomplex(c1,c2 );
       System.out.println("The resultant complex number when the two complex numbers are subtracted is:"+result.realpart+" "+"+ ("+result.imgpart+")i");
       

    //      Complex result1 = result.Sumcomplex(c1,c3 );
    //    System.out.println("The resultant complex number when the two complex numbers are added is:"+result1.realpart+" "+"+"+result1.imgpart+"i");
       
    //    Complex result2 =  result.Differencecomplex(c1,c3 );
    //    System.out.println("The resultant complex number when the two complex numbers are subtracted is:"+result2.realpart+" "+"+ ("+result2.imgpart+")i");

       
        }
    
}
