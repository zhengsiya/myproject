package takeorder;

public class Vegetable implements Food{
    public Vegetable(){
        System.out.println("订单中的菜类");
    }

    @Override
    public void cook(){
        System.out.println("开始做菜");
    }
}
