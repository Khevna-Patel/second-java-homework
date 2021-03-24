public class LeapYear
   //This program is to  find out the year is leap year or not
{
    public static void main(String[] args)
    {
        //instance variable
     int year =1990; // year to be checked
        //year is divided by 4
        //if year is century
        //year is divided by 400


        if (((year % 4 == 0) && (year % 100!= 0))|| (year%400 == 0))

                 System.out.println(year + " is a leap year ");//then it is a leap year
           else
                 System.out.println(year + " is not a leap year ");//then is not a leap year

    }




}
