
import java.util.Scanner;
class Robot {
   void start() {
      System.out.println("I will start");
   }

   void work() {
      System.out.println("I will work");
   }

   void stop() {
      System.out.println("I will stop");
   }
}

class waste_disposal_robot extends Robot {
   void start() {
      System.out.println("I will start disposing waste");
   }

   void work() {
      System.out.println("I am disposing waste");
   }

   void stop() {
      System.out.println("I will stop disposing waste");
   }

   void find_waste(String str) {
      System.out.println("I will segregate dry waste and wet waste with the help of my assistant robots.");
      String str1="drywaste";
      String str2="wetwaste";
      
      if(str.equals(str1)){
         Drywaste_disposal_robot obj1 = new Drywaste_disposal_robot();
      }
      else{
         Wetwaste_disposal_robot obj2 = new Wetwaste_disposal_robot();
      }
   }
}

class Drywaste_disposal_robot extends waste_disposal_robot {
   Drywaste_disposal_robot() {
      System.out.println("Dry waste found and disposed successfully.");
      
   }
}

class Wetwaste_disposal_robot extends waste_disposal_robot {
   Wetwaste_disposal_robot() {
      System.out.println("Wet waste found and disposed successfully.");
   }
}

public class Q5_Robot {
   public static void main(String[] args) {
      String s1;
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter the type of waste to be disposed: 1).Drywaste or 2).Wetwaste");
         s1 = sc.next().toLowerCase();
         waste_disposal_robot obj = new waste_disposal_robot();
         obj.find_waste(s1);
   }
}