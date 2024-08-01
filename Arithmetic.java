import java.util.*;
class Arithmetic
{
  public static void main(String[]args)
  {
     int a;
     int b;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a and b values");
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("Addition : "+(a+b));
     System.out.println("Subtraction : "+(a-b));  
     System.out.println("Multiplication : "+(a*b));
     System.out.println("Division : "+(a/b));   
     System.out.println("Modulo Division : "+(a%b));   
 }}


