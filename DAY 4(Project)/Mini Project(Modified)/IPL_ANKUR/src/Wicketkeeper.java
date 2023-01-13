import java.util.Scanner;

public class Wicketkeeper extends Batsman {
    private int stumps;
    private int catches;

    public Wicketkeeper() {
        setRole("WicketKeeper");
    }

    public Wicketkeeper(int id, String name, int innings, int runs, int hundred, int fifty, int stumps, int catches) {
        super(id, name, innings, runs, hundred, fifty);
        this.stumps = stumps;
        this.catches = catches;
        setRole("WicketKeeper");
    }

    public int getStumps() {
        return stumps;
    }

    public void setStumps(int stumps) {
        this.stumps = stumps;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    @Override
    public String toString() {
        return super.toString()+ " wicketkeeper{" +
                "stumps=" + stumps +
                ", catches=" + catches +
                '}';
    }
    public void display(){
        System.out.print(getId()+"\t\t"+getName()+"\t\t\t"+getRole());
        System.out.print("\t"+getInnings()+"\t\t\t"+getRuns()+"\t\t"+getHundred()+"\t\t\t"+getFifty());
        System.out.print("\t\t\t\t\t\t\t\t\t\t"+getStumps()+"\t\t\t"+getCatches());
    }
    public void read(){
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of stumping : ");
        setStumps(sc.nextInt());
        System.out.println("Enter no of catches : ");
        setCatches(sc.nextInt());

    }
}
