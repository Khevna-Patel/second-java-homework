public class StudentPassOrFail
//java program of input student name, roll no, 3 subjects marks, percentage and result
//program to check pass or fail on the basis of passing in all 3 subjects
{
    public static void main(String[] args)
    {
        //declaring variables
        String name = "peter";
        int rollNo = 10;
        double subject1 = 11;
        double subject2 = 32;
        double subject3 = 98;
        double total = subject1 + subject2 + subject3;
        double percentage = (total / 300 * 100);

        //Applying cinditions
        System.out.println("Student name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println(name + " total: " + total);
        System.out.println(name + " Percentage: " + percentage + " % ");

        if (subject1 >= 35 && subject2 >= 35 && subject3 >= 35) //applying condition using if else method
        {
            System.out.println(name + " is Pass ");//if student pass in all 3 subject then pass
        }
        else
            {
            System.out.println(name + " is Fail ");//if student fail even in 1 subject then fail
            }

    }
}
