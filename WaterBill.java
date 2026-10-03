import java.util.*;
class WaterBill
{ 
  public static void main (String[] args)
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter Water consumption in liters");
     int consumption =sc.nextInt();
     int bill;
     if(consumption>500)
     {  bill =200;

     }else {
            bill=100;
       } 
     System.out.println("Bill : "+bill);
   }
}