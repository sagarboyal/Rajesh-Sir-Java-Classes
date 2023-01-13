public class SortEno implements Comparator{
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getEmpno()-e2.getEmpno();
    }
}
