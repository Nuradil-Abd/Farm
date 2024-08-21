import java.util.Arrays;

public class Farm {

    private String address,  OwnerName;
    private FarmAnimals[] farmAnimals;

    public Farm() {
    }

    public Farm(String address, String ownerName, FarmAnimals[] farmAnimals) {
        this.address = address;
        this.OwnerName = ownerName;
        this.farmAnimals = farmAnimals;


    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }




    @Override
    public String toString() {
        return "\nFarm: " +
                "\nOwner Name: " + OwnerName +
                ",\naddress: " + address +
                ",\nanimals: " + Arrays.toString(farmAnimals) +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
