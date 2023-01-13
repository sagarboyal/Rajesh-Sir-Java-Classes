import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter Size:");
                Stack<String> s = new Stack(sc.nextInt());
                int choice;
                do {
                    System.out.println("Enter Choice 1->push 2->pop  3->display 4->exit");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter Data");
                            try {
                                s.push(sc.next());
                            } catch (StackOverFlowException e) {
                                System.out.println(e);
                            }
                            break;
                        case 2:
                            try {
                                System.out.println(s.pop() + " Deleted");
                            } catch (StackUnderFlowException e) {
                                System.out.println(e);
                            }
                            break;
                        case 3:
                            s.display();
                            break;
                        default:
                            flag = false;
                            break;
                    }
                } while (choice != 4);
            } catch (InvalidStackSizeException e) {
                System.out.println(e);
            }
        }
    }
}