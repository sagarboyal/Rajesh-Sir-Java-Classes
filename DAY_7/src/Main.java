import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                System.out.println("Enter Size:");
                Stack s = new Stack(sc.nextInt());
                int choice;
                do{
                    System.out.println("Enter Choice 1->push 2->pop  3->display 4->exit");
                    choice = sc.nextInt();
                    switch (choice){
                        case 1:
                            System.out.println("Enter Data");
                                s.push(sc.nextInt());
                            break;
                        case 2:
                                System.out.println(s.pop() + " Deleted");
                            break;
                        case 3:
                            s.display();
                            break;
                        default:break;
                    }
                }while(choice != 4);
    }
}