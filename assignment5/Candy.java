package dessertshoppe;

public class Candy extends DessertItem {
    private double weight;
    private double pricePerPound;

    public Candy(String name, double weight, double pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int getCost() {
        return (int)Math.round(weight * pricePerPound);
    }

    @Override
    public String getWeightAndUnitPrice() {
        return Double.toString(this.weight) + " lbs. @ " + Double.toString(this.pricePerPound/100) + "\n";
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
