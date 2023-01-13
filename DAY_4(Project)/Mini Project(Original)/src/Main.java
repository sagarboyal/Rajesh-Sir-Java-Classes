import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tournament tournament = new Tournament();
        System.out.println("Enter Tournament name:");
        tournament.setTournamentname(sc.next());
        System.out.println("Enter Tournament Year: ");
        tournament.setYear(sc.nextInt());
        int choice;
        do {
            //System.out.println("Tournament Name And Year "+tournament.getTournamentname()+" "+ tournament.getYear());
            System.out.println("1-> Add team\n2-> DisplayAll teams\n3-> Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    tournament.addTeam();
                    break;
                case 2:
                    tournament.displayTournament();
                    break;
                default:break;
            }
        }while(choice != 3);
    }
}

