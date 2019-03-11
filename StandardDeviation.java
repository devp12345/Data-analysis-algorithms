
import java.util.*;
import java.text.*;
  
public class standardDeviation{    
   public static void main (String[] args){
   
      Scanner stdin = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.##"); 
   
      print("please enter the number of data points");
      int n = stdin.nextInt();
   
      double[] x = new double[n];
      print("please enter " + n + " data points");
   
      for(int i = 0;i<n;i++){
         x[i]= stdin.nextDouble();
      }
   
   
   
      double standardDeviation = Math.sqrt((sumOfDiff(x)/n));
            print("The standard deviation is " + df.format(standardDeviation));
   }
   
//calculates the sum of the squares of the difference between the value X and the average of the data set
   public static double sumOfDiffSquared(double[] a){  
      double[] arr = new double [a.length];
      double average = average(a);
      for(int i = 0; i <a.length;i++){
         arr[i] = Math.pow((a[i]-average),2);
          }
   
      return sum(arr);
   }
   //calculates the average of the data set
   public static double average(double[] a){
           double total = sum(a);   
      return total/a.length;
   
   
   }
   
   //calculates the sum of the array that is passed through it 
   public static double sum(double[] a){  
      double sum = 0.0;
      for(int i = 0; i <a.length;i++){
         sum+=a[i];
      }
      return sum;
   }

   
  
   //because i dont like typing System.out. :3 
   public static void print(String s){
      System.out.println(s);
   }
 
}
