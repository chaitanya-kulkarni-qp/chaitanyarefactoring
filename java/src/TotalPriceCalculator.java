import java.util.List;

public class TotalPriceCalculator {

    private List<Double> prices;

    public TotalPriceCalculator(List<Double> prices) {
        this.prices = prices;
    }

    public double calculateTotal() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }

}
