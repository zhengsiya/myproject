
public class person {
    //名字
    protected String name;
    //编号
    protected int id;
    //手机号
    protected int phonenumber;
    //定位
    protected String didian;
    public person(String myname, int myid, int myphonenumber,String mydidian) {
        name = myname;
        id = myid;
        phonenumber=myphonenumber;
        didian=mydidian;
    }
    /*
     * 显示定位
     */
    public void weizhi() {
        System.out.println(name + "正在" +didian );
    }

}