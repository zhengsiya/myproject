package exam;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String phone;
    private String address;

    public boolean pay(){
        System.out.println("֧���ɹ�");
        return true;
    }
    public boolean messageSub(){
        System.out.println("����:"+this.getName()+"�绰:"+this.getPhone()+"��ַ:"+this.getAddress());
        return true;
    }
    public boolean orderSub(List<Goods> good){
        System.out.println("���Ķ�����ϢΪ��");
        double sum = 0;
        for (Goods goods : good) {
            sum += Double.parseDouble(goods.getPrice());
            System.out.println("��ƷΪ��"+goods.getName()+", �۸�Ϊ��"+goods.getPrice());
        }
        System.out.println("�ܼ�Ϊ��"+sum+"Ԫ");
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
        System.out.println("��ѡ�����Ʒ�У�");
        for (Goods goods : good) {
            System.out.println("��ƷΪ��"+goods.getName()+", �۸�Ϊ��"+goods.getPrice());
        }
        return true;
    }
}
