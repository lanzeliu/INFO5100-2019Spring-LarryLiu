package dessertshoppe;

public class IceCream extends DessertItem {
    private double cost;

    public IceCream(String name, double cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return (int)Math.round(cost);
    }

    @Override
    public String getWeightAndUnitPrice() {
        return "";
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
