public class Stack {
    private int top;
    private int stackArray[];
    public Stack(){
        top=-1;
        stackArray = new int[5];
    }
    public Stack(int n){
        top=-1;
        stackArray = new int[n];
    }
    public void push(int ele){
        stackArray[++top] = ele;
    }
    public int pop(){
        if(top<0) System.out.println("Stack UnderFlow");;
        int data = stackArray[top];
        top--;
        return data;
    }
    public void display(){
        if(top==-1){System.out.println("Stack is Empty!");return;}
        System.out.print("Elements are: ");
        for(int i=0;i<=top;i++) System.out.print(stackArray[i]+" ");
        System.out.println();
    }
}
