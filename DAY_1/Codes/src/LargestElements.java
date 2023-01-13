import java.util.Scanner;

public class LargestElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int arr[] = new int[sc.nextInt()];
        for (int i=0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements are : ");
        int large = 0,slarge=0;
        for (int ele:arr) {
            System.out.print(ele+" ");
            if(ele>large){
                slarge = large;
                large = ele;
            }else if(ele>slarge){
                slarge = ele;
            }
        }
        System.out.println();
        System.out.println("Largest element in this array: "+ large);
        System.out.println("Second Largest element in this array: "+ slarge);
        sc.close();
    }
}