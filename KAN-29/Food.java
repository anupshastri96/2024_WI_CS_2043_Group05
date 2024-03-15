abstract class Food{
    
    private double quantity;

    Food(double q){
        quantity = q;
    }

    abstract Nutrition getNutrition();

    abstract double getPrice();

    public double getQuantity(){
        return quantity;
    }
}
