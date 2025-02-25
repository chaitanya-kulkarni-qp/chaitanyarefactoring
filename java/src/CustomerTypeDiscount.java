import enums.CustomerTypeEnum;

public class CustomerTypeDiscount {

    public static double getDiscount(String type) {
        if (CustomerTypeEnum.REGULAR.getType().equals(type)) {
            return CustomerTypeEnum.REGULAR.getDiscount();
        } else if (CustomerTypeEnum.PREMIUIM.equals(type)) {
            return CustomerTypeEnum.REGULAR.getDiscount();
        } else if (CustomerTypeEnum.VIP.equals(type)) {
            return CustomerTypeEnum.VIP.getDiscount();
        }
        return 0;
    }

}
