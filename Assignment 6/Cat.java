public class Cat extends Pet implements Boardable {
    // Field:
    private String hairLength;
    private int startMonth;
    private int startDay;
    private int startYear;
    private int endMonth;
    private int endDay;
    private int endYear;

    // Constructor:
    public Cat(String petName, String ownerName, String color, String hairLength) {
        super(petName, ownerName, color);
        this.hairLength = hairLength;
    }

    // Member functions:
    public String getHairLength() {
        return this.hairLength;
    }

    @Override
    public String toString() {
        return "CAT:" + "\n" + super.toString() + "\n" + "Hair: " + this.getHairLength();
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
        Cat cat = new Cat("Tom", "Bob", "black", "short");
        cat.setSex(3);
        System.out.println(cat);
        cat.setBoardStart(01, 20, 2018);
        cat.setBoardEnd(02, 10, 2019);
        System.out.println(cat.boarding(04, 23, 2017));
        System.out.println(cat.boarding(05, 30, 2018));
    }
}
