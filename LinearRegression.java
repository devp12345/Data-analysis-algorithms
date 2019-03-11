
import java.util.*;
import java.text.*;
  
public class LinearRegression{    
   public static void main (String[] args){
   
   Scanner stdin = new Scanner(System.in);
   DecimalFormat df1 = new DecimalFormat("#.##"); // 2 decimls for the a value (y intercept)
   DecimalFormat df2 = new DecimalFormat("#.######"); // 6 decimal points for the slope

 print("please enter the number of data points");
 int n = stdin.nextInt();
 
 double[] x = new double[n];
 double[] y = new double [n];
 print("please enter " + n + " points as the x value data points");

 for(int i = 0;i<n;i++){
 x[i]= stdin.nextDouble();
 }
 print("please enter " + n + " points as the y value data points");

 for(int i = 0;i<n;i++){
 y[i]= stdin.nextDouble();
 }


//formula for the y intercept A

 double a = ((sum(y)*sum2(x))-(sum(x)*sum(x,y)))/((n*sum2(x))-Math.pow(sum(x),2)); 
  
  //formula for the slope B  
  double b = ((n*sum(x,y))-(sum(x)*sum(y)))/((n*sum2(x))-Math.pow(sum(x),2)); 

 
 print( df1.format(a) + " + " +  df2.format(b) + "x");   
   }
   
   //calculates sums of X and Y
   public static double sum(double[] a){  
   double sum = 0.0;
   for(int i = 0; i <a.length;i++){
   sum+=a[i];
   }
   return sum;
   }
   
   
   // calculates sum of x*y
    public static double sum(double[] a,double[] b){  
   double sum = 0.0;
   
   for(int i = 0;i<a.length;i++){
  sum+= a[i]*b[i];
   }
    return sum;
    }


// calculates sum of x^2
 public static double sum2(double[] a){   

   double sum = 0.0;
   for(int i = 0;i<a.length;i++){
   sum+= Math.pow(a[i],2);
   }
   return sum;
   }

   //because i dont like typing System.out. :3 
 public static void print(String s){
 System.out.println(s);
 }
 
 }
