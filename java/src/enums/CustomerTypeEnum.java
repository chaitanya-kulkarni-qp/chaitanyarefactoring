package enums;

public enum CustomerTypeEnum {

    REGULAR("Regular", 0.05),
    PREMIUIM("Premium", 0.1),
    VIP("VIP", 0.2);

    CustomerTypeEnum(String type, double discount) {
        this.type = type;
        this.discount = discount;
    }

    private String type; // "Regular", "Premium", "VIP"
    private double discount;

    public String getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }

}
