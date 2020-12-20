
public class yunxing {
    public static void main(String[] args) {
        consumer c1=new consumer("张三",12345,67891,"弗雷德");
        takeaway t1=new takeaway("李四",92345,63461,"杭电6教");
        c1.weizhiwa(c1.didian);
        c1.callt(t1.phonenumber);
        c1.cuicu();
        t1.weizhico(c1.didian);
        t1.xiugai();
        t1.fangwaimai();
        t1.callc(c1.phonenumber);
        c1.quwaimai();
        t1.xiugai();
    }
}