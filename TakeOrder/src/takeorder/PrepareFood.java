package takeorder;

public class PrepareFood {
    public Food makeFood(String foodType){
        if(foodType==null){
            return null;
        }
        if(foodType.equalsIgnoreCase("Vegetable")){
            return new Vegetable();
        }
        else if(foodType.equalsIgnoreCase("Meal")){
            return new Meal();
        }
        return null;
    }

}
