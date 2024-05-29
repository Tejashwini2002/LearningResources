
import java.util.Scanner;

class LawsofMotion2 extends Vehicle {
   float time;
   float mass;
   float force;

   LawsofMotion2(float var1, float var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3);
      this.time = var4;
      this.force = var6;
      this.mass = var5;
   }

   float computeDistanceTravelled(float var1) {
      float var2 = this.u * var1 + 0.5F * this.a * var1 * var1;
      return var2;
   }

   float computeDistanceTravelled() {
      float var1 = (this.v * this.v - this.u * this.u) / (2.0F * this.a);
      return var1;
   }

   float computeAcceleration(float var1, float var2) {
      float var3 = var1 / var2;
      return var3;
   }

   float computeAcceleration(float var1, float var2, float var3, float var4) {
      float var5 = (var1 * var2 - var1 * var3) / var4;
      return var5;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the initial velocity: ");
      float var2 = var1.nextFloat();
      System.out.println("Enter the final velocity: ");
      float var3 = var1.nextFloat();
      System.out.println("Enter the acceleration value: ");
      float var4 = var1.nextFloat();
      System.out.println("Enter time");
      float var5 = var1.nextFloat();
      System.out.println("Enter mass");
      float var6 = var1.nextFloat();
      System.out.println("Enter force");
      float var7 = var1.nextFloat();
      LawsofMotion2 var8 = new LawsofMotion2(var2, var3, var4, var5, var6, var7);
      float var9 = var8.computeDistanceTravelled();
      float var10 = var8.computeDistanceTravelled(var5);
      float var11 = var8.computeAcceleration(var7, var6);
      float var12 = var8.computeAcceleration(var6, var3, var2, var5);
      System.out.println("Distance found using formula  s= (( v*v - u*u)/(2*a)) is:  " + var9);
      System.out.println("Distance found using formula  s=u*t+0.5f*a*t*t is:  " + var10);
      System.out.println("Acceleration found using formula a=force/mass is: " + var11);
      System.out.println("Acceleration found using formula a = (m*v-m*u)/t  is: " + var12);
   }
}
/*
SAMPLE OUTPUT: 

Enter the initial velocity: 
2
Enter the final velocity:
3
Enter the acceleration value:
4
Enter time
5
Enter mass
6
Enter force
7
Distance found using formula  s= (( v*v - u*u)/(2*a)) is:  0.625
Distance found using formula  s=u*t+0.5f*a*t*t is:  60.0
Acceleration found using formula a=force/mass is: 1.1666666
Acceleration found using formula a = (m*v-m*u)/t  is: 1.2
*/
