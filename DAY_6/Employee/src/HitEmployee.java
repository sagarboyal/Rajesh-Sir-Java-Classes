public class HitEmployee implements IEmployee{
    Employee[] emp;

    public Employee[] getEmp() {
        return emp;
    }
    public void setEmp(Employee e,int index){
        emp[index] = e;
    }

    public HitEmployee(){
        emp = new Employee[5];
    }
    public HitEmployee(int n){
        emp = new Employee[n];
    }
    @Override
    public void readEmployee() {
        for(int i=0;i< emp.length;i++){
            emp[i] = new Employee();
            emp[i].read();
        }
    }

    @Override
    public void displayEmployee() {
        for (Employee e: emp)
            System.out.println(e);
    }
}
