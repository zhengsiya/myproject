
public class consumer extends person {
    public consumer(String myname, int myid, int myphonenumber,String mydidian) {
        super(myname, myid, myphonenumber,mydidian);
    }
    /*
     * 查看外卖员位置
     */
    void weizhiw() {
        super.weizhi();
    }
    /*
     * 覆写
     */
    public void weizhiwa(String weizhi0) {
        System.out.println("消费者查看到外卖员位置在"+weizhi0);
        System.out.println("显示外卖员预计到达时间");
    }
    /*
     * 打电话
     */
    public void callt(int number) {
        System.out.println("消费者正在给外卖员打电话"+ number);
    }
    /*
     * 催促
     */
    public void cuicu() {
        System.out.println("消费者催促外卖员");
    }
    /*
     * 取外卖
     */
    public void quwaimai() {
        System.out.println("消费者取外卖");
    }
}

