import java.util.Scanner;

public class Team {
    private String tName;
    private String  CEO;
    private Player[] player;
    private int playerCounter;

    public Team() {
        player=new Player[20] ;
        playerCounter=0;
    }

    public Team(String tName, String CEO) {
        this.tName = tName;
        this.CEO = CEO;
        player=new Player[20] ;
        playerCounter=0;
    }
    public void setPlayer(Player p){
        player[playerCounter]=p;
        playerCounter++;
    }
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }
    public void addPlayer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1->Batsman 2->Bowler 3->Wicket Keeper 4->All Rounder 5->exit");
        int choice=sc.nextInt();
        switch(choice){
            case 1:player[playerCounter]=new Batsman();
                player[playerCounter].read();
                break;
            case 2:player[playerCounter]=new Bowler();
                player[playerCounter].read();
                break;
            case 3:player[playerCounter]=new Wicketkeeper();
                player[playerCounter].read();
                break;
            case 4: player[playerCounter]=new Allrounder();
                player[playerCounter].read();
                break;
            case 5:
                break;
        }
        playerCounter++;
    }

    public void displayPlayer(){
        System.out.println("Team Name : "+gettName()+"\nTeam CEO Name : "+getCEO());
        System.out.println("PLAYER ID\tPLAYER NAME\t\tROLE\t\t\tINNINGS\t\tRUNS\t\tCENTURY\t\tHALF-CENTURY\tOVERS\t\tWICKET\t\tSTUMPS\t\tCATCHES");
        for(int i=0;i<playerCounter;i++){
            player[i].display();
            System.out.println();
        }
    }
}
