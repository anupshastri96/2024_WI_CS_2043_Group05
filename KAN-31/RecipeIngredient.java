import java.util.ArrayList;

public class RecipeIngredient extends Food{

    private Ingredient ingredient;

    public RecipeIngredient(Ingredient i, double q){
        super(q);
        ingredient = i;
    }

    // from Food
    public Nutrition getNutrition(){
        return ingredient.getNutrition().applyQuantity(super.getQuantity());
    }

    public double getPrice(){
        return ingredient.getPrice();
    }

    public double getQuantity(){
        return super.getQuantity();
    }

    public ArrayList<RecipeIngredient> getRecipeIngredients(){
        ArrayList<RecipeIngredient> out = new ArrayList<RecipeIngredient>();
        out.add(this);
        return out;
    }
    //

    // get/set
    public String[] getName(){
        String[] out = {ingredient.getName()};
        return out;
    }


    public Ingredient getIngredient(){
        return ingredient;
    }

}