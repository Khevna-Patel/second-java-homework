import java.nio.file.attribute.BasicFileAttributes;
public class FindEmployeeSalary

//This program is to find employee id, name, basic salary
//find HAR, TA, PF and Gross salary

{
    public static void main(String[] args)
    {
        //Declaring variables
     int EmployeeId = 204;
     String Name = "Nel";
     double BasicSalary = 60000;
     double HRA, DA, TA, PF, gross;

     System.out.println("Employee Id: " + EmployeeId);//applying condition
     System.out.println("Employee Name: " + Name);
     System.out.println("Basic Salary of the employee: " + BasicSalary);

            HRA = 0.1 * BasicSalary;//10% of basic salary
            DA = 0.08 * BasicSalary;//8% of basic salary
            TA = 0.09 * BasicSalary;//9% of basic salary
            PF =  0.20 * BasicSalary;//20% of basic salary
            gross =(BasicSalary + HRA + DA + TA - PF);//calculation of gross salary

            //applying condition
            System.out.println("HRA: "+ HRA);
            System.out.println("DA: " + DA);
            System.out.println("TA: " + TA);
            System.out.println("PF: " + PF);
            System.out.println("The Gross Salary of the employee: " + gross );




    }
}
