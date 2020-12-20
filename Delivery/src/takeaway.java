
public class takeaway extends person {
    public takeaway(String myname, int myid, int myphonenumber,String mydidian) {
        super(myname, myid, myphonenumber,mydidian);
    }
    /*
     * 查看消费者位置
     */
    void weizhic() {
        super.weizhi();
    }
    /*
     * 覆写
     */
    public void weizhico(String didian1) {
        System.out.println("外卖员查看并寻找消费者位置"+didian1);
    }
    /*
     * 打电话
     */
    public void callc(int number2) {
        System.out.println("外卖员给消费者打电话"+number2);
    }
    /*
     * 修改状态
     */
    public void xiugai() {
        System.out.println("外卖员修改订单状态为已完成");
    }
    /*
     * 放外卖
     */
    public void fangwaimai() {
        System.out.println("外卖员正在放外卖");
    }

}

