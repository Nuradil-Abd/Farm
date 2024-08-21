import java.text.DateFormat;
import java.time.LocalDate;

public class Cow extends FarmAnimals {
    public Cow() {
    }

    public Cow( String nickName,String gender, LocalDate age, double weight) {
        super( nickName,gender, age, weight);

    }

    @Override
    public String toString() {
        return "\nCow: { " + super.toString() + " }";
    }
}
