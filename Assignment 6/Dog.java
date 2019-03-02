public class Dog extends Pet implements Boardable {
    // Field:
    private String size;
    private int startMonth;
    private int startDay;
    private int startYear;
    private int endMonth;
    private int endDay;
    private int endYear;

    // Constructor:
    public Dog(String petName, String ownerName, String color, String size) {
        super(petName, ownerName, color);
        this.size = size;
    }

    // Member functions:
    public String getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "DOG:" + "\n" + super.toString() + "\n" + "Size: " + this.getSize();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        this.startMonth = month;
        this.startDay = day;
        this.startYear = year;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        this.endMonth = month;
        this.endDay = day;
        this.endYear = year;
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        if (year<startYear || year>endYear) return false;
        else if (year==startYear && month<startMonth || year==endYear && month>endMonth) {
            return false;
        }
        else if (year==startYear && month==startMonth && day<startDay || year==endYear && month==endMonth && day>endDay) {
            return false;
        }
        else {
            return true;
        }
    }

    // Main function:
    public static void main(String[] args) {
        Dog dog = new Dog("Spot", "Susan", "white", "medium");
        dog.setSex(3);
        System.out.println(dog);
    }
}
