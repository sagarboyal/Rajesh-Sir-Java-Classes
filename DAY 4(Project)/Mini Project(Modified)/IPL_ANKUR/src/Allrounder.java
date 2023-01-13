public class Allrounder extends Bowler{
    public Allrounder() {
        setRole("All-Rounder");
    }

    public Allrounder(int id, String name, int innings, int runs, int hundred, int fifty, int over, int wickets) {
        super(id, name, innings, runs, hundred, fifty, over, wickets);
        setRole("All-Rounder");
    }
    public void read(){
        super.read();
    }
    public void display(){
        System.out.print(getId()+"\t\t"+getName()+"\t\t\t"+getRole());
        System.out.print("\t\t"+getInnings()+"\t\t\t"+getRuns()+"\t\t"+getHundred()+"\t\t\t"+getFifty());
        System.out.print("\t\t\t\t"+getOver()+"\t\t\t"+getWickets());
    }
}
