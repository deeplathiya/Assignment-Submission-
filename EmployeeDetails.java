import java.util.Scanner;

class Employee
{
    private int eid;
    private String name;
    private float salary;
    public void inputDetails()
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter Employee ID    :");
        eid=sc.nextInt();
        System.out.print("Enter Employee Name  :");
        name=sc1.nextLine();
        System.out.print("Enter Employee Salary:");
        salary=sc.nextFloat();
    }
    public void showDetails()
    {
        System.out.println("Employee ID    :"+eid);
        System.out.println("Employee Name  :"+name);
        System.out.println("Employee Salary:"+salary+" per month");
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.inputDetails();
        e1.showDetails();
    }
}
