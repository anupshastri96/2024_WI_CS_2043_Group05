import java.util.ArrayList;
import java.util.List;

public class Ingredient {

    private Nutrition nutrition;

    private String name;
    private String unit;
    private double price;

    public Ingredient(String name, String unit, Nutrition nutritionIn, double priceIn) {
        this.name = name;
        this.unit = unit;
        this.nutrition = nutritionIn;
        this.price = priceIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Nutrition getNutrition(){
        return nutrition;
    }
}