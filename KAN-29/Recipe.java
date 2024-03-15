import java.util.ArrayList;

public class Recipe extends Food{
    
    private ArrayList<Food> ingredientList;

    public Recipe(ArrayList<Food> i, double q){
        super(q);
        ingredientList = i;
    }

    // from Food
//////////////////////////////////////////////
    public Nutrition getNutrition(){
        Nutrition cNutrition = ingredientList.get(0).getNutrition();
        for(int i = 1; i < ingredientList.size(); i++){
            Nutrition.combineNutrition(cNutrition, ingredientList.get(i));
        }
        return cNutrition;
    }

    public double getPrice(){

    }

    public double getQuantity(){

    }
//////////////////////////////////////////////

}