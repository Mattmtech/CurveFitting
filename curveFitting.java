package csc335;
import java.util.Scanner;
import java.io.*;

public class curveFitting 
{
     public static void main(String[] args) throws FileNotFoundException 
     {
      FileReader file = new FileReader("C:\\Users\\Matt\\Desktop\\xandy.txt");
      Scanner reader = new Scanner(file);
      String[] numbers = null;
      double sum1 = 0;
      double sum2 = 0;
      double sum3 = 0;
      double sum4 = 0;
      double sum5 = 0;
      while (reader.hasNextLine())
        {
         String line1 = reader.nextLine();
         numbers = line1.split(",");
         double x = Double.parseDouble(numbers[0]);
         double y = Double.parseDouble(numbers[1]); 
       sum1 += Math.pow(x,2) *y;
       sum2 += y * Math.log(y);
       sum3 += x * y;
       sum4 += x * y * Math.log(y);
       sum5 += y;
        }
      double a = ((sum1 * sum2) - (sum3*sum4)) / ((sum5 * sum1) - Math.pow(sum3, 2));
      a = Math.exp(a);
      double b = ((sum5 * sum4) - (sum3 * sum2)) / ((sum5 * sum1) - Math.pow(sum3, 2));
      System.out.println("a is: " + a + " b is :" + b);

   
 
    }
    
}


