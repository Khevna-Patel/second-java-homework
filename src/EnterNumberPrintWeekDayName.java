public class EnterNumberPrintWeekDayName
//This program is to input any number and print the week day name accordingly
  {
    public static void main(String[] args)
    {
     int number = 9;//declaring variable
     //using  if else if ladder method to apply condition
     if (number == 1)//condition1
     {
         System.out.println("Monday");//output of condition1
     }
     else if (number == 2)//condition2
     {
         System.out.println("Tuesday");
     }
     else if (number == 3)//condition3
     {
         System.out.println("Wednesday");
     }
     else if (number == 4)//condition4
     {
         System.out.println("Thursday");
     }
     else if (number == 5)//condition5
     {
         System.out.println("Friday");
     }
     else if (number == 6)//condition6
     {
         System.out.println("Saturday");
     }
     else if (number == 7)//condition7
     {
         System.out.println("Sunday");
     }
     else
     {
         System.out.println("No more Days of the week");//condition8
     }

    }




}
