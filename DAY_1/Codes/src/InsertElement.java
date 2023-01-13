import javax.lang.model.element.Element;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int length = 3;
        arr[0]=1;arr[1]=2;arr[2]=3;
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        while(true){
            if(length== arr.length){
                System.out.println("Array Full");
                break;
            }
            System.out.println("Enter Position and Value :");
            insert(arr,sc.nextInt(),sc.nextInt(),length);
            length++;
            System.out.print("Elements are : ");
            for(int i=0;i<length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    static void insert(int arr[],int pos, int val,int len){
        int i;
        for(i=len;i>pos;i--)arr[i]=arr[i-1];
        arr[i]=val;
    }

}
