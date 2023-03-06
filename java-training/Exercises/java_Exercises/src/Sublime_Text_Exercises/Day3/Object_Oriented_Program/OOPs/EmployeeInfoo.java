package Sublime_Text_Exercises.Day3.Object_Oriented_Program.OOPs;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInfoo {
    static List<Employee> employeeDetailList = new ArrayList<>();

    public static void main(String[] args) {

       EmployeeInfoo.employeeDetails();
    }

     public  static void   employeeDetails() {

         Employee employeeDetail1 = new Employee(1001,"Ashish","01/04/2009",'e',"R&D",20000,8000,3000);
         Employee employeeDetail2 = new Employee(1002,"Sushma","23/08/2012",'c',"PM",30000,12000,9000);
         Employee employeeDetail3 = new Employee(1003,"Rahul","12/11/2008",'k',"Acct",10000,8000,1000);
         Employee employeeDetail4 = new Employee(1004,"Chahat","29/01/2013",'r',"Front Desk",12000,6000,2000);
         Employee employeeDetail5 = new Employee(1005,"Ranjan","16/07/2005",'m',"Engg",20000,20000,20000);
         Employee employeeDetail6 = new Employee(1006,"Suman","1/1/2000",'e',"Manufacturing",9000,8000,4400);
         Employee employeeDetail7 = new Employee(1007,"Tanmay","12/06/2006",'c',"PM",29000,12000,10000);

         employeeDetailList.add(employeeDetail1);
         employeeDetailList.add(employeeDetail2);
         employeeDetailList.add(employeeDetail3);
         employeeDetailList.add(employeeDetail4);
         employeeDetailList.add(employeeDetail5);
         employeeDetailList.add(employeeDetail6);
         employeeDetailList.add(employeeDetail7);
         for (Employee e : employeeDetailList) {
             System.out.println(e.desig_code);
         }


    }

    private int calcDA(int i, List<Employee> employeeDetailList ) {
        for (Employee e : employeeDetailList) {
            char designation = e.desig_code;
            switch(designation) {
                case 'e': return 20000;
                case 'c': return 32000;
                case 'k': return 12000;
                case 'r': return 15000;
                case 'm': return 40000;
            }
        }
        return 0;
    }


}
