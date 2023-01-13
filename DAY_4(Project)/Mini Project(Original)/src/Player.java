import java.util.*;
public abstract class Player {
    private int id;
    private String role;
    private String name;

    public Player() {
    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void display(){
        System.out.println("Player ID : "+getId());
        System.out.println("Player Name : "+getName());
        System.out.println("Role : "+getRole());

    }

    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the player :");
        name=sc.next();
        System.out.println("Enter the ID of player :");
        id=sc.nextInt();
    }
}
