public class Allrounder extends Bowler{
    private String role;

    public Allrounder() {
        setRole("All-Rounder");
    }

    public Allrounder(int id, String name, int innings, int runs, int hundred, int fifty, int over, int wickets, String role) {
        super(id, name, innings, runs, hundred, fifty, over, wickets);
        setRole("All-Rounder");
    }
    public void read(){
        super.read();
    }
    public void display(){
        super.display();
    }
}
