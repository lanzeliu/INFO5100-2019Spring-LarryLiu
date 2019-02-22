package dessertshoppe;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Checkout extends DessertShoppe {
    private ArrayList<DessertItem> list = new ArrayList<DessertItem>();

    public Checkout() {
    }

    // Output the number of items
    public int numberOfItems() {
        return list.size();
    }

    // Add an item in the ArrayList
    public void enterItem(DessertItem item) {
        list.add(item);
    }

    // Clear the ArrayList
    public void clear() {
        list.clear();
    }

    // Output the int total cost
    public int totalCost() {
        int totalCost = 0;
        DessertItem[] listArray = new DessertItem[list.size()];
        DessertItem[] helper = list.toArray(listArray);
        for (DessertItem d : helper) {
            totalCost += d.getCost();
        }
        return totalCost;
    }

    // Output the int total tax
    public int totalTax() {
        return (int)Math.round(this.totalCost() * this.taxRate);
    }

    // Output the items' weight, unit price, name, and double cost
    public String itemPrice() {
        DessertItem[] listArray = new DessertItem[list.size()];
        DessertItem[] helper = list.toArray(listArray);
        StringBuffer sb = new StringBuffer();
        for (DessertItem d : helper) {
            sb.append(d.getWeightAndUnitPrice());
            sb.append(d.getName());
            for (int i=0; i<(30-d.getStringLength()); i++) {
                sb.append(" ");
            }
            sb.append(cents2dollarsAndCentsmethod(d.getCost()));
            sb.append("\n");
        }
        return sb.toString() + "\n";
    }

    // Out put the double tax for the receipt
    public String doubleTax() {
        DecimalFormat df = new DecimalFormat("#.00");
        String doubleTax = df.format(totalTax()/100.0);
        return "Tax\t                           " + doubleTax + "\n";
    }

    // Out put the double total cost for the receipt
    public String doubleTotalCost() {
        DecimalFormat df = new DecimalFormat("#.00");
        String doubleTotalCost = df.format(totalCost()/100.0*taxRate + totalCost()/100.0);
        return "Total Cost                   " + doubleTotalCost + "\n";
    }

    // Print the receipt
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\t       ");
        sb.append(storeName);
        return "\t    " + storeName + "\n" + "----------------------------------" + "\n" + this.itemPrice() +
                doubleTax() + doubleTotalCost();
    }
}
