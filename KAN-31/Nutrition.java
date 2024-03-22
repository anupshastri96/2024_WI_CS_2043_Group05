public class Nutrition{
    private double[] calories = new double[5];
    //private double[] vitamins
    //private double[] minerals


    //Constructors
    public Nutrition(double carbs, double fat, double protein, double ethanol, double fibre){
        calories[0] = carbs;
        calories[1] = fat;
        calories[2] = protein;
        calories[3] = ethanol;
        calories[4] = fibre; //contains no calories
    }
    public Nutrition(double[] calarr){
        calories = calarr;
    }


    //Methods
    /*      returns the objects values multiplied by a quantity
     * used for passing forward the nutrition of objects with quantities greater than one unit
    */
    public Nutrition applyQuantity(double q){

        double[] qCalories = new double[5];
        for(int i = 0; i < 5; i++){
            qCalories[i] = calories[i]*q;
        }

        Nutrition cNutrition = new Nutrition(qCalories);
        return cNutrition;
    }
    //
    


    //set/get
    public double[] getCalorieArray(){
        return calories;
    }
    //


    //Static methods
    /*      merges the values of 2 nutrition objects
     */
    public static Nutrition combineNutrition(Nutrition a, Nutrition b){ 

        double[] aCalories = a.getCalorieArray();
        double[] bCalories = b.getCalorieArray();
        double[] cCalories = new double[5];
        for(int i = 0; i < 5; i++){
            cCalories[i] = 0 + (aCalories[i] + bCalories[i]);
        }

        Nutrition cNutrition = new Nutrition(cCalories);
        
        return cNutrition;
    }

}

