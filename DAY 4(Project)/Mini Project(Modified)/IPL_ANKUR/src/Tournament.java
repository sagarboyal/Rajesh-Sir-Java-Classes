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

    public void setTeam(Team t){
        Team[teamCounter++]=t;
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
        System.out.println("Tournament Name \t Tournament Year");
        System.out.println(getTournamentname()+"\t\t\t\t\t"+getYear());
        for(int i=0;i<teamCounter;i++)Team[i].displayPlayer();
    }
    public void displayTeams() {
        System.out.println("Team Name\t\tCEO Name");
        for (int i = 0; i < teamCounter; i++) {
            System.out.println((i + 1) + ") " + Team[i].gettName() + "\t\t\t" + Team[i].getCEO());
        }
    }
    public void updatePlayer(int team){
        if(team>teamCounter){
            System.out.println("Teams Entry Full");
            return;
        }
        Team[team].addPlayer();
    }
}

