import java.util.ArrayList;
import java.util.List;

public class ComputerRepository {
    private List<Computeri> computers;

    public ComputerRepository() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computeri computer) {
        this.computers.add(computer);
    }

    public void removeComputer(Computeri computer) {
        this.computers.remove(computer);
    }

    public void updateComputer(Computeri oldComputer, Computeri newComputer) {
        int index = this.computers.indexOf(oldComputer);
        if (index >= 0) {
            this.computers.set(index, newComputer);
        }
    }

    public List<Computeri> getAllComputers() {
        return new ArrayList<>(this.computers);
    }

    public Computeri getComputerByIndex(int index) {
        return this.computers.get(index);
    }
}