//updated

public class Nutrition {
    private double[] calories = new double[5];

    // Constructors
    public Nutrition(double carbs, double fat, double protein, double ethanol, double fibre) {
        calories[0] = carbs;
        calories[1] = fat;
        calories[2] = protein;
        calories[3] = ethanol;
        calories[4] = fibre; // Contains no calories
    }

    public Nutrition(double[] calarr) {
        calories = calarr;
    }

    // Methods
    /* Returns the object's values multiplied by a quantity
     * Used for passing forward the nutrition of objects with quantities greater than one unit
     */
    public Nutrition applyQuantity(double q) {
        double[] qCalories = new double[5];
        for (int i = 0; i < 5; i++) {
            qCalories[i] = calories[i] * q;
        }
        return new Nutrition(qCalories);
    }

    // Setters and getters
    public double[] getCalorieArray() {
        return calories;
    }

    // Static methods
    /* Merges the values of two nutrition objects */
    public static Nutrition combineNutrition(Nutrition a, Nutrition b) {
        double[] aCalories = a.getCalorieArray();
        double[] bCalories = b.getCalorieArray();
        double[] cCalories = new double[5];
        for (int i = 0; i < 5; i++) {
            cCalories[i] = aCalories[i] + bCalories[i];
        }
        return new Nutrition(cCalories);
    }

    // Override toString() method to display nutritional values
    @Override
    public String toString() {
        return "Carbs: " + calories[0] + "g, Fat: " + calories[1] + "g, Protein: " + calories[2] + "g, Ethanol: " + calories[3] + "g, Fibre: " + calories[4] + "g";
    }
}
