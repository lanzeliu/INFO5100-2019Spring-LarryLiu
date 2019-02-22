package dessertshoppe;

public class Cookie extends DessertItem {
    private int number;
    private double pricePerDozen;

    public Cookie(String name, int number, double pricePerPound) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerPound;
    }

    @Override
    public int getCost() {
        return (int)Math.round((number/12.0) * pricePerDozen);
    }

    @Override
    public String getWeightAndUnitPrice() {
        return Double.toString(this.number) + " lbs. @ " + Double.toString(this.pricePerDozen/100) + "\n";
    }

    @Override
    public String getToppingName() {
        return "";
    }

    @Override
    public int getStringLength() {
        return this.name.length();
    }
}
