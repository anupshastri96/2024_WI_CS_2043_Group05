//updated

import java.util.ArrayList;

// Class representing an ingredient with its name, quantity, and cost
class Food {
    private String name;
    private double quantity;
    private double cost;

    public Food(String name, double quantity, double cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}