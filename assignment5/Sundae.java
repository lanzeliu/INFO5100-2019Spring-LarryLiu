package dessertshoppe;

public class Sundae extends IceCream {
    private String toppingName;
    private double toppingCost;

    public Sundae(String name, double cost, String toppingName, double toppingCost) {
        super(name, cost);
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
    }

    @Override
    public int getCost() {
        return (int)Math.round(super.getCost() + toppingCost);
    }

    @Override
    public String getToppingName() {
        return this.toppingName + " sundae with " + "\n";
    }
}
