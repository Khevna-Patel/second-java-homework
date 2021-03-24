public class PrintInterchangedValue
    // This program is for Swapping two numbers
{
    public static void main(String[] args)
    {
        //declaring variables
     double a = 50;//double variable variable
     double b = 80;

      //applying condition
     System.out.println("Before swapping :");
     System.out.println("First number = " + a);
     System.out.println("Second number = " + b);

     a = a - b; //(50-80)
     b = a + b; // (50-80) + 80 = 50
     a = b - a; // 50- (50-80) = 80

     System.out.println("After swapping :");//applying condition
     System.out.println("First number = " + a);
     System.out.println("Second number = " + b);

    }
}
