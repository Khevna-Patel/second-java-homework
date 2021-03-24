public class SalesCommission
//This program is to find sales commission on the basis of total sales
{
    public static void main(String[] args)
     {
         //declaring variables
         int salesId = 021;
         String sellerName = "Nick";
         double salaryBasic = 20000;
         double CommissionRate = 0.0;
         int TotalSales = 35000;
         int Commission;

         System.out.println("Sales ID: " + salesId );
         System.out.println("Employee name: " + sellerName);
         System.out.println("Basic Salary: " + salaryBasic);
         System.out.println("Total Sales: " +TotalSales);
        if (TotalSales >=50000) //if total sales is >=50000
            CommissionRate=0.35;// then commission 35%

        else if (TotalSales >=30000)//if total sales is >=30000
            CommissionRate=0.2;//then commission 20%

        else if (TotalSales >=20000)//if total sales is >=20000
            CommissionRate=0.1;//then commission 10%

        else if (TotalSales >=10000)//if total sales is >=10000
            CommissionRate=0.05;//then commission is 5%

        else CommissionRate=0.02;//if total sales is less then 10000 then commission 2%

        Commission = (int) (CommissionRate * TotalSales);// calculation of commission

        System.out.println("The Commission is " + Commission); //applying condition








     }






}
