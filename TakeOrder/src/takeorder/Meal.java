package takeorder;

public class Meal implements Food{
    public Meal(){
        System.out.println("订单中的饭类");
    }
    @Override
    public void cook(){
        System.out.println("开始煮饭");
    }
}
