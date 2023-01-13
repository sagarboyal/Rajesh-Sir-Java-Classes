import java.util.Scanner;

public class Bowler extends Batsman {
    private int over;
    private int wickets;

    public Bowler() {
        setRole("Bowler");
    }

    public Bowler(int id, String name, int innings, int runs, int hundred, int fifty, int over, int wickets) {
        super(id, name, innings, runs, hundred, fifty);
        this.over = over;
        this.wickets = wickets;
        setRole("Bowler");
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    @Override
    public String toString() {
        return super.toString()+" bowler{" +
                "over=" + over +
                ", wickets=" + wickets +
                '}';
    }
    public void display(){
        System.out.print(getId()+"\t\t"+getName()+"\t\t\t"+getRole());
        System.out.print("\t\t\t"+getInnings()+"\t\t\t"+getRuns()+"\t\t\t"+getHundred()+"\t\t\t"+getFifty());
        System.out.print("\t\t\t\t"+getOver()+"\t\t\t"+getWickets());
    }
    public void read(){
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of wickets :");
        wickets=sc.nextInt();
        System.out.println("Enter the no of overs :");
        over=sc.nextInt();

    }
}
