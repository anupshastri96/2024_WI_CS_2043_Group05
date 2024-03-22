import java.util.ArrayList;

public class Recipe extends Food{
    
    private ArrayList<Food> ingredientList;

    public Recipe(ArrayList<Food> i, double q){
        super(q);
        ingredientList = i;
    }

    // from Food
    public Nutrition getNutrition(){
        Nutrition cNutrition = ingredientList.get(0).getNutrition();
        for(int i = 1; i < ingredientList.size(); i++){
            Nutrition.combineNutrition(cNutrition, ingredientList.get(i).getNutrition());
        }
        return cNutrition;
    }

    public double getPrice(){
        return 0.0;
    }

    public double getQuantity(){
        return 0.0;
    }
    
    public ArrayList<RecipeIngredient> getRecipeIngredients(){
        ArrayList<RecipeIngredient> out = new ArrayList<RecipeIngredient>();

        for(int i = 0; i < ingredientList.size(); i++){
            ArrayList<RecipeIngredient> current = ingredientList.get(i).getRecipeIngredients();

            for(int j = 0; j < current.size(); j++){
                out.add(current.get(j));

            }

        }

        return out;
    }
    //

    

}