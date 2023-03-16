import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<Performer>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }


    public boolean addPerformer(Performer p) {
        if (!(performers.contains(p))) {
            performers.add(p);
            return true;
        }
        return false;
    }

    public boolean removePerformer(Performer p) {
        if (performers.contains(p)) {
            performers.remove(p);
            return true;
        }
        return false;
    }

    public double averagePerformerAge() {
        double sum = 0;
        for (Performer p: performers) {
            sum += p.getAge();
        }
        return sum/performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> newLst = new ArrayList<Performer>();
        for (Performer p: performers) {
            if (p.getAge()>=age) {
                newLst.add(p);
            }
        }
        return newLst;
    }

    public void groupRehearsal() {
        for (Performer p : performers) {
            System.out.println("REHEARSAL CALL! "+p.getName());

            if (p instanceof Comedian) {
                ((Comedian)p).rehearse(false);
            } else {
                p.rehearse();
            }
        }
    }
}
