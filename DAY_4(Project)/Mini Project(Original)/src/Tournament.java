import java.util.Scanner;

public class Tournament {
    private String tournamentname;
    private int year;
    private Team[] Team;
    private int teamCounter;

    public Tournament() {
        teamCounter=0;
        Team=new Team[25];

    }

    public Tournament(String tournamentname, int year) {
        this.tournamentname = tournamentname;
        this.year = year;
        teamCounter=0;
        Team=new Team[25];
    }

    public String getTournamentname() {
        return tournamentname;
    }

    public void setTournamentname(String tournamentname) {
        this.tournamentname = tournamentname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void addTeam(){
        Scanner sc=new Scanner(System.in);
        Team[teamCounter]=new Team();
        System.out.println("Enter Team Name");
        Team[teamCounter].settName(sc.next());
        System.out.println("Enter Team Ceo Name");
        Team[teamCounter].setCEO(sc.next());
        System.out.println("Enter No of players");
        int nop = sc.nextInt();
        for(int i=0;i<nop;i++)Team[teamCounter].addPlayer();
        teamCounter++;


    }
    public void displayTournament(){
        System.out.println("Tournament Name :   "+getTournamentname());
        System.out.println("Tournament Year :   "+getYear());
        for(int i=0;i<teamCounter;i++)Team[i].display();
    }
}

