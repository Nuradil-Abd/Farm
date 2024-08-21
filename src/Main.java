import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        FarmAnimals[] animalsInFarm1 = {
                new Sheep("Барашек","M", LocalDate.of(2019,3,5),13.350),
                new Sheep("Кузя","F", LocalDate.of(2021,5,15),23.0),
                new Sheep("Рембо","M", LocalDate.of(2020,3,23),17.5),
                new Cow("Милка","F",LocalDate.of(2015,5,7),560.5),
                new Cow("Буренка","F",LocalDate.of(2017,2,13),650.0),
                new Cow("Грета","F",LocalDate.of(2016,10,7),720.5),
                new Cow("Роза","F",LocalDate.of(2021,5,2),480),
                new Cow("Лиза","F",LocalDate.of(2022,4,3),320.8),
                new Horse("Граф","M",LocalDate.of(2017,9,12),580.7,"Brown")
        };




        FarmAnimals[] AnimalsInFarm2 = {
                new Sheep("Артемон", "M",LocalDate.of(2020,2,23),20 ),
                new Cow("Клара", "F", LocalDate.of(2017,8,9),600.4),
                new Horse("Шерон", "F",LocalDate.of(2017,4,23),620.5,"White")

        };
        Farm[] farms ={ new Farm("г.Кант / улица Салиева 89/2","«Овечий Уют»", animalsInFarm1),
        new Farm("г.Кара-Балта / Беловодская 123", "«Гривы и Хвосты»",AnimalsInFarm2)};

        System.out.println(Arrays.toString(farms));


    }
}