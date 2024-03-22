//updated

import java.util.ArrayList;

public class Recipe extends Food {
    private ArrayList<Food> ingredientList;

    public Recipe(ArrayList<Food> ingredients, double quantity) {
        super("Recipe", quantity, 0); 
        this.ingredientList = ingredients;
    }

    public double getPrice() {
        return RecipeCostCalculator.calculateRecipeCost(ingredientList);
    }
}

class RecipeCostCalculator {
    public static double calculateRecipeCost(ArrayList<Food> ingredients) {
        double totalCost = 0.0;

        for (Food ingredient : ingredients) {
            totalCost += ingredient.getCost();
        }

        return totalCost;
    }
}

