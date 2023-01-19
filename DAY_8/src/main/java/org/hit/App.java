package org.hit;

import config.SpringConfiguration;
import org.hit.model.Employee;
import org.hit.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfiguration.class);
        int ch;
        Integer empid;
        Employee employee;
        EmployeeService service=context.getBean("employeeService",EmployeeService.class);
        System.out.println("Employee Table ->");
        do{
            System.out.println("Select Option:");
            System.out.println("1->ADD\t\t2->UPDATE \n3->DELETE\t4->SEARCH \n5->DISPLAY\t6->EXIT");
            System.out.println("Enter Choice:");
            ch=scan.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Employee id name and salary");
                    employee=context.getBean("employee", Employee.class);
                    employee.setEid(scan.nextInt());
                    employee.setEname(scan.next());
                    employee.setSalary(scan.nextFloat());
                    boolean flag = service.addEmployee(employee);
                    if(flag) System.out.println(employee.getEname()+" Record Added");
                    else System.out.println("Employee id Already Present");
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
                        System.out.println(employee+" Deleted From Database");
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
