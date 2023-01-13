public class Main {
    public static void main(String[] args) {
        HitEmployee employees= new HitEmployee();
        employees.setEmp(new Employee(1001,"Santu",45000),0);
        employees.setEmp(new Employee(1005,"Arnab",65000),1);
        employees.setEmp(new Employee(1007,"Subhajit",75000),2);
        employees.setEmp(new Employee(1004,"Sagar",35000),3);
        employees.setEmp(new Employee(1003,"Ankur",25000),4);
        System.out.println("E Name");
        Comparator c = SortEname::compare;
        IEmployee.bubbleSort(employees.getEmp(),c);
        employees.displayEmployee();
        System.out.println("E Number");
        IEmployee.bubbleSort(employees.getEmp(),new SortEno());
        employees.displayEmployee();
        System.out.println("E Salary");
        IEmployee.bubbleSort(employees.getEmp(),new SortEsalary());
        employees.displayEmployee();
    }
}