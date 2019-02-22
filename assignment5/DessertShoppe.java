package dessertshoppe;

public class DessertShoppe {
    protected double taxRate = 0.065;
    protected static String storeName = "M & M Dessert Shoppe";
    public static String cents2dollarsAndCentsmethod(int cents) {
        return Double.toString(cents/100.0);
    }
}
