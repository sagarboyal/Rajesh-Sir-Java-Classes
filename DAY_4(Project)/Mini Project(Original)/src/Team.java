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
        System.out.println("enter 1->Batsman 2->Bowler 3->Wicket Keeper 4->All Rounder");
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
        }
        playerCounter++;
    }
    public void display(){
        System.out.println("Team Name : "+gettName());
        System.out.println("Team CEO Name : "+getCEO());
        for(int i=0;i<playerCounter;i++)
            player[i].display();

    }
}
