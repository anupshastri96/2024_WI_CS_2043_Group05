import java.util.ArrayList;

public class MIRtest{
    public static void main(String[] args){

        ArrayList<Meal> mealList;

        Meal m1;

        Nutrition n1 = new Nutrition(1.0,1.0,1.0,1.0,1.0);

        Ingredient i1 = new Ingredient("Ingredient1", "gram", n1, 1.0);
        Ingredient i2 = new Ingredient("Ingredient2", "pound", n1, 2.0);
        Ingredient i3 = new Ingredient("Ingredient3", "litre", n1, 69.0);
        
        RecipeIngredient ri3 = new RecipeIngredient(i3, 10.0);
        RecipeIngredient ri2 = new RecipeIngredient(i2, 1.0);
        RecipeIngredient ri1 = new RecipeIngredient(i1, 1.0); ArrayList<Food> ri1L = new ArrayList<Food>(); ri1L.add(ri1); ri1L.add(ri2);
        Recipe r1 = new Recipe(ri1L, 1.0);

        ArrayList<Food> fl1 = new ArrayList<Food>();

        fl1.add(r1);
        fl1.add(ri3);

        m1 = new Meal(fl1);

        ArrayList<RecipeIngredient> test = m1.getRecipeIngredients();

        System.out.println("\n");
        for(int i = 0; i < test.size(); i++){
            System.out.println("name:\t\t\t" + test.get(i).getIngredient().getName());
            System.out.println("quantity:\t\t" + test.get(i).getQuantity()+" " +test.get(i).getIngredient().getUnit()+"(s)");
            System.out.println("price (per " + test.get(i).getIngredient().getUnit()+ "):\t" + test.get(i).getIngredient().getPrice());
            System.out.println("price (total):\t\t" + test.get(i).getIngredient().getPrice()*test.get(i).getQuantity());

            System.out.println("\n");
            
        }

    









    }

}