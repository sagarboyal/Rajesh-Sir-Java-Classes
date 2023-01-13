public class Stack <E>{

    private int top;
    private E array[];
    public Stack() {
        array = (E[]) new Object[5];
        top = -1;
    }

    public Stack(int n) {
        if(n<0) throw new InvalidStackSizeException();
        array = (E[]) new Object[n];
        top =-1;
    }
    public void push(E data)throws StackOverFlowException {
        if(top==array.length-1)throw new StackOverFlowException();
        array[++top]=data;
    }

    public E pop() throws  StackUnderFlowException{
        if(top<0) throw new StackUnderFlowException();
        E data = array[top];
        top--;
        return data;
    }
    public void display(){
        if(top==-1){System.out.println("Stack is Empty!");return;}
        System.out.print("Elements are: ");
        for(int i=0;i<=top;i++) System.out.print(array[i]+" ");
        System.out.println();
    }

}