import enums.CustomerTypeEnum;

public class Customer {
    private String name;
    private String type;
    private double discount;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
        setDiscount();
    }

    public void setDiscount() {
        if (CustomerTypeEnum.REGULAR.getType().equals(type)) {
            discount = CustomerTypeEnum.REGULAR.getDiscount();
        } else if (CustomerTypeEnum.PREMIUIM.equals(type)) {
            discount = CustomerTypeEnum.REGULAR.getDiscount();
        } else if (CustomerTypeEnum.VIP.equals(type)) {
            discount = CustomerTypeEnum.VIP.getDiscount();
        }
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

}
