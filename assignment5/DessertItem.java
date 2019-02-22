package dessertshoppe;

public abstract class DessertItem {
    protected String name;

    public DessertItem(String name) {
        this.name = name;
    }

    public final String getName() {
        return getToppingName() + this.name;
    }

    public abstract int getCost();

    public abstract String getWeightAndUnitPrice();

    public abstract String getToppingName();

    public abstract int getStringLength();
}
