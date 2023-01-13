public class SortEsalary implements Comparator{
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.getEmpsalary()- e1.getEmpsalary();
    }
}
