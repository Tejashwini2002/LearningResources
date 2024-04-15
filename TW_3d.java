/*
3.4) Create a IndMoney class with two integer instance variables rupees and paise. Add a constructor with two parameters for initializing a IndMoney object. The constructor should check the paise value is between 0 and 99 and, if not, transfer some of the paise to the rupees variable to make it between 0 and 99. Add a plus method to the class that takes a IndMoney object as parameter. It creates and returns a new IndMoney object representing the sum of the object whose plus() method is being invoked and the parameter. It does not modify the values of the two existing objects. It should also ensure that the value of the paise instance variable of the new object is between 0 and 99. For example, if x is an IndMoney object with 12 rupees and 80 paise, and if y is an IndMoney object with 8 rupees and 90 paise, then x.plus(y) will return a new IndMoney object with 21 rupees and 70 paise. Also, create a IndMoneyDemo driver class that tests the IndMoney class.
 * 
*/
import java.util.Scanner;
class IndMoney{
    // IndMoney means Indian money
    int rupees;
    int paise;
    IndMoney(int x,int y)
    {
        if(y>0 && y<99){
          paise = y;
          rupees =x;
        }
        else{
            int extra = y-99;
            rupees = x + (extra/100);
            paise = 99;
        }
    }
    void setIndMoney(int x, int y)
    {
        if(y>0 && y<99){
          paise = y;
          rupees =x;
        }
        else{
            int extra = y-99;
            rupees = x + (extra/100);
            paise = 99;
        }
    }
    IndMoney plus( IndMoney o1 , IndMoney o2 )
    {  
        IndMoney o3 = new IndMoney(0,0);
       o3.setIndMoney((o1.rupees+o2.rupees), (o1.paise+o2.paise));
       return o3;
    }
    void Display()
    {
        System.out.println("The Amount is: "+ rupees + " rupees" +" "+ paise + " paise"  );
    }
}
public class TW_3d {
    public static void main(String[] args) {
        int x,y,p,q;

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rupees part of Amount 1");
        x = sc.nextInt();

        System.out.println("Enter the paise part of Amount 1");
        y = sc.nextInt();

        System.out.println("Enter the Rupees part of Amount 2");
        p = sc.nextInt();

        System.out.println("Enter the  paise part of Amount 2");
        q= sc.nextInt();

        IndMoney c1 = new IndMoney(x,y);
        c1.Display();
        IndMoney c2 = new IndMoney(p,q);
        c2.Display();
        IndMoney result = new IndMoney(0,0);

        result =  result.plus(c1,c2 );
        System.out.println("The resultant Indian Money when the two Amount are added is:" + result.rupees + " rupees" +" "+ result.paise +
       " paise");
       
        

    }
}
