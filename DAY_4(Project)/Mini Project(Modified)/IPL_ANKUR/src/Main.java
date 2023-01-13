import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tournament tournament = new Tournament();
        System.out.println("Enter Tournament name:");
        tournament.setTournamentname(sc.next());
        System.out.println("Enter Tournament Year: ");
        tournament.setYear(sc.nextInt());

        Team t1 = new Team("CSK","Kasi Viswanathan");
        t1.setPlayer(new Batsman(1001,"Raina",205,5528,1,39));
        t1.setPlayer(new Wicketkeeper(1002,"MSDhoni",234,4978,0,24,50,100));
        t1.setPlayer(new Bowler(1003,"Chahar",63,79,0,0,216,59));
        t1.setPlayer(new Batsman(1004,"Gaikwad",36,1207,1,10));
        t1.setPlayer(new Allrounder(1005,"RJadeja",210,2502,0,2,534,132));
        tournament.setTeam(t1);

        Team t2 = new Team("MI","Reliance Industries");
        t2.setPlayer(new Batsman(2001,"RSharma",227,5879,1,40));
        t2.setPlayer(new Batsman(2002,"Skumar",123,2644,0,16));
        t2.setPlayer(new Wicketkeeper(2003,"Ishan",75,1870,0,12,5,10));
        t2.setPlayer(new Bowler(2004,"JBumrah",120,57,0,0,450,145));
        t2.setPlayer(new Allrounder(2005,"HPandya",107,1963,0,2,316,50));
        tournament.setTeam(t2);

        Team t3 = new Team("RCB","Vijay Mallya");
        t3.setPlayer(new Batsman(3001,"VKohli ",223,6624,5,44));
        t3.setPlayer(new Batsman(3002,"plessis",116,3403,0,25));
        t3.setPlayer(new Wicketkeeper(3003,"Kartik",75,1870,0,12,5,10));
        t3.setPlayer(new Bowler(3004,"HPatel",78,230,0,0,200,97));
        t3.setPlayer(new Allrounder(3005,"Maxwell",110,2319,0,13,133,28));
        tournament.setTeam(t3);


        int choice;
        do {
            //System.out.println("Tournament Name And Year "+tournament.getTournamentname()+" "+ tournament.getYear());
            System.out.println("1-> Add team\t2-> Display All teams\n3-> All Team Player Details\n4->Add players in team\t5->Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    tournament.addTeam();
                    break;
                case 2:
                    tournament.displayTeams();
                    break;
                case 3:
                    tournament.displayTournament();
                    break;
                case 4:
                    System.out.println("Enter no of the team");
                    int team = sc.nextInt();
                    tournament.updatePlayer(team-1);
                    break;
                default:break;
            }
        }while(choice != 5);
    }
}

