package exam;

public class Merchant {
    private String name;
    private int phone;
    private String address;
    private String message;

    public Merchant(String name, int phone, String address, String message) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.message = message;
    }

    public void receive(){
        System.out.println("名字："+this.getName()+"，电话："+this.getPhone()+"，地址："+this.getAddress()+"接单成功！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
