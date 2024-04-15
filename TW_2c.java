/*
 2.3) Write a Java program to define a class Lamp. It can be in on or off state. You can turn on and turn off lamp (behavior). It makes use of class and its member methods.
Solution Approach:
Lamp class is created.The class has an instance variable isOn and three methods turnOn(), turnOff() and displayLightStatus().
Two objects l1 and l2 of Lamp class are created in the main() function.
Here, turnOn() method is called using l1 object: l1.turnOn();
This method sets isOn instance variable of l1 object to true.
And, turnOff() method is called using l2 object: l2.turnOff();
This method sets isOn instance variable of l2 object to false.
Finally, l1.displayLightStatus(); statement displays Light on? true because isOn variable holds true for l1 object.
And, l2.displayLightStatus(); statement displays Light on?  false because isOn variable holds false for l2 object

*/

class Lamp{
     String isOn;
     void turnOn(String x){
        
           this.isOn = x;     
     }

     void turnOff(String x){
        this.isOn = x;   
     }
     void displayLightStatus(){
          System.out.println("Is the light on? "+ isOn);
     }
}
public class TW_2c {
    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
        l1.turnOn("true");
        l2.turnOff("flase");
        l1.displayLightStatus();
        l2.displayLightStatus();
    }
}
