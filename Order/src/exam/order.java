package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class order {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();
        User user = new User(1,"����","187187187","��ƽ�ֵ�");
        Merchant merchant = new Merchant("���鼦�׷�",183783183,"��ʳ��1��","ר��ˮ�����");
        list.add(new Goods(1,"ˮ�����","50.00"));
        list.add(new Goods(2,"���鼦����","30.00"));
        list.add(new Goods(3,"���������","30.00"));
        list.add(new Goods(4,"�����ţ����","30.00"));
        list.add(new Goods(5,"�̲�","10.00"));
        System.out.println("��Ʒ�б�");
        System.out.println("��Ʒid  ��Ʒ����  ��Ʒ�۸�");
        for (Goods goods : list) {
            System.out.println(goods.getId()+"       "+goods.getName()+"  "+goods.getPrice());
        }
        System.out.println("��������ѡ����Ҫ�������Ʒ����0����");
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
        System.out.println("��ȷ����ĸ�����Ϣ��");
        System.out.println("����������:");
        String name = input.nextLine();
        System.out.println("������绰��");
        String phone = input.nextLine();
        System.out.println("�������ַ��");
        String address = input.nextLine();
        user.setPhone(phone);user.setName(name);
        user.setAddress(address);
        user.messageSub();
        System.out.println("������Ϣȷ�����");
        System.out.println("����ȷ��:");
        user.orderSub(list);
        System.out.println("����ȷ�����");
        user.pay();
        merchant.receive();

    }
}
