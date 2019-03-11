
import java.util.*;
import java.text.*;
  
public class CorrelationCoefficient{    
   public static void main (String[] args){
   
   Scanner stdin = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("#.####"); 

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



 double correlation = (n*sum(x,y) - sum(x)*sum(y))/(Math.sqrt((n*sum2(x) - Math.pow(sum(x),2))*(n*sum2(y) - Math.pow(sum(y),2))));
   print("The correlation between the data set is " + df.format(correlation));

  if(correlation<0.5 ||correlation> -0.5){
  print("this is a weak correlation");
  }
  
  else if(correlation<=0.8 ||correlation>=0.5){
  print("this is a moderate positive correlation");
  }

else if(correlation<=-0.5 ||correlation>= -0.8){
  print("this is a moderate negative correlation");
  }

else if(correlation<=1 ||correlation>= 0.8){
  print("this is a strong positive correlation");
  }

 else if(correlation<=-0.8 ||correlation>= -1){
  print("this is a strong negative correlation");
  }

  
 
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
