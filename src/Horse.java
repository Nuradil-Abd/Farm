import java.time.LocalDate;

public class Horse extends  FarmAnimals{

    private String color;


    public Horse(String color) {
        this.color = color;
    }

    public Horse( String nickName,String gender, LocalDate age, double weight, String color) {
        super(nickName,gender, age, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nHorse: { " + super.toString() +
                " color: " + color + " }";

    }
}
