import java.util.Scanner;

public class Employee {
    private int empno;
    private String empname;
    private int empsalary;

    public Employee() {
    }

    public Employee(int empno, String empname, int empsalary) {
        this.empno = empno;
        this.empname = empname;
        this.empsalary = empsalary;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Emp number and  Emp name and Emp Salary");
        setEmpno(sc.nextInt());
        setEmpname(sc.nextLine());
        setEmpsalary(sc.nextInt());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", empname='" + empname + '\'' +
                ", empsalary=" + empsalary +
                '}';
    }
}
