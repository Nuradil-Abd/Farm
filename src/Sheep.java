import java.time.LocalDate;

public class Sheep extends  FarmAnimals{


    public Sheep() {
    }

    public Sheep( String nickName, String gender,LocalDate age, double weight) {
        super( nickName, gender, age, weight);
    }

    @Override
    public String toString() {
        return "\nSheep: { " + super.toString() + " }";
    }
}
