public class PrintCityNames
//This program is to input alphabet and print their city name
{
    public static <Char> void main(String[] args) {

        char c = 'K';//declaring  char variable

       //applying condition using if else if ladder method
        if (c == 'A')
        {
            System.out.println("City name is Amsterdam ");
        } else if (c == 'B') {
            System.out.println("City name is Birmingham ");
        } else if (c == 'C') {
            System.out.println("City name is Coventry");
        } else if (c == 'D') {
            System.out.println("City name is Derby");
        } else if (c == 'E') {
            System.out.println("City name is Edinburgh");
        } else if (c == 'F') {
            System.out.println("City name is Farnham ");
        } else {
            System.out.println("Can not identify City name");
        }
    }
}