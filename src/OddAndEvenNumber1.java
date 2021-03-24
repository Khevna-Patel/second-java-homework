import java.util.Scanner;
// program to  find odd and even number using turner operator

public class OddAndEvenNumber1
{
    static boolean isEven(int a)//static variable
       {
           // a&1 is 1, then odd, else even
           return ((a & 1)!=1);
       }
       public static void main(String[] args)
       {
           int a = 198;//instance variable
           System.out.print(isEven(a) == true ? " Given number is Even number " : "Given number is Odd number "); //applying condition
       }
   }



