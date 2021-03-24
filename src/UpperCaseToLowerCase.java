import java.util.Locale;

public class UpperCaseToLowerCase
//This program is for input any alphabet in lowercase and print in lowercase

{
    public static void main(String[] args)
    {
        //declaring variables
        String result;
        String changeCase = "K";
        System.out.println(changeCase);

        result = changeCase.toLowerCase(Locale.ROOT);// applying condition change to lower case
        System.out.println(result);

    }
}
