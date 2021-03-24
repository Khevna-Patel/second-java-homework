public class PositiveNegativeZeroNumber
//verification of number is positive, negative or zero
{
    public static void main(String[] args)
    {
      int number= -122;//declaring variable

      if(number > 0)//applying condition1
      {
        System.out.println(number + " is a positive number");
      }
       else if(number < 0)//applying condition2
      {
         System.out.println(number + " is a negative number");
      }
       else//applying condition3
      {
          System.out.println(number + " is neither positive nor negative ");
      }
    }
}
