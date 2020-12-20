package pingjia;
import java.util.Scanner;
public class yonghupingjia {

	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("订单已完成");
		System.out.println("顾客对商品进行打分评价:");
		shang();
		System.out.println("请用户对骑手进行打分（0~5分）");
		qi();
		//shangjia s1=new shangjia();

	}
	public static void shang() {
		System.out.println("商品口味（0~5分）:");
		judge();
		System.out.println("商品包装（0~5分）：");
		judge();

	}
	public static void qi() {
		judge();
	}
	public static void judge() {
		int s = sc.nextInt();
		if(s>=0&&s<=5) {
			System.out.println("谢谢评价!");
		}
		else {
			System.out.println("评分范围是1-5分哦，请重新打分：");
			judge();
		}
	}

}
