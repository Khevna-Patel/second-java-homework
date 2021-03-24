public class StudentGrade
    //This program is to input student name, roll number, 3 subject's marks,percentage
    //checking pass or fail with grade
{
    public static void main(String[] args)
    {
        //declaring variables
        String name = "peter";//String variable
        int rollNo = 10;//instance variable
        double subject1 = 75.00;//double variable
        double subject2 = 60.00;
        double subject3 = 85.00;
        double total = subject1 + subject2 + subject3;
        double percentage = (total / 300 * 100);

        //applying conditions
        System.out.println("Student name: " + name );
        System.out.println("Roll no: " + rollNo);
        System.out.println(name + " total is : " + total);
        System.out.println(name +" Percentage is : " + percentage +" % ");

        //student pass or fail
        if (percentage >= 35)
        {
            System.out.println(name + " is Pass ");//applying condition using if else condition
        }
        else
        {
           System.out.println(name + " is Fail ");
        }
        //finding Grade of students by using if else if method
        if (percentage >=80)
        {
          System.out.println(name + " grade is A+ ");
        }
        else if (percentage >=60)
        {
            System.out.println(name + " grade is A");
        }
        else if (percentage >= 50)
        {
            System.out.println(name + " grade is B");
        }
        else if (percentage >= 35)
        {
            System.out.println(name + " grade is C");
        }



    }

}
