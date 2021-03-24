public class FindAddiSubMulDivByChangingSymbol
//This program is to find addition, subtraction, multiplication and division according to their symbol
{
    public static  void main(String[] args)
    {
        //instance variables = non=-static variables
      int a=100;
      int b=50;
      char symbol = '-';//char variable

      //applying condition using if else if method
      if (symbol== '+') //condition for addition
      {
          System.out.println(a+b);
      }
      else if (symbol== '-')//condition for subtraction
      {
          System.out.println(a-b);
      }
      else if (symbol== '*')//condition for multiplication
      {
          System.out.println(a*b);
      }
      else if(symbol== '/')//condition for addition
      {
          System.out.println(a/b);
      }
    }
}
