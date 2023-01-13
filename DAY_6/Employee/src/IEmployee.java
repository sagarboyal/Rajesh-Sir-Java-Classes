public interface IEmployee {
    void readEmployee();
    void displayEmployee();
    static void bubbleSort(Employee[] emp,Comparator c){
        Employee temp;
        for(int i=1;i<emp.length;i++)
            for (int j=0;j<emp.length-1;j++){
                if(c.compare(emp[j],emp[j+1])>0){
                    temp = emp[j];
                    emp[j]=emp[j+1];
                    emp[j+1]=temp;
                }
            }
    }
}
