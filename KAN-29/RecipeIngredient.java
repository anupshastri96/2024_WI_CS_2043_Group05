public class RecipeIngredient extends Food{

    private Ingredient ingredient;

    public RecipeIngredient(Ingredient i){
        super(q);
        ingredient = i;
    }

//////////////////////////////////////////////
    public Nutrition getNutrition(){
        return ingredient.getNutrition().applyQuantity(super.getQuantity());
    }

    public double getPrice(){

    }

    public double getQuantity(){

    }
//////////////////////////////////////////////

}