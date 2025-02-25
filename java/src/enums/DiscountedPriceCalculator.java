package enums;

public class DiscountedPriceCalculator {

    private double totalPrice;

    public DiscountedPriceCalculator(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double applyDiscountAndGetFinalAmount(double discount) {
        return totalPrice - (totalPrice * discount);
    }

}
