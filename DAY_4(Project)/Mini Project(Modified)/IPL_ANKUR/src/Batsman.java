import java.util.Scanner;

public class Batsman extends Player{
    private int innings;
    private int runs;
    private int hundred;
    private int fifty;

    public Batsman() {
        setRole("Batsman");
    }

    public Batsman(int id,  String name, int innings, int runs, int hundred, int fifty) {
        super(id, name);
        this.innings = innings;
        this.runs = runs;
        this.hundred = hundred;
        this.fifty = fifty;
        setRole("Batsman");
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHundred() {
        return hundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    @Override
    public String toString() {
        return super.toString()+" batesman{" +
                "runs=" + runs +
                ", hundred=" + hundred +
                ", fifty=" + fifty +
                '}';
    }
    public void display(){
        super.display();
        System.out.print("\t\t\t"+getInnings()+"\t\t\t"+getRuns()+"\t\t"+getHundred()+"\t\t\t"+getFifty());
    }
    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of Innings : ");
        setInnings(sc.nextInt());
        System.out.println("Enter Total run made by the player :");
        setRuns(sc.nextInt());
        System.out.println("Enter number of hundreds score by the player :");
        setHundred(sc.nextInt());
        System.out.println("Enter number of fifties score by the player :");
        setFifty(sc.nextInt());
    }
}
