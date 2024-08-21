import java.time.LocalDate;

public abstract class FarmAnimals {

    private String nickName, gender ;
    private LocalDate age;
    private double weight;

    public FarmAnimals() {

    }

    public FarmAnimals(String nickName, String gender, LocalDate age, double weight) {
        this.nickName = nickName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return
                "nickName: " + nickName +
                ", gender: " + gender +
                ", age: " + age +
                ", weight: " + weight;

    }



}
