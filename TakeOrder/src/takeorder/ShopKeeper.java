package takeorder;

public class ShopKeeper {

    public String name;
    public String phonenum;

    public ShopKeeper(){
        this.name="味道好饭店";
        this.phonenum="87654321";

        System.out.println("店名:"+this.name);
        System.out.println("联系电话:"+this.phonenum);
    }

    public static void main(String[] args) {
        ShopKeeper shop = new ShopKeeper();
        shop.motion();

        shop.Inform();
    }

    private void motion(){
        PrepareFood chef =new PrepareFood();
        Food food1 = chef.makeFood("Vegetable");
        food1.cook();
        Food food2 = chef.makeFood("Meal");
        food2.cook();

    }
    private void Inform(){
        System.out.println("商家通知取餐");
        Delivary delivary = new Delivary();
        TakeCommand takecommand = new ToTake(delivary);
        Invoker invoker = new Invoker(takecommand);
        invoker.action();

    }
}
