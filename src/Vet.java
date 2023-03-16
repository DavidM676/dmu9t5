import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList<Animal> client;

    public Vet(String name) {
        this.name = name;
        client = new ArrayList<Animal>();
    }

    public void addClient(Animal a) {
        if (!(client.contains(a))) {
            client.add(a);
            System.out.println("Welcome to "+name+" office, "+a.getName()+"!");
        } else {
            System.out.println(a.getName()+" is already a client of "+name+"!");
        }

    }
}
