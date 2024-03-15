import java.util.ArrayList;
import java.util.List;

public class IngredientManager {
    private List<Ingredient> ingredients;

    public IngredientManager() {
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void updateIngredient(String oldName, Ingredient newIngredient) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equals(oldName)) {
				
                ingredient.setName(newIngredient.getName());
                ingredient.setQuantity(newIngredient.getQuantity());
                ingredient.setUnit(newIngredient.getUnit());
                break;
            }
        }
    }

    public void deleteIngredient(String name) {
		for (int i = 0; i < ingredients.size(); i++) {
			Ingredient ingredient = ingredients.get(i);
			if (ingredient.getName().equals(name)) {
				ingredients.remove(i);
				break; 
			}
		}
	}


    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}