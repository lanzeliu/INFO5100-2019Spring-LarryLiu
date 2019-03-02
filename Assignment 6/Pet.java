public class Pet {
    // Fields:
    private String petName;
    private String ownerName;
    private String color;
    protected int sexid;

    // Constructor:
    public Pet(String petName, String ownerName, String color) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.color = color;
    }

    // Member functions:
    public String getPetName() {
        return this.petName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getColor() {
        return this.color;
    }

    public void setSex(int sexid) {
        this.sexid = sexid;
    }

    public String getSex() {
        switch (this.sexid) {
            case 1:
                return "male";
            case 2:
                return "female";
            case 3:
                return "spayed";
            case 4:
                return "neutered";
            default:
                return "Pleas input the valid number from 1 to 4";
        }
    }

    public String toString() {
        return this.petName + " owned by " + this.ownerName + "\n" + "Color: " + this.color + "\n" +
                "Sex: " + this.getSex();
    }

    // Main function:
    public static void main(String[] args) {
        Pet pet = new Pet("Spot", "Mary", "black and white");
        pet.setSex(1);
        System.out.println(pet);
    }
}
