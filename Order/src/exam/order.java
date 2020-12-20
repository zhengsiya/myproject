package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class order {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();
        User user = new User(1,"张三","187187187","和平街道");
        Merchant merchant = new Merchant("椒麻鸡米饭",183783183,"美食城1号","专做水煮活鱼");
        list.add(new Goods(1,"水煮活鱼","50.00"));
        list.add(new Goods(2,"椒麻鸡标配","30.00"));
        list.add(new Goods(3,"椒麻鱼标配","30.00"));
        list.add(new Goods(4,"椒麻肥牛标配","30.00"));
        list.add(new Goods(5,"奶茶","10.00"));
        System.out.println("商品列表");
        System.out.println("商品id  商品名称  商品价格");
        for (Goods goods : list) {
            System.out.println(goods.getId()+"       "+goods.getName()+"  "+goods.getPrice());
        }
        System.out.println("请输入编号选择你要购买的商品：按0结束");
        Scanner input = new Scanner(System.in);
        int id;
        List<Goods> buy = new ArrayList<>();
        while ((id=input.nextInt())!=0){
            input.nextLine();
            for (Goods goods : list) {
                if (goods.getId()==id){
                    buy.add(goods);
                }
            }
        }
        input.nextLine();
        user.chooseGood(buy);
        System.out.println("请确认你的个人信息：");
        System.out.println("请输入姓名:");
        String name = input.nextLine();
        System.out.println("请输入电话：");
        String phone = input.nextLine();
        System.out.println("请输入地址：");
        String address = input.nextLine();
        user.setPhone(phone);user.setName(name);
        user.setAddress(address);
        user.messageSub();
        System.out.println("个人信息确认完成");
        System.out.println("订单确认:");
        user.orderSub(list);
        System.out.println("订单确认完成");
        user.pay();
        merchant.receive();

    }
}
