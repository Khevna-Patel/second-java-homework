public class AverageOfNumbers
    // This Program is to Calculate average of 5 numbers
{
    public static void addition(int a, int b, int c, int d, int e) // no return type with parameter
    {
        System.out.println("Average of all 5 number" + " = " + (a + b + c + d + e) /5);

    }
    public static void main(String[] args)
    {
       addition ( 10, 20, 30, 10,40);//calling static method to static area
    }
}