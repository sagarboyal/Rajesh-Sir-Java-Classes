package org.hit;

import org.hit.model.Employee;
import org.hit.service.EmployeeService;
import org.hit.service.EmployeeServiceImp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan=new Scanner(System.in);
        int ch;
        Integer empid;
        Employee employee;
        EmployeeService service=new EmployeeServiceImp();
        do{
            System.out.println("1->ADD 2->UPDATE 3->DELETE 4->SEARCH 5->DISPLAY 6->EXIT");
            ch=scan.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Employee Details");
                    employee=new Employee(scan.nextInt(),scan.next(),scan.nextFloat());
                    service.addEmployee(employee);
                    break;
                case 2:
                    System.out.println("enter Employee id ");
                    empid=scan.nextInt();
                    employee = service.findEmployee(empid);
                    if (employee == null) {
                        System.out.println("record not found");
                    }else{
                        System.out.println("Existing data : ");
                        System.out.println(employee);
                        System.out.println("Enter name and salary to update");
                        employee.setEname(scan.next());
                        employee.setSalary(scan.nextFloat());
                        service.updateEmployee(employee);
                        System.out.println("Record updated successfully");

                    }
                    break;
                case 3:
                    System.out.println("Enter EMP ID to delete :");
                    empid= scan.nextInt();
                    employee = service.findEmployee(empid);
                    if(employee == null){
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Deleted record ");
                        System.out.println(employee);
                        service.deleteEmployee(empid);
                        System.out.println("Record deleted successfully");
                    }
                    break;
                case 4:
                    System.out.println("Enter employee ID to search :");
                    empid = scan.nextInt();
                    employee = service.findEmployee(empid);
                    if(employee == null){
                        System.out.println("Record not found");
                    }else {
                        System.out.println(employee);
                    }
                    break;
                case 5:
                    service.findAllEmployee().forEach(System.out::println);
                    break;
                case 6:
                    break;
            }
        }while(ch!=6);
        scan.close();
    }
}
