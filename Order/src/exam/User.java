package exam;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String phone;
    private String address;

    public boolean pay(){
        System.out.println("支付成功");
        return true;
    }
    public boolean messageSub(){
        System.out.println("姓名:"+this.getName()+"电话:"+this.getPhone()+"地址:"+this.getAddress());
        return true;
    }
    public boolean orderSub(List<Goods> good){
        System.out.println("您的订单信息为：");
        double sum = 0;
        for (Goods goods : good) {
            sum += Double.parseDouble(goods.getPrice());
            System.out.println("商品为："+goods.getName()+", 价格为："+goods.getPrice());
        }
        System.out.println("总价为："+sum+"元");
        return true;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public boolean chooseGood(List<Goods> good){
        System.out.println("您选择的商品有：");
        for (Goods goods : good) {
            System.out.println("商品为："+goods.getName()+", 价格为："+goods.getPrice());
        }
        return true;
    }
}
