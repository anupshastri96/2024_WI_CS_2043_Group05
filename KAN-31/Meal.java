import java.util.ArrayList;

public class Meal{

    private ArrayList<Food> ingredientList;
    private int date;

    public Meal(ArrayList<Food> i){
        ingredientList = i;
    }

    // from Food
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