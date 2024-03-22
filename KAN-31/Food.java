import java.util.ArrayList;

abstract class Food{
    
    private double quantity;

    Food(double q){
        quantity = q;
    }

    abstract  ArrayList<RecipeIngredient> getRecipeIngredients();

    abstract Nutrition getNutrition();

    abstract double getPrice();

    public double getQuantity(){
        return quantity;
    }
}
